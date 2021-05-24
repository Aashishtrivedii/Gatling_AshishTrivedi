
package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.concurrent.duration._


class ProductPageTest02 extends Simulation {

	val duration = Duration(1, MINUTES)

	val httpProtocol = http
		.baseUrl("https://staging-mg.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:84.0) Gecko/20100101 Firefox/84.0")


    val uri01 = "https://polyfill.io/v3/polyfill.min.js"
    val uri02 = "https://www.googletagmanager.com/gtm.js"
    val uri03 = "https://dis.criteo.com/dis/rtb"
    val uri04 = "https://trends.revcontent.com/cm/pixel_sync"
    val uri05 = "https://sync.outbrain.com/cookie-sync"
    val uri06 = "https://gem.gbc.criteo.com/newidsd"
    val uri07 = "https://bam-cell.nr-data.net"
    val uri08 = "https://ups.analytics.yahoo.com/ups/58301/sync"
    val uri09 = "https://criteo-sync.teads.tv/um"
    val uri10 = "https://pixel.advertising.com/ups/55945/sync"
    val uri11 = "https://api.feefo.com/api"
    val uri12 = "https://i.liadm.com/s/28292"
    val uri13 = "https://beacon.krxd.net/usermatch.gif"
    val uri14 = "https://gum.criteo.com"
    val uri15 = "https://sync.e-planning.net/um"
    val uri16 = "https://d.turn.com/r/dd/id/L2NzaWQvMS9jaWQvMTc0ODc0NDU2Ni90LzI/dpuid/url/https%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fcdb%2Fcookiematch.aspx%3F%26extid%3D%24!%7BTURN_UUID%7D"
    val uri17 = "https://pixel.rubiconproject.com/tap.php"
    val uri18 = "https://www.facebook.com/tr"
    val uri19 = "https://us-u.openx.net/w/1.0/sd"
    val uri20 = "https://partner.mediawallahscript.com"
    val uri21 = "https://i6.liadm.com/s/28292"
    val uri22 = "https://www.powr.io/powr.js"
    val uri23 = "https://idsync.rlcdn.com/397596.gif"
    val uri24 = "https://cw.addthis.com/t.gif"
    val uri25 = "https://sync-t1.taboola.com/sg/criteortb-network/1/rtb-h"
    val uri26 = "https://service.maxymiser.net/cg/v5"
    val uri27 = "https://ww2.feefo.com/api/ecommerce/plugin/widget/merchant/packt-publishing"
    val uri28 = "https://s.ad.smaato.net/c"
    val uri29 = "https://sslwidget.criteo.com/event"
    val uri30 = "https://widget.us.criteo.com/event"
    val uri31 = "https://cm.g.doubleclick.net/pixel"
    val uri32 = "https://ads.yahoo.com/cms/v1"
    val uri33 = "https://staging-mg.packtpub.com"
    val uri34 = "https://ad.360yield.com/match"
    val uri35 = "https://ads.stickyadstv.com/user-registering"
    val uri36 = "https://vivzzxfqg1-dsn.algolia.net/1/indexes/*/queries"
    val uri37 = "https://dnacdn.net/dna"
    val uri38 = "https://webadvisorc.rest.gti.mcafee.com/1"
    val uri39 = "https://simage2.pubmatic.com/AdServer/Pug"
    val uri40 = "https://ag.gbc.criteo.com/newidsd"
    val uri41 = "https://x.bidswitch.net"
    val uri42 = "https://eb2.3lift.com/xuid"
    val uri44 = "https://match.sharethrough.com/sync/v1"
    val uri45 = "https://sp.analytics.yahoo.com/spp.pl"
    val uri46 = "https://csm.fr.eu.criteo.net/iev"
    val uri47 = "https://secure.adnxs.com"
    val uri48 = "https://r.casalemedia.com/rum"
    val uri49 = "https://c.bing.com/c.gif"
    val uri50 = "https://bam.nr-data.net"
    val uri51 = "https://contextual.media.net/cksync.php"
    val uri52 = "https://jadserve.postrelease.com/suid/1017"


