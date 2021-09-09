import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class quickfire {

    void quickfire(){
        //quickfire method is used for random questions from any topic

        List<String> messages = Arrays.asList(
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10"

        );
        System.out.println(messages.get(random()));
    }

    int random(){
        Random rand = new Random(); //instance of random class
        int upperbound = 9;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}
