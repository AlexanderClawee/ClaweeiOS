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

Mobile.tap(findTestObject('Clawee/Machine/Temp machine/Machine 1 (image) xpath'), 0)

Mobile.tap(findTestObject('Clawee/Machine/In Machine/Buy coins in machine (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Machine/In Machine/Return (btn)'), 0)

Mobile.tapAndHold(findTestObject('Clawee/Machine/In Machine/Return Camera (btn)'), 3, 15)

Mobile.tap(findTestObject('Clawee/Machine/In Machine/Last win video'), 0)

Mobile.tap(findTestObject('Clawee/Machine/Last win video/I min (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Machine/Last win video/Close pop up (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Machine/Last win video/Back min (btn)'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Machine/Last win video/Try it pop up/Try it yourself (text)'), 'Try it yourself!')

Mobile.verifyElementText(findTestObject('Clawee/Machine/Last win video/Try it pop up/Try to catch it too (text)'), 'Try to catch it too!')

Mobile.tap(findTestObject('Clawee/Machine/Last win video/Close pop up (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Machine/Smile chat/Chat Box (image)'), 0)

Mobile.tap(findTestObject('Clawee/Machine/Smile chat/Smile 1 (cell)'), 0)

Mobile.tap(findTestObject('Clawee/Machine/In Machine/Q in machine/In Line Side Queue (icon)'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Machine/In Machine/Q in machine/In Line (text)'), 'In Line')

Mobile.verifyElementText(findTestObject('Clawee/Machine/In Machine/Q in machine/Watching (text)'), 'Watching')

Mobile.tap(findTestObject('Clawee/Machine/In Machine/Q in machine/Collapse (btn)'), 0)

Mobile.tap(findTestObject('Clawee/Machine/In Machine/Machine Home (btn)'), 0)

