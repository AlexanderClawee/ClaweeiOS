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

Mobile.tap(findTestObject('Clawee/Reset user/Profile'), 0)

Mobile.tap(findTestObject('Clawee/Reset user/developer menu'), 0)

Mobile.clearText(findTestObject('Clawee/DEV menu/Balance Dev menu'), 0)

Mobile.setText(findTestObject('Clawee/DEV menu/Balance Dev menu'), '500', 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Set'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Did pay'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Latency'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Websocket'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Force Loading'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Video URL'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Machines IDs'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Debug Payment'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Beta Tester'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Lobby popups'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/TCP'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/UDP'), 0)

Mobile.tap(findTestObject('Clawee/DEV menu/Back of'), 0)

