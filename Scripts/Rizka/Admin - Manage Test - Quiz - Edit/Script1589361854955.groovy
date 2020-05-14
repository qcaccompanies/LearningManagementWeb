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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://appsrv1.deltadatamandiri.com/ACC_LMS_WEB/#/admNLmn')

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin - Login/btnLogin'))

WebUI.setText(findTestObject('Rizka/Admin - Login/txtUsername'), '11666')

WebUI.setText(findTestObject('Rizka/Admin - Login/txtPassword'), 'Password3')

WebUI.click(findTestObject('Rizka/Admin - Login/btnEyePass'))

WebUI.click(findTestObject('Rizka/Admin - Login/checkboxRememberMe'))

WebUI.click(findTestObject('Rizka/Admin - Login/btnLogin2'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Rizka/Admin - Manage Test - Quiz - Edit/button_Manage Test'))

WebUI.delay(10)

WebUI.click(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/btnQuiz'))

WebUI.click(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/btnManageTest'))

WebUI.click(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/btnOptionsEditDelete'))

WebUI.click(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/btnEdit'))

WebUI.delay(10)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/tipeSoal'), tipeSoal, false)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/jobFunction'), jobFunction, false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/jobPosition'), jobPosition, false)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/module'), module, false)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/subModule-learningPoint'), subModule, 
    false)

WebUI.setText(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/technicalCompetence'), technicalCompetence, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/levelCompetence'), levelCompetence, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/txtSoal'), soalQuestion)

if (tipeSoal == 'Pilihan Ganda') {
    WebUI.setText(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/input_Jawaban A_answerA'), jawabanA)

    WebUI.setText(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/input_Jawaban B_answerB'), jawabanB)

    WebUI.setText(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/input_Jawaban C_answerC'), jawabanC)

    WebUI.setText(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/input_Jawaban D_answerD'), jawabanD)

    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/kunciJawabanPilgan'), kunciJawabanPilgan, 
        false)
} else if (tipeSoal == 'Benar / Salah') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/kunciJawaban'), kunciJawaban, false)
} else {
    WebUI.setText(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/kunciJawabanUraian'), uraian)
}

WebUI.click(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/btnSubmit'))

WebUI.delay(10)

if (condition == 'passed') {
    WebUI.click(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/btnOptionsEditDelete'))

    WebUI.click(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/btnEdit'))

    WebUI.delay(5)
}

attribute = WebUI.getAttribute(findTestObject('Rizka/Admin - Manage Test - Quiz - Edit/txtSoal - Copy', [('text') : soalQuestion]), 
    'text')

WebUI.verifyMatch(attribute, soalQuestion, false)

