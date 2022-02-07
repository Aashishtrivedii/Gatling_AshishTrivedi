package staging

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class expertreadingstg extends Simulation {

	val httpProtocol = http
		.baseUrl("https://subscription-staging.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_3 = Map(
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_4 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_7 = Map(
		"Accept" -> "*/*",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_8 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Sec-Fetch-Dest" -> "font",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_9 = Map(
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_16 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-XSRF-TOKEN" -> "eyJpdiI6IkVvTlBqV0lRRmdjSENqSnpWM0FSd1E9PSIsInZhbHVlIjoiM2dCSllUZVpINCt3ZHV6VTBHT0IwV3pFTkdrQ3hkL0YrSmtBaUd1c05uS1U3SGJtKzBNVFdiQUpQTFhXY3k3ZWVsR1ZTOU9TSkFKMlhoS3J0N3UvUFZVTklnME1mN1hPQ3BmOGE3ZWVjUmk1YndlMjRLYThXcmVFRDFZWTFXUjUiLCJtYWMiOiI1YzU4MjIzOGQwYTdhOTFjMzQzZmNiMDdmOWJlNWRkNDYyZWI0NTk5Mzg3MzgyYTdjN2M4ZTkxOGQ0MmQ4ZDIyIn0=",
		"authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiI3NTZlYzVjNy0xM2MwLTQyMjctYWQyYi02ZjU2Yjg1OTYxYzEiLCJ1c2VybmFtZSI6InRlc3R1c2VycnJAdGVzdC5jb20iLCJwZXJtaXNzaW9ucyI6W10sInN1YnNjcmlwdGlvbiI6W10sInBlcm1zIjoiQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE9PSIsIm9yZ2FuaXNhdGlvbklkcyI6W10sImlhdCI6MTYyOTQ1NzE4MywiZXhwIjoxNjI5NDU4MDgzfQ.XctFcR5ap8rWn1XxNR78nauY5UmZpZFtHtB2STWpckCDku-RSmTIY0Fd6H1BC6bJ1jx2CzTLjydlqmmKBlZ7MuMgGvCWgADiTPnGBfamhivDJaWE_CLpGAhf4JGcq00SVWzy3B8ytYpIxdYC6qz-ngzndHRfJflHohVGRMN3baXHmaEcNF589bCLLI54Y9g37WB6FzKYOKFiWtP8X4LWqM8UF-vj1ewnfZ7lMWBjd8Kvud-yPcjpqc2CwKpYZFr0VVoLk43gjpTTaA-1871hsNE3JU344ww7vFm-hK5Tqdvwi3ZSr1SWLVx4q7-I-TFS_4HnTd04JoVoSANk504NVA")

	val headers_22 = Map(
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_152 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "text/plain; charset=UTF-8",
		"Origin" -> "https://subscription-staging.packtpub.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_153 = Map(
		"Accept" -> "*/*",
		"Access-Control-Request-Method" -> "PUT",
		"Origin" -> "https://subscription-staging.packtpub.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_155 = Map(
		"Accept" -> "application/json",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_159 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "cross-site",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_160 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_162 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "style",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_165 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_166 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "font",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_167 = Map(
		"Accept" -> "*/*",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_168 = Map(
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_172 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_174 = Map(
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_309 = Map(
		"Accept" -> "*/*",
		"Origin" -> "https://subscription-staging.packtpub.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"content-type" -> "application/json")

    val uri01 = "https://static.packt-cdn.com/products"
    val uri02 = "https://identify.hotjar.com/sites/982604/users/f4fafa38-7176-5f27-9be7-e52b8126a5dc"
    val uri03 = "https://www.googletagmanager.com/gtm.js"
    val uri04 = "https://static-staging.packt-cdn.com/products"
    val uri05 = "https://static.hotjar.com/c/hotjar-982604.js"
    val uri06 = "https://content-signature-2.cdn.mozilla.net/chains"
    val uri08 = "https://normandy.cdn.mozilla.net/api/v1"
    val uri09 = "https://classify-client.services.mozilla.com/api/v1/classify_client"
    val uri10 = "https://fonts.googleapis.com"
    val uri11 = "https://in.hotjar.com/api/v2/client/sites/982604/visit-data"

	val scn = scenario("expertreadingstg")
		// hitting direct url and selecting one list
		.exec(http("expertreadingstg_0")
			.get("/expert-reading-lists")
			.headers(headers_0)
			.resources(http("expertreadingstg_1")
			.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
			.headers(headers_1),
            http("expertreadingstg_2")
			.get("/css/app.css?id=e413a60afd9a572e6baf")
			.headers(headers_1),
            http("expertreadingstg_3")
			.get(uri03 + "?id=GTM-WJMM825")
			.headers(headers_3),
            http("expertreadingstg_4")
			.get(uri10 + "/css?family=Nunito")
			.headers(headers_4),
            http("expertreadingstg_5")
			.get(uri10 + "/css?family=Montserrat")
			.headers(headers_4),
            http("expertreadingstg_6")
			.get(uri10 + "/css2?family=Roboto+Mono:wght@500&display=swap")
			.headers(headers_4),
            http("expertreadingstg_7")
			.get("/js/react.js?id=9c4b3f62a3bef2cf998b")
			.headers(headers_7),
            http("expertreadingstg_8")
			.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
			.headers(headers_8),
            http("expertreadingstg_9")
			.get("/images/book.svg")
			.headers(headers_9),
            http("expertreadingstg_10")
			.get("/images/video.svg")
			.headers(headers_9),
            http("expertreadingstg_11")
			.get("/images/learning-path.svg")
			.headers(headers_9),
            http("expertreadingstg_12")
			.get(uri05 + "?sv=7")
			.headers(headers_3),
            http("expertreadingstg_13")
			.get("/images/playlist.svg")
			.headers(headers_9),
            http("expertreadingstg_14")
			.get("/images/credits.svg")
			.headers(headers_9),
            http("expertreadingstg_15")
			.get("/images/home.svg")
			.headers(headers_9),
            http("expertreadingstg_16")
			.get("/api/expertreaders/contentful")
			.headers(headers_16),
            http("expertreadingstg_17")
			.get("/api/expertreaders/all")
			.headers(headers_16),
            http("expertreadingstg_18")
			.get("/images/bookmark.svg")
			.headers(headers_9),
            http("expertreadingstg_19")
			.get("/api/users/me/subscriptions")
			.headers(headers_16),
            http("expertreadingstg_20")
			.get("/images/purchases.svg")
			.headers(headers_9),
            http("expertreadingstg_21")
			.get("/images/note.svg")
			.headers(headers_9),
            http("expertreadingstg_22")
			.get(uri01 + "/9781800566927/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_23")
			.get(uri01 + "/9781789615852/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_24")
			.get(uri01 + "/9781789955750/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_25")
			.get(uri01 + "/9781800209718/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_26")
			.get(uri01 + "/9781839218859/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_27")
			.get(uri01 + "/9781800566002/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_28")
			.get(uri01 + "/9781782167105/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_29")
			.get(uri01 + "/9781838989750/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_30")
			.get(uri01 + "/9781785280009/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_31")
			.get(uri01 + "/9781839212062/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_32")
			.get(uri01 + "/9781789348347/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_33")
			.get(uri01 + "/9781838984847/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_34")
			.get(uri01 + "/9781789802566/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_35")
			.get(uri01 + "/9781789801415/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_36")
			.get(uri01 + "/9781788993869/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_37")
			.get(uri01 + "/9781838989354/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_38")
			.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
			.headers(headers_8),
            http("expertreadingstg_39")
			.get(uri01 + "/9781800206168/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_40")
			.get(uri01 + "/9781788996662/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_41")
			.get(uri01 + "/9781839219931/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_42")
			.get(uri01 + "/9781800568105/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_43")
			.get(uri01 + "/9781839217715/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_44")
			.get("/images/chevron--orange.svg")
			.headers(headers_9),
            http("expertreadingstg_45")
			.get(uri01 + "/9781839215414/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_46")
			.get(uri01 + "/9781788834094/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_47")
			.get(uri01 + "/9781838640163/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_48")
			.get(uri01 + "/9781838982973/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_49")
			.get(uri01 + "/9781800201538/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_50")
			.get(uri01 + "/9781789617313/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_51")
			.get(uri01 + "/9781838550189/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_52")
			.get(uri01 + "/9781838982669/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_53")
			.get(uri01 + "/9781787129191/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_54")
			.get(uri01 + "/9781839210662/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_55")
			.get(uri01 + "/9781788837866/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_56")
			.get(uri01 + "/9781789530728/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_57")
			.get(uri01 + "/9781789533972/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_58")
			.get(uri01 + "/9781838648800/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_59")
			.get(uri01 + "/9781800207806/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_60")
			.get(uri01 + "/9781800560338/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_61")
			.get(uri01 + "/9781800203389/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_62")
			.get(uri01 + "/9781789805864/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_63")
			.get(uri01 + "/9781838642730/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_64")
			.get(uri01 + "/9781838642006/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_65")
			.get(uri01 + "/9781838552183/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_66")
			.get(uri01 + "/9781801070638/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_67")
			.get(uri01 + "/9781839211140/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_68")
			.get(uri01 + "/9781788392570/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_69")
			.get(uri01 + "/9781800565661/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_70")
			.get(uri01 + "/9781789955248/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_71")
			.get(uri01 + "/9781800560444/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_72")
			.get(uri01 + "/9781838826031/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_73")
			.get(uri01 + "/9781800567184/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_74")
			.get(uri01 + "/9781800208988/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_75")
			.get(uri01 + "/9781789346091/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_76")
			.get(uri01 + "/9781839216541/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_77")
			.get(uri01 + "/9781838552657/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_78")
			.get(uri01 + "/9781838559335/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_79")
			.get(uri01 + "/9781800206014/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_80")
			.get(uri01 + "/9781838981952/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_81")
			.get(uri01 + "/9781789805789/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_82")
			.get(uri01 + "/9781838554491/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_83")
			.get(uri01 + "/9781789616194/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_84")
			.get(uri01 + "/9781800564244/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_85")
			.get(uri01 + "/9781838558758/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_86")
			.get(uri01 + "/9781789611809/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_87")
			.get(uri01 + "/9781838987428/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_88")
			.get(uri01 + "/9781838987572/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_89")
			.get(uri01 + "/9781839214110/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_90")
			.get(uri01 + "/9781839217470/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_91")
			.get(uri01 + "/9781839215865/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_92")
			.get(uri01 + "/9781789134964/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_93")
			.get(uri01 + "/9781789952308/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_94")
			.get(uri01 + "/9781838641917/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_95")
			.get(uri01 + "/9781789340563/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_96")
			.get(uri01 + "/9781839211560/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_97")
			.get(uri01 + "/9781800561571/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_98")
			.get(uri01 + "/9781838644482/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_99")
			.get(uri01 + "/9781789957648/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_100")
			.get(uri01 + "/9781789801736/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_101")
			.get(uri01 + "/9781800209749/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_102")
			.get(uri01 + "/9781789136159/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_103")
			.get(uri01 + "/9781800562158/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_104")
			.get(uri01 + "/9781788297233/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_105")
			.get(uri01 + "/9781838986698/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_106")
			.get(uri01 + "/9781839211195/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_107")
			.get(uri01 + "/9781789536058/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_108")
			.get(uri01 + "/9781839211539/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_109")
			.get(uri01 + "/9781838827472/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_110")
			.get(uri01 + "/9781839219535/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_111")
			.get(uri01 + "/9781839211898/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_112")
			.get(uri01 + "/9781789133967/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_113")
			.get(uri01 + "/9781800560963/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_114")
			.get(uri01 + "/9781838646677/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_115")
			.get(uri01 + "/9781800207455/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_116")
			.get(uri01 + "/9781839219436/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_117")
			.get(uri01 + "/9781789342758/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_118")
			.get(uri01 + "/9781800207080/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_119")
			.get(uri01 + "/9781800560819/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_120")
			.get(uri01 + "/9781838647773/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_121")
			.get(uri01 + "/9781839213793/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_122")
			.get(uri01 + "/9781838826734/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_123")
			.get(uri01 + "/9781788996082/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_124")
			.get(uri01 + "/9781789532463/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_125")
			.get(uri01 + "/9781788399210/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_126")
			.get(uri01 + "/9781838823382/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_127")
			.get(uri01 + "/9781838989217/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_128")
			.get(uri01 + "/9781838826994/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_129")
			.get(uri01 + "/9781838826789/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_130")
			.get(uri01 + "/9781800561878/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_131")
			.get(uri01 + "/9781789530513/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_132")
			.get(uri01 + "/9781839211256/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_133")
			.get(uri01 + "/9781788994729/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_134")
			.get(uri01 + "/9781789615555/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_135")
			.get(uri01 + "/9781800200937/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_136")
			.get(uri01 + "/9781838648176/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_137")
			.get(uri01 + "/9781838649005/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_138")
			.get(uri01 + "/9781800563766/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_139")
			.get(uri01 + "/9781800208919/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_140")
			.get(uri01 + "/9781789807554/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_141")
			.get(uri01 + "/9781800200364/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_142")
			.get(uri01 + "/9781838647520/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_143")
			.get(uri01 + "/9781838986094/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_144")
			.get(uri01 + "/9781800209770/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_145")
			.get(uri01 + "/9781838984137/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_146")
			.get(uri01 + "/9781839214660/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_147")
			.get(uri01 + "/9781789619782/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_148")
			.get(uri01 + "/9781789349795/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_149")
			.get(uri01 + "/9781839215421/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_150")
			.get(uri01 + "/9781839212505/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_151")
			.get(uri01 + "/9781838981860/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_152")
			.post(uri11 + "?sv=7")
			.headers(headers_152)
			.body(RawFileBody("staging/expertreadingstg/0152_request.txt")),
            http("expertreadingstg_153")
			.options(uri02 + "?source=user.set")
			.headers(headers_153),
            http("expertreadingstg_154")
			.put(uri02 + "?source=user.set")
			.headers(headers_152)
			.body(RawFileBody("staging/expertreadingstg/0154_request.txt"))))
		.pause(1)
		.exec(http("expertreadingstg_155")
			.get(uri08 + "/")
			.headers(headers_155)
			.resources(http("expertreadingstg_156")
			.get(uri09 + "/")
			.headers(headers_155),
            http("expertreadingstg_157")
			.get(uri06 + "/normandy.content-signature.mozilla.org-2021-08-30-15-16-01.chain?cachebust=2017-06-13-21-06")
			.headers(headers_155),
            http("expertreadingstg_158")
			.get(uri06 + "/normandy.content-signature.mozilla.org-2021-09-19-15-17-09.chain?cachebust=2017-06-13-21-06")
			.headers(headers_155)))
		.pause(36)
		.exec(http("expertreadingstg_159")
			.get("/expert-reading-lists")
			.headers(headers_159)
			.resources(http("expertreadingstg_160")
			.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
			.headers(headers_160),
            http("expertreadingstg_161")
			.get("/css/app.css?id=e413a60afd9a572e6baf")
			.headers(headers_160),
            http("expertreadingstg_162")
			.get(uri10 + "/css?family=Montserrat")
			.headers(headers_162),
            http("expertreadingstg_163")
			.get(uri10 + "/css?family=Nunito")
			.headers(headers_162),
            http("expertreadingstg_164")
			.get(uri10 + "/css2?family=Roboto+Mono:wght@500&display=swap")
			.headers(headers_162),
            http("expertreadingstg_165")
			.get(uri03 + "?id=GTM-WJMM825")
			.headers(headers_165),
            http("expertreadingstg_166")
			.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
			.headers(headers_166),
            http("expertreadingstg_167")
			.get("/js/react.js?id=9c4b3f62a3bef2cf998b")
			.headers(headers_167),
            http("expertreadingstg_168")
			.get("/images/book.svg")
			.headers(headers_168),
            http("expertreadingstg_169")
			.get("/images/video.svg")
			.headers(headers_168),
            http("expertreadingstg_170")
			.get("/images/learning-path.svg")
			.headers(headers_168),
            http("expertreadingstg_171")
			.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
			.headers(headers_166),
            http("expertreadingstg_172")
			.get("/api/expertreaders/contentful")
			.headers(headers_172),
            http("expertreadingstg_173")
			.get("/api/expertreaders/all")
			.headers(headers_172),
            http("expertreadingstg_174")
			.get(uri01 + "/9781800209718/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_175")
			.get(uri01 + "/9781800566927/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_176")
			.get(uri01 + "/9781800566002/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_177")
			.get(uri01 + "/9781789615852/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_178")
			.get(uri01 + "/9781789955750/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_179")
			.get(uri01 + "/9781839218859/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_180")
			.get(uri01 + "/9781788996662/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_181")
			.get(uri01 + "/9781838984847/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_182")
			.get(uri01 + "/9781789802566/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_183")
			.get(uri01 + "/9781785280009/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_184")
			.get(uri01 + "/9781838989750/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_185")
			.get(uri01 + "/9781789801415/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_186")
			.get(uri01 + "/9781839212062/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_187")
			.get(uri01 + "/9781782167105/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_188")
			.get(uri01 + "/9781839219931/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_189")
			.get(uri01 + "/9781788993869/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_190")
			.get(uri01 + "/9781789348347/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_191")
			.get(uri01 + "/9781839215414/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_192")
			.get(uri01 + "/9781839217715/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_193")
			.get(uri01 + "/9781838989354/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_194")
			.get("/images/chevron--orange.svg")
			.headers(headers_168),
            http("expertreadingstg_195")
			.get(uri01 + "/9781788834094/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_196")
			.get(uri01 + "/9781800206168/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_197")
			.get(uri01 + "/9781800568105/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_198")
			.get(uri01 + "/9781789617313/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_199")
			.get(uri01 + "/9781838982973/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_200")
			.get(uri01 + "/9781838640163/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_201")
			.get(uri01 + "/9781800201538/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_202")
			.get(uri01 + "/9781838550189/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_203")
			.get(uri01 + "/9781787129191/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_204")
			.get(uri01 + "/9781838982669/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_205")
			.get(uri01 + "/9781789533972/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_206")
			.get(uri01 + "/9781839210662/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_207")
			.get(uri01 + "/9781838648800/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_208")
			.get(uri01 + "/9781800560338/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_209")
			.get(uri01 + "/9781838642006/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_210")
			.get(uri01 + "/9781789530728/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_211")
			.get(uri01 + "/9781800203389/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_212")
			.get(uri01 + "/9781800207806/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_213")
			.get(uri01 + "/9781838642730/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_214")
			.get(uri01 + "/9781789805864/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_215")
			.get(uri01 + "/9781788837866/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_216")
			.get(uri01 + "/9781838552183/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_217")
			.get(uri01 + "/9781788392570/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_218")
			.get(uri01 + "/9781801070638/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_219")
			.get(uri01 + "/9781839211140/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_220")
			.get(uri01 + "/9781800560444/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_221")
			.get(uri01 + "/9781800565661/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_222")
			.get(uri01 + "/9781789346091/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_223")
			.get(uri01 + "/9781839216541/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_224")
			.get(uri01 + "/9781789955248/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_225")
			.get(uri01 + "/9781838552657/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_226")
			.get(uri01 + "/9781800208988/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_227")
			.get(uri01 + "/9781838559335/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_228")
			.get(uri01 + "/9781838826031/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_229")
			.get(uri01 + "/9781838981952/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_230")
			.get(uri01 + "/9781800206014/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_231")
			.get(uri01 + "/9781838987428/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_232")
			.get(uri01 + "/9781838554491/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_233")
			.get(uri01 + "/9781789616194/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_234")
			.get(uri01 + "/9781838987572/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_235")
			.get(uri01 + "/9781800567184/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_236")
			.get(uri01 + "/9781839214110/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_237")
			.get(uri01 + "/9781800564244/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_238")
			.get(uri01 + "/9781789805789/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_239")
			.get(uri01 + "/9781789952308/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_240")
			.get(uri01 + "/9781838558758/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_241")
			.get(uri01 + "/9781789340563/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_242")
			.get(uri01 + "/9781789611809/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_243")
			.get(uri01 + "/9781839217470/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_244")
			.get(uri01 + "/9781789957648/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_245")
			.get(uri01 + "/9781838641917/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_246")
			.get(uri01 + "/9781839211560/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_247")
			.get(uri01 + "/9781839215865/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_248")
			.get(uri01 + "/9781788297233/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_249")
			.get(uri01 + "/9781838644482/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_250")
			.get(uri01 + "/9781838986698/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_251")
			.get(uri01 + "/9781800561571/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_252")
			.get(uri01 + "/9781789134964/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_253")
			.get(uri01 + "/9781789801736/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_254")
			.get(uri01 + "/9781800209749/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_255")
			.get(uri01 + "/9781800562158/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_256")
			.get(uri01 + "/9781789136159/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_257")
			.get(uri01 + "/9781839211195/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_258")
			.get(uri01 + "/9781839211539/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_259")
			.get(uri01 + "/9781839219535/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_260")
			.get(uri01 + "/9781838827472/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_261")
			.get(uri01 + "/9781839211898/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_262")
			.get(uri01 + "/9781789133967/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_263")
			.get(uri01 + "/9781789536058/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_264")
			.get(uri01 + "/9781800560963/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_265")
			.get(uri01 + "/9781839219436/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_266")
			.get(uri01 + "/9781838646677/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_267")
			.get(uri01 + "/9781789342758/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_268")
			.get(uri01 + "/9781800560819/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_269")
			.get(uri01 + "/9781800207080/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_270")
			.get(uri01 + "/9781839213793/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_271")
			.get(uri01 + "/9781800207455/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_272")
			.get(uri01 + "/9781838647773/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_273")
			.get(uri01 + "/9781838826734/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_274")
			.get(uri01 + "/9781838989217/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_275")
			.get(uri01 + "/9781788996082/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_276")
			.get(uri01 + "/9781838826994/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_277")
			.get(uri01 + "/9781789532463/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_278")
			.get(uri01 + "/9781788399210/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_279")
			.get(uri01 + "/9781838823382/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_280")
			.get(uri01 + "/9781789530513/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_281")
			.get(uri01 + "/9781838826789/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_282")
			.get(uri01 + "/9781789615555/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_283")
			.get(uri01 + "/9781800561878/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_284")
			.get(uri01 + "/9781839211256/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_285")
			.get(uri01 + "/9781838648176/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_286")
			.get(uri01 + "/9781800200937/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_287")
			.get(uri01 + "/9781838649005/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_288")
			.get(uri01 + "/9781800563766/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_289")
			.get(uri01 + "/9781800208919/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_290")
			.get(uri01 + "/9781800200364/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_291")
			.get(uri01 + "/9781838647520/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_292")
			.get(uri01 + "/9781838984137/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_293")
			.get(uri01 + "/9781788994729/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_294")
			.get(uri01 + "/9781789807554/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_295")
			.get(uri01 + "/9781838986094/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_296")
			.get(uri01 + "/9781800209770/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_297")
			.get(uri01 + "/9781839214660/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_298")
			.get(uri01 + "/9781789349795/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_299")
			.get(uri01 + "/9781789619782/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_300")
			.get(uri01 + "/9781839212505/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_301")
			.get(uri01 + "/9781839215421/cover/smaller")
			.headers(headers_174),
            http("expertreadingstg_302")
			.get(uri01 + "/9781838981860/cover/smaller")
			.headers(headers_174)))
		.pause(75)
		.exec(http("expertreadingstg_303")
			.get("/api/expertreaders/url/building-a-strong-foundation-in-python")
			.headers(headers_16)
			.resources(http("expertreadingstg_304")
			.get(uri04 + "/9781788996662/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_305")
			.get(uri04 + "/9781839218859/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_306")
			.get(uri04 + "/9781789801217/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_307")
			.get(uri04 + "/9781789615852/cover/smaller")
			.headers(headers_22),
            http("expertreadingstg_308")
			.get(uri04 + "/9781788837484/cover/smaller")
			.headers(headers_22)))
		.pause(5)
		.exec(http("expertreadingstg_309")
			.post("/cdn-cgi/rum?req_id=681b1d195a792d04")
			.headers(headers_309)
			.body(RawFileBody("staging/expertreadingstg/0309_request.json"))
			.resources(http("expertreadingstg_310")
			.post(uri11 + "?sv=7")
			.headers(headers_152)
			.body(RawFileBody("staging/expertreadingstg/0310_request.txt")),
            http("expertreadingstg_311")
			.get("/api/expertreaders/url/building-a-strong-foundation-in-python")
			.headers(headers_16)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}