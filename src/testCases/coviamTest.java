package testCases;


import org.testng.annotations.Test;
import appModules.AppFunctions;
import pageObjects.Home_Page;
import utility.IntSetup;

public class coviamTest extends IntSetup {

	AppFunctions objAppFunctions = new AppFunctions();
	Home_Page objHome_Page = Home_Page.getInstance();

	@Test(priority = 1, enabled = true)
	public void validateAddTodo() throws Exception {
		driver = OpenBrowser();
		objAppFunctions.addTodoBButton(driver, 4);

	}

	@Test(priority = 2, enabled = true)
	public void validateTodoComplete() throws Exception {
		objAppFunctions.markToDoCheckBox(driver, 3);
	}

	@Test(priority = 3, enabled = true)
	public void validateDeleteTodoComplete() throws Exception {
		objAppFunctions.deleteToDoCheckBox(driver, 2);

	}

	@Test(priority = 4, enabled = true)
	public void validateClearCompleteTodo() throws Exception {
		objHome_Page.button_clearCompleted(driver).click();	
	}
}
