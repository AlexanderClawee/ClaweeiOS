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

Mobile.tap(findTestObject('Clawee/Delivery/Prizes bottom bar (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Delivery/Basket'), 0)

Mobile.tap(findTestObject('Clawee/Delivery/Fill your details (text)'), 0)

Mobile.setText(findTestObject('Clawee/Delivery/First name'), 'Alexander', 0)

Mobile.setText(findTestObject('Clawee/Delivery/Last name'), 'Testing', 0)

Mobile.setText(findTestObject('Clawee/Delivery/Mobile'), '22222222', 0)

Mobile.setText(findTestObject('Clawee/Delivery/E-mail'), 'alex.qa.eng+42@gmail.com', 0)

Mobile.tap(findTestObject('Clawee/Delivery/Country'), 0)

Mobile.tap(findTestObject('Clawee/Delivery/Canada'), 0)

Mobile.tap(findTestObject('Clawee/Delivery/Enter Address Manually'), 0)

Mobile.setText(findTestObject('Clawee/Delivery/Address'), 'Street', 0)

Mobile.setText(findTestObject('Clawee/Delivery/Optional'), 'Street', 0)

Mobile.setText(findTestObject('Clawee/Delivery/City'), 'Toronto', 0)

Mobile.setText(findTestObject('Clawee/Delivery/State'), 'State', 0)

Mobile.setText(findTestObject('Clawee/Delivery/Zip Code'), '12345', 0)

Mobile.tap(findTestObject('Clawee/Delivery/Save Address'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Top bar free user/Home top bar'), 0)

