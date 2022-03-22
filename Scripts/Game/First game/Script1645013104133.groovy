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

Mobile.tap(findTestObject('Clawee/Game/Machnine 1 game (xpath)'), 0)

Mobile.tap(findTestObject('Clawee/Machine/In Machine/Play Button (btn)'), 3, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('Clawee/Machine/In Machine/Play Button (btn)'), 1)

Mobile.tapAndHold(findTestObject('Clawee/Machine/In Machine/Play Button (btn)'), 8, 2)

Mobile.tap(findTestObject('Clawee/Machine/In Machine/Play Button (btn)'), 1)

Mobile.tapAndHold(findTestObject('Clawee/Machine/In Machine/Play Button (btn)'), 5, 1)

Mobile.tap(findTestObject('Clawee/Claimed prizes/First claim/Claim Prize (txt)'), 0)

Mobile.tap(findTestObject('Clawee/Lobby/Top bar free user/Home top bar'), 0)

