package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class  SubsLiveLogin extends Simulation {

	val httpProtocol = http
		.baseUrl("https://subscription.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")


    val uri01 = "https://connect.facebook.net/signals/config/445429252334850"
    val uri02 = "https://www.google-analytics.com"
    val uri03 = "https://service.maxymiser.net/cg/v5"
    val uri04 = "https://vars.hotjar.com/box-5e3cec51ed8e99df6977c199d27812d7.html"
    val uri05 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri06 = "https://api-iam.intercom.io/messenger/web/ping"
    val uri07 = "https://static.hotjar.com/c/hotjar-982604.js"
    val uri08 = "https://fonts.googleapis.com"
    val uri09 = "https://www.recaptcha.net/recaptcha/api.js"
    val uri10 = "https://static.packt-cdn.com/products"
    val uri11 = "https://users-packtlib-api.packtpub.com/v2/users/me/views/history"
    val uri12 = "https://www.facebook.com/tr"
    val uri13 = "https://subscriptions-api.packtpub.com/v1/users/me/subscriptions"
    val uri14 = "https://stats.g.doubleclick.net/j/collect"
    val uri15 = "https://cdn.polyfill.io/v2/polyfill.min.js"
    val uri16 = "https://www2.profitwell.com/dotjs/v1/quests"
    val uri17 = "https://services.packtpub.com"
    val uri18 = "https://www.googletagmanager.com/gtm.js"
    val uri20 = "https://www.google.com"
    val uri21 = "https://www.google.co.in"
    val uri22 = "https://widget.intercom.io/widget/e8mdsr07"
    val uri23 = "https://heapanalytics.com"


		// HitURL
		object LOGIN{
			val login=exec(http("SubsLiveLogin_0")
				.get("/login")
				//.headers(headers_0)
				.resources(http("SubsLiveLogin_1")
					.get(uri08 + "/css?family=Montserrat:500,400|Lato:300,400,500")
					//.headers(headers_1)
					,
					http("SubsLiveLogin_2")
						.get(uri09 + "?onload=vcRecaptchaApiLoaded&render=explicit")
					//.headers(headers_2)
					,
					http("SubsLiveLogin_3")
						.get(uri15 + "?features=default,Array.prototype.findIndex,Array.prototype.find,Array.prototype.includes&flags=gated")
					//.headers(headers_3)
					,
					http("SubsLiveLogin_4")
						.get(uri03 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Flogin%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04")
					//.headers(headers_2)
					,
					http("SubsLiveLogin_5")
						.get(uri18 + "?id=GTM-WJMM825")
				))
				.pause(1)
				.exec(http("SubsLiveLogin_6")
					.get(uri07 + "?sv=7")
					//.headers(headers_2)
					.resources(http("SubsLiveLogin_7")
						.get(uri07 + "?sv=6")
						//.headers(headers_2)
						,
						http("SubsLiveLogin_8")
							.get(uri04)
						//.headers(headers_0)
						,
						http("SubsLiveLogin_9")
							.get(uri01 + "?v=2.9.39&r=stable")
						//.headers(headers_2)
						,
						http("SubsLiveLogin_10")
							.get(uri02 + "/gtm/js?id=GTM-MSRQZ29&t=gtm13&cid=1010921333.1617965825")
						//.headers(headers_2)
						,
						http("SubsLiveLogin_11")
							.get(uri05 + "/?random=1620101588511&cv=9&fst=1620101588511&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=376635471%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&tiba=Login%20%7C%20Packt%20Subscription&hn=www.google.com&async=1&rfmt=3&fmt=4")
						//.headers(headers_2)
						,
						http("SubsLiveLogin_12")
							.get(uri20 + "/pagead/1p-user-list/945348752/?random=1620101588511&cv=9&fst=1620100800000&num=1&guid=ON&eid=376635471%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=3978087535&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y"),
						http("SubsLiveLogin_13")
							.get(uri12 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&rl=&if=false&ts=1620101589045&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620101588135&coo=false&exp=l0&rqm=GET"),
						http("SubsLiveLogin_14")
							.post(uri02 + "/j/collect?v=1&_v=j90&a=1333340005&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Login%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=aCDAAEADQAAAAC~&jid=301860479&gjid=2024881040&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&_r=1&gtm=2wg4l3WJMM825&cd3=1620101589088.9lswnout&cd4=2021-05-04T09%3A43%3A09.88%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=711701301")
						//.headers(headers_14)
						,
						http("SubsLiveLogin_15")
							.get(uri21 + "/pagead/1p-user-list/945348752/?random=1620101588511&cv=9&fst=1620100800000&num=1&guid=ON&eid=376635471%2C2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg4l3&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=3978087535&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y"),
						http("SubsLiveLogin_16")
							.get(uri02 + "/collect?v=1&_v=j90&a=1333340005&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Login%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=aCDAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&gtm=2wg4l3WJMM825&cd3=1620101588059.drhmwyd&cd4=2021-05-04T09%3A43%3A08.59%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=44006452"),
						http("SubsLiveLogin_17")
							.get(uri12 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&rl=&if=false&ts=1620101589555&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Login%20%7C%20Packt%20Subscription%22%2C%22meta%3Adescription%22%3A%22Log%20in%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Login%20%7C%20Packt%20Subscription%22%2C%22og%3Adescription%22%3A%22Log%20in%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%2Flogin%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620101588135&coo=false&es=automatic&tm=3&exp=l0&rqm=GET"),
						http("SubsLiveLogin_18")
							.post(uri14 + "?t=dc&aip=1&_r=3&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=301860479&gjid=2024881040&_gid=1978334981.1620101588&_u=aCDAAEACQAAAAC~&z=680322674")
						//.headers(headers_14)
						,
						http("SubsLiveLogin_19")
							.get(uri23 + "/h?a=34805961&u=287607950759695&v=2702966095916387&s=3063356373960159&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=1&h=%2Flogin&d=subscription.packtpub.com&t=Login%20%7C%20Packt%20Subscription&ts=1620101588279&st=1620101589159"),
						http("SubsLiveLogin_20")
							.get(uri20 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=301860479&_u=aCDAAEACQAAAAC~&z=2001582136"),
						http("SubsLiveLogin_21")
							.get(uri21 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=301860479&_u=aCDAAEACQAAAAC~&z=2001582136"),
						http("SubsLiveLogin_22")
							.get(uri22)
						//.headers(headers_2)
					))
				.pause(27)
				.exec(http("SubsLiveLogin_23")
					.get(uri23 + "/h?a=34805961&u=287607950759695&v=2702966095916387&s=3063356373960159&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1620101588279&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2Flogin&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2Flogin&pp=t&pp=Login%20%7C%20Packt%20Subscription&pp=ts&pp=1620101588279&id0=6693992105992400&t0=change&n0=input&c0=form-control&i0=login-input-email&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40input%3B%23login-input-email%3B.form-control%3B%5Bautofocus%3D%5D%3B%5Bname%3Demail%5D%3B%5Bplaceholder%3DEmail%20address%5D%3B%5Brequired%3D%5D%3B%5Btype%3Demail%5D%3B%7C&ts0=1620101617997&id1=7211015526630912&t1=click&n1=input&c1=form-control%20mb20&i1=login-input-password&y1=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40input%3B%23login-input-password%3B.form-control%3B.mb20%3B%5Bname%3Dpassword%5D%3B%5Bplaceholder%3DPassword%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dpassword%5D%3B%7C&ts1=1620101618107&st=1620101618411"))
				.pause(9)
				.exec(http("SubsLiveLogin_24")
					.post(uri12 + "/")
					//.headers(headers_24)
					.body(RawFileBody("computerdatabase/subslivelogin/0024_request.dat"))
					.resources(http("SubsLiveLogin_25")
						.options(uri17 + "/auth-v1/users/tokens")
						//.headers(headers_25)
						,
						http("SubsLiveLogin_26")
							.get(uri23 + "/h?a=34805961&u=287607950759695&v=2702966095916387&s=3063356373960159&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1620101588279&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2Flogin&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2Flogin&pp=t&pp=Login%20%7C%20Packt%20Subscription&pp=ts&pp=1620101588279&id0=6084229149056751&t0=change&n0=input&c0=form-control%20mb20&i0=login-input-password&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40input%3B%23login-input-password%3B.form-control%3B.mb20%3B%5Bname%3Dpassword%5D%3B%5Bplaceholder%3DPassword%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dpassword%5D%3B%7C&ts0=1620101627476&id1=2038093708269643&t1=click&n1=button&c1=btn%20btn-lg%20btn-primary%20btn-block&y1=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40button%3B.btn%3B.btn-block%3B.btn-lg%3B.btn-primary%3B%5Bng-show%3D!loginController.loadingLogin%5D%3B%5Btype%3Dsubmit%5D%3B%7C&ts1=1620101627562&x1=Sign%20In&id2=8759276533827678&t2=submit&n2=form&c2=form-signin%20ng-pristine%20ng-valid&y2=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C&ts2=1620101627598&x2=Sign%20In&st=1620101628448"),
						http("SubsLiveLogin_27")
							.post(uri17 + "/auth-v1/users/tokens")
							//.headers(headers_27)
							.body(RawFileBody("computerdatabase/subslivelogin/0027_request.json")),
						http("SubsLiveLogin_28")
							.get(uri17 + "/timed-unlock-v0/timed-unlock/current")
						//.headers(headers_28)
						//.check(status.is(404))
						,
						http("SubsLiveLogin_29")
							.get(uri23 + "/h?a=34805961&u=287607950759695&v=3586865799493027&s=3063356373960159&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&ts=1620101631964&pr=%2Flogin&sp=ts&sp=1620101588279&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2Flogin&st=1620101631964"),
						http("SubsLiveLogin_30")
							.options(uri17 + "/b2b-accounts-v1/users/me/roles-and-subjects")
						//.headers(headers_30)
						,
						http("SubsLiveLogin_31")
							.options(uri17 + "/skills-v1/users/me/learning-paths")
						//.headers(headers_30)
						,
						http("SubsLiveLogin_32")
							.options(uri13 + "?active=false")
						//.headers(headers_30)
						,
						http("SubsLiveLogin_33")
							.options(uri11 + "?limit=4&offset=0")
						//.headers(headers_30)
						,
						http("SubsLiveLogin_34")
							.get(uri17 + "/b2b-accounts-v1/users/me/roles-and-subjects")
						//.headers(headers_34)
						,
						http("SubsLiveLogin_35")
							.get(uri13 + "?active=false")
						//.headers(headers_34)
						,
						http("SubsLiveLogin_36")
							.get("/")
						//.headers(headers_0)
						,
						http("SubsLiveLogin_37")
							.get(uri17 + "/skills-v1/users/me/learning-paths")
						//.headers(headers_34)
						,
						http("SubsLiveLogin_38")
							.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
						//.headers(headers_1)
						,
						http("SubsLiveLogin_39")
							.get("/css/app.css?id=db6ae105ac48a0097ba5")
						//.headers(headers_1)
						,
						http("SubsLiveLogin_40")
							.get(uri08 + "/css?family=Montserrat")
						//.headers(headers_1)
						,
						http("SubsLiveLogin_41")
							.get(uri08 + "/css?family=Nunito")
						//.headers(headers_1)
						,
						http("SubsLiveLogin_42")
							.get(uri08 + "/css2?family=Roboto+Mono:wght@500&display=swap")
						//.headers(headers_1)
						,
						http("SubsLiveLogin_43")
							.get("/js/react.js?id=97eefc16b386e857048b")
						//.headers(headers_2)
						,
						http("SubsLiveLogin_44")
							.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
						//.headers(headers_44)
						,
						http("SubsLiveLogin_45")
							.get(uri23 + "/api/telemetry?a=34805961&te=type&te=data&te=cm&te=resetIdentityTelemetry%20-%20identified%20user&st=1620101634593&hv=4.14.0"),
						http("SubsLiveLogin_46")
							.get("/api/users/me/subscriptions")
						//.headers(headers_46)
						,
						http("SubsLiveLogin_47")
							.get(uri07 + "?sv=7")
						//.headers(headers_47)
						,
						http("SubsLiveLogin_48")
							.get(uri23 + "/api/identify_v3?a=34805961&u=4948129760563764&v=2731211902278311&s=7120445548684719&i=3527b4e1-3f46-4152-9ef1-355ede4ee680&b=web&tv=4.0&z=0&st=1620101634599"),
						http("SubsLiveLogin_49")
							.get(uri23 + "/h?a=34805961&u=287607950759695&v=894237919204780&s=3063356373960159&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620101634592&pr=%2F&sp=ts&sp=1620101588279&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2Flogin&st=1620101635922"),
						http("SubsLiveLogin_50")
							.get(uri02 + "/collect?v=1&_v=j90&a=1070903153&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1978334981.1620101588&gtm=2wg4l3WJMM825&cd1=3527b4e1-3f46-4152-9ef1-355ede4ee680&cd3=1620101635906.sx5lzxb4&cd4=2021-05-04T09%3A43%3A55.906%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=1196402276"),
						http("SubsLiveLogin_51")
							.get(uri12 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620101636426&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620101635442&coo=false&es=automatic&tm=3&exp=l1&rqm=GET"),
						http("SubsLiveLogin_52")
							.get(uri12 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620101635882&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620101635442&coo=false&exp=l1&rqm=GET"),
						http("SubsLiveLogin_53")
							.get(uri23 + "/h?a=34805961&u=4948129760563764&v=2731211902278311&s=7120445548684719&b=web&tv=4.0&z=0&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620101634597&pr=%2F&st=1620101635922"),
						http("SubsLiveLogin_54")
							.get(uri22)
						//.headers(headers_2)
						,
						http("SubsLiveLogin_55")
							.get("/images/playlist.svg"),
						http("SubsLiveLogin_56")
							.get("/images/credits.svg"),
						http("SubsLiveLogin_57")
							.get("/images/video.svg"),
						http("SubsLiveLogin_58")
							.get("/images/book.svg"),
						http("SubsLiveLogin_59")
							.get("/images/learning-path.svg"),
						http("SubsLiveLogin_60")
							.get("/images/bookmark.svg"),
						http("SubsLiveLogin_61")
							.options(uri16 + "/customer/?user_email=undefined&custom_styles=%7B%7D")
						//.headers(headers_30)
						,
						http("SubsLiveLogin_62")
							.get("/images/home.svg"),
						http("SubsLiveLogin_63")
							.get("/images/purchases.svg"),
						http("SubsLiveLogin_64")
							.get(uri10 + "/9781789955248/cover/smaller"),
						http("SubsLiveLogin_65")
							.get("/images/note.svg"),
						http("SubsLiveLogin_66")
							.get(uri10 + "/9781789953435/cover/smaller"),
						http("SubsLiveLogin_67")
							.get(uri10 + "/9781801076609/cover/smaller"),
						http("SubsLiveLogin_68")
							.get(uri10 + "/9781838821692/cover/smaller"),
						http("SubsLiveLogin_69")
							.get(uri10 + "/9781801817004/cover/smaller"),
						http("SubsLiveLogin_70")
							.get(uri10 + "/9781801078863/cover/smaller"),
						http("SubsLiveLogin_71")
							.get(uri16 + "/customer/?user_email=undefined&custom_styles=%7B%7D")
						//.headers(headers_71)
						//.check(status.is(400))
						,
						http("SubsLiveLogin_72")
							.get(uri10 + "/9781838989583/cover/smaller"),
						http("SubsLiveLogin_73")
							.get(uri10 + "/9781801071833/cover/smaller"),
						http("SubsLiveLogin_74")
							.get(uri10 + "/9781800206137/cover/smaller"),
						http("SubsLiveLogin_75")
							.get(uri10 + "/9781801072991/cover/smaller"),
						http("SubsLiveLogin_76")
							.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
						//.headers(headers_44)
						,
						http("SubsLiveLogin_77")
							.get(uri10 + "/9781800563452/cover/smaller"),
						http("SubsLiveLogin_78")
							.get(uri10 + "/9781801076944/cover/smaller"),
						http("SubsLiveLogin_79")
							.options(uri16 + "/error/")
						//.headers(headers_79)
						,
						http("SubsLiveLogin_80")
							.get(uri10 + "/9781838982881/cover/smaller"),
						http("SubsLiveLogin_81")
							.get(uri10 + "/9781801075107/cover/smaller"),
						http("SubsLiveLogin_82")
							.get(uri10 + "/9781839219931/cover/smaller"),
						http("SubsLiveLogin_83")
							.get(uri10 + "/9781801074063/cover/smaller"),
						http("SubsLiveLogin_84")
							.get(uri10 + "/9781800562882/cover/smaller"),
						http("SubsLiveLogin_85")
							.get(uri10 + "/9781800568105/cover/smaller"),
						http("SubsLiveLogin_86")
							.post(uri16 + "/error/")
							//.headers(headers_71)
							.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21059
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21772
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/A.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
							.formParam("user_email", "undefined"),
						http("SubsLiveLogin_87")
							.get(uri10 + "/9781839217289/cover/smaller"),
						http("SubsLiveLogin_88")
							.get(uri10 + "/9781789801217/cover/smaller"),
						http("SubsLiveLogin_89")
							.get(uri10 + "/9781839217715/cover/smaller"),
						http("SubsLiveLogin_90")
							.get(uri10 + "/9781838554590/cover/smaller"),
						http("SubsLiveLogin_91")
							.get(uri10 + "/9781800207806/cover/smaller"),
						http("SubsLiveLogin_92")
							.get(uri10 + "/9781838645649/cover/smaller"),
						http("SubsLiveLogin_93")
							.post(uri06)
							//.headers(headers_93)
							.formParam("app_id", "e8mdsr07")
							.formParam("v", "3")
							.formParam("g", "94606507e950ed272f3cd73b1b49b4c9ff610b63")
							.formParam("s", "424ed5ee-3ccc-4434-a82f-3db86facafb9")
							.formParam("r", "https://subscription.packtpub.com/")
							.formParam("platform", "web")
							.formParam("Idempotency-Key", "3498c0aa915860bf")
							.formParam("internal", "{}")
							.formParam("page_title", "Packt Subscription | Advance your knowledge in tech")
							.formParam("user_active_company_id", "undefined")
							.formParam("user_data", """{"email":"ashishtrivedi@packtpub.com","user_id":"3527b4e1-3f46-4152-9ef1-355ede4ee680","name":"ASHISH TRIVEDI"}""")
							.formParam("source", "apiBoot")
							.formParam("sampling", "false")
							.formParam("referer", "https://subscription.packtpub.com/")))
		}

	val anyUser = scenario("SubsLiveLogin").exec(LOGIN.login)

	setUp(anyUser.inject(nothingFor(5),
		  atOnceUsers(users =1),
			rampUsers(users = 5)during(10),
			constantUsersPerSec(rate = 20) during(20)
	))
		.protocols(httpProtocol)
}