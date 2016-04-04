package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

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
		
				
	}

	@After
	public void tearDown() throws Exception
	{
		recipeBook = null;
	}

	@Test
	public void testGetRecipeSucceed()
	{
		//recipeBook = new RecipeBook();
		assertEquals(4, recipeBook.getRecipes().length);
	}
	@Test
	public void testAddRecipeSucceeds()
	{
		//recipeBook = new RecipeBook();
		assertEquals(true, recipeBook.addRecipe(r2));
	}
	@Test
	public void testAddRecipeFails()
	{
		//recipeBook = new RecipeBook();
		recipeBook.addRecipe(r1);
		//try to add the recipe again
		assertEquals(false, recipeBook.addRecipe(r1));
	}
	
	@Test
	public void testAddRecipeFailsOverfill()
	{
		recipeBook.addRecipe(r1);
		recipeBook.addRecipe(r2);
		recipeBook.addRecipe(r3);
		recipeBook.addRecipe(r4);
		//asserts that we can't add a recipe in position 5 because it would overflow the recipebook
		assertEquals(false, recipeBook.addRecipe(r5));	
	}

}
