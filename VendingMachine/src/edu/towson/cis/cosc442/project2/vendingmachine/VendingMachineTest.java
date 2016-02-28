package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	VendingMachine vm1;
	VendingMachine vm2;
	VendingMachineItem vmi;
	boolean exceptionThrown;

	@Before
	public void setUp() throws Exception {
		vm1 = new VendingMachine();
		vm2 = new VendingMachine();
		vm2.addItem(new VendingMachineItem("item1", 1.00), "A");
		vm2.addItem(new VendingMachineItem("item2", 1.25), "B");
		vm2.addItem(new VendingMachineItem("item3", 1.50), "C");
		vm2.addItem(new VendingMachineItem("item1", 1.75), "D");
		vmi = new VendingMachineItem("item", 2.00);
		exceptionThrown = false;
	}

	@After
	public void tearDown() throws Exception {
		vm1 = null;
		vm2 = null;
		vmi = null;
	}

	/*
	 * Testing adding item into slot A
	 * Should add the item to the specified slot
	 */
	@Test
	public void testAddItemA() {
		vm1.addItem(vmi, "A");
		assertEquals(vmi, vm1.getItem("A"));
	}
	
	/*
	 * Testing adding item into slot B
	 * Should add the item to the specified slot
	 */
	@Test
	public void testAddItemB() {
		vm1.addItem(vmi, "B");
		assertEquals(vmi, vm1.getItem("B"));
	}
	
	/*
	 * Testing adding item into slot C
	 * Should add the item to the specified slot
	 */
	@Test
	public void testAddItemC() {
		vm1.addItem(vmi, "C");
		assertEquals(vmi, vm1.getItem("C"));
	}
	
	/*
	 * Testing adding item into slot D
	 * Should add the item to the specified slot
	 */
	@Test
	public void testAddItemD() {
		vm1.addItem(vmi, "D");
		assertEquals(vmi, vm1.getItem("D"));
	}
	
	/*
	 * Testing adding item into slot A when full
	 * Should throw an exception
	 */
	@Test
	public void testAddItemAFull() {
		try {
			vm2.addItem(vmi, "A");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing adding item into slot B when full
	 * Should throw an exception
	 */
	@Test
	public void testAddItemBFull() {
		try {
			vm2.addItem(vmi, "B");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing adding item into slot C when full
	 * Should throw an exception
	 */
	@Test
	public void testAddItemCFull() {
		try {
			vm2.addItem(vmi, "C");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing adding item into slot D when full
	 * Should throw an exception
	 */
	@Test
	public void testAddItemDFull() {
		try {
			vm2.addItem(vmi, "D");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing adding item with an invalid code
	 * Should throw an exception
	 */
	@Test
	public void testAddItemInvalidCode() {
		try {
			vm2.addItem(vmi, "X");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}

}
