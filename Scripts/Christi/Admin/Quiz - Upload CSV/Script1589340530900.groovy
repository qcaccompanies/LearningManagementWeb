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

WebUI.callTestCase(findTestCase('Christi/Admin/admin login'), [('username') : '11666', ('password') : 'Password3'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Christi/Page_Dashboard Admin/button_Manage Test'), 0)

WebUI.click(findTestObject('Object Repository/Christi/Page_Dashboard Admin/button_Manage Test'))

WebUI.click(findTestObject('Object Repository/Christi/Page_Dashboard Admin/a_Quiz'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/Christi/Page_Manage Quiz/input_Clear button_files'), file_upload)

if (expected == 'pass') {
    WebUI.getAlertText()
} else if (expected == 'fail') {
    if (status == 'file size to big') {
        WebUI.verifyElementPresent(findTestObject('Object Repository/Christi/Page_Manage Quiz/div_File size exceeded limit Max upload siz_477814'), 
            0)
    } else if (status == 'wrong file type') {
        WebUI.acceptAlert()
    }
}

WebUI.delay(3)

not_run: WebUI.closeBrowser()

