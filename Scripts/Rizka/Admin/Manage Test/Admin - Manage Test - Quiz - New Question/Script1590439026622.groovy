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

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnManageTest'))

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnQuiz'))

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/btnNewQuestion'))

WebUI.delay(5)

if (tipeSoal != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldTipeSoal'), tipeSoal, 
        false)
}

if (jobFunction != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/jobFunction_v2'), jobFunction, 
        false)
}

WebUI.delay(3)

if (jobPosition != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldJobPosition_v2'), 
        jobPosition, false)
}

if (module != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldModul'), module, 
        false)
}

if (subModule != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldSubModul'), subModule, 
        false)
}

if (technicalCompetence != '') {
    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldTechnicalCompetence'), technicalCompetence, 
        FailureHandling.STOP_ON_FAILURE)
}

if (levelCompetence != '') {
    WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldLevelCompetence'), levelCompetence, 
        FailureHandling.STOP_ON_FAILURE)

    if (levelCompetence == 'Alfabet') {
        atribut = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldLevelCompetence'), 
            'value')

        WebUI.verifyNotMatch(atribut, levelCompetence, false)
    }
}

if (levelCompetence != 'Alfabet') {
	if (soalQuestion != '') {
		WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldQuestion'), soalQuestion)
	}
	
	if (tipeSoal == 'Pilihan Ganda') {
		WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldAnswerA'), jawabanA)
	
		WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldAnswerB'), jawabanB)
	
		WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldAnswerC'), jawabanC)
	
		WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldAnswerD'), jawabanD)
	
		if (kunciJawabanPilgan != '') {
			WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldJawabanPilgan'),
				kunciJawabanPilgan, false)
		}
	} else if (tipeSoal == 'Benar / Salah') {
		WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/fieldBenarSalah'), kunciJawaban,
			false)
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

