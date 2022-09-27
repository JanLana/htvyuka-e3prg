import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Nahodnych10 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, 1000);
        }
        Arrays.sort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
