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

WebUI.callTestCase(findTestCase('Denna/Login(Admin)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Manage Test'))

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Pre-Test  Post-Test'))

WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input search'), 
    '1764')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input search'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button edit or delete'))

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Edit'))

WebUI.delay(4)

not_run: category = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select category verif'), 
    'value')

not_run: soal = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select soal verif'), 
    'value')

not_run: jobF = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select jobF verif'), 
    'value')

not_run: jobP = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select jobP verif'), 
    'value')

not_run: jobP = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select jobP verif'), 
    'value')

not_run: WebUI.verifyEqual(category, '2: \'posttest\'')

not_run: WebUI.verifyEqual(soal, '1: \'pilihanganda\'')

not_run: WebUI.verifyEqual(jobP, '5: 17')

WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select category verif'), 
    'Post-Test', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select soal verif'), 
    'Pilihan Ganda', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select jobF verif'), 
    'SALES', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select jobP verif'), 
    'SALES HEAD', false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select module verif'), 
    'Modul & 10', false, 0)

not_run: def technical = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Technical Competence verif'), 
    'value')

not_run: def level = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Level Competence verif'), 
    'value')

def soal = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/textarea Soal verif'), 
    'value')

not_run: def A = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban A verif'), 
    'value')

not_run: def B = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban B verif'), 
    'value')

not_run: def C = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban C verif'), 
    'value')

not_run: def D = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban D verif'), 
    'value')

not_run: WebUI.verifyOptionSelectedByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select ABCD verif'), 
    'C', false, 0)

not_run: WebUI.verifyOptionSelectedByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select BenarSalah verif'), 
    'Benar', false, 0)

not_run: def jawab = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/textarea Kunci Jawaban Uraian verif'), 
    'value')

WebUI.closeBrowser()

