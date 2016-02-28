package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	VendingMachine vm1;
	VendingMachine vm2;

	@Before
	public void setUp() throws Exception {
		vm1 = new VendingMachine();
		vm2 = new VendingMachine();
		vm2.addItem(new VendingMachineItem("item1", 1.00), "A");
		vm2.addItem(new VendingMachineItem("item2", 1.25), "B");
		vm2.addItem(new VendingMachineItem("item3", 1.50), "C");
		vm2.addItem(new VendingMachineItem("item1", 1.75), "D");
	}

	@After
	public void tearDown() throws Exception {
		vm1 = null;
		vm2 = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
