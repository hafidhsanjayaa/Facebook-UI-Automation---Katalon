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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/?locale=id_ID')

WebUI.setText(findTestObject('Object Repository/input_Facebook membantu Anda terhubung dan berbagi dengan orang-orang dalam kehidupan Anda_email'), 
    'hafidhsanjaya2@gmail.com')

WebUI.click(findTestObject('Object Repository/button_Masuk'))

WebUI.waitForElementVisible(findTestObject('Object Repository/div_hafidhsanjaya2gmail.com  Not you'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/div_hafidhsanjaya2gmail.com  Not you'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/div_The password that youve entered is incorrect. Forgotten password'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/div_The password that youve entered is incorrect. Forgotten password'))

WebUI.waitForElementVisible(findTestObject('Object Repository/div_Forgotten password'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/div_Forgotten password'), FailureHandling.STOP_ON_FAILURE)

