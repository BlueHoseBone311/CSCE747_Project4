package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeBook_Test
{
	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
	private Recipe r5;
	private Recipe r1_2; //Same as r1 but different instance
	RecipeBook recipeBook;

	@Before
	public void setUp() throws Exception
	{
		recipeBook = new RecipeBook();
		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");
		
		//Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");
		
		//Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");
		
		//Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate("4");
		r4.setAmtCoffee("0");
		r4.setAmtMilk("1");
		r4.setAmtSugar("1");
		r4.setPrice("65");
		
		//Set up for r5
		r5 = new Recipe();
		r5.setName("Double Chocolate Hot Chocolate");
		r5.setAmtChocolate("8");
		r5.setAmtCoffee("0");
		r5.setAmtMilk("1");
		r5.setAmtSugar("1");
		r5.setPrice("65");
		//Set up r1_2  
		r1_2 = new Recipe();
		r1_2.setName("OtherCoffee");
		r1_2.setAmtChocolate("0");
		r1_2.setAmtCoffee("3");
		r1_2.setAmtMilk("1");
		r1_2.setAmtSugar("1");
		r1_2.setPrice("50");
				
	}

	@After
	public void tearDown() throws Exception
	{
		recipeBook = null;
	}

	@Test 
	public void testGetRecipeSucceed()
	{
		//assertTrue(recipeBook.getRecipes() instanceof ArrayList<?>);
	}
	/**
	 * Checks to see if recipe was added successfully added as reported by addRecipe method
	 * as well as that the values were untampered with in the adding process 
	 */
	@Test
	public void testAddRecipeSucceeds()
	{
		//recipeBook = new RecipeBook();
		assertTrue(recipeBook.addRecipe(r2));
		assertEquals("Mocha", recipeBook.getRecipes()[0].getName());
		assertEquals(20,recipeBook.getRecipes()[0].getAmtChocolate());
		assertEquals(3,recipeBook.getRecipes()[0].getAmtCoffee());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtMilk());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtSugar());
		assertEquals(75,recipeBook.getRecipes()[0].getPrice());
	}
	/**
	 * Tests whether addRecipe allows adding the same instance of the same recipe twice
	 */
	@Test
	public void testAddRecipeFailsSameInstance()
	{
		//recipeBook = new RecipeBook();
		recipeBook.addRecipe(r1);
		//try to add the recipe again
		assertFalse(recipeBook.addRecipe(r1));
	}
	/**
	 * Tests whether adding a recipe with ingredients that are semantically equivalent 
	 * but is of a different instance and different name
	 */
	@Test
	public void testAddRecipeFailsDifferentInstance()
	{
		recipeBook.addRecipe(r1);
		//Same ingredients as r1 but different instance and name. Should not be allowed
		assertFalse(recipeBook.addRecipe(r1_2));
	}
	
	/**
	 * Tests whether a recipe is added in the first available location after delete
	 */
	@Test
	public void testAddRecipeFailsAfterDelete()
	{
		recipeBook.addRecipe(r1);
		recipeBook.addRecipe(r2);
		recipeBook.addRecipe(r3);
		recipeBook.deleteRecipe(0);
		recipeBook.addRecipe(r4);
		assertTrue(r4.equals(recipeBook.getRecipes()[0]));
	}
	/**
	 * Tests if the added recipe has the same name as the recipe to be added
	 */
	@Test
	public void testAddRecipeFails3 ()
	{
		recipeBook.addRecipe(r1);
		recipeBook.addRecipe(r2);
		String A = r3.getName();
		recipeBook.editRecipe(0, r3);
		String B = recipeBook.getRecipes()[0].getName();
		assertEquals(A, B);
	}
	/**
	 * Tests if the data structure holding the recipes dynamically resizes
	 */
	@Test
	public void testAddRecipeFailsOverfill()
	{
		recipeBook.addRecipe(r1);
		recipeBook.addRecipe(r2);
		recipeBook.addRecipe(r3);
		recipeBook.addRecipe(r4);
		//asserts that we can't add a recipe in position 5 because it would overflow the recipebook
		assertTrue(recipeBook.addRecipe(r5));	
	}
	/**
	 * Tests that the position for deleting a recipe is set to null following delete
	 */
	@Test
	public void testDeleteRecipe()
	{
		recipeBook.addRecipe(r1);
		recipeBook.deleteRecipe(0);
		assertTrue(recipeBook.getRecipes()[0].getName().equals(null));
	}

}
