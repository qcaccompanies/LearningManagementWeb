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

WebUI.delay(5)

WebUI.click(findTestObject('Christi/Page_Dashboard Admin/span_Manage FAQ'))

WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search)

WebUI.click(findTestObject('Christi/Page_Manage Faq/button_Clear button_app-search-button wi wi-search'), FailureHandling.STOP_ON_FAILURE)

if (expected_search == 'found') {
    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_search_visible', [('text') : var_search]))

    WebUI.delay(5)

    WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/btn_edit'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/header_edit_page'))

    switch (opsi_edit.toString()) {
        case 'all':
            WebUI.clearText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_question'), FailureHandling.STOP_ON_FAILURE)

            if (var_question_new != '') {
                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_question'), var_question_new)
            }
            
            WebUI.delay(3)

            WebUI.clearText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_answer'), FailureHandling.STOP_ON_FAILURE)

            if (var_answer_new != '') {
                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_answer'), var_answer_new)
            }
            
            WebUI.delay(3)

            WebUI.uploadFile(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_gambar'), var_gambar_new)

            if (var_gambar_new != '') {
                if (expected_image == 'file to big') {
                    WebUI.verifyElementPresent(findTestObject('Alda/Page_Manage Faq/div_File size exceeded limit Max upload size is 03MB'), 
                        0)
                } else if (expected_image == 'wrong file extension') {
                    WebUI.verifyElementPresent(findTestObject('Alda/Page_Manage Faq/div_ERROR'), 0)
                }
            }
            
            if (var_tag_new != '') {
                WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_tag'))

                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_tag'), var_tag_new)

                WebUI.sendKeys(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_tag'), Keys.chord(Keys.ENTER))
            }
            
            if (expected_output == 'pass') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                WebUI.delay(3)

                WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search_after_edit)

                WebUI.click(findTestObject('Christi/Page_Manage Faq/button_Clear button_app-search-button wi wi-search'), 
                    FailureHandling.STOP_ON_FAILURE)
            } else if (expected_output == 'fail') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                WebUI.verifyElementPresent(findTestObject('Alda/Page_Manage Faq/p_Terjadi kesalahan harap periksa kembali'), 
                    0)

                WebUI.click(findTestObject('Alda/Page_Manage Faq/button_OK'))
            } else if (expected_output == 'cancel') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_cancel_edit'))
            }
            
            break
        case 'question_only':
            WebUI.clearText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_question'), FailureHandling.STOP_ON_FAILURE)

            if (var_question_new != '') {
                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_question'), var_question_new)
            }
            
            WebUI.delay(2)

            if (expected_output == 'pass') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                WebUI.delay(3)

                WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search_after_edit)

                WebUI.click(findTestObject('Christi/Page_Manage Faq/button_Clear button_app-search-button wi wi-search'), 
                    FailureHandling.STOP_ON_FAILURE)
            } else if (expected_output == 'fail') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                WebUI.verifyElementPresent(findTestObject('Alda/Page_Manage Faq/p_Terjadi kesalahan harap periksa kembali'), 
                    0)

                WebUI.click(findTestObject('Alda/Page_Manage Faq/button_OK'))
            } else if (expected_output == 'cancel') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_cancel_edit'))
            }
            
            break
        case 'answer_only':
            WebUI.clearText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_answer'), FailureHandling.STOP_ON_FAILURE)

            if (var_answer_new != '') {
                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_answer'), var_answer_new)
            }
            
            WebUI.delay(2)

            if (expected_output == 'pass') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                WebUI.delay(3)

                WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search_after_edit)

                WebUI.click(findTestObject('Christi/Page_Manage Faq/button_Clear button_app-search-button wi wi-search'), 
                    FailureHandling.STOP_ON_FAILURE)
            } else if (expected_output == 'fail') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                WebUI.verifyElementPresent(findTestObject('Alda/Page_Manage Faq/p_Terjadi kesalahan harap periksa kembali'), 
                    0)

                WebUI.click(findTestObject('Alda/Page_Manage Faq/button_OK'))
            } else if (expected_output == 'cancel') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_cancel_edit'))
            }
            
            break
        case 'picture_only':
            if (var_gambar_new != '') {
                WebUI.uploadFile(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/edit_gambar'), var_gambar_new)

                if (expected_image == 'file to big') {
                    WebUI.verifyElementPresent(findTestObject('Alda/Page_Manage Faq/div_File size exceeded limit Max upload size is 03MB'), 
                        0)
                } else if (expected_image == 'wrong file extension') {
                    WebUI.verifyElementPresent(findTestObject('Alda/Page_Manage Faq/div_ERROR'), 0)
                } else {
                    WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                    WebUI.delay(3)

                    WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

                    WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search_after_edit)

                    WebUI.click(findTestObject('Christi/Page_Manage Faq/button_Clear button_app-search-button wi wi-search'), 
                        FailureHandling.STOP_ON_FAILURE)
                }
            }
            
            break
        case 'add tags':
            WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'), FailureHandling.STOP_ON_FAILURE)

            WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'), var_tag_new, 
                FailureHandling.STOP_ON_FAILURE)

            WebUI.sendKeys(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_tag'), Keys.chord(Keys.ENTER), 
                FailureHandling.STOP_ON_FAILURE)

            if (expected_output == 'pass') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                WebUI.delay(3)

                WebUI.click(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'))

                WebUI.setText(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/input_search'), var_search_after_edit)

                WebUI.click(findTestObject('Christi/Page_Manage Faq/button_Clear button_app-search-button wi wi-search'), 
                    FailureHandling.STOP_ON_FAILURE)
            } else if (expected_output == 'fail') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_save_edit'))

                WebUI.verifyElementPresent(findTestObject('Alda/Page_Manage Faq/p_Terjadi kesalahan harap periksa kembali'), 
                    0)

                WebUI.click(findTestObject('Alda/Page_Manage Faq/button_OK'))
            } else if (expected_output == 'cancel') {
                WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage FAQ/Page_Manage Faq/btn_cancel_edit'))
            }
            
            break
    }
} else if (expected_search == 'not found') {
    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage FAQ/Page_Manage Faq/label_searching_not_found'))
}

WebUI.closeBrowser()

