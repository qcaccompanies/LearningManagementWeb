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

WebUI.openBrowser('https://appsrv1.deltadatamandiri.com/ACC_LMS_WEB/#/admNLmn')

WebUI.maximizeWindow()

WebUI.delay(30)

WebUI.click(findTestObject('Rizka/Admin/Admin - Login/btnLogin'))

WebUI.setText(findTestObject('Rizka/Admin/Admin - Login/txtUsername'), username)

WebUI.setText(findTestObject('Rizka/Admin/Admin - Login/txtPassword'), password)

WebUI.click(findTestObject('Rizka/Admin/Admin - Login/btnEyePass'))

if (rememberMe == 'yes') {
    WebUI.click(findTestObject('Rizka/Admin/Admin - Login/checkboxRememberMe'))
}

WebUI.click(findTestObject('Rizka/Admin/Admin - Login/btnLogin2'))

WebUI.delay(10)

if (condition == 'passed') {
    WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Login/span_Dashboard'))
} else if (condition == 'isEmpty') {
	WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Login/btnLogin'))
} else {
    WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Login/label_Email address does not existPassword is wrong'))
}