		// open home page
		object Home {
			val home = exec(http("Home_Page")
				.get(uri33 + "/")
				.resources(http("Home_Page_1")
					.get(uri01 + "?features=default%2CArray.prototype.includes%2CPromise"),
					http("Home_Page_2")
						.get(uri27),
					http("Home_Page_3")
						.get(uri22 + "?platform=magento"),
					http("Home_Page_4")
						.get(uri26 + "/?fv=dmn%3Dpacktpub.com%3Bref%3D%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Bscrw%3D1536%3Bscrh%3D864%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=0&jrt=s&pd=h8363O_ow_PpPmDTRiGbU2M8Er253eNJYb2kp1mFnUk%3D%7CAQAAAApDH4sIAAAAAAAEAGNheF59wZddhFmXgTkno4hRiIHRiaFPa_cnRobP8h0H2nfc8IDRDEDwHwoY2Fwyi1KTSxjZRRhB4mAAkwTRDAzMDDFGjAzTzpkzMvjlOTAy7AGqYXQFAJ3OKENwAAAA&bid=prodlhrcgeu04&srv=prodlhrcgeu04"),
					http("Home_Page_5")
						.get(uri02 + "?id=GTM-KHLZ7JF"),
					http("Home_Page_6")
						.post(uri50 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=74890&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")
						.body(RawFileBody("/Home_Page/0006_request.txt")),
					http("Home_Page_7")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/js-translation.json"),
					http("Home_Page_8")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html"),
					http("Home_Page_9")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html"),
					http("Home_Page_10")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html"),
					http("Home_Page_11")
						.post(uri07 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1184.ab39b52&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=75740&ck=1&ref=https://staging-mg.packtpub.com/")
						.body(RawFileBody("/Home_Page/0011_request.txt")),
					http("Home_Page_12")
						.get(uri11 + "/merchants/widgetintegration/all?merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com"),
					http("Home_Page_13")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html"),
					http("Home_Page_14")
						.get(uri11 + "/translations/en-GB/FeefoWidget?origin=staging-mg.packtpub.com"),
					http("Home_Page_15")
						.get("/h?a=3992788168&u=2890256856566653&v=6013225768526326&s=7417420027086250&b=web&tv=4.0&z=2&h=%2F&d=staging-mg.packtpub.com&t=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&ts=1610627336948&sp=ts&sp=1610627260814&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1610627336951"),
					http("Home_Page_16")
						.get(uri50 + "/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=1655&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575&be=892&fe=1487&dc=1026&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1610627335673,%22n%22:0,%22f%22:0,%22dn%22:0,%22dne%22:0,%22c%22:0,%22s%22:0,%22ce%22:0,%22rq%22:0,%22rp%22:5,%22rpe%22:293,%22dl%22:363,%22di%22:972,%22ds%22:986,%22de%22:1025,%22dc%22:1486,%22l%22:1486,%22le%22:1502%7D,%22navigation%22:%7B%7D%7D&jsonp=NREUM.setToken"),
					http("Home_Page_17")
						.get(uri11 + "/translations/en-GB/FeefoWidget?origin=staging-mg.packtpub.com"),
					http("Home_Page_18")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html"),
					http("Home_Page_19")
						.get(uri33 + "/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2F&sections=&_=1610627335287"),
					http("Home_Page_20")
						.get(uri33 + "/packtgeoip/ajax/storebanner?sourceURL=/&_=1610627335290"),
					http("Home_Page_21")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html"),
					http("Home_Page_22")
						.get(uri33 + "/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1610627335288"),
					http("Home_Page_23")
						.get(uri37),
					http("Home_Page_24")
						.get(uri33 + "/gb/banner/ajax/load/"),
					http("Home_Page_25")
						.post("https://staging-mg.packtpub.com//signon/ajax/signon/?signout=true")
						.body(RawFileBody("/Home_Page/0025_request.json")),
					http("Home_Page_26")
						.post(uri38)
						.body(RawFileBody("/Home_Page/0026_request.json")),
					http("Home_Page_27")
						.get(uri33 + "/packtgtm/ajax/customer/?_=1610627335289"),
					http("Home_Page_28")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html"),
					http("Home_Page_29")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html"),
					http("Home_Page_30")
						.get(uri11 + "/10/reviews/summary/service?since_period=YEAR&unanswered_feedback=include&source=floating_service_widget&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com"),
					http("Home_Page_31")
						.get(uri06),
					http("Home_Page_32")
						.get(uri40),
					http("Home_Page_33")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html"),
					http("Home_Page_34")
						.get(uri33 + "/gb/packtgeoip/ajax/storebanner"),
					http("Home_Page_35")
						.get(uri33 + "/customer/section/load/?sections=cart&force_new_section_timestamp=false&_=1610627335291"),
					http("Home_Page_36")
						.get(uri11 + "/10/reviews/service?page=1&page_size=10&since_period=YEAR&full_thread=include&unanswered_feedback=include&source=floating_service_widget&sort=-updated_date&feefo_parameters=include&merchant_identifier=packt-publishing&origin=staging-mg.packtpub.com"),
					http("Home_Page_37")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html"),
					http("Home_Page_38")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html"),
					http("Home_Page_39")
						.get(uri33 + "/gb/packtgtm/ajax/customer/"),
					http("Home_Page_40")
						.get(uri33 + "/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1610627335292"),
					http("Home_Page_41")
						.get(uri14 + "/sid/json?origin=onetag&domain=packtpub.com&sn=FirefoxSyncframe&so=3&topUrl=staging-mg.packtpub.com&bundle=oOe-Y192RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1icU1nRHdpanhVbTJuaGwxRzExeFV3NEczVlRNSkF3TzB6MXNLOWZJd2UlMkI3aXExYk1samNjMCUyRnNENm5VWEZzdGJpNk1yJTJGWVJmTEluWkVsQ2JQa0d4OEFDSCUyRm5lJTJGdUh5eHd3bVlYTXRhYVpT&info=jMTYUl92RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1ic1olMkZuM2h3Nmh5ZG5EOXk5JTJCNWkwY0xyY0NVcmdqUlhScmZDS0U4VzE1Y1ZuNWNCSTVJeiUyRnglMkJadVZwNFZGb2t4USUzRCUzRA&idsd=1632955321,-1739265095&cw=1"),
					http("Home_Page_42")
						.get(uri37 + "?info=f1-V6F92RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1icSUyQlMyVWRLT1ZHNFNES2ZFWnJFeDdqJTJGczZJSHFrNUxCRjJLNlJLeWJGaFlNdDFkR2N3Q29GYm5FUUFuR21CJTJGT3clM0QlM0Q"),
					http("Home_Page_43")
						.get(uri29 + "?a=42254&v=5.6.2&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvh&p3=e%3Ddis&adce=1&bundle=oOe-Y192RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1icU1nRHdpanhVbTJuaGwxRzExeFV3NEczVlRNSkF3TzB6MXNLOWZJd2UlMkI3aXExYk1samNjMCUyRnNENm5VWEZzdGJpNk1yJTJGWVJmTEluWkVsQ2JQa0d4OEFDSCUyRm5lJTJGdUh5eHd3bVlYTXRhYVpT&tld=packtpub.com&dtycbr=76075"),
					http("Home_Page_44")
						.get(uri07 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1184.ab39b52&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=6384&ck=1&ref=https://staging-mg.packtpub.com/&ap=2648&be=1564&fe=6291&dc=2526&perf=%7B%22timing%22:%7B%22of%22:1610627333319,%22n%22:0,%22u%22:1524,%22ue%22:1525,%22f%22:5,%22dn%22:13,%22dne%22:14,%22c%22:14,%22s%22:14,%22ce%22:14,%22rq%22:14,%22rp%22:1317,%22rpe%22:1521,%22dl%22:1523,%22di%22:2363,%22ds%22:2434,%22de%22:2583,%22dc%22:6290,%22l%22:6290,%22le%22:6338%7D,%22navigation%22:%7B%22ty%22:1%7D%7D&fcp=2420&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
						.check(status.is(500)),
					http("Home_Page_45")
						.get(uri20 + "/?account_id=1043&partner_id=1048&uid=k-PbONONXndyOMXMphQpxWj9aiIaLlMZoB4N8P7Q&custom=&tag_format=img&tag_action=sync&custom=&cb=e056eea1-7095-4bd2-a198-4e92208863a8"),
					http("Home_Page_46")
						.get(uri14 + "/sync?c=383&r=1&a=1&u=https%3A%2F%2Fd.turn.com%2Fr%2Fdd%2Fid%2FL2NzaWQvMS9jaWQvMTc0ODc0NDU2Ni90LzI%2Fdpuid%2F%40USERID%40%2Furl%2Fhttps%253A%252F%252Fdis.criteo.com%252Fdis%252Frtb%252Fcdb%252Fcookiematch.aspx%253F%2526extid%253D%2524!%7BTURN_UUID%7D"),
					http("Home_Page_47")
						.get(uri17 + "?v=6434&nid=2149&put=k-Zk0Z0NXndyOMXMphQpxWj9aiIaLGiKtoQ2IZDA&expires=30"),
					http("Home_Page_48")
						.get(uri05 + "?p=criteo&uid=k-_sukytXndyOMXMphQpxWj9aiIaLH6ggwZSHcJg"),
					http("Home_Page_49")
						.get(uri19 + "?id=537072953&val=k-5Uxdg9XndyOMXMphQpxWj9aiIaLwLuAV0CiHcA&c=us"),
					http("Home_Page_50")
						.get(uri09 + "?eid=80&uid=k-2wRaptXndyOMXMphQpxWj9aiIaJc2UakZkoAxw"),
					http("Home_Page_51")
						.get(uri48 + "?cm_dsp_id=20&external_user_id=k-ln-nd9XndyOMXMphQpxWj9aiIaJ9XG6zXWGRSA")
						.check(status.is(400)),
					http("Home_Page_52")
						.get(uri28 + "/?dspInit=1001851&dspCookie=k-O2maFdXndyOMXMphQpxWj9aiIaIRAdUaBz1eqQ"),
					http("Home_Page_53")
						.get(uri19 + "?cc=1&id=537072953&val=k-5Uxdg9XndyOMXMphQpxWj9aiIaLwLuAV0CiHcA&c=us"),
					http("Home_Page_54")
						.get(uri05 + "?p=criteo&uid=k-_sukytXndyOMXMphQpxWj9aiIaLH6ggwZSHcJg&rdrctExp=true"),
					http("Home_Page_55")
						.get(uri48 + "?cm_dsp_id=20&external_user_id=k-ln-nd9XndyOMXMphQpxWj9aiIaJ9XG6zXWGRSA&C=1"),
					http("Home_Page_56")
						.get(uri31 + "?google_nid=cjp&google_sc=&google_ula=913071&google_hm=ay1QYk9OT05YbmR5T01YTXBoUXB4V2o5YWlJYUxsTVpvQjROOFA3UQ&google_tc="),
					http("Home_Page_57")
						.get(uri42 + "?ld=1&mid=2711&xuid=k-XR9SY9XndyOMXMphQpxWj9aiIaJjUumKlaIOWw&dongle=013b&gdpr=1&cmp_cs=&us_privacy="),
					http("Home_Page_58")
						.get(uri45 + "?a=10001287818027&.yp=10028862&js=no"),
					http("Home_Page_59")
						.get(uri44 + "?source_id=7658cb1d77a660882b48db06&source_user_id=k-ctUgpNXndyOMXMphQpxWj9aiIaLEDDS_AVOx4w"),
					http("Home_Page_60")
						.get(uri45 + "?a=10001287818027&.yp=39872&js=no"),
					http("Home_Page_61")
						.get(uri41 + "/sync?dsp_id=46&user_id=k-DTM0ZNXndyOMXMphQpxWj9aiIaLWekwaeP1VVg&expires=30&user_group=5"),
					http("Home_Page_62")
						.get(uri41 + "/ul_cb/sync?dsp_id=46&user_id=k-DTM0ZNXndyOMXMphQpxWj9aiIaLWekwaeP1VVg&expires=30&user_group=5"),
					http("Home_Page_63")
						.get(uri45 + "?a=10000&.yp=39872"),
					http("Home_Page_64")
						.get("https://d.turn.com/r/dd/id/L2NzaWQvMS9jaWQvMTc0ODc0NDU2Ni90LzI/dpuid//url/https%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fcdb%2Fcookiematch.aspx%3F%26extid%3D%24!%7BTURN_UUID%7D"),
					http("Home_Page_65")
						.get(uri51 + "?cs=3&type=crt&ovsid=k-mvOITdXndyOMXMphQpxWj9aiIaJQCfW529B1Bg"),
					http("Home_Page_66")
						.get(uri08 + "?_origin=1&uid=k-N2r7-9XndyOMXMphQpxWj9aiIaLB4Z_sRpd-eA"),
					http("Home_Page_67")
						.get(uri03 + "/google/cookiematch.aspx?id=&google_error=3"),
					http("Home_Page_68")
						.get(uri03 + "/rightmedia/cookiematch.aspx?xid=E0"),
					http("Home_Page_69")
						.get(uri03 + "/cdb/cookiematch.aspx?&extid=7366942342467316642"),
					http("Home_Page_70")
						.get(uri47 + "/setuid?entity=52&code=k-nbsc-dXndyOMXMphQpxWj9aiIaLM6rV21kWb2w&seg=95287")
						.check(status.is(400)),
					http("Home_Page_71")
						.get(uri03 + "/yahoogemini/cookiematch.aspx?xid=E0"),
					http("Home_Page_72")
						.get(uri32 + "?esig=2~53ef8d479c22b2f64b38b7c8ed96f504cd8e84c6&nwid=10033892938&sigv=1"),
					http("Home_Page_73")
						.get(uri03 + "/yahoogemini/cookiematch.aspx?xid=E0"),
					http("Home_Page_74")
						.get(uri47 + "/seg?add=95287&redir=https%3A%2F%2Fsecure.adnxs.com%2Fgetuid%3Fhttps%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fappnexus%2Fcookiematch.aspx%3Fappnxsid%3D%24UID")))
				.pause(5)
				.exec(http("Home_Page_75")
					.post(uri50 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=11654&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")
					.body(RawFileBody("/Home_Page/0075_request.txt")))
				.pause(17)
		}

		// click browse all books
		object BrowseAll {
			val browseall = exec(http("Browse_All_76")
				.get("/h?a=3992788168&u=2890256856566653&v=6013225768526326&s=7417420027086250&b=web&tv=4.0&sp=ts&sp=1610627260814&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&pp=ts&pp=1610627336948&id0=226173199401902&t0=click&n0=a&c0=dropdown-toggle&h0=https%3A%2F%2Fstaging-mg.packtpub.com%2F%23&y0=%40div%3B.page-wrapper%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40header%3B.page-header%3B%7C%40div%3B.panel%3B.wrapper%3B%5Bdata-gtm-vis-first-on-screen-9995629_87%3D1318%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-gtm-vis-recent-on-screen-9995629_87%3D1318%5D%3B%5Bdata-gtm-vis-total-visible-time-9995629_87%3D100%5D%3B%7C%40div%3B.header%3B.panel%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40nav%3B%23desktop%3B.navbar%3B.navbar-expand-lg%3B%7C%40div%3B%23navbarContent-desk%3B.collapse%3B.navbar-collapse%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.mx-auto%3B.navbar-nav%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.dropdown%3B.dropdown-desktop%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40a%3B.dropdown-toggle%3B%5Baria-expanded%3Dfalse%5D%3B%5Baria-haspopup%3Dtrue%5D%3B%5Bdata-toggle%3Ddropdown%5D%3B%5Bhref%3Dhttps%3A%2F%2Fstaging-mg.packtpub.com%2F%23%5D%3B%7C&ts0=1610627363752&x0=Browse%20All&st=1610627364964")
				.resources(http("Browse_All_77")
					.get("/h?a=3992788168&u=2890256856566653&v=6013225768526326&s=7417420027086250&b=web&tv=4.0&sp=ts&sp=1610627260814&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=h&pp=%2F&pp=t&pp=Packt%20%7C%20Programming%20Books%2C%20eBooks%20%26%20Videos%20for%20Developers&pp=ts&pp=1610627336948&id0=5986217242863648&t0=click&n0=a&c0=category&h0=https%3A%2F%2Fstaging-mg.packtpub.com%2Fall-products%3Fproduct_type_filter%3DBook%26released%3DAvailable&y0=%40div%3B.mx-auto%3B.navbar-nav%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.dropdown%3B.dropdown-desktop%3B.show%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.dropdown-menu%3B.show%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.menurow%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%5Bdata-appearance%3Dcontained%5D%3B%5Bdata-content-type%3Drow%5D%3B%5Bdata-element%3Dmain%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%5Bdata-background-images%3D%7B%7D%5D%3B%5Bdata-element%3Dinner%5D%3B%5Bdata-enable-parallax%3D0%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bdata-parallax-speed%3D0.5%5D%3B%7C%40div%3B%5Bdata-appearance%3Ddefault%5D%3B%5Bdata-content-type%3Dtext%5D%3B%5Bdata-element%3Dmain%5D%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-4%3B.dropdown-items%3B.hidden-sm%3B.hidden-xs%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-6%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.categorys%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40a%3B.category%3B%5Bhref%3Dhttps%3A%2F%2Fstaging-mg.packtpub.com%2Fall-products%3Fproduct_type_filter%3DBook%26released%3DAvailable%5D%3B%7C&ts0=1610627365834&x0=All%20Books&st=1610627365848"),
					http("Browse_All_78")
						.get(uri33 + "/all-products?product_type_filter=Book&released=Available"),
					http("Browse_All_79")
						.get(uri01 + "?features=default%2CArray.prototype.includes%2CPromise"),
					http("Browse_All_80")
						.get(uri26 + "/?fv=dmn%3Dpacktpub.com%3Bref%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252F%3Burl%3Dhttps%253A%252F%252Fstaging-mg.packtpub.com%252Fall-products%253Fproduct_type_filter%253DBook%2526released%253DAvailable%3Bscrw%3D1536%3Bscrh%3D864%3Bclrd%3D24%3Bcok%3D1&lver=1.17&jsncl=mmRequestCallbacks%5B1%5D&ri=1&lto=0&jrt=s&pd=oA7eKO5SfbpY1UJWpxwCFoHMWW2MLNV2IfIQMs3pvRM%3D%7CAgAAAApDH4sIAAAAAAAEAGNheF59wZddhFmXgTkno4hRiIHRiaFPa_cnRoazc9e9bd9xw-OzfMcBEM0ABP-hgIHNJbMoNbmEkV2EESQOBjBJEM3AwMwQY8TIMO2cOSODX54DI8MeoBpGVwBPVQO_cAAAAA%3D%3D&bid=prodlhrcgeu04&srv=prodlhrcgeu04"),
					http("Browse_All_81")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/js-translation.json"),
					http("Browse_All_82")
						.post(uri50 + "/events/1/4474f5c124?a=77339425&sa=1&v=1184.ab39b52&t=Unnamed%20Transaction&rst=30385&ck=1&ref=https://www.powr.io/countdown-timer/u/06df9302_1606751575")
						.body(RawFileBody("/Browse_All/0082_request.txt")),
					http("Browse_All_83")
						.post(uri07 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1184.ab39b52&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABZQEoIWVdSHhgLDFcGTA%3D%3D&rst=32737&ck=1&ref=https://staging-mg.packtpub.com/")
						.body(RawFileBody("/Browse_All/0083_request.txt")),
					http("Browse_All_84")
						.post(uri46 + "?entry=c~Gum.FirefoxSyncframe.FragmentData.onetag.Bundle.Origin.3~1&entry=c~Gum.FirefoxSyncframe.SidReadSuccess~1&entry=h~Gum.FirefoxSyncframe.SidReadSuccessDuration~311&entry=c~Gum.FirefoxSyncframe.StorageWriting.Dna.Success~1"),
					http("Browse_All_85")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-custom.html"),
					http("Browse_All_86")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-popup.html"),
					http("Browse_All_87")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/modal/modal-slide.html"),
					http("Browse_All_88")
						.get("/h?a=3992788168&u=2890256856566653&v=7676073284944459&s=7417420027086250&b=web&tv=4.0&z=2&h=%2Fall-products&q=%3Fproduct_type_filter%3DBook%26released%3DAvailable&d=staging-mg.packtpub.com&t=All%20Products&r=https%3A%2F%2Fstaging-mg.packtpub.com%2F&ts=1610627367045&pr=%2F&sp=ts&sp=1610627260814&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&st=1610627367047"),
					http("Browse_All_89")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/tooltip/tooltip.html"),
					http("Browse_All_90")
						.post(uri36 + "?x-algolia-agent=Algolia%20for%20vanilla%20JavaScript%20(lite)%203.27.0%3Binstantsearch.js%202.10.2%3BMagento2%20integration%20(1.13.1)%3BJS%20Helper%202.26.0&x-algolia-application-id=VIVZZXFQG1&x-algolia-api-key=MjBiNTIwZWM0MmE4MWQ0MDQwNzIxY2Q5ZTQ0ZjE0ZDNkMzI4ZDVkZWJiYzcxNGI1NjA2MWYzNmUyNTQxY2ViZnRhZ0ZpbHRlcnM9")
						.formParam("""{"requests":[{"indexName":"staging_magento2_us_products_packt_rank_asc","params":"query""", "")
						.formParam("hitsPerPage", "24")
						.formParam("maxValuesPerFacet", "10")
						.formParam("page", "0")
						.formParam("ruleContexts", """["","magento-category-5241"]""")
						.formParam("clickAnalytics", "true")
						.formParam("facets", """["product_type_filter","released","language","concept","tool","vendor","categories.level0","categories.level1","categories.level0","categories.level1"]""")
						.formParam("tagFilters", "")
						.formParam("facetFilters", """[["released:Available"],["product_type_filter:Book"],["categories.level0:All Products"]]""")
						.formParam("numericFilters", """["visibility_catalog=1"]"},{"indexName":"staging_magento2_us_products_packt_rank_asc","params":"query=""")
						.formParam("hitsPerPage", "1")
						.formParam("maxValuesPerFacet", "10")
						.formParam("page", "0")
						.formParam("ruleContexts", """["","magento-category-5241"]""")
						.formParam("clickAnalytics", "false")
						.formParam("attributesToRetrieve", "[]")
						.formParam("attributesToHighlight", "[]")
						.formParam("attributesToSnippet", "[]")
						.formParam("tagFilters", "")
						.formParam("analytics", "false")
						.formParam("facets", "released")
						.formParam("numericFilters", """["visibility_catalog=1"]""")
						.formParam("facetFilters", """[["product_type_filter:Book"],["categories.level0:All Products"]]"},{"indexName":"staging_magento2_us_products_packt_rank_asc","params":"query=""")
						.formParam("hitsPerPage", "1")
						.formParam("maxValuesPerFacet", "10")
						.formParam("page", "0")
						.formParam("ruleContexts", """["","magento-category-5241"]""")
						.formParam("clickAnalytics", "false")
						.formParam("attributesToRetrieve", "[]")
						.formParam("attributesToHighlight", "[]")
						.formParam("attributesToSnippet", "[]")
						.formParam("tagFilters", "")
						.formParam("analytics", "false")
						.formParam("facets", "product_type_filter")
						.formParam("numericFilters", """["visibility_catalog=1"]""")
						.formParam("facetFilters", """[["released:Available"],["categories.level0:All Products"]]"},{"indexName":"staging_magento2_us_products_packt_rank_asc","params":"query=""")
						.formParam("hitsPerPage", "1")
						.formParam("maxValuesPerFacet", "10")
						.formParam("page", "0")
						.formParam("ruleContexts", """["","magento-category-5241"]""")
						.formParam("clickAnalytics", "false")
						.formParam("attributesToRetrieve", "[]")
						.formParam("attributesToHighlight", "[]")
						.formParam("attributesToSnippet", "[]")
						.formParam("tagFilters", "")
						.formParam("analytics", "false")
						.formParam("facets", """["categories.level0"]""")
						.formParam("numericFilters", """["visibility_catalog=1"]""")
						.formParam("facetFilters", """[["released:Available"],["product_type_filter:Book"]]"}]}"""),
					http("Browse_All_91")
						.get(uri11 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=74935"),
					http("Browse_All_92")
						.get(uri11 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=72015"),
					http("Browse_All_93")
						.get(uri11 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=57867"),
					http("Browse_All_94")
						.get(uri33 + "/media/catalog/product/cache/15b632e9e77981a7873c75c61bef88f9/undefined"),
					http("Browse_All_95")
						.get(uri11 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=66225"),
					http("Browse_All_96")
						.get(uri11 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=55728"),
					http("Browse_All_97")
						.get(uri11 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=71106"),
					http("Browse_All_98")
						.get(uri11 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=66216"),
					http("Browse_All_99")
						.get(uri11 + "/logo?merchantidentifier=packt-publishing&since=all&template=jtstars.png&parentvendorref=74223"),
					http("Browse_All_100")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/block-loader.html"),
					http("Browse_All_101")
						.get(uri33 + "/packtgeoip/ajax/storebanner?sourceURL=/all-products?product_type_filter=Book&released=Available&_=1610627366279"),
					http("Browse_All_102")
						.get(uri33 + "/banner/ajax/load/?requesting_page_url=https%3A%2F%2Fstaging-mg.packtpub.com%2Fall-products%3Fproduct_type_filter%3DBook%26released%3DAvailable&sections=&_=1610627366278"),
					http("Browse_All_103")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Customer/template/authentication-popup.html"),
					http("Browse_All_104")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Packt_Gdpr/template/ko/cookie_compliance.html"),
					http("Browse_All_105")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Ui/templates/collection.html"),
					http("Browse_All_106")
						.get(uri33 + "/packtgtm/ajax/customer/?_=1610627366280"),
					http("Browse_All_107")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Packt_CheckoutStickyMessage/template/messages.html"),
					http("Browse_All_108")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Packt_Catalog/template/product/list/listing.html"),
					http("Browse_All_109")
						.get(uri33 + "/static/version1610542530/frontend/Packt/default/en_GB/Magento_Captcha/template/checkout/captcha.html"),
					http("Browse_All_110")
						.get(uri33 + "/gb/banner/ajax/load/"),
					http("Browse_All_111")
						.get(uri33 + "/gb/packtgeoip/ajax/storebanner"),
					http("Browse_All_112")
						.get(uri33 + "/gb/packtgtm/ajax/customer/"),
					http("Browse_All_113")
						.get(uri33 + "/customer/section/load/?sections=messages&force_new_section_timestamp=true&_=1610627366281"),
					http("Browse_All_114")
						.get(uri07 + "/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1184.ab39b52&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABVRwQNWFQYBVYWB1QMRkpKF15WQA%3D%3D&rst=3078&ck=1&ref=https://staging-mg.packtpub.com/all-products&ap=3193&be=150&fe=2636&dc=686&perf=%7B%22timing%22:%7B%22of%22:1610627365953,%22n%22:0,%22u%22:102,%22ue%22:105,%22f%22:3,%22dn%22:3,%22dne%22:3,%22c%22:3,%22s%22:3,%22ce%22:3,%22rq%22:7,%22rp%22:100,%22rpe%22:100,%22dl%22:102,%22di%22:623,%22ds%22:668,%22de%22:725,%22dc%22:2635,%22l%22:2635,%22le%22:2641%7D,%22navigation%22:%7B%7D%7D&fcp=623&at=GhVGFVxMH04RAhYJHhxK&jsonp=NREUM.setToken")
						.check(status.is(500)),
					http("Browse_All_115")
						.post(uri38)
						.body(RawFileBody("/Browse_All/0115_request.json")),
					http("Browse_All_116")
						.get(uri29 + "?a=42254&v=5.6.2&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvl%26p%3D%255B9781789955750%252Cb10074_ned_coccover.png%252Ccover_10.png%255D&p3=e%3Ddis&adce=1&bundle=PqZfn192RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1iaHVrTmJpYWw4Y3hmUldIRVRtbXlrM3pvUGIzV3U1QVRCalpNcSUyQlJCR3YlMkZkYlE5bkYyWUdpR3c0cmJWWnFrZlJqWjJYaHVmWUo0bExLY01XJTJGcVFUT1gyeHhmSzRGN1BPNEVlTEJTeEZOOFd6WEdJMnN2Z09oa3VGVXZ4ZUVLemVRJTNEJTNE&tld=packtpub.com&dtycbr=4559"),
					http("Browse_All_117")
						.get(uri40),
					http("Browse_All_118")
						.get(uri30 + "?a=42254&v=5.6.2&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvl%26p%3D%255B9781789955750%252Cb10074_ned_coccover.png%252Ccover_10.png%255D&p3=e%3Ddis&adce=1&bundle=PqZfn192RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1iaHVrTmJpYWw4Y3hmUldIRVRtbXlrM3pvUGIzV3U1QVRCalpNcSUyQlJCR3YlMkZkYlE5bkYyWUdpR3c0cmJWWnFrZlJqWjJYaHVmWUo0bExLY01XJTJGcVFUT1gyeHhmSzRGN1BPNEVlTEJTeEZOOFd6WEdJMnN2Z09oa3VGVXZ4ZUVLemVRJTNEJTNE&tld=packtpub.com&dtycbr=4559"),
					http("Browse_All_119")
						.get(uri49 + "?Red3=CTOMS_pd&cbid=k-q10bL6xrp-XL9oSKeZQT_8PNRnVN7EIykiPdjg"),
					http("Browse_All_120")
						.get(uri28 + "/?dspInit=1001851&dspCookie=k-L8kKbKxrp-XL9oSKeZQT_8PNRnVGmdc30B7kCA"),
					http("Browse_All_121")
						.get(uri20 + "/?account_id=1043&partner_id=1048&uid=k-xVRTqqxrp-XL9oSKeZQT_8PNRnVW8lwID6hivg&custom=&tag_format=img&tag_action=sync&custom=&cb=fe7cb760-bc67-41d6-9c9d-9ad2dde59311"),
					http("Browse_All_122")
						.get(uri39 + "?vcode=bz0yJnR5cGU9MSZjb2RlPTE5MjgmdGw9NDMyMDA=&piggybackCookie=uid:k-AIblfqxrp-XL9oSKeZQT_8PNRnVmzKFuTOQXOA"),
					http("Browse_All_123")
						.get(uri31 + "?google_nid=cjp&google_sc&google_ula=913071&google_hm=ay14VlJUcXF4cnAtWEw5b1NLZVpRVF84UE5SblZXOGx3SUQ2aGl2Zw"),
					http("Browse_All_124")
						.get(uri47 + "/setuid?entity=52&code=k-q10bL6xrp-XL9oSKeZQT_8PNRnVN7EIykiPdjg&seg=95287"),
					http("Browse_All_125")
						.get(uri04 + "?bidder=151&bidder_uid=k-EMIibqxrp-XL9oSKeZQT_8PNRnX81Ur5jgALgw"),
					http("Browse_All_126")
						.get(uri51 + "?cs=3&type=crt&ovsid=k-DMMa5qxrp-XL9oSKeZQT_8PNRnU_VRq42CvOPQ"),
					http("Browse_All_127")
						.get(uri24 + "?pid=113&pdid=k-sj_sP6xrp-XL9oSKeZQT_8PNRnU5eOMhIq3Gyg"),
					http("Browse_All_128")
						.get(uri45 + "?a=10001287818027&.yp=10028862&js=no"),
					http("Browse_All_129")
						.get(uri44 + "?source_id=7658cb1d77a660882b48db06&source_user_id=k-Ta9tJ6xrp-XL9oSKeZQT_8PNRnUO4MNluc9bQg"),
					http("Browse_All_130")
						.get(uri31 + "?google_nid=cjp&google_sc=&google_ula=913071&google_hm=ay14VlJUcXF4cnAtWEw5b1NLZVpRVF84UE5SblZXOGx3SUQ2aGl2Zw&google_tc="),
					http("Browse_All_131")
						.get(uri19 + "?cc=1&id=537072953&val=k-paCgv6xrp-XL9oSKeZQT_8PNRnVl4gvA4ku3-Q&c=us"),
					http("Browse_All_132")
						.get(uri48 + "?cm_dsp_id=20&external_user_id=k-qU9k86xrp-XL9oSKeZQT_8PNRnUqczx98FeiHA&C=1"),
					http("Browse_All_133")
						.get(uri10 + "?uid=k-jWhFDKxrp-XL9oSKeZQT_8PNRnUpsmA6dNUf0g&_origin=1&verify=true"),
					http("Browse_All_134")
						.get(uri41 + "/ul_cb/sync?dsp_id=46&user_id=k-X6AuAqxrp-XL9oSKeZQT_8PNRnU2glML68y5Lw&expires=30&user_group=5"),
					http("Browse_All_135")
						.get(uri47 + "/bounce?%2Fsetuid%3Fentity%3D52%26code%3Dk-q10bL6xrp-XL9oSKeZQT_8PNRnVN7EIykiPdjg%26seg%3D95287"),
					http("Browse_All_136")
						.get(uri32 + "?esig=1~7315a025058f3128185459bfaf16e164414683fc&nwid=10000545908&sigv=1"),
					http("Browse_All_137")
						.get(uri08 + "?_origin=1&uid=k-oEtAA6xrp-XL9oSKeZQT_8PNRnVG3QMfs1KZAw&verify=true"),
					http("Browse_All_138")
						.get(uri10 + "?uid=k-b4Elxaxrp-XL9oSKeZQT_8PNRnUM9ZGlmFLdGQ&_origin=1"),
					http("Browse_All_139")
						.get(uri45 + "?a=10000&.yp=39872"),
					http("Browse_All_140")
						.get(uri47 + "/bounce?%2Fseg%3Fadd%3D95287%26redir%3Dhttps%253A%252F%252Fsecure.adnxs.com%252Fgetuid%253Fhttps%253A%252F%252Fdis.criteo.com%252Fdis%252Frtb%252Fappnexus%252Fcookiematch.aspx%253Fappnxsid%253D%2524UID"),
					http("Browse_All_141")
						.get(uri05 + "?p=criteo&uid=k-WTGQjqxrp-XL9oSKeZQT_8PNRnW8viWJVH-jSw"),
					http("Browse_All_142")
						.get(uri47 + "/bounce?%2Fgetuid%3Fhttps%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fappnexus%2Fcookiematch.aspx%3Fappnxsid%3D%24UID"),
					http("Browse_All_143")
						.get(uri03 + "/appnexus/cookiematch.aspx?appnxsid=0"),
					http("Browse_All_144")
						.get(uri03 + "/yahoogemini/cookiematch.aspx?xid=E0"),
					http("Browse_All_145")
						.get(uri03 + "/cdb/cookiematch.aspx?&extid=7624979065845591384"),
					http("Browse_All_146")
						.get(uri14 + "/sync?c=6&r=1&a=1&u=https%3A%2F%2Fidsync.rlcdn.com%2F397596.gif%3Fpartner_uid%3D%40USERID%40"),
					http("Browse_All_147")
						.get(uri25 + "/?taboola_hm=k-qZgd4Kxrp-XL9oSKeZQT_8PNRnVF6E-Pvob9Kw"),
					http("Browse_All_148")
						.get(uri18 + "/?id=1984543608450901&ev=Search&cd[content_type]=product&cd[content_ids]=%5B%226680275858631244580%22%2C%224190959125981931849%22%2C%221546185692250218777%22%5D&cd[product_catalog_id]=540110546368038&cd[product_category]=0&cd[criteo_audience_3_0]=A3&cd[external_id]=ceb26444-b2c0-466c-8478-73383c93ed6f&cd[application_id]=423936147658676"),
					http("Browse_All_149")
						.get(uri06),
					http("Browse_All_150")
						.get(uri23 + "?partner_uid=")
						.check(status.is(400)),
					http("Browse_All_151")
						.get(uri14 + "/sid/json?origin=onetag&domain=packtpub.com&sn=FirefoxSyncframe&so=3&topUrl=staging-mg.packtpub.com&bundle=PqZfn192RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1iaHVrTmJpYWw4Y3hmUldIRVRtbXlrM3pvUGIzV3U1QVRCalpNcSUyQlJCR3YlMkZkYlE5bkYyWUdpR3c0cmJWWnFrZlJqWjJYaHVmWUo0bExLY01XJTJGcVFUT1gyeHhmSzRGN1BPNEVlTEJTeEZOOFd6WEdJMnN2Z09oa3VGVXZ4ZUVLemVRJTNEJTNE&info=ZM90vV92RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1icSUyQlMyVWRLT1ZHNFNES2ZFWnJFeDdqJTJGczZJSHFrNUxCRjJLNlJLeWJGaFl4VlNZeFdnaHNVdG5BRE5jT0pTUnlnJTNEJTNE&idsd=1632955321,-1739265095&cw=1"),
					http("Browse_All_152")
						.get(uri37 + "?info=pzGMTV92RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1iZ0ZrVXZiYUFVb2plajA4eGVpMEt2Um9adlltQ01WUWh3RiUyRnZuYTNkcno4TE0lMkI2RklPZGROWWUwYjdHYjJIOEt3JTNEJTNE")))
				.pause(29)
		}

		// scroll down
		// click python machine learning
		object ProdPage {
			val prodpage = exec(http("Prod_Page_153")
				.post(uri46 + "?entry=c~Gum.FirefoxSyncframe.FragmentData.onetag.Bundle.Origin.3~1&entry=c~Gum.FirefoxSyncframe.SidReadSuccess~1&entry=h~Gum.FirefoxSyncframe.SidReadSuccessDuration~35&entry=c~Gum.FirefoxSyncframe.StorageWriting.Dna.Success~1")
				.resources(http("Prod_Page_154")
					.get("/h?a=3992788168&u=2890256856566653&v=7676073284944459&s=7417420027086250&b=web&tv=4.0&sp=ts&sp=1610627260814&sp=d&sp=staging-mg.packtpub.com&sp=h&sp=%2F&pp=d&pp=staging-mg.packtpub.com&pp=q&pp=%3Fproduct_type_filter%3DBook%26released%3DAvailable&pp=h&pp=%2Fall-products&pp=t&pp=All%20Products&pp=ts&pp=1610627367045&pp=pr&pp=%2F&id0=3241262808145565&t0=click&n0=img&c0=card-img&h0=https%3A%2F%2Fstaging-mg.packtpub.com%2Fproduct%2Fpython-machine-learning-third-edition%2F9781789955750&y0=%40div%3B%23algolia_instant_selector%3B.with-facets%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%23algolia-right-container%3B.col-lg-9%3B.col-sm-8%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.row%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B.col-md-12%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%7C%40div%3B%23instant-search-results-container%3B%5Bdata-gtm-vis-has-fired-9995629_87%3D1%5D%3B%5Bitemscope%3D%5D%3B%5Bitemtype%3Dhttp%3A%2F%2Fschema.org%2FItemList%5D%3B%7C%40div%3B.ais-hits%3B.mb-3%3B.row%3B%7C%40div%3B.ais-hits--item%3B.col-lg-6%3B.col-xl-4%3B.mb-3%3B%7C%40div%3B.card%3B.h-100%3B%5Bitemprop%3DitemListElement%5D%3B%5Bitemscope%3D%5D%3B%5Bitemtype%3Dhttp%3A%2F%2Fschema.org%2FProduct%5D%3B%7C%40a%3B.card-body%3B%5Bdata-objectid%3D74794%5D%3B%5Bdata-position%3D%5D%3B%5Bhref%3Dhttps%3A%2F%2Fstaging-mg.packtpub.com%2Fproduct%2Fpython-machine-learning-third-edition%2F9781789955750%5D%3B%5Bitemprop%3Durl%5D%3B%7C%40img%3B.card-img%3B%5Balt%3DPython%20Machine%20Learning%20-%20Third%20Edition%5D%3B%5Bitemprop%3Dimage%5D%3B%5Bsrc%3D%2F%2Fstaging-mg.packtpub.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2Fce30d6157bced9c521f2da300edc521d%2F9%2F7%2F9781789955750-original.jpeg%5D%3B%7C&k0=Product%20Title%20%5BPCP%5D&k0=Python%20Machine%20Learning%20-%20Third%20Edition%0A%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20Book&ts0=1610627400911&st=1610627400939"),
					http("Prod_Page_155")
						.get(uri33 + "/product/python-machine-learning-third-edition/9781789955750"),
					http("Prod_Page_156")
						.get(uri33 + "/js/product.js?id=e963a7aa18c2925f3217"),
					http("Prod_Page_157")
						.post(uri38)
						.body(RawFileBody("/Prod_Page/0157_request.json")),
					http("Prod_Page_158")
						.post(uri07 + "/events/1/NRJS-0f4d86b78cc0c8047b9?a=475969838&v=1184.ab39b52&to=NlJRYxRWDBFSAEBaCg8YclQSXg0MHABVRwQNWFQYBVYWB1QMRkpKF15WQA%3D%3D&rst=35765&ck=1&ref=https://staging-mg.packtpub.com/all-products")
						.body(RawFileBody("/Prod_Page/0158_request.txt")),
					http("Prod_Page_159")
						.get(uri37),
					http("Prod_Page_160")
						.get(uri29 + "?a=40318&v=5.6.2&p0=e%3Dce%26m%3D%255B%255D&p1=e%3Dexd%26site_type%3Dd&p2=e%3Dvp%26p%3D9781789955750&p3=e%3Ddis&adce=1&bundle=QjD9Wl92RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1idXZVJTJGcjhWM3BrJTJGNVQ1b3lsV3ZlSWkwM0hMclJ1V04zRjNkODFkUGRmWWpHV296c2ZmSEY1UGlaRFFTN1FTMjFna01TWmRPNiUyQjlpc2RiVDRZbWx2enVwNDV6Y0cxNFRnJTJGMlJaTEw1T0hWMiUyRkd4eTl2MWxRMXNJRmM0TWIlMkJjYnF3JTNEJTNE&tld=packtpub.com&dtycbr=74498"),
					http("Prod_Page_161")
						.get(uri49 + "?Red3=CTOMS_pd&cbid=k-sj_sP6xrp-XL9oSKeZQT_8PNRnU5eOMhIq3Gyg"),
					http("Prod_Page_162")
						.get(uri28 + "/?dspInit=1001851&dspCookie=k-L8kKbKxrp-XL9oSKeZQT_8PNRnVGmdc30B7kCA"),
					http("Prod_Page_163")
						.get(uri06),
					http("Prod_Page_164")
						.get(uri40),
					http("Prod_Page_165")
						.get(uri41 + "/sync?dsp_id=46&user_id=k-X6AuAqxrp-XL9oSKeZQT_8PNRnU2glML68y5Lw&expires=30"),
					http("Prod_Page_166")
						.get(uri51 + "?cs=3&type=crt&ovsid=k-DMMa5qxrp-XL9oSKeZQT_8PNRnU_VRq42CvOPQ"),
					http("Prod_Page_167")
						.get(uri39 + "?vcode=bz0yJnR5cGU9MSZjb2RlPTI0MjUmdGw9NDMyMDA=&piggybackCookie=uid:k-AIblfqxrp-XL9oSKeZQT_8PNRnVmzKFuTOQXOA"),
					http("Prod_Page_168")
						.get(uri48 + "?cm_dsp_id=20&external_user_id=k-qU9k86xrp-XL9oSKeZQT_8PNRnUqczx98FeiHA"),
					http("Prod_Page_169")
						.get(uri45 + "?a=10001287818027&.yp=438726"),
					http("Prod_Page_170")
						.get(uri17 + "?v=6434&nid=2149&put=k-sj_sP6xrp-XL9oSKeZQT_8PNRnU5eOMhIq3Gyg&expires=30"),
					http("Prod_Page_171")
						.get(uri31 + "?google_nid=cjp&google_sc&google_ula=913071&google_hm=ay14VlJUcXF4cnAtWEw5b1NLZVpRVF84UE5SblZXOGx3SUQ2aGl2Zw"),
					http("Prod_Page_172")
						.get(uri10 + "?uid=k-jWhFDKxrp-XL9oSKeZQT_8PNRnUpsmA6dNUf0g&_origin=1"),
					http("Prod_Page_173")
						.get(uri32 + "?esig=1~7315a025058f3128185459bfaf16e164414683fc&nwid=10000545908&sigv=1"),
					http("Prod_Page_174")
						.get(uri14 + "/sync?c=83&r=1&a=1&u=https%3A%2F%2Fbeacon.krxd.net%2Fusermatch.gif%3Fpartner%3Dcriteo%26partner_uid%3D%40USERID%40"),
					http("Prod_Page_175")
						.get(uri19 + "?cc=1&id=537072953&val=k-paCgv6xrp-XL9oSKeZQT_8PNRnVl4gvA4ku3-Q&c=us"),
					http("Prod_Page_176")
						.get(uri31 + "?google_nid=cjp&google_sc=&google_ula=913071&google_hm=ay14VlJUcXF4cnAtWEw5b1NLZVpRVF84UE5SblZXOGx3SUQ2aGl2Zw&google_tc="),
					http("Prod_Page_177")
						.get(uri47 + "/bounce?%2Fseg%3Fadd%3D130915%26redir%3Dhttps%253A%252F%252Fsecure.adnxs.com%252Fgetuid%253Fhttps%253A%252F%252Fdis.criteo.com%252Fdis%252Frtb%252Fappnexus%252Fcookiematch.aspx%253Fappnxsid%253D%2524UID"),
					http("Prod_Page_178")
						.get(uri37 + "?info=zLiMjF92RjB2U3FYRkJNMndmJTJGJTJCbjdWNG1iaEhWbyUyQmclMkZEdGprSG91NUpLUFV0TnBXRHRUYzA2bmVmS2RIM0VYbmpsSG8wRyUyQlRUdTB6OTZjRmlIdVdWTmdxcmclM0QlM0Q"),
					http("Prod_Page_179")
						.get(uri25 + "/?taboola_hm=k-qZgd4Kxrp-XL9oSKeZQT_8PNRnVF6E-Pvob9Kw"),
					http("Prod_Page_180")
						.get(uri34 + "?publisher_dsp_id=38&external_user_id=k-rDW0eqxrp-XL9oSKeZQT_8PNRnWMAlhlqGER4w"),
					http("Prod_Page_181")
						.get(uri35 + "?dataProviderId=434&userId=k-SD4h06xrp-XL9oSKeZQT_8PNRnXm8cMVnOuBeQ&redirectId=69"),
					http("Prod_Page_182")
						.get(uri10 + "?uid=k-b4Elxaxrp-XL9oSKeZQT_8PNRnUM9ZGlmFLdGQ&_origin=1&verify=true"),
					http("Prod_Page_183")
						.get(uri08 + "?_origin=1&uid=k-oEtAA6xrp-XL9oSKeZQT_8PNRnVG3QMfs1KZAw&verify=true"),
					http("Prod_Page_184")
						.get(uri47 + "/getuid?https://dis.criteo.com/dis/rtb/appnexus/cookiematch.aspx?appnxsid=$UID"),
					http("Prod_Page_185")
						.get(uri03 + "/google/cookiematch.aspx?id=&google_error=3"),
					http("Prod_Page_186")
						.get(uri10 + "?uid=k-J3f_mKxrp-XL9oSKeZQT_8PNRnWY8P4_oClXjg&_origin=1"),
					http("Prod_Page_187")
						.get(uri15 + "?uid=k-Uxsziqxrp-XL9oSKeZQT_8PNRnW_GPPCdU99kF3W0Z7UjQFw&dc=6884a087b48abdb1&ibd=1&iss=1"),
					http("Prod_Page_188")
						.get(uri32 + "?esig=1~fa63d183df77c65a03eac82806b701b9c4f726b8&nwid=10000892938&sigv=1"),
					http("Prod_Page_189")
						.get(uri05 + "?p=criteo&uid=k-WTGQjqxrp-XL9oSKeZQT_8PNRnW8viWJVH-jSw&rdrctExp=true"),
					http("Prod_Page_190")
						.get(uri12 + "?bidder_id=71340&bidder_uuid=k-lKt_3qxrp-XL9oSKeZQT_8PNRnUOy4BLNOBakg"),
					http("Prod_Page_191")
						.get(uri13 + "?partner=criteo&partner_uid="),
					http("Prod_Page_192")
						.get(uri52 + "?vk=k-u6Txxqxrp-XL9oSKeZQT_8PNRnX51gY0DFygvA"),
					http("Prod_Page_193")
						.get(uri12 + "?bidder_id=71340&bidder_uuid=k-lKt_3qxrp-XL9oSKeZQT_8PNRnUOy4BLNOBakg&_li_chk=true&previous_uuid=e891b19042dc412fb8a826f896760339"),
					http("Prod_Page_194")
						.get(uri21 + "?bidder_id=71340&bidder_uuid=k-lKt_3qxrp-XL9oSKeZQT_8PNRnUOy4BLNOBakg")))
				.pause(3)
				.exec(http("Prod_Page_195")
					.get("/h?a=34805961&u=3330521281151629&v=4357613117797334&s=5636835940162925&b=web&tv=4.0&z=0&h=%2Fproduct%2Fpython-machine-learning-third-edition%2F9781789955750&d=staging-mg.packtpub.com&t=Python%20Machine%20Learning%20-%20Third%20Edition%20%7C%20Packt&r=https%3A%2F%2Fstaging-mg.packtpub.com%2Fall-products%3Fproduct_type_filter%3DBook%26released%3DAvailable&ts=1610627402280&pr=%2Fall-products&st=1610627407049"))
		}

	//HOW THIS PART OF THE SCRIPT LOOKS WHEN CREATED, BEFORE WE REFACTOR
	//THE FIRST LINE TELLS IT TO RUN THE ENTIRE TEST
	//THE SECOND LINE TELLS IT HOW TO CONFIGURE THE USERS TO BE RUN IN THE TEST
	//val scn = scenario("ProductPageTest02")
	//setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)

	//AS WE HAVE CREATED OBJECTS, WE NOW ALTER THE FIRST LINE TO THIS, TO RUN ALL OBJECTS WE'VE CREATED IN ORDER
	//i.e STILL THE FULL TEST, BUT REFACTORED TO ACCOUNT FOR THE OBJECTS
	//val scn = scenario("ProductPageTest02").exec(Home.home,BrowseAll.browseall,ProdPage.prodpage)

	//BECAUSE WE HAVE CREATED OBJECTS WE CAN SET UP DIFFERENT USERS THAT WILL DO DIFFERENT ACTIONS
	//BY CREATING MULTIPLE VARIATIONS OF THE SAME LINE OF CODE

	  val homeusers = scenario("HomePageOnly").exec(Home.home)
		val browsers = scenario("Browsers").exec(Home.home,BrowseAll.browseall)
		val viewers = scenario("ProductViewers").exec(Home.home,BrowseAll.browseall,ProdPage.prodpage)

	//AS WE HAVE 3 USER TYPES, WE ALSO ALTER THE SECOND LINE OF CODE
	// THIS EXAMPLE WOULD USE ALL 3 USERS/ACTION TYPES ABOVE, WITH DIFFERENT AMOUNTS OF THOSE USERS
/*
	setUp(homeusers.inject(atOnceUsers(5)),
	      browsers.inject(atOnceUsers(4)),
	      viewers.inject(atOnceUsers(3))).protocols(httpProtocol)
*/

	// THIS IS A SIMPLE TEST TO DEMO THROWING 25 USERS AT THE HOME PAGE AT ONCE, LITERALLY AT ONCE
	//setUp(homeusers.inject(atOnceUsers(25))).protocols(httpProtocol)

	//BUT MORE REALISTICALLY WE CAN INJECT USERS AT TIME INTERVALS, BUILDING UP OVER TIME

	//this, over 3 minutes, adds users. not 1 to 25 over 3 minutes, but 1 to 25 every second over 3 minutes
	//setUp(homeusers.inject(rampUsersPerSec(1).to(25).during(duration).randomized)).protocols(httpProtocol)

	//this adds 1 user and increments by 1 to a max of 25 evenly over 1 minute
	setUp(homeusers.inject(rampUsers(25).during(duration)).protocols(httpProtocol))

}

object https
