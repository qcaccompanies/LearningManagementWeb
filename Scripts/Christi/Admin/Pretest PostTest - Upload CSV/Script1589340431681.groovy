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

WebUI.callTestCase(findTestCase('Christi/Admin/admin login'), [('username') : '11666', ('password') : 'Password3'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Christi/Page_Dashboard Admin/button_Test Management'), 0)

WebUI.click(findTestObject('Christi/Page_Dashboard Admin/button_Test Management'))

WebUI.delay(3)

WebUI.click(findTestObject('Christi/Page_Dashboard Admin/span_Pre-Test  Post-Test'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Test/label_Manage Pre-Test dan Post-Test'), 0)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Christi/Page_Manage Test/input_Clear button_files'), file_upload)

if (expected == 'pass') {
    WebUI.delay(30, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Alda/Admin - Manage Test/Page_Manage Test/click_search'))

    WebUI.setText(findTestObject('Alda/Admin - Manage Test/Page_Manage Test/input_search'), soal)

    WebUI.click(findTestObject('Christi/Page_Manage Test/button_search'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Test/label_isi_soal_pretest_postest', [('text') : soal]), 
        0)
} else if (expected == 'fail') {
    if (status == 'error, expected file csv') {
        WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Test/div_Expected file extension is csv'), 0)
    } else if (status == 'Some header missing or invalid') {
        WebUI.acceptAlert()
    }
}

