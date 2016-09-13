package edu.madisoncollege.entjava;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by student on 9/12/16.
 */
public class SantaInAnElevatorTest {

    String file = "/home/student/Documents/santa-in-an-elevator-week-2-exercise-1-vlee1/src/test/resources/SantaUpDown.txt";

    @Test
    public void readTextFile()
    {
        SantaInAnElevator test = new SantaInAnElevator();
        test.readFile(file);
    }

}