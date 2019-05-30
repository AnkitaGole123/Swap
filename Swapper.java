import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Swapper {
    public static void main(String[] args) {
        List<Integer> swap = Arrays.asList(3, 2, 5, 6, 4);
        List<String> swapString = Arrays.asList("a","b","c","d","e","g");
        System.out.println(getSwap(swap, 0, 2));
        System.out.println(getSwapString(swapString, 5, 3));
    }

    public static List<Integer> getSwap(List<Integer> numbers, int i, int j) {
        List<Integer> cop = new ArrayList<>(numbers);
        System.out.println(numbers);
        int a = cop.get(j);
        cop.set(j, cop.get(i));
        cop.set(i, a);
        return cop;
    }
    public static List<String> getSwapString(List<String> characters, int i, int j) {
        List<String> cop = new ArrayList<>(characters);
        String a = cop.get(j);
        cop.set(j, cop.get(i));
        cop.set(i, a);
        return cop;
    }

}