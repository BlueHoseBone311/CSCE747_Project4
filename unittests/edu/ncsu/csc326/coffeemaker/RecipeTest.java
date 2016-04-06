package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Team01 on 4/3/16.
 */
public class RecipeTest {
    private Recipe R1;


    @Before
    public void setUp(){
        R1 = new Recipe();
        System.out.println("Setup of Test Harness Completed successfully");

    }

    @After
    public void tearDown(){
        R1 = null;
    }

    /**
     * Tests behaviour of the Test Chocolate quantity spec method for a Recipe
     */
    @Test
    public void setAmtChocolateTest(){
        System.out.println("Test 1 Started");
        try{  //Test for null input values
            R1.setName("R1");
            R1.setAmtChocolate("");

            assertNotNull(R1.getAmtChocolate());
            assertEquals(0,R1.getAmtChocolate());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtChocolate()<=0);
        }

        try{
            //Test for string literals as input
            R1.setAmtChocolate("ten");

            assertNull(R1.getAmtChocolate());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtChocolate()<=0);
        }

        try{
            //Test for negative input values
            R1.setAmtChocolate("-1");

            assertNotNull(R1.getAmtChocolate());
            assertEquals(0,R1.getAmtChocolate());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtChocolate()<=0);
        }

        try{
            //Test for positive non-integer input values
            R1.setAmtChocolate("3/4");

            assertNotNull(R1.getAmtChocolate());
            assertEquals(0,R1.getAmtChocolate());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtChocolate()<=0);
        }

        try{
            //Test for positive integer input values
            R1.setAmtChocolate("1");

            assertEquals(1,R1.getAmtChocolate());

            assertTrue(R1.getAmtChocolate()>0);

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtChocolate()<=0);
        }
        System.out.println("Test 1 Completed");
    }

    /**
     * Tests behaviour of the Coffee quantity spec method for a Recipe
     */
    @Test
    public void setAmtCoffeeTest(){
        System.out.println("Test 2 Started");
        try{  //Test for null input values
            R1.setName("R1");
            R1.setAmtCoffee("");

            assertNotNull(R1.getAmtCoffee());
            assertEquals(0,R1.getAmtCoffee());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtCoffee()<=0);
        }

        try{
            //Test for string literals as input
            R1.setAmtCoffee("ten");

            assertNull(R1.getAmtCoffee());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtCoffee()<=0);
        }

        try{
            //Test for negative input values
            R1.setAmtCoffee("-1");

            assertNotNull(R1.getAmtCoffee());
            assertEquals(0,R1.getAmtCoffee());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtCoffee()<=0);
        }

        try{
            //Test for positive non-integer input values
            R1.setAmtCoffee("3/4");

            assertNotNull(R1.getAmtCoffee());
            assertEquals(0,R1.getAmtCoffee());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtCoffee()<=0);
        }

        try{
            //Test for positive integer input values
            R1.setAmtCoffee("1");

            assertEquals(1,R1.getAmtCoffee());

            assertTrue(R1.getAmtCoffee()>0);

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtCoffee()<=0);
        }
        System.out.println("Test 2 Completed");
    }

    /**
     * Tests behaviour of the Sugar quantity spec method for a Recipe
     */
    @Test
    public void setAmtSugarTest(){
        System.out.println("Test 3 Started");
        try{  //Test for null input values
            R1.setName("R1");
            R1.setAmtSugar("");

            assertNotNull(R1.getAmtSugar());
            assertEquals(0,R1.getAmtSugar());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtSugar()<=0);
        }

        try{
            //Test for string literals as input
            R1.setAmtSugar("ten");

            assertNull(R1.getAmtSugar());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtSugar()<=0);
        }

        try{
            //Test for negative input values
            R1.setAmtSugar("-1");

            assertNotNull(R1.getAmtSugar());
            assertEquals(0,R1.getAmtSugar());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtSugar()<=0);
        }

        try{
            //Test for positive non-integer input values
            R1.setAmtSugar("3/4");

            assertNotNull(R1.getAmtSugar());
            assertEquals(0,R1.getAmtSugar());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtSugar()<=0);
        }

        try{
            //Test for positive integer input values
            R1.setAmtSugar("1");

            assertEquals(1,R1.getAmtSugar());

            assertTrue(R1.getAmtSugar()>0);

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtSugar()<=0);
        }
        System.out.println("Test 3 Completed");
    }

    /**
     * Tests behaviour of the Milk quantity spec method for a Recipe
     */
    @Test
    public void setAmtMilkTest(){
        System.out.println("Test 4 Started");
        try{  //Test for null input values
            R1.setName("R1");
            R1.setAmtMilk("");

            assertNotNull(R1.getAmtMilk());
            assertEquals(0,R1.getAmtMilk());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtMilk()<=0);
        }

        try{
            //Test for string literals as input
            R1.setAmtMilk("ten");

            assertNull(R1.getAmtMilk());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtMilk()<=0);
        }

        try{
            //Test for negative input values
            R1.setAmtMilk("-1");

            assertNotNull(R1.getAmtMilk());
            assertEquals(0,R1.getAmtMilk());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtMilk()<=0);
        }

        try{
            //Test for positive non-integer input values
            R1.setAmtMilk("3/4");

            assertNotNull(R1.getAmtMilk());
            assertEquals(0,R1.getAmtMilk());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtMilk()<=0);
        }

        try{
            //Test for positive integer input values
            R1.setAmtMilk("1");

            assertEquals(1,R1.getAmtMilk());

            assertTrue(R1.getAmtMilk()>0);

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getAmtMilk()<=0);
        }
        System.out.println("Test 4 Completed");
    }

    /**
     * Tests behaviour of the Price specification method for a Recipe
     * @throws RecipeException
     */

    @Test
    public void setPriceTest() throws RecipeException{
        System.out.println("Test 5 Started");
        try{  //Test for null input values
            R1.setName("R1");
            R1.setPrice("");

            assertNotNull(R1.getPrice());
            assertEquals(0,R1.getPrice());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getPrice()<=0);
        }

        try{
            //Test for string literals as input
            R1.setPrice("ten");

            assertNull(R1.getPrice());

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getPrice()<=0);
        }

        try{
            //Test for negative input values
            R1.setPrice("-1");

            assertNotNull(R1.getPrice());
            assertEquals(0,R1.getPrice());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getPrice()<=0);
        }

        try{
            //Test for positive non-integer input values
            R1.setPrice("3/4");

            assertNotNull(R1.getPrice());
            assertEquals(0,R1.getPrice());
        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getPrice()<=0);
        }

        try{
            //Test for positive integer input values
            R1.setPrice("1.5");

            assertEquals(1,R1.getPrice());

            assertTrue(R1.getPrice()>0);

        }
        catch(RecipeException e){
            assertTrue("Units of chocolate must be a positive integer",R1.getPrice()<=0);
        }
        System.out.println("Test 5 Completed");
    }

    /**
     * Tests behaviour of the Name specification method for a Recipe
     */
    @Test
    public void setNameTest(){
        System.out.println("Test 6 Started");
        //Test for Empty String Inputs
        R1.setName("");
        assertNotNull(R1.getName());
        assertEquals("",R1.getName());

        //Test for null input values
        R1.setName(null);
        assertNotNull(R1.getName());
        assertEquals("",R1.getName());

        //Test for valid string input values
        R1.setName("Regular@1*");
        assertNotNull(R1.getName());
        assertEquals("Regular@1*",R1.getName());
        System.out.println("Test 6 Completed");
    }

    /**
     * Tests behaviour of the overridden toString method.
     */
    @Test
    public void toStringTest(){
        System.out.println("Test 7 Started");
        //Test for valid string input
        R1.setName("Regular000@1*");
        assertEquals("Regular000@1*",R1.toString());

        //Test for empty strings
        R1.setName("");
        assertEquals("",R1.toString());

        //Test for null input values
        R1.setName(null);
        assertEquals("",R1.getName());
        System.out.println("Test 8 Completed");
    }

    /**
     * Tests behaviour of the overridden hashCode method.
     */
    @Test
    public void hashCodeTest(){
        System.out.println("Test 9 Started");
        //Test for empty string inputs
        R1.setName("");
        long val1 = R1.hashCode();
        long val2 = 31 + R1.getName().hashCode();
        assertEquals(val2,val1);

        //Test for null input.
        R1.setName(null);
        long val3 = R1.hashCode();
        long val4 = 31;
        assertEquals(val4,val3);

        //Test for valid string inputs
        R1.setName("Rand0m@1");
        long val5 = R1.hashCode();
        long val6 = 31 + R1.getName().hashCode();
        assertEquals(val6,val5);
        System.out.println("Test 9 Completed");
    }

    /**
     * Tests behaviour of the overridden equals method.
     */
    @Test
    public void equalsTest(){
        System.out.println("Test 10 Started");
        //Compare different objects of the same kind
        Recipe R1 = new Recipe();
        Recipe R2 = new Recipe();
        assertTrue(R1.equals(R2)); //Since both will  be instances will have the same name.

        R1.setName("B1");
        assertFalse(R1.equals(R2)); //Now one of the objects has a default constructor specified name.

        try{
            R2.setName(null); //check for when one object name is null while the other is a valid string.
            R2.setPrice("3");
            assertFalse(R1.equals(R2));
        }
        catch(RecipeException e){
            assertTrue("Input for price needs to be a positive integer",R2.getPrice()<0);
            assertNull(R2.getName());
        }

        System.out.println("Test 10 Completed");
    }

}
