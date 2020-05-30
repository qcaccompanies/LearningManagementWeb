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

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button Manage Test'))

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button Pre-Test  Post-Test'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button EditOrDelete'))

WebUI.click(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button Edit'))

WebUI.delay(4)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select category'), 
    category, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select tipe soal'), 
    tipeSoal, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select job Function'), 
    jobFunction, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select job Position'), 
    jobPosition, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select module'), 
    module, true)

WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Technical Competence'), 
    technicalCompentence)

WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Level Competence'), 
    levelCompetence)

WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/textarea Soal'), 
    soal)

if (tipeSoal == 'Pilihan Ganda') {
    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Jawaban A'), jawabanA)

    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Jawaban B'), jawabanB)

    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Jawaban C'), jawabanC)

    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Jawaban D'), jawabanD)

    WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select ABCD'), jawabanABCD, 
        false)
} else if (tipeSoal == 'Uraian') {
    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/textarea Kunci Jawaban Uraian'), 
        jawabanUraian)
} else {
    WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select BenarSalah'), 
        jawabanBenarSalah, true)
}

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button Submit'))

switch (kondisi) {
    case 'fail':
        WebUI.delay(8)

        WebUI.verifyElementVisible(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button Submit'))

        break
    case 'pass':
        WebUI.verifyElementVisible(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/label Edit Test Success'))

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button EditOrDelete'))

        WebUI.click(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button Edit'))

        WebUI.delay(3)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select category verif'), 
            category, false, 0)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select tipe soal verif'), 
            tipeSoal, false, 0)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select job Function verif'), 
            jobFunction, false, 0)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select job position verif'), 
            jobPosition, false, 0)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select module verif'), 
            module, false, 0)

        technical = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Technical Competence verif'), 
            'value')

        level = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Level Competence verif'), 
            'value')

        soal = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/textarea Soal verif'), 
            'value')

        WebUI.verifyEqual(technical, technicalCompentence, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyEqual(level, levelCompetence, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyEqual(soal, soal, FailureHandling.STOP_ON_FAILURE)

        if (tipeSoal == 'Pilihan Ganda') {
            A = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Jawaban A verif'), 
                'value')

            B = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Jawaban B verif'), 
                'value')

            C = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Jawaban C verif'), 
                'value')

            D = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/input Jawaban D verif'), 
                'value')

            WebUI.verifyEqual(A, jawabanA, FailureHandling.STOP_ON_FAILURE)

            WebUI.verifyEqual(B, jawabanB, FailureHandling.STOP_ON_FAILURE)

            WebUI.verifyEqual(C, jawabanC, FailureHandling.STOP_ON_FAILURE)

            WebUI.verifyEqual(D, jawabanD, FailureHandling.STOP_ON_FAILURE)

            WebUI.verifyOptionNotPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select ABCD verif'), 
                jawabanABCD, false, 0)
        } else if (tipeSoal == 'Uraian') {
            uraian = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/textarea Kunci Jawaban Uraian verif'), 
                'value')

            WebUI.verifyEqual(uraian, jawabanUraian, FailureHandling.STOP_ON_FAILURE)
        } else {
            WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/select BenarSalah verif'), 
                jawabanBenarSalah, false, 0)
        }
        
        break
}

WebUI.closeBrowser()

