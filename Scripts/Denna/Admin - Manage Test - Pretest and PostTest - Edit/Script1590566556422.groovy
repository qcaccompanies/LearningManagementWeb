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

WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input search'), 
    searchID)

WebUI.sendKeys(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input search'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button edit or delete'))

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Edit'))

WebUI.delay(4)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/select Category'), 
    category, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/select Tipe Soal'), 
    tipeSoal, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/select Job Function'), 
    jobFunction, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/select Job Position'), 
    jobPosition, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/select Module'), 
    module, true)

WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Technical Competence'), 
    technicalCompentence)

WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Level Competence'), 
    levelCompetence)

WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/textarea Soal question'), 
    soal)

if (tipeSoal == 'Pilihan Ganda') {
    WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban A'), 
        jawabanA)

    WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban B'), 
        jawabanB)

    WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban C'), 
        jawabanC)

    WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban D'), 
        jawabanD)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/select ABCD'), 
        jawabanABCD, true)
} else if (tipeSoal == 'Uraian') {
    WebUI.setText(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/textarea Kunci Jawaban Uraian'), 
        jawabanUraian)
} else {
    WebUI.selectOptionByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select Kunci Jawaban BenarSalah'), 
        jawabanBenarSalah, false)
}

WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Submit'))

switch (kondisi) {
    case 'fail':
        WebUI.delay(8)

        WebUI.verifyElementVisible(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Submit'))

        break
    case 'pass':
        WebUI.verifyElementVisible(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/label Edit Test Success'))

        not_run: WebUI.click(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/span_Dashboard'))

        not_run: WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Manage Test'))

        not_run: WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Pre-Test  Post-Test'))

        not_run: WebUI.delay(3)

        not_run: WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input search'), 
            searchID)

        not_run: WebUI.sendKeys(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input search'), 
            Keys.chord(Keys.ENTER))

        not_run: WebUI.delay(3)

        not_run: WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button edit or delete'))

        not_run: WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Edit'))

        not_run: WebUI.delay(3)

        not_run: WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select category verif'), 
            category, false, 0)

        not_run: WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select soal verif'), 
            tipeSoal, false, 0)

        not_run: WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select jobF verif'), 
            jobFunction, false, 0)

        not_run: WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select jobP verif'), 
            jobPosition, false, 0)

        not_run: WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select module verif'), 
            module, false, 0)

        not_run: def technical = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Technical Competence verif'), 
            'value')

        not_run: def level = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Level Competence verif'), 
            'value')

        not_run: if (tipeSoal == 'Pilihan Ganda') {
            def A = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban A verif'), 
                'value')

            def B = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban B verif'), 
                'value')

            def C = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban C verif'), 
                'value')

            def D = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban D verif'), 
                'value')

            WebUI.verifyEqual(A, jawabanA)

            WebUI.verifyEqual(B, jawabanB)

            WebUI.verifyEqual(C, jawabanC)

            WebUI.verifyEqual(D, jawabanD)

            WebUI.verifyOptionPresentByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select ABCD verif'), 
                jawabanABCD, false, 0)
        } else if (tipeSoal == 'Uraian') {
            def jawabanUraian1 = WebUI.getAttribute(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/textarea Kunci Jawaban Uraian verif'), 
                'value')

            WebUI.verifyEqual(jawabanUraian1, jawabanUraian)
        } else {
            WebUI.verifyOptionSelectedByLabel(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/select BenarSalah verif'), 
                jawabanBenarSalah, false, 0)
        }
        
        break
}

WebUI.closeBrowser()

