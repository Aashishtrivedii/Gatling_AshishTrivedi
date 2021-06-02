package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SubsStagingLogin extends Simulation {

	//val duration = Duration(1, MINUTES)

	val httpProtocol = http
		.baseUrl("https://subscription-staging.packtpub.com/")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")



    val uri01 = "https://www.google-analytics.com"
    val uri02 = "https://www.facebook.com/tr"
    val uri03 = "https://users-packtlib-api-staging.packtpub.com/v2/users/me/views/history"
    val uri05 = "https://www2.profitwell.com/dotjs/v1/quests/error"
    val uri06 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri07 = "https://services-staging.packtpub.com/auth-v1/users/tokens"
    val uri08 = "https://static.hotjar.com/c/hotjar-982604.js"
    val uri09 = "https://subscription-staging.packtpub.com"
    val uri10 = "https://service.maxymiser.net/cg/v5"
    val uri11 = "https://subscriptions-api-staging.packtpub.com/v1/users/me/subscriptions"
    val uri12 = "https://www.google.com"
    val uri13 = "https://static-staging.packt-cdn.com/products"
    val uri14 = "https://www.google.co.in"
    val uri15 = "https://api-iam.intercom.io/messenger/web"
    val uri16 = "https://firefox.settings.services.mozilla.com/v1"
    val uri17 = "https://widget.intercom.io/widget/lts26lhx"
    val uri18 = "https://heapanalytics.com"


    //SignIn
	object SignIn{
			val signin= exec(http("SubsStagingLogin_2")
				.post(uri02 + "/")

				.body(RawFileBody("computerdatabase/subsstaginglogin/0002_request.dat"))
				.resources(http("SubsStagingLogin_3")
					.get(uri09 + "/login")
					,
					http("SubsStagingLogin_4")
						.get(uri10 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription-staging.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription-staging.packtpub.com%252Flogin%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("SubsStagingLogin_5")
						.get(uri18 + "/h?a=34805961&u=287607950759695&v=2802466405149936&s=6381968155230922&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618559864480&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1618559893097&pp=pr&pp=%2F&id0=6088181620106205&t0=click&n0=a&c0=nav-link-subscribe%20btn-primary&h0=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&y0=%40div%3B%23root%3B%7C%40nav%3B%23primary-navigation%3B.navigation%3B.subs-homepage-header-container%3B%7C%40div%3B.container-fluid%3B.navigation__inner%3B%7C%40div%3B.navigation__right%3B%7C%40ul%3B.menu%3B%7C%40li%3B.menu__item%3B.menu__link%3B%7C%40a%3B.btn-primary%3B.nav-link-subscribe%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin%5D%3B%5Btarget%3D_blank%5D%3B%7C&ts0=1618559929834&x0=Sign%20in&st=1618559932177")
					,
					http("SubsStagingLogin_6")
						.get(uri08 + "?sv=7")
					,
					http("SubsStagingLogin_7")
						.post(uri01 + "/j/collect?v=1&_v=j89&a=1036196452&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Login%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=414896983&gjid=1501260055&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1972451571.1618470583&_r=1&gtm=2wg472WJMM825&cd3=1618559932956.1ibisp75&cd4=2021-04-16T13%3A28%3A52.956%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=215083121")
					,
					http("SubsStagingLogin_8")
						.get(uri06 + "/?random=1618559932137&cv=9&fst=1618559932137&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("SubsStagingLogin_9")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618559933008&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1618559932695&coo=false&rqm=GET")
					,
					http("SubsStagingLogin_10")
						.get(uri01 + "/collect?v=1&_v=j89&a=1036196452&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Login%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQAAAAC~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1972451571.1618470583&gtm=2wg472WJMM825&cd3=1618559931971.smlspvic&cd4=2021-04-16T13%3A28%3A51.971%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=1663190736")
					,
					http("SubsStagingLogin_11")
						.get(uri08 + "?sv=6")
					,
					http("SubsStagingLogin_12")
						.get(uri12 + "/pagead/1p-user-list/945348752/?random=1618559932137&cv=9&fst=1618556400000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=52052683&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
					http("SubsStagingLogin_13")
						.get(uri14 + "/pagead/1p-user-list/945348752/?random=1618559932137&cv=9&fst=1618556400000&num=1&guid=ON&eid=2505059651&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=52052683&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
					http("SubsStagingLogin_14")
						.get(uri18 + "/h?a=3992788168&u=558546027102160&v=1884597342246971&s=1451122120772371&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=1&h=%2Flogin&d=subscription-staging.packtpub.com&t=Login%20%7C%20Packt%20Subscription&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1618559932404&pr=%2F&st=1618559932404")
					,
					http("SubsStagingLogin_15")
						.get(uri02 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618559933529&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Login%20%7C%20Packt%20Subscription%22%2C%22meta%3Adescription%22%3A%22Log%20in%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Login%20%7C%20Packt%20Subscription%22%2C%22og%3Adescription%22%3A%22Log%20in%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription-staging.packtpub.com%2Flogin%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd2aov160eccqlv.cloudfront.net%2F7d2e437f5ad848f68a441c36c5dee466%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd2aov160eccqlv.cloudfront.net%2F7d2e437f5ad848f68a441c36c5dee466%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1618559932695&coo=false&es=automatic&tm=3&rqm=GET")
					,
					http("SubsStagingLogin_16")
						.get(uri17),
					http("SubsStagingLogin_17")
						.get(uri12 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=414896983&_u=SCCAAEACQAAAAC~&z=1750231798")
					,
					http("SubsStagingLogin_18")
						.get(uri14 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j89&tid=UA-284627-1&cid=1010921333.1617965825&jid=414896983&_u=SCCAAEACQAAAAC~&z=1750231798")
					,
					http("SubsStagingLogin_19")
						.options(uri07)
					,
					http("SubsStagingLogin_20")
						.post(uri02 + "/")

						.body(RawFileBody("computerdatabase/subsstaginglogin/0020_request.dat")),
					http("SubsStagingLogin_21")
						.get(uri18 + "/h?a=3992788168&u=558546027102160&v=1884597342246971&s=1451122120772371&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618559932404&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Flogin&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Flogin&pp=t&pp=Login%20%7C%20Packt%20Subscription&pp=ts&pp=1618559932404&pp=pr&pp=%2F&id0=7946974824597581&t0=change&n0=input&c0=form-control&i0=login-input-email&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40input%3B%23login-input-email%3B.form-control%3B%5Bautofocus%3D%5D%3B%5Bname%3Demail%5D%3B%5Bplaceholder%3DEmail%20address%5D%3B%5Brequired%3D%5D%3B%5Btype%3Demail%5D%3B%7C&ts0=1618559935455&id1=1916926771390038&t1=click&n1=span&y1=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40button%3B.btn%3B.btn-block%3B.btn-lg%3B.btn-primary%3B%5Bng-show%3D!loginController.loadingLogin%5D%3B%5Btype%3Dsubmit%5D%3B%7C%40span%3B%7C&ts1=1618559935574&x1=Sign%20In&id2=550335472846369&t2=submit&n2=form&c2=form-signin%20ng-pristine%20ng-valid&y2=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C&ts2=1618559935593&x2=Sign%20In&st=1618559936437")
					,
					http("SubsStagingLogin_22")
						.post(uri07)

						.body(RawFileBody("computerdatabase/subsstaginglogin/0022_request.json")),
					http("SubsStagingLogin_23")
						.options(uri11 + "?active=false")
					,
					http("SubsStagingLogin_24")
						.options(uri03 + "?limit=4&offset=0")
					,
					http("SubsStagingLogin_25")
						.get(uri11 + "?active=false")
					,
					http("SubsStagingLogin_26")
						.get(uri09 + "/")
					,
					http("SubsStagingLogin_27")
						.get(uri18 + "/h?a=3992788168&u=558546027102160&v=5405747862972122&s=1451122120772371&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1618559941504&pr=%2Flogin&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618559932404&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Flogin&st=1618559941505")
					,
					http("SubsStagingLogin_28")
						.get(uri08 + "?sv=7")
					,
					http("SubsStagingLogin_29")
						.get(uri09 + "/api/users/me/subscriptions")
					,
					http("SubsStagingLogin_30")
						.get(uri18 + "/api/identify_v3?a=34805961&u=287607950759695&v=114977094997570&s=6381968155230922&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1618559944004")
					,
					http("SubsStagingLogin_31")
						.get(uri18 + "/h?a=34805961&u=287607950759695&v=114977094997570&s=6381968155230922&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1618559944003&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&sp=ts&sp=1618559864480&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2F&st=1618559944781")
					,
					http("SubsStagingLogin_32")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618559944750&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1618559944363&coo=false&rqm=GET")
					,
					http("SubsStagingLogin_33")
						.get(uri01 + "/collect?v=1&_v=j89&a=370241740&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1972451571.1618470583&gtm=2wg472WJMM825&cd1=d12c50a2-843a-43de-96ba-360e39c985a4&cd3=1618559944769.ton29t37&cd4=2021-04-16T13%3A29%3A04.769%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=145206024")
					,
					http("SubsStagingLogin_34")
						.get(uri02 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1618559945285&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1618559944363&coo=false&es=automatic&tm=3&rqm=GET")
					,
					http("SubsStagingLogin_35")
						.get(uri17)
						.check(status.is(400)),
					http("SubsStagingLogin_36")
						.post(uri05 + "/")
						.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21059
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21772
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/A.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
						.formParam("user_email", "undefined"),
					http("SubsStagingLogin_37")
						.post(uri15 + "/ping")
						.formParam("app_id", "lts26lhx")
						.formParam("v", "3")
						.formParam("g", "c5ebfac91748ab22139b809ebd37817152f2ffbc")
						.formParam("s", "0a3ce82d-c439-4a96-bbc4-a4ebbed0b97d")
						.formParam("r", "https://subscription-staging.packtpub.com/")
						.formParam("platform", "web")
						.formParam("Idempotency-Key", "97190712210117f0")
						.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","anonymous_id":"608f08d2-acce-42a0-bc66-cff1675567fb","name":"test JumpInJhapaak"}""")
						.formParam("internal", "{}")
						.formParam("page_title", "Packt Subscription | Advance your knowledge in tech")
						.formParam("user_active_company_id", "undefined")
						.formParam("source", "apiBoot")
						.formParam("sampling", "false")
						.formParam("referer", "https://subscription-staging.packtpub.com/")
						.formParam("anonymous_session", "N1M1cStmV0VGRnFXMlJtYlF6ZkpnZnZGOVQxbjZ2MnAyWnY3bEZURkFnMDM3MUtXLzYzU0UrMXpPbTVBR0pRcC0ta0xGZEh0dGVvVm5pMmFiQzNzalNvUT09--6efb3ef06751e2f9d56da9e32a58a8e5c4f03cf2"),
					http("SubsStagingLogin_38")
						.get(uri09 + "/api/subscription/home")
					,
					http("SubsStagingLogin_39")
						.get(uri13 + "/9781838645649/cover/smaller")
					,
					http("SubsStagingLogin_40")
						.get(uri13 + "/9781839217289/cover/smaller")
						.check(status.is(403))))
				.pause(4)
				.exec(http("SubsStagingLogin_41")
					.post(uri15 + "/conversations/unread")
					.formParam("app_id", "lts26lhx")
					.formParam("v", "3")
					.formParam("g", "c5ebfac91748ab22139b809ebd37817152f2ffbc")
					.formParam("s", "f119c048-5b5c-479a-842a-cce8b81c9c6c")
					.formParam("r", "https://subscription-staging.packtpub.com/")
					.formParam("platform", "web")
					.formParam("Idempotency-Key", "274a29f5bbc5cbbe")
					.formParam("user_data", """{"email":"jumpinjhapaak@test.com","user_id":"d12c50a2-843a-43de-96ba-360e39c985a4","anonymous_id":"608f08d2-acce-42a0-bc66-cff1675567fb"}""")
					.formParam("internal", "")
					.formParam("page_title", "Packt Subscription | Advance your knowledge in tech")
					.formParam("user_active_company_id", "-1")
					.formParam("referer", "https://subscription-staging.packtpub.com/")
					.formParam("anonymous_session", "N1M1cStmV0VGRnFXMlJtYlF6ZkpnZnZGOVQxbjZ2MnAyWnY3bEZURkFnMDM3MUtXLzYzU0UrMXpPbTVBR0pRcC0ta0xGZEh0dGVvVm5pMmFiQzNzalNvUT09--6efb3ef06751e2f9d56da9e32a58a8e5c4f03cf2"))

		}

		val signedInUser = scenario("SubsStagingLogin").exec(SignIn.signin)


	setUp(signedInUser.inject(nothingFor(5),
		atOnceUsers(users =1),
		rampUsers(users = 5)during(10),
		constantUsersPerSec(rate = 20) during(20)
	))
		.protocols(httpProtocol)
}