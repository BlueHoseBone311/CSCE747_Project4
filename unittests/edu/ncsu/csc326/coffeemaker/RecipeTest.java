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

    }

    @After
    public void tearDown(){
        R1 = null;
    }

    @Test //Test Chocolate quantity spec method for a Recipe
    public void setAmtChocolateTest(){

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
    }

    @Test //Test Coffee quantity spec method for a Recipe
    public void setAmtCoffeeTest(){

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
    }

    @Test //Test Sugar quantity spec method for a Recipe
    public void setAmtSugarTest(){

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
    }

    @Test //Test Milk quantity spec method for a Recipe
    public void setAmtMilkTest(){

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
    }

    @Test //Test Price value spec method for a Recipe
    public void setPriceTest() throws RecipeException{

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
    }

    @Test
    public void setNameTest(){
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
    }

    @Test
    public void toStringTest(){
        //Test for valid string input
        R1.setName("Regular000@1*");
        assertEquals("Regular000@1*",R1.toString());

        //Test for empty strings
        R1.setName("");
        assertEquals("",R1.toString());

        //Test for null input values
        R1.setName(null);
        assertEquals("",R1.getName());

    }

    @Test
    public void hashCodeTest(){
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


    }

}
