package fr.techad.edc.pages.config.strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class VersionComp {
	private WebDriver driver;
	By versionSelector = By.xpath("//div[@class='select-version']");
	

	public VersionComp(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Select the version
	 * 
	 * @param strVersion
	 */
	public void selectVersion(String strVersion) {
		Select versionSelectorField = new Select(
				driver.findElement(By.xpath("//select[@class='ng-untouched ng-pristine ng-valid']")));
		versionSelectorField.selectByVisibleText(strVersion);
	}
}
