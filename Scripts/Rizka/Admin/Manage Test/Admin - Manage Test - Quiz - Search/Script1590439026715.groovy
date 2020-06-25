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

WebUI.callTestCase(findTestCase('Rizka/Admin/AdminMainLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/btnTestManagement_v2'))

WebUI.delay(7)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/btnQuiz_v2'))

WebUI.delay(7)

WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Delete/fieldSearch_v2'), judulQuiz)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/btnSearch2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

if (condition == 'passed') {
    if (ket == 'tipeSoal') {
        WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/label_benarsalah'))
    } else if (ket == 'jobFunction') {
        WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/label_SERVICE'))
    } else if (ket == 'jobPosition') {
        WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/label_TELLER'))
    } else if (ket == 'modul') {
        WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/label_NEOP CSO'))
    } else if (ket == 'soal') {
        WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/label_Giro boleh dikirimkan customer melalui pos atau paket'))
    }
} else {
    WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/div_No data found'))
}

