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

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Welcome to Clawee'), 'Welcome to Clawee')

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Play Real Claw Machines'), 'Play Real Claw Machines!')

Mobile.comment('Text is true')

Mobile.tap(findTestObject('Clawee/Login guest/Next welcome pop up'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Catch Real Prizes'), 'Catch Real Prizes')

Mobile.comment('Text is true')

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Home Delivery'), 'Home Delivery')

Mobile.comment('Text is true')

Mobile.tap(findTestObject('Clawee/Login guest/Next welcome pop up'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Attention'), 'Attention!')

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/High Quality Internet Connection required for LIVE Video'), 
    'High Quality Internet Connection required for LIVE Video')

Mobile.tap(findTestObject('Clawee/Login guest/Next welcome pop up'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Real Machines'), 'Real Machines')

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Machines are real and may malfunction occasionally.  In such cases please contact support'), 
    'Machines are real and may malfunction occasionally.  In such cases please contact support.')

Mobile.tap(findTestObject('Clawee/Login guest/Next welcome pop up'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Cool Prizes'), 'Cool Prizes')

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Clawee delivers real prizes and therefore payment is required'), 
    'Clawee delivers real prizes and therefore payment is required.')

Mobile.tap(findTestObject('Clawee/Login guest/Next welcome pop up'), 0)

//Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/You received a Welcome Bonus  400 Coins'), 
 //   'You received a Welcome Bonus  400 Coins')

Mobile.tap(findTestObject('Clawee/Login guest/Lets Go welcom pop up'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Be the first'), 'Be the first!')

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Want to be notified about our new prizes and activities'), 
    'Want to be notified about our new prizes and activities?')

Mobile.tap(findTestObject('Clawee/Login guest/popup close button'), 0)

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Play for real'), 'Play for real!')

Mobile.verifyElementText(findTestObject('Clawee/Pop up Text/Welcome pop up/Choose a machine to play'), 'Choose a machine to play')

Mobile.tap(findTestObject('Clawee/Login guest/Lets go (Play for real)'), 0)

