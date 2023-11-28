import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(BitCounter.counter(n));
    }
}
