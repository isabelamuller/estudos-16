import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] y = {3,6,2,9,5,7,3,2,1,11,19,15,17,4,8,10,14};

        List<Integer> xList = Arrays.asList(x);
        Collections.shuffle(xList);
        Arrays.sort(y);

        for(int i:xList) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        for(int i:y) {
            System.out.print(i + ", ");
        }
    }
}
