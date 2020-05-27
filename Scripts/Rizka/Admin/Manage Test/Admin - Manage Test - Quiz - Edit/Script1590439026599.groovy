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

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnManageTest'))

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnQuiz'))

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnOptionsEditDelete'))

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnEdit'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/tipeSoal'), tipeSoal, false)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/jobFunction'), jobFunction, false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/jobPosition'), jobPosition, false)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/module'), module, false)

WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/subModule-learningPoint'), subModule, 
    false)

WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/technicalCompetence'), technicalCompetence, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/levelCompetence'), levelCompetence, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/txtSoal'), soalQuestion)

if (tipeSoal == 'Pilihan Ganda') {
    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/input_Jawaban A_answerA'), jawabanA)

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/input_Jawaban B_answerB'), jawabanB)

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/input_Jawaban C_answerC'), jawabanC)

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/input_Jawaban D_answerD'), jawabanD)

    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/kunciJawabanPilgan'), kunciJawabanPilgan, 
        false)
} else if (tipeSoal == 'Benar / Salah') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/kunciJawaban'), kunciJawaban, 
        false)
} else {
    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/kunciJawabanUraian'), uraian)
}

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnSubmit'))

WebUI.delay(5)

if (condition == 'passed') {
    WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnOptionsEditDelete'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnEdit'))

    WebUI.delay(5)

    WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/select_tipesoal2'), 
        tipeSoal, false, 0)

    WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/select_jobfunction2'), 
        jobFunction, false, 0)

    WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/select_jobposition2'), 
        jobPosition, false, 0)

    WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/select_module2'), module, 
        false, 0)

    WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/select_submodule2'), 
        subModule, false, 0)

    attribute = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/textarea_soal'), 'value')

    WebUI.verifyMatch(attribute, soalQuestion, false)

    if (tipeSoal == 'Pilihan Ganda') {
        A1 = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/input_answerA2'), 'value')

        A2 = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/input_answerB2'), 'value')

        A3 = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/input_answerC2'), 'value')

        A4 = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/input_answerD2'), 'value')

        WebUI.verifyMatch(A1, soalQuestion, false)

        WebUI.verifyMatch(A2, soalQuestion, false)

        WebUI.verifyMatch(A3, soalQuestion, false)

        WebUI.verifyMatch(A4, soalQuestion, false)

        WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/select_kuncijawabanpilgan2'), 
            kunciJawabanPilgan, false, 0)
    } else if (tipeSoal == 'Benar / Salah') {
        WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/select_kuncijawabanbenarsalah2'), 
            kunciJawaban, false, 0)
    } else {
        uraian = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/textarea_kuncijawabanuraian2'), 
            'value')

        WebUI.verifyMatch(uraian, soalQuestion, false)
    }
} else {
    WebUI.verifyElementNotClickable(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnSubmit'))
}

