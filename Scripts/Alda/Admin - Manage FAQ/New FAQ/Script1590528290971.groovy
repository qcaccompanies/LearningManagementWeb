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

WebUI.click(findTestObject('Christi/Page_Dashboard Admin/span_Manage FAQ'))

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_new_faq'))

WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_question'), var_question)

WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_answer'), var_answer)

if (optional_gambar == 'ya') {
    WebUI.uploadFile(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_gambar'), var_gambar, FailureHandling.STOP_ON_FAILURE)

    if (expected_image == 'error') {
        WebUI.verifyElementVisible(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/alert_error_upload_image'))
    }
}

if (optional_tag == 'ya') {
    WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'), var_tag, FailureHandling.STOP_ON_FAILURE)

    WebUI.sendKeys(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save'))

if (expected_output == 'pass') {
    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_new_faq_success', [('text') : var_question]))
} else if (expected_output == 'fail') {
    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/alert_error_new_faq'))

    WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/btn_ok_error'))
}

