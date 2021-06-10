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
            //populate this

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
