package employee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ClearTestCase {

	@Test
	void clearTest() throws InterruptedException {
		Employee list1 = new Employee();
		list1.frame.setVisible(true);

		int counter = 3;
		ArrayList<Empl> b = new ArrayList<>();
		Thread.sleep(800);
		for(int i=0;i<counter;i++) {
	
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
		
		Thread.sleep(1000);
		list1.simulateReset();
		
		assertTrue(list1.emp.isEmpty(),"Clear Test Case Failed");
		Thread.sleep(3000);
	}

}
