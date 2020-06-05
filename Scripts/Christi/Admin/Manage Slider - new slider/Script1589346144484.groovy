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

WebUI.click(findTestObject('Object Repository/Christi/Page_Dashboard Admin/span_Manage Slider'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Sliders/button_New Slider'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Christi/Page_Manage Sliders/label_Add Slider'), 0)

WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_nama_slider'), nama_slider)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Section Link_txtSliderLink'), url)

WebUI.delay(3)

if (expected == 'pass') {
    if (upload == 'yes') {
        WebUI.uploadFile(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Icon_files'), img_slider)

        WebUI.verifyElementPresent(findTestObject('Object Repository/Christi/Page_Manage Sliders/div_File uploaded successfully'), 
            0)
    }
    
    WebUI.delay(3)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Christi/Page_Manage Sliders/span_Confirm'))

    WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Sliders/span_Confirm'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Christi/Page_Manage Sliders/button_New Slider'), 0)

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/label_NEOP UW', [('text') : nama_slider]), 3)
} else if (expected == 'fail') {
    if (upload == 'yes') {
        WebUI.uploadFile(findTestObject('Christi/Page_Manage Sliders/input_Icon_files'), img_slider)

        if (max_image_size == 'yes') {
            WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders_Alert/div_File size exceeded limit Max upload size is 1MB'), 
                1)
        } else if (img_file_invalid == 'yes') {
            WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders_Alert/div_Expected file extension is jpegjpgpngtiff'), 
                1)
        }
    }
    
    WebUI.click(findTestObject('Christi/Page_Manage Sliders/span_Confirm'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('Christi/Page_Manage Sliders/label_Add Slider'), 0)
}

WebUI.delay(3)

WebUI.closeBrowser()

