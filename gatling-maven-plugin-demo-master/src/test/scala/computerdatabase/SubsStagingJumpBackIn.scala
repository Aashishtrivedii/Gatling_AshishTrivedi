package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SubsStagingJumpBackIn extends Simulation {
	val duration = Duration(1, MINUTES)

	val httpProtocol = http
		.baseUrl("https://subscription-staging.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")



    val uri01 = "https://packt-reader-content-staging.s3.eu-west-1.amazonaws.com/9781788996662"
    val uri02 = "https://www.google-analytics.com"
    val uri03 = "https://www.facebook.com/tr"
    val uri04 = "https://stats.g.doubleclick.net/j/collect"
    val uri05 = "https://users-packtlib-api-staging.packtpub.com/v2/users/me"
    val uri06 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri07 = "https://bid.g.doubleclick.net/xbbe/pixel"
    val uri08 = "https://api-iam.intercom.io/messenger/web"
    val uri09 = "https://services-staging.packtpub.com"
    val uri10 = "https://static.hotjar.com/c/hotjar-982604.js"
    val uri11 = "https://d2aov160eccqlv.cloudfront.net/7d2e437f5ad848f68a441c36c5dee466/3e2cab2598e32a9ff31a997f4cadc583.html"
    val uri13 = "https://service.maxymiser.net/cg/v5"
    val uri14 = "https://subscriptions-api-staging.packtpub.com/v1/users/me"
    val uri15 = "https://geolocation-api-staging.packtpub.com/v1/location"
    val uri16 = "https://www2.profitwell.com/dotjs/v1/quests/error"
    val uri17 = "https://www.google.com"
    val uri18 = "https://static-staging.packt-cdn.com"
    val uri19 = "https://www.google.co.in"
    val uri20 = "https://widget.intercom.io/widget/lts26lhx"
    val uri21 = "https://heapanalytics.com"


		// Login
		object LogIn{
			val login= exec(http("SubsStagingJumpBackIn_Login")
				.options(uri09 + "/auth-v1/users/tokens")

				.resources(http("SubsStagingJumpBackIn_1")
					.get(uri21 + "/h?a=3992788168&u=558546027102160&v=3173773041638570&s=8028625505411598&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618805807863&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Flogin&pp=t&pp=Login%20%7C%20Packt%20Subscription&pp=ts&pp=1618805893346&pp=pr&pp=%2F&id0=6918593701225775&t0=click&n0=button&c0=btn%20btn-lg%20btn-primary%20btn-block&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40button%3B.btn%3B.btn-block%3B.btn-lg%3B.btn-primary%3B%5Bng-show%3D!loginController.loadingLogin%5D%3B%5Btype%3Dsubmit%5D%3B%7C&ts0=1618805909105&x0=Sign%20In&id1=1970007394429443&t1=submit&n1=form&c1=form-signin%20ng-pristine%20ng-valid&y1=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C&ts1=1618805909127&x1=Sign%20In&st=1618805909400")
					,
					http("SubsStagingJumpBackIn_2")
						.post(uri03 + "/")
						.body(RawFileBody("computerdatabase/subsstagingjumpbackin/0002_request.dat")),
					http("SubsStagingJumpBackIn_3")
						.post(uri09 + "/auth-v1/users/tokens")
						.body(RawFileBody("computerdatabase/subsstagingjumpbackin/0003_request.json")),
					http("SubsStagingJumpBackIn_4")
						.get(uri21 + "/h?a=3992788168&u=558546027102160&v=4195891466826781&s=8028625505411598&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1618805910938&pr=%2Flogin&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618805807863&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&st=1618805910940")
					,
					http("SubsStagingJumpBackIn_5")
						.options(uri09 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
					http("SubsStagingJumpBackIn_6")
						.options(uri09 + "/skills-v1/users/me/learning-paths")
					,
					http("SubsStagingJumpBackIn_7")
						.options(uri14 + "/subscriptions?active=false")
					,
					http("SubsStagingJumpBackIn_8")
						.options(uri05 + "/views/history?limit=4&offset=0")
					,
					http("SubsStagingJumpBackIn_9")
						.get("/")
					,
					http("SubsStagingJumpBackIn_10")
						.get(uri20)
						.check(status.is(400)),
					http("SubsStagingJumpBackIn_11")
						.get(uri21 + "/api/identify_v3?a=34805961&u=287607950759695&v=1147325907173582&s=3620620563394249&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1618805912511")
					,
					http("SubsStagingJumpBackIn_12")
						.post(uri16 + "/")
						.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21059
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21772
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/A.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
						.formParam("user_email", "undefined"),
					http("SubsStagingJumpBackIn_13")
						.get(uri10 + "?sv=7")
					,
					http("SubsStagingJumpBackIn_14")
						.get("/api/users/me/subscriptions")
					,
					http("SubsStagingJumpBackIn_15")
						.get(uri02 + "/collect?v=1&_v=j89&a=482138017&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1579481446.1618805784&gtm=2wg472WJMM825&cd1=d12c50a2-843a-43de-96ba-360e39c985a4&cd3=1618805913517.aboixyt&cd4=2021-04-19T09%3A48%3A33.517%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=552812649")
					,
					http("SubsStagingJumpBackIn_16")
						.get(uri03 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618805913538&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1618805913210&coo=false&rqm=GET")
					,
					http("SubsStagingJumpBackIn_17")
						.get(uri21 + "/h?a=34805961&u=287607950759695&v=1147325907173582&s=3620620563394249&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1618805912509&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618805787225&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&st=1618805913546")
					,
					http("SubsStagingJumpBackIn_18")
						.get(uri03 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618805914051&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1618805913210&coo=false&es=automatic&tm=3&rqm=GET")
					,
					http("SubsStagingJumpBackIn_19")
						.post(uri08 + "/ping")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "c5ebfac91748ab22139b809ebd37817152f2ffbc")
						.formParam("s", "ca0c76fc-0178-4aee-b8cd-87ed9b994358")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "6983c5011f6f3c52")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","name":"test JumpInJhapaak"}""")
						.formParam("internal", "{}")
						.formParam("page_title", "Packt Subscription | Advance your knowledge in tech")
						.formParam("user_active_company_id", "undefined")
						.formParam("source", "apiBoot")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription-staging.packtpub.com/")
						.formParam("anonymous_session", "SkJ3cWI5eVRhZDZBck5kbFdZVDBiS0w1N05Wdk9tUnNubUVPRVgvODh6UjB0NW9IallMZXlVOXhmNmkzNHhYZy0tdUxyeHE4REFBcEJFODRPNEtKeHNTUT09--5d47c6131adcee635a7267efc9fbcbec18ec7c1c"),
					http("SubsStagingJumpBackIn_20")
						.get("/api/subscription/home")
					,
					http("SubsStagingJumpBackIn_21")
						.get(uri18 + "/products/9781839217289/cover/smaller")
						.check(status.is(403))))
				.pause(2)
		}


	// JUMPBACKIN
		object JumpBackIn{
			val jumpbackin= exec(http("SubsStagingJumpBackIn")
				.get("/book/application_development/9781788996662/1/ch01lvl1sec13/the-python-culture")
				.resources(http("SubsStagingJumpBackIn_23")
					.get(uri13 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription-staging.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription-staging.packtpub.com%252Fbook%252Fapplication_development%252F9781788996662%252F1%252Fch01lvl1sec13%252Fthe-python-culture%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("SubsStagingJumpBackIn_24")
						.options(uri05 + "/views/history?limit=6&offset=0")
					,
					http("SubsStagingJumpBackIn_25")
						.options(uri09 + "/users-v1/users/me")
					,
					http("SubsStagingJumpBackIn_26")
						.get(uri21 + "/h?a=34805961&u=287607950759695&v=1147325907173582&s=3620620563394249&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618805787225&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1618805912509&pp=pr&pp=%2F&id0=6251345552517108&t0=click&n0=a&h0=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication-development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&y0=%40div%3B%23root%3B%7C%40main%3B.subscription-content-container%3B%5Brole%3Dmain%5D%3B%7C%40section%3B.jumpBackIn-section%3B.row%3B%7C%40div%3B.col-12%3B%7C%40div%3B.slick-initialized%3B.slick-slider%3B%7C%40div%3B.slick-list%3B%7C%40div%3B.slick-track%3B%7C%40div%3B.slick-active%3B.slick-current%3B.slick-slide%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-index%3D0%5D%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B%7C%40div%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B.jumpBackIn-media%3B.media%3B%7C%40div%3B.media-body%3B%7C%40a%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication-development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture%5D%3B%7C&ts0=1618805958826&x0=Learn%20Python%20Programming%20-%20Second%20Edition&st=1618805961204")
					,
					http("SubsStagingJumpBackIn_27")
						.options(uri09 + "/users-v1/users/me/metadata")
					,
					http("SubsStagingJumpBackIn_28")
						.options(uri09 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
					http("SubsStagingJumpBackIn_29")
						.options(uri09 + "/lists-v1/users/me/playlists")
					,
					http("SubsStagingJumpBackIn_30")
						.get(uri09 + "/products-v1/products/9781788996662/types")
					,
					http("SubsStagingJumpBackIn_31")
						.get(uri09 + "/users-v1/users/me")
					,
					http("SubsStagingJumpBackIn_32")
						.get(uri09 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
					http("SubsStagingJumpBackIn_33")
						.get(uri05 + "/views/history?limit=6&offset=0")
					,
					http("SubsStagingJumpBackIn_34")
						.get(uri21 + "/h?a=3992788168&u=558546027102160&v=4586160493514817&s=8028625505411598&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1618805961825&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618805807863&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&st=1618805961825")
					,
					http("SubsStagingJumpBackIn_35")
						.get(uri09 + "/lists-v1/users/me/playlists")
					,
					http("SubsStagingJumpBackIn_36")
						.get(uri10 + "?sv=7")
					,
					http("SubsStagingJumpBackIn_37")
						.get(uri10 + "?sv=6")
					,
					http("SubsStagingJumpBackIn_38")
						.post(uri02 + "/j/collect?v=1&_v=j89&a=112661124&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&dp=%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=629294568&gjid=428737246&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1579481446.1618805784&_r=1&gtm=2wg472WJMM825&cd3=1618805962582.3ht3qasf&cd4=2021-04-19T09%3A49%3A22.582%2B05%3A30&cd2=1010921333.1617965825&z=1589432370")
					,
					http("SubsStagingJumpBackIn_39")
						.get(uri03 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618805962606&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1618805962384&coo=false&rqm=GET")
					,
					http("SubsStagingJumpBackIn_40")
						.get(uri20),
					http("SubsStagingJumpBackIn_41")
						.post(uri04 + "?t=dc&aip=1&_r=3&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=629294568&gjid=428737246&_gid=1579481446.1618805784&_u=SCCAAEACQAAAAC~&z=119252715")
					,
					http("SubsStagingJumpBackIn_42")
						.get(uri18 + "/products/9781800568105/summary")
					,
					http("SubsStagingJumpBackIn_43")
						get(uri17 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=629294568&_u=SCCAAEACQAAAAC~&z=258461107")
					,
					http("SubsStagingJumpBackIn_44")
						.get(uri19 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=629294568&_u=SCCAAEACQAAAAC~&z=258461107")
					,
					http("SubsStagingJumpBackIn_45")
						.get(uri18 + "/products/9781789955750/summary")
					,
					http("SubsStagingJumpBackIn_46")
						.get(uri02 + "/collect?v=1&_v=j89&a=112661124&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&dp=%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1579481446.1618805784&gtm=2wg472WJMM825&cd3=1618805963088.z6003vj&cd4=2021-04-19T09%3A49%3A23.88%2B05%3A30&cd2=1010921333.1617965825&z=882042055")
					,
					http("SubsStagingJumpBackIn_47")
						.get(uri07 + "?d=KAE")
					,
					http("SubsStagingJumpBackIn_48")
						.get(uri03 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618805963134&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22og%3Adescription%22%3A%22%22%2C%22og%3Aurl%22%3A%22%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd2aov160eccqlv.cloudfront.net%2F7d2e437f5ad848f68a441c36c5dee466%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd2aov160eccqlv.cloudfront.net%2F7d2e437f5ad848f68a441c36c5dee466%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1618805962384&coo=false&es=automatic&tm=3&rqm=GET")
					,
					http("SubsStagingJumpBackIn_49")
						.get(uri06 + "/?random=1618805963141&cv=9&fst=1618805963141&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=376635471%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("SubsStagingJumpBackIn_50")
						.options(uri09 + "/users-v1/users/me/products/metadata?isbns=[%229781788996662%22]&detail=full")
					,
					http("SubsStagingJumpBackIn_51")
						.get(uri17 + "/pagead/1p-user-list/945348752/?random=1618805963141&cv=9&fst=1618804800000&num=1&guid=ON&eid=376635471%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=1569412814&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
					http("SubsStagingJumpBackIn_52")
						.get(uri19 + "/pagead/1p-user-list/945348752/?random=1618805963141&cv=9&fst=1618804800000&num=1&guid=ON&eid=376635471%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=1569412814&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
					http("SubsStagingJumpBackIn_53")
						.get(uri18 + "/products/9781838826864/summary")
					,
					http("SubsStagingJumpBackIn_54")
						.get(uri18 + "/authors/100035")
					,
					http("SubsStagingJumpBackIn_55")
						.get(uri09 + "/users-v1/users/me/products/metadata?isbns=[%229781788996662%22]&detail=full")
					,
					http("SubsStagingJumpBackIn_56")
						.options(uri09 + "/users-v1/users/me/products/metadata?isbns=[%229781788996662%22,%229781789955750%22,%229781838826864%22,%229781789952698%22,%229781800568105%22,%229781788998437%22]&detail=line")
					,
					http("SubsStagingJumpBackIn_57")
						.options(uri09 + "/credits-v1/users/me/credits/balance")
					,
					http("SubsStagingJumpBackIn_58")
						.options(uri14 + "/subscriptions?active=true")
					,
					http("SubsStagingJumpBackIn_59")
						.get(uri14 + "/subscriptions?active=true")
					,
					http("SubsStagingJumpBackIn_60")
						.get(uri09 + "/credits-v1/users/me/credits/balance")
					,
					http("SubsStagingJumpBackIn_61")
						.get(uri09 + "/users-v1/users/me/products/metadata?isbns=[%229781788996662%22,%229781789955750%22,%229781838826864%22,%229781789952698%22,%229781800568105%22,%229781788998437%22]&detail=line")
					,
					http("SubsStagingJumpBackIn_62")
						.options(uri09 + "/entitlements-v1/users/me/products/9781788996662/entitlement")
					,
					http("SubsStagingJumpBackIn_63")
						.get(uri09 + "/entitlements-v1/users/me/products/9781788996662/entitlement")
					,
					http("SubsStagingJumpBackIn_64")
						.options(uri09 + "/products-v1/products/9781788996662/1/ch01lvl1sec13")
					,
					http("SubsStagingJumpBackIn_65")
						.options(uri09 + "/marketing-v1/users/me/interests")
					,
					http("SubsStagingJumpBackIn_66")
						.options(uri14)
					,
					http("SubsStagingJumpBackIn_67")
						.get(uri15)
					,
					http("SubsStagingJumpBackIn_68")
						.get(uri09 + "/products-v1/products/9781788996662/1/ch01lvl1sec13")
					,
					http("SubsStagingJumpBackIn_69")
						.get(uri09 + "/marketing-v1/users/me/interests")
					,
					http("SubsStagingJumpBackIn_70")
						.get(uri14)
					,
					http("SubsStagingJumpBackIn_71")
						.get(uri21 + "/api/identify_v3?a=3992788168&u=558546027102160&v=4586160493514817&s=8028625505411598&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1618805968277")
					,
					http("SubsStagingJumpBackIn_72")
						.get(uri21 + "/api/identify_v3?a=3992788168&u=558546027102160&v=4586160493514817&s=8028625505411598&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1618805968298")
					,
					http("SubsStagingJumpBackIn_73")
						.get(uri01 + "/ch01lvl1sec13.html?AWSAccessKeyId=ASIAWQOPYXH4USNVTAFW&Expires=1618809347&Signature=lzlfiwu1%2FTp%2F4ql8tKZQ5dgosD0%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEAQaCWV1LXdlc3QtMSJGMEQCIE1UaHo3G41t7cGt0s6LRP1yzAh4ibCGf2T%2Fy%2FC2hr9nAiB8wL3YTfXurCRuoZcNZOPwxI%2F4ZybujwE5L%2Bj%2FztJN8SrnAQhtEAIaDDQ0NzY0OTIwMDYzMyIMbqgH%2FTk7W7nEViTBKsQBHfJgn%2BXd5I5vF4m0k2p24CCpFXNdhAHLGJuAj5AI0m2Co8bEq7LsFIVFTCKkjXi1vSZCHRzLmuZX%2BCKBp%2BToUKB%2B4obQifFM2lSJHlpWPqCnk00fZ3sNdBfGA%2F60ovmpgZDgbLouFglqdmTXe8UMRGr5%2FA4%2BBzvpWtAZGR6LTfiMrmrjhn8%2BwbRwfWmzE%2FTZUlPFNM66DSrcUlS6lO85tDsM0wOS%2BkLKT4Pcp%2Bh2fol7GxoVqTuKQA3TDL3927c4O941gDCthfSDBjrhAaieSNzzpwbK8gq2LJJzMC0arnL%2BIHtU4RyP%2FomUvPtqCype81QA5DLZvJ4ieotjtAlX1gNpujx7uOMUp86Ebl1sT5BNaj%2FxuKvr4qwvOHJWwdq4uzmHm7mNMpFc%2F8un1PKd7McdDz5FonrZRUa%2B0fss6Hh%2FcqVmLunOpdcK%2BmC%2FdHVnxYKmNu%2BWKNGlaDPpB0C5CN8HzjvGPR%2Bdom7ERFJpwlp71PCP4P6pcSdyp5bMPHLWwL%2BSU3NE8j1MBmfPzk2DK2%2BqPhpQCNw7AJZjgtdylAqnEtcNbhKndNC66DisLA%3D%3D")
					,
					http("SubsStagingJumpBackIn_74")
						.get(uri02 + "/collect?v=1&_v=j89&a=112661124&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&dp=%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1579481446.1618805784&gtm=2wg472WJMM825&cd1=d12c50a2-843a-43de-96ba-360e39c985a4&cd3=1618805968284.jziq7ap&cd4=2021-04-19T09%3A49%3A28.284%2B05%3A30&cd12=Logged%20in&cd2=1010921333.1617965825&z=1734812938")
					,
					http("SubsStagingJumpBackIn_75")
						.get(uri06 + "/?random=1618805968303&cv=9&fst=1618805968303&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("SubsStagingJumpBackIn_76")
						.post(uri08 + "/ping")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "c5ebfac91748ab22139b809ebd37817152f2ffbc")
						.formParam("s", "111ae747-650e-4c23-bda2-fd683cd19c20")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "8415ce4e69bcb4d7")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","last_playlist_created_name":"testash","last_playlist_created_id":"0e5f519b-40ba-42fe-aedd-2f9e01daa4cb","last_playlist_create_date_at":1617259470.961,"last_playlist_added_to_name":"testash","last_playlist_added_to_id":"0e5f519b-40ba-42fe-aedd-2f9e01daa4cb","last_playlist_added_to_date_at":1618805962.927,"name":"test JumpInJhapaak"}""")
						.formParam("internal", "{}")
						.formParam("page_title", "Packt Subscription | Learn more for less")
						.formParam("user_active_company_id", "undefined")
						.formParam("source", "apiBoot")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription-staging.packtpub.com/book/application_development/9781788996662/1/ch01lvl1sec13/the-python-culture")
						.formParam("anonymous_session", "NFBXT1Z1Q2RWdlgxbmUvektwWEh4VU5oM3g3MEVJS215aTBxTG4wMjNWU3BkTElFSGsxcU5RQkJITnYyYlprZC0tTzRPNG1MNlMvWFladUcvclZWSmdMZz09--deb1f879f1d3dff50af3afb47294f6acd053ab3f"),
					http("SubsStagingJumpBackIn_77")
						.get(uri17 + "/pagead/1p-user-list/945348752/?random=1618805968303&cv=9&fst=1618804800000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=1100244470&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
					http("SubsStagingJumpBackIn_78")
						.get(uri19 + "/pagead/1p-user-list/945348752/?random=1618805968303&cv=9&fst=1618804800000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fbook%2Fapplication_development%2F9781788996662%2F1%2Fch01lvl1sec13%2Fthe-python-culture&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=1100244470&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
					http("SubsStagingJumpBackIn_79")
						.options(uri05 + "/products/9781788996662/view-count")
					,
					http("SubsStagingJumpBackIn_80")
						.options(uri09 + "/products-v1/products/9781788996662/1/ch01lvl1sec14")
					,
					http("SubsStagingJumpBackIn_81")
						.options(uri09 + "/reading-v1/users/me/products/9781788996662/1/ch01lvl1sec13/notes/search")
					,
					http("SubsStagingJumpBackIn_82")
						.post(uri08 + "/ping")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "c5ebfac91748ab22139b809ebd37817152f2ffbc")
						.formParam("s", "111ae747-650e-4c23-bda2-fd683cd19c20")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "0cc7cac92eb1a681")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","last_playlist_created_name":"testash","last_playlist_created_id":"0e5f519b-40ba-42fe-aedd-2f9e01daa4cb","last_playlist_create_date_at":1617259470.961,"last_playlist_added_to_name":"testash","last_playlist_added_to_id":"0e5f519b-40ba-42fe-aedd-2f9e01daa4cb","last_playlist_added_to_date_at":1618805962.927,"name":"test JumpInJhapaak","last_section_read_book_title":"Learn Python Programming - Second Edition","last_section_read_category":"application_development","last_section_read_image_url":"https://static-staging.packt-cdn.com/products/9781788996662/cover/smaller","last_section_read_url":"/book/application_development/9781788996662/1/ch01lvl1sec13/the-python-culture","last_section_read_date_at":1618805968.803,"last_section_read_name":"The Python culture"}""")
						.formParam("internal", "{}")
						.formParam("page_title", "The Python culture - Learn Python Programming - Second Edition")
						.formParam("user_active_company_id", "-1")
						.formParam("source", "apiUpdate")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription-staging.packtpub.com/book/application_development/9781788996662/1/ch01lvl1sec13/the-python-culture")
						.formParam("anonymous_session", "bWhJZ3pVSmEzbDd5NzJuai9sdzhva3BoNElUTlM2SS9CSmgvM0ZUZmtoWGpYUFNuYW1XS0JiUEFPYlprU25qTC0tdG9OdmFtRGp4V2JhNXhqMkN2Znhzdz09--0914ba166064c2979d41f74a886c36bf42bad418"),
					http("SubsStagingJumpBackIn_83")
						.get(uri11)
					,
					http("SubsStagingJumpBackIn_84")
						.get(uri09 + "/products-v1/products/9781788996662/1/ch01lvl1sec14")
					,
					http("SubsStagingJumpBackIn_85")
						.post(uri08 + "/events")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "c5ebfac91748ab22139b809ebd37817152f2ffbc")
						.formParam("s", "111ae747-650e-4c23-bda2-fd683cd19c20")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "de8e4566efbade72")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4"}""")
						.formParam("internal", "")
						.formParam("page_title", "The Python culture - Learn Python Programming - Second Edition")
						.formParam("user_active_company_id", "-1")
						.formParam("event_list", """{"data":[{"event_name":"content-read","metadata":{"product_title":"Learn Python Programming - Second Edition","category":"application_development","image_url":"https://static-staging.packt-cdn.com/products/9781788996662/cover/smaller","product_url":"1/ch01lvl1sec13/the-python-culture","section_title":"The Python culture"}}]}""")
						.formParam("referer", "https://subscription-staging.packtpub.com/book/application_development/9781788996662/1/ch01lvl1sec13/the-python-culture")
						.formParam("anonymous_session", "bWhJZ3pVSmEzbDd5NzJuai9sdzhva3BoNElUTlM2SS9CSmgvM0ZUZmtoWGpYUFNuYW1XS0JiUEFPYlprU25qTC0tdG9OdmFtRGp4V2JhNXhqMkN2Znhzdz09--0914ba166064c2979d41f74a886c36bf42bad418"),
					http("SubsStagingJumpBackIn_86")
						.post(uri08 + "/events")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "c5ebfac91748ab22139b809ebd37817152f2ffbc")
						.formParam("s", "111ae747-650e-4c23-bda2-fd683cd19c20")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "c049b75717e62db5")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4"}""")
						.formParam("internal", "")
						.formParam("page_title", "The Python culture - Learn Python Programming - Second Edition")
						.formParam("user_active_company_id", "-1")
						.formParam("event_list", """{"data":[{"event_name":"content-read-application_development","metadata":{"product_title":"Learn Python Programming - Second Edition","category":"application_development","image_url":"https://static-staging.packt-cdn.com/products/9781788996662/cover/smaller","product_url":"1/ch01lvl1sec13/the-python-culture","section_title":"The Python culture"}}]}""")
						.formParam("referer", "https://subscription-staging.packtpub.com/book/application_development/9781788996662/1/ch01lvl1sec13/the-python-culture")
						.formParam("anonymous_session", "bWhJZ3pVSmEzbDd5NzJuai9sdzhva3BoNElUTlM2SS9CSmgvM0ZUZmtoWGpYUFNuYW1XS0JiUEFPYlprU25qTC0tdG9OdmFtRGp4V2JhNXhqMkN2Znhzdz09--0914ba166064c2979d41f74a886c36bf42bad418"),
					http("SubsStagingJumpBackIn_87")
						.get(uri01 + "/ch01lvl1sec14.html?AWSAccessKeyId=ASIAWQOPYXH4S2B3TOGV&Expires=1618809349&Signature=dQE8X6SeYdCB5nhjJLyMUQuPT3w%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEAQaCWV1LXdlc3QtMSJGMEQCIHgXVN7x8oJ6YDL%2FBzNZEcZgzO5P6WURgpyW1qfovhyHAiBNP3oiV0PKGZRBa3jDhrP%2BH8s4ewYRPWetHWJ3UMKvnirnAQhtEAIaDDQ0NzY0OTIwMDYzMyIMH%2FncWIBRdrfbIOiIKsQBVzRTT0NeSccSNJ1n8RN9JlXTukDSR1IFxyoR6MRu6jY4ueDdLN25UfD2D6b9X8ut3hROxAuYXIaeHxFInOs4ZQuyyq9QsYfNSQn8ZkCEF047IqRYUIz1uKtpJ4ec%2FmPmyMypit20NVC53UxlYG1J03mhIvojEwlCKdHQSaNstL84tgkxEpwxDTYgBe4Wm5b0BpweVAO9ywCOJIAVnp1nU2NhTcv%2B%2F430c6OPURF9p9crXu4l06LZ93%2BjzG6eXQCnIgS5YzDWhPSDBjrhATagCzYcg8aGAKsGK5TdxJqKEv%2BDBh2L50Qqjrhvwm6E79aq9h6K1ajA%2BcECe0XWIX%2B90l3sKBEgXcG0v8k9HOS2ctRAJNV1b%2BG7HfL91IFnr4X4IlPi6gDFtHonIkSbB0ngUJLhnYqrUNfJX%2FX1ewJI%2FnDIAJ9M8e1ItAOo6HWX6thC%2BXlt0eRthgZTjFtNNrVbLeEwG34FCYN8GcIwKjOX%2BgbVBdY0RRMMyWRG1KANBuK%2BLTnWyFTjiXWaYynULdn50HYxOL0w4ZYg3OChTN1dSkkx0j5JvY%2F1JpIp6lb9rw%3D%3D")
					,
					http("SubsStagingJumpBackIn_88")
						.patch(uri05 + "/products/9781788996662/view-count")
						.body(RawFileBody("computerdatabase/subsstagingjumpbackin/0088_request.json")),
					http("SubsStagingJumpBackIn_89")
						.get(uri09 + "/reading-v1/users/me/products/9781788996662/1/ch01lvl1sec13/notes/search")
				))
		}
	val signedinUser = scenario("SubsStagingJumpBackIn").exec(LogIn.login,JumpBackIn.jumpbackin)

	setUp(signedinUser.inject(rampUsers(20).during(duration)).protocols(httpProtocol))
}