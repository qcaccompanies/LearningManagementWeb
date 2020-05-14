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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://appsrv1.deltadatamandiri.com/ACC_LMS_WEB/#/Main')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Denna/User-Login/button login'))

WebUI.setText(findTestObject('Denna/User-Login/input NPK username'), NPK_Username)

WebUI.setText(findTestObject('Denna/User-Login/inputPassword'), Password)

if (Keterangan == 'remember') {
    WebUI.check(findTestObject('Denna/User-Login/button Remember me'))
}

WebUI.click(findTestObject('Denna/User-Login/button login 1 masuk'))

switch (Kondisi) {
    case 'pass':
        WebUI.verifyElementVisible(findTestObject('Denna/User-Login/button_My Learning IconMy Learning'))

        break
    case 'fail':
        if (Keterangan == 'npkPasswordEmpty') {
            WebUI.verifyElementVisible(findTestObject('Denna/User-Login/button login 1 masuk'))
        } else if (Keterangan == 'npkEmpty') {
            WebUI.verifyElementVisible(findTestObject('Denna/User-Login/button login 1 masuk'))
        } else if (Keterangan == 'PasswordEmpty') {
            WebUI.verifyElementVisible(findTestObject('Denna/User-Login/button login 1 masuk'))
        } else if (Keterangan == 'wrongPassword') {
            WebUI.verifyElementVisible(findTestObject('Denna/User-Login/label Email address does not existPassword is wrong'))
        }
        
        break
}

WebUI.closeBrowser()

