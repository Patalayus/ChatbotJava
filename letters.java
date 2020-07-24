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
        letters spr = new letters();
        Scanner reg = new Scanner(System.in);
        System.out.println("\nDid you want to start the game?\n1. Yes\n2. No\n");
        int gameChoice = reg.nextInt();
        if(gameChoice == 1){
            spr.vowelGame();
        }else {
            System.out.println("ending program");
        }
    }

    void consenants(){
        letters spr = new letters();
        Scanner reg = new Scanner(System.in);
        System.out.println("\nDid you want to start the game?\n1. Yes\n2. No\n");
        int gameChoice = reg.nextInt();
        if(gameChoice == 1){
            spr.conGame();
        }else {
            System.out.println("ending program");
        }
    }

    void nouns(){
        letters spr = new letters();
        Scanner reg = new Scanner(System.in);
        System.out.println("\nDid you want to start the game?\n1. Yes\n2. No\n");
        int gameChoice = reg.nextInt();
        if(gameChoice == 1){
            spr.nounGame();
        }else {
            System.out.println("ending program");
        }
    }

    void adjectives(){
        letters spr = new letters();
        Scanner reg = new Scanner(System.in);
        System.out.println("\nDid you want to start the game?\n1. Yes\n2. No\n");
        int gameChoice = reg.nextInt();
        if(gameChoice == 1){
            spr.adjGame();
        }else {
            System.out.println("ending program");
        }
    }

    void vowelGame(){

    }

    void conGame(){

    }

    void nounGame(){

    }

    void adjGame(){

    }
}
