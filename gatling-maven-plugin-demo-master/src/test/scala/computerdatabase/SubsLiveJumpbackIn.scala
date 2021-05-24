package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SubsLiveJumpbackIn extends Simulation {

	val httpProtocol = http
		.baseUrl("https://subscription.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")



    val uri01 = "https://connect.facebook.net/signals/config/445429252334850"
    val uri02 = "https://d3ginfw2u4xn7p.cloudfront.net/be71e4bab87e4f09bf8ddda732d0fac0/3e2cab2598e32a9ff31a997f4cadc583.html"
    val uri03 = "https://www.google-analytics.com"
    val uri04 = "https://service.maxymiser.net/cg/v5"
    val uri05 = "https://getpocket.cdn.mozilla.net/v3/firefox/global-recs"
    val uri06 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri07 = "https://geolocation-api.packtpub.com/v1/location"
    val uri08 = "https://fonts.googleapis.com"
    val uri09 = "https://www.recaptcha.net/recaptcha/api.js"
    val uri10 = "https://static.packt-cdn.com"
    val uri11 = "https://users-packtlib-api.packtpub.com/v2/users/me"
    val uri12 = "https://www.facebook.com/tr"
    val uri13 = "https://subscriptions-api.packtpub.com/v1/users/me"
    val uri14 = "https://stats.g.doubleclick.net/j/collect"
    val uri15 = "https://cdn.polyfill.io/v2/polyfill.min.js"
    val uri16 = "https://packt-reader-content-production.s3.eu-west-1.amazonaws.com/9781789955248"
    val uri17 = "https://www2.profitwell.com/dotjs/v1/quests"
    val uri18 = "https://services.packtpub.com"
    val uri19 = "https://www.googletagmanager.com/gtm.js"
    val uri21 = "https://www.google.com"
    val uri22 = "https://www.google.co.in"
    val uri23 = "https://api-iam.intercom.io/messenger/web"
    val uri24 = "https://firefox.settings.services.mozilla.com/v1"
    val uri25 = "https://static.hotjar.com/c/hotjar-982604.js"
    val uri26 = "https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/fonts/fontawesome-webfont.woff2"
    val uri27 = "https://widget.intercom.io/widget/e8mdsr07"
    val uri28 = "https://heapanalytics.com"



		object LOGINPAGE{
			val loginpage=exec(http("SubsLiveJumpbackIn_0")
				.get("/")
				.resources(http("SubsLiveJumpbackIn_1")
					.get(uri19 + "?id=GTM-WJMM825")
					,
					http("SubsLiveJumpbackIn_2")
						.get(uri27),
					http("SubsLiveJumpbackIn_3")
						.get(uri25 + "?sv=7")
						,
					http("SubsLiveJumpbackIn_4")
						.get(uri28 + "/api/identify_v3?a=34805961&u=4948129760563764&v=7588958490817195&s=7120445548684719&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=0&st=1620102573584")
						,
					http("SubsLiveJumpbackIn_5")
						.get(uri01 + "?v=2.9.39&r=stable"),
					http("SubsLiveJumpbackIn_6")
						.get(uri17 + "/customer/?user_email=undefined&custom_styles=%7B%7D")
						,
					http("SubsLiveJumpbackIn_7")
						.get(uri03 + "/gtm/js?id=GTM-MSRQZ29&t=gtm13&cid=1010921333.1617965825")
						,
					http("SubsLiveJumpbackIn_8")
						.post(uri17 + "/error/")
						.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21059
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21772
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/A.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
						.formParam("user_email", "undefined"),
					http("SubsLiveJumpbackIn_9")
						.get(uri12 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=&if=false&ts=1620102575254&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620102574673&coo=false&exp=l0&rqm=GET")
						,
					http("SubsLiveJumpbackIn_10")
						.get(uri28 + "/h?a=34805961&u=4948129760563764&v=7588958490817195&s=7120445548684719&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=2&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&ts=1620102573582&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620101634597&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620102575565")
						,
					http("SubsLiveJumpbackIn_11")
						.get("/api/subscription/home")
						,
					http("SubsLiveJumpbackIn_12")
						.get(uri03 + "/collect?v=1&_v=j90&a=720000509&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&gtm=2wg4l3WJMM825&cd1=3527b4e1-3f46-4152-9ef1-355ede4ee680&cd3=1620102575547.xwfqrkq&cd4=2021-05-04T09%3A59%3A35.547%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=2094409690")
						,
					http("SubsLiveJumpbackIn_13")
						.get(uri12 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=&if=false&ts=1620102575763&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620102574673&coo=false&es=automatic&tm=3&exp=l0&rqm=GET")
						,
					http("SubsLiveJumpbackIn_14")
						.post(uri23 + "/ping")
						.formParam("app_id", "e8mdsr07")
						.formParam("v", "3")
						.formParam("g", "94606507e950ed272f3cd73b1b49b4c9ff610b63")
						.formParam("s", "a41966e1-4597-425b-b844-9a25629f50d1")
						.formParam("r", "")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "48347da6e966a8dd")
						.formParam("internal", "{}")
						.formParam("page_title", "Packt Subscription | Advance your knowledge in tech")
						.formParam("user_active_company_id", "undefined")
						.formParam("user_data", """{"email":"ashishtrivedi@packtpub.com","user_id":"3527b4e1-3f46-4152-9ef1-355ede4ee680","name":"ASHISH TRIVEDI"}""")
						.formParam("source", "apiBoot")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription.packtpub.com/")
						.formParam("anonymous_session", "WXhhRzZsTEphSjNCbWIySGR4blRERFhsYzZKUGgzaHN4eWo0emtpQ0hpNmQ3dnRkTWhuVnE1YyszSkV2TktxWC0tTkdSV0c1SE8wb2NMUU40UDgwZC9CZz09--899a3d51c6150f4b7cf607dc239146f3fbb59f80"),
					http("SubsLiveJumpbackIn_15")
						.get(uri10 + "/products/9781801078863/cover/smaller")
						,
					http("SubsLiveJumpbackIn_16")
						.get(uri10 + "/products/9781801072991/cover/smaller")
						,
					http("SubsLiveJumpbackIn_17")
						.get(uri10 + "/products/9781801076609/cover/smaller")
						,
					http("SubsLiveJumpbackIn_18")
						.get(uri10 + "/products/9781801817004/cover/smaller")
						))
				.pause(2)
		}


	object JUMPBACKIN{
		val jumpbackin=exec(http("SubsLiveJumpbackIn_19")
			.get("/book/data/9781789955248/2")
			.resources(http("SubsLiveJumpbackIn_20")
				.get(uri09 + "?onload=vcRecaptchaApiLoaded&render=explicit"),
				http("SubsLiveJumpbackIn_21")
					.get(uri15 + "?features=default,Array.prototype.findIndex,Array.prototype.find,Array.prototype.includes&flags=gated")
					,
				http("SubsLiveJumpbackIn_22")
					.get(uri28 + "/h?a=34805961&u=4948129760563764&v=7588958490817195&s=7120445548684719&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620101634597&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1620102573582&id0=5246186702945304&t0=click&n0=a&h0=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&y0=%40div%3B%23root%3B%7C%40main%3B.subscription-content-container%3B%5Brole%3Dmain%5D%3B%7C%40section%3B.jumpBackIn-section%3B.row%3B%7C%40div%3B.col-12%3B%7C%40div%3B.slick-initialized%3B.slick-slider%3B%7C%40div%3B.slick-list%3B%7C%40div%3B.slick-track%3B%7C%40div%3B.slick-active%3B.slick-current%3B.slick-slide%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-index%3D0%5D%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B%7C%40div%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B.jumpBackIn-media%3B.media%3B%7C%40div%3B.media-body%3B%7C%40a%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2%5D%3B%7C&ts0=1620102602325&x0=Python%20Data%20Analysis%20-%20Third%20Edition&st=1620102603694")
					,
				http("SubsLiveJumpbackIn_23")
					.get(uri04 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Fbook%252Fdata%252F9781789955248%252F2%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
				http("SubsLiveJumpbackIn_24")
					.get(uri25 + "?sv=7")
					,
				http("SubsLiveJumpbackIn_25")
					.get(uri25 + "?sv=6")
					,
				http("SubsLiveJumpbackIn_26")
					.get(uri10 + "/products/9781789955248/summary")
					,
				http("SubsLiveJumpbackIn_27")
					.get(uri10 + "/products/9781789955248/toc")
					,
				http("SubsLiveJumpbackIn_28")
					.post(uri23 + "/metrics")
					.formParam("app_id", "e8mdsr07")
					.formParam("v", "3")
					.formParam("g", "94606507e950ed272f3cd73b1b49b4c9ff610b63")
					.formParam("s", "a41966e1-4597-425b-b844-9a25629f50d1")
					.formParam("r", "")
					.formParam("platform", "web")
					.formParam("Idempotency-Key", "a3fee83191a9334c")
					.formParam("internal", "")
					.formParam("page_title", "Packt Subscription | Advance your knowledge in tech")
					.formParam("user_active_company_id", "undefined")
					.formParam("metrics", """[{"id":"a3e6ad80-1a3f-4a05-a8a9-0e37a2bb2a01","name":"m4_metric","created_at":1620102583,"metadata":{"user_id":"5d11fb8f1f1c0883492a330a","action":"received","object":"message","place":"messenger","context":"from_launcher_discovery_mode","version":"94606507e950ed272f3cd73b1b49b4c9ff610b63"}}]""")
					.formParam("logs", "[]")
					.formParam("op_metrics", """[{"name":"bailed_ping_request_because_of_invalid_session","type":"inc"}]""")
					.formParam("hc_metrics", "[]")
					.formParam("referer", "https://subscription.packtpub.com/")
					.formParam("anonymous_session", "WXhhRzZsTEphSjNCbWIySGR4blRERFhsYzZKUGgzaHN4eWo0emtpQ0hpNmQ3dnRkTWhuVnE1YyszSkV2TktxWC0tTkdSV0c1SE8wb2NMUU40UDgwZC9CZz09--899a3d51c6150f4b7cf607dc239146f3fbb59f80"),
				http("SubsLiveJumpbackIn_29")
					.options(uri18 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
				http("SubsLiveJumpbackIn_30")
					.get(uri18 + "/products-v1/products/9781789955248/types")
					,
				http("SubsLiveJumpbackIn_31")
					.options(uri11 + "/views/history?limit=6&offset=0")
					,
				http("SubsLiveJumpbackIn_32")
					.options(uri18 + "/lists-v1/users/me/playlists")
					,
				http("SubsLiveJumpbackIn_33")
					.options(uri18 + "/users-v1/users/me/metadata")
					,
				http("SubsLiveJumpbackIn_34")
					.options(uri18 + "/users-v1/users/me")
					,
				http("SubsLiveJumpbackIn_35")
					.get(uri18 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
				http("SubsLiveJumpbackIn_36")
					.post(uri03 + "/j/collect?v=1&_v=j90&a=1748828289&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&dp=%2Fbook%2Fdata%2F9781789955248%2F2&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=538524187&gjid=1315443850&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&_r=1&gtm=2wg4l3WJMM825&cd3=1620102606321.axyarppg&cd4=2021-05-04T10%3A00%3A06.321%2B05%3A30&cd2=1010921333.1617965825&z=1189383010")
					,
				http("SubsLiveJumpbackIn_37")
					.get(uri18 + "/lists-v1/users/me/playlists")
					,
				http("SubsLiveJumpbackIn_38")
					.get(uri28 + "/h?a=34805961&u=4948129760563764&v=5067994669115339&s=7120445548684719&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=2&h=%2Fbook%2Fdata%2F9781789955248%2F2&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620102604974&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620101634597&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620102606359")
					,
				http("SubsLiveJumpbackIn_39")
					.get(uri18 + "/users-v1/users/me")
					,
				http("SubsLiveJumpbackIn_40")
					.get(uri11 + "/views/history?limit=6&offset=0")
					,
				http("SubsLiveJumpbackIn_41")
					.get(uri18 + "/users-v1/users/me/metadata")
					,
				http("SubsLiveJumpbackIn_42")
					.get(uri12 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620102606356&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620102604935&coo=false&exp=l0&rqm=GET")
					,
				http("SubsLiveJumpbackIn_43")
					.get(uri12 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620102606868&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22og%3Adescription%22%3A%22%22%2C%22og%3Aurl%22%3A%22%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620102604935&coo=false&es=automatic&tm=3&exp=l0&rqm=GET")
					,
				http("SubsLiveJumpbackIn_44")
					.get(uri27),
				http("SubsLiveJumpbackIn_45")
					.get(uri10 + "/products/9781838989583/summary")
					,
				http("SubsLiveJumpbackIn_46")
					.get(uri10 + "/countries/countries.json")
					,
				http("SubsLiveJumpbackIn_47")
					.get(uri10 + "/products/9781838821692/summary")
					,
				http("SubsLiveJumpbackIn_48")
					.get(uri10 + "/products/9781800206625/summary")
					,
				http("SubsLiveJumpbackIn_49")
					.post(uri14 + "?t=dc&aip=1&_r=3&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=538524187&gjid=1315443850&_gid=1978334981.1620101588&_u=SCCAAEACQAAAAC~&z=533630885")
					,
				http("SubsLiveJumpbackIn_50")
					.get(uri10 + "/authors/8641")
					,
				http("SubsLiveJumpbackIn_51")
					.get(uri10 + "/authors/27861")
					,
				http("SubsLiveJumpbackIn_52")
					.get(uri10 + "/products/9781800206137/summary")
					,
				http("SubsLiveJumpbackIn_53")
					.get(uri21 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=538524187&_u=SCCAAEACQAAAAC~&z=170964896")
					,
				http("SubsLiveJumpbackIn_54")
					.get(uri10 + "/products/9781838982546/summary")
					,
				http("SubsLiveJumpbackIn_55")
					.get(uri22 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=538524187&_u=SCCAAEACQAAAAC~&z=170964896")
					,
				http("SubsLiveJumpbackIn_56")
					.get(uri10 + "/authors/36086")
					,
				http("SubsLiveJumpbackIn_57")
					.get(uri10 + "/authors/103244")
					,
				http("SubsLiveJumpbackIn_58")
					.options(uri18 + "/users-v1/users/me/products/metadata?isbns=[%229781789955248%22]&detail=full")
					,
				http("SubsLiveJumpbackIn_59")
					.get(uri03 + "/collect?v=1&_v=j90&a=1748828289&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&dp=%2Fbook%2Fdata%2F9781789955248%2F2&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&gtm=2wg4l3WJMM825&cd3=1620102607291.7r6icsd&cd4=2021-05-04T10%3A00%3A07.291%2B05%3A30&cd2=1010921333.1617965825&z=402388743")
					,
				http("SubsLiveJumpbackIn_60")
					.get(uri10 + "/authors/103729")
					,
				http("SubsLiveJumpbackIn_61")
					.get(uri10 + "/authors/102443")
					,
				http("SubsLiveJumpbackIn_62")
					.get(uri10 + "/authors/103545")
					,
				http("SubsLiveJumpbackIn_63")
					.get(uri06 + "/?random=1620102607325&cv=9&fst=1620102607325&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&hn=www.google.com&async=1&rfmt=3&fmt=4"),
				http("SubsLiveJumpbackIn_64")
					.get(uri21 + "/pagead/1p-user-list/945348752/?random=1620102607325&cv=9&fst=1620100800000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=3104443559&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
				http("SubsLiveJumpbackIn_65")
					.get(uri22 + "/pagead/1p-user-list/945348752/?random=1620102607325&cv=9&fst=1620100800000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=3104443559&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
				http("SubsLiveJumpbackIn_66")
					.options(uri18 + "/users-v1/users/me/products/metadata?isbns=[%229781789955248%22,%229781838821692%22,%229781800206137%22,%229781838989583%22,%229781838982546%22,%229781800206625%22]&detail=line")
				,
				http("SubsLiveJumpbackIn_67")
					.get(uri18 + "/users-v1/users/me/products/metadata?isbns=[%229781789955248%22]&detail=full")
					,
				http("SubsLiveJumpbackIn_68")
					.get(uri05 + "?version=3&consumer_key=40249-e88c401e1b1f2242d9e441c4&locale_lang=en-US&region=IN&count=30"),
				http("SubsLiveJumpbackIn_69")
					.options(uri13 + "/subscriptions?active=true")
					,
				http("SubsLiveJumpbackIn_70")
					.options(uri18 + "/credits-v1/users/me/credits/balance")
					,
				http("SubsLiveJumpbackIn_71")
					.get(uri24 + "/"),
				http("SubsLiveJumpbackIn_72")
					.get(uri13 + "/subscriptions?active=true")
					,
				http("SubsLiveJumpbackIn_73")
					.get(uri18 + "/users-v1/users/me/products/metadata?isbns=[%229781789955248%22,%229781838821692%22,%229781800206137%22,%229781838989583%22,%229781838982546%22,%229781800206625%22]&detail=line")
					,
				http("SubsLiveJumpbackIn_74")
					.get("/book/data/9781789955248/%7B%7BmetadataController.imagePath%7D%7D")
					,
				http("SubsLiveJumpbackIn_75")
					.options(uri18 + "/entitlements-v1/users/me/products/9781789955248/entitlement")
					,
				http("SubsLiveJumpbackIn_76")
					.get(uri18 + "/entitlements-v1/users/me/products/9781789955248/entitlement")
					,
				http("SubsLiveJumpbackIn_77")
					.get("/book/data/9781789955248/--metadatacontroller-imagepath")
					,
				http("SubsLiveJumpbackIn_78")
					.options(uri13)
					,
				http("SubsLiveJumpbackIn_79")
					.options(uri18 + "/products-v1/products/9781789955248/2/ch02lvl1sec02")
					,
				http("SubsLiveJumpbackIn_80")
					.get(uri09 + "?onload=vcRecaptchaApiLoaded&render=explicit")
					,
				http("SubsLiveJumpbackIn_81")
					.get(uri08 + "/css?family=Montserrat:500,400|Lato:300,400,500")
					,
				http("SubsLiveJumpbackIn_82")
					.options(uri18 + "/marketing-v1/users/me/interests")
					,
				http("SubsLiveJumpbackIn_83")
					.get(uri07)
					,
				http("SubsLiveJumpbackIn_84")
					.get(uri15 + "?features=default,Array.prototype.findIndex,Array.prototype.find,Array.prototype.includes&flags=gated")
					,
				http("SubsLiveJumpbackIn_85")
					.get(uri13)
					,
				http("SubsLiveJumpbackIn_86")
					.get(uri04 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Fbook%252Fdata%252F9781789955248%252F--metadatacontroller-imagepath%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s")
					,
				http("SubsLiveJumpbackIn_87")
					.get(uri18 + "/products-v1/products/9781789955248/2/ch02lvl1sec02")
					,
				http("SubsLiveJumpbackIn_88")
					.get(uri19 + "?id=GTM-WJMM825")
					,
				http("SubsLiveJumpbackIn_89")
					.get(uri18 + "/marketing-v1/users/me/interests")
					,
				http("SubsLiveJumpbackIn_90")
					.get(uri28 + "/api/identify_v3?a=34805961&u=4948129760563764&v=5067994669115339&s=7120445548684719&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=0&st=1620102612801")
					,
				http("SubsLiveJumpbackIn_91")
					.get(uri03 + "/collect?v=1&_v=j90&a=1748828289&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&dp=%2Fbook%2Fdata%2F9781789955248%2F2&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&gtm=2wg4l3WJMM825&cd1=3527b4e1-3f46-4152-9ef1-355ede4ee680&cd3=1620102612802.p2wb1uv&cd4=2021-05-04T10%3A00%3A12.802%2B05%3A30&cd12=Logged%20in&cd2=1010921333.1617965825&z=209271768")
					,
				http("SubsLiveJumpbackIn_92")
					.get(uri16 + "/ch02lvl1sec02.html?AWSAccessKeyId=ASIAYL73HXT7EHDILSKM&Expires=1620105945&Signature=eLQDnXgPnsI0MPvfWnzrsZQ1A48%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEGwaCWV1LXdlc3QtMSJIMEYCIQCWBEK9RMo%2Bat8297DpGSvq4HcmDGPRFlWBxy4l1rmQ0QIhAO3r5E1EPOx%2FEgCvMPWLDgT4KaqbjprEBmEokRwNglWgKu0BCOX%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQABoMNTc1NTE1NjM5MDM4Igzb4Q%2FabyAQ8VFx8TwqwQGN3dto%2BNy8nse1H6tT1YKxtENtEdUNKVc5G5CE8u68dFtpeTyTUMTnycvwQIcL2QzzYgFXldnjSsQ89%2BR7myVKsnPNxNczr2HwXJTJIzKC09IzQhLY%2B5n3NVuX4k5d6bZjT1EmSMKn33yhtbqVn2ppQfciEvhsagrh%2BamwwF0H%2F0jkZ1nxzRCcNQktVvepiYn0ygKLJQ2QIBs1%2BrpqDx1gjLMXbRaHf5L0KW%2BDW6LnjWM%2FrDMgsfoOe2I7yGI0gOwHMNGEw4QGOt8Bu2urg2HHInvdZnF1uhxV7z7aNPsT1ta1rM88kwxLv6rHaMkFQVmgVZWn8jA%2FTsG4Loxpp2L3w5%2FySbrInqLRH%2F9DBdAu%2FCmxYBMwh1O413fV3zO7HL8z%2BKj%2BLNrsEv9EkGR3Y9bpjOS08P5Wwo%2BNeYFQTjHOt8O8ipfU%2Bkx3yeq3k2V1YNqYeqKnBcefIxxQ3dgjBecWIYHn2dWrBx%2FotpjnecVPfXrdcu92wz0J2T%2FctbXzWCInKUYej%2F%2BRuHiNIP6DF9Q7juKoBbD%2BpuHxx3x7YXEKXf2inNfPueeMLQ%3D%3D")
					,
				http("SubsLiveJumpbackIn_93")
					.get(uri06 + "/?random=1620102612825&cv=9&fst=1620102612825&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&hn=www.google.com&async=1&rfmt=3&fmt=4"),
				http("SubsLiveJumpbackIn_94")
					.get(uri02)
					,
				http("SubsLiveJumpbackIn_95")
					.get(uri21 + "/pagead/1p-user-list/945348752/?random=1620102612825&cv=9&fst=1620100800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=1444000726&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
				http("SubsLiveJumpbackIn_96")
					.options(uri11 + "/products/9781789955248/view-count")
					,
				http("SubsLiveJumpbackIn_97")
					.get(uri22 + "/pagead/1p-user-list/945348752/?random=1620102612825&cv=9&fst=1620100800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781789955248%2F2&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=1444000726&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
				http("SubsLiveJumpbackIn_98")
					.options(uri18 + "/reading-v1/users/me/products/9781789955248/2/undefined/notes/search")
					,
				http("SubsLiveJumpbackIn_99")
					.get(uri18 + "/reading-v1/users/me/products/9781789955248/2/undefined/notes/search")
					,
				http("SubsLiveJumpbackIn_100")
					.options(uri18 + "/products-v1/products/9781789955248/2/ch02lvl1sec03")
					,
				http("SubsLiveJumpbackIn_101")
					.get(uri28 + "/api/identify_v3?a=34805961&u=4948129760563764&v=5067994669115339&s=7120445548684719&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=0&st=1620102612812")
					,
				http("SubsLiveJumpbackIn_102")
					.get(uri18 + "/products-v1/products/9781789955248/2/ch02lvl1sec03")
					,
				http("SubsLiveJumpbackIn_103")
					.get(uri16 + "/ch02lvl1sec03.html?AWSAccessKeyId=ASIAYL73HXT7EV5FIXGL&Expires=1620105948&Signature=uLAly3wBBU6L3m5Wz75%2Fde4Yoms%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEGwaCWV1LXdlc3QtMSJGMEQCICOO%2B0DohVn483p852RshoHTnP4oyvWltXc5mygs%2FFnqAiBASgSxdhEc00Kv458BL3gbLmsocmBkdkEjMVDuZALgYSrtAQjl%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDU3NTUxNTYzOTAzOCIMvG618%2Fs1LST%2BNP8cKsEB0XiONsMABqzRkdqRSOeMz2Q93ZrSPfTTEsaFfVnfcAlmGIw%2F%2BraWCZVDA6TbzaWyhGaolVEJfUFDZKqRbo8XrolnrUAIOUu2oPuG4373CXVcDp64yl8tSvcdt%2FTh7bPvckPZIx4taJIotckOvCXJBx1XhjTbu85ZWfCW0CfZw7dMD1r%2BULQ%2BYeLBHiUKsl4b0LaJ0X%2BOsirSDz0iLyBULHQpvCp65gEU2FwgObkk%2BP%2BNQMWDdUb0Z9dNk5v65KeTzjDmjMOEBjrhAfq9YI4fAc7G1EejeeLnYQcpENhbPfNmNESTURxBOGZnmJnYadUx8f6smaof5POAlUZ9wVeSLYIIQFlGG%2Fa030Dr%2FQs%2BcEGVwwipu5q4ncEW%2FizBQX%2F5dC3z3L8Y2yCangX6TI9SG%2FqdR4z%2BGtx3x22aXNx6wNJVLsFK5%2BXR3OHg9QiLTuoe8PbV8q%2BK8f5JXsYw%2FvfyRSvJWov8TKMxZVl4FyKcJnfEo4hb5R9GusdzD%2Fxinj8THausMNX2MxB08K%2BtEBv80pOVu3ICOMW4tVTukFugLn%2B5RFnbo0EQhUo8eA%3D%3D")
					,
				http("SubsLiveJumpbackIn_104")
					.get(uri10 + "/products/9781789955248/summary")
					,
				http("SubsLiveJumpbackIn_105")
					.get(uri10 + "/products/9781789955248/toc")
					,
				http("SubsLiveJumpbackIn_106")
					.patch(uri11 + "/products/9781789955248/view-count")

					.body(RawFileBody("computerdatabase/subslivejumpbackin/0106_request.json")),
				http("SubsLiveJumpbackIn_107")
					.get(uri10 + "/authors/102836")
					,
				http("SubsLiveJumpbackIn_108")
					.get(uri10 + "/authors/27861")
					,
				http("SubsLiveJumpbackIn_109")
					.get(uri10 + "/authors/8641")
					,
				http("SubsLiveJumpbackIn_110")
					.get(uri18 + "/products-v1/products/9781789955248/types")
					,
				http("SubsLiveJumpbackIn_111")
					.get(uri18 + "/timed-unlock-v0/timed-unlock/current")
				,
				http("SubsLiveJumpbackIn_112")
					.get(uri10 + "/products/9781789955248/cover/smaller")
					,
				http("SubsLiveJumpbackIn_113")
					.get(uri26 + "?v=4.7.0")
					,
				http("SubsLiveJumpbackIn_114")
					.get(uri27)

					.check(status.is(404))))
			.pause(2)
			.exec(http("SubsLiveJumpbackIn_115")
				.get("/")

				.resources(http("SubsLiveJumpbackIn_116")
					.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
					,
					http("SubsLiveJumpbackIn_117")
						.get(uri19 + "?id=GTM-WJMM825")
						,
					http("SubsLiveJumpbackIn_118")
						.get("/css/app.css?id=db6ae105ac48a0097ba5")
						,
					http("SubsLiveJumpbackIn_119")
						.get(uri08 + "/css?family=Montserrat")
						,
					http("SubsLiveJumpbackIn_120")
						.get(uri08 + "/css?family=Nunito")
						,
					http("SubsLiveJumpbackIn_121")
						.get(uri08 + "/css2?family=Roboto+Mono:wght@500&display=swap")
						,
					http("SubsLiveJumpbackIn_122")
						.get("/js/react.js?id=97eefc16b386e857048b")
						,
					http("SubsLiveJumpbackIn_123")
						.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
						,
					http("SubsLiveJumpbackIn_124")
						.get(uri27)
						,
					http("SubsLiveJumpbackIn_125")
						.get(uri10 + "/products/9781800568105/cover/smaller")
						,
					http("SubsLiveJumpbackIn_126")
						.get(uri10 + "/products/9781789955248/cover/smaller")
						,
					http("SubsLiveJumpbackIn_127")
						.get("/images/book.svg")
						,
					http("SubsLiveJumpbackIn_128")
						.get("/images/learning-path.svg")
						,
					http("SubsLiveJumpbackIn_129")
						.get(uri10 + "/products/9781838982881/cover/smaller")
						,
					http("SubsLiveJumpbackIn_130")
						.get(uri10 + "/products/9781801072991/cover/smaller")
						,
					http("SubsLiveJumpbackIn_131")
						.get(uri10 + "/products/9781789801217/cover/smaller")
						,
					http("SubsLiveJumpbackIn_132")
						.get("/images/video.svg")
						,
					http("SubsLiveJumpbackIn_133")
						.get(uri10 + "/products/9781800563452/cover/smaller")
						,
					http("SubsLiveJumpbackIn_134")
						.get(uri10 + "/products/9781839217715/cover/smaller")
						,
					http("SubsLiveJumpbackIn_135")
						.get(uri10 + "/products/9781801078863/cover/smaller")
						,
					http("SubsLiveJumpbackIn_136")
						.get(uri10 + "/products/9781801076944/cover/smaller")
						,
					http("SubsLiveJumpbackIn_137")
						.get(uri10 + "/products/9781801071833/cover/smaller")
						,
					http("SubsLiveJumpbackIn_138")
						.get(uri10 + "/products/9781801076609/cover/smaller")
						,
					http("SubsLiveJumpbackIn_139")
						.get(uri10 + "/products/9781801075107/cover/smaller")
						,
					http("SubsLiveJumpbackIn_140")
						.get(uri10 + "/products/9781838645649/cover/smaller")
						,
					http("SubsLiveJumpbackIn_141")
						.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff?fee66e712a8a08eef5805a46892932ad")
						))
	}


	val scn = scenario("SubsLiveJumpbackIn").exec(LOGINPAGE.loginpage,JUMPBACKIN.jumpbackin)
	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}