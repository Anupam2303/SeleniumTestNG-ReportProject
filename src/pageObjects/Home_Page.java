package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	private WebElement element = null;
	private List<WebElement> elements = null;
	private static Home_Page objHome_Page;

	// using singleton pattern
	private Home_Page() {

	}

	public static Home_Page getInstance() {
		if (objHome_Page == null) {
			return new Home_Page();
		}
		return objHome_Page;
	}



	public WebElement textBox_ToDo(WebDriver driver) throws Exception {
		try {
			element = driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
			System.out.println("textBox_ToDo is found on the Home Page");
		} catch (Exception e) {
			System.out.println("textBox_ToDo is not found on the Home Page");
			throw (e);
		}
		return element;
	}
	
	public WebElement checkBox_toDO(WebDriver driver,int toDoNumber) throws Exception {
		try {
			element = driver.findElement(By.xpath("//*[text() = 'toDo"+toDoNumber+"']/preceding-sibling::input"));
			System.out.println(element);
			System.out.println("checkBox_toDO is found on the Home Page");
		} catch (Exception e) {
			System.out.println("checkBox_toDO is not found on the Home Page");
			throw (e);
		}
		return element;
	}
	
	

	public WebElement label_ToDo(WebDriver driver,int toDoNumber) throws Exception {
		try {
			element = driver.findElement(By.xpath("//*[text() = 'toDo"+toDoNumber+"']"));
			System.out.println("label__ToDo " +toDoNumber+" is found on the Home Page");
		} catch (Exception e) {
			System.out.println("label__ToDo " +toDoNumber+" is not found on the Home Page");
			throw (e);
		}
		return element;
	}
	
	public WebElement button_deleteToDo(WebDriver driver,int toDoNumber) throws Exception {
		try {
			element = driver.findElement(By.xpath("//*[text() = 'toDo"+toDoNumber+"']/following-sibling::button"));
			System.out.println("delete__ToDo " +toDoNumber+" is  found on the Home Page");
		} catch (Exception e) {
			System.out.println("delete__ToDo " +toDoNumber+" is not found on the Home Page");
			throw (e);
		}
		return element;
	}
	
	public WebElement button_clearCompleted(WebDriver driver) throws Exception {
		try {
			element = driver.findElement(By.xpath("//*[text() = 'Clear completed']"));
			System.out.println("button_clearCompleted is found on the Home Page");
		} catch (Exception e) {
			System.out.println("button_clearCompleted is not found on the Home Page");
			throw (e);
		}
		return element;
	}
}
