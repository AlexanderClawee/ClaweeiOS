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

Mobile.startExistingApplication('com.gigantic.clawee', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Clawee/Lobby/Machene in lobby/Machine 1/Info button m1 (btn)'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Lobby/Info prize in lobby/Exchange value  160 (text)'), 'exchange value:  160')

Mobile.verifyElementVisible(findTestObject('Clawee/Lobby/Info prize in lobby/Watch in prize info (btn)'), 0)

Mobile.verifyElementVisible(findTestObject('Clawee/Lobby/Info prize in lobby/Play in prize info (btn)'), 0)

Mobile.verifyElementVisible(findTestObject('Clawee/Lobby/Info prize in lobby/PeopleIconin prize info (image)'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Lobby/Info prize in lobby/In Line in prize info (text)'), 'In Line')

Mobile.verifyElementVisible(findTestObject('Clawee/Lobby/Info prize in lobby/visibilityIcon in prize info (image)'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Lobby/Info prize in lobby/Watching Now in prize info (text)'), 'Watching Now')

Mobile.verifyElementVisible(findTestObject('Clawee/Lobby/Info prize in lobby/CupIcon in prize info (image)'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Lobby/Info prize in lobby/Last Win in prize info (text)'), 'Last Win')

Mobile.verifyElementVisible(findTestObject('Clawee/Lobby/Info prize in lobby/Play Video in prize info (btn)'), 0)

