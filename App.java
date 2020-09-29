import java.util.Scanner;
import java.util.ArrayList;

public class App{

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }
    //gets user height in inches from input
    //verifies that height is >0
    public static double getUserHeight(){

        Scanner sc = new Scanner(System.in);
        double height;

        System.out.println("Please enter a positive height:");
        height=sc.nextDouble();

        while(height<=0){
            System.out.println("Invalid height. Please enter another:");
            height=sc.nextDouble();

        }

        return height;
    }

    //gets user weight in pounds from input
    //verifies that weight is >0
    public static double getUserWeight(){

        Scanner sc = new Scanner(System.in);
        double weight;

        System.out.println("Please enter a positive weight:");
        weight=sc.nextDouble();

        while(weight<=0){
            System.out.println("Invalid height. Please enter another:");
            weight=sc.nextDouble();


        }
        return weight;
    }

    //prints the bmi score and category of a bmi obj
    public static void displayBmiInfo(BodyMassIndex bmi){

        System.out.printf("Your Bmi Score is: %.2f. You are considered %s.\n\n\n"
                ,bmi.bmiScore, bmi.bmiCategory);

    }

    //prints the average bmi score of all bmi objects in bmi arraylist
    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData){

       double averageBmi;
       double totalBmiScore=0;

       for(int i=0; i<bmiData.size(); i++){
           BodyMassIndex currentBmi = new BodyMassIndex(0,0);
           currentBmi = bmiData.get(i);
           totalBmiScore = currentBmi.bmiScore + totalBmiScore;

       }

       averageBmi=totalBmiScore/bmiData.size();

       System.out.printf("The average Bmi Score is :%.2f", averageBmi);
    }

    //asks user to enter either Y or N to continue creating BMI's or not
    public static boolean moreInput(){


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Y to add a BMI, N to end input.\n");
        boolean test=false;

        String input;
        input = sc.nextLine();
        int i=0;

        while(i<1){
            switch(input){
                case "Y":
                case "y":
                    System.out.println("Enter data...\n");
                    test = true;
                    i++;
                    break;
                case "N":
                case "n":
                    System.out.println("End of input.\n\n");
                    i++;
                    break;
                default:
                    System.out.println("Invalid input. Please try again\n");
                    input = sc.nextLine();
                    break;
            }
        }

        return test;
    }

}