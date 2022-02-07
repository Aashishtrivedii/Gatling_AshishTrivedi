package subscription.Live

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LiveReaderr extends Simulation {

	val httpProtocol = http
		.baseUrl("https://subscription.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("application/json, text/plain, */*")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0")



	val uri01 = "https://www.google-analytics.com/j/collect"
	val uri02 = "https://www.facebook.com/tr"
	val uri03 = "https://stats.g.doubleclick.net/j/collect"
	val uri04 = "https://aus5.mozilla.org/update/6/Firefox/88.0.1/20210504152106/WINNT_x86_64-msvc-x64/en-US/release/Windows_NT%2010.0.0.0.19042.1052%20(x64)/ISET:SSE4_2,MEM:8007/default/default/update.xml"
	val uri05 = "https://www2.profitwell.com/dotjs/v1/quests"
	val uri06 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
	val uri08 = "https://api-iam.intercom.io/messenger/web/ping"
	val uri09 = "https://static.hotjar.com/c/hotjar-982604.js"
	val uri10 = "https://www.google.com"
	val uri11 = "https://www.google.co.in"
	val uri12 = "https://download.mozilla.org"
	val uri13 = "https://widget.intercom.io/widget/e8mdsr07"
	val uri14 = "https://heapanalytics.com/h"


	// LoggedIn User Hits reader via any title
	object LiveReader{
		val livereader=exec(http("LiveReader_0")
			.get("/book/programming/9781801071109")

			.resources(http("LiveReader_1")
				.get("/book/programming/9781801071109/1")
				,
				http("LiveReader_2")
					.get(uri09 + "?sv=7")
				,
				http("LiveReader_3")
					.get("/api/products/9781801071109/summary")
				,
				http("LiveReader_4")
					.get("/api/users/me/subscriptions")
				,
				http("LiveReader_5")
					.post(uri01 + "?v=1&_v=j91&a=546866120&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1&dp=%2Fbook%2Fprogramming%2F9781801071109%2F1&ul=en-us&de=UTF-8&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQAAAAC~&jid=1582046045&gjid=65042104&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1298983302.1625028512&_r=1&gtm=2wg6n0WJMM825&cd1=bc0052a9-aa30-413f-81d7-720c06ce9652&cd3=1625028699739.tetqb68&cd4=2021-06-30T10%3A21%3A39.739%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=823308481")
				,
				http("LiveReader_6")
					.get(uri13)
				,
				http("LiveReader_7")
					.get(uri14 + "?a=34805961&u=4108670115000370&v=4101099572765131&s=4568244160896201&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&z=2&h=%2Fbook%2Fprogramming%2F9781801071109%2F1&d=subscription.packtpub.com&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1625028699914&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1625028593420&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1625028699918")
				,
				http("LiveReader_8")
					.get("/images/bar-icon.svg")
				,
				http("LiveReader_9")
					.post(uri03 + "?t=dc&aip=1&_r=3&v=1&_v=j91&tid=UA-284627-1&cid=1010921333.1617965825&jid=1582046045&gjid=65042104&_gid=1298983302.1625028512&_u=SCCAAEACQAAAAC~&z=1951892303")
				,
				http("LiveReader_10")
					.get("/images/account-user.svg")
				,
				http("LiveReader_11")
					.get("/images/chevron--orange.svg")
				,
				http("LiveReader_12")
					.get("/api/subscription/getrecentitems")
				,
				http("LiveReader_13")
					.get(uri10 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j91&tid=UA-284627-1&cid=1010921333.1617965825&jid=1582046045&_u=SCCAAEACQAAAAC~&z=1469475425")
				,
				http("LiveReader_14")
					.get(uri11 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j91&tid=UA-284627-1&cid=1010921333.1617965825&jid=1582046045&_u=SCCAAEACQAAAAC~&z=1469475425")
				,
				http("LiveReader_15")
					.get("/api/users/me/notes")
				,
				http("LiveReader_16")
					.get("/api/users/me/products/9781801071109/entitlement")
				,
				http("LiveReader_17")
					.get("/api/users/me/products/9781801071109/completed")
				,
				http("LiveReader_18")
					.get("/api/users/me/products/9781801071109/completed")
				,
				http("LiveReader_19")
					.get(uri05 + "/customer/?user_email=undefined&custom_styles=%7B%7D")

				,
				http("LiveReader_20")
					.get("/api/reader/contentful")
				,
				http("LiveReader_21")
					.post(uri05 + "/error/")

					.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21529
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:22242
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/_.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
					.formParam("user_email", "undefined"),
				http("LiveReader_22")
					.get(uri06 + "/?random=1625028698577&cv=9&fst=1625028698577&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg6n0&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&hn=www.google.com&async=1&rfmt=3&fmt=4")
				,
				http("LiveReader_23")
					.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1625028699728&sw=1280&sh=1024&v=2.9.42&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1625028699152&coo=false&rqm=GET")
				,
				http("LiveReader_24")
					.get(uri02 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1625028701252&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Current%20Status%20of%20Python%20%7C%20Expert%20Python%20Programming%20-%20Fourth%20Edition%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Current%20Status%20of%20Python%20%7C%20Expert%20Python%20Programming%20-%20Fourth%20Edition%22%2C%22og%3Adescription%22%3A%22%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fstatic.packt-cdn.com%2Fproducts%2F9781801071109%2Fcover%2Fsmaller%22%2C%22og%3Asite_name%22%3A%22Packt%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.42&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1625028699152&coo=false&es=automatic&tm=3&rqm=GET")
				,
				http("LiveReader_25")
					.get("/api/product/content/programming/9781801071109/1/ch01lvl1sec01")
				,
				http("LiveReader_26")
					.get("/api/product/content/programming/9781801071109/1/ch01lvl1sec01")
				,
				http("LiveReader_27")
					.get(uri10 + "/pagead/1p-user-list/945348752/?random=1625028698577&cv=9&fst=1625025600000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg6n0&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&async=1&fmt=3&is_vtc=1&random=70152027&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
				,
				http("LiveReader_28")
					.get(uri11 + "/pagead/1p-user-list/945348752/?random=1625028698577&cv=9&fst=1625025600000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg6n0&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&async=1&fmt=3&is_vtc=1&random=70152027&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
				,
				http("LiveReader_29")
					.get("/api/reader/bookmark/me/9781801071109")
				,
				http("LiveReader_30")
					.get("/images/Bookmark-grey.svg")
				,
				http("LiveReader_31")
					.get("/api/users/me/products/9781801071109/completed")
				,
				http("LiveReader_32")
					.get("/api/users/me/playlists")
				,
				http("LiveReader_33")
					.post(uri08)

					.formParam("app_id", "e8mdsr07")
					.formParam("v", "3")
					.formParam("g", "2d736ebfadee276ef290a1e188b8bc04b90078cf")
					.formParam("s", "7adf9134-7962-4f8f-8ee6-6fc89baf05ec")
					.formParam("r", "https://subscription.packtpub.com/")
					.formParam("platform", "web")
					.formParam("Idempotency-Key", "6f9aec13a1c779a0")
					.formParam("internal", "{}")
					.formParam("page_title", "Current Status of Python | Expert Python Programming - Fourth Edition")
					.formParam("user_active_company_id", "undefined")
					.formParam("user_data", """{"email":"ashishtrivedi@packt.com","user_id":"bc0052a9-aa30-413f-81d7-720c06ce9652","name":"Ashish Trivedi"}""")
					.formParam("source", "apiBoot")
					.formParam("sampling", "false")
					.formParam("referer", "https://subscription.packtpub.com/book/programming/9781801071109/1")
					.formParam("anonymous_session", "L0YrVUVKdWZSYXZKVXFsUW5rZ3E5MTF6SzlYS1lleHRObWpUVk9iT3QwNllQbkUyWU9xeTg0Sm5uSG0rR0xSVy0tTHBENkdJeStnbW9pb25tZlNvWDBRQT09--8992c7eab62e32254119307e95f2c52456478591"),
				http("LiveReader_34")
					.get("/api/reader/credits/me/balance")

			))
			.pause(1)
			.exec(http("LiveReader_35")
				.get(uri04)

				.resources(http("LiveReader_36")
					.get("/api/product/9781801071109/files")
				))
			.pause(1)
			.exec(http("LiveReader_37")
				.get(uri12 + "/?product=firefox-89.0.2-partial-88.0.1&os=win64&lang=en-US")

				.resources(http("LiveReader_38")
					.get(uri14 + "?a=34805961&u=4108670115000370&v=3863136291299377&s=4568244160896201&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&z=2&h=%2Fbook%2Fprogramming%2F9781801071109%2F1%2Fch01lvl1sec03%2Fwhat-to-do-with-python-2&d=subscription.packtpub.com&t=Current%20Status%20of%20Python%20%7C%20Expert%20Python%20Programming%20-%20Fourth%20Edition&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1625028721719&pr=%2Fbook%2Fprogramming%2F9781801071109%2F1%2Fch01lvl1sec02%2Fwhere-are-we-now-and-where-are-we-going&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1625028593420&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1625028721719")
					,
					http("LiveReader_39")
						.post(uri08)

						.formParam("app_id", "e8mdsr07")
						.formParam("v", "3")
						.formParam("g", "2d736ebfadee276ef290a1e188b8bc04b90078cf")
						.formParam("s", "7adf9134-7962-4f8f-8ee6-6fc89baf05ec")
						.formParam("r", "https://subscription.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "2af47992dad11abf")
						.formParam("internal", "{}")
						.formParam("page_title", "Current Status of Python | Expert Python Programming - Fourth Edition")
						.formParam("user_active_company_id", "-1")
						.formParam("user_data", """{"email":"ashishtrivedi@packt.com","user_id":"bc0052a9-aa30-413f-81d7-720c06ce9652","name":"Ashish Trivedi","last_section_read_url":"/book/programming/9781801071109/1/ch01lvl1sec02/where-are-we-now-and-where-are-we-going","last_section_read_name":"Where are we now and where are we going?","last_section_read_image_url":"https://static.packt-cdn.com/products/9781801071109/cover/smaller","last_section_read_date_at":1625028721,"last_section_read_category":"Programming","last_section_read_book_title":"Expert Python Programming - Fourth Edition"}""")
						.formParam("source", "apiUpdate")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription.packtpub.com/book/programming/9781801071109/1/ch01lvl1sec02/where-are-we-now-and-where-are-we-going")
						.formParam("anonymous_session", "cS9PclhkRThKMG1yMER3YXd0bXNpOEJDeWxDOVdiUFNIOGRSa1FzNDNxNThJWElRQ1lxNHB1TE90bDlMdXdNei0tc2xST1d4MXJEMzRQcmE3RTNFSmhGQT09--ee6338bfb8c034444b8dd7044a7ba086693dd0fc"),
					http("LiveReader_40")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1%2Fch01lvl1sec03%2Fwhat-to-do-with-python-2&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1625028721645&sw=1280&sh=1024&v=2.9.42&r=stable&ec=3&o=30&fbp=fb.1.1617965825884.1082240722&it=1625028699152&coo=false&rqm=GET")
					,
					http("LiveReader_41")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fprogramming%2F9781801071109%2F1%2Fch01lvl1sec02%2Fwhere-are-we-now-and-where-are-we-going&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1625028720952&sw=1280&sh=1024&v=2.9.42&r=stable&ec=2&o=30&fbp=fb.1.1617965825884.1082240722&it=1625028699152&coo=false&rqm=GET")
					,
					http("LiveReader_42")
						.post(uri08)

						.formParam("app_id", "e8mdsr07")
						.formParam("v", "3")
						.formParam("g", "2d736ebfadee276ef290a1e188b8bc04b90078cf")
						.formParam("s", "7adf9134-7962-4f8f-8ee6-6fc89baf05ec")
						.formParam("r", "https://subscription.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "9924fbe994b0014e")
						.formParam("internal", "{}")
						.formParam("page_title", "Current Status of Python | Expert Python Programming - Fourth Edition")
						.formParam("user_active_company_id", "-1")
						.formParam("user_data", """{"email":"ashishtrivedi@packt.com","user_id":"bc0052a9-aa30-413f-81d7-720c06ce9652","name":"Ashish Trivedi","last_section_read_url":"/book/programming/9781801071109/1/ch01lvl1sec03/what-to-do-with-python-2","last_section_read_name":"What to do with Python 2","last_section_read_image_url":"https://static.packt-cdn.com/products/9781801071109/cover/smaller","last_section_read_date_at":1625028721,"last_section_read_category":"Programming","last_section_read_book_title":"Expert Python Programming - Fourth Edition"}""")
						.formParam("source", "apiUpdate")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription.packtpub.com/book/programming/9781801071109/1/ch01lvl1sec03/what-to-do-with-python-2")
						.formParam("anonymous_session", "enVqUEJYTHBYNmswQ2g1bGVlLzZFMkhkaUZvdG1FUlg2VVFKTldUbFkxYnN6TGd1ZEZabjVpaVlpbFFnTEFROC0tc0FjK1NITDhmSW8zY1EwMFJOWUlTUT09--c26605a3f7a4198a8527298ef971468c5289701c"),
					http("LiveReader_43")
						.put("/api/users/me/completed")

						.body(RawFileBody("computerdatabase/livereader/0043_request.json")),
					http("LiveReader_44")
						.put("/api/users/me/completed")

						.body(RawFileBody("computerdatabase/livereader/0044_request.json")),
					http("LiveReader_45")
						.get("/images/Tick.svg")
				))
	}

	val loggedinuser = scenario("LiveReader").exec(LiveReader.livereader)
	setUp(loggedinuser.inject(nothingFor(5),
		atOnceUsers(users =1),
		rampUsers(users = 5)during(10),
		constantUsersPerSec(rate = 20) during(20)
	))
		.protocols(httpProtocol)
}