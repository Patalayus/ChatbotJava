import java.util.Scanner;

public class numbers{
    static void method1(){
        System.out.println("What would you like to do?\n1. Add\n2. Subract\n3. Multiply\n4. Divide\n");
        Scanner sc = new Scanner(System.in);
        int mathChoice = sc.nextInt();
        if(mathChoice == 1){
            System.out.println("Please enter your first number");
            double firstNum = sc.nextDouble();
            System.out.println("Please enter your second number");
            double secondNum = sc.nextDouble();
            double totalAdd = firstNum + secondNum;
            System.out.println("Your total is "+totalAdd);
        }else if(mathChoice == 2){
            System.out.println("Please enter your first number");
        }else if(mathChoice == 3){
            System.out.println("Please enter your first number");
        }else if(mathChoice == 4){
            System.out.println("Please enter your first number");
        }else{
            System.out.println("Please enter a valid input");
        }
    }
}