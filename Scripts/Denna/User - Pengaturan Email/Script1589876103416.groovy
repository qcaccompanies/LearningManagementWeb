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

WebUI.callTestCase(findTestCase('Denna/Login(User)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Denna/User - Pengaturan Email/button Profile'))

WebUI.click(findTestObject('Object Repository/Denna/User - Pengaturan Email/button Pengaturan Email'))

WebUI.click(findTestObject('Object Repository/Denna/User - Pengaturan Email/button Edit'))

WebUI.setText(findTestObject('Object Repository/Denna/User - Pengaturan Email/input Alamat email yang lain_secondEmail'), 
    email)

if (keterangan == 'cancel') {
    WebUI.click(findTestObject('Denna/User - Pengaturan Email/button Cancel Email'))
} else {
    WebUI.click(findTestObject('Denna/User - Pengaturan Email/button Update Email'))
}

WebUI.delay(5)

switch (kondisi) {
    case 'fail':
        if (keterangan == 'emptyEmail') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Pengaturan Email/label_Harap diisi'))
        } else if (keterangan == 'invalidEmail') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Pengaturan Email/label_Invalid email'))
        } else if (keterangan == 'cancel') {
            def emailValue = WebUI.getAttribute(findTestObject('Denna/User - Pengaturan Email/input Alamat email yang lain_secondEmail - Copy'), 
                'value')

            WebUI.verifyEqual(emailValue, email)
        }
        
        break
    case 'pass':
        def emailValue = WebUI.getAttribute(findTestObject('Denna/User - Pengaturan Email/input Alamat email yang lain_secondEmail - Copy'), 
            'value')

        WebUI.verifyEqual(emailValue, email)

        break
}

WebUI.closeBrowser()
