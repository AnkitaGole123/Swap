import java.util.Arrays;
import java.util.List;

public class Swapper {
    public static void main(String[] args) {
        List<Integer> swap = Arrays.asList(3,2,5,6,4);

        System.out.println(getSwap(swap,0,2));
    }
    public static List<Integer> getSwap(List<Integer> numbers, int i, int j){

          int a = numbers.get(j);
          numbers.set(j,numbers.get(i));
          numbers.set(i,a);
          return numbers;
        }

}