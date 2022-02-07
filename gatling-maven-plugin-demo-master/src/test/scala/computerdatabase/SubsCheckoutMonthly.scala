package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SubsCheckoutMonthly extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.packtpub.com/checkout/subscription/packt-subscription-monthly-launch-offer")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0")

    val uri01 = "https://connect.facebook.net/signals/config/445429252334850"
    val uri02 = "https://static.packt-cdn.com/countries/countries.json"
    val uri03 = "https://www.facebook.com/tr"
    val uri04 = "https://www.packtpub.com"
    val uri05 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri06 = "https://www.googletagmanager.com/gtm.js"
    val uri07 = "https://static.hotjar.com/c/hotjar-1074944.js"
    val uri09 = "https://services.postcodeanywhere.co.uk"
    val uri10 = "https://maps.googleapis.com/maps/api/js"
    val uri11 = "https://www.google-analytics.com"
    val uri12 = "https://www.google.com"
    val uri13 = "https://www.google.co.in/pagead/1p-user-list/945348752"

	// hitting url and till billing
		object SubsCheckout{
			val checkout=exec(http("SubsCheckoutMonthly_0")
				.get(uri04 + "/checkout/subscription/packt-subscription-monthly-launch-offer")

				.resources(http("SubsCheckoutMonthly_1")
					.get(uri04 + "/js/app.js?id=57774e803c36a000f6c2")
					,
					http("SubsCheckoutMonthly_2")
						.get(uri04 + "/js/checkout.js?id=99de9ba4eb288512c123")
						,
					http("SubsCheckoutMonthly_3")
						.get(uri06 + "?id=GTM-KHLZ7JF")
						,
					http("SubsCheckoutMonthly_4")
						.get(uri12 + "/recaptcha/api.js?onload=checkoutRecaptchaRenderCallback&render=explicit")
						,
					http("SubsCheckoutMonthly_5")
						.get(uri10 + "?key=AIzaSyAlq0L1y9OYxZWyAiIFbxl-XPZbA0zl5Cc&libraries=places")
						,
					http("SubsCheckoutMonthly_6")
						.get(uri02)
						,
					http("SubsCheckoutMonthly_7")
						.get(uri04 + "/images/chevron--right-orange.svg")
						,
					http("SubsCheckoutMonthly_8")
						.get(uri12 + "/recaptcha/api2/anchor?ar=1&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&co=aHR0cHM6Ly93d3cucGFja3RwdWIuY29tOjQ0Mw..&hl=en&v=vzAt61JclNZYHl6fEWIBqLbe&size=invisible&cb=3qjsn0vha0un")
						,
					http("SubsCheckoutMonthly_9")
						.get(uri07 + "?sv=7")
						,
					http("SubsCheckoutMonthly_10")
						.get(uri05 + "/?random=1626429112458&cv=9&fst=1626429112458&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg7e0&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&tiba=Checkout%20%7C%20Packt&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("SubsCheckoutMonthly_11")
						.get(uri12 + "/pagead/1p-user-list/945348752/?random=1626429112458&cv=9&fst=1626426000000&num=1&guid=ON&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg7e0&sendb=1&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&tiba=Checkout%20%7C%20Packt&async=1&fmt=3&is_vtc=1&random=1569476641&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
						,
					http("SubsCheckoutMonthly_12")
						.get(uri13 + "/?random=1626429112458&cv=9&fst=1626426000000&num=1&guid=ON&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg7e0&sendb=1&frm=0&url=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&tiba=Checkout%20%7C%20Packt&async=1&fmt=3&is_vtc=1&random=1569476641&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
						,
					http("SubsCheckoutMonthly_13")
						.get(uri01 + "?v=2.9.43&r=stable")
						,
					http("SubsCheckoutMonthly_14")
						.get(uri11 + "/gtm/js?id=GTM-MSRQZ29&t=gtm12&cid=1010921333.1617965825&gac=_gaexp%3DGAX1.2.bCtVMYxfQiOsGoVk470dFQ.18852.0")
						,
					http("SubsCheckoutMonthly_15")
						.get(uri03 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&rl=&if=false&ts=1626429113485&sw=1280&sh=1024&v=2.9.43&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1626429113111&coo=false&rqm=GET")
						,
					http("SubsCheckoutMonthly_16")
						.get(uri12 + "/recaptcha/api2/bframe?hl=en&v=vzAt61JclNZYHl6fEWIBqLbe&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&cb=on22koe9tq1a")
						,
					http("SubsCheckoutMonthly_17")
						.get(uri11 + "/collect?v=1&_v=j91&a=853238091&t=pageview&_s=1&dl=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&dp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&ul=en-us&de=UTF-8&dt=Checkout%20%7C%20Packt&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1010921333.1617965825&tid=UA-284627-1&_gid=266636521.1626428823&gtm=2wg7e0KHLZ7JF&cg2=United%20States&cg3=Store&cg4=No%20Content%20Grouping&cd3=1626429113701.vwpp6cv&cd4=2021-07-16T15%3A21%3A53.701%2B05%3A30&cd2=1010921333.1617965825&z=98860649")
						,
					http("SubsCheckoutMonthly_18")
						.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&z=2&h=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&d=www.packtpub.com&t=Checkout%20%7C%20Packt&ts=1626429112373&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&st=1626429113721")
						,
					http("SubsCheckoutMonthly_19")
						.post(uri12 + "/recaptcha/api2/reload?k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_")

						.body(RawFileBody("computerdatabase/subscheckoutmonthly/0019_request.dat")),
					http("SubsCheckoutMonthly_20")
						.get(uri09 + "/css/platformmobilevalidation-1.50.min.css?key=MW39-FJ46-TU82-JT15&BRAND=PostcodeAnywhere")
						,
					http("SubsCheckoutMonthly_21")
						.get(uri09 + "/js/platformmobilevalidation-1.50.min.js?key=MW39-FJ46-TU82-JT15&BRAND=PostcodeAnywhere"),
					http("SubsCheckoutMonthly_22")
						.get(uri03 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&rl=&if=false&ts=1626429115035&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Checkout%20%7C%20Packt%22%2C%22meta%3Adescription%22%3A%22Check%20out%20securely%20with%20Packt%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.43&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1626429113111&coo=false&es=automatic&tm=3&rqm=GET")
						))
				.pause(2)
				.exec(http("SubsCheckoutMonthly_23")
					.get(uri10 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Fwww.packtpub.com%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&4sAIzaSyAlq0L1y9OYxZWyAiIFbxl-XPZbA0zl5Cc&callback=_xdc_._b1kgjz&key=AIzaSyAlq0L1y9OYxZWyAiIFbxl-XPZbA0zl5Cc&token=14111"))
				.pause(2)
				.exec(http("SubsCheckoutMonthly_24")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=7418033590407039&t0=click&n0=input&c0=form-control&i0=username&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step1%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep1%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23username%3B.form-control%3B%5Bdata-module%3D%5D%3B%5Bname%3Dusername%5D%3B%5Bplaceholder%3DEmail%20address%5D%3B%5Brequired%3D%5D%3B%5Btype%3Demail%5D%3B%7C&ts0=1626429123121&st=1626429124438")
					)
				.pause(2)
				.exec(http("SubsCheckoutMonthly_25")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=4836454044443312&t0=change&n0=input&c0=form-control&i0=username&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step1%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep1%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23username%3B.form-control%3B%5Bdata-module%3D%5D%3B%5Bname%3Dusername%5D%3B%5Bplaceholder%3DEmail%20address%5D%3B%5Brequired%3D%5D%3B%5Btype%3Demail%5D%3B%7C&ts0=1626429134605&st=1626429136484")
					)
				.pause(1)
				.exec(http("SubsCheckoutMonthly_26")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=6071964294177346&t0=change&n0=input&c0=form-control%20password&i0=password&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step1%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep1%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.form-group%3B.position-relative%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23password%3B.form-control%3B.password%3B%5Bname%3Dpassword%5D%3B%5Bonfocusout%3Dcheckout.onFocusOutPassword()%5D%3B%5Boninput%3Dcheckout.validatePassword()%5D%3B%5Bplaceholder%3DPassword%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dpassword%5D%3B%7C&ts0=1626429144971&id1=1979219425714650&t1=click&n1=input&c1=form-control&i1=firstName&y1=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step1%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep1%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23firstName%3B.form-control%3B%5Bdata-module%3Dname%5D%3B%5Bname%3DfirstName%5D%3B%5Bplaceholder%3DFirst%20name%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dtext%5D%3B%7C&ts1=1626429145034&st=1626429146526")
					)
				.pause(1)
				.exec(http("SubsCheckoutMonthly_27")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=5304407081108612&t0=change&n0=input&c0=form-control&i0=firstName&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step1%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep1%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23firstName%3B.form-control%3B%5Bdata-module%3Dname%5D%3B%5Bname%3DfirstName%5D%3B%5Bplaceholder%3DFirst%20name%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1626429147047&st=1626429148534")
				)
				.pause(1)
				.exec(http("SubsCheckoutMonthly_28")
					.get(uri12 + "/recaptcha/api2/anchor?ar=1&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&co=aHR0cHM6Ly93d3cucGFja3RwdWIuY29tOjQ0Mw..&hl=en&v=vzAt61JclNZYHl6fEWIBqLbe&size=invisible&cb=obl0onf5uj8b")
					.resources(http("SubsCheckoutMonthly_29")
						.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=7595629685091036&t0=change&n0=input&c0=form-control&i0=lastName&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step1%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep1%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23lastName%3B.form-control%3B%5Bdata-module%3Dname%5D%3B%5Bname%3DlastName%5D%3B%5Bplaceholder%3DLast%20name%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1626429150538&st=1626429150550")
						,
						http("SubsCheckoutMonthly_30")
							.get(uri12 + "/recaptcha/api2/bframe?hl=en&v=vzAt61JclNZYHl6fEWIBqLbe&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&cb=s020xqv8ebjw")
							,
						http("SubsCheckoutMonthly_31")
							.post(uri03 + "/")
							.body(RawFileBody("computerdatabase/subscheckoutmonthly/0031_request.dat")),
						http("SubsCheckoutMonthly_32")
							.post(uri12 + "/recaptcha/api2/reload?k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_")
							.body(RawFileBody("computerdatabase/subscheckoutmonthly/0032_request.dat")),
						http("SubsCheckoutMonthly_33")
							.post(uri12 + "/recaptcha/api2/userverify?k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_")
							.formParam("v", "vzAt61JclNZYHl6fEWIBqLbe")
							.formParam("c", "03AGdBq25Czbc99njPX4pQR9ocvvUbSmV0i-1WsoBMBtfuIZOyKhX7ayCfpsCNvNPN3yY70kqN_Rv6ItB5WrWzrS4qYfxqDfI2eW7b3RWag242b0daRFEu_BkAaenJ_F8TcADvjmbzG4x_ogYOYW5mrJUjAti80V3X8ur7euO7Kr4qXG6ghNrYPoyyeuWJgrShV0IeFOnOyOsT51XRhXbiDtX6n6DTD8ow-T-bPWB99rWEdppTl8Gfxmwxfgr1M0Bjwb61JD2nQJGFr7ba5iKGxFnA2_g-zUcBAf6f1be8-gNa3rtL1uIAblZUNuHUg5AzfMmP2lZjQnm8rKuvdXT-Py4CY8FpCwHlmL4ISV3NXbKHYj0v2rl-12gN2dmlmeZdXmwKyiDxIVnM4LqLGndSwftJQZmrL1TDP25m9-IRDU9Aeh_k_i7Q-CwtZ10XV5abBF3gorrOKdLpfCBNy6iBxtIQmyt5USYhJOdbSTq8syhpSBzchYBVAdqpua0yq410BiAtOeB9y5wqyiIHI_FMjVs4tRTsGLB_5quNQ-EgbNscs53NgYW1ZQ05rkZOMBIiyocamzr8KWqXY03yvH6b5ck8sr26L3LfNK1HX-0ulWPZJKCIBhUY4XQpIm7OZlzkLLqJCQSwnX0JPFab-whwB4IBpukE_-U5w9gzfwE8pO75wjx0LHErwCzvbr_wuyAtyXULzGvRAUkRvt07QP7-XRBSzi7uEDXQ_5v2o04w_n_V1OB6EvtjGgdw5Aua4vaNS7LluFevuhnDOEDSyb1pXDyfY2e2rX503gBP0QuOUOp3dxj6ob9zkD-CydxfwQ15wGdDYhAqYvZjbUQ4lkJTYqd_P5nDH9dpCPKjQi1x-U5N3Tv5Ab39ffb8Mwkrjo8PujrSNyK8w3AfdraJUqNC7GkIR18BvP0a_DrTR64ub81VBBRfI9bDrLdOdXo0SEkGH1klUB-L4NOa327HFbnZheAIihW--ZstRfKN1qKdrAomD307An6bP7F-o6l43ahZDsZml_Qj80tPwfSNA3BRiNIHATx7uM9PqJrT_2tCppsm09A8VF2JZ10qMAEdNnN7Ao_lxg-9F8TqRcOSAJwOP3eXlQFhmZ7CvcbzLHvcQDkct5-pGzIZ_sbU_Bd3mj2N0lrcJFquU5nZSm5Tn_3a9ydDH-jQolbozxVeviLkza5fIK1iYmPRLcfYcOg0GpIfmWuTjTQaQfFqEUvL6h6iVHawQcyFO8SJYygAfiwl9SEpanLUNErYs7M--6CSlqSLEAhLTClnyRz-dlFvedyUZ_W-fiDPQnrtpLhTpVda18X5r99d4Aifs31hLZVzuhvAPyM1SOCnR6L_iHFbw2o2Ydr7hQCJn0QcTmddDwgyyCX9gJgWJp1VRW6Iwi3qrQ6TFB91AjfDHHnhWoCNuA94dJWUbBtVL0N3KlOoe9VL4C0zRqZEEQh-pu19LSoTS9kCPeO3Kci6i7bi0w2CgXa3wjleAYcE1gMlWdtY9HWnsF4Iq77f-GMm9YzxV67uEKLhf-XPY2X5jCjM1CVkO6qC_UN20aBDB4EUchqt0MRs752ODpYYtEMtqhYQkIjUZ3m-yrcIVuqGSi_NAvZ8E4s5sh9mIev2b6HqpbbbMGPObvt6fd3J32oTdR2dEePjkBjYn-y4Bdl_hRyvQHGfEMCGqZEZs8yDcP5XAJI337hQcXXWuOlFoJ3MCKLI9WuWbge4F1WqOFcrInql-RAO-oemgZXR93bJlYOkTEYWhTPDnUqitTgMP09y5vxdfu-8BzXC5YB_5lqt0ecQtM18Ht2YK08ZxDlaWMFE1_T7u4FmmtlYGumEiYAyP2M3fQ9TTK8Ey6zVGrNlnDDspz4dSWY4J9eVrciB160NSesdan72gM4qzKKLuY9BI-uorqM6k5xAQq_BdMJkopqAlL-A2HaN0pTN0sEBZ8OXgG65V9PwfuV_Ymgt-M9lLnZGpbfHQ1xK_WGpV4BuyG09T6c6T4oywwrqpMCCn1xoeNH9FIoPLEGzG-gh4fHQ2k7NdPxCejIKihLTm_PsE-jlLADzsN3VBkZWahl2dSsovOGVU2zMrEGtqfQ96vytcQUVeeQLuwzEMF3nzR_gKgLc6aOqddg4_bc6YR3hfAco8k4ruJf6quunxYQPRwnWKBs2OrHRSEA1WcRJ5MKGJScbvCI2KgsocFLpb3jU3ENXErCB3o8f0U4Kibvaza4Q99LcjFQzI5r0RCM5KxCKBrMQKZ-YvQql1jydNN6COkuQzySmP2ZdNdehS1miBGXSC2WPIPdmwG_sJeZlgtDGlfJLTqB_Jsx-bKpL7WGBi_0u6ywagVf2gZZ-xFKvnocCxqLfHJx8Y-eOjAlcszLvY9fAXhVnItUFQHjGl4K1-dXbnzhCaOTUjQpaiucdLVbr_olYQSjAi8wrcXieZ_lYEDa_0beaqTU7rr_hCNYCfbVGJ4t_yez6rlfjSoXnHnGDAc9bVbp4GbQiCUNn7q5hlrq5zV-BUCzV9du_HR6gLSJkcVg5Bykdv9huUfc2EQjIvxSPMWMR6pYFhLo1W9YCWnV1N95w9-Qyc4NXKc29NS4x3jZoKq7b2LPvDju4d7Zi11bPb2mWyr_IW3ViY8sEwArpukd-uTHFkkGKf1D2YyIJsCHfmf0BWF-z4a9yoBd0fKgaUwA1PHicasKIlHSFRe-SjBZhWFBKMoKAq2cH_xDwjt91B2XlTu1Q-nsnjCuUzbgZr0AkBfj4xFmTbArQ4CDtzVLp4GctxjTPC298PJe0s54JUe2Make1iUhGTnDZrzOQ0RG4Qg4LmAVZY76ZoNBtW6FFCfoavwPx9nw9HF3oR7COfDoX8v5mjhQWZEWMfgKmOcLWXKA_-TMDsmdxyOIK1dUUTAdo99A--2JALEjwLt9G0Djhu4UoT5Z540g4Cl4bNnPORvnt54XV4XT2r02e9EmphCZNP5XsUetk7jos9_ChxjT9n7p9HNxDNX5x2g_I3JgXV1sDhkUdgVWXM8XnubmMvqhw3p6yoF8Rsx2oT1oVOKNTdoBqHIpCXwzWjzkgErj5CHtIHvGBft9atUARIpeuccYiWhoB1aB2xtyrmilN7MN0nPQA5Wumk4PJw3VkxRnCCjwedWs_XII64orSLGrU-wgFm3PHUmbQ6V78ZaTE6zHkMEuWAMEiehqNXo9Rv52nSFYG3PYhpzWWi9XEeAsZqDLsoH-OuimdBmgJFrOkcRRkVru72Vt4wwMUcLo9IwCQmECfoIdzdkz2mc31-WoGC2Pbgs089L-_fHbYJf37jDJC6mvuXayUrn9cprZlP_H36rfgfQcAS5FFajbRVJ0C1W2I_G3h9HjhhCOccQC_pJXZ6788ARJdyD1mSF4qGXW14eDg2ldX1am_2fAiJCBYh6hj2X3z4VVm8ehXKU1z_FPulZM6YVnmt8tzXTjlxWGQXATgIWmbHvfeAW0VhB6FEB-eHoJpUJmUXjcfLAM9nmFBzLDMwK3MWJhqqNq5keSxGmXtYhDAOn3IOo-a0HXHUJzvYG5pKYm43AbzxtxYc3A7DASWlVag-LnE1KlSuXL3DbjiJUnvjvfvG4fdQ0OEjY0eMaXmPV8lGxysENvdoBQc1-R8OTaPl4S7BwzYa_wTCes7Y8Y3HkggiFobsBm_y6BvZn8Y7HoSu_q-9ihaIgp9buuiMItZj36yAHR0asbLVPPBsYkM9cgi09Djf7lTJJVcyiXHj7XR4Ga-ChxYlH-W0ctnsmc2oEVGIuhPUMKPyCFx0r8xgpM6jVF6579peUOgKHTQawqYM-cOHw")
							.formParam("response", "eyJyZXNwb25zZSI6IiIsInMiOiIyMDI5IiwiZSI6ImJXMXZDS2cifQ..")
							.formParam("t", "615")
							.formParam("ct", "615")
							.formParam("bg", "!xsCgwI3IAAY-NvZQPjZHX9XaqwEMcSY-ACkAIwj8RiwvINqnF5uDtLVV52fjdmZKwWdzOFHt8hdMDpr1TRLyvDmonwcAAAB-VwAAAARtAQecBGqzROT3crV50EuL5cAVm5VlqsHlR-2DQe8qklYd1XPTTvriK6AiJehhyJU55_mLPPpppRs8LezjEiQ9Ro4gNr6-JIUybdzXXPI-Y-9dPnzKTufhYNsZSzvmLVtUWzQV0eEJI6un7S8IuQ96r8qsw8V6e3craUzSI0jKGt50q8CEDLOVGAUxIIwTwSVvvbYaGGYZmctrTux2V0I8hjyw-F6UYuuN79qIxWJvjWGz04OtG7TkO5iMk9cSiRke3nJm63ggzj49DBND1aKrXY9nYiETXxn6GB9SagAAXyCsqAcwnEqnG5jMyvHgzV1ZmCdJLj36ziUJ4M9YMxHT3K3IWK4WC2aHLCsBwENN-vMUvA0lZ3Ng9Dkr1WZggz4yA2tHm4Qdn6W6mswnr0qh-m6O0rTZ3aQjuWrufJNR0yjDO69Ir0u1VnedwjtPG3CBEciajT7V01Dfsnsjq2THJ6TbJt6sv_986hE3FVh54GKQlZTtFuw2XgTwLHdw7zgs6ex-o2k6aDeupXe0ltBC38wER8ID5bgOLy9c4SfXJ4PnCoezF0zdoQSlsWoNEiO94gAfXfSC6mNivnDeoM1wIuef-mUsNbwRnrYbhy7HihkSnxRqWHphNCyV_g6e_1ZKM-5ogh0WjrUcgkHKPRFy8bByMMnCB30MplpLfrvdx7jXx1DaSO4-RwOfaTmzhnnPFb5hpIFVEGoIzODCz2uprctvMi7OWiysLzJ0q9E4Hzkvh8zQT6oZ8fg4sbbIuKKf67QkVh4l_XY0sGcU5ZmvSrq3eak2JU2Bz6OdAIVR8WmZ9KeN39VXYl3VPKFAtdetwMprCTeXkcCvXl2vcxPcDJL6OdluKjLnD1r7FEi8zahJw74pK-Ocr5vmdwbSmxOn1La7XM0FXrs0qVsg0L4KXE8AQ6B8d7NAV_WYzxJMUnCPg3OzqHKusH-JK7BU4r_Na2-gMM4p1pOgRzXJX5rZ2AcpRwDoWFc-Uk5mGfsuobq8f2oUOgirkICiQHkx5GD5BOjZzVRhSljUbLEaPsXpO6X5HJX74miRyx3JTMtm4k0Qn_aJ6HmU69V15rsQKlwaV85e3nvRIrBO9O8W-J8vQO31phi4DNiuIFaC14WVdfvGLEvPRh9AnLQyeYyF5yD5SlkTXv6CymrZYtFdn9p27NTQFwV0kOHn0wYxVkFQU1i-rcph9mp4JwQ3U0s86cL8YpTjidjrgre1bvktGdJ0X7likeMQcZOmYiwcORHn__STbButuHlD0lw_ctyouDRXCDWgDBwv4XaEoK7Z9tds6lcXA9izJSqkXw1rLN45YB6QFNyHfNHa1I5TynfC4Brm4te_TsyRK1Lx1IxdMlj_XPE1sri19tqTILs3UNtxVcRPAE6_r7poV2OuH2t2efABGN2DyVXGm56jxxibJ31NoJGvciNjU8dAaVfl9JH7_Indi9PT9yp9XpRqhbivnDrsSZGEpRsxRX5gWiRrhqCez5HUTHy5I25VR2T2wp703w"),
						http("SubsCheckoutMonthly_34")
							.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=850460226806843&t0=click&n0=button&c0=btn%20btn-primary%20long&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step1%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep1%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.align-items-center%3B.d-flex%3B.justify-content-end%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40button%3B.btn%3B.btn-primary%3B.long%3B%7C&ts0=1626429150596&x0=Continue&id1=3736005521113001&t1=submit&n1=form&i1=formStep1&y1=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step1%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep1%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C&ts1=1626429150616&x1=Email%20address%20*%0APassword%20*%0AShow%0AFirst%20name%20*%0ALast%20name%20*%0ABy%20crea&st=1626429152561")
							,
						http("SubsCheckoutMonthly_35")
							.post(uri04 + "/api/register")
							.formParam("username", "ashishnfr@test.com")
							.formParam("password", "Ashish@123")
							.formParam("firstName", "Ashish")
							.formParam("lastName", "Trivedi")
							.formParam("passwordConfirmation", "Ashish@123")
							.formParam("recaptcha", "03AGdBq24UjgnkLXGrc6o2Ik4AA2sHRT25HLwSeDGgyfwfFEU4dSJyGPyt3I5Y-Q1e9nVtYUHRwIp-92TiG3X39ritBjj7axFOfPtzhJYkCmgvz1dnVCG6BXNkYEsmGeHvhfmjtk_0hI7GXY8XSEb6UGXVtFEs95Sdh0cST4P5aro195vI6aU3V0oLJkx1pQokJRneWv9aY-3mZHqF06bHdWmG0Ki225dCKqhmtcfDdRhn4WyiaO40gTvA6qBfwS9fjoZnPkisVoA88IOaSquWsmx1KJWVtDQ-jGXUHNy2-9KysS_HS5fCE3cTOU00RgKuP69DFQZzHX5lr1NV40hd-ibgKh_Ve3r1KnFavrRCUV6SfKc3ZmnMvXV78DU5WJbRy9F-EK4BvGPm1oWvCc5hBHWEhEZvcNUfHNu5FJeFYGWvfHuEPS_vsKYjX44I2xZoR1TaWR71_Ahb0z0DsZA1iLBPFHiHfMw1ZA")
							.formParam("marketingPool", "Subscriber")))
				.pause(1)
				.exec(http("SubsCheckoutMonthly_36")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=656525993787564&t0=click&n0=a&h0=%23&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step2%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.block-address-line%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep2google%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-12%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.text-right%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40a%3B%5Bhref%3D%23%5D%3B%7C&ts0=1626429159670&x0=Enter%20address%20manually&st=1626429160587")
					)
				.pause(1)
				.exec(http("SubsCheckoutMonthly_37")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=6704595784709860&t0=click&n0=input&c0=form-control&i0=state_input&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step2%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.block-address-manually%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40form%3B%23formStep2%3B%5Bdata-form%3Dtrue%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23state_input%3B.form-control%3B%5Bname%3Dstate_input%5D%3B%5Brequired%3Dtrue%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1626429162340&st=1626429162590")
					)
				.pause(1)
				.exec(http("SubsCheckoutMonthly_38")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=8985926203678370&t0=change&n0=input&c0=form-control&i0=state_input&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step2%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24984%5D%3B%7C%40div%3B.block-address-manually%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24983%5D%3B%7C%40form%3B%23formStep2%3B%5Bdata-form%3Dtrue%5D%3B%5Bdata-select2-id%3DformStep2%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40input%3B%23state_input%3B.form-control%3B%5Bname%3Dstate_input%5D%3B%5Brequired%3Dtrue%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1626429170948&id1=5433669133106721&t1=click&n1=span&c1=select2-selection__rendered&i1=select2-country-container&y1=%40div%3B.block-address-manually%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24983%5D%3B%7C%40form%3B%23formStep2%3B%5Bdata-form%3Dtrue%5D%3B%5Bdata-select2-id%3DformStep2%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24982%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24981%5D%3B%7C%40span%3B.select2%3B.select2-container%3B.select2-container--below%3B.select2-container--default%3B.select2-container--focus%3B.select2-container--open%3B%5Bdata-select2-id%3D24978%5D%3B%5Bdir%3Dltr%5D%3B%7C%40span%3B.selection%3B%7C%40span%3B.select2-selection%3B.select2-selection--single%3B%5Baria-activedescendant%3Dselect2-country-result-xxw9-AX%5D%3B%5Baria-disabled%3Dfalse%5D%3B%5Baria-expanded%3Dtrue%5D%3B%5Baria-haspopup%3Dtrue%5D%3B%5Baria-labelledby%3Dselect2-country-container%5D%3B%5Baria-owns%3Dselect2-country-results%5D%3B%5Brole%3Dcombobox%5D%3B%5Btabindex%3D0%5D%3B%7C%40span%3B%23select2-country-container%3B.select2-selection__rendered%3B%5Baria-readonly%3Dtrue%5D%3B%5Brole%3Dtextbox%5D%3B%5Btitle%3DAland%20Islands%5D%3B%7C&ts1=1626429170960&x1=Aland%20Islands&st=1626429172639")
					)
				.pause(1)
				.exec(http("SubsCheckoutMonthly_39")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=4045745289177329&t0=change&n0=input&c0=select2-search__field&y0=%40span%3B.select2-container%3B.select2-container--default%3B.select2-container--open%3B%7C%40span%3B.select2-dropdown%3B.select2-dropdown--below%3B%5Bdir%3Dltr%5D%3B%7C%40span%3B.select2-search%3B.select2-search--dropdown%3B%7C%40input%3B.select2-search__field%3B%5Baria-activedescendant%3Dselect2-country-result-oleu-IN%5D%3B%5Baria-autocomplete%3Dlist%5D%3B%5Baria-controls%3Dselect2-country-results%5D%3B%5Bautocapitalize%3Dnone%5D%3B%5Bautocomplete%3Doff%5D%3B%5Bautocorrect%3Doff%5D%3B%5Brole%3Dsearchbox%5D%3B%5Bspellcheck%3Dfalse%5D%3B%5Btabindex%3D0%5D%3B%5Btype%3Dsearch%5D%3B%7C&ts0=1626429174445&st=1626429174650")
					)
				.pause(1)
				.exec(http("SubsCheckoutMonthly_40")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=1707064550151361&t0=click&n0=span&c0=select2-selection__placeholder&y0=%40div%3B.block-address-manually%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24983%5D%3B%7C%40form%3B%23formStep2%3B%5Bdata-form%3Dtrue%5D%3B%5Bdata-select2-id%3DformStep2%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D25249%5D%3B%7C%40div%3B.form-group%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D25248%5D%3B%7C%40span%3B.select2%3B.select2-container%3B.select2-container--below%3B.select2-container--default%3B.select2-container--open%3B%5Bdata-select2-id%3D25211%5D%3B%5Bdir%3Dltr%5D%3B%7C%40span%3B.selection%3B%7C%40span%3B.select2-selection%3B.select2-selection--single%3B%5Baria-activedescendant%3Dselect2-state-result-qweu-Andhra%20Pradesh%5D%3B%5Baria-disabled%3Dfalse%5D%3B%5Baria-expanded%3Dtrue%5D%3B%5Baria-haspopup%3Dtrue%5D%3B%5Baria-labelledby%3Dselect2-state-container%5D%3B%5Baria-owns%3Dselect2-state-results%5D%3B%5Brole%3Dcombobox%5D%3B%5Btabindex%3D0%5D%3B%7C%40span%3B%23select2-state-container%3B.select2-selection__rendered%3B%5Baria-readonly%3Dtrue%5D%3B%5Brole%3Dtextbox%5D%3B%7C%40span%3B.select2-selection__placeholder%3B%7C&ts0=1626429175898&x0=Please%20select&st=1626429176657")
					)
				.pause(1)
				.exec(http("SubsCheckoutMonthly_41")
					.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=1727084615332238&t0=change&n0=input&c0=select2-search__field&y0=%40span%3B.select2-container%3B.select2-container--default%3B.select2-container--open%3B%7C%40span%3B.select2-dropdown%3B.select2-dropdown--below%3B%5Bdir%3Dltr%5D%3B%7C%40span%3B.select2-search%3B.select2-search--dropdown%3B%7C%40input%3B.select2-search__field%3B%5Baria-activedescendant%3Dselect2-state-result-js3t-Maharashtra%5D%3B%5Baria-autocomplete%3Dlist%5D%3B%5Baria-controls%3Dselect2-state-results%5D%3B%5Bautocapitalize%3Dnone%5D%3B%5Bautocomplete%3Doff%5D%3B%5Bautocorrect%3Doff%5D%3B%5Brole%3Dsearchbox%5D%3B%5Bspellcheck%3Dfalse%5D%3B%5Btabindex%3D0%5D%3B%5Btype%3Dsearch%5D%3B%7C&ts0=1626429177674&st=1626429178661")
					.resources(http("SubsCheckoutMonthly_42")
						.post(uri03 + "/")
						.body(RawFileBody("computerdatabase/subscheckoutmonthly/0042_request.dat")),
						http("SubsCheckoutMonthly_43")
							.get("/h?a=34805961&u=4108670115000370&v=1711085653074172&s=7413587133146124&i=bc0052a9-aa30-413f-81d7-720c06ce9652&b=web&tv=4.0&sp=ts&sp=1626428820540&sp=d&sp=www.packtpub.com&sp=h&sp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=d&pp=www.packtpub.com&pp=h&pp=%2Fcheckout%2Fsubscription%2Fpackt-subscription-monthly-launch-offer&pp=t&pp=Checkout%20%7C%20Packt&pp=ts&pp=1626429112373&id0=723311983217631&t0=click&n0=button&c0=btn%20btn-primary%20long&y0=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step2%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24984%5D%3B%7C%40div%3B.block-address-manually%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24983%5D%3B%7C%40form%3B%23formStep2%3B%5Bdata-form%3Dtrue%5D%3B%5Bdata-select2-id%3DformStep2%5D%3B%5Bmethod%3Dpost%5D%3B%7C%40div%3B.text-right%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40button%3B.btn%3B.btn-primary%3B.long%3B%7C&ts0=1626429179187&x0=Continue&id1=5954317582818643&t1=submit&n1=form&i1=formStep2&y1=%40div%3B.checkout%3B.container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.checkout-stepper-block-A%3B.col-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.active%3B.step2%3B.steps%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.body%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24984%5D%3B%7C%40div%3B.block-address-manually%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-select2-id%3D24983%5D%3B%7C%40form%3B%23formStep2%3B%5Bdata-form%3Dtrue%5D%3B%5Bdata-select2-id%3DformStep2%5D%3B%5Bmethod%3Dpost%5D%3B%7C&ts1=1626429179202&x1=Address%20Line%201%20*%0AAddress%20Line%202%0ACity%20*%0AState%20*%0AAndhra%20Pradesh%0AAr&st=1626429180670")
							,
						http("SubsCheckoutMonthly_44")
							.post(uri04 + "/api/checkout/address")
							.formParam("line1", "dfdfgdfgdfg")
							.formParam("line2", "sdsdsdf")
							.formParam("city", "Mumbai")
							.formParam("postalCode", "400608")
							.formParam("country", "India")
							.formParam("state", "Maharashtra"),
						http("SubsCheckoutMonthly_45")
							.get(uri04 + "/api/checkout/rateplan/packt-subscription-monthly-launch-offer/INR?productId=")
							))
		}


	val anyuser = scenario("SubsCheckoutMonthly").exec(SubsCheckout.checkout)
	setUp(anyuser.inject(nothingFor(5),
		atOnceUsers(users =1),
		rampUsers(users = 5)during(10),
		constantUsersPerSec(rate = 20) during(20)
	))
		.protocols(httpProtocol)
}