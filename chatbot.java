import java.util.Scanner;
import java.lang.Math;
//class name is same as file name

public class chatbot{
    public static void main(String args[]){
        //scanner initialised
        chatbot pass = new chatbot();
        Scanner inpt = new Scanner(System.in);
        System.out.println("Hello and welcome to the 2020 Summer Chatbot\nPlease enter your name:");
        String userName = inpt.nextLine();
        System.out.println("Hello, "+userName+" how are you?");
        String userMood = inpt.nextLine();
        if(userMood.equals("good")){
            System.out.println("I'm good too");
        }else{
            System.out.println("ah alright");
        }
        pass.mainQ();
    }

    void mainQ(){
        Scanner inpt = new Scanner(System.in);
        System.out.println("What would you like to do today?\n1. Mathematics\n2. English\n3. Science");
        double userChoice0 = inpt.nextDouble();

        //class object declaration
        numbers numObj = new numbers();
        letters letObj = new letters();

        //user selects the task they want to do
        if(userChoice0 == 1){
            System.out.println("Maths it is!");
            numObj.method1();
        }else if(userChoice0 == 2){
            System.out.println("English it is!");
            letObj.method2();
        }else if(userChoice0 == 3){
            System.out.println("Science it is!");
        }
    }


    void repeat(){
        Scanner cc = new Scanner(System.in);
        numbers warp = new numbers();
        chatbot warp2 = new chatbot();
        System.out.println("Did you want to continue doing maths?\n1. Yes\n2. Change Choice\n");
        int choiceNum = cc.nextInt();
        if(choiceNum == 1){
            warp.method1();
        }else if(choiceNum == 2){
            warp2.mainQ();
        }
    }
}
