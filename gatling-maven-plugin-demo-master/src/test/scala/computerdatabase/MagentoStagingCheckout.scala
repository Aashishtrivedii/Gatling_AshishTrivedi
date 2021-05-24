package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class MagentoStagingCheckout extends Simulation {

	val duration = Duration(1, MINUTES)

	val httpProtocol = http
		.baseUrl("https://staging-mg.packtpub.com/")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0")


    val uri01 = "https://api.feefo.com/api/merchants/widgetintegration/all"
    val uri02 = "https://www.google-analytics.com/j/collect"
    val uri03 = "https://www.recaptcha.net/recaptcha"
    val uri04 = "https://stats.g.doubleclick.net/j/collect"
    val uri05 = "https://aus5.mozilla.org/update/3/SystemAddons/86.0.1/20210310152336/WINNT_x86_64-msvc-x64/en-US/release/Windows_NT%2010.0.0.0.19042.928%20(x64)/default/default/update.xml"
    val uri06 = "https://sslwidget.criteo.com/event"
    val uri07 = "https://staging-mg.packtpub.com"
    val uri08 = "https://firefox.settings.services.mozilla.com/v1"
    val uri09 = "https://content-signature-2.cdn.mozilla.net/chains"
    val uri11 = "https://fonts.googleapis.com"
    val uri12 = "https://bam-cell.nr-data.net"
    val uri13 = "https://firefox-settings-attachments.cdn.mozilla.net/security-state-staging/intermediates"
    val uri14 = "https://fpdbs.sandbox.paypal.com/dynamicimageweb"
    val uri15 = "https://service.maxymiser.net/cg/v5"
    val uri16 = "https://www.google.com"
    val uri17 = "https://services.addons.mozilla.org/api/v4/addons/search"
    val uri18 = "https://www.google.co.in/ads/ga-audiences"


		// ProductSearch
		object ProductSearch {
			val prodsearch=exec(http("MagentoStagingCheckout_0")
				.get(uri07 + "/product/python-data-analysis-third-edition/9781789955248")
				.resources(http("MagentoStagingCheckout_1")
					.get(uri07 + "/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
					,
					http("MagentoStagingCheckout_2")
						.post(uri12 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABVRwQNWFREA1YQAVtMRlYWFFtHGA9ZBgdL&rst=43295&ck=1&ref=https://staging-mg.packtpub.com/in/catalogsearch/result/")
						.body(RawFileBody("computerdatabase/magentostagingcheckout/0002_request.txt")),
					http("MagentoStagingCheckout_3")
						.get(uri07 + "/css/app.css?id=db6ae105ac48a0097ba5")
						,
					http("MagentoStagingCheckout_4")
						.get(uri07 + "/js/product.js?id=8d69087f5fd3fa998e55"),
					http("MagentoStagingCheckout_5")
						.get(uri11 + "/css2?family=Roboto+Mono:wght@500&display=swap")
						,
					http("MagentoStagingCheckout_6")
						.get(uri07 + "/js/app.js?id=57774e803c36a000f6c2"),
					http("MagentoStagingCheckout_7")
						.get(uri11 + "/css?family=Nunito")
						,
					http("MagentoStagingCheckout_8")
						.get(uri11 + "/css?family=Montserrat")
						,
					http("MagentoStagingCheckout_9")
						.get(uri07 + "/images/star--100.svg")
						,
					http("MagentoStagingCheckout_10")
						.get(uri07 + "/images/star--0.svg")
						,
					http("MagentoStagingCheckout_11")
						.get(uri07 + "/images/star--100-white.svg")
						,
					http("MagentoStagingCheckout_12")
						.get(uri07 + "/images/chevron--breadcrumb.svg")
						,
					http("MagentoStagingCheckout_13")
						.get(uri07 + "/images/star--0-white.svg")
						,
					http("MagentoStagingCheckout_14")
						.get(uri07 + "/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
						,
					http("MagentoStagingCheckout_15")
						.get(uri07 + "/images/info--blue.svg?021a636172e66637ad8f658d6e7a9cda")
						,
					http("MagentoStagingCheckout_16")
						.get(uri07 + "/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
						,
					http("MagentoStagingCheckout_17")
						.get(uri07 + "/images/header-bgblur.jpg?74f50e0dc4f105c09b2123a31a004111")
						,
					http("MagentoStagingCheckout_18")
						.get(uri07 + "/images/chevron--right-orange.svg?e24f0f91527457cd491ef47f164e48de")
						,
					http("MagentoStagingCheckout_19")
						.get(uri07 + "/images/chevron--down-white.svg?e718d4531dde8d29a0d03a0d1a8c6690")
						,
					http("MagentoStagingCheckout_20")
						.get("/api/identify_v3?a=34805961&u=287607950759695&v=2172743188225117&s=7122938861970858&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=0&st=1619409513341")
						,
					http("MagentoStagingCheckout_21")
						.get(uri07 + "/images/chevron--orange.svg?c815c66c9d35a0262ddcf06a6668ba71")
						,
					http("MagentoStagingCheckout_22")
						.get("/h?a=34805961&u=287607950759695&v=2172743188225117&s=7122938861970858&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&d=staging-mg.packtpub.com&t=Python%20Data%20Analysis%20-%20Third%20Edition%20%7C%20Packt&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcatalogsearch%2Fresult%2F%3Fq%3D__empty__&ts=1619409513339&pr=%2Fin%2Fcatalogsearch%2Fresult%2F&sp=r&sp=https%3A%2F%2Fstaging-mg.packtpub.com%2F&sp=ts&sp=1619409327239&sp=d&sp=account-qa.packtpub.com&sp=h&sp=%2Flogin&st=1619409516092")
						))
				.pause(1)
				.exec(http("MagentoStagingCheckout_23")
					.get(uri06 + "?a=43637&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvp%26p%3D9781789955248&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=35584"))
				.pause(1)
				.exec(http("MagentoStagingCheckout_24")
					.get(uri07 + "/in/buyitem/index/index/sku/9781789953459")

					.resources(http("MagentoStagingCheckout_25")
						.get(uri15 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fproduct%252Fpython-data-analysis-third-edition%252F9781789955248%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fin%252Fcheckout%252Fcart%252Findex%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
						http("MagentoStagingCheckout_26")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
							,
						http("MagentoStagingCheckout_27")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
							,
						http("MagentoStagingCheckout_28")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
							,
						http("MagentoStagingCheckout_29")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
							,
						http("MagentoStagingCheckout_30")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
							,
						http("MagentoStagingCheckout_31")
							.get("/h?a=3992788168&u=558546027102160&v=4422566289268330&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fin%2Fcheckout%2Fcart%2Findex%2F&d=staging-mg.packtpub.com&t=Shopping%20Cart&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&ts=1619409537930&pr=%2Fproduct%2Fpython-data-analysis-third-edition%2F9781789955248&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619409537932")
							,
						http("MagentoStagingCheckout_32")
							.get(uri07 + "/in/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout%2Fcart%2Findex%2F&sections=&_=1619409535423")
							,
						http("MagentoStagingCheckout_33")
							.get(uri14 + "?cmd=_dynamic-image&buttontype=ecshortcut&locale=en_GB&ordertotal=5.00")
							,
						http("MagentoStagingCheckout_34")
							.get(uri07 + "/in/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619409535422")
							))
				.pause(1)
				.exec(http("MagentoStagingCheckout_35")
					.get(uri08 + "/buckets/monitor/collections/changes/records?")
					.resources(http("MagentoStagingCheckout_36")
						.get(uri07 + "/in/packtgtm/ajax/customer/?_=1619409535425")
						,
						http("MagentoStagingCheckout_37")
							.get(uri08 + "/buckets/security-state/collections/intermediates/changeset?_expected=1619402239418&_since=%221615795147334%22")
							,
						http("MagentoStagingCheckout_38")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
							,
						//http("MagentoStagingCheckout_39")
							//.post(https://staging-mg.packtpub.com/in//signon/ajax/signon/?email=jumpinjhapaak%40test.com)
							//.body(RawFileBody("computerdatabase/magentostagingcheckout/0039_request.json")),
						http("MagentoStagingCheckout_40")
							.get(uri09 + "/onecrl.content-signature.mozilla.org-2021-06-11-15-04-26.chain"),
						http("MagentoStagingCheckout_41")
							.get(uri07 + "/in/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619409535426")
							,
						http("MagentoStagingCheckout_42")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
							,
						http("MagentoStagingCheckout_43")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
							,
						http("MagentoStagingCheckout_44")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
							,
						http("MagentoStagingCheckout_45")
							.get(uri07 + "/in/packtgeoip/ajax/storebanner?sourceURL=/in/checkout/cart/index/&_=1619409535424")
							,
						http("MagentoStagingCheckout_46")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
							,
						http("MagentoStagingCheckout_47")
							.get(uri08 + "/buckets/security-state/collections/cert-revocations/changeset?_expected=1619402235872&_since=%221615795144103%22")
							,
						http("MagentoStagingCheckout_48")
							.get(uri09 + "/onecrl.content-signature.mozilla.org-2021-06-11-15-04-26.chain")
							,
						http("MagentoStagingCheckout_49")
							.get(uri14 + "?cmd=_dynamic-image&buttontype=ecshortcut&locale=en_GB")
							,
						http("MagentoStagingCheckout_50")
							.get(uri08 + "/buckets/main/collections/normandy-recipes-capabilities/changeset?_expected=1619308890671&_since=%221618444877574%22")
							,
						http("MagentoStagingCheckout_51")
							.get(uri09 + "/remote-settings.content-signature.mozilla.org-2021-06-11-15-04-32.chain"),
						http("MagentoStagingCheckout_52")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
							,
						http("MagentoStagingCheckout_53")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
							,
						http("MagentoStagingCheckout_54")
							.get(uri08 + "/buckets/main/collections/search-config/changeset?_expected=1619106893467&_since=%221613587855073%22")
							,
						http("MagentoStagingCheckout_55")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
							,
						http("MagentoStagingCheckout_56")
							.get(uri07 + "/in/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619409535427")
							,
						http("MagentoStagingCheckout_57")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/minicart/subtotal.html")
							,
						http("MagentoStagingCheckout_58")
							.get(uri09 + "/remote-settings.content-signature.mozilla.org-2021-06-11-15-04-32.chain")
							,
						http("MagentoStagingCheckout_59")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/minicart/item/default.html")
							,
						http("MagentoStagingCheckout_60")
							.get(uri08 + "/buckets/blocklists/collections/addons-bloomfilters/changeset?_expected=1618922278863&_since=%221618425472068%22")
							,
						http("MagentoStagingCheckout_61")
							.get(uri09 + "/remote-settings.content-signature.mozilla.org-2021-05-22-15-04-15.chain"),
						http("MagentoStagingCheckout_62")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/minicart/subtotal/totals.html")
							,
						http("MagentoStagingCheckout_63")
							.get(uri08 + "/buckets/main/collections/cfr/changeset?_expected=1618847843566&_since=%221617116346266%22")
							,
						http("MagentoStagingCheckout_64")
							.get(uri07 + "/in/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619409535428")
							,
						http("MagentoStagingCheckout_65")
							.get(uri08 + "/buckets/main/collections/nimbus-desktop-experiments/changeset?_expected=1618519594470&_since=%221617989192163%22")
							,
						http("MagentoStagingCheckout_66")
							.get(uri09 + "/remote-settings.content-signature.mozilla.org-2021-06-11-15-04-32.chain")
							,
						http("MagentoStagingCheckout_67")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Catalog/template/product/image_with_borders.html")
							,
						http("MagentoStagingCheckout_68")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/minicart/item/price.html")
							,
						http("MagentoStagingCheckout_69")
							.get(uri08 + "/buckets/security-state/collections/onecrl/changeset?_expected=1618007740387&_since=%221614217822898%22")
							,
						http("MagentoStagingCheckout_70")
							.get(uri09 + "/onecrl.content-signature.mozilla.org-2021-06-11-15-04-26.chain")))
				.pause(1)
				.exec(http("MagentoStagingCheckout_71")
					.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_GiftMessage/template/gift-message.html")
					.resources(http("MagentoStagingCheckout_72")
						.get(uri08 + "/"),
						http("MagentoStagingCheckout_73")
							.get(uri08 + "/"),
						http("MagentoStagingCheckout_74")
							.get(uri08 + "/"),
						http("MagentoStagingCheckout_75")
							.get(uri08 + "/"),
						http("MagentoStagingCheckout_76")
							.get(uri08 + "/"),
						http("MagentoStagingCheckout_77")
							.get(uri08 + "/"),
						http("MagentoStagingCheckout_78")
							.get(uri08 + "/"),
						http("MagentoStagingCheckout_79")
							.get(uri13 + "/6028ff58-33dd-4bde-823d-a595d14b2675.pem"),
						http("MagentoStagingCheckout_80")
							.get(uri13 + "/3cb1d165-33d1-4e0e-b3c3-ea257c88d0cd.pem"),
						http("MagentoStagingCheckout_81")
							.get(uri06 + "?a=43637&v=5.6.3&p0=e%3Dce%26m%3D%255Bjumpinjhapaak%252540test.com%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvb%26p%3D%255Bi%25253D9781789953459%252526pr%25253D4.7600%252526q%25253D1%255D&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=17686"),
						http("MagentoStagingCheckout_82")
							.get(uri13 + "/23fb382a-0804-499f-bd00-e6e22f5b988a.pem"),
						http("MagentoStagingCheckout_83")
							.get(uri13 + "/a33bcad3-47f9-4423-ab8e-92ad859cc5ec.pem"),
						http("MagentoStagingCheckout_84")
							.get(uri08 + "/"),
						http("MagentoStagingCheckout_85")
							.get(uri13 + "/216f9a54-3c50-4a9e-8587-710316dd862e.pem"),
						http("MagentoStagingCheckout_86")
							.get(uri13 + "/9e656d32-029f-4786-8109-0a14e6c07851.pem"),
						http("MagentoStagingCheckout_87")
							.get(uri13 + "/4ccbb3ff-d861-42fa-82a1-04b5ea082928.pem"),
						http("MagentoStagingCheckout_88")
							.get(uri13 + "/068e9dda-18a8-44f4-b9ea-a99071a9b564.pem"),
						http("MagentoStagingCheckout_89")
							.get(uri13 + "/616b8c10-5e1d-4a6f-9d4b-0e50a8fd9dc5.pem"),
						http("MagentoStagingCheckout_90")
							.get(uri13 + "/e4ca7c17-cf68-4b24-9993-fa0a94dd8fbb.pem"),
						http("MagentoStagingCheckout_91")
							.get(uri13 + "/5b9ce9ed-6717-41a3-bda1-2c4d234f9bdb.pem"),
						http("MagentoStagingCheckout_92")
							.get(uri13 + "/79d3bec2-b98d-44b5-89fe-9e4864e64ad9.pem"),
						http("MagentoStagingCheckout_93")
							.get(uri13 + "/acbdf2fd-02d3-4a14-88f8-e17f63894116.pem"),
						http("MagentoStagingCheckout_94")
							.get(uri13 + "/9c742aff-50fc-408f-bf81-6041f6a0cd8c.pem"),
						http("MagentoStagingCheckout_95")
							.get(uri13 + "/271cdd84-3255-4317-bf48-4451169b8dae.pem"),
						http("MagentoStagingCheckout_96")
							.get(uri13 + "/caec957d-379a-4c23-bf42-3bd122e7cf33.pem"),
						http("MagentoStagingCheckout_97")
							.get(uri13 + "/4ac7551e-df25-45fe-a00e-1c0592f82e10.pem"),
						http("MagentoStagingCheckout_98")
							.get(uri13 + "/1dd7a672-7731-438a-a870-6befbec1d7d3.pem"),
						http("MagentoStagingCheckout_99")
							.get(uri13 + "/ed3bd504-055b-4cd8-bd25-f3f397765114.pem"),
						http("MagentoStagingCheckout_100")
							.get(uri13 + "/f5de7e28-aca0-46a9-9bca-3badac5477b5.pem"),
						http("MagentoStagingCheckout_101")
							.get(uri13 + "/503dcd26-4c32-47e1-b481-bac059ede0ad.pem"),
						http("MagentoStagingCheckout_102")
							.get(uri13 + "/8ea5a23d-47e9-4a6a-b770-e8279ded08dc.pem"),
						http("MagentoStagingCheckout_103")
							.get(uri13 + "/5cc07929-0f31-444c-9904-7e3f405702e3.pem"),
						http("MagentoStagingCheckout_104")
							.get(uri13 + "/cd171490-1eaf-4143-8d9b-b448125dca5a.pem"),
						http("MagentoStagingCheckout_105")
							.get(uri13 + "/c819724d-2379-4027-a3fb-8b9f8429c2ce.pem"),
						http("MagentoStagingCheckout_106")
							.get(uri13 + "/62957f1c-f38a-4d81-add7-613918ddb0e3.pem"),
						http("MagentoStagingCheckout_107")
							.get(uri13 + "/d4114efd-21ce-41ee-a516-115135e41392.pem"),
						http("MagentoStagingCheckout_108")
							.get(uri13 + "/8bb12e95-900e-4795-a84c-9c05604d6277.pem"),
						http("MagentoStagingCheckout_109")
							.get(uri13 + "/cf2e39d7-b632-441c-9f80-c1de03246b44.pem"),
						http("MagentoStagingCheckout_110")
							.get(uri13 + "/0fb3109a-8d8c-4357-9997-0046e1101a8b.pem"),
						http("MagentoStagingCheckout_111")
							.get(uri13 + "/d5f97b7c-ad47-468e-9917-7ab8f0da14df.pem"),
						http("MagentoStagingCheckout_112")
							.get(uri13 + "/1b2ce0c0-8b69-4cd8-a707-b8838518c6d5.pem"),
						http("MagentoStagingCheckout_113")
							.get(uri13 + "/77625d05-cbf0-41a3-9a54-8400ecb3900b.pem"),
						http("MagentoStagingCheckout_114")
							.get(uri13 + "/a7f3d836-75c7-4b0a-b66d-51c9e835658c.pem"),
						http("MagentoStagingCheckout_115")
							.get(uri13 + "/f0d6e4aa-fd9d-471e-aea7-3561960ded0c.pem"),
						http("MagentoStagingCheckout_116")
							.get(uri13 + "/ad52d5b8-dd6b-4b77-864e-b4e8cea23c4b.pem"),
						http("MagentoStagingCheckout_117")
							.get(uri13 + "/c90924fc-9990-4376-981a-144a450278d1.pem"),
						http("MagentoStagingCheckout_118")
							.get(uri13 + "/70fef55d-f801-4b2e-9760-319addcd8663.pem"),
						http("MagentoStagingCheckout_119")
							.get(uri13 + "/d4dfe52e-f488-4ae2-9052-f8efaf2f1e6b.pem"),
						http("MagentoStagingCheckout_120")
							.get(uri13 + "/6931f930-fdce-4e17-b7b4-d70bde3a993e.pem"),
						http("MagentoStagingCheckout_121")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/cart/totals.html")
							,
						http("MagentoStagingCheckout_122")
							.get(uri13 + "/df88829d-655f-4d7e-91c6-29c5307443fc.pem"),
						http("MagentoStagingCheckout_123")
							.get(uri13 + "/ecb85ef3-60a6-486c-a07a-96efc94a8698.pem"),
						http("MagentoStagingCheckout_124")
							.get(uri13 + "/e68c692d-4e97-4222-9ba7-f6bea98387c1.pem"),
						http("MagentoStagingCheckout_125")
							.get(uri13 + "/a3d2b25d-bf3f-4eb2-b373-fd42fa9733a4.pem"),
						http("MagentoStagingCheckout_126")
							.get(uri13 + "/dd3cc9bd-c4c2-4399-871f-40f8dc392a0a.pem"),
						http("MagentoStagingCheckout_127")
							.get(uri13 + "/96257d5e-dbb2-4cdf-853c-f1f0733c8f24.pem"),
						http("MagentoStagingCheckout_128")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/cart/shipping-rates.html")
							,
						http("MagentoStagingCheckout_129")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/summary/subtotal.html")
							,
						http("MagentoStagingCheckout_130")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_GiftWrapping/template/summary/totals.html")
							,
						http("MagentoStagingCheckout_131")
							.get(uri13 + "/0762bacb-14bc-4ff5-a1f5-6c44a3e7fc92.pem"),
						http("MagentoStagingCheckout_132")
							.get(uri13 + "/ca826164-049f-4c05-91f0-9b1e9243437b.pem"),
						http("MagentoStagingCheckout_133")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/cart/shipping-estimation.html")
							,
						http("MagentoStagingCheckout_134")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Reward/template/cart/reward.html")
							,
						http("MagentoStagingCheckout_135")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_SalesRule/template/cart/totals/discount.html")
							,
						http("MagentoStagingCheckout_136")
							.post(uri07 + "/in/rest/in/V1/carts/mine/totals-information")
							.body(RawFileBody("computerdatabase/magentostagingcheckout/0136_request.json")),
						http("MagentoStagingCheckout_137")
							.get(uri13 + "/9e707aa9-a13b-417d-ac93-377ab92b3136.pem"),
						http("MagentoStagingCheckout_138")
							.get(uri13 + "/11874a50-2486-4c75-9a7f-18200abba7e7.pem"),
						http("MagentoStagingCheckout_139")
							.get(uri13 + "/ebb5aadd-6be8-45d6-9555-03da33f2eeab.pem"),
						http("MagentoStagingCheckout_140")
							.get(uri13 + "/6530bafe-f40a-4817-8f16-70306aae702f.pem"),
						http("MagentoStagingCheckout_141")
							.get(uri13 + "/6a0129c6-92f4-4b4c-93f5-4dfe10644ab4.pem"),
						http("MagentoStagingCheckout_142")
							.get(uri13 + "/4310c0e6-ae5f-406b-92b9-98e7f00bbbca.pem"),
						http("MagentoStagingCheckout_143")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Amasty_Rules/template/summary/discount-breakdown.html")
							,
						http("MagentoStagingCheckout_144")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_GiftCardAccount/template/cart/totals/gift-card-account.html")
							,
						http("MagentoStagingCheckout_145")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/cart/totals/shipping.html")
							,
						http("MagentoStagingCheckout_146")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Weee/template/checkout/summary/weee.html")
							,
						http("MagentoStagingCheckout_147")
							.get(uri13 + "/82fcc086-5e5e-43f4-b969-d11903a233b2.pem"),
						http("MagentoStagingCheckout_148")
							.get(uri13 + "/3712ec43-ab3a-42ad-b264-a74c80ef69e5.pem"),
						http("MagentoStagingCheckout_149")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/cart/totals/grand-total.html")
							,
						http("MagentoStagingCheckout_150")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/cart/totals/tax.html")
							,
						http("MagentoStagingCheckout_151")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Vertex_Tax/template/checkout/cart/totals/tax-messages.html")
							,
						http("MagentoStagingCheckout_152")
							.get(uri13 + "/4127bd34-af66-440b-a5e5-ef3e2fafc693.pem"),
						http("MagentoStagingCheckout_153")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/form/field.html")
							,
						http("MagentoStagingCheckout_154")
							.get(uri13 + "/eb0859b9-f429-471e-bb20-a7d0015f53e0.pem"),
						http("MagentoStagingCheckout_155")
							.get(uri13 + "/866576c2-9a96-4150-96d4-fe072ba61275.pem"),
						http("MagentoStagingCheckout_156")
							.get(uri13 + "/b5cd86e6-bf87-4edb-ba33-8de3e5d49c01.pem"),
						http("MagentoStagingCheckout_157")
							.get(uri13 + "/ece8b606-45ac-4bd4-b72c-f06521a15f28.pem"),
						http("MagentoStagingCheckout_158")
							.get(uri13 + "/7a527203-c2a4-4bb1-a63d-f2a451806da3.pem"),
						http("MagentoStagingCheckout_159")
							.get(uri13 + "/9a4e121a-4cfd-4091-be4b-f408b0133182.pem"),
						http("MagentoStagingCheckout_160")
							.get(uri13 + "/09739035-12e5-4a34-99dd-956d79fea60e.pem"),
						http("MagentoStagingCheckout_161")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/form/element/select.html")
							,
						http("MagentoStagingCheckout_162")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/form/element/input.html")
							,
						http("MagentoStagingCheckout_163")
							.get(uri13 + "/010c80a9-09ac-40c1-a83f-c536e90c1605.pem"),
						http("MagentoStagingCheckout_164")
							.get(uri13 + "/f75bc595-a8a3-40dc-807d-d71bcf4d088e.pem"),
						http("MagentoStagingCheckout_165")
							.get(uri13 + "/ff36f8c3-a9bc-43de-9ac3-1a0e3044a755.pem"),
						http("MagentoStagingCheckout_166")
							.get(uri13 + "/7bde81a0-cc81-45c5-9cd8-7c10229a1da1.pem"),
						http("MagentoStagingCheckout_167")
							.get(uri13 + "/6f99d2d9-0ee7-4c0a-ade3-730b79ed5822.pem"),
						http("MagentoStagingCheckout_168")
							.get(uri13 + "/8a5b84b0-18b6-4ce3-b0b3-19fd76614662.pem"),
						http("MagentoStagingCheckout_169")
							.get(uri13 + "/471ff3d1-a234-44c3-9336-a3593480bf23.pem"),
						http("MagentoStagingCheckout_170")
							.get(uri13 + "/525578e5-a94b-4525-b9e7-801be6e0ff89.pem"),
						http("MagentoStagingCheckout_171")
							.get(uri13 + "/6d981422-3a63-4758-a913-e173e7bbd623.pem"),
						http("MagentoStagingCheckout_172")
							.get(uri13 + "/39ac1c8f-4a87-4425-997e-34a5ad309811.pem"),
						http("MagentoStagingCheckout_173")
							.get(uri13 + "/e44ccea7-3169-40b9-9543-277638419f68.pem"),
						http("MagentoStagingCheckout_174")
							.get(uri13 + "/532f1fdb-2d89-4ae4-a50b-205e34e68013.pem"),
						http("MagentoStagingCheckout_175")
							.get(uri13 + "/ab705e32-dc6c-492b-9e2c-763659d12983.pem"),
						http("MagentoStagingCheckout_176")
							.get(uri13 + "/2506b0f6-fd57-45aa-a12a-ab492d80b2f6.pem"),
						http("MagentoStagingCheckout_177")
							.get(uri13 + "/665ffd69-0f52-4b62-84c4-a5eea799f613.pem"),
						http("MagentoStagingCheckout_178")
							.get(uri12 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABcVgYKWEZDSVQDEEdMXV0BBE8%3D&rst=49194&ck=1&ref=https://staging-mg.packtpub.com/in/checkout/cart/index/&ap=1455&be=5398&fe=46211&dc=7516&perf=%7B%22timing%22:%7B%22of%22:1619409529429,%22n%22:0,%22u%22:5374,%22r%22:1,%22ue%22:5375,%22re%22:955,%22f%22:955,%22dn%22:955,%22dne%22:955,%22c%22:955,%22s%22:955,%22ce%22:955,%22rq%22:959,%22rp%22:5365,%22rpe%22:5365,%22dl%22:5373,%22di%22:7485,%22ds%22:7515,%22de%22:7539,%22dc%22:46211,%22l%22:46211,%22le%22:46220%7D,%22navigation%22:%7B%22rc%22:1%7D%7D&fcp=7476&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
							//.check(status.is(500))
						,
						http("MagentoStagingCheckout_179")
							.get(uri13 + "/c09c55b5-14e7-4603-a7a9-e7c0bc70e59b.pem"),
						http("MagentoStagingCheckout_180")
							.get(uri13 + "/41a8bdca-47c0-41ea-a325-fedf496567d3.pem"),
						http("MagentoStagingCheckout_181")
							.get(uri13 + "/794e0905-f34e-4a01-a778-9804fa5f1587.pem"),
						http("MagentoStagingCheckout_182")
							.get(uri13 + "/c83c53fb-0abe-4198-bfea-13ca2f6f8c6a.pem"),
						http("MagentoStagingCheckout_183")
							.get(uri13 + "/bfd5cec4-42a7-4b3b-b908-8fee3edce79d.pem"),
						http("MagentoStagingCheckout_184")
							.get(uri13 + "/9bd0ec19-9f61-45d1-a9f4-651e6aa64389.pem"),
						http("MagentoStagingCheckout_185")
							.get(uri13 + "/4f1be682-098d-49f8-847a-2e97ba0d6664.pem"),
						http("MagentoStagingCheckout_186")
							.get(uri13 + "/2abc860a-184c-44a8-bf59-1d7944bb5d53.pem"),
						http("MagentoStagingCheckout_187")
							.get(uri13 + "/1832952f-3c9a-4272-a2db-ab775ff3ba9a.pem"),
						http("MagentoStagingCheckout_188")
							.get(uri13 + "/ea564a05-4fe8-4a29-80f7-654f2556bb2f.pem"),
						http("MagentoStagingCheckout_189")
							.get(uri13 + "/d3347b17-b94e-45f9-adb5-c1e7f46dbe1a.pem"),
						http("MagentoStagingCheckout_190")
							.get(uri13 + "/8552425c-9a85-4a0d-87f7-a399778fd6a1.pem"),
						http("MagentoStagingCheckout_191")
							.get(uri13 + "/0ed5c801-2c4d-48d9-94a2-8d9ee4fac113.pem"),
						http("MagentoStagingCheckout_192")
							.get(uri13 + "/6a256fba-e9e4-4601-aae8-e2b182af1004.pem"),
						http("MagentoStagingCheckout_193")
							.get(uri13 + "/80aaf1b9-4d48-4741-878a-f0365618e4ee.pem"),
						http("MagentoStagingCheckout_194")
							.get(uri13 + "/6f4d4854-993d-42ab-936d-589d8c7fd633.pem"),
						http("MagentoStagingCheckout_195")
							.get(uri13 + "/6990bf85-33f3-4e45-a819-27baa0ed7dcb.pem"),
						http("MagentoStagingCheckout_196")
							.get(uri13 + "/ba8c84c3-980f-4037-b14c-94376e7b03bb.pem"),
						http("MagentoStagingCheckout_197")
							.get(uri13 + "/42ae12a4-891d-4378-9294-402edf206c8a.pem"),
						http("MagentoStagingCheckout_198")
							.get(uri13 + "/e1726c6f-ef28-402b-8fff-6483282d9d46.pem"),
						http("MagentoStagingCheckout_199")
							.get(uri13 + "/83d21c1d-10ab-4e46-bf38-819c48ff2404.pem"),
						http("MagentoStagingCheckout_200")
							.get(uri13 + "/fa682884-2292-47c8-a500-4e4beb74c713.pem"),
						http("MagentoStagingCheckout_201")
							.get(uri13 + "/c8a7b9b0-8f05-4b97-9a06-4574dd572bfd.pem"),
						http("MagentoStagingCheckout_202")
							.get(uri13 + "/5eb3ad80-1144-42a3-af11-434720be7e64.pem"),
						http("MagentoStagingCheckout_203")
							.get(uri13 + "/344a5e74-d46d-4e1a-8583-4ba2bf01266b.pem"),
						http("MagentoStagingCheckout_204")
							.get(uri13 + "/e8b1027d-2d4b-46c5-bf92-00250d797fd2.pem"),
						http("MagentoStagingCheckout_205")
							.get(uri13 + "/1afbe1af-f8e7-46a2-af62-d860d9a88f52.pem"),
						http("MagentoStagingCheckout_206")
							.get(uri13 + "/74cb91dc-36c9-4327-be47-a93ba723e8f1.pem"),
						http("MagentoStagingCheckout_207")
							.get(uri13 + "/574974a6-a030-41c2-9c31-232b65806e3d.pem"),
						http("MagentoStagingCheckout_208")
							.get(uri13 + "/e700f794-add6-44ac-a42f-64c7a1a59e52.pem"),
						http("MagentoStagingCheckout_209")
							.get(uri13 + "/5e17dcf5-8ff9-4507-9382-c061723f418f.pem"),
						http("MagentoStagingCheckout_210")
							.get(uri13 + "/9871a9c6-3ac2-4665-bc5e-c1a1b1808ce5.pem"),
						http("MagentoStagingCheckout_211")
							.get(uri13 + "/e00fb0a2-59bb-4271-8c25-6dbc972240be.pem"),
						http("MagentoStagingCheckout_212")
							.get(uri13 + "/a6c6e949-5b55-4dab-af94-7e76187fb058.pem"),
						http("MagentoStagingCheckout_213")
							.get(uri13 + "/123801d6-cd2b-4133-b019-d9d0b8906249.pem"),
						http("MagentoStagingCheckout_214")
							.get(uri13 + "/f5f73cb5-53fb-4dc9-8de0-799355a73b83.pem"),
						http("MagentoStagingCheckout_215")
							.get(uri13 + "/37f7d2de-08d5-4779-82aa-7a2c73ea2a44.pem"),
						http("MagentoStagingCheckout_216")
							.get(uri13 + "/f4afcf07-a21b-4755-9284-d1a24e799599.pem"),
						http("MagentoStagingCheckout_217")
							.get(uri13 + "/ded24520-477f-44ea-83f8-eb90ef04f7c3.pem"),
						http("MagentoStagingCheckout_218")
							.get(uri13 + "/b9704b06-1ec3-48df-a945-6a1ac4feb504.pem"),
						http("MagentoStagingCheckout_219")
							.get(uri13 + "/f5e45e23-a396-4d9b-81ad-81872ad1f34e.pem"),
						http("MagentoStagingCheckout_220")
							.get(uri13 + "/c1c15a8a-89a6-4ebe-b0fe-43912ef6032c.pem"),
						http("MagentoStagingCheckout_221")
							.get(uri13 + "/d36a1d9e-0533-432a-858f-28d514ac308a.pem"),
						http("MagentoStagingCheckout_222")
							.get(uri13 + "/6898fa3f-df08-4938-9d52-ac1301887dee.pem"),
						http("MagentoStagingCheckout_223")
							.get(uri13 + "/31f5c5f2-4af7-48ff-b316-cda3bc1e3a86.pem"),
						http("MagentoStagingCheckout_224")
							.get(uri13 + "/a19ddf6a-3fa5-4ca1-9514-0de02dfba270.pem"),
						http("MagentoStagingCheckout_225")
							.get(uri13 + "/0ee86d74-2264-4445-9962-37cb38e10eba.pem"),
						http("MagentoStagingCheckout_226")
							.get(uri13 + "/c90caf8d-c662-4da4-8134-cfd4015c0a18.pem"),
						http("MagentoStagingCheckout_227")
							.get(uri13 + "/82ad1928-1b21-4c0d-ba0a-c3f04d6691cf.pem"),
						http("MagentoStagingCheckout_228")
							.get(uri13 + "/892d6fee-d598-40c5-b576-bdcc9dfd4da9.pem"),
						http("MagentoStagingCheckout_229")
							.get(uri13 + "/de848dac-a9bf-4394-bfa1-c6d0cbc7e7aa.pem"),
						http("MagentoStagingCheckout_230")
							.get(uri13 + "/2b171036-fe0f-4e2e-8c6c-6c5d2ae05ec2.pem"),
						http("MagentoStagingCheckout_231")
							.get(uri13 + "/b4e53e0c-c9c5-4e85-974f-e0b929e9fd6c.pem"),
						http("MagentoStagingCheckout_232")
							.get(uri13 + "/dbb932b4-4ba6-4905-8d5b-36ce0ce45fdf.pem"),
						http("MagentoStagingCheckout_233")
							.get(uri13 + "/d1efd85e-3ff0-45b0-985a-ccc72cf22681.pem"),
						http("MagentoStagingCheckout_234")
							.get(uri13 + "/a79140b4-b597-4021-b12a-e83c7b03a7e0.pem"),
						http("MagentoStagingCheckout_235")
							.get(uri13 + "/e57c059f-1433-4bef-be02-7c2853c02e39.pem"),
						http("MagentoStagingCheckout_236")
							.get(uri13 + "/a7ae80a7-e4d4-4541-9cc9-8b769be2aa25.pem"),
						http("MagentoStagingCheckout_237")
							.get(uri13 + "/0f5dca79-77d5-4e57-9ded-eb0296cc5f08.pem"),
						http("MagentoStagingCheckout_238")
							.get(uri13 + "/392dde21-5898-426e-8edf-cc64705bb392.pem"),
						http("MagentoStagingCheckout_239")
							.get(uri13 + "/e5db7020-56f7-43f9-8bdc-b6fb5beb05f0.pem"),
						http("MagentoStagingCheckout_240")
							.get(uri13 + "/eb4585d2-605a-4209-80f9-4308e8bf7615.pem"),
						http("MagentoStagingCheckout_241")
							.get(uri13 + "/d02fccc9-29c4-4e68-ac7e-289a1c4f2646.pem"),
						http("MagentoStagingCheckout_242")
							.get(uri13 + "/d214313c-2c07-451b-94e8-7dbee799c732.pem"),
						http("MagentoStagingCheckout_243")
							.get(uri13 + "/bdb18db5-baa5-4afb-bcee-6572e265ac54.pem"),
						http("MagentoStagingCheckout_244")
							.get(uri13 + "/6f17542f-0862-4b4c-bd9e-61d087176b6f.pem"),
						http("MagentoStagingCheckout_245")
							.get(uri13 + "/e9b3e5ee-f4ff-49fd-b9c6-01ec78d0904e.pem"),
						http("MagentoStagingCheckout_246")
							.get(uri13 + "/a29c2d7b-309b-44d0-ba7a-c11462329847.pem"),
						http("MagentoStagingCheckout_247")
							.get(uri13 + "/0d6374c9-7df8-4ea3-be69-7cde3004cd70.pem"),
						http("MagentoStagingCheckout_248")
							.get(uri13 + "/8a73e808-7742-4d23-9a50-c14486e07a38.pem"),
						http("MagentoStagingCheckout_249")
							.get(uri13 + "/5de7523f-012d-4543-977c-16c8b5515537.pem"),
						http("MagentoStagingCheckout_250")
							.get(uri13 + "/914c5709-fa4c-4ee4-801b-22c15a99794b.pem"),
						http("MagentoStagingCheckout_251")
							.get(uri13 + "/fffcaf3e-173f-4e58-b6c4-9954f5874559.pem"),
						http("MagentoStagingCheckout_252")
							.get(uri13 + "/b858d60f-3ca5-4fdd-86c1-8a9bc1000265.pem"),
						http("MagentoStagingCheckout_253")
							.get(uri13 + "/c8e2980f-815f-4879-9c7e-f9d84c1fd47b.pem"),
						http("MagentoStagingCheckout_254")
							.get(uri13 + "/b322bb82-2e3e-48e2-b724-46d1664fa215.pem"),
						http("MagentoStagingCheckout_255")
							.get(uri13 + "/74862fd2-95cc-4411-a050-d6c15e4aef8e.pem"),
						http("MagentoStagingCheckout_256")
							.get(uri13 + "/2447579c-7381-4838-98b1-092d7fbb77b9.pem"),
						http("MagentoStagingCheckout_257")
							.get(uri13 + "/236c158b-c5a5-42b7-834f-a6971d3a9a6c.pem"),
						http("MagentoStagingCheckout_258")
							.get(uri13 + "/b7cb3a37-7a14-4834-9256-4f3a8c13464d.pem"),
						http("MagentoStagingCheckout_259")
							.get(uri13 + "/222659da-eaa4-4d2f-9944-3ac1302917d4.pem"),
						http("MagentoStagingCheckout_260")
							.get(uri13 + "/7bdfffc3-1318-4691-925e-5d45e5a020fb.pem"),
						http("MagentoStagingCheckout_261")
							.get(uri13 + "/8c201a5e-c007-4f98-a04e-1d1c78f3cd67.pem"),
						http("MagentoStagingCheckout_262")
							.get(uri13 + "/809dba30-10bc-4d8d-b56a-29fdf6788399.pem"),
						http("MagentoStagingCheckout_263")
							.get(uri13 + "/48a58248-145a-44ef-ba2d-f16365b382c1.pem"),
						http("MagentoStagingCheckout_264")
							.get(uri13 + "/9707c48f-2459-4eb3-af34-9a6117bf3acd.pem"),
						http("MagentoStagingCheckout_265")
							.get(uri13 + "/bc422e30-23d5-4938-a031-bb9a6fe843c3.pem"),
						http("MagentoStagingCheckout_266")
							.get(uri13 + "/8acfb92a-ce66-4fb5-b98b-4972b2012e02.pem"),
						http("MagentoStagingCheckout_267")
							.get(uri13 + "/c639b3c1-42b9-422e-8f48-62642aa622f9.pem"),
						http("MagentoStagingCheckout_268")
							.get(uri13 + "/ac8b73dd-ac40-47b4-a020-54af6476b3e0.pem"),
						http("MagentoStagingCheckout_269")
							.get(uri13 + "/a9ae902f-c3a6-4b83-90e4-199315549754.pem"),
						http("MagentoStagingCheckout_270")
							.get(uri13 + "/9b49edfd-dece-427f-8aba-caae8761ff35.pem"),
						http("MagentoStagingCheckout_271")
							.get(uri13 + "/9bda82e3-aac5-4a12-a32c-f86a4fc1ca14.pem"),
						http("MagentoStagingCheckout_272")
							.get(uri13 + "/88d23cac-0c26-4cca-b24c-35d8d0c41f4f.pem"),
						http("MagentoStagingCheckout_273")
							.get(uri13 + "/f5157a19-89e9-4513-9b51-b540e430b34c.pem"),
						http("MagentoStagingCheckout_274")
							.get(uri13 + "/6ef0f203-a563-43fa-8eba-9b978890ca68.pem"),
						http("MagentoStagingCheckout_275")
							.get(uri13 + "/78f35f2c-2c84-4b7f-8b17-716623a17152.pem"),
						http("MagentoStagingCheckout_276")
							.get(uri13 + "/441432be-55c0-46ef-8aee-774c46d271b5.pem"),
						http("MagentoStagingCheckout_277")
							.get(uri13 + "/ec7f598b-f515-484e-97cb-13fc44c18084.pem"),
						http("MagentoStagingCheckout_278")
							.get(uri13 + "/f8146028-6277-4a79-bf19-50421a39377d.pem"),
						http("MagentoStagingCheckout_279")
							.get(uri13 + "/572d6f2d-b30d-4163-bd99-c5b2a3b24fd0.pem"),
						http("MagentoStagingCheckout_280")
							.get(uri13 + "/60506d56-954a-4d3c-8106-85456bee44ae.pem"),
						http("MagentoStagingCheckout_281")
							.get(uri13 + "/75274961-d604-4b68-aa51-f26cb649f620.pem"),
						http("MagentoStagingCheckout_282")
							.get(uri13 + "/f5b72560-0bb5-40bd-b68b-381a9e82b9e3.pem"),
						http("MagentoStagingCheckout_283")
							.get(uri13 + "/dc9f41f5-9c11-43dd-a15f-f7fba5a1a776.pem"),
						http("MagentoStagingCheckout_284")
							.get(uri13 + "/14e535bf-efc4-4fe6-99cd-b5c7d47c085a.pem"),
						http("MagentoStagingCheckout_285")
							.get(uri13 + "/0e9184a5-0e70-46c1-b27e-ac8619519a7f.pem"),
						http("MagentoStagingCheckout_286")
							.get(uri13 + "/b7b43854-98bb-4b5c-b880-c57f5587e987.pem"),
						http("MagentoStagingCheckout_287")
							.get(uri13 + "/937213ad-b19a-4eb8-bda5-f8975330b585.pem"),
						http("MagentoStagingCheckout_288")
							.get(uri13 + "/9ccb25d3-e2a8-411b-852d-7e98a872c9a2.pem"),
						http("MagentoStagingCheckout_289")
							.get(uri13 + "/1f5cae22-4abd-412a-ad57-c2321cc25194.pem"),
						http("MagentoStagingCheckout_290")
							.get(uri13 + "/447b1fee-f5f3-4111-af3f-64b87505e0d7.pem"),
						http("MagentoStagingCheckout_291")
							.get(uri13 + "/dca168d0-9454-4b21-b712-c05956c90dd3.pem")))
				.pause(1)
		}

		// Checkout
		object CheckOut {
			val checkout= exec(http("MagentoStagingCheckout_292")
				.get(uri07 + "/in/checkout-subscription")
								.resources(http("MagentoStagingCheckout_293")
					.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
					,
					http("MagentoStagingCheckout_294")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
					http("MagentoStagingCheckout_295")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
						,
					http("MagentoStagingCheckout_296")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
						,
					http("MagentoStagingCheckout_297")
						.get(uri15 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fin%252Fcheckout%252Fcart%252Findex%252F%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fin%252Fcheckout-subscription%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
					http("MagentoStagingCheckout_298")
						.post(uri12 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABcVgYKWEZDSVQDEEdMXV0BBE8%3D&rst=79857&ck=1&ref=https://staging-mg.packtpub.com/in/checkout/cart/index/")
						.body(RawFileBody("computerdatabase/magentostagingcheckout/0298_request.txt")),
					http("MagentoStagingCheckout_299")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
						,
					http("MagentoStagingCheckout_300")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
						,
					http("MagentoStagingCheckout_301")
						.get(uri07 + "/in/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout-subscription&sections=&_=1619409609412")
						,
					http("MagentoStagingCheckout_302")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
						,
					http("MagentoStagingCheckout_303")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
						,
					http("MagentoStagingCheckout_304")
						.get(uri07 + "/in/packtgtm/ajax/customer/?_=1619409609413")
						,
					http("MagentoStagingCheckout_305")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
						,
					//http("MagentoStagingCheckout_306")
						//.post(https://staging-mg.packtpub.com/in//signon/ajax/signon/?email=jumpinjhapaak%40test.com)
						//.body(RawFileBody("computerdatabase/magentostagingcheckout/0306_request.json")),
					http("MagentoStagingCheckout_307")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
						,
					http("MagentoStagingCheckout_308")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/minicart/item/default.html")
						,
					http("MagentoStagingCheckout_309")
						.get(uri07 + "/in/packtgeoip/ajax/storebanner?sourceURL=/in/checkout-subscription&_=1619409609414")
						,
					http("MagentoStagingCheckout_310")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
						,
					http("MagentoStagingCheckout_311")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
						,
					http("MagentoStagingCheckout_312")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
						,
					http("MagentoStagingCheckout_313")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/minicart/subtotal.html")
						,
					http("MagentoStagingCheckout_314")
						.get("/h?a=3992788168&u=558546027102160&v=4508373688356596&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fin%2Fcheckout-subscription&d=staging-mg.packtpub.com&t=subscription%20in&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout%2Fcart%2Findex%2F&ts=1619409611875&pr=%2Fin%2Fcheckout%2Fcart%2Findex%2F&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619409611875")
						,
					http("MagentoStagingCheckout_315")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Catalog/template/product/image_with_borders.html")
						,
					http("MagentoStagingCheckout_316")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/minicart/item/price.html")
						,
					http("MagentoStagingCheckout_317")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/minicart/subtotal/totals.html")
						,
					http("MagentoStagingCheckout_318")
						.get(uri07 + "/in/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619409609415")
						,
					http("MagentoStagingCheckout_319")
						.get(uri14 + "?cmd=_dynamic-image&buttontype=ecshortcut&locale=en_GB")
						,
					http("MagentoStagingCheckout_320")
						.get(uri12 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoRVlRSSUELB0Q%3D&rst=7977&ck=1&ref=https://staging-mg.packtpub.com/in/checkout-subscription&ap=584&be=2212&fe=7941&dc=4460&perf=%7B%22timing%22:%7B%22of%22:1619409607102,%22n%22:0,%22f%22:-1,%22dn%22:-1,%22dne%22:-1,%22c%22:-1,%22s%22:-1,%22ce%22:-1,%22rq%22:3,%22rp%22:2163,%22rpe%22:2163,%22dl%22:2182,%22di%22:4433,%22ds%22:4459,%22de%22:4498,%22dc%22:7940,%22l%22:7940,%22le%22:7959%7D,%22navigation%22:%7B%7D%7D&fcp=4429&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
						//.check(status.is(500))
								))
				.pause(1)
				.exec(http("MagentoStagingCheckout_321")
					.get(uri07 + "/in/checkout?")
					.resources(http("MagentoStagingCheckout_322")
						.get(uri15 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fin%252Fcheckout-subscription%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fin%252Fcheckout%253F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
						http("MagentoStagingCheckout_323")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
							,
						http("MagentoStagingCheckout_324")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
							,
						http("MagentoStagingCheckout_325")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
							,
						http("MagentoStagingCheckout_326")
							.post(uri12 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoRVlRSSUELB0Q%3D&rst=12863&ck=1&ref=https://staging-mg.packtpub.com/in/checkout-subscription")

							.body(RawFileBody("computerdatabase/magentostagingcheckout/0326_request.txt")),
						http("MagentoStagingCheckout_327")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
							,
						http("MagentoStagingCheckout_328")
							.get(uri12 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABcVgYKWEZDSV4MBlYbG1oLBVJL&rst=3475&ck=1&ref=https://staging-mg.packtpub.com/in/checkout&ap=1144&be=2469&fe=3441&dc=3243&perf=%7B%22timing%22:%7B%22of%22:1619409617517,%22n%22:0,%22u%22:2444,%22ue%22:2451,%22f%22:1,%22dn%22:1,%22dne%22:1,%22c%22:1,%22s%22:1,%22ce%22:1,%22rq%22:5,%22rp%22:2435,%22rpe%22:2435,%22dl%22:2444,%22di%22:3237,%22ds%22:3243,%22de%22:3253,%22dc%22:3440,%22l%22:3440,%22le%22:3442%7D,%22navigation%22:%7B%7D%7D&fcp=3227&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
							,
						http("MagentoStagingCheckout_329")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
							,
						http("MagentoStagingCheckout_330")
							.get("/h?a=3992788168&u=558546027102160&v=5632684484350097&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fin%2Fcheckout&d=staging-mg.packtpub.com&t=Checkout&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout-subscription&ts=1619409621041&pr=%2Fin%2Fcheckout-subscription&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619409621042")
							))
				.pause(1)
				.exec(http("MagentoStagingCheckout_331")
					.get(uri07 + "/in/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1619409620394")
						.resources(http("MagentoStagingCheckout_332")
						.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
						,
						http("MagentoStagingCheckout_333")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/onepage.html")
							,
						http("MagentoStagingCheckout_334")
							.get(uri07 + "/in/packtgtm/ajax/customer/?_=1619409620395")
							,
						//http("MagentoStagingCheckout_335")
							//.post(https://staging-mg.packtpub.com/in//signon/ajax/signon/?email=jumpinjhapaak%40test.com)
							//.body(RawFileBody("computerdatabase/magentostagingcheckout/0335_request.json")),
						http("MagentoStagingCheckout_336")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
							,
						http("MagentoStagingCheckout_337")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
							))
				.pause(1)
				.exec(http("MagentoStagingCheckout_338")
					.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")

					.resources(http("MagentoStagingCheckout_339")
						.get(uri16 + "/recaptcha/api.js?onload=globalOnRecaptchaOnLoadCallback&render=explicit"),
						http("MagentoStagingCheckout_340")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
							,
						http("MagentoStagingCheckout_341")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
							,
						http("MagentoStagingCheckout_342")
							.get(uri07 + "/in/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619409620396")
							,
						http("MagentoStagingCheckout_343")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Customer/template/register-step-minimal.html")
							,
						http("MagentoStagingCheckout_344")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Checkout/template/payment.html")
							,
						http("MagentoStagingCheckout_345")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/sidebar.html")
							,
						http("MagentoStagingCheckout_346")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Customer/template/form/element/email.html")
							,
						http("MagentoStagingCheckout_347")
							.get(uri03 + "/api.js?onload=recaptchaCheckoutCallback&render=explicit"),
						http("MagentoStagingCheckout_348")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/payment-methods/list.html")
							,
						http("MagentoStagingCheckout_349")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/estimation.html")
							,
						http("MagentoStagingCheckout_350")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/summary.html")
							,
						http("MagentoStagingCheckout_351")
							.get(uri03 + "/api2/anchor?ar=1&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&co=aHR0cHM6Ly9zdGFnaW5nLW1nLnBhY2t0cHViLmNvbTo0NDM.&hl=en&v=dpzVjBAupwRfx3UzvXRnnAKb&size=invisible&cb=zd0kxegz0i0c")
							,
						http("MagentoStagingCheckout_352")
							.post(uri07 + "/in/rest/in/V1/carts/mine/estimate-shipping-methods")
							.body(RawFileBody("computerdatabase/magentostagingcheckout/0352_request.json")),
						http("MagentoStagingCheckout_353")
							.get(uri03 + "/api2/webworker.js?hl=en&v=dpzVjBAupwRfx3UzvXRnnAKb"),
						http("MagentoStagingCheckout_354")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/shipping.html")
							,
						http("MagentoStagingCheckout_355")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/summary/cart-items.html")
							,
						http("MagentoStagingCheckout_356")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/summary/totals.html")
							,
						http("MagentoStagingCheckout_357")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_SalesRule/template/payment/discount.html")
							,
						http("MagentoStagingCheckout_358")
							.get(uri03 + "/api2/bframe?hl=en&v=dpzVjBAupwRfx3UzvXRnnAKb&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_&cb=k8oe18iufbmg")
							,
						http("MagentoStagingCheckout_359")
							.post(uri03 + "/api2/reload?k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_")

							.body(RawFileBody("computerdatabase/magentostagingcheckout/0359_request.dat")),
						http("MagentoStagingCheckout_360")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/shipping-information.html")
							,
						http("MagentoStagingCheckout_361")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/shipping-address/form.html")
							,
						http("MagentoStagingCheckout_362")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/summary/item/details.html")
							,
						http("MagentoStagingCheckout_363")
							.get(uri03 + "/api2/payload?p=06AGdBq24IsvMkT_PKxz1bumZEzWDprqxgkz1NtbfDlI1HfWqG5AJ2OXvTC_vwzRZNOYPCTQy-AnKPjsmNrRLdV-u8ZZwldMcqmrUSAfKYzgn-eA39zfBjJNY5hgI84O1Rm1RVsqBGB7eAMqSdaG5WLmMUf6YgZP6TpFJehcUdV41eIHiH3fOFtOVh-RKDbOjvjIw_enqw16cC&k=6LeAHSgUAAAAAKsn5jo6RUSTLVxGNYyuvUcLMe0_")
							,
						http("MagentoStagingCheckout_364")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/summary/subtotal.html")
							,
						http("MagentoStagingCheckout_365")
							.get("/h?a=3992788168&u=558546027102160&v=2874249857808365&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&g=%23userDetails&h=%2Fin%2Fcheckout&d=staging-mg.packtpub.com&t=Checkout&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout-subscription&ts=1619409640688&pr=%2Fin%2Fcheckout&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619409640689")
							,
						http("MagentoStagingCheckout_366")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Vertex_AddressValidation/template/checkout/address-messages.html")
							,
						http("MagentoStagingCheckout_367")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Amasty_Rules/template/summary/discount-breakdown.html")
							,
						http("MagentoStagingCheckout_368")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_GiftWrapping/template/summary/totals.html")
							,
						http("MagentoStagingCheckout_369")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_SalesRule/template/summary/discount.html")
							,
						http("MagentoStagingCheckout_370")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Shipping/template/checkout/shipping/shipping-policy.html")
							,
						http("MagentoStagingCheckout_371")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Reward/template/summary/reward.html")
							,
						http("MagentoStagingCheckout_372")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_GiftCardAccount/template/summary/gift-card-account.html")
							,
						http("MagentoStagingCheckout_373")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/summary/shipping.html")
							,
						http("MagentoStagingCheckout_374")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/summary/tax.html")
							,
						http("MagentoStagingCheckout_375")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Vertex_Tax/template/checkout/cart/totals/tax-messages.html")
							,
						http("MagentoStagingCheckout_376")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/summary/grand-total.html")
							,
						http("MagentoStagingCheckout_377")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/shipping-address/list.html")
							,
						http("MagentoStagingCheckout_378")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Weee/template/checkout/summary/weee.html")
							,
						http("MagentoStagingCheckout_379")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/form/field.html")
							,
						http("MagentoStagingCheckout_380")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/progress-bar.html")
							,
						http("MagentoStagingCheckout_381")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/group/group.html")
							,
						http("MagentoStagingCheckout_382")
							.get(uri07 + "/in/rest/in/V1/carts/mine/payment-information?_=1619409620397")
							,
						http("MagentoStagingCheckout_383")
							.get(uri07 + "/in/rest/in/V1/carts/mine/payment-information?_=1619409620398")
							,
						http("MagentoStagingCheckout_384")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/summary/item/details/thumbnail.html")
							,
						http("MagentoStagingCheckout_385")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Tax/template/checkout/summary/item/details/subtotal.html")
							,
						http("MagentoStagingCheckout_386")
							.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&g=%23payment&h=%2Fin%2Fcheckout&d=staging-mg.packtpub.com&t=Checkout&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout-subscription&ts=1619409640698&pr=%2Fin%2Fcheckout&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619409640698")
							,
						http("MagentoStagingCheckout_387")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/form/element/select.html")
							,
						http("MagentoStagingCheckout_388")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/form/element/input.html")
							,
						http("MagentoStagingCheckout_389")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Weee/template/checkout/summary/item/price/row_incl_tax.html")
							,
						http("MagentoStagingCheckout_390")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Checkout/template/payment/direct-cc.html")
							,
						http("MagentoStagingCheckout_391")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Paypal/template/payment/paypal-express.html")
							,
						http("MagentoStagingCheckout_392")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Checkout/template/billing-address.html")
							,
						http("MagentoStagingCheckout_393")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Checkout/template/payment/cc-form.html")
							,
						http("MagentoStagingCheckout_394")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/payment/before-place-order.html")
							,
						http("MagentoStagingCheckout_395")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Paypal/template/payment/express/billing-agreement.html")
							,
						http("MagentoStagingCheckout_396")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Checkout/template/billing-address/list.html")
							,
						http("MagentoStagingCheckout_397")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Checkout/template/billing-address/form.html")
							,
						http("MagentoStagingCheckout_398")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_GiftCardAccount/template/payment/gift-card-information.html")
							,
						http("MagentoStagingCheckout_399")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_CheckoutAgreements/template/checkout/checkout-agreements.html")
							,
						http("MagentoStagingCheckout_400")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/form/element/helper/tooltip.html")
							,
						http("MagentoStagingCheckout_401")
							.post(uri02 + "?v=1&_v=j90&a=1779869799&t=event&ni=0&_s=1&dl=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout&dp=%2Fin%2Fcheckout&ul=en-us&de=UTF-8&dt=Checkout&sd=24-bit&sr=1280x1024&vp=1263x910&je=0&ec=Ecommerce&ea=Checkout%20Step%202%20-%20Review%20%26%20Payments&_u=SCCAAEALAAAAAC~&jid=528959458&gjid=1106761027&cid=1010921333.1617965825&tid=UA-284627-1&_gid=1581369720.1619409320&_r=1&gtm=2wg4e1KHLZ7JF&cg2=India&cg3=Store&cg4=No%20Content%20Grouping&cd1=d12c50a2-843a-43de-96ba-360e39c985a4&cd3=1619409640680.h7s4u7qa&cd4=2021-04-26T09%3A30%3A40.680%2B05%3A30&cd12=Logged%20In&cd2=1010921333.1617965825&cos=2&pa=checkout&z=1507701425")
							,
						http("MagentoStagingCheckout_402")
							.post(uri04 + "?t=dc&aip=1&_r=3&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=528959458&gjid=1106761027&_gid=1581369720.1619409320&_u=SCCAAEAKAAAAAC~&z=352176391")
							,
						http("MagentoStagingCheckout_403")
							.get(uri16 + "/ads/ga-audiences?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=528959458&_u=SCCAAEAKAAAAAC~&z=1889281574")
							,
						http("MagentoStagingCheckout_404")
							.get(uri18 + "?t=sr&aip=1&_r=4&slf_rd=1&v=1&_v=j90&tid=UA-284627-1&cid=1010921333.1617965825&jid=528959458&_u=SCCAAEAKAAAAAC~&z=1889281574")
							))
				.pause(1)
				.exec(http("MagentoStagingCheckout_405")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=1806449019423499&t0=click&n0=span&y0=%40main%3B%23maincontent%3B.page-main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.columns%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.column%3B.main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%23checkout%3B.checkout-container%3B%5Bdata-bind%3Dscope%3A%27checkout%27%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.opc-wrapper%3B%7C%40ol%3B%23checkoutSteps%3B.opc%3B%7C%40li%3B%23payment%3B.checkout-payment-method%3B%5Bdata-bind%3DfadeVisible%3A%20isVisible%5D%3B%5Brole%3Dpresentation%5D%3B%7C%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.choice%3B.field%3B.payment-method-title%3B%7C%40label%3B.label%3B%5Bdata-bind%3Dattr%3A%20%7B%27for%27%3A%20getCode()%7D%5D%3B%5Bfor%3Dworldpay_cc%5D%3B%7C%40span%3B%5Bdata-bind%3Dtext%3A%20getTitle()%5D%3B%7C&ts0=1619409656105&x0=Debit%20%2F%20Credit%20Cards&id1=62361605814672&t1=click&n1=input&c1=radio&i1=worldpay_cc&y1=%40div%3B.columns%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.column%3B.main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%23checkout%3B.checkout-container%3B%5Bdata-bind%3Dscope%3A%27checkout%27%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.opc-wrapper%3B%7C%40ol%3B%23checkoutSteps%3B.opc%3B%7C%40li%3B%23payment%3B.checkout-payment-method%3B%5Bdata-bind%3DfadeVisible%3A%20isVisible%5D%3B%5Brole%3Dpresentation%5D%3B%7C%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.choice%3B.field%3B.payment-method-title%3B%7C%40input%3B%23worldpay_cc%3B.radio%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%7D%2C%20value%3A%20getCode()%2C%20checked%3A%20isChecked%2C%20click%3A%20selectPaymentMethod%2C%20visible%3A%20isRadioButtonVisible()%5D%3B%5Bname%3Dpaymentmethod%5D%3B%5Btype%3Dradio%5D%3B%7C&ts1=1619409656131&st=1619409657220")

					.resources(http("MagentoStagingCheckout_406")
						.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=1253344139336106&t0=change&n0=input&c0=radio&i0=worldpay_cc&y0=%40div%3B.column%3B.main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%23checkout%3B.checkout-container%3B%5Bdata-bind%3Dscope%3A%27checkout%27%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.opc-wrapper%3B%7C%40ol%3B%23checkoutSteps%3B.opc%3B%7C%40li%3B%23payment%3B.checkout-payment-method%3B%5Bdata-bind%3DfadeVisible%3A%20isVisible%5D%3B%5Brole%3Dpresentation%5D%3B%7C%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.choice%3B.field%3B.payment-method-title%3B%7C%40input%3B%23worldpay_cc%3B.radio%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%7D%2C%20value%3A%20getCode()%2C%20checked%3A%20isChecked%2C%20click%3A%20selectPaymentMethod%2C%20visible%3A%20isRadioButtonVisible()%5D%3B%5Bname%3Dpaymentmethod%5D%3B%5Btype%3Dradio%5D%3B%7C&ts0=1619409656168&st=1619409657245")
						))
				.pause(1)
				.exec(http("MagentoStagingCheckout_407")
					.get(uri17 + "/?guid=default-theme%40mozilla.org%2Cfirefox-compact-light%40mozilla.org%2Cfirefox-compact-dark%40mozilla.org%2Cfirefox-alpenglow%40mozilla.org%2Cgoogle%40search.mozilla.org%2Camazondotcom%40search.mozilla.org%2Cwikipedia%40search.mozilla.org%2Cbing%40search.mozilla.org%2Cddg%40search.mozilla.org&lang=en-US")
					.resources(http("MagentoStagingCheckout_408")
						.get(uri05)
						))
				.pause(1)
				.exec(http("MagentoStagingCheckout_409")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=8984215924126223&t0=click&n0=input&c0=input-text&i0=BDW08WV&y0=%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40div%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.city%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23BDW08WV%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dcity%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409665528&st=1619409667251")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_410")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=4094643775132020&t0=change&n0=input&c0=input-text&i0=BDW08WV&y0=%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40div%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.city%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23BDW08WV%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dcity%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409671697&st=1619409673281")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_411")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=7320461550759516&t0=change&n0=select&c0=select&i0=ELW1UOB&y0=%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40div%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.region_id%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40select%3B%23ELW1UOB%3B.select%3B%5Baria-invalid%3Dfalse%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dregion_id%5D%3B%7C&ts0=1619409675729&st=1619409677303")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_412")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=6190305700567884&t0=change&n0=input&c0=input-text&i0=WYQR81G&y0=%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40div%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.postcode%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23WYQR81G%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dpostcode%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409680548&st=1619409681328")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_413")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=7257319764606278&t0=click&n0=span&y0=%40div%3B.opc-wrapper%3B%7C%40ol%3B%23checkoutSteps%3B.opc%3B%7C%40li%3B%23payment%3B.checkout-payment-method%3B%5Bdata-bind%3DfadeVisible%3A%20isVisible%5D%3B%5Brole%3Dpresentation%5D%3B%7C%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.actions-toolbar%3B%7C%40div%3B.primary%3B%7C%40button%3B%23packt-wp-cc-ctp%3B.action%3B.action-update%3B.primary%3B%5Bdata-bind%3Dclick%3A%20updateAddress%2C%20visible%3A%20!isAddressSameAsShipping()%5D%3B%5Btype%3Dbutton%5D%3B%7C%40span%3B%5Bdata-bind%3Di18n%3A%20%27Save%20billing%20address%27%5D%3B%7C&ts0=1619409686733&x0=Save%20billing%20address&st=1619409687363")

					.resources(http("MagentoStagingCheckout_414")
						.post(uri07 + "/in/rest/in/V1/carts/mine/billing-address")

						.body(RawFileBody("computerdatabase/magentostagingcheckout/0414_request.json"))
						//.check(status.is(400))
						,
						http("MagentoStagingCheckout_415")
							.get(uri07 + "/in/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619409620399")
							))
				.pause(1)
				.exec(http("MagentoStagingCheckout_416")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=2138736759542809&t0=click&n0=input&c0=input-text&i0=J6CXJ7W&y0=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B._error%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.0%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23J6CXJ7W%3B.input-text%3B%5Baria-describedby%3Derror-J6CXJ7W%5D%3B%5Baria-invalid%3Dtrue%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet0%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409692710&st=1619409693401")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_417")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=1465806084776310&t0=change&n0=input&c0=input-text&i0=J6CXJ7W&y0=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.0%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23J6CXJ7W%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet0%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409695327&st=1619409695411")

					.resources(http("MagentoStagingCheckout_418")
						.post(uri07 + "/in/rest/in/V1/carts/mine/billing-address")

						.body(RawFileBody("computerdatabase/magentostagingcheckout/0418_request.json")),
						http("MagentoStagingCheckout_419")
							.post(uri07 + "/in/rest/in/V1/worldpay/payment/types")

							.body(RawFileBody("computerdatabase/magentostagingcheckout/0419_request.json")),
						http("MagentoStagingCheckout_420")
							.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=8091141447045846&t0=click&n0=span&y0=%40div%3B.opc-wrapper%3B%7C%40ol%3B%23checkoutSteps%3B.opc%3B%7C%40li%3B%23payment%3B.checkout-payment-method%3B%5Bdata-bind%3DfadeVisible%3A%20isVisible%5D%3B%5Brole%3Dpresentation%5D%3B%7C%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.actions-toolbar%3B%7C%40div%3B.primary%3B%7C%40button%3B%23packt-wp-cc-ctp%3B.action%3B.action-update%3B.primary%3B%5Bdata-bind%3Dclick%3A%20updateAddress%2C%20visible%3A%20!isAddressSameAsShipping()%5D%3B%5Btype%3Dbutton%5D%3B%7C%40span%3B%5Bdata-bind%3Di18n%3A%20%27Save%20billing%20address%27%5D%3B%7C&ts0=1619409695428&x0=Save%20billing%20address&st=1619409697428")
							,
						http("MagentoStagingCheckout_421")
							.get(uri07 + "/in/rest/in/V1/carts/mine/payment-information?_=1619409620400")
							,
						http("MagentoStagingCheckout_422")
							.get(uri07 + "/in/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619409620402")
							,
						http("MagentoStagingCheckout_423")
							.get(uri07 + "/in/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619409620401")
						))
				.pause(1)
				.exec(http("MagentoStagingCheckout_424")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=4242585473453725&t0=click&n0=input&c0=input-text&i0=J6CXJ7W&y0=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.0%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23J6CXJ7W%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet0%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409706484&st=1619409707484")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_425")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=6999284818949146&t0=click&n0=input&c0=input-text&i0=UPS9GHQ&y0=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B.additional%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.1%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23UPS9GHQ%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet1%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409707532&id1=1859772187839276&t1=change&n1=input&c1=input-text&i1=UPS9GHQ&y1=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B.additional%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.1%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23UPS9GHQ%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet1%5D%3B%5Btype%3Dtext%5D%3B%7C&ts1=1619409708731&st=1619409709488")

					.resources(http("MagentoStagingCheckout_426")
						.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=2004968626715049&t0=click&n0=input&c0=input-text&i0=MOWCDV3&y0=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B.additional%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.2%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23MOWCDV3%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet2%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409708836&st=1619409709504")
						))
				.pause(1)
				.exec(http("MagentoStagingCheckout_427")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=6323040891987661&t0=change&n0=input&c0=input-text&i0=MOWCDV3&y0=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B.additional%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.2%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23MOWCDV3%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet2%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409710314&id1=1964614879272638&t1=click&n1=input&c1=input-text&i1=J6CXJ7W&y1=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.0%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23J6CXJ7W%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet0%5D%3B%5Btype%3Dtext%5D%3B%7C&ts1=1619409710420&st=1619409711503")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_428")
					.post(uri07 + "/in/rest/in/V1/carts/mine/billing-address")

					.body(RawFileBody("computerdatabase/magentostagingcheckout/0428_request.json"))
					.resources(http("MagentoStagingCheckout_429")
						.get(uri07 + "/in/rest/in/V1/carts/mine/payment-information?_=1619409620403")
						,
						http("MagentoStagingCheckout_430")
							.get(uri07 + "/in/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619409620404")
							,
						http("MagentoStagingCheckout_431")
							.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=2630409453133242&t0=change&n0=input&c0=input-text&i0=J6CXJ7W&y0=%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.billing-address-form%3B%5Bdata-bind%3DfadeVisible%3A%20isAddressFormVisible%20%26%26%20!isAddressSameAsShipping()%5D%3B%7C%40form%3B%5Bdata-bind%3Dattr%3A%20%7B%27data-hasrequired%27%3A%20%24t(%27*%20Required%20Fields%27)%7D%5D%3B%5Bdata-hasrequired%3D*%20Required%20Fields%5D%3B%7C%40fieldset%3B%23billing-new-address-form-worldpay_cc-form%3B.address%3B.billing-new-address-form%3B.fieldset%3B%5Bdata-bind%3Dattr%3A%20%7B%20id%3A%27billing-new-address-form-%27%2Bindex%2C%20value%3Aindex%7D%5D%3B%5Bvalue%3Dworldpay_cc-form%5D%3B%7C%40fieldset%3B.admin__control-fields%3B.field%3B.required%3B.street%3B%5Bdata-bind%3Dcss%3A%20additionalClasses%5D%3B%7C%40div%3B.control%3B%7C%40div%3B._required%3B.field%3B%5Bdata-bind%3Dvisible%3A%20visible%2C%20attr%3A%20%7B%27name%27%3A%20element.dataScope%7D%2C%20css%3A%20additionalClasses%5D%3B%5Bname%3DbillingAddressworldpay_cc.street.0%5D%3B%7C%40div%3B.control%3B%5Bdata-bind%3Dcss%3A%20%7B%27_with-tooltip%27%3A%20element.tooltip%7D%5D%3B%7C%40input%3B%23J6CXJ7W%3B.input-text%3B%5Baria-invalid%3Dfalse%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bdata-bind%3D%5D%3B%5Bname%3Dstreet0%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409717947&id1=5084573354026658&t1=click&n1=span&y1=%40div%3B.opc-wrapper%3B%7C%40ol%3B%23checkoutSteps%3B.opc%3B%7C%40li%3B%23payment%3B.checkout-payment-method%3B%5Bdata-bind%3DfadeVisible%3A%20isVisible%5D%3B%5Brole%3Dpresentation%5D%3B%7C%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-billing-address%3B%7C%40div%3B.checkout-billing-address%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B.actions-toolbar%3B%7C%40div%3B.primary%3B%7C%40button%3B%23packt-wp-cc-ctp%3B.action%3B.action-update%3B.primary%3B%5Bdata-bind%3Dclick%3A%20updateAddress%2C%20visible%3A%20!isAddressSameAsShipping()%5D%3B%5Btype%3Dbutton%5D%3B%7C%40span%3B%5Bdata-bind%3Di18n%3A%20%27Save%20billing%20address%27%5D%3B%7C&ts1=1619409718020&x1=Save%20billing%20address&st=1619409719546")
						))
				.pause(1)
				.exec(http("MagentoStagingCheckout_432")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=1875278287230928&t0=click&n0=input&c0=input-text&i0=worldpay_cc_cc_name&y0=%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-cc-form%3B%7C%40form%3B%23worldpay_cc-form%3B.form%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%20%2B%20%27-form%27%7D%5D%3B%7C%40fieldset%3B%23payment_form_worldpay_cc%3B.ccard%3B.fieldset%3B.items%3B.payment%3B.worldpay_cc%3B%5Bdata-bind%3Dattr%3A%20%7Bclass%3A%20%27fieldset%20payment%20items%20ccard%20%27%20%2B%20getCode()%2C%20id%3A%20%27payment_form_%27%20%2B%20getCode()%7D%5D%3B%7C%40div%3B.field%3B.name%3B.required%3B%7C%40div%3B.control%3B%7C%40input%3B%23worldpay_cc_cc_name%3B.input-text%3B%5Bautocomplete%3D%5D%3B%5Bdata-bind%3D%5D%3B%5Bdata-container%3Dworldpay_cc-cc-Name%5D%3B%5Bdata-validate%3D%7B%22required%22%3Atrue%7D%5D%3B%5Bname%3Dpaymentcc_name%5D%3B%5Btitle%3DCard%20Holder%20Name%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409746736&st=1619409747690")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_433")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=1400325994545159&t0=change&n0=input&c0=input-text&i0=worldpay_cc_cc_name&y0=%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-cc-form%3B%7C%40form%3B%23worldpay_cc-form%3B.form%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%20%2B%20%27-form%27%7D%5D%3B%7C%40fieldset%3B%23payment_form_worldpay_cc%3B.ccard%3B.fieldset%3B.items%3B.payment%3B.worldpay_cc%3B%5Bdata-bind%3Dattr%3A%20%7Bclass%3A%20%27fieldset%20payment%20items%20ccard%20%27%20%2B%20getCode()%2C%20id%3A%20%27payment_form_%27%20%2B%20getCode()%7D%5D%3B%7C%40div%3B.field%3B.name%3B.required%3B%7C%40div%3B.control%3B%7C%40input%3B%23worldpay_cc_cc_name%3B.input-text%3B%5Bautocomplete%3D%5D%3B%5Bdata-bind%3D%5D%3B%5Bdata-container%3Dworldpay_cc-cc-Name%5D%3B%5Bdata-validate%3D%7B%22required%22%3Atrue%7D%5D%3B%5Bname%3Dpaymentcc_name%5D%3B%5Btitle%3DCard%20Holder%20Name%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409749790&st=1619409751706")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_434")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=6168576844466891&t0=change&n0=input&c0=input-text&i0=worldpay_cc_cc_number&y0=%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-cc-form%3B%7C%40form%3B%23worldpay_cc-form%3B.form%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%20%2B%20%27-form%27%7D%5D%3B%7C%40fieldset%3B%23payment_form_worldpay_cc%3B.ccard%3B.fieldset%3B.items%3B.payment%3B.worldpay_cc%3B%5Bdata-bind%3Dattr%3A%20%7Bclass%3A%20%27fieldset%20payment%20items%20ccard%20%27%20%2B%20getCode()%2C%20id%3A%20%27payment_form_%27%20%2B%20getCode()%7D%5D%3B%7C%40div%3B.field%3B.number%3B.required%3B%7C%40div%3B.control%3B%7C%40input%3B%23worldpay_cc_cc_number%3B.input-text%3B%5Bautocomplete%3D%5D%3B%5Bdata-bind%3D%5D%3B%5Bdata-container%3Dworldpay_cc-cc-number%5D%3B%5Bdata-validate%3D%7B%22required-number%22%3Atrue%2C%22worldpay-validate-number%22%3Atrue%2C%22worldpay-cardnumber-valid%22%3Atrue%7D%5D%3B%5Bname%3Dpaymentcc_number%5D%3B%5Btitle%3DCredit%20Card%20Number%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409753392&st=1619409753713")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_435")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=2331593762998161&t0=change&n0=select&c0=select%20select-month&i0=worldpay_cc_expiration&y0=%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-cc-form%3B%7C%40form%3B%23worldpay_cc-form%3B.form%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%20%2B%20%27-form%27%7D%5D%3B%7C%40fieldset%3B%23payment_form_worldpay_cc%3B.ccard%3B.fieldset%3B.items%3B.payment%3B.worldpay_cc%3B%5Bdata-bind%3Dattr%3A%20%7Bclass%3A%20%27fieldset%20payment%20items%20ccard%20%27%20%2B%20getCode()%2C%20id%3A%20%27payment_form_%27%20%2B%20getCode()%7D%5D%3B%7C%40div%3B%23worldpay_cc_cc_type_exp_div%3B.date%3B.field%3B.required%3B%5Bdata-bind%3Dattr%3A%20%7Bid%3A%20getCode()%20%2B%20%27_cc_type_exp_div%27%7D%5D%3B%7C%40div%3B.control%3B%7C%40div%3B.fields%3B.group%3B.group-2%3B%7C%40div%3B.field%3B.month%3B.no-label%3B%7C%40div%3B.control%3B%7C%40select%3B%23worldpay_cc_expiration%3B.select%3B.select-month%3B%5Bdata-bind%3D%5D%3B%5Bdata-container%3Dworldpay_cc-cc-month%5D%3B%5Bdata-validate%3D%7B%22required%22%3Atrue%2C%22validate-cc-exp%22%3A%22%23worldpay_cc_expiration_yr%22%7D%5D%3B%5Bname%3Dpaymentcc_exp_month%5D%3B%7C&ts0=1619409756109&st=1619409757723")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_436")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=3072650206924141&t0=change&n0=select&c0=select%20select-year&i0=worldpay_cc_expiration_yr&y0=%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-cc-form%3B%7C%40form%3B%23worldpay_cc-form%3B.form%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%20%2B%20%27-form%27%7D%5D%3B%7C%40fieldset%3B%23payment_form_worldpay_cc%3B.ccard%3B.fieldset%3B.items%3B.payment%3B.worldpay_cc%3B%5Bdata-bind%3Dattr%3A%20%7Bclass%3A%20%27fieldset%20payment%20items%20ccard%20%27%20%2B%20getCode()%2C%20id%3A%20%27payment_form_%27%20%2B%20getCode()%7D%5D%3B%7C%40div%3B%23worldpay_cc_cc_type_exp_div%3B.date%3B.field%3B.required%3B%5Bdata-bind%3Dattr%3A%20%7Bid%3A%20getCode()%20%2B%20%27_cc_type_exp_div%27%7D%5D%3B%7C%40div%3B.control%3B%7C%40div%3B.fields%3B.group%3B.group-2%3B%7C%40div%3B.field%3B.no-label%3B.year%3B%7C%40div%3B.control%3B%7C%40select%3B%23worldpay_cc_expiration_yr%3B.select%3B.select-year%3B%5Bdata-bind%3D%5D%3B%5Bdata-container%3Dworldpay_cc-cc-year%5D%3B%5Bdata-validate%3D%7B%22required%22%3Atrue%7D%5D%3B%5Bname%3Dpaymentcc_exp_year%5D%3B%7C&ts0=1619409759278&st=1619409759729")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_437")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=4628546358952337&t0=change&n0=input&c0=input-text%20cvv&i0=worldpay_cc_cc_cid&y0=%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-cc-form%3B%7C%40form%3B%23worldpay_cc-form%3B.form%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%20%2B%20%27-form%27%7D%5D%3B%7C%40fieldset%3B%23payment_form_worldpay_cc%3B.ccard%3B.fieldset%3B.items%3B.payment%3B.worldpay_cc%3B%5Bdata-bind%3Dattr%3A%20%7Bclass%3A%20%27fieldset%20payment%20items%20ccard%20%27%20%2B%20getCode()%2C%20id%3A%20%27payment_form_%27%20%2B%20getCode()%7D%5D%3B%7C%40div%3B%23worldpay_cc_cc_type_cvv_div%3B.cvv%3B.field%3B.required%3B%5Bdata-bind%3Dattr%3A%20%7Bid%3A%20getCode()%20%2B%20%27_cc_type_cvv_div%27%7D%5D%3B%7C%40div%3B._with-tooltip%3B.control%3B%7C%40input%3B%23worldpay_cc_cc_cid%3B.cvv%3B.input-text%3B%5Bautocomplete%3Doff%5D%3B%5Bdata-bind%3D%5D%3B%5Bdata-container%3Dworldpay_cc-cc-cvv%5D%3B%5Bdata-validate%3D%7B%22required-number%22%3Atrue%2C%22validate-card-cvv%22%3A%22%23worldpay_cc_cc_type%22%7D%5D%3B%5Bname%3Dpaymentcc_cid%5D%3B%5Btitle%3DCard%20Verification%20Number%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409763565&id1=8302276915301637&t1=click&n1=span&y1=%40div%3B.columns%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.column%3B.main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%23checkout%3B.checkout-container%3B%5Bdata-bind%3Dscope%3A%27checkout%27%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.opc-wrapper%3B%7C%40ol%3B%23checkoutSteps%3B.opc%3B%7C%40li%3B%23payment%3B.checkout-payment-method%3B%5Bdata-bind%3DfadeVisible%3A%20isVisible%5D%3B%5Brole%3Dpresentation%5D%3B%7C%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.actions-toolbar%3B%7C%40div%3B.primary%3B%7C%40button%3B%23checkout-payment-method-cc%3B.action%3B.checkout%3B.primary%3B%5Bdata-bind%3D%5D%3B%5Btitle%3DPay%20now%5D%3B%5Btype%3Dsubmit%5D%3B%7C%40span%3B%5Bdata-bind%3Dtext%3A%20%24t(%27Pay%20now%27)%5D%3B%7C&ts1=1619409763638&x1=Pay%20now&st=1619409763745")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_438")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=2963220647490912&t0=click&n0=input&c0=input-text%20mage-error&i0=worldpay_cc_cc_number&y0=%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-cc-form%3B%7C%40form%3B%23worldpay_cc-form%3B.form%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%20%2B%20%27-form%27%7D%5D%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B%23payment_form_worldpay_cc%3B.ccard%3B.fieldset%3B.items%3B.payment%3B.worldpay_cc%3B%5Bdata-bind%3Dattr%3A%20%7Bclass%3A%20%27fieldset%20payment%20items%20ccard%20%27%20%2B%20getCode()%2C%20id%3A%20%27payment_form_%27%20%2B%20getCode()%7D%5D%3B%7C%40div%3B.field%3B.number%3B.required%3B%7C%40div%3B.control%3B%7C%40input%3B%23worldpay_cc_cc_number%3B.input-text%3B.mage-error%3B%5Baria-describedby%3Dworldpay_cc_cc_number-error%5D%3B%5Baria-invalid%3Dtrue%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bautocomplete%3D%5D%3B%5Bdata-bind%3D%5D%3B%5Bdata-container%3Dworldpay_cc-cc-number%5D%3B%5Bdata-validate%3D%7B%22required-number%22%3Atrue%2C%22worldpay-validate-number%22%3Atrue%2C%22worldpay-cardnumber-valid%22%3Atrue%7D%5D%3B%5Bname%3Dpaymentcc_number%5D%3B%5Btitle%3DCredit%20Card%20Number%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409766629&st=1619409767772")
					)
				.pause(1)
				.exec(http("MagentoStagingCheckout_439")
					.get("/h?a=3992788168&u=558546027102160&v=712785461402040&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2Fin%2Fcheckout&pp=g&pp=%23payment&pp=t&pp=Checkout&pp=ts&pp=1619409640698&pp=pr&pp=%2Fin%2Fcheckout&id0=1736797086002278&t0=change&n0=input&c0=input-text%20mage-error&i0=worldpay_cc_cc_number&y0=%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.payment-method-cc-form%3B%7C%40form%3B%23worldpay_cc-form%3B.form%3B%5Bdata-bind%3Dattr%3A%20%7B%27id%27%3A%20getCode()%20%2B%20%27-form%27%7D%5D%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B%23payment_form_worldpay_cc%3B.ccard%3B.fieldset%3B.items%3B.payment%3B.worldpay_cc%3B%5Bdata-bind%3Dattr%3A%20%7Bclass%3A%20%27fieldset%20payment%20items%20ccard%20%27%20%2B%20getCode()%2C%20id%3A%20%27payment_form_%27%20%2B%20getCode()%7D%5D%3B%7C%40div%3B.field%3B.number%3B.required%3B%7C%40div%3B.control%3B%7C%40input%3B%23worldpay_cc_cc_number%3B.input-text%3B.mage-error%3B%5Baria-describedby%3Dworldpay_cc_cc_number-error%5D%3B%5Baria-invalid%3Dtrue%5D%3B%5Baria-required%3Dtrue%5D%3B%5Bautocomplete%3D%5D%3B%5Bdata-bind%3D%5D%3B%5Bdata-container%3Dworldpay_cc-cc-number%5D%3B%5Bdata-validate%3D%7B%22required-number%22%3Atrue%2C%22worldpay-validate-number%22%3Atrue%2C%22worldpay-cardnumber-valid%22%3Atrue%7D%5D%3B%5Bname%3Dpaymentcc_number%5D%3B%5Btitle%3DCredit%20Card%20Number%5D%3B%5Btype%3Dtext%5D%3B%7C&ts0=1619409774532&id1=7055132648380944&t1=click&n1=button&c1=action%20primary%20checkout&i1=checkout-payment-method-cc&y1=%40div%3B.columns%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.column%3B.main%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%23checkout%3B.checkout-container%3B%5Bdata-bind%3Dscope%3A%27checkout%27%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.opc-wrapper%3B%7C%40ol%3B%23checkoutSteps%3B.opc%3B%7C%40li%3B%23payment%3B.checkout-payment-method%3B%5Bdata-bind%3DfadeVisible%3A%20isVisible%5D%3B%5Brole%3Dpresentation%5D%3B%7C%40div%3B%23checkout-step-payment%3B.step-content%3B%5Baria-hidden%3Dfalse%5D%3B%5Bdata-role%3Dcontent%5D%3B%5Brole%3Dtabpanel%5D%3B%7C%40form%3B%23co-payment-form%3B.form%3B.payments%3B%5Bnovalidate%3Dnovalidate%5D%3B%7C%40fieldset%3B.fieldset%3B%7C%40div%3B%23checkout-payment-method-load%3B.opc-payment%3B%5Bdata-bind%3Dvisible%3A%20isPaymentMethodsAvailable%5D%3B%7C%40div%3B.items%3B.payment-methods%3B%7C%40div%3B.payment-group%3B%5Bdata-repeat-index%3D0%5D%3B%7C%40div%3B._active%3B.payment-method%3B%5Bdata-bind%3Dcss%3A%20%7B%27_active%27%3A%20(getCode()%20%3D%3D%20isChecked())%7D%5D%3B%7C%40div%3B.payment-method-content%3B%7C%40div%3B.actions-toolbar%3B%7C%40div%3B.primary%3B%7C%40button%3B%23checkout-payment-method-cc%3B.action%3B.checkout%3B.primary%3B%5Bdata-bind%3D%5D%3B%5Btitle%3DPay%20now%5D%3B%5Btype%3Dsubmit%5D%3B%7C&ts1=1619409774597&x1=Pay%20now&st=1619409775796")

					.resources(http("MagentoStagingCheckout_440")
						.post(uri07 + "/in/rest/in/V1/carts/mine/payment-information")

						.body(RawFileBody("computerdatabase/magentostagingcheckout/0440_request.json")),
						http("MagentoStagingCheckout_441")
							.get(uri07 + "/in/worldpay/threedsecure/auth")
							,
						http("MagentoStagingCheckout_442")
							.get(uri07 + "/in/checkout/onepage/success/")
							,
						http("MagentoStagingCheckout_443")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html")
						,
						http("MagentoStagingCheckout_444")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html")
							,
						http("MagentoStagingCheckout_445")
							.get(uri15 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fin%252Fcheckout%253F%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fin%252Fcheckout%252Fonepage%252Fsuccess%252F%3Bscrw%3D1280%3Bscrh%3D1024%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=330&jrt=s&pd=bMGvfzqvD2rYh7Wy3nji34NlpMhgwMY3koCSUXEfRPA%3D%7CAQAAAApDH4sIAAAAAAAEAGNhWF8w1T5GxPQYA3NBRgWjEAOjE4O0ep0tI8M17W0HXH_f8IDRDEDwHwoYFItLk4qTizILSjLz83SLSxLTM_PS9QoSk7NLCkqT9JLzc5liRBhBWsAApg9EQ4UYXQFxFa7ifAAAAA%3D%3D&srv=prodphxcgeu04"),
						http("MagentoStagingCheckout_446")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html")
							,
						http("MagentoStagingCheckout_447")
							.post(uri12 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABcVgYKWEZDSV4MBlYbG1oLBVJL&rst=164396&ck=1&ref=https://staging-mg.packtpub.com/in/checkout")
							.body(RawFileBody("computerdatabase/magentostagingcheckout/0447_request.txt")),
						http("MagentoStagingCheckout_448")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html")
							,
						http("MagentoStagingCheckout_449")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html")
							,
						http("MagentoStagingCheckout_450")
							.get(uri07 + "/in/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout%2Fonepage%2Fsuccess%2F&sections=&_=1619409782054")
							,
						http("MagentoStagingCheckout_451")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html")
							,
						http("MagentoStagingCheckout_452")
							.get("/h?a=3992788168&u=558546027102160&v=4192985534817315&s=8391188110420357&i=d12c50a2-843a-43de-96ba-360e39c985a4&b=web&tv=4.0&z=2&h=%2Fin%2Fcheckout%2Fonepage%2Fsuccess%2F&d=staging-mg.packtpub.com&t=Success%20Page&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fin%2Fcheckout%3F&k=Magento%20Order%20Number&k=%E2%82%B95.00&ts=1619409786220&pr=%2Fin%2Fcheckout&sp=ts&sp=1619409233594&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1619409786220")
							,
						http("MagentoStagingCheckout_453")
							.get(uri01 + "?merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com")
							,
						//http("MagentoStagingCheckout_454")
							//.post(https://staging-mg.packtpub.com/in//signon/ajax/signon/?email=jumpinjhapaak%40test.com)

							//.body(RawFileBody("computerdatabase/magentostagingcheckout/0454_request.json")),
						http("MagentoStagingCheckout_455")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html")
							,
						http("MagentoStagingCheckout_456")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_GoogleTagManager/template/minicart/content.html")
							,
						http("MagentoStagingCheckout_457")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html")
							,
						http("MagentoStagingCheckout_458")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html")
							,
						http("MagentoStagingCheckout_459")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html")
							,
						http("MagentoStagingCheckout_460")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html")
							,
						http("MagentoStagingCheckout_461")
							.get(uri07 + "/in/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1619409782057")
							,
						http("MagentoStagingCheckout_462")
							.get(uri07 + "/in/packtgeoip/ajax/storebanner?sourceURL=/in/checkout/onepage/success/&_=1619409782055")
							,
						http("MagentoStagingCheckout_463")
							.get(uri14 + "?cmd=_dynamic-image&buttontype=ecshortcut&locale=en_GB")
							,
						http("MagentoStagingCheckout_464")
							.get(uri06 + "?a=43637&v=5.6.3&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvc%26id%3D%26p%3D%255Bi%25253D9781789953459%252526pr%25253D4.7600%252526q%25253D1%255D&p3=e%3Ddis&adce=1&tld=packtpub.com&dtycbr=54496"),
						http("MagentoStagingCheckout_465")
							.get(uri07 + "/static/version1611329178/frontend/Packt/default/en_GB/Packt_GeoIP/template/ko/geoip_banner.html")
							,
						http("MagentoStagingCheckout_466")
							.get(uri07 + "/in/packtgtm/ajax/customer/?_=1619409782056")
							))
				.pause(1)
				.exec(http("MagentoStagingCheckout_467")
					.get(uri12 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1208.49599aa&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABcVgYKWEZDSVgMB0MCU1ZKEkJQVANEEQ%3D%3D&rst=31236&ck=1&ref=https://staging-mg.packtpub.com/in/checkout/onepage/success/&ap=722&be=3007&fe=31188&dc=5114&perf=%7B%22timing%22:%7B%22of%22:1619409778939,%22n%22:0,%22u%22:2971,%22r%22:5,%22ue%22:2980,%22re%22:1042,%22f%22:1042,%22dn%22:1042,%22dne%22:1042,%22c%22:1042,%22s%22:1042,%22ce%22:1042,%22rq%22:1047,%22rp%22:2962,%22rpe%22:2962,%22dl%22:2971,%22di%22:5094,%22ds%22:5113,%22de%22:5143,%22dc%22:31187,%22l%22:31187,%22le%22:31202%7D,%22navigation%22:%7B%22ty%22:255,%22rc%22:1%7D%7D&fcp=5085&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
					)

		}

	val anyuser = scenario("StagingFreeLearning").exec(ProductSearch.prodsearch,CheckOut.checkout)

	setUp(anyuser.inject(atOnceUsers(20))).protocols(httpProtocol)
}