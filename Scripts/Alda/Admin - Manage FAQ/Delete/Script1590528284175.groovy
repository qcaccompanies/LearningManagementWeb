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

WebUI.callTestCase(findTestCase('Alda/Admin - Manage FAQ/Search'), [('var_search') : var_search, ('expected_output') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_delete (1)'))

if (expected_output == 'delete') {
    WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/btn_yes_delete'))

    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_searching_not_found'))
} else if (expected_output == 'cancel') {
    WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/btn_no_delete'))

    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_search_visible', [('text') : var_search]))
}

