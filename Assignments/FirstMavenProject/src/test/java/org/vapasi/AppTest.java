package org.vapasi;



import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest {
    @BeforeClass
    public void runBeforeClass() {

        System.out.println("To be run before class run");
    }

    @BeforeMethod
    public void runBeforeMethod() {
        System.out.println("To be run before Method");

    }

    @Test
    public void testAssertEquals() {

        int expected = 10;
        Assert.assertEquals(sum(3,7), expected,"Sum is not equal");
        System.out.println("Assert Equal");
    }

    @Test
    public void testAssertTrue() {

        int expected = 6;
        Assert.assertTrue(expected==sum(3,3), "Sum is not as expected output");
        System.out.println("Assert True");
    }

    @Test
    public void testAssertFalse() {
        int expected = 10;
        Assert.assertFalse(expected ==sum(5,9), "Sum is 10");
        System.out.println("Assert False");
    }

    public static int sum(int a, int b) {
        return (a+b);
        }

    @AfterMethod
        public void afterTest() {
            System.out.println("Run after method");
        }

    @AfterClass
    public void afterClassRun () {
        System.out.println("Run after class");
    }

}
