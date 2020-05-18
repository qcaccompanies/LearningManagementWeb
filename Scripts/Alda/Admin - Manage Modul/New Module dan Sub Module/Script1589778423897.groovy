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
        , ('condition') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Dashboard Admin/btn_manage_module'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Manage Moduls/btn_new_module'))

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_module_name'), 'Modul Percobaan 1')

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_job_function'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_job_function'), 
    '2: 2', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_job_function'), 
    '3: 3', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_job_function'), 
    '4: 4', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_job_function'), 
    '5: 5', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_job_position'), 
    '61: 88', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_module_category'), 
    '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_module_category'), 
    '2: 2', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_module_category'), 
    '3: 3', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_module_category'), 
    '4: 4', true)

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/module_code'), 'Kode 1')

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_description'), 'Percobaan Pembuatan Modul 1')

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/click_tags'))

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_tags'), 'modul')

WebUI.sendKeys(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_tags'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_tags'))

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_prerequisite'), 'coba untuk testing')

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_status'), 
    '1: \'Active\'', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_status'), 
    '2: \'Inactive\'', true)

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/btn_cancel_new_module'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/alert_sucess_upload'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/btn_next_new_module'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/span_new_submodule'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/click_submodule'))

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_submodule_name'), 'Modul 1 Testing')

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/btn_new_section'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/span_new_section'))

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_section_name'), 'Section 1')

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/div_Section Order'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/btn_confirm_section'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/alert_Lengkapi data yang kosong'))

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_section_name'), 'Testing 1')

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_PDFVIDEOQUIZ'), 
    '1: \'PDF\'', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_PDFVIDEOQUIZ'), 
    '2: \'MULMOD\'', true)

WebUI.selectOptionByValue(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/select_PDFVIDEOQUIZ'), 
    '3: \'QUIZ\'', true)

WebUI.setText(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/input_Section Order_txtSectionOrder'), 
    '1')

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/btn_confirm_section'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/btn_simpan_submodule'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/div_Data Integrity Violation ERROR duplicat_a394c5'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/button_Icon_1'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/button_YA'))

WebUI.click(findTestObject('Alda/Admin - Manage Module/New Module/Page_Add Modul/btn_simpan_submodule'))

