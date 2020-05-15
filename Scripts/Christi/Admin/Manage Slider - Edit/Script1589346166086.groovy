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

WebUI.click(findTestObject('Object Repository/Christi/Page_Dashboard Admin/span_Manage Slider'))

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Sliders/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Slider name maximum 25 character_txtE_3ccb7f'), 
    'edit slider')

WebUI.setText(findTestObject('Object Repository/Christi/Page_Manage Sliders/input_Section Link_txtEditSliderLink'), 'https://appsrv1.deltadatamandiri.com/ACC_LMS_WEB/#/manageSlider')

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Sliders/span_Update Slider'))

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Sliders/span_New Slider'))

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Sliders/span_Delete'))

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Sliders/button_YA'))
