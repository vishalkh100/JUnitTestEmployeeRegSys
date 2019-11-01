package employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmptyTestCase {

	@Test
	void emptyTest() throws InterruptedException {
		Employee list1 = new Employee();
		Employee list2 = null;
		list1.frame.setVisible(true);
		assertNull(list2);
		assertTrue(list1.emp.isEmpty(),"Empty Test Case Failed");
		Thread.sleep(2500);
	}

}
