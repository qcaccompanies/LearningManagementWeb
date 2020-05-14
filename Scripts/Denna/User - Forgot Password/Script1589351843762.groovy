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

WebUI.navigateToUrl('https://appsrv1.deltadatamandiri.com/ACC_LMS_WEB/#/Main')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Denna/User - Forgot Password/button login'))

WebUI.click(findTestObject('Object Repository/Denna/User - Forgot Password/button Forgot Password'))

WebUI.setText(findTestObject('Denna/User - Forgot Password/input NPK npkUser'), NPK)

WebUI.click(findTestObject('Object Repository/Denna/User - Forgot Password/button Kirim OTP'))

switch (Kondisi) {
    case 'fail':
        WebUI.setText(findTestObject('Denna/User - Forgot Password/input Icon newPassword'), newPassword)

        WebUI.setText(findTestObject('Denna/User - Forgot Password/input Icon newPasswordConfirm'), newPasswordConfirm)

        WebUI.click(findTestObject('Object Repository/Denna/User - Forgot Password/button RESET PASSWORD'))

        if (Keterangan == 'emptyAllPassword') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label password must be at least 6 characters and contain uppercase lowercase letters and numbers'))
        } else if (Keterangan == 'emptyPasswordConfirm') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label Password tidak sama'))
        } else if (Keterangan == 'emptyNewPassword') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label password must be at least 6 characters and contain uppercase lowercase letters and numbers'))
        } else if (Keterangan == 'PasswordNotMatch') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label Password tidak sama'))
        } else if (Keterangan == 'PasswordInvalid') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label password must be at least 6 characters and contain uppercase lowercase letters and numbers'))
        } else if (Keterangan == 'PasswordInvalidDefault') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label Password tidak boleh sama dengan default'))
        } else if (Keterangan == 'wrongOTP') {
            WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text1'), otp1)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text2'), otp2)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text3'), otp3)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text4'), otp4)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text5'), otp5)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text6'), otp6)

            WebUI.click(findTestObject('Object Repository/Denna/User - Forgot Password/button Konfirmasi'))

            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label Account Confirmation'))
        }
        
        break
    case 'fail1':
        if (Keterangan == 'emptyNPK') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label Masukkan NPK anda kami akan mengirim kode OTP ke nomor anda'))
        } else if (Keterangan == 'wrongNPK') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label Masukan anda salah'))
        } else if (Kondisi == 'npkNotFound') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label NPK tidak ditemukan'))
        }
        
        break
    case 'pass':
        WebUI.setText(findTestObject('Denna/User - Forgot Password/input Icon newPassword'), newPassword)

        WebUI.setText(findTestObject('Denna/User - Forgot Password/input Icon newPasswordConfirm'), newPasswordConfirm)

        WebUI.click(findTestObject('Object Repository/Denna/User - Forgot Password/button RESET PASSWORD'))

        WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text1'), otp1)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text2'), otp2)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text3'), otp3)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text4'), otp4)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text5'), otp5)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Forgot Password/input_Kode OTP_text6'), otp6)

        WebUI.click(findTestObject('Object Repository/Denna/User - Forgot Password/button Konfirmasi'))

        WebUI.verifyElementVisible(findTestObject('Denna/User - Forgot Password/label Password anda berhasil diganti Mohon login kembali menggunakan password baru'))

        WebUI.click(findTestObject('Object Repository/Denna/User - Forgot Password/button Back to Login Page'))

        break
}

WebUI.closeBrowser()

