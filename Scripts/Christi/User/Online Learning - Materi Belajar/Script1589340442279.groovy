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

WebUI.callTestCase(findTestCase('Christi/User/user login'), [('username') : '06677', ('password') : '#@ccPerfect2o19#'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Christi/Page_Job Functions/input_Back button_searchModul'), nama_modul)

WebUI.click(findTestObject('Object Repository/Christi/Page_Job Functions/button_Clear button_app-search-button wi wi-search'))

WebUI.delay(3)

if (found == 'yes') {
    WebUI.verifyElementPresent(findTestObject('Christi/Page_Online Learning Search Result/label_Ditemukan modul dengan kata kunci'), 
        0)

    WebUI.delay(3)

    WebUI.click(findTestObject('Christi/Page_Online Learning Search Result/span_Lihat Modul'))

    WebUI.delay(3)

    if (status == 'new') {
        WebUI.click(findTestObject('Christi/Page_Online Learning Detail/button_Mulai Modul'), FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.delay(3)

    WebUI.click(findTestObject('Christi/Page_Online Learning Detail/label_menu_Pre-Test', [('text') : nama_materi]))

    WebUI.delay(3)

    WebUI.click(findTestObject('Christi/Page_Online Learning Detail/li_submenu_Pre-Test', [('text') : sub_materi]))

    if (expected == 'pass') {
        WebUI.verifyElementPresent(findTestObject('Christi/Page_Online Learning Detail/label_Pre-Test_oranye', [('text') : sub_materi]), 
            0)
    } else if (expected == 'fail') {
        WebUI.verifyElementPresent(findTestObject('Christi/Page_Online Learning Detail/label_Maaf bagian ini masih terkunci Silahkan buka bagian sebelumnya ya )'), 
            0)
    }
} else if (found == 'no') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Christi/Page_Online Learning Search Result/label_tidak ditemukan'), 
        0)
}

WebUI.closeBrowser()

