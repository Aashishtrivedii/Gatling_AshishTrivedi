package subscription.staging

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class StagingReader extends Simulation {

	val httpProtocol = http
		.baseUrl("https://heapanalytics.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0")


    val uri01 = "https://www.google-analytics.com/collect"
    val uri02 = "https://www.facebook.com/tr"
    val uri03 = "https://www2.profitwell.com/dotjs/v1/quests/error"
    val uri04 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri05 = "https://api-iam.intercom.io/messenger/web/ping"
    val uri06 = "https://static.hotjar.com/c/hotjar-982604.js"
    val uri07 = "https://subscription-staging.packtpub.com"
    val uri08 = "https://www.google.com/pagead/1p-user-list/945348752"
    val uri09 = "https://www.google.co.in/pagead/1p-user-list/945348752"
    val uri10 = "https://widget.intercom.io/widget/lts26lhx"



		object LoggedinReader{
			val loggedinreader=exec(http("StagingReader_0")
				.get("/h?a=34805961&u=474991291620923&v=6680177174368318&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1624545790829&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1624545854089&pp=pr&pp=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&id0=1285467801927797&t0=click&n0=a&h0=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&y0=%40div%3B%23root%3B%7C%40main%3B.subscription-content-container%3B%5Brole%3Dmain%5D%3B%7C%40section%3B.jumpBackIn-section%3B.row%3B%7C%40div%3B.col-12%3B%7C%40div%3B.slick-initialized%3B.slick-slider%3B%7C%40div%3B.slick-list%3B%7C%40div%3B.slick-track%3B%7C%40div%3B.slick-active%3B.slick-current%3B.slick-slide%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-index%3D0%5D%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B%7C%40div%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B.jumpBackIn-media%3B.media%3B%7C%40div%3B.media-body%3B%7C%40a%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries%5D%3B%7C&ts0=1624545882114&x0=Python%20Data%20Analysis%20-%20Third%20Edition&st=1624545882210")
				.resources(http("StagingReader_1")
					.get(uri07 + "/book/data/9781789955248/2/ch02lvl1sec02/getting-started-with-python-libraries")
					,
					http("StagingReader_2")
						.get(uri06 + "?sv=7")
					,
					http("StagingReader_3")
						.get(uri10)
					,
					http("StagingReader_4")
						.get("/api/identify_v3?a=34805961&u=474991291620923&v=2872858757897691&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1624545883885"),
					http("StagingReader_5")
						.post(uri03 + "/")
						.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21529
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:22242
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/_.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
						.formParam("user_email", "undefined"),
					http("StagingReader_6")
						.get(uri07 + "/api/users/me/subscriptions")
					,
					http("StagingReader_7")
						.get(uri04 + "/?random=1624545883854&cv=9&fst=1624545883854&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg6g0&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&hn=www.google.com&async=1&rfmt=3&fmt=4")
					,
					http("StagingReader_8")
						.get(uri08 + "/?random=1624545883854&cv=9&fst=1624543200000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg6g0&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&async=1&fmt=3&is_vtc=1&random=2525636563&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y"),
					http("StagingReader_9")
						.get(uri09 + "/?random=1624545883854&cv=9&fst=1624543200000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg6g0&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&async=1&fmt=3&is_vtc=1&random=2525636563&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y"),
					http("StagingReader_10")
						.get(uri07 + "/api/products/9781789955248/summary")
					,
					http("StagingReader_11")
						.post(uri05)
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "fed0f736ea00afb0c4de5c000482c38ff1cb7706")
						.formParam("s", "265f5958-148d-415c-9f67-8d196ea4454e")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "db103cf307146b03")
						.formParam("internal", "{}")
						.formParam("page_title", "")
						.formParam("user_active_company_id", "undefined")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","name":"test JumpInJhapaak"}""")
						.formParam("source", "apiBoot")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription-staging.packtpub.com/book/data/9781789955248/2/ch02lvl1sec02/getting-started-with-python-libraries")
						.formParam("anonymous_session", "aXphdGxBT0JyOGpRZU5hM1VKUmlQTURFcEowSHZYbUhMYzloUmdLRFovNDArYnNpYzByMjZEb1NOQm9RS216Qi0tMlZsc1JhTDdLRzVhQThOeXRxWEZKQT09--db528d57ad8156d891ffe25654e91ad1e85afeb9"),
					http("StagingReader_12")
						.get("/h?a=34805961&u=474991291620923&v=2872858757897691&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&d=subscription-staging.packtpub.com&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1624545883882&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1624545790829&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&st=1624545885272"),
					http("StagingReader_13")
						.get(uri07 + "/api/users/me/notes")
					,
					http("StagingReader_14")
						.post(uri05)
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "fed0f736ea00afb0c4de5c000482c38ff1cb7706")
						.formParam("s", "265f5958-148d-415c-9f67-8d196ea4454e")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "1fc06994929268c8")
						.formParam("internal", "{}")
						.formParam("page_title", "Getting Started with Python Libraries | Python Data Analysis - Third Edition")
						.formParam("user_active_company_id", "-1")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","name":"test JumpInJhapaak","last_section_read_url":"/book/data/9781789955248/2","last_section_read_name":"Getting Started with Python Libraries","last_section_read_image_url":"https://static-staging.packt-cdn.com/products/9781789955248/cover/smaller","last_section_read_date_at":1624545885,"last_section_read_category":"Data","last_section_read_book_title":"Python Data Analysis - Third Edition"}""")
						.formParam("source", "apiUpdate")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription-staging.packtpub.com/book/data/9781789955248/2/ch02lvl1sec02/getting-started-with-python-libraries")
						.formParam("anonymous_session", "QkhzbTN1ZFVsQmxpUGp1Sit6VWhRZzQ3bGJ5Y1FtODlxdGY4LzlKN2xOZ3NKREp4RVgxZ0JkNVV1cGZ0ajdsRC0tclpwa3pTWU1QZk1SYTkzRkFHWldkUT09--6bc3ec752bab6a5d7ef818eaccbd62e02cbd1341"),
					http("StagingReader_15")
						.get(uri07 + "/api/users/me/products/9781789955248/completed")
					,
					http("StagingReader_16")
						.get(uri07 + "/api/reader/bookmark/me/9781789955248")
					,
					http("StagingReader_17")
						.get(uri07 + "/api/users/me/products/9781789955248/entitlement")
					,
					http("StagingReader_18")
						.get(uri07 + "/api/users/me/playlists")
					,
					http("StagingReader_19")
						.get(uri07 + "/api/reader/contentful")
					,
					http("StagingReader_20")
						.get(uri07 + "/api/product/content/data/9781789955248/2/ch02lvl1sec02")
					,
					http("StagingReader_21")
						.get(uri07 + "/api/users/me/products/9781789955248/completed")
					,
					http("StagingReader_22")
						.get(uri07 + "/api/product/content/data/9781789955248/2/ch02lvl1sec02")
					,
					http("StagingReader_23")
						.get(uri07 + "/api/product/9781789955248/files")
					,
					http("StagingReader_24")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1624545885247&sw=1280&sh=1024&v=2.9.41&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1624545884565&coo=false&rqm=GET"),
					http("StagingReader_25")
						.get(uri01 + "?v=1&_v=j91&a=302336484&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&dp=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&ul=en-us&de=UTF-8&dt=Getting%20Started%20with%20Python%20Libraries%20%7C%20Python%20Data%20Analysis%20-%20Third%20Edition&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=648469584.1624545714&gtm=2wg6g0WJMM825&cd1=d12c50a2-843a-43de-96ba-360e39c985a4&cd3=1624545885257.w6t13guq&cd4=2021-06-24T20%3A14%3A45.258%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=1373893679"),
					http("StagingReader_26")
						.get(uri02 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1624545886783&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Getting%20Started%20with%20Python%20Libraries%20%7C%20Python%20Data%20Analysis%20-%20Third%20Edition%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.41&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1624545884565&coo=false&es=automatic&tm=3&rqm=GET"),
					http("StagingReader_27")
						.get(uri07 + "/api/subscription/getrecentitems")
				))
				.pause(1)
				.exec(http("StagingReader_28")
					.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec03%2Funderstanding-data-analysis&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1624545895918&sw=1280&sh=1024&v=2.9.41&r=stable&ec=2&o=30&fbp=fb.1.1617965825884.1082240722&it=1624545884565&coo=false&rqm=GET")
					.resources(http("StagingReader_29")
						.get("/h?a=34805961&u=474991291620923&v=7291406045216088&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec03%2Funderstanding-data-analysis&d=subscription-staging.packtpub.com&t=Getting%20Started%20with%20Python%20Libraries%20%7C%20Python%20Data%20Analysis%20-%20Third%20Edition&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1624545896114&pr=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec02%2Fgetting-started-with-python-libraries&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1624545790829&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&st=1624545896114"),
						http("StagingReader_30")
							.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec04%2Fthe-standard-process-of-data-analysis&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1624545896395&sw=1280&sh=1024&v=2.9.41&r=stable&ec=3&o=30&fbp=fb.1.1617965825884.1082240722&it=1624545884565&coo=false&rqm=GET"),
						http("StagingReader_31")
							.post(uri05)
							.formParam("app_id", "lts26lhx")
							.formParam("v", "3")
							.formParam("g", "fed0f736ea00afb0c4de5c000482c38ff1cb7706")
							.formParam("s", "265f5958-148d-415c-9f67-8d196ea4454e")
							.formParam("r", "https://subscription-staging.packtpub.com/")
							.formParam("platform", "web")
							.formParam("Idempotency-Key", "7ddd44f9863393be")
							.formParam("internal", "{}")
							.formParam("page_title", "Getting Started with Python Libraries | Python Data Analysis - Third Edition")
							.formParam("user_active_company_id", "-1")
							.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","name":"test JumpInJhapaak","last_section_read_url":"/book/data/9781789955248/2/ch02lvl1sec03/understanding-data-analysis","last_section_read_name":"Understanding data analysis","last_section_read_image_url":"https://static-staging.packt-cdn.com/products/9781789955248/cover/smaller","last_section_read_date_at":1624545896,"last_section_read_category":"Data","last_section_read_book_title":"Python Data Analysis - Third Edition"}""")
							.formParam("source", "apiUpdate")
							.formParam("sampling", "false")
							.formParam("referer", "https://subscription-staging.packtpub.com/book/data/9781789955248/2/ch02lvl1sec03/understanding-data-analysis")
							.formParam("anonymous_session", "ejRGcFFUNHhsc1piWUVIdkd6cmpjYTc5YVNSdDlsMWpBNGE1MkFrNmxiNVg5aXNGVzJteG0yQThOWm9lalo1bi0tcFZkZTFNOEZWQ1JiMitzTkhpakwvZz09--ed9bf0babf6e29ef810db0d7ca68129ca479d1bd"),
						http("StagingReader_32")
							.get("/h?a=34805961&u=474991291620923&v=3971167884621400&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec04%2Fthe-standard-process-of-data-analysis&d=subscription-staging.packtpub.com&t=Getting%20Started%20with%20Python%20Libraries%20%7C%20Python%20Data%20Analysis%20-%20Third%20Edition&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1624545896556&pr=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec03%2Funderstanding-data-analysis&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1624545790829&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&st=1624545896557"),
						http("StagingReader_33")
							.post(uri05)
							.formParam("app_id", "lts26lhx")
							.formParam("v", "3")
							.formParam("g", "fed0f736ea00afb0c4de5c000482c38ff1cb7706")
							.formParam("s", "265f5958-148d-415c-9f67-8d196ea4454e")
							.formParam("r", "https://subscription-staging.packtpub.com/")
							.formParam("platform", "web")
							.formParam("Idempotency-Key", "7b32f33614cd59df")
							.formParam("internal", "{}")
							.formParam("page_title", "Getting Started with Python Libraries | Python Data Analysis - Third Edition")
							.formParam("user_active_company_id", "-1")
							.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","name":"test JumpInJhapaak","last_section_read_url":"/book/data/9781789955248/2/ch02lvl1sec04/the-standard-process-of-data-analysis","last_section_read_name":"The standard process of data analysis","last_section_read_image_url":"https://static-staging.packt-cdn.com/products/9781789955248/cover/smaller","last_section_read_date_at":1624545896,"last_section_read_category":"Data","last_section_read_book_title":"Python Data Analysis - Third Edition"}""")
							.formParam("source", "apiUpdate")
							.formParam("sampling", "false")
							.formParam("referer", "https://subscription-staging.packtpub.com/book/data/9781789955248/2/ch02lvl1sec04/the-standard-process-of-data-analysis")
							.formParam("anonymous_session", "alBSckxzc0QvSVdaUEQ5MEZ3NDNldDRkYUhBUUlVNTF4VGFCTnBLWjdGSGFyNFVPNWVWVE1qVkU1UlJKYjRScy0taGhFNDVuKzBjZTE0a2xBYlFJVkY4dz09--dfd9fe8fc3f8fba3696243fdfe129e785aca94d9"),
						http("StagingReader_34")
							.put(uri07 + "/api/users/me/completed")
							.body(RawFileBody("subscription/staging/stagingreader/0034_request.json"))))
				.pause(1)
				.exec(http("StagingReader_35")
					.get("/h?a=34805961&u=474991291620923&v=3971167884621400&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1624545790829&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec04%2Fthe-standard-process-of-data-analysis&pp=t&pp=Getting%20Started%20with%20Python%20Libraries%20%7C%20Python%20Data%20Analysis%20-%20Third%20Edition&pp=ts&pp=1624545896556&pp=pr&pp=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec03%2Funderstanding-data-analysis&id0=496308063000836&t0=click&n0=div&c0=card-header&y0=%40div%3B%23root%3B%7C%40div%3B.day-mode%3B%7C%40div%3B.show-sidebar%3B%7C%40div%3B.lhs%3B.show-buttons%3B%7C%40div%3B%23style-grey%3B.toc-container%3B%7C%40div%3B.accordion%3B%7C%40div%3B.card%3B%7C%40div%3B.card-header%3B%7C&ts0=1624545898726&x0=1%0ASection%201%3A%20Foundation%20for%20Data%20Analysis&id1=4757854644784064&t1=click&n1=div&c1=card-header&y1=%40div%3B%23root%3B%7C%40div%3B.day-mode%3B%7C%40div%3B.show-sidebar%3B%7C%40div%3B.lhs%3B.show-buttons%3B%7C%40div%3B%23style-grey%3B.toc-container%3B%7C%40div%3B.accordion%3B%7C%40div%3B.card%3B%7C%40div%3B.card-header%3B%7C&ts1=1624545899959&x1=2%0AGetting%20Started%20with%20Python%20Libraries&st=1624545900136"))
				.pause(1)
				.exec(http("StagingReader_36")
					.get("/h?a=34805961&u=474991291620923&v=3971167884621400&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1624545790829&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec04%2Fthe-standard-process-of-data-analysis&pp=t&pp=Getting%20Started%20with%20Python%20Libraries%20%7C%20Python%20Data%20Analysis%20-%20Third%20Edition&pp=ts&pp=1624545896556&pp=pr&pp=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec03%2Funderstanding-data-analysis&id0=8384344429101462&t0=click&n0=span&c0=toc-section-title&y0=%40div%3B%23root%3B%7C%40div%3B.day-mode%3B%7C%40div%3B.show-sidebar%3B%7C%40div%3B.lhs%3B.show-buttons%3B%7C%40div%3B%23style-grey%3B.toc-container%3B%7C%40div%3B.accordion%3B%7C%40div%3B.card%3B%7C%40div%3B.card-header%3B%7C%40div%3B.header%3B%7C%40span%3B.toc-section-title%3B%7C&ts0=1624545903351&x0=Linear%20Algebra&st=1624545904160")
					.resources(http("StagingReader_37")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F5&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1624545904606&sw=1280&sh=1024&v=2.9.41&r=stable&ec=4&o=30&fbp=fb.1.1617965825884.1082240722&it=1624545884565&coo=false&rqm=GET"),
						http("StagingReader_38")
							.get("/h?a=34805961&u=474991291620923&v=1333620426385222&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fbook%2Fdata%2F9781789955248%2F5&d=subscription-staging.packtpub.com&t=Linear%20Algebra%20%7C%20Python%20Data%20Analysis%20-%20Third%20Edition&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1624545904830&pr=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec04%2Fthe-standard-process-of-data-analysis&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1624545790829&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&st=1624545904831"),
						http("StagingReader_39")
							.post(uri05)
							.formParam("app_id", "lts26lhx")
							.formParam("v", "3")
							.formParam("g", "fed0f736ea00afb0c4de5c000482c38ff1cb7706")
							.formParam("s", "265f5958-148d-415c-9f67-8d196ea4454e")
							.formParam("r", "https://subscription-staging.packtpub.com/")
							.formParam("platform", "web")
							.formParam("Idempotency-Key", "f4e9d695cf8825fd")
							.formParam("internal", "{}")
							.formParam("page_title", "Linear Algebra | Python Data Analysis - Third Edition")
							.formParam("user_active_company_id", "-1")
							.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","name":"test JumpInJhapaak","last_section_read_url":"/book/data/9781789955248/5","last_section_read_name":"Linear Algebra","last_section_read_image_url":"https://static-staging.packt-cdn.com/products/9781789955248/cover/smaller","last_section_read_date_at":1624545904,"last_section_read_category":"Data","last_section_read_book_title":"Python Data Analysis - Third Edition"}""")
							.formParam("source", "apiUpdate")
							.formParam("sampling", "false")
							.formParam("referer", "https://subscription-staging.packtpub.com/book/data/9781789955248/5")
							.formParam("anonymous_session", "cGZqa0RUbUl3bVFGdDN5dGNRVVlsZEdxZFdqOHNsV1Ewei9OVXAvSjZFRVk5VzM1Qitmb2J3SGJrZUFKdDNIZi0tRWdZK0NBSGJMK1BNbEZuRUlPanVQdz09--80e0cade38f900b06ecd6a6a54b51f8f0e352423"),
						http("StagingReader_40")
							.get("/h?a=34805961&u=474991291620923&v=3971167884621400&s=2882018925493474&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1624545790829&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec04%2Fthe-standard-process-of-data-analysis&pp=t&pp=Getting%20Started%20with%20Python%20Libraries%20%7C%20Python%20Data%20Analysis%20-%20Third%20Edition&pp=ts&pp=1624545896556&pp=pr&pp=%2Fbook%2Fdata%2F9781789955248%2F2%2Fch02lvl1sec03%2Funderstanding-data-analysis&id0=6205935669702866&t0=click&n0=span&c0=col-11&y0=%40div%3B%23root%3B%7C%40div%3B.day-mode%3B%7C%40div%3B.show-sidebar%3B%7C%40div%3B.lhs%3B.show-buttons%3B%7C%40div%3B%23style-grey%3B.toc-container%3B%7C%40div%3B.accordion%3B%7C%40div%3B.card%3B%7C%40div%3B.collapse%3B.show%3B%7C%40div%3B.card-body%3B%7C%40ul%3B%7C%40li%3B.d-flex%3B.false%3B.justify-content-end%3B%7C%40span%3B.col-11%3B%7C&ts0=1624545904599&x0=Linear%20Algebra&st=1624545904604"),
						http("StagingReader_41")
							.get(uri07 + "/api/product/content/data/9781789955248/5/ch05lvl1sec76")
					))

		}

	val anyuser = scenario("StagingReader").exec(LoggedinReader.loggedinreader)
	setUp(anyuser.inject(nothingFor(5),
		atOnceUsers(users =1),
		rampUsers(users = 5)during(10),
		constantUsersPerSec(rate = 35) during(20)
	))
		.protocols(httpProtocol)
}