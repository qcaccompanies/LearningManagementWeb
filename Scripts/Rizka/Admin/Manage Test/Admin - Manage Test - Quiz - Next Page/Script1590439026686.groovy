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

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin/Admin - Login/btnLogin'))

WebUI.setText(findTestObject('Rizka/Admin/Admin - Login/txtUsername'), '11666')

WebUI.setText(findTestObject('Rizka/Admin/Admin - Login/txtPassword'), 'Password3')

WebUI.click(findTestObject('Rizka/Admin/Admin - Login/btnEyePass'))

WebUI.click(findTestObject('Rizka/Admin/Admin - Login/checkboxRememberMe'))

WebUI.click(findTestObject('Rizka/Admin/Admin - Login/btnLogin2'))

WebUI.delay(20)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Next Page/btnManageTest'))

WebUI.delay(10)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Next Page/btnQuiz'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Next Page/btnFirstPage'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Next Page/btnNext'))

WebUI.verifyElementClickable(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Next Page/btnPrevious'))

