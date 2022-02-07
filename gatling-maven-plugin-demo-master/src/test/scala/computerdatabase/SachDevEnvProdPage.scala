package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SachDevEnvProdPage extends Simulation {

	val httpProtocol = http
		.baseUrl("https://sach.dev.packt.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_10 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_13 = Map("Accept" -> "image/webp,*/*")

	val headers_15 = Map("X-Requested-With" -> "XMLHttpRequest")

	val headers_23 = Map(
		"Accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_30 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_33 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_35 = Map(
		"Accept" -> "image/webp,*/*",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache")

	val headers_36 = Map(
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"X-Moz" -> "prefetch")

    val uri1 = "https://login.live.com/Me.htm"
    val uri2 = "https://static.packt-cdn.com/products/9781838648572/cover/smaller"
    val uri3 = "https://getpocket.cdn.mozilla.net/v3/firefox/global-recs"
    val uri4 = "https://aadcdn.msauth.net/shared/1.0/content/images/microsoft_logo_ee5c8d9fb6248c938fd0dc19370e90bd.svg"
    val uri5 = "https://login.microsoftonline.com/93ae660e-4895-4413-a75e-c5a4de429c0e/oauth2/v2.0/authorize"
    val uri6 = "https://firefox.settings.services.mozilla.com/v1"
    val uri7 = "https://aadcdn.msauthimages.net/c1c6b6c8-8zun6052upcszxvwh94zj6vwolollpx0imca0et7pfy/logintenantbranding/0/bannerlogo"

	val scn = scenario("SachDevEnvProdPage")
		// HOME
		.exec(http("SachDevEnvProdPage_0")
			.get("/index.php?action=ajaxui")
			.headers(headers_0)
			.resources(http("SachDevEnvProdPage_1")
			.get("/cache/jsLanguage/Home/en_us.js?v=3Wk0LkIK6aMeaa1Ckt6Jfw"),
            http("SachDevEnvProdPage_2")
			.get("/include/javascript/calendar.js?v=GPwZufw_w-5A_p9FuKJ2eQ"),
            http("SachDevEnvProdPage_3")
			.get("/cache/jsLanguage/en_us.js?v=3Wk0LkIK6aMeaa1Ckt6Jfw"),
            http("SachDevEnvProdPage_4")
			.get("/cache/include/javascript/sugar_grp1_yui.js?v=GPwZufw_w-5A_p9FuKJ2eQ"),
            http("SachDevEnvProdPage_5")
			.get("/cache/include/javascript/sugar_grp1.js?v=GPwZufw_w-5A_p9FuKJ2eQ"),
            http("SachDevEnvProdPage_6")
			.get("/cache/include/javascript/sugar_grp1_jquery.js?v=GPwZufw_w-5A_p9FuKJ2eQ"),
            http("SachDevEnvProdPage_7")
			.get("/cache/themes/SuiteP/js/style.js?v=GPwZufw_w-5A_p9FuKJ2eQ"),
            http("SachDevEnvProdPage_8")
			.get("/themes/SuiteP/js/jscolor.js?v=GPwZufw_w-5A_p9FuKJ2eQ"),
            http("SachDevEnvProdPage_9")
			.get("/cache/include/javascript/sugar_field_grp.js?v=GPwZufw_w-5A_p9FuKJ2eQ"),
            http("SachDevEnvProdPage_10")
			.get("/cache/themes/SuiteP/css/Dawn/style.css?v=GPwZufw_w-5A_p9FuKJ2eQ")
			.headers(headers_10),
            http("SachDevEnvProdPage_11")
			.get("/themes/SuiteP/css/colourSelector.php")
			.headers(headers_10),
            http("SachDevEnvProdPage_12")
			.get("/include/javascript/mozaik/vendor/tinymce/tinymce/tinymce.min.js?v=GPwZufw_w-5A_p9FuKJ2eQ"),
            http("SachDevEnvProdPage_13")
			.get("/themes/default/images/img_loading.gif?v=GPwZufw_w-5A_p9FuKJ2eQ")
			.headers(headers_13),
            http("SachDevEnvProdPage_14")
			.get("/custom/themes/SuiteP/images/sugar_icon.ico?v=GPwZufw_w-5A_p9FuKJ2eQ")
			.headers(headers_13),
            http("SachDevEnvProdPage_15")
			.get("/index.php?module=AOS_Products&action=index&parentTab=Publishing&ajax_load=1&loadLanguageJS=1")
			.headers(headers_15),
            http("SachDevEnvProdPage_16")
			.get("/themes/default/images/create-record.gif?v=tllbpqRD2UmNcFKuDu7dzQ")
			.headers(headers_13),
            http("SachDevEnvProdPage_17")
			.get("/themes/SuiteP/images/help-dashlet.png?v=tllbpqRD2UmNcFKuDu7dzQ")
			.headers(headers_13),
            http("SachDevEnvProdPage_18")
			.get("/themes/default/images/blank.gif?v=tllbpqRD2UmNcFKuDu7dzQ")
			.headers(headers_13),
            http("SachDevEnvProdPage_19")
			.get("/cache/jsLanguage/AOS_Products/en_us.js?v=Jv9EgbI-Hdezs1EELvSILA")
			.headers(headers_15),
            http("SachDevEnvProdPage_20")
			.get("/include/javascript/popup_parent_helper.js?v=tllbpqRD2UmNcFKuDu7dzQ")
			.headers(headers_15),
            http("SachDevEnvProdPage_21")
			.get("/custom/themes/SuiteP/images/sugar_icon.ico?v=tllbpqRD2UmNcFKuDu7dzQ")
			.headers(headers_13),
            http("SachDevEnvProdPage_22")
			.get("/include/javascript/popup_helper.js?v=tllbpqRD2UmNcFKuDu7dzQ")
			.headers(headers_15),
            http("SachDevEnvProdPage_23")
			.get("/include/javascript/qtip/jquery.qtip.min.js?_=1624522895814")
			.headers(headers_23),
            http("SachDevEnvProdPage_24")
			.get("/index.php?module=Alerts&action=get&to_pdf=1")
			.headers(headers_15)))
		.pause(5)
		.exec(http("SachDevEnvProdPage_25")
			.get("/index.php?module=AOS_Products&offset=2&stamp=1624522892027599200&return_module=AOS_Products&action=DetailView&record=9dd4a4a9-9c91-9f45-7f95-60ade7f94a6b&ajax_load=1")
			.headers(headers_15)
			.resources(http("SachDevEnvProdPage_26")
			.get("/themes/default/images/create-record.gif?v=fxpq2t9tOx3HEOarxiwQHQ")
			.headers(headers_13),
            http("SachDevEnvProdPage_27")
			.get("/custom/modules/AOS_Products/js/detailview.js?v=fxpq2t9tOx3HEOarxiwQHQ")
			.headers(headers_15),
            http("SachDevEnvProdPage_28")
			.get(uri2)
			.headers(headers_13),
            http("SachDevEnvProdPage_29")
			.get("/custom/themes/SuiteP/images/sugar_icon.ico?v=fxpq2t9tOx3HEOarxiwQHQ")
			.headers(headers_13),
            http("SachDevEnvProdPage_30")
			.get("/index.php?module=Favorites&action=check_favorite&record_id=9dd4a4a9-9c91-9f45-7f95-60ade7f94a6b&record_module=AOS_Products&to_pdf=true")
			.headers(headers_30),
            http("SachDevEnvProdPage_31")
			.get("/include/SubPanel/SubPanelTiles.js?v=fxpq2t9tOx3HEOarxiwQHQ")
			.headers(headers_15)))
		.pause(5)
		.exec(http("SachDevEnvProdPage_32")
			.get(uri3 + "?version=3&consumer_key=40249-e88c401e1b1f2242d9e441c4&locale_lang=en-US&region=IN&count=30")
			.resources(http("SachDevEnvProdPage_33")
			.get(uri5 + "?client_id=31188764-9aac-4615-8b33-fbf60a35165c&redirect_uri=https%3A%2F%2Fsach.dev.packt.com%2Foauth2%2Fidpresponse&response_type=code&scope=openid&state=LcT2%2BBa8l5mz9HNaXyMdsw97495d1yXbhbvl7DXz3RT7vvZgbonhHCZxQFIZwR9QwDIEjfM3lFQeawec6R0vu7RIPkkVMYme0tePNmt3TnzuXCJSKI3nKfOuJDM2EIdJVPsJDg35fPpAz0SOSMpxrBA0BWtoDTCrRrDdnky4B351p4j35ZRIQPc1332xIAMaNad2TCpi2E5TLl8QwDM%3D")
			.headers(headers_33),
            http("SachDevEnvProdPage_34")
			.get(uri6 + "/"),
            http("SachDevEnvProdPage_35")
			.get(uri4)
			.headers(headers_35),
            http("SachDevEnvProdPage_36")
			.get(uri1 + "?v=3")
			.headers(headers_36),
            http("SachDevEnvProdPage_37")
			.get(uri7 + "?ts=636749381253627117")
			.headers(headers_35)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}