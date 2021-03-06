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

WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/btnMyProfile'))

WebUI.delay(3)

WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/btnChangePassword_v2'))

WebUI.delay(5)

WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/eyeCurrentPass'))

WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/txtCurrentPassword'), currentPass)

WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/eyeNewPass'))

WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/txtNewPassword'), newPass)

WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/eyeConfirmNewPass'))

WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/txtxNewPasswordConfirm'), confirmNewPass)

if (condition == 'passed') {
    WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/btnResetPassword'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text1'), '2')

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text2'), '4')

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text3'), '9')

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text4'), '9')

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text5'), '2')

    WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text6'), '1')

    WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/btnKonfirmasi'))

    WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Change Password/notifGantiPasswordSukses'))
} else if (condition == 'cancelSave') {
    WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/btnCancel'))
} else {
    WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/btnResetPassword'))

    if (ket == 'invalid') {
        WebUI.verifyElementVisible(findTestObject('Rizka/Admin/Admin - Change Password/alert1'))
    } else if (ket == 'OTPSalah') {
        WebUI.delay(5)

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text1'), '2')

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text2'), '0')

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text3'), '0')

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text4'), '0')

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text5'), '0')

        WebUI.setText(findTestObject('Rizka/Admin/Admin - Change Password/input_Kode OTP_text6'), '0')

        WebUI.click(findTestObject('Rizka/Admin/Admin - Change Password/btnKonfirmasi'))

        WebUI.verifyAlertPresent(0)
    }
}

