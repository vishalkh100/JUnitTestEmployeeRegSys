package employee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class AddTestCase {

	@Test
	void addTest() throws InterruptedException {
		Employee list1 = new Employee();
		list1.frame.setVisible(true);
		
		int counter = 4;
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
		
		assertEquals(b, list1.emp, "Add Test Case Failed");
		Thread.sleep(2500);
		
		
	}

}
