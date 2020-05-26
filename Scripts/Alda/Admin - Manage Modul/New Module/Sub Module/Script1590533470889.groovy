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

WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/span_New Sub Module'))

not_run: WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/input_Sub Module Name_txtName'), 
    'test')

not_run: WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/span_ADD NEW section'))

not_run: WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/input_Section Name_txtSectionName'), 
    'section 1')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/select_PDFVIDEOQUIZ'), 
    '1: \'PDF\'', true)

not_run: WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/input_Section Order_txtSectionOrder'))

not_run: WebUI.setText(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/input_Section Order_txtSectionOrder'), 
    '2a')

not_run: WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/span_Confirm'))

not_run: WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/button_Simpan'))

not_run: WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Add Modul/div_UploadFormat file tidak validLabelModul_460eae_1'))

not_run: WebUI.click(findTestObject('Object Repository/Alda/Admin - Manage Modul/Page_Manage Moduls/label_testing coba 1234'))

