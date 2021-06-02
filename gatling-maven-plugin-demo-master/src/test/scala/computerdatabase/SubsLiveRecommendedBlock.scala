package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SubsLiveRecommendedBlock extends Simulation {

	val httpProtocol = http
		.baseUrl("https://subscription.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")



    val uri01 = "https://connect.facebook.net/signals/config/445429252334850"
    val uri02 = "https://d3ginfw2u4xn7p.cloudfront.net/be71e4bab87e4f09bf8ddda732d0fac0/9bdf7d1237b2d40b6eb12bd19144c117.html"
    val uri03 = "https://www.google-analytics.com"
    val uri04 = "https://www.facebook.com/tr"
    val uri05 = "https://service.maxymiser.net/cg/v5"
    val uri06 = "https://getpocket.cdn.mozilla.net/v3/firefox/global-recs"
    val uri07 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri08 = "https://api-iam.intercom.io/messenger/web/ping"
    val uri09 = "https://fonts.googleapis.com"
    val uri10 = "https://www.recaptcha.net/recaptcha/api.js"
    val uri11 = "https://static.packt-cdn.com"
    val uri12 = "https://stats.g.doubleclick.net/j/collect"
    val uri13 = "https://cdn.polyfill.io/v2/polyfill.min.js"
    val uri14 = "https://www2.profitwell.com/dotjs/v1/quests"
    val uri15 = "https://services.packtpub.com"
    val uri16 = "https://www.googletagmanager.com/gtm.js"
    val uri18 = "https://www.google.com"
    val uri19 = "https://www.google.co.in"
    val uri20 = "https://static.hotjar.com/c/hotjar-982604.js"
    val uri21 = "https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/fonts/fontawesome-webfont.woff"
    val uri22 = "https://widget.intercom.io/widget/e8mdsr07"
    val uri23 = "https://heapanalytics.com"


		// Hitting SUBS URL

		object LoginPage{
			val loginpage=exec(http("SubsLiveRecommendedBlock_0")
				.get("/")
				.resources(http("SubsLiveRecommendedBlock_1")
					.get(uri16 + "?id=GTM-WJMM825")
					,
					http("SubsLiveRecommendedBlock_2")
						.get(uri22)
					,
					http("SubsLiveRecommendedBlock_3")
						.get(uri14 + "/customer/?user_email=undefined&custom_styles=%7B%7D")

					//.check(status.is(400))
					,
					http("SubsLiveRecommendedBlock_4")
						.post(uri14 + "/error/")
						.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21059
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21772
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/A.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
						.formParam("user_email", "undefined"),
					http("SubsLiveRecommendedBlock_5")
						.get(uri23 + "/api/identify_v3?a=34805961&u=4948129760563764&v=4546048821295906&s=1999858942548828&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=0&st=1620105286155"),
					http("SubsLiveRecommendedBlock_6")
						.post(uri08)
						.formParam("app_id", "e8mdsr07")
						.formParam("v", "3")
						.formParam("g", "94606507e950ed272f3cd73b1b49b4c9ff610b63")
						.formParam("s", "15fc9a0a-7a7e-4a0b-9934-3013cab175e5")
						.formParam("r", "")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "7d1c2b2c108a23d7")
						.formParam("internal", "{}")
						.formParam("page_title", "Packt Subscription | Advance your knowledge in tech")
						.formParam("user_active_company_id", "undefined")
						.formParam("user_data", """{"email":"ashishtrivedi@packtpub.com","user_id":"3527b4e1-3f46-4152-9ef1-355ede4ee680","name":"ASHISH TRIVEDI"}""")
						.formParam("source", "apiBoot")
						.formParam("sampling", "true")
						.formParam("referer", "https://subscription.packtpub.com/")
						.formParam("anonymous_session", "aFphTEJSWC9pV1hxRDkyazBTbHkxQ0lkNEFNVHBmWTJDY0IzTy81aVMyQWI0UmYzRTB3U3k0T0MwYkNxc0VObC0tTkhFWGFzSE5RbndIZlBCekEvY1hvQT09--bf9f67f60fb3d2a1e1fc3b38b57b1f64e86694e2"),
					http("SubsLiveRecommendedBlock_7")
						.get(uri20 + "?sv=7")
					,
					http("SubsLiveRecommendedBlock_8")
						.get(uri03 + "/gtm/js?id=GTM-MSRQZ29&t=gtm13&cid=1010921333.1617965825")
					,
					http("SubsLiveRecommendedBlock_9")
						.post(uri03 + "/j/collect?v=1&_v=j90&a=1795179076&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQAAAAC~&jid=406668745&gjid=1644425919&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&_r=1&gtm=2wg4l3WJMM825&cd1=3527b4e1-3f46-4152-9ef1-355ede4ee680&cd3=1620105288328.bq46l5nmg&cd4=2021-05-04T10%3A44%3A48.328%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=741322750")
					,
					http("SubsLiveRecommendedBlock_10")
						.get(uri01 + "?v=2.9.39&r=stable")
					,
					http("SubsLiveRecommendedBlock_11")
						.get(uri23 + "/h?a=34805961&u=4948129760563764&v=4546048821295906&s=1999858942548828&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=2&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&ts=1620105286154&sp=z&sp=1&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620105181688&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&sp=t&sp=Getting%20Started%20with%20Python%20Libraries%20-%20Python%20Data%20Analysis%20-%20Third%20Edition&st=1620105288339"),
					http("SubsLiveRecommendedBlock_12")
						.get("/api/subscription/home")
					,
					http("SubsLiveRecommendedBlock_13")
						.post(uri12 + "?t=dc&aip=1&_r=3&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=406668745&gjid=1644425919&_gid=1978334981.1620101588&_u=SCCAAEACQAAAAC~&z=1563874302")
					,
					http("SubsLiveRecommendedBlock_14")
						.get(uri18 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=406668745&_u=SCCAAEACQAAAAC~&z=1547705357"),
					http("SubsLiveRecommendedBlock_15")
						.get(uri19 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=406668745&_u=SCCAAEACQAAAAC~&z=1547705357"),
					http("SubsLiveRecommendedBlock_16")
						.get(uri23 + "/h?a=34805961&u=4948129760563764&v=3883906884217000&s=1999858942548828&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=1&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620105181688&d=subscription.packtpub.com&h=%2F&t=Getting%20Started%20with%20Python%20Libraries%20-%20Python%20Data%20Analysis%20-%20Third%20Edition&st=1620105286146"),
					http("SubsLiveRecommendedBlock_17")
						.get(uri11 + "/products/9781801076609/cover/smaller")
					,
					http("SubsLiveRecommendedBlock_18")
						.get(uri11 + "/products/9781801076944/cover/smaller")
					,
					http("SubsLiveRecommendedBlock_19")
						.get(uri11 + "/products/9781801817004/cover/smaller")
					,
					http("SubsLiveRecommendedBlock_20")
						.get(uri11 + "/products/9781801072991/cover/smaller")
					,
					http("SubsLiveRecommendedBlock_21")
						.get(uri11 + "/products/9781801078863/cover/smaller")
					,
					http("SubsLiveRecommendedBlock_22")
						.get(uri04 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=&if=false&ts=1620105289181&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620105287987&coo=false&es=automatic&tm=3&exp=l1&rqm=GET"),
					http("SubsLiveRecommendedBlock_23")
						.get(uri04 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=&if=false&ts=1620105288673&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620105287987&coo=false&exp=l1&rqm=GET")))
				.pause(2)
		}


		// RECOMMENDED BLOCK

	object RecommendedBlock{
		val rblock=exec(http("SubsLiveRecommendedBlock_24")
			.get("/book/mobile/9781800568105")
			.resources(http("SubsLiveRecommendedBlock_25")
				.get(uri10 + "?onload=vcRecaptchaApiLoaded&render=explicit")
				,
				http("SubsLiveRecommendedBlock_26")
					.get(uri05 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Fbook%252Fmobile%252F9781800568105%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04")
				,
				http("SubsLiveRecommendedBlock_27")
					.options(uri15 + "/users-v1/users/me")
				,
				http("SubsLiveRecommendedBlock_28")
					.options(uri15 + "/users-v1/users/me/metadata")
				,
				http("SubsLiveRecommendedBlock_29")
					.options(uri15 + "/b2b-accounts-v1/users/me/roles-and-subjects")
				,
				http("SubsLiveRecommendedBlock_30")
					.get(uri23 + "/h?a=34805961&u=4948129760563764&v=4546048821295906&s=1999858942548828&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620105181688&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1620105286154&id0=5031413383035128&t0=click&n0=div&c0=media-body&y0=%40div%3B%23root%3B%7C%40main%3B.subscription-content-container%3B%5Brole%3Dmain%5D%3B%7C%40section%3B.recommendTitles-section%3B.row%3B%7C%40div%3B.col-12%3B%7C%40div%3B.slick-initialized%3B.slick-slider%3B%7C%40div%3B.slick-list%3B%7C%40div%3B.slick-track%3B%7C%40div%3B.slick-active%3B.slick-current%3B.slick-slide%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-index%3D0%5D%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B%7C%40div%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B.media%3B.recommendTitles-media%3B%7C%40div%3B.media-body%3B%7C&ts0=1620105306319&x0=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20F...%0AMark%20&st=1620105308658"),
				http("SubsLiveRecommendedBlock_31")
					.options(uri15 + "/lists-v1/users/me/playlists")
				,
				http("SubsLiveRecommendedBlock_32")
					.get(uri15 + "/products-v1/products/9781800568105/types")
				,
				http("SubsLiveRecommendedBlock_33")
					.get(uri11 + "/products/9781800568105/summary")
				,
				http("SubsLiveRecommendedBlock_34")
					.get(uri15 + "/users-v1/users/me")
				,
				http("SubsLiveRecommendedBlock_35")
					.get(uri15 + "/lists-v1/users/me/playlists")
				,
				http("SubsLiveRecommendedBlock_36")
					.get(uri15 + "/b2b-accounts-v1/users/me/roles-and-subjects")
				,
				http("SubsLiveRecommendedBlock_37")
					.get(uri15 + "/users-v1/users/me/metadata")
				,
				http("SubsLiveRecommendedBlock_38")
					.get(uri06 + "?version=3&consumer_key=40249-e88c401e1b1f2242d9e441c4&locale_lang=en-US&region=IN&count=30")
				,
				http("SubsLiveRecommendedBlock_39")
					.get(uri20 + "?sv=6")
				,
				http("SubsLiveRecommendedBlock_40")
					.get("/book/mobile/%7B%7BmetadataController.imagePath%7D%7D")
				,
				http("SubsLiveRecommendedBlock_41")
					.get(uri04 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620105310353&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620105309936&coo=false&exp=l1&rqm=GET"),
				http("SubsLiveRecommendedBlock_42")
					.get(uri03 + "/collect?v=1&_v=j90&a=383028698&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&dp=%2Fbook%2Fmobile%2F9781800568105&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&gtm=2wg4l3WJMM825&cd3=1620105310327.5rpdwzn&cd4=2021-05-04T10%3A45%3A10.327%2B05%3A30&cd2=1010921333.1617965825&z=1047376163"),
				http("SubsLiveRecommendedBlock_43")
					.get(uri04 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620105310868&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22og%3Adescription%22%3A%22%22%2C%22og%3Aurl%22%3A%22%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620105309936&coo=false&es=automatic&tm=3&exp=l1&rqm=GET"),
				http("SubsLiveRecommendedBlock_44")
					.get("/book/mobile/--metadatacontroller-imagepath")
				,
				http("SubsLiveRecommendedBlock_45")
					.get(uri13 + "?features=default,Array.prototype.findIndex,Array.prototype.find,Array.prototype.includes&flags=gated")
				,
				http("SubsLiveRecommendedBlock_46")
					.get(uri09 + "/css?family=Montserrat:500,400|Lato:300,400,500")
				,
				http("SubsLiveRecommendedBlock_47")
					.get(uri11 + "/authors/101423")
				,
				http("SubsLiveRecommendedBlock_48")
					.get(uri10 + "?onload=vcRecaptchaApiLoaded&render=explicit")
				,
				http("SubsLiveRecommendedBlock_49")
					.get(uri20 + "?sv=7")
				,
				http("SubsLiveRecommendedBlock_50")
					.get(uri16 + "?id=GTM-WJMM825")
				,
				http("SubsLiveRecommendedBlock_51")
					.get(uri22)
				,
				http("SubsLiveRecommendedBlock_52")
					.get(uri05 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Fbook%252Fmobile%252F--metadatacontroller-imagepath%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s")
				,
				http("SubsLiveRecommendedBlock_53")
					.get(uri11 + "/products/9781800568105/toc")
				,
				http("SubsLiveRecommendedBlock_54")
					.get(uri07 + "/?random=1620105312701&cv=9&fst=1620105312701&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&hn=www.google.com&async=1&rfmt=3&fmt=4")
				,
				http("SubsLiveRecommendedBlock_55")
					.get(uri18 + "/pagead/1p-user-list/945348752/?random=1620105312701&cv=9&fst=1620104400000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=377837873&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y"),
				http("SubsLiveRecommendedBlock_56")
					.get(uri19 + "/pagead/1p-user-list/945348752/?random=1620105312701&cv=9&fst=1620104400000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=377837873&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y"),
				http("SubsLiveRecommendedBlock_57")
					.options(uri15 + "/users-v1/users/me/products/metadata?isbns=[%229781800568105%22]&detail=full")
				,
				http("SubsLiveRecommendedBlock_58")
					.get(uri15 + "/timed-unlock-v0/timed-unlock/current")

				//.check(status.is(404))
				,
				http("SubsLiveRecommendedBlock_59")
					.get(uri11 + "/products/--metadatacontroller-imagepath/summary")

				//.check(status.is(403))
				,
				http("SubsLiveRecommendedBlock_60")
					.get(uri15 + "/products-v1/products/--metadatacontroller-imagepath/types")

				//.check(status.is(404))
				,
				http("SubsLiveRecommendedBlock_61")
					.get(uri15 + "/users-v1/users/me/products/metadata?isbns=[%229781800568105%22]&detail=full")
				,
				http("SubsLiveRecommendedBlock_62")
					.get(uri11 + "/books-and-videos-content/books-and-videos.json")
				,
				http("SubsLiveRecommendedBlock_63")
					.get(uri11 + "/products/9781788478120/summary")
				,
				http("SubsLiveRecommendedBlock_64")
					.get(uri11 + "/products/9781788295864/summary")
				,
				http("SubsLiveRecommendedBlock_65")
					.get(uri11 + "/products/9781789955750/summary")
				,
				http("SubsLiveRecommendedBlock_66")
					.get(uri11 + "/products/9781789954531/summary")
				,
				http("SubsLiveRecommendedBlock_67")
					.get(uri11 + "/products/9781789530179/summary")
				,
				http("SubsLiveRecommendedBlock_68")
					.get(uri11 + "/products/9781838559335/summary")
				,
				http("SubsLiveRecommendedBlock_69")
					.get(uri11 + "/products/9781788839525/summary")
				,
				http("SubsLiveRecommendedBlock_70")
					.get(uri11 + "/products/9781838552657/summary")
				,
				http("SubsLiveRecommendedBlock_71")
					.get(uri11 + "/products/9781838824044/summary")
				,
				http("SubsLiveRecommendedBlock_72")
					.get(uri11 + "/products/9781789130935/summary")
				,
				http("SubsLiveRecommendedBlock_73")
					.get(uri11 + "/products/9781838980924/summary")
				,
				http("SubsLiveRecommendedBlock_74")
					.get(uri21 + "?v=4.7.0")
				,
				http("SubsLiveRecommendedBlock_75")
					.options(uri15 + "/credits-v1/users/me/credits/balance")
				,
				http("SubsLiveRecommendedBlock_76")
					.get(uri11 + "/products/9781800200944/summary")
				,
				http("SubsLiveRecommendedBlock_77")
					.options(uri15 + "/entitlements-v1/users/me/products/9781800568105/entitlement")
				,
				http("SubsLiveRecommendedBlock_78")
					.get(uri11 + "/products/9781789958034/summary")
				,
				http("SubsLiveRecommendedBlock_79")
					.get(uri11 + "/products/9781839215414/summary")
				,
				http("SubsLiveRecommendedBlock_80")
					.get(uri11 + "/products/9781839215421/summary")
				,
				http("SubsLiveRecommendedBlock_81")
					.get(uri11 + "/products/9781788996662/summary")
				,
				http("SubsLiveRecommendedBlock_82")
					.get("/")
				,
				http("SubsLiveRecommendedBlock_83")
					.get(uri11 + "/authors/33117")
				,
				http("SubsLiveRecommendedBlock_84")
					.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
				,
				http("SubsLiveRecommendedBlock_85")
					.get(uri15 + "/entitlements-v1/users/me/products/9781800568105/entitlement")
				,
				http("SubsLiveRecommendedBlock_86")
					.get(uri15 + "/credits-v1/users/me/credits/balance")

				//.check(status.is(404))
				,
				http("SubsLiveRecommendedBlock_87")
					.get(uri16 + "?id=GTM-WJMM825")
				,
				http("SubsLiveRecommendedBlock_88")
					.get("/css/app.css?id=db6ae105ac48a0097ba5")
				,
				http("SubsLiveRecommendedBlock_89")
					.get(uri09 + "/css?family=Montserrat")
				,
				http("SubsLiveRecommendedBlock_90")
					.get(uri15 + "/products-v1/products/9781800568105/recommendations")

				//.check(status.is(404))
				,
				http("SubsLiveRecommendedBlock_91")
					.get(uri23 + "/api/identify_v3?a=34805961&u=4948129760563764&v=6777482395441622&s=1999858942548828&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=0&st=1620105316064"),
				http("SubsLiveRecommendedBlock_92")
					.get(uri02)
				,
				http("SubsLiveRecommendedBlock_93")
					.get(uri23 + "/api/identify_v3?a=34805961&u=4948129760563764&v=6777482395441622&s=1999858942548828&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=0&st=1620105316084"),
				http("SubsLiveRecommendedBlock_94")
					.get("/js/react.js?id=97eefc16b386e857048b")
				,
				http("SubsLiveRecommendedBlock_95")
					.get(uri09 + "/css?family=Nunito")
				,
				http("SubsLiveRecommendedBlock_96")
					.get(uri09 + "/css2?family=Roboto+Mono:wght@500&display=swap")
				,
				http("SubsLiveRecommendedBlock_97")
					.get(uri03 + "/collect?v=1&_v=j90&a=383028698&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&dp=%2Fbook%2Fmobile%2F9781800568105&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&gtm=2wg4l3WJMM825&cd1=3527b4e1-3f46-4152-9ef1-355ede4ee680&cd3=1620105316065.cu459kwa&cd4=2021-05-04T10%3A45%3A16.65%2B05%3A30&cd12=Logged%20in&cd2=1010921333.1617965825&z=1455185079"),
				http("SubsLiveRecommendedBlock_98")
					.get(uri07 + "/?random=1620105316122&cv=9&fst=1620105316122&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20Fifth%20Edition&hn=www.google.com&async=1&rfmt=3&fmt=4")
				,
				http("SubsLiveRecommendedBlock_99")
					.get(uri18 + "/pagead/1p-user-list/945348752/?random=1620105316122&cv=9&fst=1620104400000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20Fifth%20Edition&async=1&fmt=3&is_vtc=1&random=2119233397&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y"),
				http("SubsLiveRecommendedBlock_100")
					.get(uri19 + "/pagead/1p-user-list/945348752/?random=1620105316122&cv=9&fst=1620104400000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20Fifth%20Edition&async=1&fmt=3&is_vtc=1&random=2119233397&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y"),
				http("SubsLiveRecommendedBlock_101")
					.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
				,
				http("SubsLiveRecommendedBlock_102")
					.get(uri22)
				,
				http("SubsLiveRecommendedBlock_103")
					.get("/api/subscription/home")
				,
				http("SubsLiveRecommendedBlock_104")
					.get("/images/video.svg")
				,
				http("SubsLiveRecommendedBlock_105")
					.get("/images/book.svg")
				,
				http("SubsLiveRecommendedBlock_106")
					.get("/images/learning-path.svg")
				,
				http("SubsLiveRecommendedBlock_107")
					.get(uri11 + "/products/9781789955248/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_108")
					.get(uri11 + "/products/9781801078863/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_109")
					.get(uri11 + "/products/9781800568105/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_110")
					.get(uri11 + "/products/9781838982881/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_111")
					.get(uri11 + "/products/9781839217715/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_112")
					.get(uri11 + "/products/9781801071833/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_113")
					.get(uri11 + "/products/9781800563452/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_114")
					.get(uri11 + "/products/9781801817004/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_115")
					.get(uri11 + "/products/9781801076944/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_116")
					.get(uri11 + "/products/9781801076609/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_117")
					.get(uri11 + "/products/9781789801217/cover/smaller")
				,
				http("SubsLiveRecommendedBlock_118")
					.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff?fee66e712a8a08eef5805a46892932ad")
			))
	}


	val AnyUser = scenario("SubsLiveRecommendedBlock").exec(LoginPage.loginpage,RecommendedBlock.rblock)

	setUp(AnyUser.inject(nothingFor(5),
		atOnceUsers(users =1),
		rampUsers(users = 5)during(10),
		constantUsersPerSec(rate = 20) during(20)
	))
		.protocols(httpProtocol)
}