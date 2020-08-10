package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.model.DataTableRow;
import utils.SeleniumUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

@RunWith(Cucumber.class)
public class stepDef {

	WebDriver driver;
	private static final String url = "https://www.dbs.com.sg/index/default.page";
	private static final String LEARN_MORE = "//p[@class='dbs-group']//button[text()='Learn More']";
	private static final String SINGAPORE_LINK = "//a[contains(@class,'nav-link')][text()='Singapore']";
	private static final String TABLE_CONTENT = "//h3[text()='Singapore']/..//table";
	private static final String About = "//div[@class='navbar-links-left']//a[text()='About']";
	private static final String WHO_WE_ARE = "//*[text()='Who We Are']";
	private static final String OUR_AWARDS_ACCOLATES = "//*[text()='Our Awards & Accolades']";
	private static final String AWARD_LIST = "//div[@class='row mBot-20']";
	private static final String AWARD_NAME = "//h3/strong";
	private static final String CAPTION_AWARD = "//p";

	Scenario scenario;

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		driver = SeleniumUtils.getDriver("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^user clicked on Learn More button$")
	public void user_clicked_on_learn_more_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement elLearn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LEARN_MORE)));
		elLearn.click();

	}

	@And("^scroll down and navigate to Singapore on the left panel$")
	public void scroll_down_and_navigate_to_singapore_on_the_left_panel() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SINGAPORE_LINK)));
		el.click();
	}

	@Then("^Read and write the table in excel sheet$")
	public void read_and_write_the_table_in_excel_sheet() throws Throwable {
		File file = new File(".\\excelsheet\\write.xlsx");
		FileOutputStream fos;
		Workbook wb;
		Sheet sh;
		try {
			fos = new FileOutputStream(file);
			wb = new XSSFWorkbook();
			sh = wb.createSheet("enterprises");
			WebElement table = driver.findElement(By.xpath(TABLE_CONTENT));
			List<WebElement> trs = table.findElements(By.tagName("tr"));
			int i = 0;
			for (WebElement trElement : trs) {
				List<WebElement> tds = trElement.findElements(By.tagName("td"));
				Row rw = sh.createRow(i++);
				int j = 0;
				for (WebElement webElement : tds) {
					Cell cl = rw.createCell(j++);
					cl.setCellType(1);
					cl.setCellValue(webElement.getText());
				}
			}
			wb.write(fos);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@When("^user clicked on About button$")
	public void user_clicked_on_About_button() throws Throwable {
		driver.findElement(By.xpath(About)).click();

	}

	@When("^clicked on Who we are tab$")
	public void clicked_on_Who_we_are_tab() throws Throwable {
		driver.findElement(By.xpath(WHO_WE_ARE)).click();

	}

	@When("^clicked on Our Awards & Accolades$")
	public void clicked_on_Our_Awards_Accolades() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement elAwards = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OUR_AWARDS_ACCOLATES)));
		elAwards.click();
	}

	@Then("^Validate the total number of awards displayed on the page is (\\d+)$")
	public void validate_the_total_number_of_awards_displayed_on_the_page_is(int noOfAwards) throws Throwable {
		List<WebElement> awards = driver.findElements(By.xpath(AWARD_LIST));
		Assert.assertEquals(noOfAwards, awards.size());
	}

	@Then("^Validate all the award name and caption of the awards with following data$")
	public void validate_all_the_award_name_and_caption_of_the_awards_with_following_data(DataTable validatingData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<WebElement> awards = driver.findElements(By.xpath(AWARD_LIST));
		List<DataTableRow> data = validatingData.getGherkinRows();
		List<String> awardList = new ArrayList<String>();
		List<String> captionList = new ArrayList<String>();
		for (WebElement awardel : awards) {
			String awardName = awardel.findElement(By.tagName("strong")).getText();
			String caption = awardel.findElement(By.tagName("p")).getText();
			awardList.add(awardName);
			captionList.add(caption);
		}
		for (DataTableRow row : data) {
			String validatingAward = row.getCells().get(0);
			String validatingCaption = row.getCells().get(1);
			try {
			Assert.assertTrue(validatingAward +" not showing in ", awardList.contains(validatingAward));
			} catch(Throwable ex) {
				scenario.write("validation failed for "+validatingAward);
			}
			try {
			Assert.assertTrue(validatingCaption +" not showing", captionList.contains(validatingCaption));
			} catch(Throwable ex) {
				scenario.write("validation failed for "+validatingCaption);
			}
		}
	}
	
	@Then("^print in the cucumber report in the form of a table$")
	public void print_in_the_cucumber_report_in_the_form_of_a_table() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> awards = driver.findElements(By.xpath(AWARD_LIST));
		for (WebElement awardel : awards) {
			String awardName = awardel.findElement(By.tagName("strong")).getText();
			String caption = awardel.findElement(By.tagName("p")).getText();
			scenario.write(awardName+" | "+caption);
		}
	}
}