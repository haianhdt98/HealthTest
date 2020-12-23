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

WebUI.navigateToUrl('https://mazii.net/')

WebUI.setText(findTestObject('Object Repository/Page_Mazii - Japanese dictionary , Japanese_870bf7/input_JA - EN_search-text-box'), 
    'tiền')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mazii - Japanese dictionary , Japanese_870bf7/input_JA - EN_search-text-box'), 
    Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('Object Repository/Page_Mazii - Japanese dictionary , Japanese_870bf7/input_JA - EN_search-text-box'))

WebUI.setText(findTestObject('Object Repository/Page_Mazii - Japanese dictionary , Japanese_870bf7/input_JA - EN_search-text-box'), 
    '稲')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mazii - Japanese dictionary , Japanese_870bf7/input_JA - EN_search-text-box'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Meaning of word        Mazii - Japanes_0230f9/input_JA - EN_search-text-box'), 
    '犬')

WebUI.sendKeys(findTestObject('Object Repository/Page_Meaning of word        Mazii - Japanes_0230f9/input_JA - EN_search-text-box'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Meaning of word        Mazii - Japanes_0230f9/button_Kanji'))

WebUI.closeBrowser()

