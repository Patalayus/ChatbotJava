import java.util.Scanner;

public class weather {
    public void method4(){
        weather jump = new weather();
        Scanner sc = new Scanner(System.in);

        //choice for user
        System.out.println("Please select country...\n1. England\n2. " +
                "Wales\n3. Scotland\n4. Northern Island");
        String countryString = sc.next();
        if(countryString.equals(1) || countryString.equals("england")){
            System.out.println("What is the capital of this country?\n1. Cornwall\n2. Edinburgh\n3. Essex\n4. London\n");
            int answerQ1 = sc.nextInt();
            if(answerQ1 == 4){
                System.out.println("Well done! That is correct!");
            }else{
                System.out.println("Unfortunately that is not correct");
            }

        }else if(countryString.equals(2) || countryString.equals("wales")){
            //populate this

        }else if(countryString.equals(3) || countryString.equals(("scotland"))){
            //populate this

        }else if(countryString.equals(4) || countryString.equals("northern island")){
            //populate this

        }else{
            //validation
            System.out.println("Please enter valid input");
            method4();
        }
    }
}
