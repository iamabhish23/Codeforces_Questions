import java.util.Scanner;

public class Bit++ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;

        while (n > 0) {
            String s = scanner.next();
            if (s.charAt(1) == '+') {
                ++x;
            } else {
                --x;
            }
            n--;
        }

        System.out.println(x);
        scanner.close();
    }
}
