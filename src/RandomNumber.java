import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * The type Random number.
 */
public class RandomNumber {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String...args) {
         List<Integer> numbersList = new ArrayList<>();
        Random random = new Random();
        random.ints(100,1,100).forEach(numbersList::add);
        System.out.println("Random List "+numbersList);

        List<Integer> streamList=numbersList.stream().filter(number->IntStream.rangeClosed(2,number/2).noneMatch(i -> number%i==0)).collect(Collectors.toList());
        System.out.println("Prime Numbers "+streamList);

    }

     }
