package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Team01 on 4/2/16.
 */
public class InventoryTest {

    private int stockReplenishmentUnitCount = 0;
    private Inventory I1;

    private int currentChocCount;
    private int currentSugarCount;
    private int currentMilkCount;
    private int currentCoffeeCount;

    @Before
    public void setUp() {

        I1 = new Inventory();

        currentChocCount = I1.getChocolate();
        currentSugarCount = I1.getSugar();
        currentMilkCount = I1.getMilk();
        currentCoffeeCount = I1.getCoffee();

        assertEquals(15, currentChocCount);
        assertEquals(15, currentCoffeeCount);
        assertEquals(15, currentMilkCount);
        assertEquals(15, currentSugarCount);

        System.out.println("Setup of Test Harness Completed successfully");
    }

    @After
    public void tearDown() throws Exception {
        //super.tearDown();
    }

    @Test //Test Method for Chocolate Inventory Correction
    public void setChocolateTest(){

        System.out.println("Test 1 Started");

        //Check for the equality operator inventory count =0
        I1.setChocolate(stockReplenishmentUnitCount);
        currentChocCount = I1.getChocolate();
        assertEquals(0,currentChocCount);

        //Check for the operator inventory count >0
        stockReplenishmentUnitCount = 1;
        I1.setChocolate(stockReplenishmentUnitCount);
        currentChocCount = I1.getChocolate();
        assertEquals(1,currentChocCount);

        //Check for the operator inventory count >=0
        stockReplenishmentUnitCount = -15;
        I1.setChocolate(stockReplenishmentUnitCount);
        currentChocCount = I1.getChocolate();
        assertEquals(1,currentChocCount);

        System.out.println("Test 1 Completed");
    }

