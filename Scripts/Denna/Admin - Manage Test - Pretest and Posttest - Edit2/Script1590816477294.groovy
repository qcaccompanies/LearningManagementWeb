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

WebUI.click(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/button_Test Management'))

WebUI.click(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/span_Pre-Test  Post-Test'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button EditOrDelete'))

WebUI.click(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button Edit'))

WebUI.delay(4)

WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select category'), 
    category, true)

WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select tipe soal'), 
    tipeSoal, true)

WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select job function'), 
    jobFunction, true)

WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select job position'), 
    jobPosition, true)

WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select module'), module, 
    true)

WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Technical Competence'), 
    technicalCompentence)

WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Level Competence'), levelCompetence)

WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/textarea Soal'), soal)

if (tipeSoal == 'Pilihan Ganda') {
    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Jawaban A'), jawabanA)

    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Jawaban B'), jawabanB)

    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Jawaban C'), jawabanC)

    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Jawaban D'), jawabanD)

    WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select ABCD'), 
        jawabanABCD, false)
} else if (tipeSoal == 'Uraian') {
    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/textarea Kunci Jawaban Uraian'), 
        jawabanUraian)
} else {
    WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select BenarSalah'), 
        jawabanBenarSalah, true)
}

WebUI.click(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/button Submit'))

switch (kondisi) {
    case 'fail':
        WebUI.delay(8)

        WebUI.verifyElementVisible(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/button Submit'))

        break
    case 'pass':
        WebUI.verifyElementVisible(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/label Edit Test Success'))

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button EditOrDelete'))

        WebUI.click(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit2/button Edit'))

        WebUI.delay(3)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select category verif'), 
            category, false, 0)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select tipe soal verif'), 
            tipeSoal, false, 0)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select job function verif'), 
            jobFunction, false, 0)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select job position verif'), 
            jobPosition, false, 0)

        WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select module verif'), 
            module, false, 0)

        technical = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Technical Competence verif'), 
            'value')

        level = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Level Competence verif'), 
            'value')

        soal = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/textarea Soal verif'), 
            'value')

        WebUI.verifyEqual(technical, technicalCompentence, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyEqual(level, levelCompetence, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyEqual(soal, soal, FailureHandling.STOP_ON_FAILURE)

        if (tipeSoal == 'Pilihan Ganda') {
            A = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Jawaban A verif'), 
                'value')

            B = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Jawaban B verif'), 
                'value')

            C = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Jawaban C verif'), 
                'value')

            D = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/input Jawaban D verif'), 
                'value')

            WebUI.verifyEqual(A, jawabanA, FailureHandling.STOP_ON_FAILURE)

            WebUI.verifyEqual(B, jawabanB, FailureHandling.STOP_ON_FAILURE)

            WebUI.verifyEqual(C, jawabanC, FailureHandling.STOP_ON_FAILURE)

            WebUI.verifyEqual(D, jawabanD, FailureHandling.STOP_ON_FAILURE)

            WebUI.verifyOptionNotPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select ABCD verif'), 
                jawabanABCD, false, 0)
        } else if (tipeSoal == 'Uraian') {
            uraian = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/textarea Kunci Jawaban Uraian verif'), 
                'value')

            WebUI.verifyEqual(uraian, jawabanUraian, FailureHandling.STOP_ON_FAILURE)
        } else {
            WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit new/select BenarSalah verif'), 
                jawabanBenarSalah, false, 0)
        }
        
        break
}

WebUI.closeBrowser()

