package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SubsLiveCheckout extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.facebook.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")



    val uri01 = "https://service.maxymiser.net/cg/v5"
    val uri02 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri03 = "https://static.hotjar.com/c"
    val uri04 = "https://maps.googleapis.com/maps/api/js"
    val uri05 = "https://www.google-analytics.com"
    val uri06 = "https://www.recaptcha.net/recaptcha/api.js"
    val uri07 = "https://static.packt-cdn.com"
    val uri08 = "https://users-packtlib-api.packtpub.com/v2/users/me"
    val uri10 = "https://subscriptions-api.packtpub.com/v1/users/me"
    val uri11 = "https://www.packtpub.com"
    val uri12 = "https://stats.g.doubleclick.net/j/collect"
    val uri13 = "https://packt-reader-content-production.s3.eu-west-1.amazonaws.com/9781838989583"
    val uri14 = "https://www2.profitwell.com/dotjs/v1/quests/error"
    val uri15 = "https://services.packtpub.com"
    val uri16 = "https://www.googletagmanager.com"
    val uri17 = "https://subscription.packtpub.com"
    val uri18 = "https://www.google.com"
    val uri19 = "https://www.google.co.in"
    val uri20 = "https://widget.intercom.io/widget/e8mdsr07"
    val uri21 = "https://heapanalytics.com"


		// LOGIN
		object Login{
			val login=exec(http("SubsLiveCheckout_0")
				.post("/tr/")

				.body(RawFileBody("computerdatabase/subslivecheckout/0000_request.dat"))
				.resources(http("SubsLiveCheckout_1")
					.get(uri17 + "/login")
					,
					http("SubsLiveCheckout_2")
						.get(uri06 + "?onload=vcRecaptchaApiLoaded&render=explicit"),
					http("SubsLiveCheckout_3")
						.get(uri16 + "/gtm.js?id=GTM-WJMM825"),
					http("SubsLiveCheckout_4")
						.get(uri01 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Flogin%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("SubsLiveCheckout_5")
						.get("/tr/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620822616778&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822616677&coo=false&exp=l0&rqm=GET")
					,
					http("SubsLiveCheckout_6")
						.get(uri03 + "/hotjar-982604.js?sv=6")
					,
					http("SubsLiveCheckout_7")
						.get(uri03 + "/hotjar-982604.js?sv=7"),
					http("SubsLiveCheckout_8")
						.get(uri21 + "/h?a=34805961&u=2865418576367765&v=816167396433797&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1620822163349&pp=pr&pp=%2F&id0=5893317834651187&t0=click&n0=a&c0=nav-link-subscribe%20btn-primary&h0=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&y0=%40div%3B%23root%3B%7C%40nav%3B%23primary-navigation%3B.navigation%3B.subs-homepage-header-container%3B%7C%40div%3B.container-fluid%3B.navigation__inner%3B%7C%40div%3B.navigation__right%3B%7C%40ul%3B.menu%3B%7C%40li%3B.menu__item%3B.menu__link%3B%7C%40a%3B.btn-primary%3B.nav-link-subscribe%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription.packtpub.com%2Flogin%5D%3B%5Btarget%3D_blank%5D%3B%7C&ts0=1620822614225&x0=Sign%20in&st=1620822615591")
					,
					http("SubsLiveCheckout_9")
						.get(uri02 + "/?random=1620822616446&cv=9&fst=1620822616446&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("SubsLiveCheckout_10")
						.post(uri05 + "/j/collect?v=1&_v=j90&a=1461671764&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Login%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=1775614479&gjid=1442529361&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&_r=1&gtm=2wg550WJMM825&cd3=1620822616829.39sxh4w&cd4=2021-05-12T18%3A00%3A16.830%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=1769738959")
					,
					http("SubsLiveCheckout_11")
						.get(uri18 + "/pagead/1p-user-list/945348752/?random=1620822616446&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=1151967223&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
					http("SubsLiveCheckout_12")
						.get(uri19 + "/pagead/1p-user-list/945348752/?random=1620822616446&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=1151967223&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
					http("SubsLiveCheckout_13")
						.get(uri05 + "/collect?v=1&_v=j90&a=1461671764&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Login%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd3=1620822616366.13bgkbm&cd4=2021-05-12T18%3A00%3A16.367%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=1770318651")
					,
					http("SubsLiveCheckout_14")
						.get("/tr/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620822617288&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Login%20%7C%20Packt%20Subscription%22%2C%22meta%3Adescription%22%3A%22Log%20in%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Login%20%7C%20Packt%20Subscription%22%2C%22og%3Adescription%22%3A%22Log%20in%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%2Flogin%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822616677&coo=false&es=automatic&tm=3&exp=l0&rqm=GET")
					,
					http("SubsLiveCheckout_15")
						.get(uri21 + "/h?a=34805961&u=2865418576367765&v=501725955862372&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2Flogin&d=subscription.packtpub.com&t=Login%20%7C%20Packt%20Subscription&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620822616605&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620822616859")
					,
					http("SubsLiveCheckout_16")
						.get(uri20),
					http("SubsLiveCheckout_17")
						.get(uri19 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=1775614479&_u=SCCAAEACQAAAAC~&z=1425832046")
					,
					http("SubsLiveCheckout_18")
						.get(uri18 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=1775614479&_u=SCCAAEACQAAAAC~&z=1425832046")
				))
				.pause(1)
				.exec(http("SubsLiveCheckout_19")
					.get(uri21 + "/h?a=34805961&u=2865418576367765&v=501725955862372&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2Flogin&pp=t&pp=Login%20%7C%20Packt%20Subscription&pp=ts&pp=1620822616605&pp=pr&pp=%2F&id0=2139823759647287&t0=change&n0=input&c0=form-control&i0=login-input-email&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40input%3B%23login-input-email%3B.form-control%3B%5Bautofocus%3D%5D%3B%5Bname%3Demail%5D%3B%5Bplaceholder%3DEmail%20address%5D%3B%5Brequired%3D%5D%3B%5Btype%3Demail%5D%3B%7C&ts0=1620822622483&id1=2670949145463882&t1=click&n1=span&y1=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40button%3B.btn%3B.btn-block%3B.btn-lg%3B.btn-primary%3B%5Bng-show%3D!loginController.loadingLogin%5D%3B%5Btype%3Dsubmit%5D%3B%7C%40span%3B%7C&ts1=1620822622574&x1=Sign%20In&id2=2949177404329620&t2=submit&n2=form&c2=form-signin%20ng-pristine%20ng-valid&y2=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C&ts2=1620822622589&x2=Sign%20In&st=1620822622637")

					.resources(http("SubsLiveCheckout_20")
						.post("/tr/")

						.body(RawFileBody("computerdatabase/subslivecheckout/0020_request.dat")),
						http("SubsLiveCheckout_21")
							.options(uri15 + "/auth-v1/users/tokens")
						,
						http("SubsLiveCheckout_22")
							.post(uri15 + "/auth-v1/users/tokens")

							.body(RawFileBody("computerdatabase/subslivecheckout/0022_request.json")),
						http("SubsLiveCheckout_23")
							.options(uri10 + "/subscriptions?active=false")
						,
						http("SubsLiveCheckout_24")
							.options(uri15 + "/b2b-accounts-v1/users/me/roles-and-subjects")
						,
						http("SubsLiveCheckout_25")
							.get(uri21 + "/h?a=34805961&u=2865418576367765&v=3981564220436371&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620822625205&pr=%2Flogin&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620822625205")
						,
						http("SubsLiveCheckout_26")
							.get(uri10 + "/subscriptions?active=false")

						//.check(status.is(404))
						,
						http("SubsLiveCheckout_27")
							.get(uri15 + "/b2b-accounts-v1/users/me/roles-and-subjects")
						,
						http("SubsLiveCheckout_28")
							.options(uri08 + "/views/history?limit=4&offset=0")
						,
						http("SubsLiveCheckout_29")
							.options(uri15 + "/skills-v1/users/me/learning-paths")
						,
						http("SubsLiveCheckout_30")
							.get(uri17 + "/")
						,
						http("SubsLiveCheckout_31")
							.get(uri03 + "/hotjar-982604.js?sv=7")
						,
						http("SubsLiveCheckout_32")
							.get(uri17 + "/api/users/me/subscriptions")
						,
						http("SubsLiveCheckout_33")
							.get(uri21 + "/api/identify_v3?a=34805961&u=2865418576367765&v=1503578910607947&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=0&st=1620822627887")
						,
						http("SubsLiveCheckout_34")
							.get(uri21 + "/h?a=34805961&u=2865418576367765&v=1503578910607947&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620822627885&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620822627948")
						,
						http("SubsLiveCheckout_35")
							.get("/tr/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620822627724&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822627276&coo=false&exp=l1&rqm=GET")
						,
						http("SubsLiveCheckout_36")
							.get(uri05 + "/collect?v=1&_v=j90&a=1630999761&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd1=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&cd3=1620822627755.f16yfftk&cd4=2021-05-12T18%3A00%3A27.755%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=1497860841")
						,
						http("SubsLiveCheckout_37")
							.get("/tr/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620822628235&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822627276&coo=false&es=automatic&tm=3&exp=l1&rqm=GET")
						,
						http("SubsLiveCheckout_38")
							.get(uri20)
						//.check(status.is(400))
						,
						http("SubsLiveCheckout_39")
							.post(uri14 + "/")

							.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21059
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21772
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/A.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
							.formParam("user_email", "undefined"),
						http("SubsLiveCheckout_40")
							.get(uri17 + "/api/subscription/home")
					))
				.pause(2)
		}



		// TITLE SEARCH AND CHECKOUT
		object SearchandCheckout{
		val checkout=exec(http("SubsLiveCheckout_41")
			.get(uri17 + "/book/cloud_and_networking/9781838989583/1")

			.resources(http("SubsLiveCheckout_42")
				.get(uri06 + "?onload=vcRecaptchaApiLoaded&render=explicit"),
				http("SubsLiveCheckout_43")
					.get(uri01 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Fbook%252Fcloud_and_networking%252F9781838989583%252F1%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
				http("SubsLiveCheckout_44")
					.get(uri21 + "/h?a=34805961&u=2865418576367765&v=1503578910607947&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1620822627885&pp=pr&pp=%2F&id0=2518223532843966&t0=click&n0=a&h0=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&y0=%40div%3B%23root%3B%7C%40main%3B.subscription-content-container%3B%5Brole%3Dmain%5D%3B%7C%40section%3B.jumpBackIn-section%3B.row%3B%7C%40div%3B.col-12%3B%7C%40div%3B.slick-initialized%3B.slick-slider%3B%7C%40div%3B.slick-list%3B%7C%40div%3B.slick-track%3B%7C%40div%3B.slick-active%3B.slick-slide%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-index%3D1%5D%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B%7C%40div%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B.jumpBackIn-media%3B.media%3B%7C%40div%3B.media-body%3B%7C%40a%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1%5D%3B%7C&ts0=1620822653457&x0=CISA%20%E2%80%93%20Certified%20Information%20Systems%20Auditor%20Study%20Guid...&st=1620822654792")
					,
				http("SubsLiveCheckout_45")
					.get(uri03 + "/hotjar-982604.js?sv=6")
					,
				http("SubsLiveCheckout_46")
					.get(uri03 + "/hotjar-982604.js?sv=7")
					,
				http("SubsLiveCheckout_47")
					.options(uri15 + "/users-v1/users/me")
					,
				http("SubsLiveCheckout_48")
					.get(uri07 + "/products/9781838989583/summary")
					,
				http("SubsLiveCheckout_49")
					.get(uri07 + "/products/9781838989583/toc")
					,
				http("SubsLiveCheckout_50")
					.options(uri08 + "/views/history?limit=6&offset=0")
					,
				http("SubsLiveCheckout_51")
					.get(uri15 + "/products-v1/products/9781838989583/types")
					,
				http("SubsLiveCheckout_52")
					.options(uri15 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
				http("SubsLiveCheckout_53")
					.options(uri15 + "/lists-v1/users/me/playlists")
					,
				http("SubsLiveCheckout_54")
					.get(uri15 + "/users-v1/users/me")
					,
				http("SubsLiveCheckout_55")
					.options(uri15 + "/users-v1/users/me/metadata")
					,
				http("SubsLiveCheckout_56")
					.get(uri15 + "/b2b-accounts-v1/users/me/roles-and-subjects")
					,
				http("SubsLiveCheckout_57")
					.get(uri08 + "/views/history?limit=6&offset=0")
					,
				http("SubsLiveCheckout_58")
					.get(uri15 + "/lists-v1/users/me/playlists")
					,
				http("SubsLiveCheckout_59")
					.get(uri15 + "/users-v1/users/me/metadata")
					,
				http("SubsLiveCheckout_60")
					.get(uri21 + "/h?a=34805961&u=2865418576367765&v=5437968358037860&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620822655438&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620822657030")
					,
				http("SubsLiveCheckout_61")
					.get(uri05 + "/collect?v=1&_v=j90&a=1662669858&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&dp=%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd3=1620822657018.c5gir5ee&cd4=2021-05-12T18%3A00%3A57.18%2B05%3A30&cd2=1010921333.1617965825&z=1557231881")
					,
				http("SubsLiveCheckout_62")
					.get("/tr/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620822656999&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822655406&coo=false&exp=l1&rqm=GET")
					,
				http("SubsLiveCheckout_63")
					.get("/tr/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620822657515&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22og%3Adescription%22%3A%22%22%2C%22og%3Aurl%22%3A%22%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822655406&coo=false&es=automatic&tm=3&exp=l1&rqm=GET")
					,
				http("SubsLiveCheckout_64")
					.get(uri20),
				http("SubsLiveCheckout_65")
					.get(uri16 + "/a?id=GTM-MSRQZ29&cv=240&t=ol&p=ga&l=2527&q=975&f=1563&e=29&i=27&d=1947&c=1659&hc=0&sr=0.050000&ps=0.034813475148444906&cb=1567408122")
					,
				http("SubsLiveCheckout_66")
					.get(uri05 + "/collect?v=1&_v=j90&a=1662669858&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&dp=%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd3=1620822657702.yao6j0td&cd4=2021-05-12T18%3A00%3A57.702%2B05%3A30&cd2=1010921333.1617965825&z=1244914767")
					,
				http("SubsLiveCheckout_67")
					.options(uri15 + "/users-v1/users/me/products/metadata?isbns=[%229781800206137%22,%229781838989583%22,%229781839217289%22,%229781789801217%22,%229781800568105%22]&detail=line")
					,
				http("SubsLiveCheckout_68")
					.options(uri15 + "/users-v1/users/me/products/metadata?isbns=[%229781838989583%22]&detail=full")
					,
				http("SubsLiveCheckout_69")
					.get(uri02 + "/?random=1620822657845&cv=9&fst=1620822657845&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&hn=www.google.com&async=1&rfmt=3&fmt=4"),
				http("SubsLiveCheckout_70")
					.get(uri18 + "/pagead/1p-user-list/945348752/?random=1620822657845&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=3263228840&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
				http("SubsLiveCheckout_71")
					.get(uri19 + "/pagead/1p-user-list/945348752/?random=1620822657845&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=3263228840&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
				http("SubsLiveCheckout_72")
					.get(uri15 + "/users-v1/users/me/products/metadata?isbns=[%229781838989583%22]&detail=full")
					,
				http("SubsLiveCheckout_73")
					.options(uri15 + "/credits-v1/users/me/credits/balance")
					,
				http("SubsLiveCheckout_74")
					.options(uri15 + "/entitlements-v1/users/me/products/9781838989583/entitlement")
					,
				http("SubsLiveCheckout_75")
					.get(uri15 + "/credits-v1/users/me/credits/balance")

					,
				http("SubsLiveCheckout_76")
					.get(uri15 + "/users-v1/users/me/products/metadata?isbns=[%229781800206137%22,%229781838989583%22,%229781839217289%22,%229781789801217%22,%229781800568105%22]&detail=line")
					,
				http("SubsLiveCheckout_77")
					.get(uri15 + "/entitlements-v1/users/me/products/9781838989583/entitlement")
					,
				http("SubsLiveCheckout_78")
					.options(uri15 + "/marketing-v1/users/me/interests")
					,
				http("SubsLiveCheckout_79")
					.options(uri10)
					,
				http("SubsLiveCheckout_80")
					.options(uri15 + "/products-v1/products/9781838989583/1/ch01lvl1sec01")
					,
				http("SubsLiveCheckout_81")
					.get(uri15 + "/marketing-v1/users/me/interests")
					,
				http("SubsLiveCheckout_82")
					.get(uri10)
				,
				http("SubsLiveCheckout_83")
					.get(uri15 + "/products-v1/products/9781838989583/1/ch01lvl1sec01")
					,
				http("SubsLiveCheckout_84")
					.get(uri13 + "/ch01lvl1sec01.html_truncated?AWSAccessKeyId=ASIAYL73HXT7M6MWP26N&Expires=1620825971&Signature=c6q71YHDDPaMGa6Vr6%2B7rAAU6L4%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEDQaCWV1LXdlc3QtMSJGMEQCIHCj2X5HRgcvDM7T5fPolqo5If2kJwZ6g28ubxvutd6MAiB2zHQm9lekcNFYzOZtjuGNZowB2xUJ1XjW3%2Fm%2Baj3rDyrtAQi9%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDU3NTUxNTYzOTAzOCIMGrh59IJcjUwWvVfDKsEB8CEdtS%2FvdoiSdlcJMJkfcs7C0LEwWPbArbWU5MpnheKMLpBkyA6OzdP7GOyi5NTLpaC%2BHkBlyHp53yPi5my8ugnV4tqv0tbOJu6UyF2ChYIzjraMV5PoOk8QpvdDEl%2BJ2jpS96SoPoHmh4lsm430EKBErtSfwwiQRfpcZPbStIXEwa3QWoAX%2FgnMZPwew0qa8LLWYCmoDZ6VvwZwjZuVyMxJ%2BL3cH8hz4kj1TjKZ7HDysn5AJVuOvE8l1PQDYyaJlDCT%2Fu6EBjrhAVDs6Ns6pthtA%2BcPr7da5y4FXMnU3Xp0MwcIc%2FDfKFhTeJeSAuV%2B1gGWrlBUHorQAYqWuaFVPLxFqK%2FzzCtv6NqNRh%2BzY7dK7ADKUG5rgHBYcUyq8ROqJiqmgB6WD4nAYkSt4CehncrvceCAu%2BxNVra52xyba%2BWKv6ZO0dxcFXflrWBGX3xsoUflqw6K4Uf9IRqrvQ78gP2T4BQo9ZQV5FIF1ngWcSJJC7SkdSQxCcLsd1c%2B6PTK%2BT98jKbaJYgkYMSSud5Jdfv%2BpZoVgPXm6ttOSW9u6tDxYy7yLeDfn%2BxU5A%3D%3D")
					,
				http("SubsLiveCheckout_85")
					.options(uri08 + "/products/9781838989583/view-count")
					,
				http("SubsLiveCheckout_86")
					.options(uri15 + "/products-v1/products/9781838989583/2/ch02lvl1sec03")
					,
				http("SubsLiveCheckout_87")
					.options(uri15 + "/reading-v1/users/me/products/9781838989583/1/undefined/notes/search")
					,
				http("SubsLiveCheckout_88")
					.get(uri15 + "/reading-v1/users/me/products/9781838989583/1/undefined/notes/search")
					,
				http("SubsLiveCheckout_89")
					.get(uri15 + "/products-v1/products/9781838989583/2/ch02lvl1sec03")
					,
				http("SubsLiveCheckout_90")
					.patch(uri08 + "/products/9781838989583/view-count")

					.body(RawFileBody("computerdatabase/subslivecheckout/0090_request.json")),
				http("SubsLiveCheckout_91")
					.get(uri13 + "/ch02lvl1sec03.html?AWSAccessKeyId=ASIAYL73HXT7E3LXUA6S&Expires=1620825974&Signature=aGNUcZ3SGQYin67zwTJCoXv%2FRd8%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEDQaCWV1LXdlc3QtMSJGMEQCIAqwa2sYgWmtVx0mrSzW6k3rBOn7c%2BL2Vpfeq084W5qCAiAu1TFUJJNmC3Q2KD4yGOHQwB1Y5UR8Otky2RCvj%2B632SrtAQi9%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F8BEAAaDDU3NTUxNTYzOTAzOCIM8B8xw8oiCQ%2BdaWsiKsEBRr6HwsaeBOTiePA27%2ByPnF5og4%2FbfK7qE7l2o80Ysf0en39V5ESS9qc%2FgEkZhBoGKv9qELY0nJnIs6WQZ%2FWjwhKQpsQaqH41V43InVh6K7sDiLs5MMg%2BaAUn9B10xKx3ftX1dPs5B2hg%2BFN%2BnLWyDnr8OHeli%2FN%2Bl%2B6x37RishiC02%2F9eGM90mS2z9bo%2FYvzD4ndqlpM8qr3FjE9s9qa73gxlFIBDxsi08yGHJfpnSgki0%2FIGzMag517VXcPSozCoDDQ%2B%2B6EBjrhATHdmIGWvwvEeYJvGfTBW3PQCHzPhzUEoDFq0q2UMATl5mRnSAR7s5FAuUycPRcqYtq%2Bbps6hZdobb9E9feg5mc%2BSuioRQvOt7e7m7n5z1%2FS%2FRdcHHnmhg%2B%2BAQTWr%2BF6%2FwlWakxPmUE%2Fpe55jLtbpWP%2BuEthWZHUurDC6qbSzTris9DEOrg9GkcJfclc9ngN9Jr0%2F6tTaDVHOOEkV43t0DbNBzUUSe2OjCz2dvRf2DBAyEORRpH9iCwBWB30CFfV715GHbJ37aHUTwkxqwAx6iEHZUmkTHPzwUUnhpdBEUtrGA%3D%3D")
					))
			.pause(3)
			.exec(http("SubsLiveCheckout_92")
				.get("/tr/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620822668595&sw=1280&sh=1024&v=2.9.39&r=stable&ec=3&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822655406&coo=false&exp=l1&rqm=GET")

				.resources(http("SubsLiveCheckout_93")
					.get(uri21 + "/h?a=34805961&u=2865418576367765&v=5437968358037860&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&pp=t&pp=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&pp=ts&pp=1620822655438&pp=pr&pp=%2F&id0=1254575798989896&t0=click&n0=a&c0=btn%20btn-primary%20pull-right%20btn-lg%20btn-block&h0=%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.book-page-wrapper%3B.ng-scope%3B%7C%40div%3B.book-page%3B.container%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23book-wrapper%3B.container-fluid%3B%7C%40div%3B.ng-scope%3B%5Bng-include%3DproductController.contentView%5D%3B%5Bonload%3DproductController.onFinishLoadContent()%5D%3B%7C%40div%3B%23reader-content%3B.col-sm-12%3B.ng-scope%3B.reader-container%3B%5Bng-class%3D%7B%27reader-container%27%3A%20productController.productType%20%3D%3D%3D%20%27book%27%7D%5D%3B%5Bng-show%3DproductController.isContentAvailable%5D%3B%5Bon-finish-page-render%3DproductController.applyFontSize()%5D%3B%7C%40div%3B.ns%3B.row%3B%5Bng-show%3D!productController.previousSection%20%26%26%20productController.nextSection%5D%3B%7C%40a%3B.btn%3B.btn-block%3B.btn-lg%3B.btn-primary%3B.pull-right%3B%5Bhref%3D%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2%5D%3B%5Bng-click%3DproductController.completeSection(%24event)%5D%3B%5Bng-href%3D%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2%5D%3B%7C&ts0=1620822668569&x0=Next%20Section&st=1620822668593")
					,
					http("SubsLiveCheckout_94")
						.options(uri08 + "/completed")
						,
					http("SubsLiveCheckout_95")
						.get(uri21 + "/h?a=34805961&u=2865418576367765&v=3062973020416234&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&d=subscription.packtpub.com&t=Section%201%3A%20Information%20System%20Auditing%20Process%20-%20CISA%20%E2%80%93%20Certified%20Information%20Systems%20Auditor%20Study%20Guide&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620822668786&pr=%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620822668788")
						,
					http("SubsLiveCheckout_96")
						.options(uri15 + "/lists-v1/users/me/playlists")
						,
					http("SubsLiveCheckout_97")
						.options(uri15 + "/credits-v1/users/me/credits/balance")
						,
					http("SubsLiveCheckout_98")
						.options(uri15 + "/products-v1/products/9781838989583/2/ch02lvl1sec02")
						,
					http("SubsLiveCheckout_99")
						.options(uri15 + "/marketing-v1/users/me/interests")
						,
					http("SubsLiveCheckout_100")
						.post("/tr/")
						.body(RawFileBody("computerdatabase/subslivecheckout/0100_request.dat")),
					http("SubsLiveCheckout_101")
						.put(uri08 + "/completed")
						.body(RawFileBody("computerdatabase/subslivecheckout/0101_request.json")),
					http("SubsLiveCheckout_102")
						.get(uri15 + "/credits-v1/users/me/credits/balance")
						,
					http("SubsLiveCheckout_103")
						.get(uri15 + "/products-v1/products/9781838989583/2/ch02lvl1sec02")
						,
					http("SubsLiveCheckout_104")
						.get(uri15 + "/marketing-v1/users/me/interests")
					,
					http("SubsLiveCheckout_105")
						.get(uri15 + "/lists-v1/users/me/playlists")
						,
					http("SubsLiveCheckout_106")
						.get(uri13 + "/ch02lvl1sec02.html?AWSAccessKeyId=ASIAYL73HXT7OKP7EU7I&Expires=1620825979&Signature=j2m%2Fd5guy74fdbe%2FAJfqT60vI%2Fg%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEDMaCWV1LXdlc3QtMSJHMEUCIAGb1RKcIskoep0oZU36tLdlrAwBZTTtiI6aVgabEG6WAiEA5HV2WAHY4ahR5Iwf7HzLr1vqcnh%2Bk7ZwISpav2%2F%2FQsMq7QEIvP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARAAGgw1NzU1MTU2MzkwMzgiDKmsTR7ACrFEliXvzSrBAROyuqHPtXFdckgFLbpC6JL9k6m1F2LQY3T8dqdn3V%2BeqQCJ32VxZ26aFJA6ObNjwFKh6LYdwxFKpu4yk%2FoAfghMRq11VgUQlj9x4SImLiQQ6Y0TNc9w8KdpJZ5CAOFqkRh2Mt88fluWqzO7S2Bz0ajz%2FUmg51J09SiGHjpP2pgSitIkXR9sz2T%2FZ7XjfiXAdgXARnihW%2FVLZX3dWHZU2xbICqk0f6PgoIjwLn1JMVUIWHzx7A%2ByYoLzRsBNTphHvbMw9OnuhAY64AF%2F5LBRRqRJK2w5V34QD6lCDYgwvl1%2FqtX%2BiNPGeVKREDQP1WB3w0yGOcg4rfXMXbjBasgZ%2FTuD59a4%2BZGTzqZ85h69R%2FZs3WLdNVKUDib9kg81UXMKiK0wNbhsMoFtZ3UGDC7IfqB2G0O0PlYxJJMZLX85CjbH6uKVjlNjaF%2BO6sCYwhSBFVVFNLA4B8DDo8fh%2FmwK4Z%2F27o6pENAo7pZEPh2OD%2BH7kq52qs4pr5qK4OsOnxe7Jz4rCSii%2F%2BOKR6sbKEBJq7vjADB3cUlY455s8fvTWZJYRmCo0rmPcJFzXQ%3D%3D")
						,
					http("SubsLiveCheckout_107")
						.options(uri15 + "/reading-v1/users/me/products/9781838989583/2/undefined/notes/search")
						,
					http("SubsLiveCheckout_108")
						.options(uri08 + "/products/9781838989583/view-count")
						,
					http("SubsLiveCheckout_109")
						.get(uri15 + "/reading-v1/users/me/products/9781838989583/2/undefined/notes/search")
						,
					http("SubsLiveCheckout_110")
						.patch(uri08 + "/products/9781838989583/view-count")

						.body(RawFileBody("computerdatabase/subslivecheckout/0110_request.json"))))
			.pause(1)
			.exec(http("SubsLiveCheckout_111")
				.post(uri05 + "/j/collect?v=1&_v=j90&a=1662669858&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F1&dp=%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&ul=en-us&de=UTF-8&dt=Audit%20Planning%20-%20CISA%20%E2%80%93%20Certified%20Information%20Systems%20Auditor%20Study%20Guide&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&ec=Link%20Clicks&ea=CTA&el=Start%20Learning%20for%20Free&ev=0&_u=yCCAAEADQAAAAC~&jid=1996751637&gjid=1085453461&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&_r=1&gtm=2wg550WJMM825&cd3=1620822690862.y0jp5rwk&cd4=2021-05-12T18%3A01%3A30.863%2B05%3A30&cd2=1010921333.1617965825&z=216745643")
				.resources(http("SubsLiveCheckout_112")
					.post(uri12 + "?t=dc&aip=1&_r=3&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=1996751637&gjid=1085453461&_gid=1798387714.1620821753&_u=yCCAAEADQAAAAC~&z=994492514")
					,
					http("SubsLiveCheckout_113")
						.get(uri18 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=1996751637&_u=yCCAAEADQAAAAC~&z=676658700")
						,
					http("SubsLiveCheckout_114")
						.get(uri19 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=1996751637&_u=yCCAAEADQAAAAC~&z=676658700")
						,
					http("SubsLiveCheckout_115")
						.get(uri11 + "/checkout/subscription/packt-subscription-monthly-launch-offer?freeTrial")
						,
					http("SubsLiveCheckout_116")
						.get(uri11 + "/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
						,
					http("SubsLiveCheckout_117")
						.get(uri16 + "/gtm.js?id=GTM-KHLZ7JF")
						,
					http("SubsLiveCheckout_118")
						.get(uri11 + "/css/app.css?id=280dc10b3b01b6400d14")
						,
					http("SubsLiveCheckout_119")
						.get(uri11 + "/js/checkout.js?id=63ad8ba9cd65ac773f7f"),
					http("SubsLiveCheckout_120")
						.get(uri11 + "/js/app.js?id=57774e803c36a000f6c2"),
					http("SubsLiveCheckout_121")
						.get(uri18 + "/recaptcha/api.js?onload=checkoutRecaptchaRenderCallback&render=explicit"),
					http("SubsLiveCheckout_122")
						.get(uri04 + "?key=AIzaSyAlq0L1y9OYxZWyAiIFbxl-XPZbA0zl5Cc&libraries=places"),
					http("SubsLiveCheckout_123")
						.get(uri11 + "/images/chevron--right-orange.svg")
						,
					http("SubsLiveCheckout_124")
						.get(uri07 + "/countries/countries.json")
						,
					http("SubsLiveCheckout_125")
						.get(uri11 + "/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
						,
					http("SubsLiveCheckout_126")
						.get(uri11 + "/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
						,
					http("SubsLiveCheckout_127")
						.get(uri21 + "/api/identify_v3?a=34805961&u=2865418576367765&v=1511027334766367&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=0&st=1620822737673")
						,
					http("SubsLiveCheckout_128")
						.get(uri18 + "/recaptcha/api2/anchor?ar=1&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&co=aHR0cHM6Ly93d3cucGFja3RwdWIuY29tOjQ0Mw..&hl=en&v=npGaewopg1UaB8CNtYfx-y1j&size=invisible&cb=ifgz0tpfjeok")
						,
					http("SubsLiveCheckout_129")
						.get(uri03 + "/hotjar-1074944.js?sv=7"),
					http("SubsLiveCheckout_130")
						.get(uri02 + "/?random=1620822736987&cv=9&fst=1620822736987&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer%3FfreeTrial&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&tiba=Checkout%20%7C%20Packt&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("SubsLiveCheckout_131")
						.get(uri18 + "/pagead/1p-user-list/945348752/?random=1620822736987&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer%3FfreeTrial&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&tiba=Checkout%20%7C%20Packt&async=1&fmt=3&is_vtc=1&random=3330330475&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
						,
					http("SubsLiveCheckout_132")
						.get(uri19 + "/pagead/1p-user-list/945348752/?random=1620822736987&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer%3FfreeTrial&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&tiba=Checkout%20%7C%20Packt&async=1&fmt=3&is_vtc=1&random=3330330475&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
						,
					http("SubsLiveCheckout_133")
						.get(uri05 + "/gtm/js?id=GTM-MSRQZ29&t=gtm10&cid=1010921333.1617965825&gac=_gaexp%3DGAX1.2.bCtVMYxfQiOsGoVk470dFQ.18852.0"),
					http("SubsLiveCheckout_134")
						.get("/tr/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer%3FfreeTrial&rl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&if=false&ts=1620822739077&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822738707&coo=false&exp=l1&rqm=GET")
						,
					http("SubsLiveCheckout_135")
						.get(uri18 + "/recaptcha/api2/webworker.js?hl=en&v=npGaewopg1UaB8CNtYfx-y1j"),
					http("SubsLiveCheckout_136")
						.get(uri05 + "/collect?v=1&_v=j90&a=914314344&t=pageview&_s=1&dl=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer%3FfreeTrial&dr=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&dp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer%3FfreeTrial&ul=en-us&de=UTF-8&dt=Checkout%20%7C%20Packt&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550KHLZ7JF&cg2=United%20States&cg3=Store&cg4=No%20Content%20Grouping&cd3=1620822739826.iu1eim0w&cd4=2021-05-12T18%3A02%3A19.826%2B05%3A30&cd2=1010921333.1617965825&z=1145707223")
						,
					http("SubsLiveCheckout_137")
						.get(uri21 + "/h?a=34805961&u=2865418576367765&v=1511027334766367&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&q=%3FfreeTrial&d=www.packtpub.com&t=Checkout%20%7C%20Packt&r=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&ts=1620822737672&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620822739852")
						,
					http("SubsLiveCheckout_138")
						.get(uri18 + "/recaptcha/api2/bframe?hl=en&v=npGaewopg1UaB8CNtYfx-y1j&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&cb=izib9hf5km6y")
						,
					http("SubsLiveCheckout_139")
						.get(uri16 + "/a?id=GTM-MSRQZ29&cv=240&t=ol&g=1131&p=gtm&l=3170&q=2052&f=896&e=226&i=34&d=2164&c=2192&hc=0&sr=0.050000&ps=0.030754914677036393&cb=7814944")
						,
					http("SubsLiveCheckout_140")
						.get("/tr/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer%3FfreeTrial&rl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fcloud_and_networking%2F9781838989583%2F2&if=false&ts=1620822740829&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Checkout%20%7C%20Packt%22%2C%22meta%3Adescription%22%3A%22Check%20out%20securely%20with%20Packt%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620822738707&coo=false&es=automatic&tm=3&exp=l1&rqm=GET")
						,
					http("SubsLiveCheckout_141")
						.post(uri18 + "/recaptcha/api2/reload?k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_")

						.body(RawFileBody("computerdatabase/subslivecheckout/0141_request.dat")),
					http("SubsLiveCheckout_142")
						.get(uri04 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer%3FfreeTrial&4sAIzaSyAlq0L1y9OYxZWyAiIFbxl-XPZbA0zl5Cc&callback=_xdc_._c6oaph&key=AIzaSyAlq0L1y9OYxZWyAiIFbxl-XPZbA0zl5Cc&token=102998"),
					http("SubsLiveCheckout_143")
						.get(uri11 + "/api/checkout/rateplan/packt-subscription-monthly-launch-offer/USD/true")

						))
	}

	val scn = scenario("SubsLiveCheckout").exec(Login.login,SearchandCheckout.checkout)
	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}