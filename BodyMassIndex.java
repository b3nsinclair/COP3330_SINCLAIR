import java.util.Scanner;
import java.lang.Math;


public class BodyMassIndex{

    //height inches, weight pounds, bmiScore, bmiCategory
    private double height;
    private double weight;
    public double bmiScore;
    public String bmiCategory;

    //constructor
    public BodyMassIndex(double height, double weight){

        this.height = height;
        this.weight = weight;
        this.bmiScore = getBmiScore(height, weight);
        this.bmiCategory = getBmiCategory(bmiScore);
    }



    //calculates bmi score
    public double getBmiScore(double height, double weight){

        double bmiScore= 703 * weight / (Math.pow(height, 2.0));

        return bmiScore;
    }

    //determines bmi category
    public String getBmiCategory(double bmiScore){

        this.bmiScore = bmiScore;

        String bmiCategory;

        if(bmiScore<18.5){

            bmiCategory = "Underweight";

        }

        else if(bmiScore>=18.5 && bmiScore<=24.9){

            bmiCategory = "Normal Weight";
        }

        else if(bmiScore>=25.00 && bmiScore<=29.9){

            bmiCategory ="Overweight";
        }

        else{

            bmiCategory="Obesity";
        }

        return bmiCategory;
    }


}