package edu.madisoncollege.entjava;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practice working with JUnit by writing some test cases for the Interface List<E>:
 * 1.1 void add(int index, E e)
 * 1.2 void remove(int index)
 * 1.3 void get(int index)
 *
 * Add at least one test for an exception.
 */
public class ListTest {

    private List<String> myList;
    private List<Character> myChar;
    private String file = "/home/student/Documents/santa-in-an-elevator-week-2-exercise-1-vlee1/src/test/resources/SantaUpDown.txt";

    @Before
    public void setup() {
        myList = new ArrayList<String>();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");

        myChar = new ArrayList<Character>();
        String leftParenth = "(";
        String rightParenth = ")";

        char cL = leftParenth.charAt(0);
        char cR = rightParenth.charAt(0);

        myChar.add(cL);
        myChar.add(cL);
        myChar.add(cL);

        for (int i = 0; i <= 10; i++)
        {
            myChar.add(cR);
        }

    }

    @Test
    public void testAddSuccess() {
        String elementToInsert = "Item 4";

        myList.add(elementToInsert);
        assertEquals("List size is incorrect", 4, myList.size());
        assertTrue("List missing inserted element", myList.contains(elementToInsert));
    }

    @Test(expected = IOException.class)
    public void exceptionTest() throws IOException {
        SantaInAnElevator test = new SantaInAnElevator();
        //test.readFile("/home/student/Documents/santa-in-an-elevator-week-2-exercise-1-vlee1/src/test/resources/SantaUpDown.txt");
        test.readFile("/test.txt");
    }

    @Test
    public void testMethod()
    {
        SantaInAnElevator test = new SantaInAnElevator();

        assertEquals("Total floors should be 138", 138, test.readFloors(myChar));
    }

}