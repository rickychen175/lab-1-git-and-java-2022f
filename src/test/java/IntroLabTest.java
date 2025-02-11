/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 100)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    /* TODO: Write a test case for the method you wrote in IntroLab.
     *       If done properly, you should be able to run IntroLabTest and see
     *       the test results.
     * As a reference, we've included testExampleStudent above.
     */

    @Test(timeout = 50)
    public void testrongDian() {
        String expected = "Hi!!! My name is Dian! " + "I like cats more than dogs! The end.";
        String actual = IntroLab.rongDian();
        assertEquals(expected, actual);
    }

    @Test(timeout = 50)
    public void testChenri15() {
        String expected = "\uD83D\uDC4B\uD83D\uDE0A! My name is Ricky Chen! I like dogs more than cats! Welcome to CSC207!";
        String actual = IntroLab.chenri15();
        assertEquals(expected, actual);
    }

    @Test(timeout = 50)
    public void testChockal8() {
        String expected = "Hi! My name is Eshwara! " +
                "I like dogs more than cats! Hello there!";
        String actual = IntroLab.chockal8();
        assertEquals(expected, actual);
    }
}
