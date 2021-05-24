package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class StagingFreeLearning extends Simulation {

	val duration = Duration(1, MINUTES)

	val httpProtocol = http
		.baseUrl("https://staging-mg.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")


    val uri01 = "https://bam-cell.nr-data.net"
    val uri02 = "https://api.feefo.com/api"
    val uri03 = "https://www.powr.io"
    val uri04 = "https://service.maxymiser.net/cg/v5"
    val uri05 = "https://ww2.feefo.com/api/ecommerce/plugin/widget/merchant/packt-publishing"
    val uri07 = "https://www.googletagmanager.com/gtm.js"
    val uri08 = "https://heapanalytics.com"
    val uri09 = "https://bam.nr-data.net"
    val uri10 = "https://vivzzxfqg1-1.algolianet.com/1/indexes/*/queries"
    val uri11 = "https://powr-counter.herokuapp.com/26868356"
    val uri12 = "https://polyfill.io/v3/polyfill.min.js"
    val uri13 = "https://aus5.mozilla.org/update/3/GMP/86.0.1/20210310152336/WINNT_x86_64-msvc-x64/en-US/release/Windows_NT%2010.0.0.0.19042.928%20(x64)/default/default/update.xml"
    val uri14 = "https://sslwidget.criteo.com/event"
    val uri15 = "https://widget.us.criteo.com/event"
    val uri16 = "https://www.google.com"
    val uri17 = "https://static-staging.packt-cdn.com/products"



		// UserHitsStagingURL
		object UserHitsStagingURL {
			val userhitsURL= exec(http("StagingFreeLearning_Userhitspage")
				.get(uri16 + "/complete/search?client=firefox&q=sta"))
				.pause(2)
				.exec(http("StagingFreeLearning_1")
					.get("/")
					.resources(http("StagingFreeLearning_2")
						.get(uri05),
						http("StagingFreeLearning_3")
							.get(uri04 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
						http("StagingFreeLearning_4")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/js-translation.json")
							,
						http("StagingFreeLearning_5")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Ves/fonts/fontawesome-webfont.woff2?v=4.7.0")
							,
						http("StagingFreeLearning_6")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
							,
						http("StagingFreeLearning_7")
							.get(uri07 + "?id=GTM-KHLZ7JF")
							,
						http("StagingFreeLearning_8")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
							,
						http("StagingFreeLearning_9")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
							,
						http("StagingFreeLearning_10")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
							,
						http("StagingFreeLearning_11")
							.get(uri02 + "/merchants/widgetintegration/all?merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
							,
						http("StagingFreeLearning_12")
							.get(uri02 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
							,
						http("StagingFreeLearning_13")
							.get(uri08 + "/h?a=3992788168&u=558546027102160&v=8009081840235895&s=4754044925139553&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=1&h=%2F&d=staging-mg.packtpub.com&t=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&ts=1619147955983&st=1619147955984")
							,
						http("StagingFreeLearning_14")
							.get(uri14 + "?a=42254&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvh&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=52519"),
						http("StagingFreeLearning_15")
							.get(uri02 + "/10/reviews/service?page=1&page_size=10&since_period=YEAR&full_thread=include&unanswered_feedback=include&source=floating_service_widget&sort=-updated_date&feefo_parameters=include&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
							,
						http("StagingFreeLearning_16")
							.get(uri15 + "?a=42254&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvh&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=52519")))
				.pause(19)
				.exec(http("StagingFreeLearning_17")
					.get(uri03 + "/countdown-timer/u/06df9302_1606751575")
					.resources(http("StagingFreeLearning_18")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
						,
						http("StagingFreeLearning_19")
							.get("/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2F&sections=&_=1619147952307")
							,
						http("StagingFreeLearning_20")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
							,
						http("StagingFreeLearning_21")
							.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619147952308")
							,
						http("StagingFreeLearning_22")
							.get("/packtgeoip/ajax/storebanner?sourceURL=/&_=1619147952310")
							,
						http("StagingFreeLearning_23")
							.get("/packtgtm/ajax/customer/?_=1619147952309")
							,
						http("StagingFreeLearning_24")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
							,
						http("StagingFreeLearning_25")
							.get("/media/undefined"),
							//.check(status.is(404)),
						http("StagingFreeLearning_26")
							.get(uri01 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=30882&ck=1&ref=https://staging-mg.packtpub.com/&ap=1798&be=1650&fe=29991&dc=4238&perf=%7B%22timing%22:%7B%22of%22:1619147948802,%22n%22:0,%22f%22:0,%22dn%22:6,%22dne%22:6,%22c%22:6,%22s%22:6,%22ce%22:7,%22rq%22:7,%22rp%22:1019,%22rpe%22:1502,%22dl%22:1594,%22di%22:4189,%22ds%22:4237,%22de%22:4248,%22dc%22:29989,%22l%22:29989,%22le%22:30097%7D,%22navigation%22:%7B%7D%7D&fcp=4243&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
							//.check(status.is(500))
						,
						http("StagingFreeLearning_27")
							.post("/signon/ajax/refresh")
							.formParam("access", "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiJkMTJjNTBhMi04NDNhLTQzZGUtOTZiYS0zNjBlMzljOTg1YTQiLCJ1c2VybmFtZSI6Imp1bXBpbmpoYXBhYWtAdGVzdC5jb20iLCJwZXJtaXNzaW9ucyI6W10sInN1YnNjcmlwdGlvbiI6W10sInBlcm1zIjoiQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9PSIsIm9yZ2FuaXNhdGlvbklkcyI6W10sImlhdCI6MTYxOTA4NDc1NCwiZXhwIjoxNjE5MDg1NjU0fQ.GWfyhwMxNnGblmzZhTMLl1_lpdtT6hLYmNSOTFRUthUzgRdL7L0-fI0gK3NWZwcJ0frFMwWgrEhS92IiEGvryrD78UlJC9a2Ni3y-tl2txyqggQEUdbSB3zbyPjQIf19I7JaEPVCFer3MrKgCFtQANsrUnGNpg2W53Dtd1CScOhfewyafiMMMruqNpgiz8eft0xTuMzCNcLYg3Qj7EWeP1HohKOq9kWzLMl4HrXTh0OEnZM-s4xIK6S65Zu2EnxS9oBtvljnYxzNtwU6a8ZADJUrpVlniWJkG73ryjOhGav0wBVJ7mFGNktqhATMNe6qmlktyHFZKy4SSHa1JYwaBQ")
							.formParam("refresh", "b8d90b343387bad5c23a454f555bfc64f334120c0acb72a953c6962a5030ede9"),
						http("StagingFreeLearning_28")
							.get(uri03 + "/cached/26868356.json")
							,
						http("StagingFreeLearning_29")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
							,
						http("StagingFreeLearning_30")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
							,
						http("StagingFreeLearning_31")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
							,
						http("StagingFreeLearning_32")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
							,
						http("StagingFreeLearning_33")
							.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619147952311")
							,
						http("StagingFreeLearning_34")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
							,
						http("StagingFreeLearning_35")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
							,
						http("StagingFreeLearning_36")
							.get(uri09 + "/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=10199&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575&be=798&fe=9672&dc=9670&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1619147978915,%22n%22:0,%22f%22:0,%22dn%22:8,%22dne%22:8,%22c%22:9,%22s%22:9,%22ce%22:9,%22rq%22:9,%22rp%22:230,%22rpe%22:547,%22dl%22:555,%22di%22:9640,%22ds%22:9653,%22de%22:9671,%22dc%22:9671,%22l%22:9671,%22le%22:9674%7D,%22navigation%22:%7B%7D%7D&fcp=10068&jsonp=NREUM.setToken"),
						http("StagingFreeLearning_37")
							.options(uri11)
							,
						http("StagingFreeLearning_38")
							.post("/signon/ajax/signon/?email=jumpinjhapaak%40test.com")
							.body(RawFileBody("computerdatabase/stagingfreelearning/0038_request.json")),
						http("StagingFreeLearning_39")
							.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619147952312")
							,
						http("StagingFreeLearning_40")
							.get(uri13)
							,
						http("StagingFreeLearning_41")
							.get("/")
							,
						http("StagingFreeLearning_42")
							.get(uri05)
							,
						http("StagingFreeLearning_43")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
							,
						http("StagingFreeLearning_44")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
							,
						http("StagingFreeLearning_45")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
							,
						http("StagingFreeLearning_46")
							.get(uri03 + "/powr.js?platform=html")
							,
						http("StagingFreeLearning_47")
							.get(uri12 + "?features=default%2CArray.prototype.includes%2CPromise")
							,
						http("StagingFreeLearning_48")
							.get(uri04 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04")
							,
						http("StagingFreeLearning_49")
							.post(uri09 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=15661&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")
							.body(RawFileBody("computerdatabase/stagingfreelearning/0049_request.txt")),
						http("StagingFreeLearning_50")
							.get(uri07 + "?id=GTM-KHLZ7JF")
							,
						http("StagingFreeLearning_51")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
							,
						http("StagingFreeLearning_52")
							.post(uri01 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=45769&ck=1&ref=https://staging-mg.packtpub.com/")
							.body(RawFileBody("computerdatabase/stagingfreelearning/0052_request.txt")),
						http("StagingFreeLearning_53")
							.get(uri02 + "/merchants/widgetintegration/all?merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
							,
						http("StagingFreeLearning_54")
							.get(uri08 + "/h?a=3992788168&u=558546027102160&v=8650982233884397&s=4754044925139553&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2F&d=staging-mg.packtpub.com&t=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&ts=1619147996374&sp=ts&sp=1619147955983&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619147996375")
							,
						http("StagingFreeLearning_55")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
							,
						http("StagingFreeLearning_56")
							.get(uri02 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
							,
						http("StagingFreeLearning_57")
							.get("/packtgtm/ajax/customer/?_=1619147994671")
							,
						http("StagingFreeLearning_58")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
							,
						http("StagingFreeLearning_59")
							.post("/signon/ajax/signon/?email=jumpinjhapaak%40test.com")
							.body(RawFileBody("computerdatabase/stagingfreelearning/0059_request.json")),
						http("StagingFreeLearning_60")
							.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619147994670")
							,
						http("StagingFreeLearning_61")
							.get("/packtgeoip/ajax/storebanner?sourceURL=/&_=1619147994672")
							,
						http("StagingFreeLearning_62")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
							,
						http("StagingFreeLearning_63")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
							,
						http("StagingFreeLearning_64")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
							,
						http("StagingFreeLearning_65")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
							,
						http("StagingFreeLearning_66")
							.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619147994673")
							,
						http("StagingFreeLearning_67")
							.get(uri02 + "/translations/en-US/FeefoWidget?origin=staging-mg.packtpub.com")
							,
						http("StagingFreeLearning_68")
							.get(uri02 + "/10/reviews/summary/service?since_period=YEAR&unanswered_feedback=include&source=floating_service_widget&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
							,
						http("StagingFreeLearning_69")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
							,
						http("StagingFreeLearning_70")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
							,
						http("StagingFreeLearning_71")
							.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619147994674")
							,
						http("StagingFreeLearning_72")
							.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
							,
						http("StagingFreeLearning_73")
							.get(uri02 + "/10/reviews/service?page=1&page_size=10&since_period=YEAR&full_thread=include&unanswered_feedback=include&source=floating_service_widget&sort=-updated_date&feefo_parameters=include&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
							))
				.pause(1)
				.exec(http("StagingFreeLearning_74")
					.get(uri14 + "?a=42254&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvh&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=41922"))
				.pause(1)
				.exec(http("StagingFreeLearning_75")
					.get(uri03 + "/countdown-timer/u/06df9302_1606751575")

					.resources(http("StagingFreeLearning_76")
						.get(uri01 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=32454&ck=1&ref=https://staging-mg.packtpub.com/&ap=2266&be=3093&fe=32386&dc=4007&perf=%7B%22timing%22:%7B%22of%22:1619147991501,%22n%22:0,%22u%22:3066,%22ue%22:3071,%22f%22:3,%22dn%22:3,%22dne%22:3,%22c%22:3,%22s%22:3,%22ce%22:3,%22rq%22:10,%22rp%22:3057,%22rpe%22:3058,%22dl%22:3065,%22di%22:3981,%22ds%22:4006,%22de%22:4031,%22dc%22:32384,%22l%22:32384,%22le%22:32423%7D,%22navigation%22:%7B%22ty%22:1%7D%7D&fcp=3979&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
						//.check(status.is(500))
						,
						http("StagingFreeLearning_77")
							.options(uri11)
							,
						http("StagingFreeLearning_78")
							.get(uri09 + "/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=885&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575&be=258&fe=840&dc=316&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1619148023916,%22n%22:0,%22f%22:1,%22dn%22:1,%22dne%22:1,%22c%22:1,%22s%22:1,%22ce%22:1,%22rq%22:5,%22rp%22:161,%22rpe%22:161,%22dl%22:166,%22di%22:296,%22ds%22:297,%22de%22:316,%22dc%22:838,%22l%22:838,%22le%22:859%7D,%22navigation%22:%7B%7D%7D&jsonp=NREUM.setToken"),
						http("StagingFreeLearning_79")
							.post(uri11)
							.body(RawFileBody("computerdatabase/stagingfreelearning/0079_request.json"))))
				.pause(1)
				.exec(http("StagingFreeLearning_80")
					.post(uri09 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=10886&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")
					.body(RawFileBody("computerdatabase/stagingfreelearning/0080_request.txt")))
				.pause(1)
		}


		// BrowseTitle
	object BrowseTitle {
			val browsetitle= exec(http("StagingFreeLearning_TitleSearch")
				.get("/catalogsearch/result/?q=__empty__")
				.resources(http("StagingFreeLearning_82")
					.get(uri04 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fcatalogsearch%252Fresult%252F%253Fq%253D__empty__%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("StagingFreeLearning_83")
						.post(uri09 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=23229&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")
						.body(RawFileBody("computerdatabase/stagingfreelearning/0083_request.txt")),
					http("StagingFreeLearning_84")
						.post(uri01 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=55651&ck=1&ref=https://staging-mg.packtpub.com/")
						.body(RawFileBody("computerdatabase/stagingfreelearning/0084_request.txt")),
					http("StagingFreeLearning_85")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
					http("StagingFreeLearning_86")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
						,
					http("StagingFreeLearning_87")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
						,
					http("StagingFreeLearning_88")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
						,
					http("StagingFreeLearning_89")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
						,
					http("StagingFreeLearning_90")
						.get("/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2Fcatalogsearch%2Fresult%2F%3Fq%3D__empty__&sections=&_=1619148047810")
						,
					http("StagingFreeLearning_91")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
						,
					http("StagingFreeLearning_92")
						.get(uri08 + "/h?a=3992788168&u=558546027102160&v=7716598250501217&s=4754044925139553&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fcatalogsearch%2Fresult%2F&q=%3Fq%3D__empty__&d=staging-mg.packtpub.com&t=Search%20results%20for%3A%20%27%27&r=https%3A%2F%2Fstaging-mg.packtpub.com%2F&ts=1619148048587&pr=%2F&sp=ts&sp=1619147955983&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619148048588")
						,
					http("StagingFreeLearning_93")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
						,
					http("StagingFreeLearning_94")
						.get("/packtgtm/ajax/customer/?_=1619148047814")
						,
					http("StagingFreeLearning_95")
						.post("/signon/ajax/signon/?email=jumpinjhapaak%40test.com")
						.body(RawFileBody("computerdatabase/stagingfreelearning/0095_request.json")),
					http("StagingFreeLearning_96")
						.get("/catalogsearch/searchTermsLog/save/?q=__empty__&_=1619148047811")
						,
					http("StagingFreeLearning_97")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
						,
					http("StagingFreeLearning_98")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
						,
					http("StagingFreeLearning_99")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
						,
					http("StagingFreeLearning_100")
						.post(uri10 + "?x-algolia-agent=Algolia%20for%20vanilla%20JavaScript%20(lite)%203.27.0%3Binstantsearch.js%202.10.2%3BMagento2%20integration%20(1.13.3)%3BJS%20Helper%202.26.0&x-algolia-application-id=VIVZZXFQG1&x-algolia-api-key=MjBiNTIwZWM0MmE4MWQ0MDQwNzIxY2Q5ZTQ0ZjE0ZDNkMzI4ZDVkZWJiYzcxNGI1NjA2MWYzNmUyNTQxY2ViZnRhZ0ZpbHRlcnM9")
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
						.formParam("numericFilters", """["visibility_search=1"]"}]}"""),
					http("StagingFreeLearning_101")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
						,
					http("StagingFreeLearning_102")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
						,
					http("StagingFreeLearning_103")
						.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619148047812")
						,
					http("StagingFreeLearning_104")
						.get("/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
						,
					http("StagingFreeLearning_105")
						.get("/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619148047815")
						,
					http("StagingFreeLearning_106")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=74794")
						,
					http("StagingFreeLearning_107")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75840")
						,
					http("StagingFreeLearning_108")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76047")
						,
					http("StagingFreeLearning_109")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=53445")
						,
					http("StagingFreeLearning_110")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76083")
						,
					http("StagingFreeLearning_111")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76056")
						,
					http("StagingFreeLearning_112")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75813")
						,
					http("StagingFreeLearning_113")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75822")
						,
					http("StagingFreeLearning_114")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75831")
						,
					http("StagingFreeLearning_115")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76173")
						,
					http("StagingFreeLearning_116")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76152")
						,
					http("StagingFreeLearning_117")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75897")
						,
					http("StagingFreeLearning_118")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=76182")
						,
					http("StagingFreeLearning_119")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=57867")
						,
					http("StagingFreeLearning_120")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=74806")
						,
					http("StagingFreeLearning_121")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=55713")
						,
					http("StagingFreeLearning_122")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=48282")
						,
					http("StagingFreeLearning_123")
						.get("/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619148047816")
						,
					http("StagingFreeLearning_124")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=73302")
						,
					http("StagingFreeLearning_125")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=74751")
						,
					http("StagingFreeLearning_126")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=73026")
						,
					http("StagingFreeLearning_127")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=51306")
						,
					http("StagingFreeLearning_128")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=51216")
						,
					http("StagingFreeLearning_129")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=66396")
						,
					http("StagingFreeLearning_130")
						.get(uri02 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=75738")
						,
					http("StagingFreeLearning_131")
						.get("/packtgeoip/ajax/storebanner?sourceURL=/catalogsearch/result/?q=__empty__&_=1619148047813")
						,
					http("StagingFreeLearning_132")
						.get(uri01 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABVRwQNWFREA1YQAVtMRlYWFFtHGA9ZBgdL&rst=9609&ck=1&ref=https://staging-mg.packtpub.com/catalogsearch/result/&ap=2824&be=4616&fe=9471&dc=5570&perf=%7B%22timing%22:%7B%22of%22:1619148042568,%22n%22:0,%22u%22:4582,%22ue%22:4585,%22f%22:103,%22dn%22:103,%22dne%22:103,%22c%22:103,%22s%22:103,%22ce%22:103,%22rq%22:106,%22rp%22:4568,%22rpe%22:4571,%22dl%22:4582,%22di%22:5534,%22ds%22:5570,%22de%22:5631,%22dc%22:9470,%22l%22:9470,%22le%22:9473%7D,%22navigation%22:%7B%7D%7D&fcp=5533&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
						//.check(status.is(500))
					,
					http("StagingFreeLearning_133")
						.get(uri14 + "?a=42254&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvl%26p%3D%255B9781789955248%252C9781789955750%252C9781839218859%255D&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=22181")))
				.pause(6)
				.exec(http("StagingFreeLearning_134")
					.get("/product/python-data-analysis-third-edition/9781789955248")
					.resources(http("StagingFreeLearning_135")
						.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
						,
						http("StagingFreeLearning_136")
							.get("/js/product.js?id=8d69087f5fd3fa998e55"),
						http("StagingFreeLearning_137")
							.get("/js/app.js?id=57774e803c36a000f6c2"),
						http("StagingFreeLearning_138")
							.get("/css/app.css?id=db6ae105ac48a0097ba5")
							,
						http("StagingFreeLearning_139")
							.get("/images/star--100-white.svg")
							,
						http("StagingFreeLearning_140")
							.get("/images/header-bgblur.jpg?74f50e0dc4f105c09b2123a31a004111")
							,
						http("StagingFreeLearning_141")
							.get("/images/star--0.svg")
							,
						http("StagingFreeLearning_142")
							.get("/images/chevron--breadcrumb.svg")
							,
						http("StagingFreeLearning_143")
							.post(uri01 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABVRwQNWFREA1YQAVtMRlYWFFtHGA9ZBgdL&rst=21772&ck=1&ref=https://staging-mg.packtpub.com/catalogsearch/result/")
							.body(RawFileBody("computerdatabase/stagingfreelearning/0143_request.txt")),
						http("StagingFreeLearning_144")
							.get("/images/info--blue.svg?021a636172e66637ad8f658d6e7a9cda")
							,
						http("StagingFreeLearning_145")
							.get("/images/chevron--right-orange.svg?e24f0f91527457cd491ef47f164e48de")
							,
						http("StagingFreeLearning_146")
							.get("/images/chevron--down-white.svg?e718d4531dde8d29a0d03a0d1a8c6690")
							,
						http("StagingFreeLearning_147")
							.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
							,
						http("StagingFreeLearning_148")
							.get("/images/star--100.svg")
							,
						http("StagingFreeLearning_149")
							.get("/images/star--0-white.svg")
							,
						http("StagingFreeLearning_150")
							.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
							,
						http("StagingFreeLearning_151")
							.get(uri17 + "/9781789955248/cover/smaller")
							,
						http("StagingFreeLearning_152")
							.get(uri08 + "/api/telemetry?a=34805961&te=type&te=data&te=cm&te=Cookie%20too%20large%20to%20store%20full%20landing%20page%20params&te=val&te=1&st=1619148065768&hv=4.14.0")
							,
						http("StagingFreeLearning_153")
							.get(uri08 + "/api/identify_v3?a=34805961&u=287607950759695&v=3297095128314736&s=4302962988127692&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1619148065770")
							,
						http("StagingFreeLearning_154")
							.get("/images/chevron--orange.svg?c815c66c9d35a0262ddcf06a6668ba71")
							,
						http("StagingFreeLearning_155")
							.get(uri14 + "?a=43637&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvp%26p%3D9781789955248&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=42213"),
						http("StagingFreeLearning_156")
							.get(uri08 + "/h?a=34805961&u=287607950759695&v=3297095128314736&s=4302962988127692&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=1&h=%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&d=staging-mg.packtpub.com&t=Python%20Data%20Analysis%20-%20Third%20Edition%20%7C%20Packt&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fcatalogsearch%2Fresult%2F%3Fq%3D__empty__&ts=1619148065767&pr=%2Fcatalogsearch%2Fresult%2F&st=1619148069914")
							,
						http("StagingFreeLearning_157")
							.get(uri08 + "/api/telemetry?a=34805961&te=type&te=data&te=cm&te=Cookie%20too%20large%20to%20store%20full%20landing%20page%20params&te=val&te=1&st=1619148070267&hv=4.14.0")
							))
				.pause(1)
		}


		// NavigateToFreeLearning
		object NavigateToFreeLearning {
			val navigatefreelearning= exec(http("StagingFreeLearning_GotoFreelearningTitlePage")
				.get(uri08 + "/h?a=34805961&u=287607950759695&v=3297095128314736&s=4302962988127692&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=r&sp=https%3A%2F%2Fstaging-mg.packtpub.com%2Fcatalogsearch%2Fresult%2F%3Fq%3D__empty__&sp=ts&sp=1619148065767&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&pp=t&pp=Python%20Data%20Analysis%20-%20Third%20Edition%20%7C%20Packt&pp=ts&pp=1619148065767&pp=pr&pp=%2Fcatalogsearch%2Fresult%2F&id0=2359633274977786&t0=click&n0=a&c0=menu__link&h0=https%3A%2F%2Fstaging-mg.packtpub.com%2Ffree-learning&y0=%40div%3B%23app%3B%7C%40nav%3B%23primary-navigation%3B.navigation%3B%7C%40div%3B.container-fluid%3B.navigation__inner%3B%7C%40div%3B.navigation__right%3B%7C%40ul%3B.menu%3B%7C%40li%3B.menu__item%3B%7C%40a%3B.menu__link%3B%5Bhref%3Dhttps%3A%2F%2Fstaging-mg.packtpub.com%2Ffree-learning%5D%3B%5Btarget%3D_blank%5D%3B%7C&ts0=1619148089197&x0=Free%20Learning&st=1619148090526")
					.resources(http("StagingFreeLearning_159")
					.get("/free-learning")
					,
					http("StagingFreeLearning_160")
						.get("/js/free-learning.js?id=07a235f20fd1945fd411"),
					http("StagingFreeLearning_161")
						.get(uri17 + "/9781789133639/cover/smaller")
						,
					http("StagingFreeLearning_162")
						.get(uri17 + "/9781788397483/cover/smaller")
						,
					http("StagingFreeLearning_163")
						.get(uri17 + "/9781789343625/cover/smaller")
						,
					http("StagingFreeLearning_164")
						.get(uri17 + "/9781788999786/cover/smaller")
						,
					http("StagingFreeLearning_165")
						.get(uri17 + "/9781786460165/cover/smaller")
						,
					http("StagingFreeLearning_166")
						.get(uri17 + "/9781786462541/cover/smaller")
						//.check(status.is(403))
						,
					http("StagingFreeLearning_167")
						.get(uri17 + "/9781788992992/cover/smaller")
						,
					http("StagingFreeLearning_168")
						.get(uri17 + "/9781788838986/cover/smaller")
						,
					http("StagingFreeLearning_169")
						.get(uri16 + "/recaptcha/api.js?onload=freeLearningClaimRecaptchaRenderCallback&render=explicit"),
					http("StagingFreeLearning_170")
						.get(uri17 + "/9781838645359/cover/smaller")
						,
					http("StagingFreeLearning_171")
						.get(uri17 + "/9781788995511/cover/smaller")
						,
					http("StagingFreeLearning_172")
						.get(uri17 + "/9781788620642/cover/smaller")
						,
					http("StagingFreeLearning_173")
						.get(uri17 + "/9781789611809/cover/smaller")
						//.check(status.is(403))
						,
					http("StagingFreeLearning_174")
						.get(uri16 + "/recaptcha/api2/anchor?ar=1&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&co=aHR0cHM6Ly9zdGFnaW5nLW1nLnBhY2t0cHViLmNvbTo0NDM.&hl=en&v=dpzVjBAupwRfx3UzvXRnnAKb&size=invisible&cb=5q3y5kotow8f")
						,
					http("StagingFreeLearning_175")
						.get(uri17 + "/9781788836968/cover/smaller")
						,
					http("StagingFreeLearning_176")
						.get(uri17 + "/9781788478953/cover/smaller")
						,
					http("StagingFreeLearning_177")
						.get(uri17 + "/9781789531091/cover/smaller")
						,
					http("StagingFreeLearning_178")
						.get(uri17 + "/9781788628846/cover/smaller")
						,
					http("StagingFreeLearning_179")
						.get(uri17 + "/9781788839297/cover/smaller")
						,
					http("StagingFreeLearning_180")
						.get(uri08 + "/api/identify_v3?a=34805961&u=287607950759695&v=961461884242402&s=4302962988127692&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1619148092441")
						,
					http("StagingFreeLearning_181")
						.get(uri17 + "/9781789348811/cover/smaller")
						//.check(status.is(403))
						,
					http("StagingFreeLearning_182")
						.get(uri17 + "/9781788395151/cover/smaller")
						,
					http("StagingFreeLearning_183")
						.get(uri17 + "/9781788833929/cover/smaller")
						,
					http("StagingFreeLearning_184")
						.get(uri17 + "/9781788835534/cover/smaller")
						,
					http("StagingFreeLearning_185")
						.get(uri17 + "/9781788472173/cover/smaller")
						,
					http("StagingFreeLearning_186")
						.get(uri17 + "/9781789341768/cover/smaller")
						,
					http("StagingFreeLearning_187")
						.get(uri17 + "/9781789139495/cover/smaller")
						,
					http("StagingFreeLearning_188")
						.get(uri17 + "/9781789539974/cover/smaller")
						,
					http("StagingFreeLearning_189")
						.get(uri17 + "/9781788475686/cover/smaller")
						,
					http("StagingFreeLearning_190")
						.get(uri17 + "/9781789533576/cover/smaller")
						,
					http("StagingFreeLearning_191")
						.get(uri17 + "/9781789137880/cover/smaller")
						,
					http("StagingFreeLearning_192")
						.get(uri17 + "/9781788837606/cover/smaller")
						,
					http("StagingFreeLearning_193")
						.get(uri17 + "/9781788626866/cover/smaller")
						,
					http("StagingFreeLearning_194")
						.get(uri17 + "/9781788839525/cover/smaller")
						//.check(status.is(403))
						,
					http("StagingFreeLearning_195")
						.get(uri17 + "/9781788839792/cover/smaller")
						,
					http("StagingFreeLearning_196")
						.get(uri16 + "/recaptcha/api2/bframe?hl=en&v=dpzVjBAupwRfx3UzvXRnnAKb&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&cb=5szkgnnij8kk")
						,
					http("StagingFreeLearning_197")
						.get(uri16 + "/recaptcha/api2/webworker.js?hl=en&v=dpzVjBAupwRfx3UzvXRnnAKb"),
					http("StagingFreeLearning_198")
						.post(uri16 + "/recaptcha/api2/reload?k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_")
						.body(RawFileBody("computerdatabase/stagingfreelearning/0198_request.dat")),
					http("StagingFreeLearning_199")
						.get(uri14 + "?a=43637&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvp%26p%3D9781788996662&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=56454"),
					http("StagingFreeLearning_200")
						.get(uri08 + "/h?a=34805961&u=287607950759695&v=961461884242402&s=4302962988127692&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Ffree-learning&d=staging-mg.packtpub.com&t=Free%20Learning%20%7C%20Daily%20Programming%20eBook%20from%20Packt&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&ts=1619148092438&pr=%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&sp=r&sp=https%3A%2F%2Fstaging-mg.packtpub.com%2Fcatalogsearch%2Fresult%2F%3Fq%3D__empty__&sp=ts&sp=1619148065767&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&st=1619148097441")
				))
		}

	val anyuser = scenario("StagingFreeLearning").exec(UserHitsStagingURL.userhitsURL,BrowseTitle.browsetitle,NavigateToFreeLearning.navigatefreelearning)

	setUp(anyuser.inject(rampUsers(25).during(duration)).protocols(httpProtocol))
}