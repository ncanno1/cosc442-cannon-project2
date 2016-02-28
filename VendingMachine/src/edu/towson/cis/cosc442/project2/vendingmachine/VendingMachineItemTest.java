package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {
	
	VendingMachineItem vmi1;

	//Creates the vending machine item
	@Before
	public void setUp() throws Exception {
		vmi1 = new VendingMachineItem("Drink", 1.25);
	}

	//Sets the vending machine item to null
	@After
	public void tearDown() throws Exception {
		vmi1 = null;
	}

	/*
	 * Tests getName()
	 * Should return the name of the vending machine item
	 */
	@Test
	public void testGetName() {
		assertEquals("Drink", vmi1.getName());
	}
	
	/*
	 * Tests getPrice()
	 * Should return the price of the vending machine item
	 */
	@Test
	public void testGetPrice() {
		assertEquals(1.25, vmi1.getPrice(), .001);
	}
	
	/*
	 * Tests the constructor
	 * Should throw an exception if the price < 0
	 */
	@Test
	public void testConstructor() {
		VendingMachineItem vmi2;
		boolean priceNotSet = false;
		try {
			vmi2 = new VendingMachineItem("Snack", -1.0);
		} catch (VendingMachineException e) {
			priceNotSet = true;
		}
		assertTrue(priceNotSet);
	}

}
