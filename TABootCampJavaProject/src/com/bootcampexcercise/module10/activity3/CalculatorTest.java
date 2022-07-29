package com.bootcampexcercise.module10.activity3;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator testCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        testCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        testCalculator = null;
        super.tearDown();
    }

    public void testAdd() {
        double a = 5;
        double b = 10;
        double c;

        //	Test add for 2 numbers
        assertEquals(15.0, (testCalculator.add(a, b)));
        assertEquals(15.0, (testCalculator.add(b, a)));

        a = -5;
        b = 10;
        //	Checks the sum of a postive value and a negative value
        assertEquals(5.0, (testCalculator.add(a, b)));
        assertEquals(5.0, (testCalculator.add(b, a)));

        a = -5;
        b = -10;

        assertEquals(-15.0, (testCalculator.add(a, b)));
        assertEquals(-15.0, (testCalculator.add(b, a)));

        //	Test add for 3 numbers
        a = -5;
        b = -10;
        c = 5;
        assertEquals(-10.0, (testCalculator.add(a, b, c)));
        assertEquals(-10.0, (testCalculator.add(b, a, c)));
        assertEquals(-10.0, (testCalculator.add(b, c, a)));


        a = 5;
        b = -10;
        c = 5;
        assertEquals(0.0, (testCalculator.add(a, b, c)));
        assertEquals(0.0, (testCalculator.add(b, a, c)));
        assertEquals(0.0, (testCalculator.add(b, c, a)));
    }

    public void testSub() {

        double a = 3;
        double b = 2;
        assertEquals(1.0, (testCalculator.sub(a, b)));
        assertEquals(-1.0, (testCalculator.sub(b, a)));

        a = 5;
        b = -4;
        assertEquals(9.0, (testCalculator.sub(a, b)));
        assertEquals(-9.0, (testCalculator.sub(b, a)));

        a = -10;
        b = -5;
        assertEquals(-5.0, (testCalculator.sub(a, b)));
        assertEquals(5.0, (testCalculator.sub(b, a)));
    }

    public void testDiv() {

        double a = 10;	double b = 5;
        assertEquals(2.0, (testCalculator.div(a,b)));
        assertEquals(0.5, (testCalculator.div(b,a)));

        a = 12;	b = -3;
        assertEquals(-4.0, (testCalculator.div(a,b)));
        assertEquals(-0.25, (testCalculator.div(b,a)));

        a = -10;	b = -5;
        assertEquals(2.0, (testCalculator.div(a,b)));
        assertEquals(0.5, (testCalculator.div(b,a)));
    }

    public void testMult() throws CustomException {

        double a = 5;
        double b = 10;
        assertEquals(50.0, (testCalculator.mult(a,b)));
        assertEquals(50.0, (testCalculator.mult(b,a)));

        a = -5;
        b = 10;
        assertEquals(-50.0, (testCalculator.mult(a,b)));
        assertEquals(-50.0, (testCalculator.mult(b,a)));

        a = -5;
        b = -10;
        assertEquals(50.0, (testCalculator.mult(a,b)));
        assertEquals(50.0, (testCalculator.mult(b,a)));


    }

}









