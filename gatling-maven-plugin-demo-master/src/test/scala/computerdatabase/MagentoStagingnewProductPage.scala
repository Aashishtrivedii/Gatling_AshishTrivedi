package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class MagentoStagingnewProductPage extends Simulation {

	val duration = Duration(2, MINUTES)

	val httpProtocol = http
		.baseUrl("https://staging-mg.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")



    val uri01 = "https://api.feefo.com/api"
    val uri02 = "https://www.google-analytics.com/j/collect"
    val uri03 = "https://www.facebook.com/tr"
    val uri04 = "https://powr-counter.herokuapp.com/26868356"
    val uri05 = "https://www.powr.io"
    val uri06 = "https://ww2.feefo.com/api/ecommerce/plugin/widget/merchant/packt-publishing"
    val uri07 = "https://sslwidget.criteo.com/event"
    val uri08 = "https://www.googletagmanager.com/gtm.js"
    val uri09 = "https://t.co/i/adsct"
    val uri10 = "https://firefox.settings.services.mozilla.com/v1"
    val uri11 = "https://services-staging.packtpub.com/auth-v1/users/tokens"
    val uri12 = "https://content-signature-2.cdn.mozilla.net/chains/normandy.content-signature.mozilla.org-2021-05-22-15-04-09.chain"
    val uri13 = "https://heapanalytics.com"
    val uri14 = "https://bam-cell.nr-data.net"
    val uri15 = "https://vivzzxfqg1-3.algolianet.com/1/indexes/*/queries"
    val uri16 = "https://service.maxymiser.net/cg/v5"
    val uri17 = "https://analytics.twitter.com/i/adsct"
    val uri18 = "https://normandy.cdn.mozilla.net/api/v1"
    val uri19 = "https://stats.g.doubleclick.net/j/collect"
    val uri20 = "https://classify-client.services.mozilla.com/api/v1/classify_client"
    val uri21 = "https://polyfill.io/v3/polyfill.min.js"
    val uri22 = "https://getpocket.cdn.mozilla.net/v3/firefox/global-recs"
    val uri23 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/945348752"
    val uri25 = "https://www.google.com"
    val uri26 = "https://static-staging.packt-cdn.com/products/9781789955750/cover/smaller"
    val uri27 = "https://www.google.co.in"
    val uri28 = "https://static.hotjar.com/c/hotjar-1068932.js"
    val uri29 = "https://account-qa.packtpub.com/login"
    val uri30 = "https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/fonts/fontawesome-webfont.woff2"
    val uri31 = "https://bam.nr-data.net"
    val uri32 = "https://fonts.googleapis.com"
    val uri33 = "https://in.hotjar.com/api/v2/client/sites/1068932/visit-data"



		object Guest{
			val guest=exec(http("MagentoStagingNewProductPage_GuestArrival")
				.get(uri25 + "/complete/search?client=firefox&q=sta"))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_1")
					.get(uri25 + "/complete/search?client=firefox&q=stagi")
					.resources(http("MagentoStagingnewProductPage_2")
						.get(uri25 + "/complete/search?client=firefox&q=stagin")))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_3")
					.get(uri25 + "/complete/search?client=firefox&q=stagi"))
				.pause(3)
				.exec(http("MagentoStagingnewProductPage_4")
					.get("/")
					.resources(http("MagentoStagingnewProductPage_5")
						.get(uri16 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
						http("MagentoStagingnewProductPage_6")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
						, http("MagentoStagingnewProductPage_7")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
						http("MagentoStagingnewProductPage_8")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
						,
						http("MagentoStagingnewProductPage_9")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
						,
						http("MagentoStagingnewProductPage_10")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
						,
						http("MagentoStagingnewProductPage_11")
							.get(uri13 + "/h?a=3992788168&u=558546027102160&v=3838242913033589&s=5761475538996607&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=staging-mg.packtpub.com&t=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&ts=1619065668311&sp=ts&sp=1619065491809&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619065668313")
						,
						http("MagentoStagingnewProductPage_12")
							.get("/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2F&sections=&_=1619065666422")
						,
						http("MagentoStagingnewProductPage_13")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
						,
						http("MagentoStagingnewProductPage_14")
							.get("/packtgeoip/ajax/storebanner?sourceURL=/&_=1619065666424")
						,
						http("MagentoStagingnewProductPage_15")
							.post("/signon/ajax/signon/?signout=true")
							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0015_request.json")),
						http("MagentoStagingnewProductPage_16")
							.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619065666427")
						,
						http("MagentoStagingnewProductPage_17")
							.get("/")
						,
						http("MagentoStagingnewProductPage_18")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
						http("MagentoStagingnewProductPage_19")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
						,
						http("MagentoStagingnewProductPage_20")
							.get(uri05 + "/powr.js?platform=html")
						,
						http("MagentoStagingnewProductPage_21")
							.get(uri16 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04")
						,
						http("MagentoStagingnewProductPage_22")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
						,
						http("MagentoStagingnewProductPage_23")
							.get(uri06)
						,
						http("MagentoStagingnewProductPage_24")
							.get(uri21 + "?features=default%2CArray.prototype.includes%2CPromise")
						,
						http("MagentoStagingnewProductPage_25")
							.get(uri08 + "?id=GTM-KHLZ7JF")
						,
						http("MagentoStagingnewProductPage_26")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
						,
						http("MagentoStagingnewProductPage_27")
							.get(uri13 + "/h?a=3992788168&u=558546027102160&v=7073789216997714&s=5761475538996607&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=staging-mg.packtpub.com&t=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&ts=1619065673637&sp=ts&sp=1619065491809&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619065673637")
						,
						http("MagentoStagingnewProductPage_28")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
						,
						http("MagentoStagingnewProductPage_29")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
						,
						http("MagentoStagingnewProductPage_30")
							.get(uri01 + "/merchants/widgetintegration/all?merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_31")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
						,
						http("MagentoStagingnewProductPage_32")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
						,
						http("MagentoStagingnewProductPage_33")
							.get(uri01 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_34")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
						,
						http("MagentoStagingnewProductPage_35")
							.get("/customer/section/load/?sections=cart%2Cmessages&force_new_section_timestamp=false&_=1619065672522")
						,
						http("MagentoStagingnewProductPage_36")
							.get("/packtgtm/ajax/customer/?_=1619065672523")
						,
						http("MagentoStagingnewProductPage_37")
							.get("/packtgeoip/ajax/storebanner?sourceURL=/&_=1619065672524")
						,
						http("MagentoStagingnewProductPage_38")
							.post("/signon/ajax/signon/?signout=true")
							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0038_request.json")),
						http("MagentoStagingnewProductPage_39")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
						,
						http("MagentoStagingnewProductPage_40")
							.get(uri01 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_41")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
						,
						http("MagentoStagingnewProductPage_42")
							.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619065672525")
						,
						http("MagentoStagingnewProductPage_43")
							.get(uri01 + "/10/reviews/summary/service?since_period=YEAR&unanswered_feedback=include&source=floating_service_widget&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_44")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
						,
						http("MagentoStagingnewProductPage_45")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
						,
						http("MagentoStagingnewProductPage_46")
							.get(uri01 + "/10/reviews/service?page=1&page_size=10&since_period=YEAR&full_thread=include&unanswered_feedback=include&source=floating_service_widget&sort=-updated_date&feefo_parameters=include&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_47")
							.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619065672526")
					))
				.pause(3)
				.exec(http("MagentoStagingnewProductPage_48")
					.get(uri07 + "?a=42254&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvh&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=68471"))
				.pause(8)
				.exec(http("MagentoStagingnewProductPage_49")
					.get(uri22 + "?version=3&consumer_key=40249-e88c401e1b1f2242d9e441c4&locale_lang=en-US&region=IN&count=30")
					.resources(http("MagentoStagingnewProductPage_50")
						.get("/")
						,
						http("MagentoStagingnewProductPage_51")
							.get(uri10 + "/"),
						http("MagentoStagingnewProductPage_52")
							.get(uri05 + "/powr.js?platform=html")
						,
						http("MagentoStagingnewProductPage_53")
							.get(uri06)
						,
						http("MagentoStagingnewProductPage_54")
							.get(uri21 + "?features=default%2CArray.prototype.includes%2CPromise")
						,
						http("MagentoStagingnewProductPage_55")
							.get(uri32 + "/css?family=Montserrat:300,400,600,700")
						,
						http("MagentoStagingnewProductPage_56")
							.get(uri16 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s")
						,
						http("MagentoStagingnewProductPage_57")
							.get(uri08 + "?id=GTM-KHLZ7JF")
						,
						http("MagentoStagingnewProductPage_58")
							.get(uri01 + "/merchants/widgetintegration/all?merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_59")
							.get(uri01 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
					))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_60")
					.get("/static/version1611329178/frontend/Packt/default/en_GB/js-translation.json")
					.resources(http("MagentoStagingnewProductPage_61")
						.get(uri01 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_62")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
						http("MagentoStagingnewProductPage_63")
							.get(uri01 + "/10/reviews/summary/service?since_period=YEAR&unanswered_feedback=include&source=floating_service_widget&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_64")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
						,
						http("MagentoStagingnewProductPage_65")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
						,
						http("MagentoStagingnewProductPage_66")
							.get(uri13 + "/h?a=3992788168&u=8174681160524317&v=597992095700647&s=1746749192498185&b=web&tv=4.0&z=0&h=%2F&d=staging-mg.packtpub.com&t=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&ts=1619065695000&st=1619065695002")
						,
						http("MagentoStagingnewProductPage_67")
							.get(uri01 + "/10/reviews/service?page=1&page_size=10&since_period=YEAR&full_thread=include&unanswered_feedback=include&source=floating_service_widget&sort=-updated_date&feefo_parameters=include&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
					))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_68")
					.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
					.resources(http("MagentoStagingnewProductPage_69")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Ves/fonts/fontawesome-webfont.woff2?v=4.7.0")
					))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_70")
					.get(uri05 + "/countdown-timer/u/06df9302_1606751575")
					.resources(http("MagentoStagingnewProductPage_71")
						.get(uri05 + "/countdown-timer/u/06df9302_1606751575")
						,
						http("MagentoStagingnewProductPage_72")
							.get(uri05 + "/cached/26868356.json")
						,
						http("MagentoStagingnewProductPage_73")
							.get(uri14 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=31775&ck=1&ref=https://staging-mg.packtpub.com/&ap=1356&be=3117&fe=31721&dc=4002&perf=%7B%22timing%22:%7B%22of%22:1619065669331,%22n%22:0,%22f%22:0,%22dn%22:6,%22dne%22:7,%22c%22:7,%22s%22:7,%22ce%22:7,%22rq%22:7,%22rp%22:179,%22rpe%22:3072,%22dl%22:3078,%22di%22:3976,%22ds%22:4002,%22de%22:4049,%22dc%22:31720,%22l%22:31720,%22le%22:31748%7D,%22navigation%22:%7B%22ty%22:1%7D%7D&fcp=3963&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
							.check(status.is(500)),
						http("MagentoStagingnewProductPage_74")
							.get(uri29)
						,
						http("MagentoStagingnewProductPage_75")
							.get(uri32 + "/css?family=Montserrat:400,600")
						,
						http("MagentoStagingnewProductPage_76")
							.get(uri31 + "/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=1638&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575&be=260&fe=892&dc=328&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1619065701086,%22n%22:0,%22f%22:0,%22dn%22:0,%22dne%22:0,%22c%22:0,%22s%22:0,%22ce%22:0,%22rq%22:4,%22rp%22:152,%22rpe%22:153,%22dl%22:156,%22di%22:308,%22ds%22:310,%22de%22:328,%22dc%22:891,%22l%22:891,%22le%22:898%7D,%22navigation%22:%7B%7D%7D&fcp=1122&jsonp=NREUM.setToken"),
						http("MagentoStagingnewProductPage_77")
							.get(uri32 + "/icon?family=Material+Icons")
						,
						http("MagentoStagingnewProductPage_78")
							.get(uri08 + "?id=GTM-PVND9ML")
						,
						http("MagentoStagingnewProductPage_79")
							.options(uri04)
						,
						http("MagentoStagingnewProductPage_80")
							.get(uri16 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Faccount-qa.packtpub.com%252Flogin%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s")
						,
						http("MagentoStagingnewProductPage_81")
							.post(uri04)
							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0081_request.json")),
						http("MagentoStagingnewProductPage_82")
							.get(uri30 + "?v=4.7.0")
					))
				.pause(6)
				.exec(http("MagentoStagingnewProductPage_83")
					.post(uri31 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=11648&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")

					.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0083_request.txt")
					))

		     }

		object SignInMagentostaging{
			val signinmagentostaging= exec(http("MagentoStagingnewProductPage_SignIn")
				.get("/customer/account/login/referer/aHR0cHM6Ly9zdGFnaW5nLW1nLnBhY2t0cHViLmNvbS8%2C/")

				.resources(http("MagentoStagingnewProductPage_85")
					.post(uri31 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=27191&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")

					.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0085_request.txt")),
					http("MagentoStagingnewProductPage_86")
						.post(uri14 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=58932&ck=1&ref=https://staging-mg.packtpub.com/")

						.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0086_request.txt")),
					http("MagentoStagingnewProductPage_87")
						.get(uri16 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Faccount-qa.packtpub.com%252F%253FreturnUrl%253Dreferrer%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("MagentoStagingnewProductPage_88")
						.get(uri23 + "/?random=1619065729823&cv=9&fst=1619065729823&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&ig=0&frm=0&url=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer&ref=https%3A%2F%2Fstaging-mg.packtpub.com%2F&tiba=Login%20%7C%20My%20Account%20%7C%20Packt&hn=www.google.com&async=1&rfmt=3&fmt=4"),
					http("MagentoStagingnewProductPage_89")
						.get(uri03 + "/?id=445429252334850&ev=PageView&dl=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer&rl=https%3A%2F%2Fstaging-mg.packtpub.com%2F&if=false&ts=1619065730059&sw=1280&sh=1024&v=2.9.39&r=stable&ec=0&o=30&fbp=fb.1.1617965825884.1082240722&it=1619065730012&coo=false&rqm=GET")
					,
					http("MagentoStagingnewProductPage_90")
						.get(uri28 + "?sv=7"),
					http("MagentoStagingnewProductPage_91")
						.get(uri25 + "/pagead/1p-user-list/945348752/?random=1619065729823&cv=9&fst=1619064000000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer&ref=https%3A%2F%2Fstaging-mg.packtpub.com%2F&tiba=Login%20%7C%20My%20Account%20%7C%20Packt&async=1&fmt=3&is_vtc=1&random=1275631358&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
					,
					http("MagentoStagingnewProductPage_92")
						.get(uri27 + "/pagead/1p-user-list/945348752/?random=1619065729823&cv=9&fst=1619064000000&num=1&guid=ON&eid=2505059650&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=0&u_nmime=0&gtm=2wg472&sendb=1&frm=0&url=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer&ref=https%3A%2F%2Fstaging-mg.packtpub.com%2F&tiba=Login%20%7C%20My%20Account%20%7C%20Packt&async=1&fmt=3&is_vtc=1&random=1275631358&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
					,
					http("MagentoStagingnewProductPage_93")
						.get(uri13 + "/h?a=34805961&u=287607950759695&v=5279346035084698&s=1733674164878988&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Flogin&q=%3FreturnUrl%3Dreferrer&d=account-qa.packtpub.com&t=Login%20%7C%20My%20Account%20%7C%20Packt&r=https%3A%2F%2Fstaging-mg.packtpub.com%2F&ts=1619065730139&sp=r&sp=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2F&sp=ts&sp=1619065613630&sp=d&sp=account-qa.packtpub.com&sp=h&sp=%2Faccount%2Fdetails&st=1619065730140")
					,
					http("MagentoStagingnewProductPage_94")
						.post(uri02 + "?v=1&_v=j90&a=811382068&t=pageview&_s=1&dl=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer&dr=https%3A%2F%2Fstaging-mg.packtpub.com%2F&ul=en-us&de=UTF-8&dt=Login%20%7C%20My%20Account%20%7C%20Packt&sd=24-bit&sr=1280x1024&vp=1280x910&je=0&_u=SCCAAEADQAAAAC~&jid=459071810&gjid=2056782928&cid=1010921333.1617965825&tid=UA-284627-1&_gid=864833365.1619065612&_r=1&gtm=2wg472PVND9ML&z=411220935")
					,
					http("MagentoStagingnewProductPage_95")
						.get(uri09 + "?type=javascript&version=1.1.0&p_id=Twitter&p_user_id=0&txn_id=nvlld&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&tw_document_href=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer")
					,
					http("MagentoStagingnewProductPage_96")
						.post(uri19 + "?t=dc&aip=1&_r=3&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=459071810&gjid=2056782928&_gid=864833365.1619065612&_u=SCCAAEACQAAAAC~&z=1039926102")
					,
					http("MagentoStagingnewProductPage_97")
						.get(uri25 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=459071810&_u=SCCAAEACQAAAAC~&z=476515011")
					,
					http("MagentoStagingnewProductPage_98")
						.get(uri27 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=459071810&_u=SCCAAEACQAAAAC~&z=476515011")
					,
					http("MagentoStagingnewProductPage_99")
						.get(uri17 + "?type=javascript&version=1.1.0&p_id=Twitter&p_user_id=0&txn_id=nvlld&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&tw_iframe_status=0&tpx_cb=twttr.conversion.loadPixels&tw_document_href=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer"),
					http("MagentoStagingnewProductPage_100")
						.get(uri03 + "/?id=445429252334850&ev=Microdata&dl=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer&rl=https%3A%2F%2Fstaging-mg.packtpub.com%2F&if=false&ts=1619065731605&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22Login%20%7C%20My%20Account%20%7C%20Packt%22%2C%22meta%3Adescription%22%3A%22Log%20in%20to%20your%20Packt%20account%2C%20where%20you%20can%20update%20your%20address%2C%20review%20your%20purchases%2C%20update%20your%20subscription%20and%20change%20your%20email%20preferences%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1280&sh=1024&v=2.9.39&r=stable&ec=1&o=30&fbp=fb.1.1617965825884.1082240722&it=1619065730012&coo=false&es=automatic&tm=3&rqm=GET")
					,
					http("MagentoStagingnewProductPage_101")
						.post(uri33 + "?sv=7")

						.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0101_request.txt"))))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_102")
					.get(uri13 + "/h?a=34805961&u=287607950759695&v=5279346035084698&s=1733674164878988&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2F&sp=ts&sp=1619065613630&sp=d&sp=account-qa.packtpub.com&sp=h&sp=%2Faccount%2Fdetails&pp=d&pp=account-qa.packtpub.com&pp=q&pp=%3FreturnUrl%3Dreferrer&pp=h&pp=%2Flogin&pp=t&pp=Login%20%7C%20My%20Account%20%7C%20Packt&pp=ts&pp=1619065730139&id0=3907057972249474&t0=click&n0=input&c0=form-control%20ng-untouched%20ng-pristine%20ng-invalid&y0=%40app-root%3B%5Bng-version%3D5.2.11%5D%3B%7C%40div%3B.page-wrapper%3B%7C%40ng-component%3B%7C%40div%3B.full-page%3B.full-page--centered%3B%7C%40div%3B.full-page__child%3B%7C%40ng-component%3B%5B_nghost-c0%3D%5D%3B%7C%40div%3B.form-card%3B%5B_ngcontent-c0%3D%5D%3B%7C%40form%3B.ng-invalid%3B.ng-pristine%3B.ng-untouched%3B%5B_ngcontent-c0%3D%5D%3B%5Bng-reflect-form%3Dobject%20Object%5D%3B%5Bnovalidate%3D%5D%3B%7C%40div%3B.form-group%3B%5B_ngcontent-c0%3D%5D%3B%7C%40input%3B.form-control%3B.ng-invalid%3B.ng-pristine%3B.ng-untouched%3B%5B_ngcontent-c0%3D%5D%3B%5Bformcontrolname%3Dusername%5D%3B%5Bname%3Demail%5D%3B%5Bng-reflect-klass%3Dform-control%5D%3B%5Bng-reflect-name%3Dusername%5D%3B%5Bng-reflect-ng-class%3Dobject%20Object%5D%3B%5Bplaceholder%3DEmail%20address%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619065732578&id1=6480836876831270&t1=change&n1=input&c1=form-control%20ng-untouched%20is-valid%20ng-dirty%20ng-valid&y1=%40app-root%3B%5Bng-version%3D5.2.11%5D%3B%7C%40div%3B.page-wrapper%3B%7C%40ng-component%3B%7C%40div%3B.full-page%3B.full-page--centered%3B%7C%40div%3B.full-page__child%3B%7C%40ng-component%3B%5B_nghost-c0%3D%5D%3B%7C%40div%3B.form-card%3B%5B_ngcontent-c0%3D%5D%3B%7C%40form%3B.ng-dirty%3B.ng-untouched%3B.ng-valid%3B%5B_ngcontent-c0%3D%5D%3B%5Bng-reflect-form%3Dobject%20Object%5D%3B%5Bnovalidate%3D%5D%3B%7C%40div%3B.form-group%3B%5B_ngcontent-c0%3D%5D%3B%7C%40input%3B.form-control%3B.is-valid%3B.ng-dirty%3B.ng-untouched%3B.ng-valid%3B%5B_ngcontent-c0%3D%5D%3B%5Bformcontrolname%3Dpassword%5D%3B%5Bname%3Dpassword%5D%3B%5Bng-reflect-klass%3Dform-control%5D%3B%5Bng-reflect-name%3Dpassword%5D%3B%5Bng-reflect-ng-class%3Dobject%20Object%5D%3B%5Bplaceholder%3DPassword%5D%3B%5Btype%3Dpassword%5D%3B%7C&ts1=1619065733782&st=1619065734172")
				)
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_103")
					.post(uri03 + "/")
					.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0103_request.dat"))
					.resources(http("MagentoStagingnewProductPage_104")
						.get(uri13 + "/h?a=34805961&u=287607950759695&v=5279346035084698&s=1733674164878988&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2F&sp=ts&sp=1619065613630&sp=d&sp=account-qa.packtpub.com&sp=h&sp=%2Faccount%2Fdetails&pp=d&pp=account-qa.packtpub.com&pp=q&pp=%3FreturnUrl%3Dreferrer&pp=h&pp=%2Flogin&pp=t&pp=Login%20%7C%20My%20Account%20%7C%20Packt&pp=ts&pp=1619065730139&id0=1557874828592984&t0=change&n0=input&c0=form-control%20ng-untouched%20is-valid%20ng-dirty%20ng-valid&y0=%40app-root%3B%5Bng-version%3D5.2.11%5D%3B%7C%40div%3B.page-wrapper%3B%7C%40ng-component%3B%7C%40div%3B.full-page%3B.full-page--centered%3B%7C%40div%3B.full-page__child%3B%7C%40ng-component%3B%5B_nghost-c0%3D%5D%3B%7C%40div%3B.form-card%3B%5B_ngcontent-c0%3D%5D%3B%7C%40form%3B.ng-dirty%3B.ng-untouched%3B.ng-valid%3B%5B_ngcontent-c0%3D%5D%3B%5Bng-reflect-form%3Dobject%20Object%5D%3B%5Bnovalidate%3D%5D%3B%7C%40div%3B.form-group%3B%5B_ngcontent-c0%3D%5D%3B%7C%40input%3B.form-control%3B.is-valid%3B.ng-dirty%3B.ng-untouched%3B.ng-valid%3B%5B_ngcontent-c0%3D%5D%3B%5Bformcontrolname%3Dusername%5D%3B%5Bname%3Demail%5D%3B%5Bng-reflect-klass%3Dform-control%5D%3B%5Bng-reflect-name%3Dusername%5D%3B%5Bng-reflect-ng-class%3Dobject%20Object%5D%3B%5Bplaceholder%3DEmail%20address%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619065735218&id1=6525361970764430&t1=click&n1=button&c1=btn%20btn-primary%20btn-block%20mb-3&y1=%40app-root%3B%5Bng-version%3D5.2.11%5D%3B%7C%40div%3B.page-wrapper%3B%7C%40ng-component%3B%7C%40div%3B.full-page%3B.full-page--centered%3B%7C%40div%3B.full-page__child%3B%7C%40ng-component%3B%5B_nghost-c0%3D%5D%3B%7C%40div%3B.form-card%3B%5B_ngcontent-c0%3D%5D%3B%7C%40form%3B.ng-dirty%3B.ng-touched%3B.ng-valid%3B%5B_ngcontent-c0%3D%5D%3B%5Bng-reflect-form%3Dobject%20Object%5D%3B%5Bnovalidate%3D%5D%3B%7C%40button%3B.btn%3B.btn-block%3B.btn-primary%3B.mb-3%3B%5B_ngcontent-c0%3D%5D%3B%5Btype%3Dsubmit%5D%3B%7C&ts1=1619065735386&x1=Log%20in&id2=5026133736448182&t2=submit&n2=form&c2=ng-dirty%20ng-valid%20ng-touched&y2=%40app-root%3B%5Bng-version%3D5.2.11%5D%3B%7C%40div%3B.page-wrapper%3B%7C%40ng-component%3B%7C%40div%3B.full-page%3B.full-page--centered%3B%7C%40div%3B.full-page__child%3B%7C%40ng-component%3B%5B_nghost-c0%3D%5D%3B%7C%40div%3B.form-card%3B%5B_ngcontent-c0%3D%5D%3B%7C%40form%3B.ng-dirty%3B.ng-touched%3B.ng-valid%3B%5B_ngcontent-c0%3D%5D%3B%5Bng-reflect-form%3Dobject%20Object%5D%3B%5Bnovalidate%3D%5D%3B%7C&ts2=1619065735397&x2=Log%20in&st=1619065736188")
						,
						http("MagentoStagingnewProductPage_105")
							.options(uri11)
						,
						http("MagentoStagingnewProductPage_106")
							.post(uri11)
							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0106_request.json")),
						http("MagentoStagingnewProductPage_107")
							.get("/")
						,
						http("MagentoStagingnewProductPage_108")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
						,
						http("MagentoStagingnewProductPage_109")
							.get(uri16 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Faccount-qa.packtpub.com%252Flogin%253FreturnUrl%253Dreferrer%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
						http("MagentoStagingnewProductPage_110")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
						http("MagentoStagingnewProductPage_111")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
						,
						http("MagentoStagingnewProductPage_112")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
						,
						http("MagentoStagingnewProductPage_113")
							.get(uri13 + "/h?a=3992788168&u=558546027102160&v=1583314946506370&s=5761475538996607&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=staging-mg.packtpub.com&t=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&r=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer&ts=1619065742752&sp=ts&sp=1619065491809&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619065742753")
						,
						http("MagentoStagingnewProductPage_114")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
						,
						http("MagentoStagingnewProductPage_115")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
						,
						http("MagentoStagingnewProductPage_116")
							.get("/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2F&sections=&_=1619065741558")
						,
						http("MagentoStagingnewProductPage_117")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
						,
						http("MagentoStagingnewProductPage_118")
							.get("/packtgeoip/ajax/storebanner?sourceURL=/&_=1619065741560")
						,
						http("MagentoStagingnewProductPage_119")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
						,
						http("MagentoStagingnewProductPage_120")
							.get("/packtgtm/ajax/customer/?_=1619065741559")
						,
						http("MagentoStagingnewProductPage_121")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
						,
						http("MagentoStagingnewProductPage_122")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
						,
						http("MagentoStagingnewProductPage_123")
							.post("/signon/ajax/signon/?email=jumpinjhapaak%40test.com")
							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0123_request.json")),
						http("MagentoStagingnewProductPage_124")
							.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619065741561")
						,
						http("MagentoStagingnewProductPage_125")
							.get("/")
						,
						http("MagentoStagingnewProductPage_126")
							.get(uri21 + "?features=default%2CArray.prototype.includes%2CPromise")
						,
						http("MagentoStagingnewProductPage_127")
							.get(uri05 + "/powr.js?platform=html")
						,
						http("MagentoStagingnewProductPage_128")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
						,
						http("MagentoStagingnewProductPage_129")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
						http("MagentoStagingnewProductPage_130")
							.get(uri06)
						,
						http("MagentoStagingnewProductPage_131")
							.get(uri16 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Faccount-qa.packtpub.com%252Flogin%253FreturnUrl%253Dreferrer%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04")
						,
						http("MagentoStagingnewProductPage_132")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
						,
						http("MagentoStagingnewProductPage_133")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/js-translation.json")
						,
						http("MagentoStagingnewProductPage_134")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
						,
						http("MagentoStagingnewProductPage_135")
							.get(uri13 + "/h?a=3992788168&u=558546027102160&v=4473626203808193&s=5761475538996607&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=staging-mg.packtpub.com&t=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&r=https%3A%2F%2Faccount-qa.packtpub.com%2Flogin%3FreturnUrl%3Dreferrer&ts=1619065748736&sp=ts&sp=1619065491809&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619065748737")
						,
						http("MagentoStagingnewProductPage_136")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
						,
						http("MagentoStagingnewProductPage_137")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
						,
						http("MagentoStagingnewProductPage_138")
							.get(uri01 + "/merchants/widgetintegration/all?merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_139")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
						,
						http("MagentoStagingnewProductPage_140")
							.get("/packtgeoip/ajax/storebanner?sourceURL=/&_=1619065747785")
						,
						http("MagentoStagingnewProductPage_141")
							.post("/signon/ajax/signon/?email=jumpinjhapaak%40test.com")
							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0141_request.json")),
						http("MagentoStagingnewProductPage_142")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
						,
						http("MagentoStagingnewProductPage_143")
							.get("/packtgtm/ajax/customer/?_=1619065747784")
						,
						http("MagentoStagingnewProductPage_144")
							.get(uri08 + "?id=GTM-KHLZ7JF")
						,
						http("MagentoStagingnewProductPage_145")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
						,
						http("MagentoStagingnewProductPage_146")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
						,
						http("MagentoStagingnewProductPage_147")
							.get(uri01 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_148")
							.get("/customer/section/load/?sections=cart%2Cmessages&force_new_section_timestamp=false&_=1619065747783")
						,
						http("MagentoStagingnewProductPage_149")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
						,
						http("MagentoStagingnewProductPage_150")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
						,
						http("MagentoStagingnewProductPage_151")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
						,
						http("MagentoStagingnewProductPage_152")
							.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619065747786")
						,
						http("MagentoStagingnewProductPage_153")
							.get(uri01 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_154")
							.get(uri01 + "/10/reviews/summary/service?since_period=YEAR&unanswered_feedback=include&source=floating_service_widget&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
						,
						http("MagentoStagingnewProductPage_155")
							.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619065747787")
						,
						http("MagentoStagingnewProductPage_156")
							.get(uri01 + "/10/reviews/service?page=1&page_size=10&since_period=YEAR&full_thread=include&unanswered_feedback=include&source=floating_service_widget&sort=-updated_date&feefo_parameters=include&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
					))
				.pause(3)
				.exec(http("MagentoStagingnewProductPage_157")
					.get(uri07 + "?a=42254&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd%26ref%3Dhttps%253A%252F%252Faccount-qa.packtpub.com&p2=e%3Dvh&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=25255"))
				.pause(19)
				.exec(http("MagentoStagingnewProductPage_158")
					.get(uri05 + "/countdown-timer/u/06df9302_1606751575")
					.resources(http("MagentoStagingnewProductPage_159")
						.get(uri14 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=31333&ck=1&ref=https://staging-mg.packtpub.com/&ap=1645&be=2262&fe=31256&dc=2979&perf=%7B%22timing%22:%7B%22of%22:1619065745453,%22n%22:0,%22f%22:-1,%22dn%22:-1,%22dne%22:-1,%22c%22:-1,%22s%22:-1,%22ce%22:-1,%22rq%22:7,%22rp%22:2218,%22rpe%22:2218,%22dl%22:2222,%22di%22:2952,%22ds%22:2978,%22de%22:3000,%22dc%22:31255,%22l%22:31255,%22le%22:31294%7D,%22navigation%22:%7B%22ty%22:1%7D%7D&fcp=2943&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
						.check(status.is(500)),
						http("MagentoStagingnewProductPage_160")
							.get(uri05 + "/cached/26868356.json")
						,
						http("MagentoStagingnewProductPage_161")
							.get(uri31 + "/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=620&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575&be=296&fe=469&dc=373&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1619065776760,%22n%22:0,%22f%22:0,%22dn%22:0,%22dne%22:0,%22c%22:0,%22s%22:0,%22ce%22:0,%22rq%22:7,%22rp%22:198,%22rpe%22:198,%22dl%22:204,%22di%22:352,%22ds%22:352,%22de%22:374,%22dc%22:467,%22l%22:467,%22le%22:483%7D,%22navigation%22:%7B%7D%7D&jsonp=NREUM.setToken")))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_162")
					.get(uri18 + "/")
					.resources(http("MagentoStagingnewProductPage_163")
						.post(uri04)
						.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0163_request.json")),
						http("MagentoStagingnewProductPage_164")
							.get(uri20 + "/")
						,
						http("MagentoStagingnewProductPage_165")
							.get(uri12 + "?cachebust=2017-06-13-21-06")
					))
				.pause(6)
				.exec(http("MagentoStagingnewProductPage_166")
					.post(uri31 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=10635&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")
					.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0166_request.txt")))
				.pause(15)
		}

		object NewProductpage {
			val newproductpage= exec(http("MagentoStagingnewProductPage_title")
				.get(uri13 + "/h?a=3992788168&u=558546027102160&v=4473626203808193&s=5761475538996607&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619065491809&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&pp=ts&pp=1619065748736&id0=1731256967494644&t0=click&n0=button&c0=pushcrew-chrome-style-notification-btn%20pushcrew-btn-close&y0=%40div%3B.pushcrew-chrome-style-notification%3B.pushcrew-chrome-style-notification-safari%3B%7C%40div%3B.pushcrew-safari-notification-inner-wrapper%3B%7C%40div%3B%7C%40div%3B.pushcrew-button-wrapper%3B%7C%40button%3B.pushcrew-btn-close%3B.pushcrew-chrome-style-notification-btn%3B%7C&ts0=1619065801536&x0=Don%27t%20Allow&st=1619065803021")
			)
				.pause(13)
				.exec(http("MagentoStagingnewProductPage_168")
					.get("/catalogsearch/result/?q=__empty__")
					.resources(http("MagentoStagingnewProductPage_169")
						.get(uri16 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fcatalogsearch%252Fresult%252F%253Fq%253D__empty__%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
						http("MagentoStagingnewProductPage_170")
							.post(uri31 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=43747&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")
							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0170_request.txt")),
						http("MagentoStagingnewProductPage_171")
							.post(uri14 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=75034&ck=1&ref=https://staging-mg.packtpub.com/")

							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0171_request.txt")),
						http("MagentoStagingnewProductPage_172")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
						,
						http("MagentoStagingnewProductPage_173")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
						http("MagentoStagingnewProductPage_174")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
						,
						http("MagentoStagingnewProductPage_175")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
					))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_176")
					.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
					.resources(http("MagentoStagingnewProductPage_177")
						.get(uri13 + "/h?a=3992788168&u=558546027102160&v=6594259131469119&s=5761475538996607&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fcatalogsearch%2Fresult%2F&q=%3Fq%3D__empty__&d=staging-mg.packtpub.com&t=Search%20results%20for%3A%20%27%27&r=https%3A%2F%2Fstaging-mg.packtpub.com%2F&ts=1619065822662&pr=%2F&sp=ts&sp=1619065491809&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619065822663")
						,
						http("MagentoStagingnewProductPage_178")
							.get("/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2Fcatalogsearch%2Fresult%2F%3Fq%3D__empty__&sections=&_=1619065820629")
						,
						http("MagentoStagingnewProductPage_179")
							.get("/packtgtm/ajax/customer/?_=1619065820631")
						,
						http("MagentoStagingnewProductPage_180")
							.post("/signon/ajax/signon/?email=jumpinjhapaak%40test.com")

							.body(RawFileBody("computerdatabase/magentostagingnewproductpage/0180_request.json")),
						http("MagentoStagingnewProductPage_181")
							.get("/packtgeoip/ajax/storebanner?sourceURL=/catalogsearch/result/?q=__empty__&_=1619065820632")
						,
						http("MagentoStagingnewProductPage_182")
							.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619065820630")
						,
						http("MagentoStagingnewProductPage_183")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
						,
						http("MagentoStagingnewProductPage_184")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
						,
						http("MagentoStagingnewProductPage_185")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
						,
						http("MagentoStagingnewProductPage_186")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
						,
						http("MagentoStagingnewProductPage_187")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
						,
						http("MagentoStagingnewProductPage_188")
							.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619065820633")
						,
						http("MagentoStagingnewProductPage_189")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
						,
						http("MagentoStagingnewProductPage_190")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
						,
						http("MagentoStagingnewProductPage_191")
							.get("/catalogsearch/searchTermsLog/save/?q=__empty__&_=1619065820634")
						,
						http("MagentoStagingnewProductPage_192")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
						,
						http("MagentoStagingnewProductPage_193")
							.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619065820635")
					))
				.pause(1)
				.exec(http("MagentoStagingnewProductPage_194")
					.post(uri15 + "?x-algolia-agent=Algolia%20for%20vanilla%20JavaScript%20(lite)%203.27.0%3Binstantsearch.js%202.10.2%3BMagento2%20integration%20(1.13.3)%3BJS%20Helper%202.26.0&x-algolia-application-id=VIVZZXFQG1&x-algolia-api-key=MjBiNTIwZWM0MmE4MWQ0MDQwNzIxY2Q5ZTQ0ZjE0ZDNkMzI4ZDVkZWJiYzcxNGI1NjA2MWYzNmUyNTQxY2ViZnRhZ0ZpbHRlcnM9")
					.formParam("""{"requests":[{"indexName":"staging_magento2_us_products_packt_rank_asc","params":"query""", "")
					.formParam("hitsPerPage", "24")
					.formParam("maxValuesPerFacet", "10")
					.formParam("page", "0")
					.formParam("ruleContexts", """[""]""")
					.formParam("clickAnalytics", "true")
					.formParam("facets", """["product_type_filter","released","language","concept","tool","vendor","categories.level0","categories.level0"]""")
					.formParam("tagFilters", "")
					.formParam("facetFilters", """[["released:Available"]]""")
					.formParam("numericFilters", """["visibility_search=1"]"},{"indexName":"staging_magento2_us_products_packt_rank_asc","params":"query=""")
					.formParam("hitsPerPage", "1")
					.formParam("maxValuesPerFacet", "10")
					.formParam("page", "0")
					.formParam("ruleContexts", """[""]""")
					.formParam("clickAnalytics", "false")
					.formParam("attributesToRetrieve", "[]")
					.formParam("attributesToHighlight", "[]")
					.formParam("attributesToSnippet", "[]")
					.formParam("tagFilters", "")
					.formParam("analytics", "false")
					.formParam("facets", "released")
					.formParam("numericFilters", """["visibility_search=1"]"}]}""")
					.resources(http("MagentoStagingnewProductPage_195")
						.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75840")
						,
						http("MagentoStagingnewProductPage_196")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=48282")
						,
						http("MagentoStagingnewProductPage_197")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75813")
						,
						http("MagentoStagingnewProductPage_198")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76083")
						,
						http("MagentoStagingnewProductPage_199")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=74794")
						,
						http("MagentoStagingnewProductPage_200")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75822")
						,
						http("MagentoStagingnewProductPage_201")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=53445")
						,
						http("MagentoStagingnewProductPage_202")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76056")
						,
						http("MagentoStagingnewProductPage_203")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76182")
						,
						http("MagentoStagingnewProductPage_204")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76173")
						,
						http("MagentoStagingnewProductPage_205")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75831")
						,
						http("MagentoStagingnewProductPage_206")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=55713")
						,
						http("MagentoStagingnewProductPage_207")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75897")
						,
						http("MagentoStagingnewProductPage_208")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=74806")
						,
						http("MagentoStagingnewProductPage_209")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76047")
						,
						http("MagentoStagingnewProductPage_210")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=51306")
						,
						http("MagentoStagingnewProductPage_211")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=74751")
						,
						http("MagentoStagingnewProductPage_212")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76152")
						,
						http("MagentoStagingnewProductPage_213")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=73026")
						,
						http("MagentoStagingnewProductPage_214")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=57867")
						,
						http("MagentoStagingnewProductPage_215")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=51216")
						,
						http("MagentoStagingnewProductPage_216")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75738")
						,
						http("MagentoStagingnewProductPage_217")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=66396")
						,
						http("MagentoStagingnewProductPage_218")
							.get(uri01 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=73302")
						,
						http("MagentoStagingnewProductPage_219")
							.get("/product/python-machine-learning-third-edition/9781789955750")
						,
						http("MagentoStagingnewProductPage_220")
							.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
						,
						http("MagentoStagingnewProductPage_221")
							.get("/js/product.js?id=8d69087f5fd3fa998e55"),
						http("MagentoStagingnewProductPage_222")
							.get("/css/app.css?id=db6ae105ac48a0097ba5")
						,
						http("MagentoStagingnewProductPage_223")
							.get("/js/app.js?id=57774e803c36a000f6c2"),
						http("MagentoStagingnewProductPage_224")
							.get(uri32 + "/css?family=Nunito")
						,
						http("MagentoStagingnewProductPage_225")
							.get(uri32 + "/css?family=Montserrat")
						,
						http("MagentoStagingnewProductPage_226")
							.get(uri32 + "/css2?family=Roboto+Mono:wght@500&display=swap")
						,
						http("MagentoStagingnewProductPage_227")
							.get("/images/star--100-white.svg")
						,
						http("MagentoStagingnewProductPage_228")
							.get("/images/chevron--breadcrumb.svg")
						,
						http("MagentoStagingnewProductPage_229")
							.get("/images/star--0.svg")
						,
						http("MagentoStagingnewProductPage_230")
							.get("/images/star--100.svg")
						,
						http("MagentoStagingnewProductPage_231")
							.get(uri26)
						,
						http("MagentoStagingnewProductPage_232")
							.get("/images/header-bgblur.jpg?74f50e0dc4f105c09b2123a31a004111")
						,
						http("MagentoStagingnewProductPage_233")
							.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
						,
						http("MagentoStagingnewProductPage_234")
							.get("/images/chevron--right-orange.svg?e24f0f91527457cd491ef47f164e48de")
						,
						http("MagentoStagingnewProductPage_235")
							.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
						,
						http("MagentoStagingnewProductPage_236")
							.get("/images/info--blue.svg?021a636172e66637ad8f658d6e7a9cda")
						,
						http("MagentoStagingnewProductPage_237")
							.get("/images/chevron--orange.svg?c815c66c9d35a0262ddcf06a6668ba71")
						,
						http("MagentoStagingnewProductPage_238")
							.get("/images/blurry-bg.jpg?648b06508e554f6abc64bf6abb8588bb")
						,
						http("MagentoStagingnewProductPage_239")
							.get("/images/chevron--down-white.svg?e718d4531dde8d29a0d03a0d1a8c6690")
						,
						http("MagentoStagingnewProductPage_240")
							.get(uri13 + "/api/identify_v3?a=34805961&u=287607950759695&v=6402822992901828&s=1733674164878988&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1619065840491")
						,
						http("MagentoStagingnewProductPage_241")
							.get(uri13 + "/h?a=34805961&u=287607950759695&v=6402822992901828&s=1733674164878988&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fproduct%2Fpython-machine-learning-third-edition%2F9781789955750&d=staging-mg.packtpub.com&t=Python%20Machine%20Learning%20-%20Third%20Edition%20%7C%20Packt&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fcatalogsearch%2Fresult%2F%3Fq%3D__empty__&ts=1619065840489&pr=%2Fcatalogsearch%2Fresult%2F&sp=r&sp=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2F&sp=ts&sp=1619065613630&sp=d&sp=account-qa.packtpub.com&sp=h&sp=%2Faccount%2Fdetails&st=1619065844051")
						,
						http("MagentoStagingnewProductPage_242")
							.get(uri07 + "?a=43637&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvp%26p%3D9781789955750&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=11706")))
		}

	val guestUserr = scenario("MagentoStagingnewProductPageGuest").exec(Guest.guest)

	val signedInUserr = scenario("MagentoStagingnewProductPageSigneIn").exec(Guest.guest,SignInMagentostaging.signinmagentostaging,NewProductpage.newproductpage)

	setUp(guestUserr.inject(rampUsers(20).during(duration)),
		signedInUserr.inject(rampUsers(10).during(duration)
		))
		.protocols(httpProtocol)
}