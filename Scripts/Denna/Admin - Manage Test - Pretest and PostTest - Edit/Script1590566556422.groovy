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
        'A')

    WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban B'), 
        'B')

    WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban C'), 
        'C')

    WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input Jawaban D'), 
        'D')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/select ABCD'), 
        '2: \'B\'', true)
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

        break
    case 'pass':
        WebUI.verifyElementVisible(findTestObject('Denna/Admin - Manage Test - Pretest and Posttest - Edit/label Edit Test Success'))

        WebUI.setText(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input search'), 
            searchID)

        WebUI.sendKeys(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/input search'), 
            Keys.chord(Keys.ENTER))

        WebUI.delay(4)

        WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button edit or delete'))

        WebUI.click(findTestObject('Object Repository/Denna/Admin - Manage Test - Pretest and Posttest - Edit/button Edit'))

        break
}

WebUI.closeBrowser()

