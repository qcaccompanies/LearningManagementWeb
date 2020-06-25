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

if (tipeSoal != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputTipeSoal_v3'), tipeSoal, 
        false)
}

if (jobFunction != '') {
    WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJobFunction_v3'), jobFunction, 
        false)
}

WebUI.delay(5)

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
        if (jawabanA != '') {
            WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/answerA_v2'), jawabanA)
        }
        
        if (jawabanB != '') {
            WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/answerB_v2'), jawabanB)
        }
        
        if (jawabanC != '') {
            WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/answerC_v2'), jawabanC)
        }
        
        if (jawabanD != '') {
            WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/answerD_v2'), jawabanD)
        }
        
        if (kunciJawabanPilgan != '') {
            WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJawabanPilgan_v3'), 
                kunciJawabanPilgan, false)
        }
    } else if (tipeSoal == 'Benar / Salah') {
        if (tipeSoal != '') {
            WebUI.selectOptionByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJawabanBenarSalah_v3'), 
                kunciJawaban, false)
        }
    } else {
        if (uraian != '') {
            WebUI.setText(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputKunciJawabanUraian_v3'), uraian)
        }
    }
    
    WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnSubmit'))

    WebUI.delay(5)

    if (condition == 'passed') {
        WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnOptionsEditDelete'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/btnEdit'))

        WebUI.delay(5)

        if (tipeSoal != '') {
            WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputTipeSoal_v3'), 
                tipeSoal, false, 0)
        }
        
        if (jobFunction != '') {
            WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJobFunction_v3'), 
                jobFunction, false, 0)
        }
        
        if (jobPosition != '') {
            WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJobPosition_v3'), 
                jobPosition, false, 0)
        }
        
        if (module != '') {
            WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputModul_v3'), 
                module, false, 0)
        }
        
        if (subModule != '') {
            WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputSubModul_v3'), 
                subModule, false, 0)
        }
        
        if (soalQuestion != '') {
            attribute = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputQuestion_v3'), 
                'value')

            WebUI.verifyMatch(attribute, soalQuestion, false)
        }
        
        if (tipeSoal == 'Pilihan Ganda') {
            if (jawabanA != '') {
                A1 = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/answerA_v2'), 
                    'value')

                WebUI.verifyMatch(A1, jawabanA, false)
            }
            
            if (jawabanB != '') {
                A2 = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/answerB_v2'), 
                    'value')

                WebUI.verifyMatch(A2, jawabanB, false)
            }
            
            if (jawabanC != '') {
                A3 = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/answerC_v2'), 
                    'value')

                WebUI.verifyMatch(A3, jawabanC, false)
            }
            
            if (jawabanD != '') {
                A4 = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - New Question/answerD_v2'), 
                    'value')

                WebUI.verifyMatch(A4, jawabanD, false)
            }
            
            if (kunciJawabanPilgan != '') {
                WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJawabanPilgan_v3'), 
                    kunciJawabanPilgan, false, 0)
            }
        } else if (tipeSoal == 'Benar / Salah') {
            if (kunciJawaban != '') {
                WebUI.verifyOptionSelectedByLabel(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputJawabanBenarSalah_v3'), 
                    kunciJawaban, false, 0)
            }
        } else {
            if (kunciJawaban != '') {
                uraianVar = WebUI.getAttribute(findTestObject('Rizka/Admin/Admin - Manage Test - Quiz - Edit/inputKunciJawabanUraian_v3'), 
                    'value')

                WebUI.verifyMatch(uraianVar, uraian, false)
            }
        }
    }
}

