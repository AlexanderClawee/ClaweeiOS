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

Mobile.verifyElementText(findTestObject('Clawee/Lobby/Pop up in lobby/Tiers Up/Take Clawee to the next Tier (text)'), 'Take Clawee to the next Tier')

Mobile.verifyElementText(findTestObject('Clawee/Lobby/Pop up in lobby/Tiers Up/Play and reach higher Tiers (text)'), 'Play and reach higher Tiers')

Mobile.verifyElementText(findTestObject('Clawee/Lobby/Pop up in lobby/Tiers Up/Unlock new Prizes (text)'), 'Unlock new Prizes')

Mobile.tap(findTestObject('Clawee/Lobby/Pop up in lobby/Tiers Up/Got it (btn)'), 0)

