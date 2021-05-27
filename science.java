import java.util.Scanner;

public class science {
    //test on new device
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
            if(choice != 1 || choice != 2 || choice != 3){
                System.out.println("Sorry, thats not a valid option..");
                method3();
            }
        }
    }

    void physics() {
        //class object declaration for this method
        chatbot physJump = new chatbot();
        int x=3;

        //Scanner for input, for method
        Scanner physIn = new Scanner(System.in);

        System.out.println("Welcome to the physics game!\nWe'll give you a few rules and you have to select\nwhich one is true...\n");
        do{
        System.out.println("Conventionally, Newtons second law was...\n1. M = F / A\n2. M = F * A\n3. F = M * A");
        int choice = physIn.nextInt();
        if (choice == 1 || choice == 2) {
            System.out.println("Unlucky, the rule was actually 'F = M * A'");
            x=x-1;
        } else if (choice == 3) {
            System.out.println("Congratulations! That was Newton's Second law!");
            x=x-4;
        } else {
            //validation
            System.out.println("unfortunately that wasn't an option");
            x=x-1;
        } }while (x>0);
            physJump.mainQ();
    }

    void chemistry(){
        //class object declaration for this method
        chatbot chemJump = new chatbot();
        int x=3;

        //Scanner for input, for method
        Scanner chemIn = new Scanner(System.in);

        System.out.println("Welcome to the chemistry game!\nYou'll have a multiple choice quiz about this subject!\n");
        do{
        System.out.println("In basic GCSE Chemistry, potassium (K), has what electronic configuration?\n1. 2,8,8,1\n2. 2,8,8,2\n3. 2,6,6,2\n");
        int choiceChem = chemIn.nextInt();
        if(choiceChem == 2 || choiceChem == 3){
            System.out.println("Unfortunately, it was actually the configuration of 2,8,8,1.. better luck next time!..");
            x=x-1;
        }else if(choiceChem == 1){
            System.out.println("Congratulations! That was the correct electronic configuration!");
            x=x-4;
        }else{
            //validation
            System.out.println("Unfortunately, that wasn't one of the answers");
            x=x-1;
        } }while (x>0);
        chemJump.mainQ();
    }

    void biology(){
        //class object declaration for this method
        chatbot bioJump = new chatbot();
        int x=3;

        //Scanner for input, for method
        Scanner bioIn = new Scanner(System.in);

        System.out.println("Welcome to the biology game!\nThis is multiple choice and you have 3 answers to choose from!\n");
        do{
        System.out.println("What is the name of a cell which attacks the body?\n1. Phagocyte\n2. Pathogen\n3. Lymphocyte\n");
        int choiceBio = bioIn.nextInt();
        if(choiceBio == 1 || choiceBio == 3){
            System.out.println("Unlucky, the name for this kind of cell is a Pathogen, better luck next time!..");
            x=x-1;
        }else if(choiceBio == 2){
            System.out.println("Congratulations! A Pathogen is the correct name for this cell!..");
            x=x-4;
        }else{
            //validation
            System.out.println("Unfortunately, that wasn't one of the inputs");
            x=x-1;
        } }while (x>0);
        bioJump.mainQ();
    }
}