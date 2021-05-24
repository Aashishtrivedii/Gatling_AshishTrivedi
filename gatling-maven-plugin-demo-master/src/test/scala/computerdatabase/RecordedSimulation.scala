package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")

	val headers_5 = Map("Origin" -> "http://computer-database.gatling.io")


object Search{
	val search=exec(http("load_Homepage")
		.get("/"))
		.pause(3)
		.exec(http("select_computer")
			.get("/computers?f=Macbook"))
		.pause(3)
}
	object SelectComputer{
		val selectcomputer=exec(http("request_2")
			.get("/computers/6"))
			.pause(3)
			.exec(http("request_3")
				.get("/computers"))
			.pause(3)
	}
	object CreateComputer{
		val createcomputer=exec(http("Load_createComputerPage")
			.get("/computers/new"))
			.pause(3)
			.exec(http("create_computer")
				.post("/computers")
				.formParam("name", "ASHTEST1")
				.formParam("introduced", "")
				.formParam("discontinued", "")
				.formParam("company", "1"))
  }
  val admin= scenario("Admins").exec(Search.search,SelectComputer.selectcomputer,CreateComputer.createcomputer)

	val normaluser= scenario("NormalUser").exec(Search.search,SelectComputer.selectcomputer)

	setUp(admin.inject(atOnceUsers(5)),
		normaluser.inject(
			nothingFor(5),
			atOnceUsers(users =1),
			rampUsers(users = 5)during(10),
			constantUsersPerSec(rate = 20) during(20)
		))
		.protocols(httpProtocol)
}