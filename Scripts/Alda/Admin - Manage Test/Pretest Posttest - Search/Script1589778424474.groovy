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

WebUI.callTestCase(findTestCase('Rizka/Admin - Login'), [('username') : '11666', ('password') : 'Password3', ('rememberMe') : 'yes'
        , ('condition') : 'passed'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Alda/Admin - Manage Test/Page_Dashboard Admin/btn_manage_test'))

WebUI.click(findTestObject('Alda/Admin - Manage Test/Page_Dashboard Admin/btn_pretest_dan_posttest'))

WebUI.click(findTestObject('Alda/Admin - Manage Test/Page_Manage Test/click_search'))

WebUI.setText(findTestObject('Alda/Admin - Manage Test/Page_Manage Test/input_search'), var_search)

WebUI.sendKeys(findTestObject('Alda/Admin - Manage Test/Page_Manage Test/click_search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

if (expected_output == 'found') {
    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage Test/Page_Manage Test/tap_row', [('variable') : var_search]))
} else if (expected_output == 'not found') {
    WebUI.click(findTestObject('Alda/Admin - Manage Test/Page_Manage Test/alert_no_data_found'))
}

WebUI.delay(3)

