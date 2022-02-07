package subscription.staging

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class expertreadingstaging extends Simulation {

	val httpProtocol = http
		.baseUrl("https://subscription-staging.packtpub.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0")



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


		// hitting direct url and selecting one list
		object StagingExpertReading{
			val expertreading=exec(http("expertreadingstg_0")
				.get("/expert-reading-lists")

				.resources(http("expertreadingstg_1")
					.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
					,
					http("expertreadingstg_2")
						.get("/css/app.css?id=e413a60afd9a572e6baf")
						,
					http("expertreadingstg_3")
						.get(uri03 + "?id=GTM-WJMM825")
						,
					http("expertreadingstg_4")
						.get(uri10 + "/css?family=Nunito")
						,
					http("expertreadingstg_5")
						.get(uri10 + "/css?family=Montserrat")
						,
					http("expertreadingstg_6")
						.get(uri10 + "/css2?family=Roboto+Mono:wght@500&display=swap")
						,
					http("expertreadingstg_7")
						.get("/js/react.js?id=9c4b3f62a3bef2cf998b")
						,
					http("expertreadingstg_8")
						.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
						,
					http("expertreadingstg_9")
						.get("/images/book.svg")
						,
					http("expertreadingstg_10")
						.get("/images/video.svg")
						,
					http("expertreadingstg_11")
						.get("/images/learning-path.svg")
						,
					http("expertreadingstg_12")
						.get(uri05 + "?sv=7")
						,
					http("expertreadingstg_13")
						.get("/images/playlist.svg")
						,
					http("expertreadingstg_14")
						.get("/images/credits.svg")
						,
					http("expertreadingstg_15")
						.get("/images/home.svg")
						,
					http("expertreadingstg_16")
						.get("/api/expertreaders/contentful")
						,
					http("expertreadingstg_17")
						.get("/api/expertreaders/all")
						,
					http("expertreadingstg_18")
						.get("/images/bookmark.svg")
						,
					http("expertreadingstg_19")
						.get("/api/users/me/subscriptions")
						,
					http("expertreadingstg_20")
						.get("/images/purchases.svg")
						,
					http("expertreadingstg_21")
						.get("/images/note.svg")
						,
					http("expertreadingstg_22")
						.get(uri01 + "/9781800566927/cover/smaller")
						,
					http("expertreadingstg_23")
						.get(uri01 + "/9781789615852/cover/smaller")
						,
					http("expertreadingstg_24")
						.get(uri01 + "/9781789955750/cover/smaller")
						,
					http("expertreadingstg_25")
						.get(uri01 + "/9781800209718/cover/smaller")
						,
					http("expertreadingstg_26")
						.get(uri01 + "/9781839218859/cover/smaller")
						,
					http("expertreadingstg_27")
						.get(uri01 + "/9781800566002/cover/smaller")
						,
					http("expertreadingstg_28")
						.get(uri01 + "/9781782167105/cover/smaller")
						,
					http("expertreadingstg_29")
						.get(uri01 + "/9781838989750/cover/smaller")
						,
					http("expertreadingstg_30")
						.get(uri01 + "/9781785280009/cover/smaller")
						,
					http("expertreadingstg_31")
						.get(uri01 + "/9781839212062/cover/smaller")
						,
					http("expertreadingstg_32")
						.get(uri01 + "/9781789348347/cover/smaller")
						,
					http("expertreadingstg_33")
						.get(uri01 + "/9781838984847/cover/smaller")
						,
					http("expertreadingstg_34")
						.get(uri01 + "/9781789802566/cover/smaller")
						,
					http("expertreadingstg_35")
						.get(uri01 + "/9781789801415/cover/smaller")
						,
					http("expertreadingstg_36")
						.get(uri01 + "/9781788993869/cover/smaller")
						,
					http("expertreadingstg_37")
						.get(uri01 + "/9781838989354/cover/smaller")
						,
					http("expertreadingstg_38")
						.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
						,
					http("expertreadingstg_39")
						.get(uri01 + "/9781800206168/cover/smaller")
						,
					http("expertreadingstg_40")
						.get(uri01 + "/9781788996662/cover/smaller")
						,
					http("expertreadingstg_41")
						.get(uri01 + "/9781839219931/cover/smaller")
						,
					http("expertreadingstg_42")
						.get(uri01 + "/9781800568105/cover/smaller")
						,
					http("expertreadingstg_43")
						.get(uri01 + "/9781839217715/cover/smaller")
						 ,
					http("expertreadingstg_44")
						.get("/images/chevron--orange.svg")
						 ,
					http("expertreadingstg_45")
						.get(uri01 + "/9781839215414/cover/smaller")
						 ,
					http("expertreadingstg_46")
						.get(uri01 + "/9781788834094/cover/smaller")
						 ,
					http("expertreadingstg_47")
						.get(uri01 + "/9781838640163/cover/smaller")
						 ,
					http("expertreadingstg_48")
						.get(uri01 + "/9781838982973/cover/smaller")
						 ,
					http("expertreadingstg_49")
						.get(uri01 + "/9781800201538/cover/smaller")
						 ,
					http("expertreadingstg_50")
						.get(uri01 + "/9781789617313/cover/smaller")
						 ,
					http("expertreadingstg_51")
						.get(uri01 + "/9781838550189/cover/smaller")
						 ,
					http("expertreadingstg_52")
						.get(uri01 + "/9781838982669/cover/smaller")
						 ,
					http("expertreadingstg_53")
						.get(uri01 + "/9781787129191/cover/smaller")
						 ,
					http("expertreadingstg_54")
						.get(uri01 + "/9781839210662/cover/smaller")
						 ,
					http("expertreadingstg_55")
						.get(uri01 + "/9781788837866/cover/smaller")
						 ,
					http("expertreadingstg_56")
						.get(uri01 + "/9781789530728/cover/smaller")
						 ,
					http("expertreadingstg_57")
						.get(uri01 + "/9781789533972/cover/smaller")
						 ,
					http("expertreadingstg_58")
						.get(uri01 + "/9781838648800/cover/smaller")
						 ,
					http("expertreadingstg_59")
						.get(uri01 + "/9781800207806/cover/smaller")
						 ,
					http("expertreadingstg_60")
						.get(uri01 + "/9781800560338/cover/smaller")
						 ,
					http("expertreadingstg_61")
						.get(uri01 + "/9781800203389/cover/smaller")
						 ,
					http("expertreadingstg_62")
						.get(uri01 + "/9781789805864/cover/smaller")
						 ,
					http("expertreadingstg_63")
						.get(uri01 + "/9781838642730/cover/smaller")
						 ,
					http("expertreadingstg_64")
						.get(uri01 + "/9781838642006/cover/smaller")
						 ,
					http("expertreadingstg_65")
						.get(uri01 + "/9781838552183/cover/smaller")
						 ,
					http("expertreadingstg_66")
						.get(uri01 + "/9781801070638/cover/smaller")
						 ,
					http("expertreadingstg_67")
						.get(uri01 + "/9781839211140/cover/smaller")
						 ,
					http("expertreadingstg_68")
						.get(uri01 + "/9781788392570/cover/smaller")
						 ,
					http("expertreadingstg_69")
						.get(uri01 + "/9781800565661/cover/smaller")
						 ,
					http("expertreadingstg_70")
						.get(uri01 + "/9781789955248/cover/smaller")
						 ,
					http("expertreadingstg_71")
						.get(uri01 + "/9781800560444/cover/smaller")
						 ,
					http("expertreadingstg_72")
						.get(uri01 + "/9781838826031/cover/smaller")
						 ,
					http("expertreadingstg_73")
						.get(uri01 + "/9781800567184/cover/smaller")
						 ,
					http("expertreadingstg_74")
						.get(uri01 + "/9781800208988/cover/smaller")
						 ,
					http("expertreadingstg_75")
						.get(uri01 + "/9781789346091/cover/smaller")
						 ,
					http("expertreadingstg_76")
						.get(uri01 + "/9781839216541/cover/smaller")
						 ,
					http("expertreadingstg_77")
						.get(uri01 + "/9781838552657/cover/smaller")
						 ,
					http("expertreadingstg_78")
						.get(uri01 + "/9781838559335/cover/smaller")
						 ,
					http("expertreadingstg_79")
						.get(uri01 + "/9781800206014/cover/smaller")
						 ,
					http("expertreadingstg_80")
						.get(uri01 + "/9781838981952/cover/smaller")
						 ,
					http("expertreadingstg_81")
						.get(uri01 + "/9781789805789/cover/smaller")
						 ,
					http("expertreadingstg_82")
						.get(uri01 + "/9781838554491/cover/smaller")
						 ,
					http("expertreadingstg_83")
						.get(uri01 + "/9781789616194/cover/smaller")
						 ,
					http("expertreadingstg_84")
						.get(uri01 + "/9781800564244/cover/smaller")
						 ,
					http("expertreadingstg_85")
						.get(uri01 + "/9781838558758/cover/smaller")
						 ,
					http("expertreadingstg_86")
						.get(uri01 + "/9781789611809/cover/smaller")
						 ,
					http("expertreadingstg_87")
						.get(uri01 + "/9781838987428/cover/smaller")
						 ,
					http("expertreadingstg_88")
						.get(uri01 + "/9781838987572/cover/smaller")
						 ,
					http("expertreadingstg_89")
						.get(uri01 + "/9781839214110/cover/smaller")
						 ,
					http("expertreadingstg_90")
						.get(uri01 + "/9781839217470/cover/smaller")
						 ,
					http("expertreadingstg_91")
						.get(uri01 + "/9781839215865/cover/smaller")
						 ,
					http("expertreadingstg_92")
						.get(uri01 + "/9781789134964/cover/smaller")
						 ,
					http("expertreadingstg_93")
						.get(uri01 + "/9781789952308/cover/smaller")
						 ,
					http("expertreadingstg_94")
						.get(uri01 + "/9781838641917/cover/smaller")
						 ,
					http("expertreadingstg_95")
						.get(uri01 + "/9781789340563/cover/smaller")
						 ,
					http("expertreadingstg_96")
						.get(uri01 + "/9781839211560/cover/smaller")
						 ,
					http("expertreadingstg_97")
						.get(uri01 + "/9781800561571/cover/smaller")
						 ,
					http("expertreadingstg_98")
						.get(uri01 + "/9781838644482/cover/smaller")
						 ,
					http("expertreadingstg_99")
						.get(uri01 + "/9781789957648/cover/smaller")
						 ,
					http("expertreadingstg_100")
						.get(uri01 + "/9781789801736/cover/smaller")
						 ,
					http("expertreadingstg_101")
						.get(uri01 + "/9781800209749/cover/smaller")
						 ,
					http("expertreadingstg_102")
						.get(uri01 + "/9781789136159/cover/smaller")
						 ,
					http("expertreadingstg_103")
						.get(uri01 + "/9781800562158/cover/smaller")
						 ,
					http("expertreadingstg_104")
						.get(uri01 + "/9781788297233/cover/smaller")
						 ,
					http("expertreadingstg_105")
						.get(uri01 + "/9781838986698/cover/smaller")
						 ,
					http("expertreadingstg_106")
						.get(uri01 + "/9781839211195/cover/smaller")
						 ,
					http("expertreadingstg_107")
						.get(uri01 + "/9781789536058/cover/smaller")
						 ,
					http("expertreadingstg_108")
						.get(uri01 + "/9781839211539/cover/smaller")
						 ,
					http("expertreadingstg_109")
						.get(uri01 + "/9781838827472/cover/smaller")
						 ,
					http("expertreadingstg_110")
						.get(uri01 + "/9781839219535/cover/smaller")
						 ,
					http("expertreadingstg_111")
						.get(uri01 + "/9781839211898/cover/smaller")
						 ,
					http("expertreadingstg_112")
						.get(uri01 + "/9781789133967/cover/smaller")
						 ,
					http("expertreadingstg_113")
						.get(uri01 + "/9781800560963/cover/smaller")
						 ,
					http("expertreadingstg_114")
						.get(uri01 + "/9781838646677/cover/smaller")
						 ,
					http("expertreadingstg_115")
						.get(uri01 + "/9781800207455/cover/smaller")
						 ,
					http("expertreadingstg_116")
						.get(uri01 + "/9781839219436/cover/smaller")
						 ,
					http("expertreadingstg_117")
						.get(uri01 + "/9781789342758/cover/smaller")
						 ,
					http("expertreadingstg_118")
						.get(uri01 + "/9781800207080/cover/smaller")
						 ,
					http("expertreadingstg_119")
						.get(uri01 + "/9781800560819/cover/smaller")
						 ,
					http("expertreadingstg_120")
						.get(uri01 + "/9781838647773/cover/smaller")
						 ,
					http("expertreadingstg_121")
						.get(uri01 + "/9781839213793/cover/smaller")
						 ,
					http("expertreadingstg_122")
						.get(uri01 + "/9781838826734/cover/smaller")
						 ,
					http("expertreadingstg_123")
						.get(uri01 + "/9781788996082/cover/smaller")
						 ,
					http("expertreadingstg_124")
						.get(uri01 + "/9781789532463/cover/smaller")
						 ,
					http("expertreadingstg_125")
						.get(uri01 + "/9781788399210/cover/smaller")
						 ,
					http("expertreadingstg_126")
						.get(uri01 + "/9781838823382/cover/smaller")
						 ,
					http("expertreadingstg_127")
						.get(uri01 + "/9781838989217/cover/smaller")
						 ,
					http("expertreadingstg_128")
						.get(uri01 + "/9781838826994/cover/smaller")
						 ,
					http("expertreadingstg_129")
						.get(uri01 + "/9781838826789/cover/smaller")
						 ,
					http("expertreadingstg_130")
						.get(uri01 + "/9781800561878/cover/smaller")
						 ,
					http("expertreadingstg_131")
						.get(uri01 + "/9781789530513/cover/smaller")
						 ,
					http("expertreadingstg_132")
						.get(uri01 + "/9781839211256/cover/smaller")
						 ,
					http("expertreadingstg_133")
						.get(uri01 + "/9781788994729/cover/smaller")
						 ,
					http("expertreadingstg_134")
						.get(uri01 + "/9781789615555/cover/smaller")
						 ,
					http("expertreadingstg_135")
						.get(uri01 + "/9781800200937/cover/smaller")
						 ,
					http("expertreadingstg_136")
						.get(uri01 + "/9781838648176/cover/smaller")
						 ,
					http("expertreadingstg_137")
						.get(uri01 + "/9781838649005/cover/smaller")
						 ,
					http("expertreadingstg_138")
						.get(uri01 + "/9781800563766/cover/smaller")
						 ,
					http("expertreadingstg_139")
						.get(uri01 + "/9781800208919/cover/smaller")
						 ,
					http("expertreadingstg_140")
						.get(uri01 + "/9781789807554/cover/smaller")
						 ,
					http("expertreadingstg_141")
						.get(uri01 + "/9781800200364/cover/smaller")
						 ,
					http("expertreadingstg_142")
						.get(uri01 + "/9781838647520/cover/smaller")
						 ,
					http("expertreadingstg_143")
						.get(uri01 + "/9781838986094/cover/smaller")
						 ,
					http("expertreadingstg_144")
						.get(uri01 + "/9781800209770/cover/smaller")
						 ,
					http("expertreadingstg_145")
						.get(uri01 + "/9781838984137/cover/smaller")
						 ,
					http("expertreadingstg_146")
						.get(uri01 + "/9781839214660/cover/smaller")
						 ,
					http("expertreadingstg_147")
						.get(uri01 + "/9781789619782/cover/smaller")
						 ,
					http("expertreadingstg_148")
						.get(uri01 + "/9781789349795/cover/smaller")
						 ,
					http("expertreadingstg_149")
						.get(uri01 + "/9781839215421/cover/smaller")
						 ,
					http("expertreadingstg_150")
						.get(uri01 + "/9781839212505/cover/smaller")
						 ,
					http("expertreadingstg_151")
						.get(uri01 + "/9781838981860/cover/smaller")
						 ,
					http("expertreadingstg_152")
						.post(uri11 + "?sv=7")
						.body(RawFileBody("staging/expertreadingstg/0152_request.txt")),
					http("expertreadingstg_153")
						.options(uri02 + "?source=user.set")
						 ,
					http("expertreadingstg_154")
						.put(uri02 + "?source=user.set")

						.body(RawFileBody("staging/expertreadingstg/0154_request.txt"))))
				.pause(1)
				.exec(http("expertreadingstg_155")
					.get(uri08 + "/")

					.resources(http("expertreadingstg_156")
						.get(uri09 + "/")
						 ,
						http("expertreadingstg_157")
							.get(uri06 + "/normandy.content-signature.mozilla.org-2021-08-30-15-16-01.chain?cachebust=2017-06-13-21-06")
							,
						http("expertreadingstg_158")
							.get(uri06 + "/normandy.content-signature.mozilla.org-2021-09-19-15-17-09.chain?cachebust=2017-06-13-21-06")
							))
				.pause(3)
				.exec(http("expertreadingstg_159")
					.get("/expert-reading-lists")

					.resources(http("expertreadingstg_160")
						.get("/css/bootstrap.css?id=5f2a70cbdf03024c4efb")
						 ,
						http("expertreadingstg_161")
							.get("/css/app.css?id=e413a60afd9a572e6baf")
							 ,
						http("expertreadingstg_162")
							.get(uri10 + "/css?family=Montserrat")
							 ,
						http("expertreadingstg_163")
							.get(uri10 + "/css?family=Nunito")
							 ,
						http("expertreadingstg_164")
							.get(uri10 + "/css2?family=Roboto+Mono:wght@500&display=swap")
							 ,
						http("expertreadingstg_165")
							.get(uri03 + "?id=GTM-WJMM825")
							 ,
						http("expertreadingstg_166")
							.get("/fonts/gt_walsheim_pro_regular.woff2?dfb0ad28940a93f21ed4693aa748d0f9")
							 ,
						http("expertreadingstg_167")
							.get("/js/react.js?id=9c4b3f62a3bef2cf998b")
							 ,
						http("expertreadingstg_168")
							.get("/images/book.svg")
							 ,
						http("expertreadingstg_169")
							.get("/images/video.svg")
							 ,
						http("expertreadingstg_170")
							.get("/images/learning-path.svg")
							 ,
						http("expertreadingstg_171")
							.get("/fonts/vendor/font-awesome/fontawesome-webfont.woff2?af7ae505a9eed503f8b8e6982036873e")
							 ,
						http("expertreadingstg_172")
							.get("/api/expertreaders/contentful")
							 ,
						http("expertreadingstg_173")
							.get("/api/expertreaders/all")
							 ,
						http("expertreadingstg_174")
							.get(uri01 + "/9781800209718/cover/smaller")
							 ,
						http("expertreadingstg_175")
							.get(uri01 + "/9781800566927/cover/smaller")
							 ,
						http("expertreadingstg_176")
							.get(uri01 + "/9781800566002/cover/smaller")
							 ,
						http("expertreadingstg_177")
							.get(uri01 + "/9781789615852/cover/smaller")
							 ,
						http("expertreadingstg_178")
							.get(uri01 + "/9781789955750/cover/smaller")
							 ,
						http("expertreadingstg_179")
							.get(uri01 + "/9781839218859/cover/smaller")
							 ,
						http("expertreadingstg_180")
							.get(uri01 + "/9781788996662/cover/smaller")
							 ,
						http("expertreadingstg_181")
							.get(uri01 + "/9781838984847/cover/smaller")
							 ,
						http("expertreadingstg_182")
							.get(uri01 + "/9781789802566/cover/smaller")
							 ,
						http("expertreadingstg_183")
							.get(uri01 + "/9781785280009/cover/smaller")
							 ,
						http("expertreadingstg_184")
							.get(uri01 + "/9781838989750/cover/smaller")
							 ,
						http("expertreadingstg_185")
							.get(uri01 + "/9781789801415/cover/smaller")
							 ,
						http("expertreadingstg_186")
							.get(uri01 + "/9781839212062/cover/smaller")
							 ,
						http("expertreadingstg_187")
							.get(uri01 + "/9781782167105/cover/smaller")
							 ,
						http("expertreadingstg_188")
							.get(uri01 + "/9781839219931/cover/smaller")
							 ,
						http("expertreadingstg_189")
							.get(uri01 + "/9781788993869/cover/smaller")
							 ,
						http("expertreadingstg_190")
							.get(uri01 + "/9781789348347/cover/smaller")
							 ,
						http("expertreadingstg_191")
							.get(uri01 + "/9781839215414/cover/smaller")
							 ,
						http("expertreadingstg_192")
							.get(uri01 + "/9781839217715/cover/smaller")
							 ,
						http("expertreadingstg_193")
							.get(uri01 + "/9781838989354/cover/smaller")
							 ,
						http("expertreadingstg_194")
							.get("/images/chevron--orange.svg")
							 ,
						http("expertreadingstg_195")
							.get(uri01 + "/9781788834094/cover/smaller")
							 ,
						http("expertreadingstg_196")
							.get(uri01 + "/9781800206168/cover/smaller")
							 ,
						http("expertreadingstg_197")
							.get(uri01 + "/9781800568105/cover/smaller")
							 ,
						http("expertreadingstg_198")
							.get(uri01 + "/9781789617313/cover/smaller")
							 ,
						http("expertreadingstg_199")
							.get(uri01 + "/9781838982973/cover/smaller")
							 ,
						http("expertreadingstg_200")
							.get(uri01 + "/9781838640163/cover/smaller")
							 ,
						http("expertreadingstg_201")
							.get(uri01 + "/9781800201538/cover/smaller")
							 ,
						http("expertreadingstg_202")
							.get(uri01 + "/9781838550189/cover/smaller")
							 ,
						http("expertreadingstg_203")
							.get(uri01 + "/9781787129191/cover/smaller")
							 ,
						http("expertreadingstg_204")
							.get(uri01 + "/9781838982669/cover/smaller")
							 ,
						http("expertreadingstg_205")
							.get(uri01 + "/9781789533972/cover/smaller")
							,
						http("expertreadingstg_206")
							.get(uri01 + "/9781839210662/cover/smaller")
							,
						http("expertreadingstg_207")
							.get(uri01 + "/9781838648800/cover/smaller")
							,
						http("expertreadingstg_208")
							.get(uri01 + "/9781800560338/cover/smaller")
							,
						http("expertreadingstg_209")
							.get(uri01 + "/9781838642006/cover/smaller")
							,
						http("expertreadingstg_210")
							.get(uri01 + "/9781789530728/cover/smaller")
							,
						http("expertreadingstg_211")
							.get(uri01 + "/9781800203389/cover/smaller")
							,
						http("expertreadingstg_212")
							.get(uri01 + "/9781800207806/cover/smaller")
							,
						http("expertreadingstg_213")
							.get(uri01 + "/9781838642730/cover/smaller")
							,
						http("expertreadingstg_214")
							.get(uri01 + "/9781789805864/cover/smaller")
							 ,
						http("expertreadingstg_215")
							.get(uri01 + "/9781788837866/cover/smaller")
							 ,
						http("expertreadingstg_216")
							.get(uri01 + "/9781838552183/cover/smaller")
							 ,
						http("expertreadingstg_217")
							.get(uri01 + "/9781788392570/cover/smaller")
							 ,
						http("expertreadingstg_218")
							.get(uri01 + "/9781801070638/cover/smaller")
							 ,
						http("expertreadingstg_219")
							.get(uri01 + "/9781839211140/cover/smaller")
							 ,
						http("expertreadingstg_220")
							.get(uri01 + "/9781800560444/cover/smaller")
							 ,
						http("expertreadingstg_221")
							.get(uri01 + "/9781800565661/cover/smaller")
							 ,
						http("expertreadingstg_222")
							.get(uri01 + "/9781789346091/cover/smaller")
							 ,
						http("expertreadingstg_223")
							.get(uri01 + "/9781839216541/cover/smaller")
							 ,
						http("expertreadingstg_224")
							.get(uri01 + "/9781789955248/cover/smaller")
							 ,
						http("expertreadingstg_225")
							.get(uri01 + "/9781838552657/cover/smaller")
							 ,
						http("expertreadingstg_226")
							.get(uri01 + "/9781800208988/cover/smaller")
							 ,
						http("expertreadingstg_227")
							.get(uri01 + "/9781838559335/cover/smaller")
							 ,
						http("expertreadingstg_228")
							.get(uri01 + "/9781838826031/cover/smaller")
							 ,
						http("expertreadingstg_229")
							.get(uri01 + "/9781838981952/cover/smaller")
							 ,
						http("expertreadingstg_230")
							.get(uri01 + "/9781800206014/cover/smaller")
							 ,
						http("expertreadingstg_231")
							.get(uri01 + "/9781838987428/cover/smaller")
							 ,
						http("expertreadingstg_232")
							.get(uri01 + "/9781838554491/cover/smaller")
							 ,
						http("expertreadingstg_233")
							.get(uri01 + "/9781789616194/cover/smaller")
							 ,
						http("expertreadingstg_234")
							.get(uri01 + "/9781838987572/cover/smaller")
							 ,
						http("expertreadingstg_235")
							.get(uri01 + "/9781800567184/cover/smaller")
							 ,
						http("expertreadingstg_236")
							.get(uri01 + "/9781839214110/cover/smaller")
							 ,
						http("expertreadingstg_237")
							.get(uri01 + "/9781800564244/cover/smaller")
							 ,
						http("expertreadingstg_238")
							.get(uri01 + "/9781789805789/cover/smaller")
							 ,
						http("expertreadingstg_239")
							.get(uri01 + "/9781789952308/cover/smaller")
							 ,
						http("expertreadingstg_240")
							.get(uri01 + "/9781838558758/cover/smaller")
							 ,
						http("expertreadingstg_241")
							.get(uri01 + "/9781789340563/cover/smaller")
							 ,
						http("expertreadingstg_242")
							.get(uri01 + "/9781789611809/cover/smaller")
							 ,
						http("expertreadingstg_243")
							.get(uri01 + "/9781839217470/cover/smaller")
							 ,
						http("expertreadingstg_244")
							.get(uri01 + "/9781789957648/cover/smaller")
							 ,
						http("expertreadingstg_245")
							.get(uri01 + "/9781838641917/cover/smaller")
							 ,
						http("expertreadingstg_246")
							.get(uri01 + "/9781839211560/cover/smaller")
							 ,
						http("expertreadingstg_247")
							.get(uri01 + "/9781839215865/cover/smaller")
							 ,
						http("expertreadingstg_248")
							.get(uri01 + "/9781788297233/cover/smaller")
							 ,
						http("expertreadingstg_249")
							.get(uri01 + "/9781838644482/cover/smaller")
							 ,
						http("expertreadingstg_250")
							.get(uri01 + "/9781838986698/cover/smaller")
							 ,
						http("expertreadingstg_251")
							.get(uri01 + "/9781800561571/cover/smaller")
							 ,
						http("expertreadingstg_252")
							.get(uri01 + "/9781789134964/cover/smaller")
							 ,
						http("expertreadingstg_253")
							.get(uri01 + "/9781789801736/cover/smaller")
							 ,
						http("expertreadingstg_254")
							.get(uri01 + "/9781800209749/cover/smaller")
							 ,
						http("expertreadingstg_255")
							.get(uri01 + "/9781800562158/cover/smaller")
							 ,
						http("expertreadingstg_256")
							.get(uri01 + "/9781789136159/cover/smaller")
							 ,
						http("expertreadingstg_257")
							.get(uri01 + "/9781839211195/cover/smaller")
							 ,
						http("expertreadingstg_258")
							.get(uri01 + "/9781839211539/cover/smaller")
							 ,
						http("expertreadingstg_259")
							.get(uri01 + "/9781839219535/cover/smaller")
							 ,
						http("expertreadingstg_260")
							.get(uri01 + "/9781838827472/cover/smaller")
							 ,
						http("expertreadingstg_261")
							.get(uri01 + "/9781839211898/cover/smaller")
							 ,
						http("expertreadingstg_262")
							.get(uri01 + "/9781789133967/cover/smaller")
							 ,
						http("expertreadingstg_263")
							.get(uri01 + "/9781789536058/cover/smaller")
							 ,
						http("expertreadingstg_264")
							.get(uri01 + "/9781800560963/cover/smaller")
							 ,
						http("expertreadingstg_265")
							.get(uri01 + "/9781839219436/cover/smaller")
							 ,
						http("expertreadingstg_266")
							.get(uri01 + "/9781838646677/cover/smaller")
							 ,
						http("expertreadingstg_267")
							.get(uri01 + "/9781789342758/cover/smaller")
							 ,
						http("expertreadingstg_268")
							.get(uri01 + "/9781800560819/cover/smaller")
							 ,
						http("expertreadingstg_269")
							.get(uri01 + "/9781800207080/cover/smaller")
							 ,
						http("expertreadingstg_270")
							.get(uri01 + "/9781839213793/cover/smaller")
							 ,
						http("expertreadingstg_271")
							.get(uri01 + "/9781800207455/cover/smaller")
							 ,
						http("expertreadingstg_272")
							.get(uri01 + "/9781838647773/cover/smaller")
							 ,
						http("expertreadingstg_273")
							.get(uri01 + "/9781838826734/cover/smaller")
							 ,
						http("expertreadingstg_274")
							.get(uri01 + "/9781838989217/cover/smaller")
							 ,
						http("expertreadingstg_275")
							.get(uri01 + "/9781788996082/cover/smaller")
							 ,
						http("expertreadingstg_276")
							.get(uri01 + "/9781838826994/cover/smaller")
							 ,
						http("expertreadingstg_277")
							.get(uri01 + "/9781789532463/cover/smaller")
							 ,
						http("expertreadingstg_278")
							.get(uri01 + "/9781788399210/cover/smaller")
							 ,
						http("expertreadingstg_279")
							.get(uri01 + "/9781838823382/cover/smaller")
							 ,
						http("expertreadingstg_280")
							.get(uri01 + "/9781789530513/cover/smaller")
							 ,
						http("expertreadingstg_281")
							.get(uri01 + "/9781838826789/cover/smaller")
							 ,
						http("expertreadingstg_282")
							.get(uri01 + "/9781789615555/cover/smaller")
							 ,
						http("expertreadingstg_283")
							.get(uri01 + "/9781800561878/cover/smaller")
							 ,
						http("expertreadingstg_284")
							.get(uri01 + "/9781839211256/cover/smaller")
							 ,
						http("expertreadingstg_285")
							.get(uri01 + "/9781838648176/cover/smaller")
							 ,
						http("expertreadingstg_286")
							.get(uri01 + "/9781800200937/cover/smaller")
							 ,
						http("expertreadingstg_287")
							.get(uri01 + "/9781838649005/cover/smaller")
							 ,
						http("expertreadingstg_288")
							.get(uri01 + "/9781800563766/cover/smaller")
							 ,
						http("expertreadingstg_289")
							.get(uri01 + "/9781800208919/cover/smaller")
							 ,
						http("expertreadingstg_290")
							.get(uri01 + "/9781800200364/cover/smaller")
							 ,
						http("expertreadingstg_291")
							.get(uri01 + "/9781838647520/cover/smaller")
							 ,
						http("expertreadingstg_292")
							.get(uri01 + "/9781838984137/cover/smaller")
							 ,
						http("expertreadingstg_293")
							.get(uri01 + "/9781788994729/cover/smaller")
							 ,
						http("expertreadingstg_294")
							.get(uri01 + "/9781789807554/cover/smaller")
							 ,
						http("expertreadingstg_295")
							.get(uri01 + "/9781838986094/cover/smaller")
						,
						http("expertreadingstg_296")
							.get(uri01 + "/9781800209770/cover/smaller")
							 ,
						http("expertreadingstg_297")
							.get(uri01 + "/9781839214660/cover/smaller")
							 ,
						http("expertreadingstg_298")
							.get(uri01 + "/9781789349795/cover/smaller")
							 ,
						http("expertreadingstg_299")
							.get(uri01 + "/9781789619782/cover/smaller")
							 ,
						http("expertreadingstg_300")
							.get(uri01 + "/9781839212505/cover/smaller")
							 ,
						http("expertreadingstg_301")
							.get(uri01 + "/9781839215421/cover/smaller")
							 ,
						http("expertreadingstg_302")
							.get(uri01 + "/9781838981860/cover/smaller")
							 ))
				.pause(2)
				.exec(http("expertreadingstg_303")
					.get("/api/expertreaders/url/building-a-strong-foundation-in-python")

					.resources(http("expertreadingstg_304")
						.get(uri04 + "/9781788996662/cover/smaller")
						 ,
						http("expertreadingstg_305")
							.get(uri04 + "/9781839218859/cover/smaller")
							 ,
						http("expertreadingstg_306")
							.get(uri04 + "/9781789801217/cover/smaller")
							 ,
						http("expertreadingstg_307")
							.get(uri04 + "/9781789615852/cover/smaller")
							 ,
						http("expertreadingstg_308")
							.get(uri04 + "/9781788837484/cover/smaller")
							 ))
				.pause(1)
				.exec(http("expertreadingstg_309")
					.post("/cdn-cgi/rum?req_id=681b1d195a792d04")

					.body(RawFileBody("staging/expertreadingstg/0309_request.json"))
					.resources(http("expertreadingstg_310")
						.post(uri11 + "?sv=7")

						.body(RawFileBody("staging/expertreadingstg/0310_request.txt")),
						http("expertreadingstg_311")
							.get("/api/expertreaders/url/building-a-strong-foundation-in-python")
							 ))
		}


	val scn = scenario("expertreadingstg").exec(StagingExpertReading.expertreading)
	setUp(scn.inject(nothingFor(5),
		atOnceUsers(users =1),
		rampUsers(users = 5)during(10),
		constantUsersPerSec(rate = 15) during(20)
	))
		.protocols(httpProtocol)
}