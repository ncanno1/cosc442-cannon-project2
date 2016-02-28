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
	double balance;

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
		balance = vm1.getBalance();
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
	
	/*
	 * Testing removing an item from slot A
	 * Should set the slot to null
	 */
	@Test
	public void testRemoveItemA() {
		vm2.removeItem("A");
		assertNull(vm2.getItem("A"));
	}
	
	/*
	 * Testing removing an item from slot B
	 * Should set the slot to null
	 */
	@Test
	public void testRemoveItemB() {
		vm2.removeItem("B");
		assertNull(vm2.getItem("B"));
	}
	
	/*
	 * Testing removing an item from slot C
	 * Should set the slot to null
	 */
	@Test
	public void testRemoveItemC() {
		vm2.removeItem("C");
		assertNull(vm2.getItem("C"));
	}
	
	/*
	 * Testing removing an item from slot D
	 * Should set the slot to null
	 */
	@Test
	public void testRemoveItemD() {
		vm2.removeItem("D");
		assertNull(vm2.getItem("D"));
	}
	
	/*
	 * Testing removing an item that isn't there from slot A
	 * Should throw and exception
	 */
	@Test
	public void testRemoveItemANull() {
		try {
			vm1.removeItem("A");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing removing an item that isn't there from slot B
	 * Should throw and exception
	 */
	@Test
	public void testRemoveItemBNull() {
		try {
			vm1.removeItem("B");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing removing an item that isn't there from slot C
	 * Should throw and exception
	 */
	@Test
	public void testRemoveItemCNull() {
		try {
			vm1.removeItem("C");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing removing an item that isn't there from slot D
	 * Should throw and exception
	 */
	@Test
	public void testRemoveItemDNull() {
		try {
			vm1.removeItem("D");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing removing an item with an invalid code
	 * Should throw and exception
	 */
	@Test
	public void testRemoveItemInvalidCode() {
		try {
			vm1.removeItem("X");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing inserting money
	 * Should add the value entered
	 */
	@Test
	public void testInsertMoney() {
		vm1.insertMoney(3.25);
		assertEquals(balance + 3.25, vm1.getBalance(), .001);
	}
	
	/*
	 * Testing inserting money more than once
	 * Should add all the values entered
	 */
	@Test
	public void testInsertMoneyMultiple() {
		vm1.insertMoney(3.25);
		vm1.insertMoney(4.0);
		vm1.insertMoney(2.6);
		balance = balance + 3.25 + 4.0 + 2.6;
		assertEquals(balance, vm1.getBalance(), .001);
	}
	
	/*
	 * Testing inserting negative money
	 * Should throw an exception
	 */
	@Test
	public void testInsertMoneyNegative() {
		try {
			vm1.insertMoney(-1.0);
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
	}
	
	/*
	 * Testing getting the balance
	 * Should return current balance
	 */
	@Test
	public void testGetBalanceZero() {
		assertEquals(0, vm1.getBalance(), .001);
	}
	
	/*
	 * Testing getting the balance after adding money
	 * Should return current balance
	 */
	@Test
	public void testGetBalanceAdded() {
		vm1.insertMoney(6.15);
		assertEquals(6.15, vm1.getBalance(), .001);
	}
	
	/*
	 * Testing if the balance updates correctly when making a purchase
	 * Should return the current balance
	 */
	@Test
	public void testMakePurchaseBalance() {
		vm2.insertMoney(3.0);
		vm2.makePurchase("C");
		balance = balance + 3.0 - 1.5;
		assertEquals(balance, vm2.getBalance(), .001);
	}
	
	/*
	 * Testing if the item gets removed when making a purchase
	 * Should successfully remove the item
	 */
	@Test
	public void testMakePurchaseRemove() {
		vm2.insertMoney(3.0);
		vm2.makePurchase("C");
		assertNull(vm2.getItem("C"));
	}
	
	/*
	 * Testing if the makePurchase method correctly returns false when balance < item price
	 * Should not purchase the item (should return false)
	 */
	@Test
	public void testMakePurchaseBalanceLow() {
		assertFalse(vm2.makePurchase("C"));
	}
	
	/*
	 * Testing making a purchase with invalid code
	 * Should throw an exception
	 */
	@Test
	public void testMakePurchaseInvalidCode() {
		try {
			vm1.makePurchase("X");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	
	/*
	 * Testing if returnChange correctly sets balance to 0
	 * Should set balance to 0
	 */
	@Test
	public void testReturnChangeBalance() {
		vm1.insertMoney(3.0);
		vm1.returnChange();
		assertEquals(0, vm1.getBalance(), .001);
	}
	
	/*
	 * Testing if returnChange returns the correct amount of change
	 * Should return the correct amount of change
	 */
	@Test
	public void testReturnChangeAmount() {
		vm1.insertMoney(3.0);
		assertEquals(3.0, vm1.returnChange(), .001);
	}

}
