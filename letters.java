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
        Scanner in = new Scanner(System.in);
        System.out.println("For this game you have to select the vowel\nout of the following words");
        System.out.println("\n1. D\n2. B\n3. I\n4. W");
        int letterChoice = in.nextInt();
        if(letterChoice == 1 || letterChoice == 2 || letterChoice == 4){
            System.out.println("Unlucky, the vowel was actually letter 3, which was 'I'");
        }else if(letterChoice == 3){
            System.out.println("Congratulations, you have selected the correct letter");
        }

    }

    void conGame(){
        Scanner numIn = new Scanner(System.in);
        System.out.println("For this game you have to select the consenant from a list of letters");
        System.out.println("\n1. A\n2. T\n3. I\n4.U\n");
        int letterChoice = numIn.nextInt();
        if(letterChoice == 1 || letterChoice == 3 || letterChoice == 4){
            System.out.println("Unlucky, the consenant is the 2nd letter, 'T'");
        }else if(letterChoice == 2){
            System.out.println("Congratulations, you have selected the correct letter");
        }

    }

    void nounGame(){
        Scanner numIn = new Scanner(System.in);
        System.out.println("For this game you have to finish the description of a 'noun'.\nA noun is a...");
        System.out.println("\n1. Doing word\n2. Descriptive word\n3. Describes a doing word\n4. An Object, eg: 'Dog'\n");
        int letterChoice = numIn.nextInt();
        if(letterChoice == 1 || letterChoice == 2 || letterChoice == 3){
            System.out.println("Unlucky, a noun is an object");
        }else if(letterChoice == 4){
            System.out.println("Congratulations, a noun is an object. This can be something as simple as a chair\nor even a table!");
        }
    }

    void adjGame(){

    }
}
