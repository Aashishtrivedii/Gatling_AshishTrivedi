package subscription.staging

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class URLtestt extends Simulation {

	val duration = Duration(1, MINUTES)

	val httpProtocol = http
		.baseUrl("https://www.dev.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0")


    val uri2 = "https://getpocket.cdn.mozilla.net/v3/firefox/global-recs"
    val uri3 = "https://sslwidget.criteo.com/event"
    val uri4 = "https://www.googletagmanager.com/gtm.js"
    val uri5 = "https://firefox.settings.services.mozilla.com/v1"
    val uri6 = "https://heapanalytics.com/h"
    val uri7 = "https://fonts.googleapis.com"
    val uri8 = "https://static-dev.packt-cdn.com/products"


		// hittingURL
		object URLHits{
			val test=exec(http("URLtest_0")
				.get("/product/python/9781787125933")
				.resources(http("URLtest_1")
					.get(uri3 + "?a=43637&v=5.7.1&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvp%26p%3D9781787125933&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=40218")
				))
				.pause(1)
				.exec(http("URLtest_2")
					.get(uri2 + "?version=3&consumer_key=40249-e88c401e1b1f2242d9e441c4&locale_lang=en-US&region=IN&count=30")
					.resources(http("URLtest_3")
						.get(uri6 + "?a=34805961&u=4108670115000370&v=3504353816575572&s=53700755344927&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&z=2&h=%2Fproduct%2Fpython%2F9781787125933&d=www.dev.packtpub.com&t=Python%20Machine%20Learning%2C%20-%20Second%20Edition%20%7C%20Packt&ts=1626761081540&sp=ts&sp=1626761038363&sp=d&sp=www.dev.packtpub.com&sp=h&sp=%2Fproduct%2Fpython%2F9781787125933&st=1626761086469"),
						http("URLtest_4")
							.get(uri8 + "/9781787125933/cover/smaller")
						,
						http("URLtest_5")
							.get(uri5 + "/")
					))
				//.pause(2)
				.exec(http("URLtest_6")
					.get("/product/python/9781787125933")
					.resources(http("URLtest_7")
						.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
						,
						http("URLtest_8")
							.get("/css/app.css?id=e413a60afd9a572e6baf")
						,
						http("URLtest_9")
							.get("/js/app.js?id=57774e803c36a000f6c2")
						,
						http("URLtest_10")
							.get("/js/product.js?id=4380815201ead3a9cf96")
						,
						http("URLtest_11")
							.get(uri7 + "/css?family=Montserrat")
						,
						http("URLtest_12")
							.get(uri7 + "/css?family=Nunito")
						,
						http("URLtest_13")
							.get(uri7 + "/css2?family=Roboto+Mono:wght@500&display=swap")
						,
						http("URLtest_14")
							.get("/images/chevron--breadcrumb.svg")
						,
						http("URLtest_15")
							.get("/images/star--0-white.svg")
						,
						http("URLtest_16")
							.get(uri4 + "?id=GTM-KHLZ7JF")
						,
						http("URLtest_17")
							.get("/images/star--100-white.svg")
						,
						http("URLtest_18")
							.get("/images/star--100.svg")
						,
						http("URLtest_19")
							.get("/images/star--0.svg")
						,
						http("URLtest_20")
							.get("/images/info--blue.svg?021a636172e66637ad8f658d6e7a9cda")
						,
						http("URLtest_21")
							.get("/images/chevron--right-orange.svg?e24f0f91527457cd491ef47f164e48de")
						,
						http("URLtest_22")
							.get("/images/chevron--down-white.svg?e718d4531dde8d29a0d03a0d1a8c6690")
						,
						http("URLtest_23")
							.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
						,
						http("URLtest_24")
							.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
						,
						http("URLtest_25")
							.get(uri8 + "/9781787125933/cover/smaller")
						,
						http("URLtest_26")
							.get(uri8 + "/9781788994170/cover/smaller")
						,
						http("URLtest_27")
							.get("/images/header-bgblur.jpg?1e42b3700468d2e3c3b8e90d1514c769")
						,
						http("URLtest_28")
							.get("/images/blurry-bg.jpg?648b06508e554f6abc64bf6abb8588bb")
						,
						http("URLtest_29")
							.get("/images/chevron--orange.svg?c815c66c9d35a0262ddcf06a6668ba71")
						,
						http("URLtest_30")
							.get(uri8 + "/9781789347999/cover/smaller")
						,
						http("URLtest_31")
							.get(uri8 + "/9781789616729/cover/smaller")
					))
		}


	val scn = scenario("URLtest").exec(URLHits.test)
	setUp(
		scn.inject(nothingFor(2),
		//atOnceUsers(users =1)during(duration),
		//rampUsers(users = 5)during(10),
		constantUsersPerSec(1).during(duration)
	))
		.protocols(httpProtocol)

}