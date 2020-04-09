import org.junit.Before;
import org.junit.Test;
import org.junit.Test.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class SampleTest {
    private List<String> names;

    //before needs to be before rest of tests
    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer");
        System.out.println("in before");
    }

    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("Fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }





    @Test
    public void testFirstTest(){
        assertEquals("ASSERTAROOH", true, true);
    }

    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }


    //when you're using floating point values a third parameter is required
    // (Delta) which represents a positive margin of error of decimals.
    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

    //tests actual values not references
    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }



    //mini exercise:
    @Test
    public void testFirstMiniTest(){
        String expected = "Wazzup";
        String actual = "Wazzup";

        assertEquals(expected, actual);
    }

    @Test
    public void testSecondMiniTest(){
        String expected = "Alo";
        String actual = "lo";
        String errorMessage = "ERROR MATE";
        assertNotEquals(errorMessage, expected, actual);
    }


}
