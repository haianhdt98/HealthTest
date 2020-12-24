import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dict.laban.vn/')

WebUI.setText(findTestObject('Object Repository/Page_CAT - Tm kim  Laban Dictionary - T in _9191bb/input_Laban Dictionary - T din Anh Vit, Vit_a235b8'), 
    'hello')

WebUI.click(findTestObject('Object Repository/Page_CAT - Tm kim  Laban Dictionary - T in _9191bb/span_hello'))

WebUI.click(findTestObject('Object Repository/Page_hello - Tm kim  Laban Dictionary - T i_5326f0/input_Laban Dictionary - T din Anh Vit, Vit_a235b8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_hello - Tm kim  Laban Dictionary - T i_5326f0/select_Anh - Vit                Vit - Anh  _fd5ee1'), 
    '_vi', true)

WebUI.setText(findTestObject('Object Repository/Page_hello - Tm kim  Laban Dictionary - T i_5326f0/input_Laban Dictionary - T din Anh Vit, Vit_a235b8_1'), 
    'phong cảnh')

WebUI.click(findTestObject('Object Repository/Page_hello - Tm kim  Laban Dictionary - T i_5326f0/a_Tra t'))

WebUI.click(findTestObject('Object Repository/Page_phong cnh - Tm kim  Laban Dictionary -_a4dfbc/div_lanscape, scenery,sight'))

WebUI.click(findTestObject('Object Repository/Page_phong cnh - Tm kim  Laban Dictionary -_a4dfbc/div_Chng ti ngng li  xem phong cnh'))

WebUI.click(findTestObject('Object Repository/Page_phong cnh - Tm kim  Laban Dictionary -_a4dfbc/h2_Laban.vn'))

WebUI.click(findTestObject('Object Repository/Page_phong cnh - Tm kim  Laban Dictionary -_a4dfbc/a_Laban Dictionary - T din Anh Vit, Vit Anh'))

WebUI.closeBrowser()

