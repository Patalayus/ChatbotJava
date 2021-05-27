import java.util.Scanner;

public class letters {
    static void method2(){
        letters QzF = new letters();
        //this obj

        System.out.println("What would you like to do?\n1. Vowels\n2. Consonants\n3. Nouns\n4. Adjectives");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("You have chosen Vowels...");
            QzF.vowels();
        }else if(choice == 2){
            System.out.println("You have chosen Consenants...");
            QzF.consenants();
        }else if(choice == 3){
            System.out.println("You have chosen Nouns...");
            QzF.nouns();
        }else if(choice == 4){
            System.out.println("You have chosen Adjectives...");
            QzF.adjectives();
        }
    }

    void vowels(){
        //this is where the user can start the vowel game
        letters spr = new letters(); //this class obj
        chatbot noJumpVow = new chatbot(); //remote class obj
        Scanner reg = new Scanner(System.in);
        System.out.println("\nDid you want to start the game?\n1. Yes\n2. No\n");
        int gameChoice = reg.nextInt();
        if(gameChoice == 1){
            spr.vowelGame();
        }else {
            System.out.println("ending program");
            noJumpVow.mainQ();
        }
    }

    void consenants(){
        //this is where the user can start the con game
        letters spr = new letters(); //this class obj
        chatbot noJumpCon = new chatbot(); //remote class obj
        Scanner reg = new Scanner(System.in);
        System.out.println("\nDid you want to start the game?\n1. Yes\n2. No\n");
        int gameChoice = reg.nextInt();
        if(gameChoice == 1){
            spr.conGame();
        }else {
            System.out.println("ending program");
            noJumpCon.mainQ();
        }
    }

    void nouns(){
        //this is where the user can start the noun game
        letters spr = new letters(); //this class obj
        chatbot noJumpNoun = new chatbot(); //remote class obj
        Scanner reg = new Scanner(System.in);
        System.out.println("\nDid you want to start the game?\n1. Yes\n2. No\n");
        int gameChoice = reg.nextInt();
        if(gameChoice == 1){
            spr.nounGame();
        }else {
            System.out.println("ending program");
            noJumpNoun.mainQ();
        }
    }

    void adjectives(){
        //this is where the user can start the adjective game
        letters spr = new letters(); //this class obj
        chatbot noJumpAdj = new chatbot(); //remote class obj
        Scanner reg = new Scanner(System.in);
        System.out.println("\nDid you want to start the game?\n1. Yes\n2. No\n");
        int gameChoice = reg.nextInt();
        if(gameChoice == 1){
            spr.adjGame();
        }else {
            System.out.println("ending program");
            noJumpAdj.mainQ();
        }
    }

    void vowelGame(){
        //this is the vowel game
        //class object creation
        chatbot jumpVowel = new chatbot();
        Scanner in = new Scanner(System.in);
        System.out.println("For this game you have to select the vowel\nout of the following words");
        System.out.println("\n1. D\n2. B\n3. I\n4. W");
        int letterChoice = in.nextInt();
        if(letterChoice == 1 || letterChoice == 2 || letterChoice == 4){
            System.out.println("Unlucky, the vowel was actually letter 3, which was 'I'");
            jumpVowel.mainQ();
        }else if(letterChoice == 3){
            System.out.println("Congratulations, you have selected the correct letter");
            jumpVowel.mainQ();
        }
    }

    void conGame(){
        //this is the con game
        //class object creation
        chatbot jumpCon = new chatbot();
        Scanner numIn = new Scanner(System.in);
        System.out.println("For this game you have to select the consenant from a list of letters");
        System.out.println("\n1. A\n2. T\n3. I\n4.U\n");
        int letterChoice = numIn.nextInt();
        if(letterChoice == 1 || letterChoice == 3 || letterChoice == 4){
            System.out.println("Unlucky, the consenant is the 2nd letter, 'T'");
            jumpCon.mainQ();
        }else if(letterChoice == 2){
            System.out.println("Congratulations, you have selected the correct letter");
            jumpCon.mainQ();
        }
    }

    void nounGame(){
        //this is the noun game
        //class object creation
        chatbot jumpNoun = new chatbot();
        Scanner numIn = new Scanner(System.in);
        System.out.println("For this game you have to finish the description of a 'noun'.\nA noun is a...");
        System.out.println("\n1. Doing word\n2. Descriptive word\n3. Describes a doing word\n4. An Object, eg: 'Dog'\n");
        int letterChoice = numIn.nextInt();
        if(letterChoice == 1 || letterChoice == 2 || letterChoice == 3){
            System.out.println("Unlucky, a noun is an object");
            jumpNoun.mainQ();
        }else if(letterChoice == 4){
            System.out.println("Congratulations, a noun is an object. This can be something as simple as a chair\nor even a table!");
            jumpNoun.mainQ();
        }
    }

    void adjGame(){
        //this is the adjective game
        //class object creation
        chatbot jumpAdj = new chatbot();
        Scanner numIn = new Scanner(System.in);
        System.out.print("For this game, you have to name the adjective out of a list of words....\n");
        System.out.println("1. Dog\n2. Big\n3. Mother\n4. Chair\n");
        int adjChoice = numIn.nextInt();
        if(adjChoice == 1 || adjChoice == 3 || adjChoice == 4){
            System.out.println("Unlucky, the adjective is 'Big'");
            jumpAdj.mainQ();
        }else if(adjChoice == 2){
            System.out.println("Congratulations, 'Big' is the adjective as this describes a noun!");
            jumpAdj.mainQ();
        }
    }
}
