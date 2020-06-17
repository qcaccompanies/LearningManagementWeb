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

WebUI.delay(5)

WebUI.click(findTestObject('Christi/Page_Dashboard Admin/span_Manage FAQ'))

WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search)

WebUI.click(findTestObject('Christi/Page_Manage Faq/button_Clear button_app-search-button wi wi-search'), FailureHandling.STOP_ON_FAILURE)

if (expected_search == 'found') {
    WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_delete (1)'))

    if (expected_delete == 'delete') {
        WebUI.click(findTestObject('Christi/Page_Manage Faq/span_YA'))

        WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_searching_not_found'))
    } else if (expected_delete == 'cancel') {
        WebUI.click(findTestObject('Christi/Page_Manage Faq/span_TIDAK'))

        WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_search_visible', [('text') : var_search]))
    }
} else if (expected_search == 'not found') {
    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_searching_not_found'))
}

