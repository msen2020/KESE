package utilities;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;

public class BrowserUtils {

    public static void mySendKeysMethod (By locator, String sendText){

        WebElement element = Driver.get().findElement(locator);

        Wait<WebDriver> wait = new FluentWait<>(Driver.get()).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                withMessage("My click method failed");

        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(sendText);

    }

    public static boolean isDisplayed (By locator){

        return waitUntilVisibilityOf(locator).isDisplayed();
    }

    public static boolean isDisplayed (WebElement element){

        return waitUntilVisibilityOf(element).isDisplayed();
    }

    public static boolean isDisabled (By locator){

        return Boolean.parseBoolean(Driver.get().findElement(locator).getAttribute("disabled"));
    }

    public static void waitUntilVisibilityOfAllElements(List<WebElement> elementList){

        Wait<WebDriver> wait = new FluentWait<>(Driver.get()).
                withTimeout(Duration.ofSeconds(4)).
                pollingEvery(Duration.ofSeconds(2)).
                withMessage("Element list not loaded");

        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
    }

    public static WebElement waitUntilVisibilityOf (By locator){

        WebElement element = Driver.get().findElement(locator);

        Wait<WebDriver> wait = new FluentWait<>(Driver.get()).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                withMessage("My click method failed");

        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitUntilVisibilityOf (WebElement element){

        Wait<WebDriver> wait = new FluentWait<>(Driver.get()).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                withMessage("My click method failed");

        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean isEnabled (By locator){

        return waitUntilVisibilityOf(locator).isEnabled();
    }

    public static void waitAndClick (WebElement element){
        Wait<WebDriver> wait = new FluentWait<>(Driver.get()).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                withMessage("My click method failed");
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void waitAndSendKeys (WebElement element, CharSequence...  text){
        Wait<WebDriver> wait = new FluentWait<>(Driver.get()).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                withMessage("My click method failed");
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }

    public static void myClickMethod (By locator){

        WebElement element = Driver.get().findElement(locator);

        Wait<WebDriver> wait = new FluentWait<>(Driver.get()).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                withMessage("My click method failed");

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    // randomly generate a name method
    public static String generateAName() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            name.append(alphabet.charAt(rnd.nextInt(alphabet.length())));
        }
        return name.toString();
    }

    // randomly generate a name method
    public static String generateAnEmail() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random rnd = new Random();
        StringBuilder email = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            email.append(alphabet.charAt(rnd.nextInt(alphabet.length())));
        }
        return email + "@gmail.com";
    }

    public static String myGetCurrentUrlMethod(){

        BrowserUtils.waitForPageToLoad(3000);
        return Driver.get().getCurrentUrl();
    }

    /** switches to new window by the exact title  */
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.get().getWindowHandle();
        for (String handle : Driver.get().getWindowHandles()) {
            Driver.get().switchTo().window(handle);
            if (Driver.get().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.get().switchTo().window(origin);
    }

    /*** Moves the mouse to given element *
     *
     * @param element on which to hover
     */
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }

    /**
     * return a list of string from a list of elements
     *
     * @param list of webElements
     * @return list of string
     */
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static String getElementText(By locator){

        WebElement element = Driver.get().findElement(locator);

        Wait<WebDriver> wait = new FluentWait<>(Driver.get()).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                withMessage("My click method failed");

        wait.until(ExpectedConditions.visibilityOf(element)).getText();

        return element.getText();
    }

    /**
     * Extracts text from list of elements matching the provided locator into new List<String>
     *
     * @param locator _
     * @return list of strings
     */
    public static List<String> getElementsText(By locator) {

        List<WebElement> elements = Driver.get().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elements) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static String getSingleElementText(By locator){

        return Driver.get().findElement(locator).getText();
    }

    /**     * Performs a pause     *
     * @param seconds _
     */
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element _
     * @param timeToWaitInSec _
     * @return _
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits for element matching the locator to be visible on the page
     *
     * @param locator _
     * @param timeout _
     * @return _
     */
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Waits for provided element to be clickable
     *
     * @param element _
     * @param timeout _
     * @return _
     */
    public static WebElement waitForClickability(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Waits for element matching the locator to be clickable
     *
     * @param locator _
     * @param timeout _
     * @return _
     */
    public static WebElement waitForClickability(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * waits for backgrounds processes on the browser to complete
     *
     * @param timeOutInSeconds _
     */
    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = driver -> {
            assert driver != null;
            return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }

    /**
     * Verifies whether the element matching the provided locator is displayed on page
     *
     * @param by _
     * @throws AssertionError if the element matching the provided locator is not found or not displayed
     */
    public static void verifyElementDisplayed(By by) {
        try {
            assertTrue("Element not visible: " + by, Driver.get().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            fail("Element not found: " + by);

        }
    }

    /*** Verifies whether the element matching the provided locator is NOT displayed on page
     *
     * @param by _
     * @throws AssertionError the element matching the provided locator is displayed
     */
    public static void verifyElementNotDisplayed(By by) {
        try {
            assertFalse("Element should not be visible: " + by, Driver.get().findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    /*** Verifies whether the element is displayed on page
     *
     * @param element _
     * @throws AssertionError if the element is not found or not displayed
     */
    public static void verifyElementDisplayed(WebElement element) {
        try {
            assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            fail("Element not found: " + element);

        }
    }


    /*** Waits for element to be not stale
     *
     * @param element _
     */
    public void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            if (y == 1)
                try {
                    element.isDisplayed();
                    break;
                } catch (StaleElementReferenceException st) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (WebDriverException we) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }


    /**
     * Clicks on an element using JavaScript
     *
     * @param element _
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }


    /**
     * Scrolls down to an element using JavaScript
     *
     * @param element _
     */
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Performs double click action on an element
     *
     * @param element _
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.get()).doubleClick(element).build().perform();
    }

    /**
     * Changes the HTML attribute of a Web Element to the given value using JavaScript
     *
     * @param element _
     * @param attributeName _
     * @param attributeValue _
     */
    public static void setAttribute(WebElement element, String attributeName, String attributeValue) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attributeName, attributeValue);
    }

    /**
     * Highlights an element by changing its background and border color
     *
     * @param element _
     */
    public static void highlight(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
        waitFor(1);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].removeAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }

    /**
     * Checks or unchecks given checkbox
     *
     * @param element _
     * @param check _
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }

    /**
     * attempts to click on provided element until given time runs out
     *
     * @param element _
     * @param timeout _
     */
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }


    /**
     * This method creates a random string
     *
     * @param length number of letters in string
     * @return random string
     */

    public static String getRandomString(int length) {
        String possibleLetters = "abcdefgijklmopqrstuvwxyz";
        char[] rndWord = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * possibleLetters.length());
            rndWord[i] = possibleLetters.charAt(rand);
        }
        return new String(rndWord);
    }

    /**
     * executes the given JavaScript command on given web element
     *
     * @param element _
     */
    public static void executeJSCommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript(command, element);
    }

    /**
     * executes the given JavaScript command on given web element
     *
     * @param command _
     */
    public static void executeJSCommand(String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript(command);

    }

    /**
     *   In our isNumeric() method, we're just checking for values that are of type Double,
     * Integer, Float, Long, and large numbers by using any of the parse methods.
     *
     */
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
            /*int i = Integer.parseInt(strNum);
            float f = Float.parseFloat(strNum);
            long l = Long.parseLong(strNum);*/
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String getDataTableData(DataTable dataTable, String value) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        return list.get(0).get(value);
    }



}
