package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gallary_POM{
	
	public Gallary_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);}
	
	@FindBy(xpath="//a[text()='GALLERY']")
	private WebElement Gallary;
	@FindBy(xpath="//a[text()='Event Gallery']")
	private WebElement Event_Gallary;
	@FindBy(xpath="//a[text()='Video Gallery']")
	private WebElement Video_gallary;
	@FindBy(xpath="//a[text()='VIP Gallery']")
	private WebElement VIP_gallary;
	
	
	public void Clickon_Gallary() {
		Gallary.click();}
	public void Clickon_Event_Gallary() {
		Event_Gallary.click();}
	
	public void Clickon_Video_Gallary() {
		Video_gallary.click();}
	public void Clickon_VIP_Gallary() {
		VIP_gallary.click();}
	
}