package employee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DeleteTestCase {

	@Test
	void deleteTest() throws InterruptedException {
		Employee list1 = new Employee();
		list1.frame.setVisible(true);
		
		int counter = 3;
		ArrayList<Empl> b = new ArrayList<>();
		Thread.sleep(800);
		for(int i=0;i<counter;i++) {
			//Add Book
			Thread.sleep(200);
			list1.NameField.setText("Employee"+i);
			Thread.sleep(200);
			list1.DeptField.setText("Department"+i);
			Thread.sleep(200);
			list1.Button.doClick();
			Thread.sleep(200);
			Empl book = new Empl("Employee"+i, "Department"+i);
			b.add(book);
		}
		
		Empl Employee2 = new Empl("Employee2", "Department2");
		Empl Employee0 = new Empl("Employee0", "Department0");
		
		//Delete Button
		Thread.sleep(500);
		list1.Button.setText("Delete");
		Thread.sleep(500);
		list1.NameField.setText("Employee1");
		Thread.sleep(500);
		list1.DeptField.setText("Department1");
		Thread.sleep(500);
		list1.Button.doClick();
		
		assertNotNull(list1);
		assertEquals(Arrays.asList(Employee0,Employee2), list1.emp, "Delete Test Case Failed");
		
		Thread.sleep(2500);
	}

}
