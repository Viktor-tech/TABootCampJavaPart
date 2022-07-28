package com.bootcampexcercise.module9.activity;

public class Person {

    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

    public String bodyMassIndex(int weight, float height) {


        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)



            if (weight > 0 && weight < 200 && height > 0 && height < 250) {
                return "BMI result - " + weight / (height* height);
            }
            return "Unreal value of height or weight";

        }
    }

    //TODO: Please add some checks for max weight and height (kg and meter are their units)
    //TODO: Also add some checks that value shouldn't be negative and 0
//    Note: All TODOs should be implemented in single method

