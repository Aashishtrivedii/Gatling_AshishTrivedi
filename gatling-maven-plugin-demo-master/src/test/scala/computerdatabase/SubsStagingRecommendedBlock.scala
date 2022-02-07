package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SubsStagingRecommendedBlock extends Simulation {

	//val duration = Duration(1, MINUTES)

	val httpProtocol = http
		.baseUrl("https://subscription-staging.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")



    val uri01 = "https://www.google-analytics.com"
    val uri02 = "https://www.facebook.com/tr"
    val uri03 = "https://users-packtlib-api-staging.packtpub.com/v2/users/me/views/history"
    val uri04 = "https://www2.profitwell.com/dotjs/v1/quests"
    val uri05 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri06 = "https://api-iam.intercom.io/messenger/web"
    val uri07 = "https://services-staging.packtpub.com"
    val uri08 = "https://static.hotjar.com/c/hotjar-982604.js"
    val uri10 = "https://service.maxymiser.net/cg/v5"
    val uri11 = "https://subscriptions-api-staging.packtpub.com/v1/users/me"
    val uri12 = "https://www.google.com"
    val uri13 = "https://static-staging.packt-cdn.com/products/9781839217289/cover/smaller"
    val uri14 = "https://www.google.co.in"
    val uri15 = "https://widget.intercom.io/widget/lts26lhx"
    val uri16 = "https://heapanalytics.com"


		// LOGIN
   object LogIn {
			val login = exec(http("SubsStagingRecommendedBlock_LOGIN")
				.options(uri07 + "/auth-v1/users/tokens")

				.resources(http("SubsStagingRecommendedBlock_1")
					.post(uri02 + "/")

					.body(RawFileBody("computerdatabase/subsstagingrecommendedblock/0001_request.dat")),
					http("SubsStagingRecommendedBlock_2")
						.post(uri07 + "/auth-v1/users/tokens")

						.body(RawFileBody("computerdatabase/subsstagingrecommendedblock/0002_request.json")),
					http("SubsStagingRecommendedBlock_3")
						.options(uri07 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
					http("SubsStagingRecommendedBlock_4")
						.options(uri07 + "/skills-v1/users/me/learning-paths")
					,
					http("SubsStagingRecommendedBlock_5")
						.options(uri03 + "?limit=4&offset=0")
					,
					http("SubsStagingRecommendedBlock_6")
						.get(uri07 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
					http("SubsStagingRecommendedBlock_7")
						.get(uri16 + "/h?a=3992788168&u=558546027102160&v=223891364717163&s=137206076193087&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&ts=1618825094460&pr=%2Flogin&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618824554304&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Flogin&st=1618825094460")
					,
					http("SubsStagingRecommendedBlock_8")
						.get(uri03 + "?limit=4&offset=0")
					,
					http("SubsStagingRecommendedBlock_9")
						.options(uri11 + "/subscriptions?active=false")
					,
					http("SubsStagingRecommendedBlock_10")
						.options(uri07 + "/users-v1/users/me/products/metadata?isbns=[%229781788996662%22,%229781789955750%22,%229781838826864%22,%229781789952698%22]&detail=line")
					,
					http("SubsStagingRecommendedBlock_11")
						.get(uri11 + "/subscriptions?active=false")
					,
					http("SubsStagingRecommendedBlock_12")
						.options(uri11 + "/payment-methods?default=true")
					,
					http("SubsStagingRecommendedBlock_13")
						.get(uri07 + "/skills-v1/users/me/learning-paths")

						.check(status.is(404)),
					http("SubsStagingRecommendedBlock_14")
						.get("/")
					,
					http("SubsStagingRecommendedBlock_15")
						.get(uri15),
					http("SubsStagingRecommendedBlock_16")
						.get(uri08 + "?sv=7")
					,
					http("SubsStagingRecommendedBlock_17")
						.options(uri04 + "/customer/?user_email=undefined&custom_styles=%7B%7D")
					,
					http("SubsStagingRecommendedBlock_18")
						.get("/api/users/me/subscriptions")
					,
					http("SubsStagingRecommendedBlock_19")
						.get(uri04 + "/customer/?user_email=undefined&custom_styles=%7B%7D")

						.check(status.is(400)),
					http("SubsStagingRecommendedBlock_20")
						.post(uri04 + "/error/")

						.formParam("error",
							"""e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21059
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21772
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/A.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
						.formParam("user_email", "undefined"),
					http("SubsStagingRecommendedBlock_21")
						.get(uri16 + "/h?a=34805961&u=287607950759695&v=3241950374490130&s=4060620765362728&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1618825099290&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618824511168&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&st=1618825100337")
					,
					http("SubsStagingRecommendedBlock_22")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618825100316&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1618825099931&coo=false&rqm=GET")
					,
					http("SubsStagingRecommendedBlock_23")
						.get(uri01 + "/collect?v=1&_v=j89&a=1091822408&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1579481446.1618805784&gtm=2wg472WJMM825&cd1=d12c50a2-843a-43de-96ba-360e39c985a4&cd3=1618825100319.ckekfv6&cd4=2021-04-19T15%3A08%3A20.320%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=49927477")
					,
					http("SubsStagingRecommendedBlock_24")
						.get(uri02 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618825100829&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1618825099931&coo=false&es=automatic&tm=3&rqm=GET")
					,
					http("SubsStagingRecommendedBlock_25")
						.post(uri06 + "/ping")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "285db0fe1b79fda1cb1f8f75e61fb0419b4ddce3")
						.formParam("s", "fd7cfed3-9187-4e0e-943e-dea95319e794")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "ad28066f47648261")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","name":"test JumpInJhapaak"}""")
						.formParam("internal", "{}")
						.formParam("page_title", "Packt Subscription | Advance your knowledge in tech")
						.formParam("user_active_company_id", "undefined")
						.formParam("source", "apiBoot")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription-staging.packtpub.com/")
						.formParam("anonymous_session", "K3A0NVJVQjQxMkRWcjh3akVodElSQW1PcDVWcFg1UDUrSm5vYlNxVHRsSDM4VHJ5d2QxYThlNnRKamcrTFErYy0tMDVndDdhRVhoZEhYVFFmN0l4YXpSZz09--3fc903e3e6dd7862b387ff1906d5e56d18c99e23"),
					http("SubsStagingRecommendedBlock_26")
						.get("/api/subscription/home")
					,
					http("SubsStagingRecommendedBlock_27")
						.get(uri13)

						.check(status.is(403))))

		}

		// RECOMMENDEDBLOCK
	object RecommendedBlock {
			val recommendedblock=exec(http("SubsStagingRecommendedBlock_RECOMMENDEDBLOCK")
				.get("/book/mobile/9781800568105")

				.resources(http("SubsStagingRecommendedBlock_29")
					.get(uri10 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription-staging.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription-staging.packtpub.com%252Fbook%252Fmobile%252F9781800568105%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("SubsStagingRecommendedBlock_30")
						.get(uri16 + "/h?a=34805961&u=287607950759695&v=3241950374490130&s=4060620765362728&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618824511168&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1618825099290&pp=pr&pp=%2F&id0=7305291345510608&t0=click&n0=a&h0=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&y0=%40div%3B%23root%3B%7C%40main%3B.subscription-content-container%3B%5Brole%3Dmain%5D%3B%7C%40section%3B.recommendTitles-section%3B.row%3B%7C%40div%3B.col-12%3B%7C%40div%3B.slick-initialized%3B.slick-slider%3B%7C%40div%3B.slick-list%3B%7C%40div%3B.slick-track%3B%7C%40div%3B.slick-active%3B.slick-current%3B.slick-slide%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-index%3D0%5D%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B%7C%40div%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B.media%3B.recommendTitles-media%3B%7C%40div%3B.media-body%3B%7C%40a%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105%5D%3B%7C&ts0=1618825122631&x0=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20F...&st=1618825123974")
					,
					http("SubsStagingRecommendedBlock_31")
						.get(uri08 + "?sv=7")
					,
					http("SubsStagingRecommendedBlock_32")
						.get(uri08 + "?sv=6")
					,
					http("SubsStagingRecommendedBlock_33")
						.options(uri03 + "?limit=6&offset=0")
					,
					http("SubsStagingRecommendedBlock_34")
						.options(uri07 + "/users-v1/users/me")
					,
					http("SubsStagingRecommendedBlock_35")
						.get(uri16 + "/h?a=3992788168&u=558546027102160&v=6694406523599211&s=137206076193087&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fbook%2Fmobile%2F9781800568105&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1618825124751&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618824554304&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Flogin&st=1618825124753")
					,
					http("SubsStagingRecommendedBlock_36")
						.options(uri07 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
					http("SubsStagingRecommendedBlock_37")
						.options(uri07 + "/lists-v1/users/me/playlists")
					,
					http("SubsStagingRecommendedBlock_38")
						.options(uri07 + "/users-v1/users/me/metadata")
					,
					http("SubsStagingRecommendedBlock_39")
						.options(uri07 + "/users-v1/users/me/products/metadata?isbns=[%229781800568105%22]&detail=full")
					,
					http("SubsStagingRecommendedBlock_40")
						.get(uri07 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
					http("SubsStagingRecommendedBlock_41")
						.get(uri03 + "?limit=6&offset=0")
					,
					http("SubsStagingRecommendedBlock_42")
						.post(uri01 + "/j/collect?v=1&_v=j89&a=1682668369&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&dp=%2Fbook%2Fmobile%2F9781800568105&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=989786146&gjid=398131436&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1579481446.1618805784&_r=1&gtm=2wg472WJMM825&cd3=1618825125711.u9dqkmm&cd4=2021-04-19T15%3A08%3A45.711%2B05%3A30&cd2=1010921333.1617965825&z=1304689532")
					,
					http("SubsStagingRecommendedBlock_43")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618825125701&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1618825124717&coo=false&rqm=GET")
					,
					http("SubsStagingRecommendedBlock_44")
						.get(uri02 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618825126208&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22og%3Adescription%22%3A%22%22%2C%22og%3Aurl%22%3A%22%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd2aov160eccqlv.cloudfront.net%2F7d2e437f5ad848f68a441c36c5dee466%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd2aov160eccqlv.cloudfront.net%2F7d2e437f5ad848f68a441c36c5dee466%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1618825124717&coo=false&es=automatic&tm=3&rqm=GET")
					,
					http("SubsStagingRecommendedBlock_45")
						.get(uri15),
					http("SubsStagingRecommendedBlock_46")
						.get(uri12 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=989786146&_u=SCCAAEACQAAAAC~&z=1725838443")
					,
					http("SubsStagingRecommendedBlock_47")
						.get(uri14 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=989786146&_u=SCCAAEACQAAAAC~&z=1725838443")
					,
					http("SubsStagingRecommendedBlock_48")
						.get(uri07 + "/users-v1/users/me")
					,
					http("SubsStagingRecommendedBlock_49")
						.options(uri07 + "/users-v1/users/me/products/metadata?isbns=[%229781788996662%22,%229781789955750%22,%229781838826864%22,%229781789952698%22,%229781800568105%22,%229781788998437%22]&detail=line")
					,
					http("SubsStagingRecommendedBlock_50")
						.get(uri07 + "/lists-v1/users/me/playlists")
					,
					http("SubsStagingRecommendedBlock_51")
						.get(uri01 + "/collect?v=1&_v=j89&a=1682668369&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&dp=%2Fbook%2Fmobile%2F9781800568105&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1579481446.1618805784&gtm=2wg472WJMM825&cd3=1618825126755.7haqs2q&cd4=2021-04-19T15%3A08%3A46.755%2B05%3A30&cd2=1010921333.1617965825&z=1113123398")
					,
					http("SubsStagingRecommendedBlock_52")
						.get(uri05 + "/?random=1618825126779&cv=9&fst=1618825126779&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=376635470%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("SubsStagingRecommendedBlock_53")
						.get(uri12 + "/pagead/1p-user-list/945348752/?random=1618825126779&cv=9&fst=1618822800000&num=1&guid=ON&eid=376635470%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=968071791&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
					http("SubsStagingRecommendedBlock_54")
						.get(uri14 + "/pagead/1p-user-list/945348752/?random=1618825126779&cv=9&fst=1618822800000&num=1&guid=ON&eid=376635470%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=968071791&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
					http("SubsStagingRecommendedBlock_55")
						.get(uri07 + "/users-v1/users/me/products/metadata?isbns=[%229781788996662%22,%229781789955750%22,%229781838826864%22,%229781789952698%22,%229781800568105%22,%229781788998437%22]&detail=line")
					,
					http("SubsStagingRecommendedBlock_56")
						.get(uri07 + "/users-v1/users/me/products/metadata?isbns=[%229781800568105%22]&detail=full")
					,
					http("SubsStagingRecommendedBlock_57")
						.options(uri07 + "/credits-v1/users/me/credits/balance")
					,
					http("SubsStagingRecommendedBlock_58")
						.get(uri07 + "/users-v1/users/me/metadata")
					,
					http("SubsStagingRecommendedBlock_59")
						.get(uri07 + "/credits-v1/users/me/credits/balance")
					,
					http("SubsStagingRecommendedBlock_60")
						.options(uri11 + "/subscriptions?active=true")
					,
					http("SubsStagingRecommendedBlock_61")
						.get(uri11 + "/subscriptions?active=true")
					,
					http("SubsStagingRecommendedBlock_62")
						.options(uri07 + "/entitlements-v1/users/me/products/9781800568105/entitlement")
					,
					http("SubsStagingRecommendedBlock_63")
						.get(uri07 + "/entitlements-v1/users/me/products/9781800568105/entitlement")
					,
					http("SubsStagingRecommendedBlock_64")
						.options(uri11)
					,
					http("SubsStagingRecommendedBlock_65")
						.options(uri07 + "/marketing-v1/users/me/interests")
					,
					http("SubsStagingRecommendedBlock_66")
						.get(uri11)
					,
					http("SubsStagingRecommendedBlock_67")
						.get(uri07 + "/products-v1/products/9781800568105/recommendations")
						.check(status.is(404)),
					http("SubsStagingRecommendedBlock_68")
						.get(uri07 + "/marketing-v1/users/me/interests")
					,
					http("SubsStagingRecommendedBlock_69")
						.get(uri16 + "/api/identify_v3?a=3992788168&u=558546027102160&v=6694406523599211&s=137206076193087&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1618825139607")
					,
					http("SubsStagingRecommendedBlock_70")
						.get(uri01 + "/collect?v=1&_v=j89&a=1682668369&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&dp=%2Fbook%2Fmobile%2F9781800568105&ul=en-us&de=UTF-8&dt=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20Fifth%20Edition&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1579481446.1618805784&gtm=2wg472WJMM825&cd1=d12c50a2-843a-43de-96ba-360e39c985a4&cd3=1618825139609.13xgi7wo&cd4=2021-04-19T15%3A08%3A59.609%2B05%3A30&cd12=Logged%20in&cd2=1010921333.1617965825&z=345357261")
					,
					http("SubsStagingRecommendedBlock_71")
						.get(uri05 + "/?random=1618825139647&cv=9&fst=1618825139647&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20Fifth%20Edition&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("SubsStagingRecommendedBlock_72")
						.get(uri12 + "/pagead/1p-user-list/945348752/?random=1618825139647&cv=9&fst=1618822800000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20Fifth%20Edition&async=1&fmt=3&is_vtc=1&random=2070020189&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
					http("SubsStagingRecommendedBlock_73")
						.get(uri14 + "/pagead/1p-user-list/945348752/?random=1618825139647&cv=9&fst=1618822800000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fmobile%2F9781800568105&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=C%23%209%20and%20.NET%205%20%E2%80%93%20Modern%20Cross-Platform%20Development%20-%20Fifth%20Edition&async=1&fmt=3&is_vtc=1&random=2070020189&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
					http("SubsStagingRecommendedBlock_74")
						.post(uri06 + "/ping")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "285db0fe1b79fda1cb1f8f75e61fb0419b4ddce3")
						.formParam("s", "dd7a5d76-57f4-4279-bfd2-60ffbbc2c2eb")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "2182c6de4c4d10db")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","last_playlist_created_name":"testash","last_playlist_created_id":"0e5f519b-40ba-42fe-aedd-2f9e01daa4cb","last_playlist_create_date_at":1617259470.961,"last_playlist_added_to_name":"testash","last_playlist_added_to_id":"0e5f519b-40ba-42fe-aedd-2f9e01daa4cb","last_playlist_added_to_date_at":1618825127.532,"name":"test JumpInJhapaak"}""")
						.formParam("internal", "{}")
						.formParam("page_title", "C# 9 and .NET 5 – Modern Cross-Platform Development - Fifth Edition")
						.formParam("user_active_company_id", "undefined")
						.formParam("source", "apiBoot")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription-staging.packtpub.com/book/mobile/9781800568105")
						.formParam("anonymous_session", "eVhvdkx2cWx6dGhGUEVzNUtCamdWQnhxdXMyTDRCUXVSOEVWdkMrVCsxMHo2K1JLME9xSnZCUkd1OE5td0N5Ty0teCs3UW83WmczeEdISStGdjcycUNBUT09--89a4e2f3852a8106a171265097c909bbe6280f41"),
					http("SubsStagingRecommendedBlock_75")
						.post(uri06 + "/events")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "285db0fe1b79fda1cb1f8f75e61fb0419b4ddce3")
						.formParam("s", "dd7a5d76-57f4-4279-bfd2-60ffbbc2c2eb")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "9ab0f8699fde28ee")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4"}""")
						.formParam("internal", "")
						.formParam("page_title", "C# 9 and .NET 5 – Modern Cross-Platform Development - Fifth Edition")
						.formParam("user_active_company_id", "-1")
						.formParam("event_list", """{"data":[{"event_name":"viewed-cover","metadata":{"product_title":"C# 9 and .NET 5 – Modern Cross-Platform Development - Fifth Edition","category":"mobile","image_url":"https://static-staging.packt-cdn.com/products/9781800568105/cover/smaller","product_url":"/book/mobile/9781800568105"}}]}""")
						.formParam("referer", "https://subscription-staging.packtpub.com/book/mobile/9781800568105")
						.formParam("anonymous_session", "ZTR4R2tLMXlYQkVLU0ZrNkNtV244RWM0TGpwWEJpTk5GRkFPcDhRemNpNWRXOG1zRE5acUpnb2VPL1ZhOHNrdS0tT3h6WFRNNnN6elNPb1BDaWo2b0UzZz09--2172c4226c6f6bbe25357f69cfd8741ad97e79aa"),
					http("SubsStagingRecommendedBlock_76")
						.get(uri16 + "/api/identify_v3?a=3992788168&u=558546027102160&v=6694406523599211&s=137206076193087&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1618825139627")
				))

		}

	val signedinUser = scenario("SubsStagingRecommendedBlock").exec(LogIn.login,RecommendedBlock.recommendedblock)

	setUp(signedinUser.inject(nothingFor(5),
		atOnceUsers(users =1),
		rampUsers(users = 5)during(10),
		constantUsersPerSec(rate = 20) during(20)
	))
		.protocols(httpProtocol)
}