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

WebUI.callTestCase(findTestCase('Rizka/Admin/AdminMainLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/btnTestManagement_v2'))

WebUI.delay(7)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/btnQuiz_v2'))

WebUI.delay(7)

WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/fieldSearch_v2'), namaSoal)

WebUI.sendKeys(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/fieldSearch_v2'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/btnSettings_v2'))

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/btnDelete_v2'))

if (condition == 'passed') {
    WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/btnYes_v2'))

    WebUI.delay(7)

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/fieldSearch_v2'), namaSoal)

    WebUI.sendKeys(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/fieldSearch_v2'), Keys.chord(Keys.ENTER))

    WebUI.delay(5)

    WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/alertNoDataFound_v2'))
} else {
    WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/btnCancel_v2'))

    WebUI.delay(7)

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/fieldSearch_v2'), namaSoal)

    WebUI.sendKeys(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/fieldSearch_v2'), Keys.chord(Keys.ENTER))

    WebUI.delay(5)

    WebUI.verifyElementNotVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/alertNoDataFound_v2'))
}

