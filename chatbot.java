import java.util.Scanner;
import java.lang.Math;

public class chatbot{
    public static void main(String args[]){
        //scanner initialised
        /**
        final String secretKey = "SECRET_KEY";

        String originalString = "This_Is _The_Original_String";
        String encryptedString = AES.encrypt(originalString, secretKey) ;
        String decryptedString = AES.decrypt(encryptedString, secretKey) ;

        System.out.println(originalString);
        //prints out original string
        System.out.println(encryptedString);
        //prints out excrypted string
        System.out.println(decryptedString);
        //decrypts the string and displays the message
         **/

        //object, scanner creation
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
        System.out.println("\nMAIN MENU\nWhat would you like to do today?\n1. Mathematics\n2. English\n3. Science\n4. Geography\n5. Quit");
        double userChoice0 = inpt.nextDouble();

        //class object declaration
        numbers numObj = new numbers();
        letters letObj = new letters();
        science sciObj = new science();
        weather geoObj = new weather();

        //user selects the task they want to do
        if(userChoice0 == 1){
            System.out.println("Maths it is!");
            numObj.method1();
        }else if(userChoice0 == 2){
            System.out.println("English it is!");
            letObj.method2();
        }else if(userChoice0 == 3){
            System.out.println("Science it is!");
            sciObj.method3();
        }else if(userChoice0 == 4){
            System.out.println("Geography it is!");
            geoObj.method4();
        }else if(userChoice0 == 5){
            System.out.println("Quitting...");
        }else{
            //validation
            System.out.println("Please enter one of the numbers listed above");
            mainQ();
        }
    }

    //this method checks if the user wishes to repeat mathematics
    void repeat(){
        Scanner cc = new Scanner(System.in);
        numbers warp = new numbers();
        chatbot warp2 = new chatbot();
        System.out.println("Did you want to continue doing maths?\n1. Yes\n2. Change Choice\n");
        int choiceNum = cc.nextInt();
        if(choiceNum == 1){
            warp.method1();
            //continue
        }else if(choiceNum == 2){
            warp2.mainQ();
            //change choice
        }else{
            //validation
            System.out.println("please enter a valid input");
            repeat();
        }
    }
}
