/*
 * package com.terrainactivity;
 * 
 * import java.io.File; import java.util.List;
 * 
 * import org.apache.commons.io.FileUtils; import org.openqa.selenium.By; import
 * org.openqa.selenium.OutputType; import org.openqa.selenium.TakesScreenshot;
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * import cucumber.annotation.After; import cucumber.annotation.Before; import
 * cucumber.annotation.en.Given; import cucumber.annotation.en.Then; import
 * cucumber.annotation.en.When; import cucumber.table.DataTable;
 * 
 * public class Steps {
 * 
 * @Before public void beforeScenario() {
 * System.setProperty("webdriver.chrome.driver",
 * "./src/main/resources/chromedriver.exe");
 * 
 * driver = new ChromeDriver(); } WebDriver driver;
 * 
 * @Given("^I open guru99 website$") public void open_guru99() throws Throwable
 * { driver.navigate().to("http://demo.guru99.com/insurance/v1/register.php");
 * 
 * System.out.println("Registration page of the application is opened."); }
 * 
 * @When("^user enter valid data on the page$") public void
 * enter_data_Reg(DataTable table) throws Throwable {
 * 
 * List<List<String>> data=table.raw(); Select drpCountry = new
 * Select(driver.findElement(By.id("user_title")));
 * drpCountry.selectByVisibleText(data.get(1).get(1)); //Thread.sleep(2000);
 * 
 * driver.findElement(By.id("user_firstname")).sendKeys(data.get(2).get(1));
 * //Thread.sleep(2000);
 * 
 * driver.findElement(By.id("user_surname")).sendKeys(data.get(3).get(1));
 * //Thread.sleep(2000);
 * 
 * driver.findElement(By.id("user_phone")).sendKeys(data.get(4).get(1));
 * //Thread.sleep(2000);
 * 
 * Select sYear = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
 * sYear.selectByVisibleText(data.get(5).get(1)); //Thread.sleep(2000);
 * 
 * Select sMonth = new Select(driver.findElement(By.id("user_dateofbirth_2i")));
 * sMonth.selectByVisibleText(data.get(6).get(1)); //Thread.sleep(2000);
 * 
 * Select sdate = new Select(driver.findElement(By.id("user_dateofbirth_3i")));
 * sdate.selectByVisibleText(data.get(7).get(1)); //Thread.sleep(2000);
 * 
 * driver.findElement(By.id("licencetype_f")).click(); //Thread.sleep(2000);
 * 
 * Select sLicensePeriod = new
 * Select(driver.findElement(By.id("user_licenceperiod")));
 * sLicensePeriod.selectByVisibleText(data.get(8).get(1)); //Thread.sleep(2000);
 * 
 * Select sOccupation = new
 * Select(driver.findElement(By.id("user_occupation_id")));
 * sOccupation.selectByVisibleText(data.get(9).get(1)); //Thread.sleep(2000);
 * 
 * driver.findElement(By.name("street")).sendKeys(data.get(10).get(1));
 * //Thread.sleep(2000);
 * 
 * driver.findElement(By.name("city")).sendKeys(data.get(11).get(1));
 * //Thread.sleep(2000);
 * 
 * driver.findElement(By.name("county")).sendKeys(data.get(12).get(1));
 * //Thread.sleep(2000);
 * 
 * driver.findElement(By.name("post_code")).sendKeys(data.get(13).get(1));
 * //Thread.sleep(2000);
 * 
 * driver.findElement(By.name("email")).sendKeys(data.get(14).get(1));
 * //Thread.sleep(2000);
 * 
 * driver.findElement(By.name("password")).sendKeys(data.get(15).get(1));
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.name("c_password")).sendKeys(data.get(16).get(1));
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.name("submit")).click();
 * 
 * 
 * System.out.println("data entered in the application"); }
 * 
 * @Then("^the user registration should be successful$") public void
 * success_Reg() throws Throwable { driver.getTitle().contains("Title");
 * System.out.
 * println("Matching the title of the page after successful Registration.");
 * boolean funcLogin ;
 * if(driver.findElement(By.xpath("//h3[contains(text(),'Login')]")).isDisplayed
 * ()) { funcLogin = true; } else { funcLogin = false; } if(funcLogin) {
 * System.out.println("Successful Registration"); TakesScreenshot ts
 * =((TakesScreenshot)driver); File Src=ts.getScreenshotAs(OutputType.FILE);
 * File Desti=new File("./target/Snapshott/Regsuccess.png");
 * FileUtils.copyFile(Src, Desti); } else {
 * System.out.println("UnSuccessful Registration"); TakesScreenshot ts
 * =((TakesScreenshot)driver); File Src=ts.getScreenshotAs(OutputType.FILE);
 * File Desti=new File("./target/Snapshott/Regunsuccess.png");
 * FileUtils.copyFile(Src, Desti); }
 * 
 * 
 * }
 * 
 * //Login
 * 
 * 
 * @When("^User enters (\\w+) and (\\w+)$") public void
 * user_enters_UserName_and_Password(String email, String password) throws
 * Throwable { System.out.println(email); System.out.println(password);
 * driver.findElement(By.id("email")).sendKeys(email); Thread.sleep(500);
 * 
 * driver.findElement(By.id("password")).sendKeys(password); Thread.sleep(500);
 * driver.findElement(By.name("submit")).click();
 * 
 * 
 * 
 * System.out.println("data entered in the application"); }
 * 
 * 
 * @Then("^Successful Login$") public void success_login() throws Throwable {
 * driver.getTitle().contains("Title"); boolean funcLogin ;
 * if(driver.findElement(By.xpath("//li[@id='home']")).isDisplayed()) {
 * funcLogin = true; } else { funcLogin = false; } if(funcLogin) {
 * System.out.println("Successful Login"); TakesScreenshot ts
 * =((TakesScreenshot)driver); File Src=ts.getScreenshotAs(OutputType.FILE);
 * File Desti=new File("./target/Snapshott/Login-success.png");
 * FileUtils.copyFile(Src, Desti); } else {
 * System.out.println("UnSuccessful Login"); TakesScreenshot ts
 * =((TakesScreenshot)driver); File Src=ts.getScreenshotAs(OutputType.FILE);
 * File Desti=new File("./target/Snapshott/Login-unsuccess.png");
 * FileUtils.copyFile(Src, Desti); }
 * 
 * 
 * }
 * 
 * //Purchase
 * 
 * @When("^user enters valid data details on the page$") public void
 * enter_Data(DataTable table) throws Throwable{
 * driver.findElement(By.partialLinkText("Payment Gateway")).click();
 * List<List<String>> data = table.raw();
 * driver.findElement(By.name("quantity")).sendKeys(data.get(1).get(1));
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
 * driver.findElement(By.id("card_nmuber")).sendKeys(data.get(2).get(1));
 * Thread.sleep(2000); Select drpmonth = new
 * Select(driver.findElement(By.id("month")));
 * drpmonth.selectByVisibleText(data.get(3).get(1)); Thread.sleep(2000); Select
 * drpyear = new Select(driver.findElement(By.id("year")));
 * drpyear.selectByVisibleText(data.get(4).get(1)); Thread.sleep(2000);
 * driver.findElement(By.id("cvv_code")).sendKeys(data.get(5).get(1));
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//input[@type='submit']")).click();
 * Thread.sleep(2000);
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * @Then("^payment should be done$") public void payment_Successful() throws
 * Throwable{ boolean purchase ;
 * if(driver.findElement(By.xpath("//h2[text()='Payment successfull!']")).
 * isDisplayed()) { purchase = true; } else { purchase = false; } if(purchase) {
 * System.out.println(); System.out.println("Payment successfull");
 * TakesScreenshot ts =((TakesScreenshot)driver); File
 * SrcFile=ts.getScreenshotAs(OutputType.FILE); File DestFile=new
 * File("./target/Snapshott/Payment-SuccessfulPage.png");
 * FileUtils.copyFile(SrcFile, DestFile); } else {
 * System.out.println("Payment unsuccessful"); TakesScreenshot ts
 * =((TakesScreenshot)driver); File SrcFile=ts.getScreenshotAs(OutputType.FILE);
 * File DestFile=new File("./target/Snapshott/Payment-UnSuccessful.png");
 * FileUtils.copyFile(SrcFile, DestFile); }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * @After public void Close_the_browser() throws Throwable {
 * 
 * driver.quit();
 * System.out.println("Closes the browser opened through selenium"); }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 */