    @Test //Test Method for Chocolate Inventory Accumulation
    public synchronized void addChocolateTest() throws InventoryException{

        System.out.println("Test 2 Started");

        //Check for the equality operator when input is a string value. Expected to receive an exception message.
        try{
            I1.addChocolate("two");
            currentChocCount = I1.getChocolate();
        }
        catch(InventoryException e){

            assertNotSame("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentChocCount>=0);
        }


        //Check for the equality operator for the lower boundary input value = -1. Expected to receive an exception message.
        try{
        I1.addChocolate("-1");
        currentChocCount = I1.getChocolate();
        }
        catch(InventoryException e){
            //assertNotEquals("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentChocCount>0);
        }


        //Check for the equality operator for the acceptable input value = 2
        I1.addChocolate("2");
        currentChocCount = I1.getChocolate();
        assertEquals(17,currentChocCount);

        System.out.println("Test 2 Completed");

    }


    @Test //Test Method for Coffee Inventory Correction
    public void setCofeeTest(){

        System.out.println("Test 3 Started");

        //Check for the equality operator inventory count =0
        I1.setCoffee(stockReplenishmentUnitCount);
        currentCoffeeCount = I1.getCoffee();
        assertEquals(0,currentCoffeeCount);

        //Check for the operator inventory count >0
        stockReplenishmentUnitCount = 1;
        I1.setCoffee(stockReplenishmentUnitCount);
        currentCoffeeCount = I1.getCoffee();
        assertEquals(1,currentCoffeeCount);

        //Check for the operator inventory count >=0
        stockReplenishmentUnitCount = -15;
        I1.setChocolate(stockReplenishmentUnitCount);
        currentCoffeeCount = I1.getCoffee();
        assertEquals(1,currentCoffeeCount);

        System.out.println("Test 3 Completed");
    }

    @Test //Test Method for Coffee Inventory Accumulation
    public synchronized void addCoffeeTest() throws InventoryException{

        System.out.println("Test 4 Started");

        //Check for the equality operator when input is a string value. Expected to receive an exception message.
        try{
            I1.addCoffee("two");
            currentCoffeeCount = I1.getCoffee();
        }
        catch(InventoryException e){

            assertNotSame("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentCoffeeCount>=0);
        }


        //Check for the equality operator for the lower boundary input value = -1. Expected to receive an exception message.
        try{
            I1.addCoffee("-1");
            currentCoffeeCount = I1.getCoffee();
        }
        catch(InventoryException e){
            //assertNotEquals("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentCoffeeCount>0);
        }


        //Check for the equality operator for the acceptable input value = 2
        I1.addCoffee("2");
        currentCoffeeCount = I1.getCoffee();
        assertEquals(17,currentCoffeeCount);

        System.out.println("Test 4 Completed");

    }

    @Test //Test Method for Milk Inventory Correction
    public void setMilkTest(){

        System.out.println("Test 5 Started");

        //Check for the equality operator inventory count =0
        I1.setMilk(stockReplenishmentUnitCount);
        currentMilkCount = I1.getMilk();
        assertEquals(0,currentMilkCount);

        //Check for the operator inventory count >0
        stockReplenishmentUnitCount = 1;
        I1.setMilk(stockReplenishmentUnitCount);
        currentMilkCount = I1.getMilk();
        assertEquals(1,currentMilkCount);

        //Check for the operator inventory count >=0
        stockReplenishmentUnitCount = -15;
        I1.setMilk(stockReplenishmentUnitCount);
        currentMilkCount = I1.getMilk();
        assertEquals(1,currentMilkCount);

        System.out.println("Test 5 Completed");
    }

    @Test //Test Method for Milk Inventory Accumulation
    public synchronized void addMilkTest() throws InventoryException{

        System.out.println("Test 6 Started");

        //Check for the equality operator when input is a string value. Expected to receive an exception message.
        try{
            I1.addMilk("two");
            currentMilkCount = I1.getMilk();
        }
        catch(InventoryException e){

            assertNotSame("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentMilkCount>=0);
        }


        //Check for the equality operator for the lower boundary input value = -1. Expected to receive an exception message.
        try{
            I1.addMilk("-1");
            currentMilkCount = I1.getMilk();
        }
        catch(InventoryException e){
            //assertNotEquals("Units of chocolate must be a positive integer",e);
            assertTrue("Units of coffee must be a positive integer",currentMilkCount>0);
        }


        //Check for the equality operator for the acceptable input value = 2
        I1.addMilk("2");
        currentMilkCount = I1.getMilk();
        assertEquals(17,currentMilkCount);

        System.out.println("Test 6 Completed");

    }


    @Test //Test Method for Sugar Inventory Correction
    public void setSugarTest(){

        System.out.println("Test 7 Started");

        //Check for the equality operator inventory count =0
        I1.setSugar(stockReplenishmentUnitCount);
        currentSugarCount = I1.getSugar();
        assertEquals(0,currentSugarCount);

        //Check for the operator inventory count >0
        stockReplenishmentUnitCount = 1;
        I1.setSugar(stockReplenishmentUnitCount);
        currentSugarCount = I1.getSugar();
        assertEquals(1,currentSugarCount);

        //Check for the operator inventory count >=0
        stockReplenishmentUnitCount = -15;
        I1.setSugar(stockReplenishmentUnitCount);
        currentSugarCount = I1.getSugar();
        assertEquals(1,currentSugarCount);

        System.out.println("Test 7 Completed");
    }

    @Test //Test Method for Sugar Inventory Accumulation
    public synchronized void addSugarTest() throws InventoryException{

        System.out.println("Test 8 Started");

        //Check for the equality operator when input is a string value. Expected to receive an exception message.
        try{
            I1.addSugar("two");
            currentSugarCount = I1.getSugar();
        }
        catch(InventoryException e){

            assertNotSame("Units of sugar must be a positive integer",e);
          //  assertTrue("Units of coffee must be a positive integer",currentSugarCount>=0);
        }


        //Check for the equality operator for the lower boundary input value = -1. Expected to receive an exception message.
        try{
            I1.addSugar("-1");
            currentSugarCount = I1.getSugar();
        }
        catch(InventoryException e){
            //assertNotEquals("Units of chocolate must be a positive integer",e);
            assertTrue("Units of sugar must be a positive integer",currentSugarCount>0);
        }


        //Check for the equality operator for the acceptable input value = 2
        I1.addSugar("2");
        currentSugarCount = I1.getSugar();
        assertEquals(17,currentSugarCount);

        System.out.println("Test 8 Completed");

    }

    @Test //Test Method for verifying Inventory against recipe requirements
    public synchronized void enoughIngredientsTest(){

        System.out.println("Test 9 Started");

        Recipe R1 = new Recipe();
        Inventory I2 = new Inventory();
        int reqSugar = 0;
        int reqCoffee = 0;
        int reqChocolate = 0;
        int reqMilk = 0;
        int priceVal = 0;
        String tesName = "";

        try{
            //Check for all acceptable and large input values.
            R1.setName("IExperience1");
            R1.setPrice("5");
            R1.setAmtSugar("25");
            R1.setAmtCoffee("20");
            R1.setAmtMilk("30");
            R1.setAmtChocolate("15");

            priceVal = R1.getPrice();
            reqSugar = R1.getAmtSugar();
            reqMilk = R1.getAmtMilk();
            reqChocolate = R1.getAmtChocolate();
            reqCoffee = R1.getAmtCoffee();

            boolean checkValue = I2.enoughIngredients(R1);

            assertFalse(checkValue);  //Recipe requires more quantity than available inventory for each item.
        }
        catch(RecipeException e){
            assertTrue("Check the Input Value for Price. Required to be positive numeric values",priceVal<=0);
            assertTrue("Check the Input Value for Chocolate. Required to be positive numeric values",reqChocolate<=0);
            assertTrue("Check the Input Value for Sugar. Required to be positive numeric values",reqSugar<=0);
            assertTrue("Check the Input Value for Coffee. Required to be positive numeric values",reqCoffee<=0);
            assertTrue("Check the Input Value for Milk. Required to be positive numeric values",reqMilk<=0);
        }


        int prevPriceVal = priceVal;

        try{
            //Check for varied string input values.
            R1.setName("IExperience2");
            tesName = R1.getName();

            R1.setPrice("5.51");
            priceVal = R1.getPrice();

        }
        catch(RecipeException e){
            assertEquals("IExperience2",tesName);
            assertEquals(prevPriceVal,priceVal);
        }

        try{
            //Check varying string input values
            R1.setName("IExperience3");
            tesName = R1.getName();

            R1.setPrice("3/4");
            priceVal = R1.getPrice();

            assertEquals(0,priceVal);
            assertEquals("IExperience3",tesName);

        }
        catch(RecipeException e){
            assertEquals("IExperience3",tesName);
            assertEquals(prevPriceVal,priceVal);
        }

        try{
            //Check for values within the current inventory limits.
            R1.setName("IExperience4");
            R1.setPrice("10");
            R1.setAmtSugar("2");
            R1.setAmtCoffee("5");
            R1.setAmtMilk("3");
            R1.setAmtChocolate("1");

            tesName = R1.getName();
            priceVal = R1.getPrice();
            reqSugar = R1.getAmtSugar();
            reqMilk = R1.getAmtMilk();
            reqChocolate = R1.getAmtChocolate();
            reqCoffee = R1.getAmtCoffee();

            boolean check2 = I2.enoughIngredients(R1);
            assertTrue(check2);  //Recipe does not require more quantity than available inventory for each item.

        }
        catch(RecipeException e){
            assertEquals("IExperience4",tesName);
            assertTrue("Check the Input Value for Price. Required to be positive numeric values",priceVal<=0);
            assertTrue("Check the Input Value for Chocolate. Required to be positive numeric values",reqChocolate<=0);
            assertTrue("Check the Input Value for Sugar. Required to be positive numeric values",reqSugar<=0);
            assertTrue("Check the Input Value for Coffee. Required to be positive numeric values",reqCoffee<=0);
            assertTrue("Check the Input Value for Milk. Required to be positive numeric values",reqMilk<=0);
        }

        System.out.println("Test 9 Completed");

    }

    @Test //Test Method for verifying Inventory against recipe requirements based on their use.
    public synchronized void useIngredientsTest(){

        System.out.println("Test 10 Started");

        Recipe R2 = new Recipe();

        R2.setName("UExperience01");
        String sN = R2.getName();
        int sP = 0;
        int sM = 0;
        int sCh = 0;
        int sCof = 0;
        int sSug = 0;

        try{
            R2.setPrice("9");
            sP = R2.getPrice();

            R2.setAmtMilk("5");
            sM = R2.getAmtMilk();

            R2.setAmtChocolate("10");
            sCh = R2.getAmtChocolate();

            R2.setAmtCoffee("5");
            sCof = R2.getAmtCoffee();

            R2.setAmtSugar("4");
            sSug = R2.getAmtSugar();

            boolean check01 = I1.enoughIngredients(R2);
            assertTrue(check01);

            boolean check02 = I1.useIngredients(R2);
            assertTrue(check02);

            //Expected reduction in inventory levels according to the quantity used by a recipe.
            assertEquals(9,sP);
            assertEquals(15-5,I1.getMilk());
            assertEquals(15-10,I1.getChocolate());
            assertEquals(15-4,I1.getSugar());
            assertEquals(15-5,I1.getCoffee());
        }
        catch(RecipeException e){
            assertEquals("UExperience01",sN);
            assertTrue("Check the Input Value for Price. Required to be positive numeric values",sP<=0);
            assertTrue("Check the Input Value for Chocolate. Required to be positive numeric values",sCh<=0);
            assertTrue("Check the Input Value for Sugar. Required to be positive numeric values",sSug<=0);
            assertTrue("Check the Input Value for Coffee. Required to be positive numeric values",sCof<=0);
            assertTrue("Check the Input Value for Milk. Required to be positive numeric values",sM<=0);
        }

        Recipe R3 = new Recipe();
        Inventory I10 = new Inventory();

        R3.setName("UExperience02");
        String sN1 = R2.getName();
        int sP1 = 0;
        int sM1 = 0;
        int sCh1 = 0;
        int sCof1 = 0;
        int sSug1 = 0;

        try{
            R3.setPrice("19");
            sP1 = R3.getPrice();

            R3.setAmtMilk("500");
            sM1 = R3.getAmtMilk();

            R3.setAmtChocolate("100");
            sCh1 = R3.getAmtChocolate();

            R3.setAmtCoffee("500");
            sCof1 = R3.getAmtCoffee();

            R3.setAmtSugar("400");
            sSug1 = R3.getAmtSugar();

            boolean check01 = I10.enoughIngredients(R2);
            assertFalse(check01);

            boolean check02 = I10.useIngredients(R2);
            assertFalse(check02);

            //Expected ZERO reduction in inventory levels as the recipe requires exorbitant levels of ingredients beyond the available inventory.
            assertEquals(9,sP);
            assertEquals(15,I10.getMilk());
            assertEquals(15,I10.getChocolate());
            assertEquals(15,I10.getSugar());
            assertEquals(15,I10.getCoffee());
        }
        catch(RecipeException e){
            assertEquals("UExperience02",sN1);
            assertTrue("Check the Input Value for Price. Required to be positive numeric values",sP1<=0);
            assertTrue("Check the Input Value for Chocolate. Required to be positive numeric values",sCh1<=0);
            assertTrue("Check the Input Value for Sugar. Required to be positive numeric values",sSug1<=0);
            assertTrue("Check the Input Value for Coffee. Required to be positive numeric values",sCof1<=0);
            assertTrue("Check the Input Value for Milk. Required to be positive numeric values",sM1<=0);
        }
        System.out.println("Test 10 Completed");

    }

    @Test
    public void toStringTest(){
        System.out.println("Test 11 Started");
        Inventory I9 = new Inventory();
        String tS = I9.toString();
        assertNotNull(tS);
        System.out.println("Test 11 Completed");
    }
}