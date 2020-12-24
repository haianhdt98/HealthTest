import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

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

