package employee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
//import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SortTestCase {

	@Test
	void sortTest() throws InterruptedException {
		Employee list1 = new Employee();
		list1.frame.setVisible(true);
		
		int counter = 3;
		ArrayList<Empl> b = new ArrayList<>();
		Thread.sleep(800);
		for(int i=counter;i>0;i--) {
		
			Thread.sleep(200);
			list1.NameField.setText("Employee"+i);
			Thread.sleep(200);
			list1.DeptField.setText("Department"+i);
			Thread.sleep(200);
			list1.Button.doClick();
			Thread.sleep(200);
			Empl stud = new Empl("Employee"+i, "Department"+i);
			b.add(stud);
		}
		
		Thread.sleep(1000);
		list1.sortSimulate();
		Thread.sleep(1000);
		
		Empl Employee3 = new Empl("Employee3", "Department3");
		Empl Employee2 = new Empl("Employee2", "Department2");
		Empl Employee1 = new Empl("Employee1", "Department1");
		assertNotSame(Employee2,Employee1);
		assertNotSame(Employee3,Employee2);
		assertNotSame(Employee3,Employee1);
		
		Thread.sleep(3000);
		
	}

}
