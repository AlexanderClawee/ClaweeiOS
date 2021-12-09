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

Mobile.tap(findTestObject('First test/Lobby/Freebie Shop'), 0)

Mobile.tap(findTestObject('First test/Lobby/iconHome'), 0)

Mobile.tap(findTestObject('First test/Lobby/Free rounds'), 0)

Mobile.tap(findTestObject('First test/Lobby/iconHome'), 0)

Mobile.tap(findTestObject('First test/Lobby/Prizes'), 0)

Mobile.tap(findTestObject('First test/Lobby/iconHome'), 0)

Mobile.tap(findTestObject('First test/Lobby/Mail'), 0)

Mobile.tap(findTestObject('First test/Lobby/Done'), 0)

Mobile.checkElement(findTestObject('First test/Lobby/Lock'), 0)

Mobile.comment('elemant is fined ')

Mobile.checkElement(findTestObject('First test/Lobby/Balance 400'), 0)

Mobile.comment('elemant is fined ')

Mobile.tap(findTestObject('First test/Lobby/Open StoreBonusFreebies'), 0)

Mobile.tap(findTestObject('First test/Lobby/Store'), 0)

Mobile.tap(findTestObject('First test/Lobby/Bonus'), 0)

Mobile.tap(findTestObject('First test/Lobby/Freebies'), 0)

Mobile.tap(findTestObject('First test/Lobby/iconHome'), 0)

