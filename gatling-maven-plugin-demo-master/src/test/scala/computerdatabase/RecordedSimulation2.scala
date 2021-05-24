package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation2 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://static.hotjar.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_9 = Map(
		"Content-Type" -> "text/plain",
		"Origin" -> "https://subscription-staging.packtpub.com")

	val headers_10 = Map("Accept" -> "image/webp,*/*")

	val headers_18 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Origin" -> "https://subscription-staging.packtpub.com")

    val uri01 = "https://connect.facebook.net/signals/config/445429252334850"
    val uri02 = "https://www.google-analytics.com"
    val uri03 = "https://www.recaptcha.net/recaptcha/api.js"
    val uri04 = "https://www.facebook.com/tr"
    val uri05 = "https://service.maxymiser.net/cg/v5"
    val uri06 = "https://vars.hotjar.com/box-5e3cec51ed8e99df6977c199d27812d7.html"
    val uri07 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri08 = "https://www.googletagmanager.com/gtm.js"
    val uri09 = "https://subscription-staging.packtpub.com/login"
    val uri10 = "https://fonts.googleapis.com/css"
    val uri11 = "https://stats.g.doubleclick.net/j/collect"
    val uri12 = "https://cdn.polyfill.io/v2/polyfill.min.js"
    val uri13 = "https://www.google.com"
    val uri14 = "https://www.google.co.in"
    val uri16 = "https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/fonts/fontawesome-webfont.woff2"
    val uri17 = "https://widget.intercom.io/widget/lts26lhx"
    val uri18 = "https://heapanalytics.com/h"

	val scn = scenario("RecordedSimulation2")
		.exec(http("RecordedSimulation2_0")
			.get(uri09)
			.headers(headers_0)
			.resources(http("RecordedSimulation2_1")
			.get(uri10 + "?family=Montserrat:500,400|Lato:300,400,500")
			.headers(headers_1),
            http("RecordedSimulation2_2")
			.get(uri12 + "?features=default,Array.prototype.findIndex,Array.prototype.find,Array.prototype.includes&flags=gated"),
            http("RecordedSimulation2_3")
			.get(uri03 + "?onload=vcRecaptchaApiLoaded&render=explicit"),
            http("RecordedSimulation2_4")
			.get(uri05 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription-staging.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription-staging.packtpub.com%252Flogin%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s"),
            http("RecordedSimulation2_5")
			.get(uri08 + "?id=GTM-WJMM825")))
		.pause(6)
		.exec(http("RecordedSimulation2_6")
			.get("/c/hotjar-982604.js?sv=7")
			.resources(http("RecordedSimulation2_7")
			.get(uri01 + "?v=2.9.33&r=stable")))
		.pause(1)
		.exec(http("RecordedSimulation2_8")
			.get(uri02 + "/gtm/js?id=GTM-MSRQZ29&t=gtm13&cid=1010921333.1617965825")
			.resources(http("RecordedSimulation2_9")
			.post(uri02 + "/j/collect?v=1&_v=j89&a=1710046281&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=aGDAAEADQAAAAC~&jid=405374967&gjid=1941880291&cid=1010921333.1617965825&tid=UA-284627-1&_gid=213003128.1617965825&_r=1&gtm=2wg3v0WJMM825&cd3=1617965827879.iaq0waap&cd4=2021-04-09T16%3A27%3A07.879%2B05%3A30&cd2=1010921333.1617965825&z=1930946887")
			.headers(headers_9),
            http("RecordedSimulation2_10")
			.get(uri04 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1617965825886&sw=1280&sh=1024&v=2.9.33&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1617965823952&coo=false&rqm=GET")
			.headers(headers_10),
            http("RecordedSimulation2_11")
			.get(uri04 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1617965826401&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22meta%3Adescription%22%3A%22%7B%7BmetadataController.description%7D%7D%22%7D&cd[OpenGraph]=%7B%22og%3Atype%22%3A%22%7B%7BmetadataController.productType%7D%7D%22%2C%22og%3Atitle%22%3A%22%7B%7BmetadataController.pageTitle%7D%7D%22%2C%22og%3Adescription%22%3A%22%7B%7BmetadataController.description%7D%7D%22%2C%22og%3Aurl%22%3A%22%7B%7BmetadataController.canonicalUrl%7D%7D%22%2C%22og%3Aimage%22%3A%22%7B%7BmetadataController.imagePath%7D%7D%22%2C%22og%3Aimage%3Asecure_url%22%3A%22%7B%7BmetadataController.imagePath%7D%7D%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.33&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1617965823952&coo=false&es=automatic&tm=3&rqm=GET")
			.headers(headers_10),
            http("RecordedSimulation2_12")
			.post(uri11 + "?t=dc&aip=1&_r=3&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=405374967&gjid=1941880291&_gid=213003128.1617965825&_u=aGDAAEACQAAAAC~&z=1453182743")
			.headers(headers_9),
            http("RecordedSimulation2_13")
			.get(uri14 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=405374967&_u=aGDAAEACQAAAAC~&z=1568408326")
			.headers(headers_10),
            http("RecordedSimulation2_14")
			.get(uri13 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=405374967&_u=aGDAAEACQAAAAC~&z=1568408326")
			.headers(headers_10)))
		.pause(3)
		.exec(http("RecordedSimulation2_15")
			.get(uri06)
			.headers(headers_0)
			.resources(http("RecordedSimulation2_16")
			.get("/c/hotjar-982604.js?sv=6"),
            http("RecordedSimulation2_17")
			.get(uri02 + "/collect?v=1&_v=j89&a=1710046281&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=aGDAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=213003128.1617965825&gtm=2wg3v0WJMM825&cd3=1617965832550.q9g6cnk&cd4=2021-04-09T16%3A27%3A12.550%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=807938422")
			.headers(headers_10),
            http("RecordedSimulation2_18")
			.get(uri16 + "?v=4.7.0")
			.headers(headers_18),
            http("RecordedSimulation2_19")
			.get(uri07 + "/?random=1617965832817&cv=9&fst=1617965832817&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg3v0&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&hn=www.google.com&async=1&rfmt=3&fmt=4"),
            http("RecordedSimulation2_20")
			.get(uri13 + "/pagead/1p-user-list/945348752/?random=1617965832817&cv=9&fst=1617962400000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg3v0&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=2754683343&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
			.headers(headers_10),
            http("RecordedSimulation2_21")
			.get(uri14 + "/pagead/1p-user-list/945348752/?random=1617965832817&cv=9&fst=1617962400000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg3v0&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=2754683343&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
			.headers(headers_10),
            http("RecordedSimulation2_22")
			.get(uri18 + "?a=34805961&u=287607950759695&v=4938324475218422&s=2010120320213794&b=web&tv=4.0&z=0&h=%2Flogin&d=subscription-staging.packtpub.com&t=Login%20%7C%20Packt%20Subscription&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1617965832707&pr=%2F&st=1617965832708")
			.headers(headers_10),
            http("RecordedSimulation2_23")
			.get(uri17)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}