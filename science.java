import java.util.Scanner;

public class science {
    static void method3(){
        science go = new science();

        System.out.println("What would you like to do?\n1. Physics\n2. Chemistry\n3. Biology\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Physics it is...");
            go.physics();

        }else if(choice == 2){
            System.out.println("Chemistry it is...");
            go.chemistry();

        }else if(choice == 3){
            System.out.println("Biology it is...");
            go.biology();

        }else{
            //validation here
        }
    }

    void physics(){
        System.out.println("");
    }

    void chemistry(){
        System.out.println("");
    }

    void biology(){
        System.out.println("");
    }


}
