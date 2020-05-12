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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://appsrv1.deltadatamandiri.com/ACC_LMS_WEB/#/Main')

WebUI.click(findTestObject('Object Repository/Christi/Page_Main/span_login'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Christi/Page_Main/input_NPK_username'), username)

WebUI.setText(findTestObject('Object Repository/Christi/Page_Main/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/Christi/Page_Main/span_Remember me'))

WebUI.click(findTestObject('Object Repository/Christi/Page_Main/span_login_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Christi/Page_Homepage/i_My Learning Icon_app-icon wi wi-menu fa-lg'))

WebUI.click(findTestObject('Christi/Page_Homepage/span_Online Learning'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Christi/Page_Job Functions/input_Back button_searchModul'), search_module)

WebUI.click(findTestObject('Object Repository/Christi/Page_Job Functions/button_Clear button_app-search-button wi wi-search'))

WebUI.delay(3)

if (expected == 'pass') {
    WebUI.verifyElementPresent(findTestObject('Christi/Page_Online Learning Search Result/label_Ditemukan modul dengan kata kunci'), 
        0)
} else if (expected == 'fail') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Christi/Page_Online Learning Search Result/label_tidak ditemukan'), 
        0)
}

WebUI.closeBrowser()

