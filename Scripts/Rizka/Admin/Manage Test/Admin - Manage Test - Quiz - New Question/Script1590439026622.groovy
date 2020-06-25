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

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnNewQuestion'))

WebUI.delay(5)

if (tipeSoal != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputTipeSoal_v3'), tipeSoal, 
        false)
}

if (jobFunction != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJobFunction_v3'), jobFunction, 
        false)
}

WebUI.delay(3)

if (jobPosition != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJobPosition_v3'), jobPosition, 
        false)
}

if (module != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputModul_v3'), module, false)
}

if (subModule != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputSubModul_v3'), subModule, 
        false)
}

if (technicalCompetence != '') {
    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/inputTechnicalCompetence_v2'), technicalCompetence, 
        FailureHandling.STOP_ON_FAILURE)
}

if (levelCompetence != '') {
    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/inputLevelCompetence_v2'), levelCompetence, 
        FailureHandling.STOP_ON_FAILURE)

    if (levelCompetence == 'Alfabet') {
        atribut = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/inputLevelCompetence_v2'), 
            'value')

        WebUI.verifyNotMatch(atribut, levelCompetence, false)
    }
}

if (levelCompetence != 'Alfabet') {
    if (soalQuestion != '') {
        WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/inputSoal_v2'), soalQuestion)
    }
    
    if (tipeSoal == 'Pilihan Ganda') {
        WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/jawabanA_v3'), jawabanA)

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/jawabanB_v3'), jawabanB)

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/jawabanC_v3'), jawabanC)

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/jawabanD_v3'), jawabanD)

        if (kunciJawabanPilgan != '') {
            WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJawabanPilgan_v3'), 
                kunciJawabanPilgan, false)
        }
    } else if (tipeSoal == 'Benar / Salah') {
        WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJawabanBenarSalah_v3'), 
            kunciJawaban, false)
    } else if (tipeSoal == 'Uraian') {
        WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/kunciJawabanUraian'), uraian)
    }
    
    if (condition == 'passed') {
        WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnSubmit'))

        WebUI.delay(5)

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/fieldSearch'), soalQuestion)

        WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Search/btnSearch'))

        WebUI.delay(3)

        WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/label_Berikut adalah jenis dealer  dihandle oleh Sales officer new car adalah sebagai berikut kecuali', 
                [('text') : soalQuestion]), FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnSubmit'))

        WebUI.delay(5)

        WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnSubmit'))
    }
}

