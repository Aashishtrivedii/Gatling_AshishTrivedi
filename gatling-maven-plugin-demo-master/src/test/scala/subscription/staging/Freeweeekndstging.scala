package subscription.staging

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Freeweeekndstging extends Simulation {

	val httpProtocol = http
		.baseUrl("https://heapanalytics.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0")


	val uri01 = "https://www.google-analytics.com"
	val uri02 = "https://www.facebook.com/tr"
	val uri03 = "https://subscriptions-api-staging.packtpub.com/v1/users/me/subscriptions"
	val uri04 = "https://users-packtlib-api-staging.packtpub.com/v2/users/me/views/history"
	val uri05 = "https://getpocket.cdn.mozilla.net/v3/firefox/global-recs"
	val uri06 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
	val uri07 = "https://www.googletagmanager.com/gtm.js"
	val uri08 = "https://services-staging.packtpub.com"
	val uri09 = "https://static.hotjar.com/c/hotjar-982604.js"
	val uri10 = "https://subscription-staging.packtpub.com"
	val uri11 = "https://www.recaptcha.net/recaptcha"
	val uri12 = "https://static.packt-cdn.com/products"
	val uri13 = "https://stats.g.doubleclick.net/j/collect"
	val uri14 = "https://cdn.polyfill.io/v2/polyfill.min.js"
	val uri15 = "https://geolocation-api-staging.packtpub.com/v1/location"
	val uri16 = "https://www2.profitwell.com/dotjs/v1/quests"
	val uri17 = "https://www.google.com"
	val uri18 = "https://static-staging.packt-cdn.com"
	val uri19 = "https://www.google.co.in"
	val uri20 = "https://widget.intercom.io/widget/lts26lhx"
	val uri22 = "https://fonts.googleapis.com"
	val uri23 = "https://in.hotjar.com/api/v2/client/sites/982604/visit-data"


	// URL hit and register process
	object FreeWeekendRegister{
		val register =exec(http("Freeweeekndstg_0")
			.get(uri10 + "/register")
			.resources(http("Freeweeekndstg_1")
				.post(uri10 + "/cdn-cgi/rum?req_id=678ed8b9ac3f2cf2")
				.body(RawFileBody("computerdatabase/freeweeekndstg/0001_request.json")),
				http("Freeweeekndstg_2")
					.get(uri14 + "?features=default,Array.prototype.findIndex,Array.prototype.find,Array.prototype.includes&flags=gated")
					,
				http("Freeweeekndstg_3")
					.get(uri11 + "/api.js?onload=vcRecaptchaApiLoaded&render=explicit")
					,
				http("Freeweeekndstg_4")
					.get(uri07 + "?id=GTM-WJMM825")
					,
				http("Freeweeekndstg_5")
					.get(uri11 + "/api.js?render=explicit&onload=recaptchaCallback&_=1627986537441")
					,
				http("Freeweeekndstg_6")
					.get(uri11 + "/api2/anchor?ar=1&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&co=aHR0cHM6Ly9zdWJzY3JpcHRpb24tc3RhZ2luZy5wYWNrdHB1Yi5jb206NDQz&hl=en&v=ecapuzyywmdXQ5gJHS3JQiXe&size=invisible&cb=5lt5218u6lrj")
					,
				http("Freeweeekndstg_7")
					.get(uri09 + "?sv=7")
					,
				http("Freeweeekndstg_8")
					.get(uri09 + "?sv=6")
					,
				http("Freeweeekndstg_9")
					.get(uri11 + "/api2/bframe?hl=en&v=ecapuzyywmdXQ5gJHS3JQiXe&k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI&cb=yli47jcc79na")
					,
				http("Freeweeekndstg_10")
					.post(uri11 + "/api2/reload?k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI")

					.body(RawFileBody("computerdatabase/freeweeekndstg/0010_request.dat")),
				http("Freeweeekndstg_11")
					.get(uri06 + "/?random=1627986538165&cv=9&fst=1627986538165&num=1&guid=ON&resp=GooglemKTybQhCsO&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg820&sendb=1&ig=0&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fregister&tiba=Register%20%7C%20Packt%20Subscription&hn=www.google.com&async=1&rfmt=3&fmt=4")
					,
				http("Freeweeekndstg_12")
					.get(uri17 + "/pagead/1p-user-list/945348752/?random=1627986538165&cv=9&fst=1627984800000&num=1&guid=ON&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg820&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fregister&tiba=Register%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=1456185503&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
				http("Freeweeekndstg_13")
					.get("/h?a=3992788168&u=4795614039423690&v=5139294933682533&s=4108571853206024&b=web&tv=4.0&z=2&h=%2Fregister&d=subscription-staging.packtpub.com&t=Register%20%7C%20Packt%20Subscription&ts=1627986538071&sp=ts&sp=1627986415482&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fregister&st=1627986538072")
					,
				http("Freeweeekndstg_14")
					.get(uri19 + "/pagead/1p-user-list/945348752/?random=1627986538165&cv=9&fst=1627984800000&num=1&guid=ON&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg820&sendb=1&frm=0&url=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fregister&tiba=Register%20%7C%20Packt%20Subscription&async=1&fmt=3&is_vtc=1&random=1456185503&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
				http("Freeweeekndstg_15")
					.post(uri23 + "?sv=6")
					.body(RawFileBody("computerdatabase/freeweeekndstg/0015_request.txt")),
				http("Freeweeekndstg_16")
					.post(uri10 + "/cdn-cgi/rum?req_id=678edc0f3f0a5d31")
					.body(RawFileBody("computerdatabase/freeweeekndstg/0016_request.json")),
				http("Freeweeekndstg_17")
					.get(uri20)
					,
				http("Freeweeekndstg_18")
					.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fregister&rl=&if=false&ts=1627986540741&sw=1280&sh=1024&v=2.9.44&r=stable&ec=0&o=30&fbp=fb.1.1627986418780.419222997&it=1627986540476&coo=false&rqm=GET")
					,
				http("Freeweeekndstg_19")
					.post(uri13 + "?t=dc&aip=1&_r=3&v=1&_v=j92&tid=UA-284627-1&cid=1346660471.1627986418&jid=1919652179&gjid=1518050286&_gid=565459150.1627986418&_u=SCCAAEACQAAAAC~&z=282810235")
					,
				http("Freeweeekndstg_20")
					.get(uri02 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fregister&rl=&if=false&ts=1627986541253&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Register%20%7C%20Packt%20Subscription%22%2C%22meta%3Adescription%22%3A%22Register%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Register%20%7C%20Packt%20Subscription%22%2C%22og%3Adescription%22%3A%22Register%20to%20Packt%20Subscription%20to%20access%20your%20account%20where%20you%20will%20find%207%2C500%2B%20eBooks%20and%20Videos%2C%20plus%20Learning%20Paths%2C%20Projects%20and%20Bookmarks%22%2C%22og%3Aurl%22%3A%22https%3A%2F%2Fsubscription-staging.packtpub.com%2Fregister%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fd2aov160eccqlv.cloudfront.net%2F593facffb436417ebb80f1a60c320883%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fd2aov160eccqlv.cloudfront.net%2F593facffb436417ebb80f1a60c320883%2Fimages%2Fc2c6a55f3f3f607b84b0cb3dcf8b8dfe.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.44&r=stable&ec=1&o=30&fbp=fb.1.1627986418780.419222997&it=1627986540476&coo=false&es=automatic&tm=3&rqm=GET")
					,
				http("Freeweeekndstg_21")
					.get(uri17 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j92&tid=UA-284627-1&cid=1346660471.1627986418&jid=1919652179&_u=SCCAAEACQAAAAC~&z=534364308")
					,
				http("Freeweeekndstg_22")
					.get(uri19 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j92&tid=UA-284627-1&cid=1346660471.1627986418&jid=1919652179&_u=SCCAAEACQAAAAC~&z=534364308")
					))
			.pause(3)
			.exec(http("Freeweeekndstg_23")
				.post(uri02 + "/")
				.body(RawFileBody("computerdatabase/freeweeekndstg/0023_request.dat"))
				.resources(http("Freeweeekndstg_24")
					.get("/h?a=3992788168&u=4795614039423690&v=5139294933682533&s=4108571853206024&b=web&tv=4.0&sp=ts&sp=1627986415482&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fregister&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fregister&pp=t&pp=Register%20%7C%20Packt%20Subscription&pp=ts&pp=1627986538071&id0=8796445666453883&t0=click&n0=a&c0=cc-btn%20cc-dismiss&y0=%40div%3B.cc-banner%3B.cc-bottom%3B.cc-color-override-637850434%3B.cc-theme-classic%3B.cc-type-info%3B.cc-window%3B%5Baria-describedby%3Dcookieconsent%3Adesc%5D%3B%5Baria-label%3Dcookieconsent%5D%3B%5Baria-live%3Dpolite%5D%3B%5Brole%3Ddialog%5D%3B%7C%40div%3B.cc-compliance%3B%7C%40a%3B.cc-btn%3B.cc-dismiss%3B%5Baria-label%3Ddismiss%20cookie%20message%5D%3B%5Brole%3Dbutton%5D%3B%5Btabindex%3D0%5D%3B%7C&ts0=1627986544554&x0=Accept&id1=6887930775640055&t1=click&n1=input&c1=form-control%20mb10&i1=create-account-first-name&y1=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B%23create-account-form%3B.form-signin%3B.ng-dirty%3B.ng-invalid%3B.ng-invalid-required%3B.ng-valid-parse%3B%5Bname%3Dcreate-account-form%5D%3B%5Bng-submit%3DcreateAccountController.validateAndSubmitForm()%5D%3B%7C%40input%3B%23create-account-first-name%3B.form-control%3B.mb10%3B%5Bname%3Dfirst-name%5D%3B%5Bplaceholder%3DFirst%20Name%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dname%5D%3B%7C&ts1=1627986546044&st=1627986546095")
					))
			.pause(3)
			.exec(http("Freeweeekndstg_25")
				.get("/h?a=3992788168&u=4795614039423690&v=5139294933682533&s=4108571853206024&b=web&tv=4.0&sp=ts&sp=1627986415482&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fregister&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fregister&pp=t&pp=Register%20%7C%20Packt%20Subscription&pp=ts&pp=1627986538071&id0=6375763066939258&t0=change&n0=input&c0=form-control%20mb10&i0=create-account-first-name&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B%23create-account-form%3B.form-signin%3B.ng-dirty%3B.ng-invalid%3B.ng-invalid-required%3B.ng-valid-parse%3B%5Bname%3Dcreate-account-form%5D%3B%5Bng-submit%3DcreateAccountController.validateAndSubmitForm()%5D%3B%7C%40input%3B%23create-account-first-name%3B.form-control%3B.mb10%3B%5Bname%3Dfirst-name%5D%3B%5Bplaceholder%3DFirst%20Name%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dname%5D%3B%7C&ts0=1627986549367&st=1627986550118")
				)
			.pause(1)
			.exec(http("Freeweeekndstg_26")
				.get("/h?a=3992788168&u=4795614039423690&v=5139294933682533&s=4108571853206024&b=web&tv=4.0&sp=ts&sp=1627986415482&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fregister&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fregister&pp=t&pp=Register%20%7C%20Packt%20Subscription&pp=ts&pp=1627986538071&id0=569169161969691&t0=change&n0=input&c0=form-control%20mb10&i0=create-account-last-name&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B%23create-account-form%3B.form-signin%3B.ng-dirty%3B.ng-invalid%3B.ng-invalid-required%3B.ng-valid-parse%3B%5Bname%3Dcreate-account-form%5D%3B%5Bng-submit%3DcreateAccountController.validateAndSubmitForm()%5D%3B%7C%40input%3B%23create-account-last-name%3B.form-control%3B.mb10%3B%5Bname%3Dlast-name%5D%3B%5Bplaceholder%3DLast%20Name%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dname%5D%3B%7C&ts0=1627986551346&st=1627986552135")
				)
			.pause(1)
			.exec(http("Freeweeekndstg_27")
				.get(uri05 + "?version=3&consumer_key=40249-e88c401e1b1f2242d9e441c4&locale_lang=en-US&region=IN&count=30")

				.resources(http("Freeweeekndstg_28")
					.get("/h?a=3992788168&u=4795614039423690&v=5139294933682533&s=4108571853206024&b=web&tv=4.0&sp=ts&sp=1627986415482&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fregister&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fregister&pp=t&pp=Register%20%7C%20Packt%20Subscription&pp=ts&pp=1627986538071&id0=5443672639215328&t0=change&n0=input&c0=form-control&i0=create-account-email&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B%23create-account-form%3B.form-signin%3B.ng-dirty%3B.ng-invalid%3B.ng-invalid-required%3B.ng-valid-parse%3B%5Bname%3Dcreate-account-form%5D%3B%5Bng-submit%3DcreateAccountController.validateAndSubmitForm()%5D%3B%7C%40input%3B%23create-account-email%3B.form-control%3B%5Bname%3Demail%5D%3B%5Bplaceholder%3DEnter%20Email%5D%3B%5Brequired%3D%5D%3B%5Btype%3Demail%5D%3B%7C&ts0=1627986559946&st=1627986560179")
					))
			.pause(2)
			.exec(http("Freeweeekndstg_29")
				.get("/h?a=3992788168&u=4795614039423690&v=5139294933682533&s=4108571853206024&b=web&tv=4.0&sp=ts&sp=1627986415482&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fregister&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fregister&pp=t&pp=Register%20%7C%20Packt%20Subscription&pp=ts&pp=1627986538071&id0=3017749595202972&t0=change&n0=input&c0=form-control%20ng-untouched%20ng-not-empty%20ng-dirty%20ng-valid-parse%20ng-valid%20ng-valid-required&i0=create-account-password&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B%23create-account-form%3B.form-signin%3B.ng-dirty%3B.ng-invalid%3B.ng-invalid-required%3B.ng-valid-parse%3B%5Bname%3Dcreate-account-form%5D%3B%5Bng-submit%3DcreateAccountController.validateAndSubmitForm()%5D%3B%7C%40div%3B.form-group%3B.relative-parent%3B%7C%40input%3B%23create-account-password%3B.form-control%3B.ng-dirty%3B.ng-not-empty%3B.ng-untouched%3B.ng-valid%3B.ng-valid-parse%3B.ng-valid-required%3B%5Bname%3Dpassword%5D%3B%5Bng-blur%3DcreateAccountController.registerForm.password.focus%20%3D%20false%5D%3B%5Bng-change%3DcreateAccountController.monitorRegisterPassword()%5D%3B%5Bng-focus%3DcreateAccountController.registerForm.password.focus%20%3D%20true%5D%3B%5Bng-model%3DcreateAccountController.registerForm.password.text%5D%3B%5Bplaceholder%3DChoose%20Password%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dpassword%5D%3B%7C&ts0=1627986568507&st=1627986570227")
				)
			.pause(2)
			.exec(http("Freeweeekndstg_30")
				.post(uri01 + "/j/collect?v=1&_v=j92&a=2147440869&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fregister&dp=%2Fregister&ul=en-us&de=UTF-8&dt=Register%20%7C%20Packt%20Subscription&sd=24-bit&sr=1280x1024&vp=1263x899&je=0&ec=Form&ea=Create%20Account&el=https%3A%2F%2Fsubscription-staging.packtpub.com%2Fregister&_u=SCCAAEADQAAAAC~&jid=1216534359&gjid=1868532965&cid=1346660471.1627986418&tid=UA-284627-8&_gid=565459150.1627986418&_r=1&gtm=2wg820WJMM825&cd3=1627986577841.f1ihkh9q&cd4=2021-08-03T15%3A59%3A37.841%2B05%3A30&cd12=Logged%20out&cd2=1346660471.1627986418&cg1=Subscription%20-%20Register&cg2=Subscription&cg3=Register&cg4=No%20Content%20Grouping&cg5=No%20Content%20Grouping&cd8=&cd16=No%20Query%20Parameters&z=509264482")

				.resources(http("Freeweeekndstg_31")
					.post(uri11 + "/api2/userverify?k=6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI")
					.formParam("v", "ecapuzyywmdXQ5gJHS3JQiXe")
					.formParam("c", "03AGdBq24TV3opOJFl5MtVlr3qOtxbBqjp4nJC3T0xywZzmCJhwcsOur2CH8fw9vr3VQ1zDCVTmyZ-aMEicmffTE-71PH3NYVIVB307y3bdIiOo4zNfEz2DTuA_S3saJEYaLpzMGzeVxoQg6OQ4jxLo8u4_T_KastsGBYQZErKHjoI_u6nufr3lTUAPO3k14SZl5Uyzn92XU8KbYXdZZyW8gacA2dy2yrJDlLhukGqk3g3LJXArm-it7DBoPeC4u_muFXwKLKJi8H9fs_ytbJ4I02X8VjRfbCER8Rv579VuvAdOJDTIDLjjp9ma1NYhyAEGC30l6FC_Pg8R8Pv7GY0coTKyPcoyL3nIwnKe-hu3h84J3bEa0GvZ5fYDwRdqBzePCXAfQVxhXthBGKNpF-c1q8HJypXhVyg0Gl09T18vlaXLCGw6nG2OtuNdebh7L62j6SUz-DV8klyYk4t3scvCeRpCms4aqC26RiZLYIen05b9DMPyYgLSYFiiNaKU3ECd8TSz2O1eIIeC_J47bHoFvOhVFCdGf7Tv7Az-v9buEk0-oXb-1Fvzi4PIdEHRCEtMc_F45rqf8IhtLsgWORXr9KNFw4GuQh--5nu718eJHwz_BxFJPhdtI3TV4dWUB9R-sE9ZfPiBxJmeUdMR5KvFkzLhhU5hwtX8LStSocEGtjIaJXfcf1Ypap-OTYxUMU-BOK1-d2N6o6JQ9qlgPRXAE5kiOP9z-jYIyG_A3OszCExM0ZuhK7a_SVl_w4SrMvBdIYGC9da-xKfXW5kmLK5T9zeEtjrV9-aGYACBGfX_q6Q5LBn6-w6_ZM3M1iq4L3WbAK--5UEby2vz0m6J9KeadJbN80rr75S-1Vjgy6iM_3hX2WKEI0K1t88zCVdKCF9J1dluq3K9u0qm38i_tHsBCKIrAyihVPk7ydWItgq7IDwyDfZCll05beKpBBK0YwCTWQMN6eUsoA-wBnEJD0ZysLfOxh5-qiBqfsQiCWu46nxNNfrD6rD0b0IQo_gjVS-Y20QJSXW3uSoVumBghwU7tv5cESS3k0K8R_2bw0GR0itqBs7GxZWoy5wUNiU3kKu8uYNDz6bSKFa2IcL3KSz960vfYKMwMHhEPU1qdXG9_nTO4Yg_fzshLfhxZ_UWPGtwDW8a-YuERPFoQAGcjVnaHPKsMOC37LLdynsfThbfwQnanvCXFFCrqhtUDIPNQZSIVmDWZTgniUXkFr247siUGIPxNkIfCzODh0QzApczSxAQiFrliQO6rmM3wdMfQzVJn9KwDJXlVLxxMvJ0Dd_WG5Iyg9RXjnFhwvvMd6iLsfJ4Gx3Z5P7fYQPdwaAvkuhgZKr42DqVl7Axrc8yO-a5ZtwmiL7iwZ0b84VBAu1Pf7OHJePfYvuf4GCQxmWVEZoMxthp-v3t5EMi0_D2JWuTm7OHXlORiaaU9k-N1-mqbo0k9-gUKV5o9QRmKiK7LM85UQEKFYPSccGNLvIS863c-E92OuMZDgyxTqPNWR-8ZmDmxtMI9SYBBd7yBqZKoo75ZdXp4UaFEAprU9VrEeviFCy_Jd-7NVU6OKrtUwpX7kcDY4cEsNsUi7MJVCRuyHByUmyx6kIaL-toQvM7oi2-EsEG1p5pNgCvHPi5AlCs2un8XLwElJcihikk0J952azAHTc_kRdiAd7G_CCszNhoZ_X5DHK_IWcm6hLv2EioSS5stlOVGxcVfZD_uD9Yhe_xSGG7zk-rQNU44Is-Xocpt_3OJws5elnhjcB_bz_WFAuPd_6j50zNlm7w26px1Da-QDAqiBYz0D-bqLgczaMkiHoZ2Zi0c6lzVhWr9gSqWaFtKCQ549vGWtNfOE-dnSL3CbCV9S0twRbTTWgPm8939gDkXbMyInRcL5MewTipZt-eQdrVv2ZbU60ug4MpGrY6UPUm-EGjU4W0Jkpx1_lQ2kXj-Ao8v-uGMLYNcOASypwGK_AwxyF2Ysv0Ca0coRCOBgGvJ6um9SZOd0kAomXlUNTRKelxNcrmmXqsMBzNlja1qGlfCls0f5NjxbpvzIU6X1jEAG-CvKdZdScAvmyWdgXD_O0LsHOCR4mUmGXkEAAl0tWUY7nDIcuhEqty5ZFKb-Kg4gZ3kIqMyl11ws3xDsgbrL6I24QZqc4LFoMz5Hf3KG8KUGzB8RYeD6juSd8RR_CWnSB6q1yBxUlQ5uKZY7va0M4LN55q8smIk7WHGy90UgxnZCVGrjmfEpoip3ueHrUkU44Q9Ck8K0WChytG0RagzO3amM4wKjtozit_xGLKyIWVol78SyypXXzaXw5tLLi7yjoAk_kw7lBe6eP6BhGLEMXo4mLozS6wrHdclyAA486_Wo01HycY-V-dzw4b-68fsq8FfDwNf0VchglHerHFzfweCllJReaV3GkwJDcPK5CuDNM78zJELSM17EKTzPd5kdfKXTUVfuWnAPUbnwQvOrc5rQ-9tvU2fCq9_tV4oOVV91eQ5xEqQK1MRVTPxSAgKjspqEPi4lz4GR5jVR_wAnU-cBn86jg-xHIg1yYj3ZxMZAqiVjaUcN-YFDbSSbdTy1kMMxtSLRMKPEdfZqSmop9S0bqlYQ3k73QT4VeJfMYPuWf5s1O3oBQ6GGA3Hs6fGutsZwyfDKLElYX6ydPEWqqeq72QtChc8zzlQv-cTR2IVWnMSNG1BSRiJ_K1N0d5P4a2GWsWJIHwWZcjKtGbX7gA_zJyKb9qCML8besYsxYiwq14P95lDvgCVNzvvnCiGjB3gWQkHa-8R5LuWgT-R0EJjuENOn0ApxBqse_YxYpBIu9Vg3mQd2hW-rw633MV3EWyQQI1NCyKnank4c_EG2YVmGNFwZ9lMGdjhufEuK9kUrsEMe8lp1M80bvLZGpS22NW5WvUmd4xzxdNiy4-Pji27Zjxp5VwNK36Je76mdHWk8U97EamBTvBr8PDarp7Q6dudr-gY4-CcK_UeeCfjF6nZDzFwxzLgNrpfyyCsCILABHnAIV3Xo8kpvluzvUxUzkH4614Q4J-81M393PfDSwwlAUeQ")
					.formParam("response", "eyJyZXNwb25zZSI6IiIsInMiOiJkMmViIiwiZSI6ImJXMXZDS2cifQ..")
					.formParam("t", "39095")
					.formParam("ct", "39095")
					.formParam("bg", "!q62gragKAAQeAMIQbQEHnAgEoJwfVGmpCcuwB3J4IpApBv5HupBmbLtgt6HPDokao0onR6Flw4fYqlAjc-hN5oV6SpP5grl4eek-sCiwOlJPL7GenHiJP5lamtWaaDj9M4qa-udnuCae5PIA8Lq2WHKUEuM8kxx3ZeJcbjpGsRlw4237EqC7QaO6Yb5kDLTJzlt_VSrm6n3Tvm1fICVuNloWLgCN-GB2_eajKudLwqoKz_LcWz8vGccziWYJemoHpfj0PwZbK1xTaRNjZ6uGKDK715PdtG3x1yDrdSQfLU9KZqrvif7XWps8GWu39BppXMbIG8JWeSG6C3vqXR2XLewbZfVYXI3L8OtHlIVZErDFrkBa4xGis1SGp82mwmS0CumkM62R4d031J5jWOKfW4mf80g-v7sbLYgDXAKGvqvz8Qdevhov4ybtHIknKk_Fs473l_VCLNb7vMIu1b0k3NC4tlhz9eQ9jF6EPXjYPiEMyPgGijAnQ2WG2A6kymfudEFQpE5EyHimfaEbPn7Zqk3RYDQbc8jxY4AqtRfIxrq5RetpLiZjh2P7kOdD-M9iuWabaCm9rlzv_10GbFToTEZaw_wAN_OAZoVowuFo3PzX0i12u7Fakc2PJ4Rht1fn9cDHxb_Q0bNiogfzJSH3F20pHv_tidDKslL7YYrwOlTBsPIPLBXo6uw_IacNeZCE3x0oeapA4kK4Q7UeouFqzAmqw5myM40S-MAlhbTJ-i1sLWAsSoT6NN5qhf-_SsOfEC-dq6bUMDo91aDDMIgKkmUiDH38TyRV0yvI_A1lv2eyFjQnoRvgbFbk2nJflLzwEVH40GVvxcgcVDtpe7kqZi_pzxJf05lvo9JadddmoUTUo-SbxqTqntghV5Xb0zmsW0-B71P3pB_E-GOI1AynxoVSMOrAf_ZEzJEXjIotnOsxBZ7p_fygKSJpmxo0OURPp0PQzDH6lR3v3OszI1IntJACn4aM2jbf_UxzENwcwaV82sTVqm8Vvd_FLkQzUudKr6qxk2MQldm_KV3VLz8JIOYp_ZZGqA0KXQEYguH5GOgFPfX5CbMcn01SmNp-3Vlv6EhE0Ird3W9JGFrG5xuS4hPd6fWmfTXWlSYcjN5IS-hP15E96btq1YIQFTPwJVWSFo8Ztwgdxic6fXeJZ2kCOeKilkCcmPK2iOSo2R4Y3Bmu18WYLID4CzWPxm0eTxSDQLuGdR8dgXHodHI7MDt9U4ZJCuS2yivQsVwWxs4DRN4XsOxcG97lJCrVZbcr6W_3O5uLIG4wX08RWmvmU7ZhAfg-fKemZ1nBLljlKFceRRxukB5lYi9qR86iUwK5mcqrE8-4RnUh2ouDT8NDq06-XEqtmIrNhJPhOMKHHLDbiRykNx8Z0MPwJ_emhFHiCLKQYk6hCNmE76QKNTFWDIv5W9kWoN9sOd5GVmqbtRvQmPrsx__8K0Fo35trv2t5OcyW-3NvSF5LncJ_P0I6HEsuB1hhkjOXB3cGACEf6H_HRNLHe7OIHQQjSxsv8nudoi5_h76nVnOZL3LbapWj6sNvq4AlENSl1cbN6tXiVZzNop9Bn2ICQ5fa1O7ZBJ0EWSfG8R8LCgn5v5jtpsfCI3Yf2U33_WbM_s__z_WVhgMAep58P9V0h_9U4QRy5D9jSiC1zBZteHPs060Db5wu4QZaKujiim9lIBoQ439yBsWZZCwycPLA1DQ8g8h-M4L06bfAsmO-uYDQVH7ioxw9NnVNnjXricM_zPgMWOz1m-rAzSwvettAipQkcHqoE89IQsUR7p79wRRC7dy4vc0zbuUeg80o4a72rX8qV3sMsbT4aVs4ydEiRRNvRO-Q55DtbJGGcIRpq5pYeJhs1n240c15cCreKw6hVsYqrMnxOb7nl0VIX1Qi7jZs30W7MrOWw21ANO8jIs5oN70dH7LhiS5MNoWA2oDM8xKBvgjS7Ua3YLhTMOoqAmCsaN12T6DB8gZ9gWKwLuquFpTyYQjqsKjyqY7TqBKSvMKzNqJ4cJInQ9jWSCgaHAxd4ax9znnwCbAbSlPk-StsLjj-9h4_LaTzMyTOemR_2HSGKfA9kxv0qqaJ1_elDwCSOfwzt_p_xu4oKptMK4RLc93SUVvlR682JGU7O6RvGMF5MhtuqIxhY0UQ3T9hs4Gwwus1IIyPuCC0XwPFuIwevUZmhwJ9L7PCMCO72PW0rk21U6PIW0Mm51_pp5iSizosbSE2aeJ0NU0OOH9-vQXBQcYaQBrdtD2iKWPa7yGithA9quC-YsVxEHPcqw-Y8G7yte1XRtStVyKyT4v5j-5jvgwkqsyNojxEddVt25EYrHBKnxHysCVftMbifGAxY6KLsT0OD3LivO70K0c-vRsxDi8hFFwFPh2kHfQXWC9ma1UAO25qab31AdwPJdMq0C3v6_6eot-1r2r996WcZfx0plH2ArhShRN1e5NxejfXsIB2bHoAbvM5Tt8mD6EeISDofHCix7xQIDkTlMXdVZMFR1In8vemU0e81NPZEnR_EfVArK5ohCooTXh3CjNiGu4jw8ziQJEg67PudzOxBICkl801ZmnhFoe8pkg-q5nLWzy_0Gs2qOA9VfRIinSg_thga_VFJ-g0J4WscJvnCbUEQ2_F5dVtSLNrzsscIrRsl7yk0UkSXWCGxQ652mBcKJ0GwY2nlIM9Z1Tr5fhml0wTXDjTjWZ18IqZqWuNfR7i31wtRqx4TMbgaCr3sgPRZoPo8nbW0hwZZGNDHXLJzIZs"),
					http("Freeweeekndstg_32")
						.post(uri13 + "?t=dc&aip=1&_r=3&v=1&_v=j92&tid=UA-284627-8&cid=1346660471.1627986418&jid=1216534359&gjid=1868532965&_gid=565459150.1627986418&_u=SCCAAEADQAAAAC~&z=1509278794")
						,
					http("Freeweeekndstg_33")
						.get(uri17 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j92&tid=UA-284627-8&cid=1346660471.1627986418&jid=1216534359&_u=SCCAAEADQAAAAC~&z=2091448820")
						,
					http("Freeweeekndstg_34")
						.get(uri19 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j92&tid=UA-284627-8&cid=1346660471.1627986418&jid=1216534359&_u=SCCAAEADQAAAAC~&z=2091448820")
						,
					http("Freeweeekndstg_35")
						.post(uri02 + "/")
						.body(RawFileBody("computerdatabase/freeweeekndstg/0035_request.dat")),
					http("Freeweeekndstg_36")
						.get("/h?a=3992788168&u=4795614039423690&v=5139294933682533&s=4108571853206024&b=web&tv=4.0&sp=ts&sp=1627986415482&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fregister&pp=d&pp=subscription-staging.packtpub.com&pp=h&pp=%2Fregister&pp=t&pp=Register%20%7C%20Packt%20Subscription&pp=ts&pp=1627986538071&id0=1669214724963467&t0=change&n0=input&c0=form-control%20mb20%20ng-untouched%20ng-not-empty%20ng-dirty%20ng-valid-parse%20ng-valid%20ng-valid-required&i0=create-account-confirm-password&y0=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B%23create-account-form%3B.form-signin%3B.ng-dirty%3B.ng-valid%3B.ng-valid-parse%3B.ng-valid-required%3B%5Bname%3Dcreate-account-form%5D%3B%5Bng-submit%3DcreateAccountController.validateAndSubmitForm()%5D%3B%7C%40div%3B.form-group%3B.relative-parent%3B%7C%40input%3B%23create-account-confirm-password%3B.form-control%3B.mb20%3B.ng-dirty%3B.ng-not-empty%3B.ng-untouched%3B.ng-valid%3B.ng-valid-parse%3B.ng-valid-required%3B%5Bname%3Dconfirm-password%5D%3B%5Bng-blur%3DcreateAccountController.registerForm.confirmPassword.focus%20%3D%20false%5D%3B%5Bng-change%3DcreateAccountController.monitorConfirmRegisterPassword()%5D%3B%5Bng-focus%3DcreateAccountController.registerForm.confirmPassword.focus%20%3D%20true%5D%3B%5Bng-model%3DcreateAccountController.registerForm.confirmPassword.text%5D%3B%5Bplaceholder%3DConfirm%20Password%5D%3B%5Brequired%3D%5D%3B%5Btype%3Dpassword%5D%3B%7C&ts0=1627986577745&id1=3973998894035069&t1=click&n1=button&c1=btn%20btn-lg%20btn-primary%20btn-block&y1=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B%23create-account-form%3B.form-signin%3B.ng-dirty%3B.ng-valid%3B.ng-valid-parse%3B.ng-valid-required%3B%5Bname%3Dcreate-account-form%5D%3B%5Bng-submit%3DcreateAccountController.validateAndSubmitForm()%5D%3B%7C%40button%3B.btn%3B.btn-block%3B.btn-lg%3B.btn-primary%3B%5Bng-show%3D!createAccountController.loading%5D%3B%5Btype%3Dsubmit%5D%3B%7C&ts1=1627986577812&x1=Create%20Account&id2=4610631788447372&t2=submit&n2=form&c2=form-signin%20ng-dirty%20ng-valid-parse%20ng-valid%20ng-valid-required&i2=create-account-form&y2=%40div%3B.page%3B%7C%40div%3B.ng-scope%3B%5Bautoscroll%3Dtrue%5D%3B%5Bng-view%3D%5D%3B%7C%40div%3B.container%3B.ng-scope%3B%7C%40div%3B.row%3B%7C%40div%3B.col-sm-12%3B%7C%40div%3B.card%3B.card-container%3B.mt20%3B%7C%40form%3B%23create-account-form%3B.form-signin%3B.ng-dirty%3B.ng-valid%3B.ng-valid-parse%3B.ng-valid-required%3B%5Bname%3Dcreate-account-form%5D%3B%5Bng-submit%3DcreateAccountController.validateAndSubmitForm()%5D%3B%7C&ts2=1627986577828&x2=By%20signing%20up%2C%20you%20are%20confirming%20you%20would%20like%20to%20receive%20occa&st=1627986578257")
						,
					http("Freeweeekndstg_37")
						.options(uri08 + "/auth-v1/users")
						,
					http("Freeweeekndstg_38")
						.post(uri08 + "/auth-v1/users")
						.body(RawFileBody("computerdatabase/freeweeekndstg/0038_request.json")),
					http("Freeweeekndstg_39")
						.options(uri08 + "/users-v1/users/756ec5c7-13c0-4227-ad2b-6f56b85961c1")
					,
					http("Freeweeekndstg_40")
						.options(uri08 + "/marketing-v1/users/me/interests"),
					http("Freeweeekndstg_41")
						.put(uri08 + "/users-v1/users/756ec5c7-13c0-4227-ad2b-6f56b85961c1")

						.body(RawFileBody("computerdatabase/freeweeekndstg/0041_request.json")),
					http("Freeweeekndstg_42")
						.put(uri08 + "/marketing-v1/users/me/interests")
						.body(RawFileBody("computerdatabase/freeweeekndstg/0042_request.json")),
					http("Freeweeekndstg_43")
						.post(uri23 + "?sv=6")
						.body(RawFileBody("computerdatabase/freeweeekndstg/0043_request.txt")),
					http("Freeweeekndstg_44")
						.get(uri15)
						,
					http("Freeweeekndstg_45")
						.options(uri08 + "/b2b-accounts-v1/users/me/roles-and-subjects")
						,
					http("Freeweeekndstg_46")
						.options(uri08 + "/skills-v1/users/me/learning-paths")
						,
					http("Freeweeekndstg_47")
						.get(uri08 + "/b2b-accounts-v1/users/me/roles-and-subjects")
						,
					http("Freeweeekndstg_48")
						.get(uri08 + "/skills-v1/users/me/learning-paths")
						,
					http("Freeweeekndstg_49")
						.options(uri03 + "?active=false")
						,
					http("Freeweeekndstg_50")
						.get("/h?a=3992788168&u=4795614039423690&v=1292674133359351&s=4108571853206024&b=web&tv=4.0&z=2&h=%2F&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Learn%20more%20for%20less&ts=1627986587173&pr=%2Fregister&sp=ts&sp=1627986415482&sp=d&sp=subscription-staging.packtpub.com&sp=h&sp=%2Fregister&st=1627986587173")
						,
					http("Freeweeekndstg_51")
						.options(uri04 + "?limit=4&offset=0")
						,
					http("Freeweeekndstg_52")
						.get(uri03 + "?active=false")
						,
					http("Freeweeekndstg_53")
						.get(uri04 + "?limit=4&offset=0")
						,
					http("Freeweeekndstg_54")
						.get(uri18 + "/books-and-videos-content/books-and-videos.json")
						,
					http("Freeweeekndstg_55")
						.get(uri18 + "/products/9781788478120/summary")
						,
					http("Freeweeekndstg_56")
						.get(uri18 + "/products/9781838645359/summary")
						,
					http("Freeweeekndstg_57")
						.get(uri18 + "/countries/countries.json")
						,
					http("Freeweeekndstg_58")
						.get(uri18 + "/products/9781789343625/summary")
						,
					http("Freeweeekndstg_59")
						.get(uri18 + "/products/9781788295864/summary")
						,
					http("Freeweeekndstg_60")
						.get(uri18 + "/products/9781838559335/summary")
						,
					http("Freeweeekndstg_61")
						.get(uri18 + "/products/9781789348347/summary")
						,
					http("Freeweeekndstg_62")
						.get(uri18 + "/products/9781838823412/summary")
						,
					http("Freeweeekndstg_63")
						.options(uri08 + "/users-v1/users/me/metadata")
						,
					http("Freeweeekndstg_64")
						.get(uri18 + "/products/9781789955750/summary")
						,
					http("Freeweeekndstg_65")
						.get(uri18 + "/authors/100288")
						,
					http("Freeweeekndstg_66")
						.get(uri18 + "/authors/100102")
						,
					http("Freeweeekndstg_67")
						.get(uri18 + "/authors/100306")
						,
					http("Freeweeekndstg_68")
						.get(uri18 + "/authors/100287")
						,
					http("Freeweeekndstg_69")
						.get(uri18 + "/authors/100035")
						,
					http("Freeweeekndstg_70")
						.get(uri18 + "/authors/100036")
						,
					http("Freeweeekndstg_71")
						.get(uri08 + "/users-v1/users/me/metadata")
						,
					http("Freeweeekndstg_72")
						.get(uri18 + "/authors/100347")
						,
					http("Freeweeekndstg_73")
						.get(uri18 + "/authors/100339")
						,
					http("Freeweeekndstg_74")
						.get(uri18 + "/authors/100312")
						,
					http("Freeweeekndstg_75")
						.get(uri18 + "/authors/100074")
						,
					http("Freeweeekndstg_76")
						.get(uri18 + "/authors/100346")
						,
					http("Freeweeekndstg_77")
						.get(uri18 + "/authors/100340")
						,
					http("Freeweeekndstg_78")
						.options(uri08 + "/users-v1/users/me/products/metadata?isbns=[%229781789955750%22,%229781838645359%22,%229781789348347%22,%229781838823412%22]&detail=line")
						,
					http("Freeweeekndstg_79")
						.get(uri10 + "/")
						,
					http("Freeweeekndstg_80")
						.get(uri12 + "/9781838645359/cover/smaller")
						,
					http("Freeweeekndstg_81")
						.get(uri12 + "/9781838823412/cover/smaller")
						,
					http("Freeweeekndstg_82")
						.get(uri12 + "/9781789343625/cover/smaller")
						,
					http("Freeweeekndstg_83")
						.get(uri12 + "/9781789348347/cover/smaller")
						,
					http("Freeweeekndstg_84")
						.get(uri12 + "/9781788478120/cover/smaller")
						,
					http("Freeweeekndstg_85")
						.get(uri12 + "/9781789955750/cover/smaller")
						,
					http("Freeweeekndstg_86")
						.get(uri12 + "/9781788295864/cover/smaller")
						,
					http("Freeweeekndstg_87")
						.post(uri10 + "/cdn-cgi/rum?req_id=678edc0f3f0a5d31")

						.body(RawFileBody("computerdatabase/freeweeekndstg/0087_request.json")),
					http("Freeweeekndstg_88")
						.get(uri10 + "/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
						,
					http("Freeweeekndstg_89")
						.get(uri10 + "/css/app.css?id=e413a60afd9a572e6baf")
						,
					http("Freeweeekndstg_90")
						.get(uri22 + "/css?family=Montserrat")
						,
					http("Freeweeekndstg_91")
						.get(uri22 + "/css2?family=Roboto+Mono:wght@500&display=swap")
						,
					http("Freeweeekndstg_92")
						.get(uri22 + "/css?family=Nunito")
						,
					http("Freeweeekndstg_93")
						.get(uri12 + "/9781838559335/cover/smaller")
						,
					http("Freeweeekndstg_94")
						.get(uri10 + "/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
						,
					http("Freeweeekndstg_95")
						.get(uri10 + "/js/react.js?id=c8ec161a8ffb2188e83c")
						,
					http("Freeweeekndstg_96")
						.get(uri09 + "?sv=7")
						,
					http("Freeweeekndstg_97")
						.get(uri20)
						,
					http("Freeweeekndstg_98")
						.post(uri10 + "/cdn-cgi/rum?req_id=678edd5a9c1f5d31")

						.body(RawFileBody("computerdatabase/freeweeekndstg/0098_request.json")),
					http("Freeweeekndstg_99")
						.get("/api/identify_v3?a=34805961&u=790573365085239&v=3858484544307832&s=2414887406201577&i=756ec5c7-13c0-4227-ad2b-6f56b85961c1&b=web&tv=4.0&z=0&st=1627986596278")
						,
					http("Freeweeekndstg_100")
						.get(uri10 + "/api/users/me/subscriptions")
						,
					http("Freeweeekndstg_101")
						.options(uri16 + "/customer/?user_email=undefined&custom_styles=%7B%7D")
						,
					http("Freeweeekndstg_102")
						.get(uri01 + "/gtm/js?id=GTM-MSRQZ29&t=gtm53&cid=1346660471.1627986418")
						,
					http("Freeweeekndstg_103")
						.get(uri16 + "/customer/?user_email=undefined&custom_styles=%7B%7D")
						,
					http("Freeweeekndstg_104")
						.get("/h?a=34805961&u=790573365085239&v=3858484544307832&s=2414887406201577&b=web&tv=4.0&z=0&h=%2F&d=subscription-staging.packtpub.com&t=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&r=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&ts=1627986596277&pr=%2F&st=1627986597453")
						,
					http("Freeweeekndstg_105")
						.options(uri16 + "/error/")
						,
					http("Freeweeekndstg_106")
						.get(uri01 + "/collect?v=1&_v=j92&a=926068628&t=pageview&_s=1&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&dp=%2F&ul=en-us&de=UTF-8&dt=Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech&sd=24-bit&sr=1280x1024&vp=1280x899&je=0&_u=SCCAAEADQ~&jid=&gjid=&cid=1346660471.1627986418&tid=UA-284627-1&_gid=565459150.1627986418&gtm=2wg820WJMM825&cd1=756ec5c7-13c0-4227-ad2b-6f56b85961c1&cd3=1627986597440.vol04dnu&cd4=2021-08-03T15%3A59%3A57.440%2B05%3A30&cd12=Logged%20In&cd2=1346660471.1627986418&z=684071016")
						,
					http("Freeweeekndstg_107")
						.post(uri16 + "/error/")

						.formParam("error", """e@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:21586
error@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:16:22299
s@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:19732
t.ajax/E.onreadystatechange@https://dna8twue3dlxq.cloudfront.net/js/profitwell.js:1:23493
""")
						.formParam("user_email", "undefined"),
					http("Freeweeekndstg_108")
						.get(uri02 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1627986597283&sw=1280&sh=1024&v=2.9.44&r=stable&ec=0&o=30&fbp=fb.1.1627986418780.419222997&it=1627986597008&coo=false&rqm=GET")
						,
					http("Freeweeekndstg_109")
						.get(uri02 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&rl=https%3A%2F%2Fsubscription-staging.packtpub.com%2F&if=false&ts=1627986597789&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22meta%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%7D&cd[OpenGraph]=%7B%22og%3Atitle%22%3A%22Packt%20Subscription%20%7C%20Advance%20your%20knowledge%20in%20tech%22%2C%22og%3Adescription%22%3A%22Access%20over%207%2C500%20Programming%20%26%20Development%20eBooks%20and%20videos%20to%20advance%20your%20IT%20skills.%20Enjoy%20unlimited%20access%20to%20over%20100%20new%20titles%20every%20month%20on%20the%20latest%20technologies%20and%20trends%22%2C%22og%3Aurl%22%3A%22%7Bprocess.env.MIX_SUBSCRIPTIONS_URL%7D%22%2C%22og%3Aimage%22%3A%22https%3A%2F%2Fstatic-staging.packt-cdn.com%2Fassets%2Fimages%2Fpackt-plus-meta-img.png%22%2C%22og%3Aimage%3Asecure_url%22%3A%22https%3A%2F%2Fstatic-staging.packt-cdn.com%2Fassets%2Fimages%2Fpackt-plus-meta-img.png%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.44&r=stable&ec=1&o=30&fbp=fb.1.1627986418780.419222997&it=1627986597008&coo=false&es=automatic&tm=3&rqm=GET")
						,
					http("Freeweeekndstg_110")
						.get(uri10 + "/api/subscription/home")
						,
					http("Freeweeekndstg_111")
						.get(uri18 + "/products/9781838827366/cover/smaller")
						,
					http("Freeweeekndstg_112")
						.get(uri18 + "/products/9781788470711/cover/smaller")
						,
					http("Freeweeekndstg_113")
						.get(uri18 + "/products/9781800208988/cover/smaller")
						,
					http("Freeweeekndstg_114")
						.get(uri10 + "/images/book.svg")
						,
					http("Freeweeekndstg_115")
						.get(uri18 + "/products/9781788295864/cover/smaller")
						,
					http("Freeweeekndstg_116")
						.get(uri18 + "/products/9781839218859/cover/smaller")
						,
					http("Freeweeekndstg_117")
						.get(uri10 + "/images/video.svg")
						,
					http("Freeweeekndstg_118")
						.get(uri10 + "/images/learning-path.svg")
						,
					http("Freeweeekndstg_119")
						.get(uri10 + "/images/home.svg")
						,
					http("Freeweeekndstg_120")
						.get(uri18 + "/products/9781839213403/cover/smaller")
						,
					http("Freeweeekndstg_121")
						.get(uri18 + "/products/9781789536058/cover/smaller")
						,
					http("Freeweeekndstg_122")
						.get(uri18 + "/products/9781838981006/cover/smaller")
						,
					http("Freeweeekndstg_123")
						.get(uri18 + "/products/9781789615852/cover/smaller")
						,
					http("Freeweeekndstg_124")
						.get(uri10 + "/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
						,
					http("Freeweeekndstg_125")
						.get(uri18 + "/products/9781838981952/cover/smaller")
			,
					http("Freeweeekndstg_126")
						.get(uri10 + "/images/credits.svg")
						,
					http("Freeweeekndstg_127")
						.get(uri18 + "/products/9781788835886/cover/smaller")
						,
					http("Freeweeekndstg_128")
						.get(uri18 + "/products/9781838552657/cover/smaller")
						,
					http("Freeweeekndstg_129")
						.get(uri10 + "/images/playlist.svg")
						,
					http("Freeweeekndstg_130")
						.get(uri10 + "/images/list-grey.svg")
						,
					http("Freeweeekndstg_131")
						.get(uri18 + "/products/9781789536669/cover/smaller")
						,
					http("Freeweeekndstg_132")
						.get(uri18 + "/products/9781788297233/cover/smaller")
						,
					http("Freeweeekndstg_133")
						.get(uri18 + "/products/9781838989927/cover/smaller")
						,
					http("Freeweeekndstg_134")
						.get(uri18 + "/products/9781800568105/cover/smaller")
						,
					http("Freeweeekndstg_135")
						.get(uri18 + "/products/9781789137798/cover/smaller")
						,
					http("Freeweeekndstg_136")
						.get(uri18 + "/products/9781839213984/cover/smaller")
						,
					http("Freeweeekndstg_137")
						.get(uri18 + "/products/9781838647773/cover/smaller")
						,
					http("Freeweeekndstg_138")
						.get(uri18 + "/products/9781839212505/cover/smaller")
						,
					http("Freeweeekndstg_139")
						.get(uri18 + "/products/9781789347067/cover/smaller")
						,
					http("Freeweeekndstg_140")
						.get(uri10 + "/images/bookmark.svg")
						,
					http("Freeweeekndstg_141")
						.get(uri10 + "/api/users/me/products/recent/subscription-bundle")
						,
					http("Freeweeekndstg_142")
						.get(uri10 + "/images/purchases.svg")
						,
					http("Freeweeekndstg_143")
						.get(uri10 + "/images/note.svg")
						))
	}
	val scn = scenario("Freeweeekndstg").exec(FreeWeekendRegister.register)
	setUp(scn.inject(nothingFor(5),
		atOnceUsers(users =1),
		rampUsers(users = 5)during(10),
		constantUsersPerSec(rate = 15) during(20)
	))
		.protocols(httpProtocol)
}