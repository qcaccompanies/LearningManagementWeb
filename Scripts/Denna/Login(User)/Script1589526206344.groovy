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

WebUI.openBrowser('https://appsrv1.deltadatamandiri.com/ACC_LMS_WEB/#/Main?redirectTo=onlineLearning')

WebUI.maximizeWindow()

WebUI.delay(15)

WebUI.click(findTestObject('Denna/User-Login/button login'))

WebUI.setText(findTestObject('Denna/User-Login/input NPK username'), '06677')

WebUI.setText(findTestObject('Denna/User-Login/inputPassword'), '#@ccPerfect2o19#')

WebUI.click(findTestObject('Denna/User-Login/button login 1 masuk'))

WebUI.verifyElementVisible(findTestObject('Denna/User-Login/button_My Learning IconMy Learning'))

