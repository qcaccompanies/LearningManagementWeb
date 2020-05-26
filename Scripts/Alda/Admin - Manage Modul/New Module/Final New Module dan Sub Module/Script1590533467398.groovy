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

WebUI.callTestCase(findTestCase('Rizka/Admin/Custom/Admin - Login'), [('username') : '11666', ('password') : 'Password3'
        , ('rememberMe') : 'yes', ('condition') : 'passed'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Dashboard Admin/span_Modules'))

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Dashboard Admin/span_Manage Modules'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Manage Moduls/span_New Module'))

WebUI.setText(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_module_name'), var_module_name)

WebUI.click(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_learning_path'))

WebUI.setText(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_learning_path'), var_learning_path)

WebUI.sendKeys(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_learning_path'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/label_Learning Path'))

WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/select_level'), var_level, true)

WebUI.click(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_course_name'))

WebUI.setText(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_course_name'), var_course_name)

WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/select_module_category'), var_module_category, 
    true)

WebUI.setText(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_module_code'), var_module_code)

WebUI.setText(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_description'), var_description)

WebUI.click(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_tag'))

WebUI.setText(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_tag'), var_tags)

WebUI.sendKeys(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_tag'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_prerequisite'), var_prerequisite)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/select_ActiveInactive'), 
    var_status, true)

WebUI.uploadFile(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/input_Sub Modules_files'), var_gambar)

if (expected_module_details == 'success') {
    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/alert_upload_image_success'))
} else {
    WebUI.verifyElementVisible(findTestObject('Alda/Admin - Manage Modul/Page_Add Modul/alert_upload_image_fail'))
}

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/button_Next'))

