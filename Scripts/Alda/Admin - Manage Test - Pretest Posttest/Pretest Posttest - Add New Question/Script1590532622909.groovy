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

WebUI.callTestCase(findTestCase('Rizka/Admin/Custom/Admin - Login'), [('username') : '11666', ('password') : 'Password3'
        , ('rememberMe') : 'yes', ('condition') : 'passed'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Alda/Admin - Manage Test/Page_Dashboard Admin/span_Manage Test'))

WebUI.click(findTestObject('Alda/Admin - Manage Test/Page_Dashboard Admin/span_Pre-Test  Post-Test'))

WebUI.click(findTestObject('Alda/Admin - Manage Test/add new question/btn_add_new_question'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Test/add new question/select_category'), var_category, true)

WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Test/add new question/select_tipe_soal'), var_tipe_soal, true)

WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Test/add new question/select_job_function'), var_job_function, 
    true)

WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Test/add new question/select_job_position'), var_job_position, 
    true)

WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Test/add new question/select_module'), var_module, true)

WebUI.click(findTestObject('Alda/Admin - Manage Test/add new question/input_technical_competence'))

WebUI.setText(findTestObject('Alda/Admin - Manage Test/add new question/input_technical_competence'), var_technical_comp)

WebUI.click(findTestObject('Alda/Admin - Manage Test/Page_Add Test/input_level_competence_new'))

WebUI.setText(findTestObject('Alda/Admin - Manage Test/Page_Add Test/input_level_competence_new'), var_level_comp)

WebUI.setText(findTestObject('Alda/Admin - Manage Test/add new question/textarea_soal'), var_soal)

switch (var_tipe_soal) {
    case 'Pilihan Ganda':
        WebUI.setText(findTestObject('Alda/Admin - Manage Test/add new question/input_jawaban_a'), var_jawaban_a)

        WebUI.setText(findTestObject('Alda/Admin - Manage Test/add new question/input_jawaban_b'), var_jawaban_b)

        WebUI.setText(findTestObject('Alda/Admin - Manage Test/add new question/input_jawaban_c'), var_jawaban_c)

        WebUI.setText(findTestObject('Alda/Admin - Manage Test/add new question/input_jawaban_d'), var_jawaban_d)

        WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Test/add new question/select_ABCD'), var_kunci_jawaban, 
            true)

        break
    case 'Benar / Salah':
        WebUI.selectOptionByLabel(findTestObject('Alda/Admin - Manage Test/add new question/select_BenarSalah'), var_kunci_jawaban, 
            true)

        break
    case 'Uraian':
        WebUI.setText(findTestObject('Alda/Admin - Manage Test/add new question/textarea_kunci_jawaban'), var_soal)

        break
}

switch (expected_output) {
    case 'pass':
        WebUI.click(findTestObject('Alda/Admin - Manage Test/add new question/span_Submit'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Alda/Admin - Manage Test/add new question/check_input_in_list'))

        break
    case 'fail':
        WebUI.verifyElementNotClickable(findTestObject('Alda/Admin - Manage Test/add new question/span_Submit'))

        break
}

