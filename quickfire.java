import java.util.*;

public class quickfire extends chatbot {

    void quickfire(){
        //quickfire method is used for random facts
        Scanner scan = new Scanner(System.in);
        int x = 0;
        System.out.println("Be prepared for random facts! Press Q to finish!");
        chatbot quiObj2 = new chatbot();

        List<String> messages = Arrays.asList(
                "Oranges aren't naturally occurring fruits.",
                "The majority of your brain is fat.",
                "Some cats are actually allergic to humans.",
                "'OMG' usage can be traced back to 1917.",
                "A chef's hat has exactly 100 pleats.",
                "Competitive art used to be in the Olympics.",
                "High heels were originally worn by men.",
                "Stop signs used to be yellow.",
                "New York was briefly named 'New Orange.'",
                "There was a successful Tinder match in Antarctica in 2014."

        );
        do{
            System.out.println(messages.get(random()));
            String input_ = scan.nextLine();
            if(input_.equals("q") || input_.equals("Q")){
                x++;
            }
        }while(x!=1);

    }

    int random(){
        Random rand = new Random(); //instance of random class
        int upperbound = 9;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}
