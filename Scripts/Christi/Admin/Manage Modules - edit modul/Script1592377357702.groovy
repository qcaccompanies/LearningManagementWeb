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

WebUI.click(findTestObject('Object Repository/Christi/Page_Dashboard Admin/span_Manage FAQ'))

WebUI.click(findTestObject('Object Repository/Christi/Page_Dashboard Admin/span_Manage Modules'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Christi/Page_Manage Moduls/select_Search byModuleSub-moduleSectionCour_92c6df'), 
    'Module', true)

WebUI.setText(findTestObject('Christi/Page_Manage Moduls/input_Back button_search1'), search_module)

WebUI.click(findTestObject('Page_Manage Moduls/button_Clear button_app-search-button wi wi-search'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Moduls/i_Active_app-icon wi wi-more-vert fa-2x'))

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Moduls/span_Edit'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/Christi/Page_Add Modul/div_Module NameNama modul tidak valid17200L_5efeb8'))

WebUI.setText(findTestObject('Object Repository/Christi/Page_Add Modul/input_Module Name_txtModulName'), module_name)

WebUI.click(findTestObject('Object Repository/Christi/Page_Add Modul/button_Next'))

WebUI.verifyElementPresent(findTestObject('Page_Add Modul/span_Sedang mengubah data modul'), 0)

WebUI.delay(3)

if (true) {
    WebUI.delay(3)
}

WebUI.click(findTestObject('Object Repository/Christi/Page_Add Modul/span_Simpan'))

WebUI.verifyElementPresent(findTestObject('Page_Add Modul/span_Sedang memasukkan data sub-modul dan section'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Add Modul/div_Modul berhasil di-update'), 0)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Christi/Page_Manage Moduls/select_Search byModuleSub-moduleSectionCour_92c6df'), 
    'Module', true)

WebUI.click(findTestObject('Christi/Page_Manage Moduls/input_Back button_search1'))

WebUI.setText(findTestObject('Christi/Page_Manage Moduls/input_Back button_search1'), module_name)

WebUI.click(findTestObject('Page_Manage Moduls/button_Clear button_app-search-button wi wi-search'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Christi/Page_Manage Moduls/label_Pengetahuan umum'))

