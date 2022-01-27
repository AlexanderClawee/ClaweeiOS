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

Mobile.tap(findTestObject('Clawee/Lobby/Stores/Freebie shop store/Freebie Shop'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Top bar free user/Home top bar'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Botton bar/Free rounds (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Top bar free user/Home top bar'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Botton bar/Prizes'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Top bar free user/Home top bar'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Botton bar/Mail (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Done'), 0)

Mobile.checkElement(findTestObject('Clawee/Lobby/Top bar free user/Lock'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Botton bar/Promotion Bar Arrow (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Botton bar/Promotion Bar Arrow (btn)'), 0)

Mobile.comment('elemant is fined ')

Mobile.checkElement(findTestObject('Clawee/Lobby/Top bar free user/Balance 400'), 0)

Mobile.comment('elemant is fined ')

Mobile.tap(findTestObject('Clawee/Lobby/Botton bar/Freebies shop (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Stores/Bonus store/Bonus'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Stores/Store coins/Store'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Freebies'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Top bar free user/Home top bar'), 0)

