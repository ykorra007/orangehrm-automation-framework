package com.ylli.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ylli.orangehrm.utils.BaseClass;

public class PIMPage {

    @FindBy(linkText = "PIM")
    public WebElement pimMenu;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    public WebElement addEmployeeBtn;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "middleName")
    public WebElement middleName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveBtn;

    public PIMPage() {
        PageFactory.initElements(
                BaseClass.driver,
                this);
    }
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    public WebElement employeeName;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchBtn;

    @FindBy(xpath = "//i[contains(@class,'bi-trash')]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    public WebElement confirmDeleteBtn;
     
    

    @FindBy(xpath = "//h6[text()='Personal Details']")
    public WebElement personalDetailsHeader;

    	@FindBy(xpath = "//div[@role='rowgroup']")
    	public WebElement searchResult;
    
}
