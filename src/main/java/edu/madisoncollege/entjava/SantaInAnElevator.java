package edu.madisoncollege.entjava;


import org.apache.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulawaite on 9/7/16.
 *
 * This exercise is taken from the 2015 Advent of Code challenge, Day 1 (http://adventofcode.com/day/1). It will provide you
 * with more practice in our environment, reading files, logging and unit testing.
 *
 * Here is the problem to solve:
 *
 * "Santa is trying to deliver presents in a large apartment building, but he can't find the right floor -
 * the directions he got are a little confusing. He starts on the ground floor (floor 0) and then follows
 * the instructions one character at a time.
 *
 * An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should go down one floor.
 *
 * The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.
 *
 * For example:
 * (()) and ()() both result in floor 0.  <= this would make a good unit test!
 * ((( and (()(()( both result in floor 3.
 * ))((((( also results in floor 3.
 * ()) and ))( both result in floor -1 (the first basement level).
 * ))) and )())()) both result in floor -3."
 *
 * Your goal is to determine what floor Santa will be on when he uses the directions in the file SantaUpDown.txt
 *
 * Do NOT create a main method in your application, you will use only unit tests to find the answer.
 * Add log4j to your code.  At minimum you should log an error if there is a problem reading the file.
 *
 * When submitting your code, include screenshots showing
 * 1) The answer, i.e., what floor is Santa on?
 *      ANSWER: 138
 * 2) How much code coverage you achieved (what percent?).
 *      PERCENTAGE: 7%~10%
 *
 */

public class SantaInAnElevator {

    private final Logger logger = Logger.getLogger(this.getClass());
    private List<Character> tokens;

    /**
     *  Reads text file
     *
     *  @param fileInput text file
     */
    public void readFile(String fileInput)
    {
        tokens = new ArrayList<Character>();
        try
        {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileInput),
                            Charset.forName("UTF-8")));

            int c;

            while((c = reader.read()) != -1)
            {
                char character = (char) c;
                tokens.add(character);
            }

            readFloors(tokens);

        }
        catch (FileNotFoundException e)
        {
            for (StackTraceElement element : e.getStackTrace())
            {
                logger.error(element);
            }
        }
        catch (IOException e)
        {
            for (StackTraceElement element : e.getStackTrace())
            {
                logger.error(element);
            }
        }
    }

    /**
     * Reads list
     *
     * @param floors list of characters
     */
    public void readFloors(List<Character> floors)
    {
        int floor = 0;
        for (Character element : floors)
        {
            if (element.toString().equals("("))
            {
                floor = floor + 1;
            }
            if (element.toString().equals(")"))
            {
                floor = floor -1;
            }
        }

        logger.info("Floor:" + floor);
    }


























}