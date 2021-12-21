import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Arrays.sort(x, 2,14);

        for(int i:x) {
            System.out.print(i + ", ");
        }

    }
}
