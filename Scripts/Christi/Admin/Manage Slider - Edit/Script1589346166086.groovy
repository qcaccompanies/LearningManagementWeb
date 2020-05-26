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

WebUI.click(findTestObject('Object Repository/Christi/Page_Dashboard Admin/span_Manage Slider'))

WebUI.delay(3)

if (find_slider == 'found') {
    WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Sliders/span_Edit'))

    WebUI.delay(3)

    switch (edit.toString()) {
        case 'nama slider':
            if (nama_slider_baru == 'erase nama slider') {
                WebUI.clearText(findTestObject('Christi/Page_Manage Sliders/input_Slider name maximum 25 character_txtE_3ccb7f'))
            } else {
                WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Slider name maximum 25 character_txtE_3ccb7f'), 
                    nama_slider_baru)
            }
            
            WebUI.delay(3)

            if (max_character == 'yes') {
                WebUI.verifyElementNotPresent(findTestObject('Christi/Page_Manage Sliders_Alert/label_Slider name maximum 25 character'), 
                    0)
            }
            
            break
        case 'url slider':
            WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Section Link_txtEditSliderLink'), 
                url_slider_baru)

            if (nama_slider_baru == 'erase url slider') {
                WebUI.clearText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Section Link_txtEditSliderLink'), 
                    FailureHandling.STOP_ON_FAILURE)
            } else {
                WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Section Link_txtEditSliderLink'), 
                    url_slider_baru)
            }
            
            WebUI.delay(3)

            break
        case 'img slider':
            WebUI.uploadFile(findTestObject('Christi/Page_Manage Sliders/input_Icon_files'), img_slider)

            WebUI.delay(3)

            WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/div_File uploaded successfully'), 0)

            if (max_image_size == 'yes') {
                WebUI.verifyElementNotPresent(findTestObject('Christi/Page_Manage Sliders_Alert/div_File size exceeded limit Max upload size is 1MB'), 
                    0)
            } else if (img_file_invalid == 'yes') {
                WebUI.verifyElementNotPresent(findTestObject('Christi/Page_Manage Sliders_Alert/div_Expected file extension is jpegjpgpngtiff'), 
                    0)
            } else {
                WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/div_File uploaded successfully'), 
                    0)
            }
            
            WebUI.delay(3)

            break
        case 'change all':
            WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Slider name maximum 25 character_txtE_3ccb7f'), 
                nama_slider_baru)

            if (max_character == 'yes') {
                WebUI.verifyElementNotPresent(findTestObject('Christi/Page_Manage Sliders_Alert/label_Slider name maximum 25 character'), 
                    0)
            }
            
            WebUI.delay(3)

            WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Section Link_txtEditSliderLink'), 
                url_slider_baru)

            WebUI.delay(3)

            WebUI.uploadFile(findTestObject('Christi/Page_Manage Sliders/input_Icon_files'), img_slider_baru)

            if (max_image_size == 'yes') {
                WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/div_File uploaded successfully'), 
                    0)

                WebUI.verifyElementNotPresent(findTestObject('Christi/Page_Manage Sliders_Alert/div_File size exceeded limit Max upload size is 1MB'), 
                    0)
            } else if (img_file_invalid == 'yes') {
                WebUI.verifyElementNotPresent(findTestObject('Christi/Page_Manage Sliders_Alert/div_Expected file extension is jpegjpgpngtiff'), 
                    0)
            } else {
                WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/div_File uploaded successfully'), 
                    0)
            }
            
            WebUI.delay(3)

            break
    }
    
    WebUI.delay(3)

    WebUI.click(findTestObject('Christi/Page_Manage Sliders_Edit/button_Update Slider'))

    not_run: if (expected == 'pass') {
        not_run: switch (edit.toString()) {
            case 'nama slider':
                WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/label_Slider', [('text') : nama_slider_baru]), 
                    0)

                break
            default:
                WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/label_Slider', [('text') : nama_slider]), 
                    0)

                break
        }
    } else if (expected == 'fail') {
        WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/span_Data belum lengkap'), 0)
    }
} else if (find_slider == 'not found') {
    WebUI.verifyElementNotPresent(findTestObject('Christi/Page_Manage Sliders/label_Slider', [('text') : nama_slider]), 
        0)
}

WebUI.delay(3)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

