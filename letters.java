import java.util.Scanner;

public class letters {
    static void method2(){
        chatbot jump = new chatbot();
        //return obj
        letters QzF = new letters();
        //this obj

        System.out.println("What would you like to do?\n1. Vowels\n2. Consenants\n3. Nouns\n4. Adjectives");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("You have chosen Vowels...");
            QzF.vowels();
        }else if(choice == 2){
            System.out.println("You have chosen Consenants");
            QzF.consenants();
        }else if(choice == 3){
            System.out.println("You have chosen Nouns");
            QzF.nouns();
        }else if(choice == 4){
            System.out.println("You have chosen Adjectives");
            QzF.adjectives();
        }
    }

    void vowels(){
        System.out.println("\nStarting the game...\n");

    }

    void consenants(){
        System.out.println("\nStarting the game...\n");

    }

    void nouns(){
        System.out.println("\nStarting the game...\n");

    }

    void adjectives(){
        System.out.println("\nStarting the game...\n");

    }
}
