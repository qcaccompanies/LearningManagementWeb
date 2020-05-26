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

WebUI.click(findTestObject('Object Repository/Denna/User - Minta Dukungan/profile'))

WebUI.click(findTestObject('Object Repository/Denna/User - Minta Dukungan/button Minta Dukungan'))

WebUI.setText(findTestObject('Object Repository/Denna/User - Minta Dukungan/textarea TELL US YOUR ISSUE'), issue)

WebUI.click(findTestObject('Object Repository/Denna/User - Minta Dukungan/button Kirim'))

if (keterangan == 'emptyIssue') {
    WebUI.verifyElementVisible(findTestObject('Denna/User - Minta Dukungan/label Inputan tidak boleh kosong'))
} else {
    WebUI.verifyElementVisible(findTestObject('Object Repository/Denna/User - Minta Dukungan/label Permintaan Dukungan Telah Dikirim'))
}

WebUI.closeBrowser()

