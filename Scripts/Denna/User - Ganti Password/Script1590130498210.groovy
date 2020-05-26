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

WebUI.callTestCase(findTestCase('Denna/Login(User)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Denna/User - Ganti Password/profile'))

WebUI.click(findTestObject('Object Repository/Denna/User - Ganti Password/button Ganti Password'))

WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input Current Password'), currentPassword)

WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input newPassword'), newPassword)

WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input confirmNewPassword'), confirmPassword)

WebUI.click(findTestObject('Object Repository/Denna/User - Ganti Password/button Submit new Password'))

switch (kondisi) {
    case 'fail':
        if (keterangan == 'emptyAll') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label The password must be at least 6 characters and contain uppercase lowercase letters and numbers'))
        } else if (keterangan == 'emptyCurrentPassword') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label Current password maybe wrong or invalid'))
        } else if (keterangan == 'emptyNewPassword') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label The password must be at least 6 characters and contain uppercase lowercase letters and numbers'))
        } else if (keterangan == 'emptyConfirmPassword') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label Passwords are not match'))
        } else if (keterangan == 'invalidCurrentPassword') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label Current password maybe wrong or invalid'))
        } else if (keterangan == 'invalidNewPassword') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label The password must be at least 6 characters and contain uppercase lowercase letters and numbers'))
        } else if (keterangan == 'notMatch') {
            WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label Passwords are not match'))
        } else if (keterangan == 'cancel') {
            WebUI.delay(3)

            WebUI.click(findTestObject('Denna/User - Ganti Password/button Batal'))
        } else if (keterangan == 'wrongOTP') {
            WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text1'), otp1)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text2'), otp2)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text3'), otp3)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text4'), otp4)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text5'), otp5)

            WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text6'), otp6)

            WebUI.click(findTestObject('Object Repository/Denna/User - Ganti Password/button Konfirmasi'))

            WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label_Account Confirmation'))
        }
        
        break
    case 'pass':
        WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text1'), otp1)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text2'), otp2)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text3'), otp3)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text4'), otp4)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text5'), otp5)

        WebUI.setText(findTestObject('Object Repository/Denna/User - Ganti Password/input_Kode OTP_text6'), otp6)

        WebUI.click(findTestObject('Object Repository/Denna/User - Ganti Password/button Konfirmasi'))

        not_run: WebUI.delay(3)

        WebUI.verifyElementVisible(findTestObject('Denna/User - Ganti Password/label Password telah di Update'))

        WebUI.click(findTestObject('Object Repository/Denna/User - Logout/icon Photo Profile'))

        WebUI.click(findTestObject('Object Repository/Denna/User - Logout/button Log  Out'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Denna/User-Login/button login'))

        WebUI.setText(findTestObject('Denna/User-Login/input NPK username'), '14426')

        WebUI.setText(findTestObject('Denna/User-Login/inputPassword'), 'Password3')

        WebUI.click(findTestObject('Denna/User-Login/button login 1 masuk'))

        WebUI.verifyElementVisible(findTestObject('Denna/User-Login/button_My Learning IconMy Learning'))

        break
}

WebUI.closeBrowser()

