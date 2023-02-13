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

//Open Browser and pass the URL

WebUI.openBrowser(GlobalVariable.URL)

//Maximize browser tab

WebUI.maximizeWindow()

//Verify Login screen
WebUI.waitForElementVisible(findTestObject('General/LoginPageVerify'), GlobalVariable.L_Timeout, FailureHandling.STOP_ON_FAILURE)

//Apply login credentials

WebUI.waitForElementVisible(findTestObject('General/Page_Intellify/input_Username'), GlobalVariable.S_Timeout, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('General/Page_Intellify/input_Username'), GlobalVariable.User, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('General/Page_Intellify/input_Username'), Keys.chord(Keys.TAB))

WebUI.waitForElementVisible(findTestObject('General/Page_Intellify/input_Password'), GlobalVariable.S_Timeout, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('General/Page_Intellify/input_Password'), GlobalVariable.PW, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('General/Page_Intellify/button_Sign In'), GlobalVariable.S_Timeout, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Page_Intellify/button_Sign In'), FailureHandling.STOP_ON_FAILURE)


//Verify Home page screen

WebUI.waitForElementVisible(findTestObject('General/HomePageVerify'), GlobalVariable.L_Timeout, FailureHandling.STOP_ON_FAILURE)

//Close Browser

WebUI.closeBrowser()