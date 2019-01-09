package appModules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;

public class AppFunctions {

	Home_Page objHome_Page = Home_Page.getInstance();

	public void addTodoBButton(WebDriver driver, int numberOfTodo) throws Exception {

		for (int i = 0; i < numberOfTodo; i++) {
			objHome_Page.textBox_ToDo(driver).click();
			objHome_Page.textBox_ToDo(driver).sendKeys("toDo" + i);
			objHome_Page.textBox_ToDo(driver).sendKeys(Keys.ENTER);

		}

	}

	public void markToDoCheckBox(WebDriver driver, int numberOfTodo) throws Exception {

		for (int i = 0; i < numberOfTodo; i++) {
			objHome_Page.checkBox_toDO(driver, i).click();

		}

	}

	public void deleteToDoCheckBox(WebDriver driver, int numberOfTodo) throws Exception {

		for (int i = 0; i < numberOfTodo; i++) {
			objHome_Page.label_ToDo(driver, i).click();
			objHome_Page.button_deleteToDo(driver, i).click();
		}

	}

}