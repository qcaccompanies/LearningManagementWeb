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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://appsrv1.deltadatamandiri.com/ACC_LMS_WEB/#/admNLmn')

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin - Login/btnLogin'))

WebUI.setText(findTestObject('Rizka/Admin - Login/txtUsername'), '11666')

WebUI.setText(findTestObject('Rizka/Admin - Login/txtPassword'), 'Password3')

WebUI.click(findTestObject('Rizka/Admin - Login/btnEyePass'))

WebUI.click(findTestObject('Rizka/Admin - Login/checkboxRememberMe'))

WebUI.click(findTestObject('Rizka/Admin - Login/btnLogin2'))

WebUI.delay(20)

WebUI.click(findTestObject('Rizka/Admin - Manage Modules - Search/btnManageModules'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rizka/Admin - Manage Modules - Search/inputSearch'), namaModul)

WebUI.click(findTestObject('Rizka/Admin - Manage Modules - Search/btnSearch'))

WebUI.delay(5)

if (condition == 'passed') {
    WebUI.verifyElementVisible(findTestObject('Rizka/Admin - Manage Modules - Search/label_NEOP Teller Cash  PDC dan FAB', [('text') : namaModul]), 
        FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('Rizka/Admin - Manage Modules - Search/alertNoDataFound'), 0)
}

