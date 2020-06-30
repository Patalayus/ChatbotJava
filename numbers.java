import java.util.Scanner;

public class numbers{
    static void method1(){
        System.out.println("What would you like to do?\n1. Add\n2. Subract\n3. Multiply\n4. Divide\n");
        Scanner sc = new Scanner(System.in);
        int mathChoice = sc.nextInt();
        //addition below
        if(mathChoice == 1){
            System.out.println("Please enter your first number");
            double firstNumA = sc.nextDouble();
            System.out.println("Please enter your second number");
            double secondNumA = sc.nextDouble();
            double totalAdd = firstNumA + secondNumA;
            System.out.println("Your total is "+totalAdd);
        }
        //subtract below
        else if(mathChoice == 2){
            System.out.println("Please enter your first number");
            double firstNumS = sc.nextDouble();
            System.out.println("Please enter your second number");
            double secondNumS = sc.nextDouble();
            double totalSub = firstNumS - secondNumS;
            System.out.println("Your total is "+totalSub);
        }
        //multiply below
        else if(mathChoice == 3){
            System.out.println("Please enter your first number");
            double firstNumM = sc.nextDouble();
            System.out.println("Please enter your second number");
            double secondNumM = sc.nextDouble();
            double totalMul = firstNumM * secondNumM;
            System.out.println("Your total is "+totalMul);
        }
        //divide below
        else if(mathChoice == 4){
            System.out.println("Please enter your first number");
            double firstNumD = sc.nextDouble();
            System.out.println("Please enter your second number");
            double secondNumD = sc.nextDouble();
            double totalDiv = firstNumD / secondNumD;
            System.out.println("Your total is "+totalDiv);
        }

        else{
            System.out.println("Please enter a valid input");
        }
    }
}