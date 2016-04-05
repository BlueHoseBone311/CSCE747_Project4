package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;

import org.junit.Before;
import org.junit.Test;

public class CoffeeMakerTest
{

	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;

	@Before
	public void setUp() throws Exception
	{
		cm = new CoffeeMaker();

		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee1");
		r1.setAmtChocolate("1");
		r1.setAmtCoffee("2");
		r1.setAmtMilk("3");
		r1.setAmtSugar("4");
		r1.setPrice("5");

		//Set up for r2
		r2 = new Recipe();
		r2.setName("Coffee2");
		r2.setAmtChocolate("6");
		r2.setAmtCoffee("7");
		r2.setAmtMilk("8");
		r2.setAmtSugar("9");
		r2.setPrice("10");

		cm.addRecipe(r1);
		cm.addRecipe(r2);

	} // End of setUp method


	// -------------------------------------------------------------------
	// tests addInventory & checkInventory methods in CoffeeMaker class
	// -------------------------------------------------------------------
	@Test
	public void addInventoryTest()
	{
		String inv = cm.checkInventory();

		System.out.println("");
		System.out.println("Initial Inventory");
		System.out.println(inv);

		int initialCoffee = getIngredientCount(inv,"Coffee");
		int initialMilk = getIngredientCount(inv,"Milk");
		int initialSugar = getIngredientCount(inv,"Sugar");
		int initialChocolate = getIngredientCount(inv,"Chocolate");

		try
		{
			cm.addInventory("1","2","3","4");
		}
		catch (InventoryException e)
		{
			fail("InventoryException should not be thrown");
    	}

 		inv = cm.checkInventory();
		System.out.println("Final Inventory");
		System.out.println(inv);

		int finalCoffee = getIngredientCount(inv,"Coffee");
		int finalMilk = getIngredientCount(inv,"Milk");
		int finalSugar = getIngredientCount(inv,"Sugar");
		int finalChocolate = getIngredientCount(inv,"Chocolate");

		assertEquals((initialCoffee + 1),finalCoffee );
		assertEquals((initialMilk + 2), finalMilk );
		assertEquals((initialSugar + 3), finalSugar );
		assertEquals((initialChocolate + 4), finalChocolate );

	} // End of addInventoryTest method


	private int getIngredientCount(String inventory, String searchIngred)
	{
		int rv = -1;

		String[] allIngred = inventory.split("\n");

		for (int i = 0; i < allIngred.length; i ++)
		{
			if (allIngred[i].contains(searchIngred) && allIngred[i].contains(":"))
			{
				String[] singleIngred = allIngred[i].split(":");
				rv = Integer.parseInt(singleIngred[1].trim());
			} // End of if - finding our ingredient and setting return
		} // End of for looping through ingredients

		return rv;

	} // End of getIngredientCount method


	// -------------------------------------------------------------------
	// tests addRecipe method in CoffeeMaker class
	// -------------------------------------------------------------------
	@Test
	public void addRecipeTest() throws Exception
	{
		Recipe [] recipeArray = cm.getRecipes();

		assertEquals(recipeArray[0].getName(),"Coffee1" );
		assertEquals(recipeArray[0].getAmtChocolate(),1);
		assertEquals(recipeArray[0].getAmtCoffee(),2);
		assertEquals(recipeArray[0].getAmtMilk(),3);
		assertEquals(recipeArray[0].getAmtSugar(),4);
		assertEquals(recipeArray[0].getPrice(),5);

		assertEquals(recipeArray[1].getName(),"Coffee2" );
		assertEquals(recipeArray[1].getAmtChocolate(),6);
		assertEquals(recipeArray[1].getAmtCoffee(),7);
		assertEquals(recipeArray[1].getAmtMilk(),8);
		assertEquals(recipeArray[1].getAmtSugar(),9);
		assertEquals(recipeArray[1].getPrice(),10);

	} // End of addRecipeTest method


	// -------------------------------------------------------------------
	// tests deleteRecipe method & getRecipes methods in CoffeeMaker class
	// -------------------------------------------------------------------
	@Test
	public void deleteRecipeTest() throws Exception
	{
		Recipe [] recipeArray = cm.getRecipes();

		// Ensure that the recipe does exist prior to deleting it
		assertEquals(recipeArray[0].getName(),"Coffee1");

		String result = cm.deleteRecipe(0);

		// Ensure that the recipe does NOT exist after deleting it
		assertEquals(recipeArray[0].getName(),"");

	} // End of deleteRecipeTest method


	// -------------------------------------------------------------------
	// tests editRecipe method in CoffeeMaker class
	// -------------------------------------------------------------------
	@Test
	public void editRecipeTest() throws Exception
	{
		//addRecipes();
		Recipe [] recipeArray = cm.getRecipes();

		// Ensure that the recipe does exist prior to editing it
		assertEquals(recipeArray[0].getName(),"Coffee1" );

		//Set up for r3
		r3 = new Recipe();
		r3.setName("Coffee3");
		r3.setAmtChocolate("4");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("2");
		r3.setAmtSugar("1");
		r3.setPrice("10");

		String result = cm.editRecipe(0, r3);

		recipeArray = cm.getRecipes();

		// Ensure that the new recipe does exist
		assertEquals(recipeArray[0].getName(),"Coffee3" );

	} // End of editRecipeTest

	// -------------------------------------------------------------------
	// tests makeCoffee method in CoffeeMaker class
	// -------------------------------------------------------------------
	@Test
	public void makeCoffeeTest() throws Exception
	{
		int result;

		// Recipe does not exist return money entered
		result = cm.makeCoffee(2,20);
		assertEquals(result,20);

		// Enough money supplied. Make coffee and return the change. Price is 10
		result = cm.makeCoffee(1,20);
		assertEquals(result,10);

		// Not enough money given, return money entered - Price is 10
		result = cm.makeCoffee(1,1);
		assertEquals(result,1);

		// Enough money supplied, but we ran out of sugar so refund the amount
		result = cm.makeCoffee(1,20);
		assertEquals(result,20);

	} // End of makeCoffeeTest

} // End of CoffeeMakerTest class
