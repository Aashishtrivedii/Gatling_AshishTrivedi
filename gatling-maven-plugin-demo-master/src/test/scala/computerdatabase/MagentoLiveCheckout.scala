package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class MagentoLiveCheckout extends Simulation {

	val httpProtocol = http
		.baseUrl("https://subscription.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")



    val uri01 = "https://bam-cell.nr-data.net/1/NRJS-0f4d86b78cc0c8047b9"
    val uri02 = "https://api.feefo.com/api"
    val uri03 = "https://service.maxymiser.net/cg/v5"
    val uri04 = "https://ww2.feefo.com/api/ecommerce/plugin/widget/merchant/packt-publishing"
    val uri05 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri06 = "https://geolocation-api.packtpub.com/v1/location"
    val uri07 = "https://consent.linksynergy.com/consent/v2/p"
    val uri08 = "https://insight.adsrvr.org/track/evnt"
    val uri09 = "https://fonts.googleapis.com/css"
    val uri10 = "https://www.google-analytics.com"
    val uri11 = "https://dpm.demdex.net/ibs:dpid=903&dpuuid=25d07d61-7f39-4d01-9f35-9fdc6f2a6fdf&gdpr=0&gdpr_consent=&redir=https%3A%2F%2Fmatch.adsrvr.org%2Ftrack%2Fcmf%2Fgeneric%3Fttd_pid%3Daam"
    val uri12 = "https://www.recaptcha.net/recaptcha/api.js"
    val uri13 = "https://static.packt-cdn.com"
    val uri14 = "https://users-packtlib-api.packtpub.com/v2/users/me"
    val uri15 = "https://www.facebook.com/tr"
    val uri16 = "https://subscriptions-api.packtpub.com/v1/users/me"
    val uri17 = "https://www.packtpub.com"
    val uri18 = "https://stats.g.doubleclick.net/j/collect"
    val uri19 = "https://polyfill.io/v3/polyfill.min.js"
    val uri20 = "https://nypi.dc-storm.com/t"
    val uri21 = "https://packt-reader-content-production.s3.eu-west-1.amazonaws.com/9781800206137"
    val uri22 = "https://www2.profitwell.com/dotjs/v1/quests"
    val uri23 = "https://services.packtpub.com"
    val uri24 = "https://www.googletagmanager.com/gtm.js"
    val uri26 = "https://www.google.com"
    val uri27 = "https://ut.rd.linksynergy.com/t"
    val uri28 = "https://match.adsrvr.org/track/cmf/generic"
    val uri29 = "https://www.google.co.in"
    val uri30 = "https://static.hotjar.com/c"
    val uri31 = "https://tags.rd.linksynergy.com"
    val uri32 = "https://ut.ra.linksynergy.com/t"
    val uri33 = "https://widget.intercom.io/widget/e8mdsr07"
    val uri34 = "https://heapanalytics.com/h"

	val scn = scenario("MagentoLiveCheckout")
		// LOGIN
		object LOGIN{
			val login=exec(http("MagentoLiveCheckout_0")
				.get(uri34 + "?a=34805961&u=2865418576367765&v=1525062591306461&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1620824013030&pp=pr&pp=%2F&id0=8211738731990493&t0=click&n0=a&c0=nav-link-subscribe%20btn-primary&h0=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&y0=%40div%3B%23root%3B%7C%40nav%3B%23primary-navigation%3B.navigation%3B.subs-homepage-header-container%3B%7C%40div%3B.container-fluid%3B.navigation__inner%3B%7C%40div%3B.navigation__right%3B%7C%40ul%3B.menu%3B%7C%40li%3B.menu__item%3B.menu__link%3B%7C%40a%3B.btn-primary%3B.nav-link-subscribe%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription.packtpub.com%2Flogin%5D%3B%5Btarget%3D_blank%5D%3B%7C&ts0=1620824030758&x0=Sign%20in&st=1620824031092")

				.resources(http("MagentoLiveCheckout_1")
					.post(uri15 + "/")

					.body(RawFileBody("computerdatabase/magentolivecheckout/0001_request.dat")),
					http("MagentoLiveCheckout_2")
						.get("/login")
						,
					http("MagentoLiveCheckout_3")
						.get(uri12 + "?onload=vcRecaptchaApiLoaded&render=explicit"),
					http("MagentoLiveCheckout_4")
						.get(uri03 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Flogin%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("MagentoLiveCheckout_5")
						.get(uri30 + "/hotjar-982604.js?sv=7")
						,
					http("MagentoLiveCheckout_6")
						.get(uri10 + "/collect?v=1&_v=j90&a=901507144&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Login%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd3=1620824033375.pp0olpe8&cd4=2021-05-12T18%3A23%3A53.375%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=1359902917")
						,
					http("MagentoLiveCheckout_7")
						.get(uri15 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620824033412&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620824033355&coo=false&exp=l0&rqm=GET")
						,
					http("MagentoLiveCheckout_8")
						.get(uri30 + "/hotjar-982604.js?sv=6")
						,
					http("MagentoLiveCheckout_9")
						.get(uri10 + "/collect?v=1&_v=j90&a=901507144&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&dp=%2Flogin&ul=en-us&de=UTF-8&dt=Login%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd3=1620824033025.ih034qg&cd4=2021-05-12T18%3A23%3A53.25%2B05%3A30&cd12=Logged%20out&cd2=1010921333.1617965825&z=960419598")
						,
					http("MagentoLiveCheckout_10")
						.get(uri05 + "/?random=1620824033095&cv=9&fst=1620824033095&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("MagentoLiveCheckout_11")
						.get(uri34 + "?a=34805961&u=2865418576367765&v=3172854127462153&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2Flogin&d=subscription.packtpub.com&t=Login%20%7C%20Packt%20Subscription&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620824033239&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620824033451")
						,
					http("MagentoLiveCheckout_12")
						.get(uri26 + "/pagead/1p-user-list/945348752/?random=1620824033095&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=1158489069&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
						,
					http("MagentoLiveCheckout_13")
						.get(uri29 + "/pagead/1p-user-list/945348752/?random=1620824033095&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Login%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=1158489069&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
						,
					http("MagentoLiveCheckout_14")
						.get(uri15 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2Flogin&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620824033920&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Login%20%7C%20Packt%20Subscription%22%2C%22meta%3Adescription%22%3A%22Log%20in%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Login%20%7C%20Packt%20Subscription%22%2C%22og%3Adescription%22%3A%22Log%20in%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%2Flogin%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620824033355&coo=false&es=automatic&tm=3&exp=l0&rqm=GET")
						,
					http("MagentoLiveCheckout_15")
						.get(uri34 + "?a=34805961&u=2865418576367765&v=3172854127462153&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2Flogin&pp=t&pp=Login%20%7C%20Packt%20Subscription&pp=ts&pp=1620824033239&pp=pr&pp=%2F&id0=7790977126305499&t0=change&n0=input&c0=form-control%20mb20&i0=login-input-password&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B%23login-form%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B.form-signin%3B.ng-pristine%3B.ng-valid%3B%5Bname%3Dsign-in-form%5D%3B%5Bng-submit%3DloginController.login()%5D%3B%7C%40input%3B%23login-input-password%3B.form-control%3B.mb20%3B%5Bname%3Dpassword%5D%3B%5Bplaceholder%3DPassword%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dpassword%5D%3B%7C&ts0=1620824033122&st=1620824033452")
						,
					http("MagentoLiveCheckout_16")
						.get(uri33),
					http("MagentoLiveCheckout_17")
						.post(uri15 + "/")
						.body(RawFileBody("computerdatabase/magentolivecheckout/0017_request.dat"))))
				.pause(1)
				.exec(http("MagentoLiveCheckout_18")
					.options(uri23 + "/auth-v1/users/tokens")
					.resources(http("MagentoLiveCheckout_19")
						.post(uri23 + "/auth-v1/users/tokens")
						.body(RawFileBody("computerdatabase/magentolivecheckout/0019_request.json")),
						http("MagentoLiveCheckout_20")
							.get(uri34 + "?a=34805961&u=2865418576367765&v=2551567443065760&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620824039272&pr=%2Flogin&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620824039272")
							.headers(headers_0),
						http("MagentoLiveCheckout_21")
							.options(uri23 + "/b2b-accounts-v1/users/me/roles-and-subjects")
							.headers(headers_21),
						http("MagentoLiveCheckout_22")
							.options(uri16 + "/subscriptions?active=false")
							.headers(headers_21),
						http("MagentoLiveCheckout_23")
							.get(uri23 + "/b2b-accounts-v1/users/me/roles-and-subjects")
							.headers(headers_23),
						http("MagentoLiveCheckout_24")
							.get("/")
							.headers(headers_2),
						http("MagentoLiveCheckout_25")
							.get(uri33),
						http("MagentoLiveCheckout_26")
							.get(uri30 + "/hotjar-982604.js?sv=7")
							.headers(headers_5),
						http("MagentoLiveCheckout_27")
							.get(uri22 + "/customer/?user_email=undefined&custom_styles=%7B%7D")
							.headers(headers_27)
							.check(status.is(400)),
						http("MagentoLiveCheckout_28")
							.get("/api/users/me/subscriptions")
							.headers(headers_28),
						http("MagentoLiveCheckout_29")
							.post(uri22 + "/error/")
							.headers(headers_27)
							.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21059
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21772
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/A.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
							.formParam("user_email", "undefined"),
						http("MagentoLiveCheckout_30")
							.get(uri15 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620824042641&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620824041822&coo=false&exp=l0&rqm=GET")
							.headers(headers_0),
						http("MagentoLiveCheckout_31")
							.get(uri10 + "/collect?v=1&_v=j90&a=940260132&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd1=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&cd3=1620824042659.1nshegq8&cd4=2021-05-12T18%3A24%3A02.659%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=1459788346")
							.headers(headers_0),
						http("MagentoLiveCheckout_32")
							.get(uri34 + "?a=34805961&u=2865418576367765&v=2481411513393840&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2F&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620824041153&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620824042673")
							.headers(headers_0),
						http("MagentoLiveCheckout_33")
							.get(uri15 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2F&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620824043152&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription.packtpub.com%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fb7413d51328b4e7ab8ebf6e19b87cc1d%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620824041822&coo=false&es=automatic&tm=3&exp=l0&rqm=GET")
							.headers(headers_0),
						http("MagentoLiveCheckout_34")
							.get("/api/subscription/home")
							.headers(headers_28)))
				.pause(1)
		}

	// TITLE SELECTION & CHECKOUT
		object ChekOut{
			val checkout=exec(http("MagentoLiveCheckout_35")
				.get("/book/data/9781800206137/1")
				.headers(headers_2)
				.resources(http("MagentoLiveCheckout_36")
					.get(uri03 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Fbook%252Fdata%252F9781800206137%252F1%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("MagentoLiveCheckout_37")
						.get(uri12 + "?onload=vcRecaptchaApiLoaded&render=explicit"),
					http("MagentoLiveCheckout_38")
						.options(uri23 + "/users-v1/users/me")
						.headers(headers_21),
					http("MagentoLiveCheckout_39")
						.get(uri13 + "/products/9781800206137/summary")
						.headers(headers_39),
					http("MagentoLiveCheckout_40")
						.options(uri14 + "/views/history?limit=6&offset=0")
						.headers(headers_21),
					http("MagentoLiveCheckout_41")
						.get(uri34 + "?a=34805961&u=2865418576367765&v=2481411513393840&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&pp=ts&pp=1620824041153&pp=pr&pp=%2F&id0=6823368948037695&t0=click&n0=a&h0=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&y0=%40div%3B%23root%3B%7C%40main%3B.subscription-content-container%3B%5Brole%3Dmain%5D%3B%7C%40section%3B.jumpBackIn-section%3B.row%3B%7C%40div%3B.col-12%3B%7C%40div%3B.slick-initialized%3B.slick-slider%3B%7C%40div%3B.slick-list%3B%7C%40div%3B.slick-track%3B%7C%40div%3B.slick-active%3B.slick-slide%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-index%3D1%5D%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B%7C%40div%3B%5Btabindex%3D-1%5D%3B%7C%40div%3B.jumpBackIn-media%3B.media%3B%7C%40div%3B.media-body%3B%7C%40a%3B%5Bhref%3Dhttps%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1%5D%3B%7C&ts0=1620824063528&x0=Deep%20Learning%20from%20the%20Basics&st=1620824065863")
						.headers(headers_0),
					http("MagentoLiveCheckout_42")
						.options(uri23 + "/b2b-accounts-v1/users/me/roles-and-subjects")
						.headers(headers_21),
					http("MagentoLiveCheckout_43")
						.options(uri23 + "/users-v1/users/me/metadata")
						.headers(headers_21),
					http("MagentoLiveCheckout_44")
						.get(uri23 + "/products-v1/products/9781800206137/types")
						.headers(headers_44),
					http("MagentoLiveCheckout_45")
						.options(uri23 + "/lists-v1/users/me/playlists")
						.headers(headers_21),
					http("MagentoLiveCheckout_46")
						.get(uri23 + "/users-v1/users/me")
						.headers(headers_23),
					http("MagentoLiveCheckout_47")
						.get(uri23 + "/lists-v1/users/me/playlists")
						.headers(headers_23),
					http("MagentoLiveCheckout_48")
						.get(uri14 + "/views/history?limit=6&offset=0")
						.headers(headers_23),
					http("MagentoLiveCheckout_49")
						.get(uri23 + "/b2b-accounts-v1/users/me/roles-and-subjects")
						.headers(headers_23),
					http("MagentoLiveCheckout_50")
						.get(uri23 + "/users-v1/users/me/metadata")
						.headers(headers_23),
					http("MagentoLiveCheckout_51")
						.get(uri30 + "/hotjar-982604.js?sv=6")
						.headers(headers_5),
					http("MagentoLiveCheckout_52")
						.get(uri30 + "/hotjar-982604.js?sv=7")
						.headers(headers_5),
					http("MagentoLiveCheckout_53")
						.get(uri10 + "/collect?v=1&_v=j90&a=1492850020&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&dp=%2Fbook%2Fdata%2F9781800206137%2F1&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd3=1620824067203.lv9koqqr&cd4=2021-05-12T18%3A24%3A27.203%2B05%3A30&cd2=1010921333.1617965825&z=936096584")
						.headers(headers_0),
					http("MagentoLiveCheckout_54")
						.get(uri15 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620824067219&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620824067186&coo=false&exp=l0&rqm=GET")
						.headers(headers_0),
					http("MagentoLiveCheckout_55")
						.get(uri34 + "?a=34805961&u=2865418576367765&v=2250444872482813&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2Fbook%2Fdata%2F9781800206137%2F1&d=subscription.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&r=https%3A%2F%2Fsubscription.packtpub.com%2F&ts=1620824065629&pr=%2F&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620824067221")
						.headers(headers_0),
					http("MagentoLiveCheckout_56")
						.get(uri33),
					http("MagentoLiveCheckout_57")
						.get(uri13 + "/countries/countries.json")
						.headers(headers_57),
					http("MagentoLiveCheckout_58")
						.get(uri10 + "/collect?v=1&_v=j90&a=1492850020&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&dp=%2Fbook%2Fdata%2F9781800206137%2F1&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550WJMM825&cd3=1620824067634.cittvoj&cd4=2021-05-12T18%3A24%3A27.634%2B05%3A30&cd2=1010921333.1617965825&z=286793197")
						.headers(headers_0),
					http("MagentoLiveCheckout_59")
						.get(uri15 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&rl=https%3A%2F%2Fsubscription.packtpub.com%2F&if=false&ts=1620824067768&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Learn%20more%20for%20less%22%2C%22og%3Adescription%22%3A%22%22%2C%22og%3Aurl%22%3A%22%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd3ginfw2u4xn7p.cloudfront.net%2Fbe71e4bab87e4f09bf8ddda732d0fac0%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620824067186&coo=false&es=automatic&tm=3&exp=l0&rqm=GET")
						.headers(headers_0),
					http("MagentoLiveCheckout_60")
						.options(uri23 + "/users-v1/users/me/products/metadata?isbns=[%229781800206137%22]&detail=full")
						.headers(headers_21),
					http("MagentoLiveCheckout_61")
						.get(uri05 + "/?random=1620824067770&cv=9&fst=1620824067770&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("MagentoLiveCheckout_62")
						.get(uri13 + "/authors/101423")
						.headers(headers_44),
					http("MagentoLiveCheckout_63")
						.get(uri26 + "/pagead/1p-user-list/945348752/?random=1620824067770&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=4151990634&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
						.headers(headers_0),
					http("MagentoLiveCheckout_64")
						.get(uri29 + "/pagead/1p-user-list/945348752/?random=1620824067770&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&ref=https%3A%2F%2Fsubscription.packtpub.com%2F&tiba=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&async=1&fmt=3&is_vtc=1&random=4151990634&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
						.headers(headers_0),
					http("MagentoLiveCheckout_65")
						.options(uri23 + "/users-v1/users/me/products/metadata?isbns=[%229781838989583%22,%229781800206137%22,%229781839217289%22,%229781789801217%22,%229781800568105%22]&detail=line")
						.headers(headers_21),
					http("MagentoLiveCheckout_66")
						.get(uri23 + "/users-v1/users/me/products/metadata?isbns=[%229781800206137%22]&detail=full")
						.headers(headers_23),
					http("MagentoLiveCheckout_67")
						.get(uri23 + "/users-v1/users/me/products/metadata?isbns=[%229781838989583%22,%229781800206137%22,%229781839217289%22,%229781789801217%22,%229781800568105%22]&detail=line")
						.headers(headers_23),
					http("MagentoLiveCheckout_68")
						.options(uri23 + "/credits-v1/users/me/credits/balance")
						.headers(headers_21),
					http("MagentoLiveCheckout_69")
						.options(uri16 + "/subscriptions?active=true")
						.headers(headers_21),
					http("MagentoLiveCheckout_70")
						.get(uri23 + "/credits-v1/users/me/credits/balance")
						.headers(headers_23)
						.check(status.is(404)),
					http("MagentoLiveCheckout_71")
						.get(uri16 + "/subscriptions?active=true")
						.headers(headers_23)
						.check(status.is(404)),
					http("MagentoLiveCheckout_72")
						.options(uri23 + "/entitlements-v1/users/me/products/9781800206137/entitlement")
						.headers(headers_21),
					http("MagentoLiveCheckout_73")
						.get(uri23 + "/entitlements-v1/users/me/products/9781800206137/entitlement")
						.headers(headers_23),
					http("MagentoLiveCheckout_74")
						.options(uri23 + "/marketing-v1/users/me/interests")
						.headers(headers_21),
					http("MagentoLiveCheckout_75")
						.options(uri16)
						.headers(headers_21),
					http("MagentoLiveCheckout_76")
						.options(uri23 + "/products-v1/products/9781800206137/1/ch01lvl1sec01")
						.headers(headers_21),
					http("MagentoLiveCheckout_77")
						.get(uri06)
						.headers(headers_44),
					http("MagentoLiveCheckout_78")
						.get(uri16)
						.headers(headers_23)
						.check(status.is(404)),
					http("MagentoLiveCheckout_79")
						.get(uri23 + "/marketing-v1/users/me/interests")
						.headers(headers_23)
						.check(status.is(403)),
					http("MagentoLiveCheckout_80")
						.get(uri23 + "/products-v1/products/9781800206137/1/ch01lvl1sec01")
						.headers(headers_23),
					http("MagentoLiveCheckout_81")
						.get(uri21 + "/ch01lvl1sec01.html_truncated?AWSAccessKeyId=ASIAYL73HXT7BF5MUNTE&Expires=1620827383&Signature=jtjRzcIwSblTiqFxT8W2KjPBO5E%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEDUaCWV1LXdlc3QtMSJHMEUCIQD6Nfflc0rKSL09ValxEB%2BV1rKaD0J0iDSjzmMu%2BxnxEwIgFZEG3eeYlb3Dvk5FKcnZsGxroje2pnFYg8O4EuziVAgq7QEIvv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARAAGgw1NzU1MTU2MzkwMzgiDKx4LZ8VNYqOQq4OkSrBATRxk4kuvM0jq3I4k4kdfJay4rHtd01i5NvE6arcTolV7%2BS6xaL7RvJdYD1lk8jaAYMsRPVK%2BBLb6uRNY2kisgg1nj9CsJVCSHLn0H1kNq7MjN7B%2B%2BpX410m39OrntNhjGJo0ZT46aULzqx1dmvvyy%2B1Ci4jt4Guaj87NIF6dppVU2jYqXPDe0V8NXM2nYrFbN84%2FHtGcIWcAOX59oKsrmox0MEl%2FnHTSmhFQ8reuSw5FRSu0AOFxDDBfDEKNgZUm6wwt5nvhAY64AE%2F9i1Mm9SJTVMNAGMnJCTCFLOr2ATTbiJyN6qwdidLlmGNi1jKqA0fDTJS%2B%2B2hKMK9U%2B36%2B3lC3g4HiQSpG9%2FHPuldUMuOvev0EOiQLyrkX69cKeAMcidmWbdULhzwDaqGC08VQDdAnr9f9BYCgcK9cbaq8anI1bA4uSsYo4UmXM2xtnr0e2OlN5X%2Bkm%2B8CYuLdOeW7%2BHfe1VyxAr6HXqWUBSY8M5dTYhj%2F4f3k2uL96arLb%2BJrrdbYEvOc%2F6JWwCS%2FmFDEIXNH9t8zlzBX4BzZFhIkRBxL2Mhsod03QrhGA%3D%3D")
						.headers(headers_44),
					http("MagentoLiveCheckout_82")
						.options(uri23 + "/products-v1/products/9781800206137/1/ch01lvl1sec02")
						.headers(headers_21),
					http("MagentoLiveCheckout_83")
						.options(uri14 + "/products/9781800206137/view-count")
						.headers(headers_83),
					http("MagentoLiveCheckout_84")
						.options(uri23 + "/reading-v1/users/me/products/9781800206137/1/undefined/notes/search")
						.headers(headers_21),
					http("MagentoLiveCheckout_85")
						.patch(uri14 + "/products/9781800206137/view-count")
						.headers(headers_85)
						.body(RawFileBody("computerdatabase/magentolivecheckout/0085_request.json")),
					http("MagentoLiveCheckout_86")
						.get(uri23 + "/reading-v1/users/me/products/9781800206137/1/undefined/notes/search")
						.headers(headers_23),
					http("MagentoLiveCheckout_87")
						.get(uri23 + "/products-v1/products/9781800206137/1/ch01lvl1sec02")
						.headers(headers_23),
					http("MagentoLiveCheckout_88")
						.get(uri21 + "/ch01lvl1sec02.html_truncated?AWSAccessKeyId=ASIAYL73HXT7MPJMBUOX&Expires=1620827386&Signature=l9a1634FIwNqZakq73ZYHepJCP0%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEDUaCWV1LXdlc3QtMSJHMEUCIQDuX0pgxRDzbM5RJQgyCv3EtNeCWeVs7LZFimhm58RKwQIgQOEdyMdFRCe9gCn%2BeFN%2BjR8%2BBH6c3K4zRyEZ5SOwmkMq7QEIvv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARAAGgw1NzU1MTU2MzkwMzgiDBsXqCNPRXXsTqAbNyrBAWSewgQTf2du5Lt2beRczdVxDNH%2BkELXjgqiTP3Uk9H%2FNx69w5%2F91LnPdsPSp%2F7js%2FxNsy%2F1YEWKB2E1kW%2BEqD6mtdxkpXFfHpreeH68eKQ2IRA2JKpWxJbimPRCwNVMJeefmvgAN1jH7Q15JfUiC5YM2g5dqX%2B9A9SL%2B2%2FxvQDHaY1kwKsYYT3t%2Furr13QtNUF8NTTfnjjcQQiTyc8UHoCT43TdnSdyg3qcAOfUe7U6fhUbTd0X4uZMZudqho6O0bsw5ZvvhAY64AHuhXJc5cNBbe1Ot6nK18lhDiHF92HsfGp%2BFBcxiu6zRH3sRxfBM3nJLbeBHq7IsYlE4MLdn4IVJ8RYSJnjJECFROpm8YKq3wWSNqHm0JI5%2Fq8ztnBd5%2FOyODd6Hc%2FhGtrrrWKcUzTVJL8io2sVBCuiutSXAnXH2Db2oQZhq8YLsZO%2ByGuL%2FMR89VeLILMpaCX3X49JCEcgzCQnVDXRc3vp0KvyBMdWOdnK8tgActJvpMD0pYXmZ8hTf6dC0UYsG%2Fk3JtGdhMZtde73RWvKAzy0%2BEF0fX%2BwnU164ozF%2BF8JZg%3D%3D")
						.headers(headers_44)))
				.pause(1)
				.exec(http("MagentoLiveCheckout_89")
					.post(uri10 + "/j/collect?v=1&_v=j90&a=1492850020&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&dp=%2Fbook%2Fdata%2F9781800206137%2F1&ul=en-us&de=UTF-8&dt=Introduction%20-%20Deep%20Learning%20from%20the%20Basics&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&ec=Ecommerce&ea=Product%20Added%20to%20Cart&_u=SCCAAEALQAAAAC~&jid=1217893928&gjid=1841536399&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&_r=1&gtm=2wg550WJMM825&cd3=1620824078520.uzjghl8&cd4=2021-05-12T18%3A24%3A38.520%2B05%3A30&cd2=1010921333.1617965825&cg1=Subscription%20-%20Content&cg2=Subscription&cg5=No%20Content%20Grouping&cd5=Deep%20Learning%20from%20the%20Basics&cd6=Data&cd7=9781800206137&cd8=book&cd16=No%20Query%20Parameters&pa=add&pr1id=9781800206137&pr1nm=Deep%20Learning%20from%20the%20Basics&pr1ca=Data&pr1pr=&pr1br=Packt%20Publishing&pr1va=book&pr1qt=1&pr1cm1=0&z=2081578501")
					.headers(headers_89)
					.resources(http("MagentoLiveCheckout_90")
						.post(uri18 + "?t=dc&aip=1&_r=3&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=1217893928&gjid=1841536399&_gid=1798387714.1620821753&_u=SCCAAEALQAAAAC~&z=961332606")
						.headers(headers_89),
						http("MagentoLiveCheckout_91")
							.get(uri26 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=1217893928&_u=SCCAAEALQAAAAC~&z=328793702")
							.headers(headers_0),
						http("MagentoLiveCheckout_92")
							.get(uri29 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=1217893928&_u=SCCAAEALQAAAAC~&z=328793702")
							.headers(headers_0),
						http("MagentoLiveCheckout_93")
							.post(uri15 + "/")
							.headers(headers_93)
							.body(RawFileBody("computerdatabase/magentolivecheckout/0093_request.dat")),
						http("MagentoLiveCheckout_94")
							.get(uri34 + "?a=34805961&u=2865418576367765&v=2250444872482813&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=subscription.packtpub.com&pp=h&pp=%2Fbook%2Fdata%2F9781800206137%2F1&pp=t&pp=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&pp=ts&pp=1620824065629&pp=pr&pp=%2F&id0=1845376682231006&t0=click&n0=span&c0=hidden-xs%20ml5%20ng-binding%20ng-scope&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.book-page-wrapper%3B.ng-scope%3B%7C%40div%3B.book-page%3B.container%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.btn-group%3B.mb30%3B.mt15%3B.pull-right%3B.toolbar%3B%5Brole%3Dgroup%5D%3B%7C%40div%3B.btn-group%3B.ng-scope%3B%5Bng-if%3D!productController.owned%20%26%26%20productController.showBuyButton%20%26%26%20!productController.publisherException%5D%3B%5Brole%3Dgroup%5D%3B%7C%40button%3B.btn%3B.btn-default%3B%5Bng-click%3DproductController.buyProduct(%24event)%5D%3B%7C%40span%3B.hidden-xs%3B.ml5%3B.ng-binding%3B.ng-scope%3B%5Bng-if%3D!productController.price%5D%3B%7C&ts0=1620824078500&x0=Buy%20eBook&st=1620824079853")
							.headers(headers_0),
						http("MagentoLiveCheckout_95")
							.get(uri17 + "/data/deep-learning-from-the-basics")
							.headers(headers_2),
						http("MagentoLiveCheckout_96")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_97")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_98")
							.get(uri03 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fsubscription.packtpub.com%252Fbook%252Fdata%252F9781800206137%252F1%3Burl%3Dhttps%253A%252F%252Fwww.packtpub.com%252Fdata%252Fdeep-learning-from-the-basics%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
						http("MagentoLiveCheckout_99")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_100")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_101")
							.get(uri13 + "/products/9781800206137/summary")
							.headers(headers_101),
						http("MagentoLiveCheckout_102")
							.get(uri04),
						http("MagentoLiveCheckout_103")
							.options(uri23 + "/credits-v1/users/me/credits/balance")
							.headers(headers_103),
						http("MagentoLiveCheckout_104")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_105")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/mage/gallery/gallery.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_106")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_InstantPurchase/template/confirmation.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_107")
							.get(uri23 + "/credits-v1/users/me/credits/balance")
							.headers(headers_107)
							.check(status.is(404)),
						http("MagentoLiveCheckout_108")
							.get(uri02 + "/merchants/widgetintegration/all?merchant_identifier=packt-publishing&origin=www.packtpub.com")
							.headers(headers_108),
						http("MagentoLiveCheckout_109")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_110")
							.get(uri17 + "/packtgtm/ajax/customer/?_=1620824082492")
							.headers(headers_110),
						http("MagentoLiveCheckout_111")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Packt_EcomApi/template/download_link.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_112")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_113")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_114")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_115")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_InstantPurchase/template/instant-purchase.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_116")
							.get(uri17 + "/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&sections=&_=1620824082490")
							.headers(headers_110),
						http("MagentoLiveCheckout_117")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_118")
							.post(https://www.packtpub.com//signon/ajax/signon/?email=ashishtest12%40test.com)
							.headers(headers_118)
							.body(RawFileBody("computerdatabase/magentolivecheckout/0118_request.json")),
						http("MagentoLiveCheckout_119")
							.get(uri17 + "/packtgeoip/ajax/storebanner?sourceURL=/data/deep-learning-from-the-basics&_=1620824082491")
							.headers(headers_110),
						http("MagentoLiveCheckout_120")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_121")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
							.headers(headers_96),
						http("MagentoLiveCheckout_122")
							.get(uri32 + "?tp=nl&so=sx&sid=120495&uid=1620822144285.188269973.58844233.120495.556919399.&jsv=b.3.001%3Ac.3.001%3As.3.001&uts=1620824083&tfs=1100236&uvc=1620824083&pgc=1&lig=2&tpd=%7C&tvd=%3A&rdm=subscription.packtpub.com&rpt=%2Fbook%2Fdata%2F9781800206137%2F1&rqs=&rns=&prtcl=https%3A&ppth=%2Fdata%2Fdeep-learning-from-the-basics&pgn=&sby=www.packtpub.com&sus=0&gdpr=00e0%3Adbbdbcf3-13db-4473-b1d7-bcf27c1a055f%3A2&igclid=1&chn=1&rmch=ra")
							.headers(headers_0),
						http("MagentoLiveCheckout_123")
							.get(uri05 + "/?random=1620824083534&cv=9&fst=1620824083534&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&ig=0&data=ecomm_pagetype%3Ddata%3Becomm_prodid%3D9781800209725%3Becomm_totalvalue%3D27.99%3Buser_id%3D%3Bgoogle_business_vertical%3DRetail%3Bid%3D9781800209725&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&tiba=Deep%20Learning%20from%20the%20Basics&hn=www.google.com&async=1&rfmt=3&fmt=4"),
						http("MagentoLiveCheckout_124")
							.get(uri30 + "/hotjar-1074944.js?sv=7")
							.headers(headers_124),
						http("MagentoLiveCheckout_125")
							.get(uri07 + "?rmch=cs&tp=gdpr&domain=www.packtpub.com&sought=false&attr_sid=120495&dsp_mid=8753&in_scope=false&purposes=&vendors=&ext_id=dbbdbcf3-13db-4473-b1d7-bcf27c1a055f")
							.headers(headers_0),
						http("MagentoLiveCheckout_126")
							.get(uri05 + "/?random=1620824083242&cv=9&fst=1620824083242&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&tiba=Deep%20Learning%20from%20the%20Basics&hn=www.google.com&async=1&rfmt=3&fmt=4"),
						http("MagentoLiveCheckout_127")
							.get(uri26 + "/pagead/1p-user-list/945348752/?random=1620824083534&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&data=ecomm_pagetype%3Ddata%3Becomm_prodid%3D9781800209725%3Becomm_totalvalue%3D27.99%3Buser_id%3D%3Bgoogle_business_vertical%3DRetail%3Bid%3D9781800209725&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&tiba=Deep%20Learning%20from%20the%20Basics&async=1&fmt=3&is_vtc=1&random=4132431515&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
							.headers(headers_0),
						http("MagentoLiveCheckout_128")
							.get(uri02 + "/10/reviews/summary/service?since_period=YEAR&unanswered_feedback=include&source=floating_service_widget&merchant_identifier=packt-publishing&origin=www.packtpub.com")
							.headers(headers_108),
						http("MagentoLiveCheckout_129")
							.get(uri17 + "/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1620824082493")
							.headers(headers_110),
						http("MagentoLiveCheckout_130")
							.get(uri34 + "?a=34805961&u=2865418576367765&v=8291737789906904&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&z=2&h=%2Fdata%2Fdeep-learning-from-the-basics&d=www.packtpub.com&t=Deep%20Learning%20from%20the%20Basics&r=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&k=Google%20Optimize%3A%20bCtVMYxfQiOsGoVk470dFQ&k=0&ts=1620824083504&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&st=1620824086151")
							.headers(headers_0),
						http("MagentoLiveCheckout_131")
							.get(uri29 + "/pagead/1p-user-list/945348752/?random=1620824083534&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&data=ecomm_pagetype%3Ddata%3Becomm_prodid%3D9781800209725%3Becomm_totalvalue%3D27.99%3Buser_id%3D%3Bgoogle_business_vertical%3DRetail%3Bid%3D9781800209725&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&tiba=Deep%20Learning%20from%20the%20Basics&async=1&fmt=3&is_vtc=1&random=4132431515&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
							.headers(headers_0),
						http("MagentoLiveCheckout_132")
							.get(uri34 + "?a=34805961&u=2865418576367765&v=8291737789906904&s=3468343421429263&i=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fsubscription.packtpub.com%2F&sp=ts&sp=1620821854795&sp=d&sp=subscription.packtpub.com&sp=h&sp=%2F&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fdata%2Fdeep-learning-from-the-basics&pp=t&pp=Deep%20Learning%20from%20the%20Basics&pp=ts&pp=1620824083504&id0=3387950403728021&t0=click&n0=input&c0=box-tocart__radio&i0=subscription-product-btn&y0=%40div%3B.page-wrapper%3B%5Bdata-gtm-vis-first-on-screen-9995629_87%3D300%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-gtm-vis-recent-on-screen-9995629_87%3D300%5D%3B%5Bdata-gtm-vis-total-visible-time-9995629_87%3D100%5D%3B%7C%40main%3B%23maincontent%3B.page-main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.columns%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.column%3B.main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.sidebar%3B.sidebar-additional%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23subscription-product-btn%3B.box-tocart__radio%3B%5Bname%3Dproduct-selection%5D%3B%5Btype%3Dradio%5D%3B%7C&k0=Google%20Optimize%3A%20bCtVMYxfQiOsGoVk470dFQ&k0=0&ts0=1620824083828&id1=690340113353100&t1=change&n1=input&c1=box-tocart__radio&i1=subscription-product-btn&y1=%40div%3B.page-wrapper%3B%5Bdata-gtm-vis-first-on-screen-9995629_87%3D300%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-gtm-vis-recent-on-screen-9995629_87%3D300%5D%3B%5Bdata-gtm-vis-total-visible-time-9995629_87%3D100%5D%3B%7C%40main%3B%23maincontent%3B.page-main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.columns%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.column%3B.main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.sidebar%3B.sidebar-additional%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23subscription-product-btn%3B.box-tocart__radio%3B%5Bname%3Dproduct-selection%5D%3B%5Btype%3Dradio%5D%3B%7C&k1=Google%20Optimize%3A%20bCtVMYxfQiOsGoVk470dFQ&k1=0&ts1=1620824083841&st=1620824086153")
							.headers(headers_0),
						http("MagentoLiveCheckout_133")
							.get(uri02 + "/10/reviews/service?page=1&page_size=10&since_period=YEAR&full_thread=include&unanswered_feedback=include&source=floating_service_widget&sort=-updated_date&feefo_parameters=include&merchant_identifier=packt-publishing&origin=www.packtpub.com")
							.headers(headers_108),
						http("MagentoLiveCheckout_134")
							.get(uri20 + "?tp=ilk&sid=120495&uid=1620822144285.188269973.58844233.120495.556919399.&gdpr=00e0:dbbdbcf3-13db-4473-b1d7-bcf27c1a055f:2&rmch=ra")
							.headers(headers_0),
						http("MagentoLiveCheckout_135")
							.get(uri29 + "/pagead/1p-user-list/945348752/?random=1620824083242&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&tiba=Deep%20Learning%20from%20the%20Basics&async=1&fmt=3&is_vtc=1&random=42925138&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
							.headers(headers_0),
						http("MagentoLiveCheckout_136")
							.get(uri26 + "/pagead/1p-user-list/945348752/?random=1620824083242&cv=9&fst=1620820800000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=1&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg550&sendb=1&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&ref=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&tiba=Deep%20Learning%20from%20the%20Basics&async=1&fmt=3&is_vtc=1&random=42925138&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
							.headers(headers_0),
						http("MagentoLiveCheckout_137")
							.get(uri15 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&rl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&if=false&ts=1620824086097&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1620824085946&coo=false&exp=l1&rqm=GET")
							.headers(headers_0),
						http("MagentoLiveCheckout_138")
							.get(uri15 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&rl=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&if=false&ts=1620824086610&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Deep%20Learning%20from%20the%20Basics%22%2C%22meta%3Adescription%22%3A%22Discover%20ways%20to%20implement%20various%20deep%20learning%20algorithms%20by%20leveraging%20Python%20and%20other%20technologies%22%7D&cd[OpenGraph]=%7B%22og%3Atype%22%3A%22product%22%2C%22og%3Atitle%22%3A%22Deep%20Learning%20from%20the%20Basics%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fwww.packtpub.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2F5d165500a520a389deb95b325792ea25%2F9%2F7%2F9781800206137-original_63.png%22%2C%22og%3Adescription%22%3A%22Discover%20ways%20to%20implement%20various%20deep%20learning%20algorithms%20by%20leveraging%20Python%20and%20other%20technologies%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics%22%2C%22product%3Aprice%3Aamount%22%3A%2227.99%22%2C%22product%3Aprice%3Acurrency%22%3A%22USD%22%7D&cd[Schema.org]=%5B%7B%22dimensions%22%3A%7B%22h%22%3A910%2C%22w%22%3A1263%7D%2C%22properties%22%3A%7B%22name%22%3A%22Deep%20Learning%20from%20the%20Basics%22%2C%22description%22%3A%22Discover%20ways%20to%20implement%20various%20deep%20learning%20algorithms%20by%20leveraging%20Python%20and%20other%20technologies%22%7D%2C%22subscopes%22%3A%5B%7B%22dimensions%22%3A%7B%22h%22%3A0%2C%22w%22%3A0%7D%2C%22properties%22%3A%7B%22price%22%3A%2227.99%22%2C%22priceCurrency%22%3A%22USD%22%7D%2C%22subscopes%22%3A%5B%5D%2C%22type%22%3A%22http%3A%2F%2Fschema.org%2FOffer%22%7D%5D%2C%22type%22%3A%22http%3A%2F%2Fschema.org%2FProduct%22%7D%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1620824085946&coo=false&es=automatic&tm=3&exp=l1&rqm=GET")
							.headers(headers_0),
						http("MagentoLiveCheckout_139")
							.get(uri10 + "/collect?v=1&_v=j90&a=296185307&t=pageview&_s=1&dl=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&dr=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&dp=%2Fdata%2Fdeep-learning-from-the-basics&ul=en-us&de=UTF-8&dt=Deep%20Learning%20from%20the%20Basics&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&exp=bCtVMYxfQiOsGoVk470dFQ.0&_u=SCCAAEALQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550KHLZ7JF&cg1=Catalogue%20Page%20-%20Product%20Detail&cg2=United%20States&cg3=Store&cg4=Data&cd1=7924cb3b-bb8e-44ae-b9d2-8bb33048933e&cd3=1620824086112.nvruuvt9&cd4=2021-05-12T18%3A24%3A46.112%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&z=1765196122")
							.headers(headers_0),
						http("MagentoLiveCheckout_140")
							.get(uri10 + "/collect?v=1&_v=j90&a=296185307&t=event&ni=1&_s=1&dl=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&dr=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&dp=%2Fdata%2Fdeep-learning-from-the-basics&ul=en-us&de=UTF-8&dt=Deep%20Learning%20from%20the%20Basics&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&ec=Ecommerce&ea=Product%20Detail%20View&_u=SCCAAEALQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1798387714.1620821753&gtm=2wg550KHLZ7JF&cg1=Catalogue%20Page%20-%20Product%20Detail&cg2=United%20States&cg3=Store&cg4=Data&cd3=1620824083525.lezqbdcg&cd4=2021-05-12T18%3A24%3A43.525%2B05%3A30&cd2=1010921333.1617965825&pa=detail&pr1id=9781800209725&pr1nm=Deep%20Learning%20from%20the%20Basics&pr1ca=data&pr1va=EBOOK&pr1pr=27.99&pr1cd11=27.99%7C27.99%7C27.99&z=1947737194")
							.headers(headers_0),
						http("MagentoLiveCheckout_141")
							.get(uri31 + "/js/8755/?pt=prod&prodID=9781800206137"),
						http("MagentoLiveCheckout_142")
							.get(uri31 + "/pix/8755?type=pos&pt=prod&prodID=9781800206137&href=https%3A%2F%2Fwww.packtpub.com%2Fdata%2Fdeep-learning-from-the-basics&referrer=https%3A%2F%2Fsubscription.packtpub.com%2Fbook%2Fdata%2F9781800206137%2F1&_rm_fire3p=true")
							.headers(headers_2),
						http("MagentoLiveCheckout_143")
							.get(uri27 + "?rmch=np&engine=pix&tag=48874&mt=&pid=9781800206137")
							.headers(headers_0),
						http("MagentoLiveCheckout_144")
							.get(uri28 + "?ttd_pid=1i071nc&ttd_tpi=1")
							.headers(headers_0),
						http("MagentoLiveCheckout_145")
							.get(uri08 + "/?adv=43owubh&ct=0:azzo1am&fmt=3")
							.headers(headers_0),
						http("MagentoLiveCheckout_146")
							.get(uri31 + "/cs?ns=nxtck&uid3=677c3dd6-6983-4fbf-a1e6-927073ab7d37")
							.headers(headers_0),
						http("MagentoLiveCheckout_147")
							.get(uri11)
							.headers(headers_0),
						http("MagentoLiveCheckout_148")
							.get(uri17 + "/data/deep-learning-from-the-basics")
							.headers(headers_148),
						http("MagentoLiveCheckout_149")
							.get(uri04)
							.headers(headers_149),
						http("MagentoLiveCheckout_150")
							.get(uri19 + "?features=default%2CArray.prototype.includes%2CPromise")
							.headers(headers_150),
						http("MagentoLiveCheckout_151")
							.get(uri09 + "?family=Montserrat:300,400,600,700")
							.headers(headers_151),
						http("MagentoLiveCheckout_152")
							.get(uri01 + "?a=475968873&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABVRwQNWFQYFkUNBkYAQBwTCFJE&rst=11250&ck=1&ref=https://www.packtpub.com/data/deep-learning-from-the-basics&ap=2844&be=3815&fe=11205&dc=4512&perf=%7B%22timing%22:%7B%22of%22:1620824078546,%22n%22:0,%22f%22:0,%22dn%22:11,%22dne%22:11,%22c%22:11,%22s%22:11,%22ce%22:11,%22rq%22:11,%22rp%22:101,%22rpe%22:3775,%22dl%22:3782,%22di%22:4477,%22ds%22:4512,%22de%22:4537,%22dc%22:11203,%22l%22:11204,%22le%22:11210%7D,%22navigation%22:%7B%7D%7D&fcp=4487&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
							.check(status.is(500)),
						http("MagentoLiveCheckout_153")
							.get(uri03 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fwww.packtpub.com%252Fdata%252Fdeep-learning-from-the-basics%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s")
							.headers(headers_149),
						http("MagentoLiveCheckout_154")
							.get(uri24 + "?id=GTM-KHLZ7JF")
							.headers(headers_149)))
				.pause(1)
				.exec(http("MagentoLiveCheckout_155")
					.get(uri02 + "/merchants/widgetintegration/all?merchant_identifier=packt-publishing&origin=www.packtpub.com")
					.headers(headers_155)
					.resources(http("MagentoLiveCheckout_156")
						.get(uri02 + "/translations/en-US/FeefoWidget?origin=www.packtpub.com")
						.headers(headers_155),
						http("MagentoLiveCheckout_157")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/js-translation.json")
							.headers(headers_157),
						http("MagentoLiveCheckout_158")
							.get(uri02 + "/10/reviews/summary/product?since_period=ALL&unanswered_feedback=include&source=on_page_product_integration&parent_product_sku=83508&merchant_identifier=packt-publishing&origin=www.packtpub.com")
							.headers(headers_155),
						http("MagentoLiveCheckout_159")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
							.headers(headers_157),
						http("MagentoLiveCheckout_160")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
							.headers(headers_157),
						http("MagentoLiveCheckout_161")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
							.headers(headers_157),
						http("MagentoLiveCheckout_162")
							.get(uri02 + "/translations/en-US/FeefoWidget?origin=www.packtpub.com")
							.headers(headers_155),
						http("MagentoLiveCheckout_163")
							.get(uri02 + "/10/reviews/summary/service?since_period=YEAR&unanswered_feedback=include&source=floating_service_widget&merchant_identifier=packt-publishing&origin=www.packtpub.com")
							.headers(headers_155),
						http("MagentoLiveCheckout_164")
							.get(uri02 + "/10/reviews/service?page=1&page_size=10&since_period=YEAR&full_thread=include&unanswered_feedback=include&source=floating_service_widget&sort=-updated_date&feefo_parameters=include&merchant_identifier=packt-publishing&origin=www.packtpub.com")
							.headers(headers_155),
						http("MagentoLiveCheckout_165")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
							.headers(headers_157),
						http("MagentoLiveCheckout_166")
							.get(uri17 + "/static/version1611744644/frontend/Packt/default/en_GB/Packt_Ves/fonts/fontawesome-webfont.woff2?v=4.7.0")
							.headers(headers_166)))
		}



	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}