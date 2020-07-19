import java.util.Scanner;

public class letters {
    static void method2(){
        chatbot jump = new chatbot();

        System.out.println("What would you like to do?\n1. Vowels\n2. Consenants\n3. Nouns\n4. Adjectives");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("You have chosen vowels...");
        }else if(choice == 2){
            System.out.println("You have chosen Consenants");
        }else if(choice == 3){
            System.out.println("You have chosen Nouns");
        }else if(choice == 4){
            System.out.println("You have chosen Adjectives");
        }
    }
}
