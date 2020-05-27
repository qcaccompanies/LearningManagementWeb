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

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Modules - Search/btnManageModules'))

WebUI.delay(3)

WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Modules - Search/inputSearch'), namaModul)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Modules - Search/btnSearch'))

WebUI.delay(3)

if (condition == 'passed') {
    WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Modules - Search/label_NEOP Teller Cash  PDC dan FAB', 
            [('text') : namaModul]), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('Rizka/Admin/Admin - Manage Modules - Search/alertNoDataFound'), 0)
}

