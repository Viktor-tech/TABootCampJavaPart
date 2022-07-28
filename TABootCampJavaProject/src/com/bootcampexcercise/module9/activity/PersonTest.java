package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception{
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testMyGetterAndSetter (){
        int testWeight = 100;
        float testHeight = 177;
        person.setWeight(testWeight);
        person.setHeight(testHeight);
        assertEquals("Getter test weight", person.getWeight(), testWeight);
        assertEquals("Getter test height", person.getHeight(), testHeight);

        int testWeightNew = 50;
        float testHeightNew = 170;
        person.setWeight(testWeightNew);
        person.setHeight(testHeightNew);
        assertEquals("Getter test weight", person.getWeight(), testWeightNew);
        assertEquals("Getter test height", person.getHeight(), testHeightNew);



    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBMI(){
        int a = 79;
        float b = 180;
        String bmi = "BMI result - 0.0024382717";
        assertEquals(bmi, person.bodyMassIndex(a, b));


        int a1 = -10;
        float b1 = 160;
        String bmi1 = "Unreal value of height or weight";
        assertEquals(bmi1, person.bodyMassIndex(a1, b1));


        int a2 = 255;
        float b2 = 255;
        String bmi2 = "Unreal value of height or weight";
        assertEquals(bmi2, person.bodyMassIndex(a2, b2));









}




}