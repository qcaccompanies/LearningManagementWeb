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

WebUI.callTestCase(findTestCase('Alda/Admin - Manage FAQ/Search'), [('var_search') : var_search, ('expected_output') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_edit (1)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/header_edit_page'))

switch (opsi_edit) {
    case 'all':
        WebUI.clearText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_question'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_question'), var_question_new)

        WebUI.clearText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_answer'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_answer'), var_answer_new)

        WebUI.uploadFile(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_gambar'), var_gambar_new)

        if (expected_image == 'success') {
            WebUI.verifyElementVisible(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/alert_success_upload_image'))

            WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'))

            WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'), var_tag_new)

            WebUI.sendKeys(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'), Keys.chord(Keys.ENTER))
        } else if (expected_image == 'error') {
            WebUI.verifyElementVisible(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/alert_error_upload_image'))
        }
        
        break
    case 'question_only':
        WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_question'), FailureHandling.STOP_ON_FAILURE)

        WebUI.clearText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_question'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_question'), var_question_new)

        break
    case 'answer_only':
        WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_answer'), FailureHandling.STOP_ON_FAILURE)

        WebUI.clearText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_answer'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_answer'), var_answer_new)

        break
    case 'picture_only':
        WebUI.uploadFile(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_gambar'), var_gambar_new)

        if (expected_image == 'success') {
            WebUI.verifyElementVisible(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/alert_success_upload_image'))
        } else if (expected_image == 'error') {
            WebUI.verifyElementVisible(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/alert_error_upload_image'))
        }
        
        break
    case 'tag_only':
        WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_tag'))

        WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_tag'), var_tag_new)

        WebUI.sendKeys(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_tag'), Keys.chord(Keys.ENTER))

        break
}

switch (expected_output) {
    case 'pass':
        WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

        WebUI.delay(3)

        WebUI.clearText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

        WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

        WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search_after_edit)

        WebUI.sendKeys(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), Keys.chord(Keys.ENTER))

        WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_search_visible - Copy', 
                [('text') : var_search_after_edit]))

        break
    case 'pass_image':
        WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/alert_edit_success'), 
            FailureHandling.OPTIONAL)

        WebUI.delay(3)

        WebUI.clearText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

        WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

        WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search)

        WebUI.sendKeys(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), Keys.chord(Keys.ENTER))

        WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_search_visible - Copy', 
                [('text') : var_search_after_edit]))

        WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_edit (1)'))

        break
    case 'fail':
        WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/alert_error_new_faq'))

        WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/btn_ok_error'))

        break
    case 'cancel':
        WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_cancel_edit'))

        break
}

