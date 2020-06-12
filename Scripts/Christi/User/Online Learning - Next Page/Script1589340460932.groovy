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

WebUI.callTestCase(findTestCase('Christi/User/user login'), [('username') : '06677', ('password') : '#@ccPerfect2o19#'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Christi/Page_Job Functions/label_ACC LEMON'), 0)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Christi/Page_Job Functions/div_page_navigation'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Christi/Page_Job Functions/a_Next'))

WebUI.verifyElementClickable(findTestObject('Christi/Page_Job Functions/a_Previous'))

WebUI.closeBrowser()

