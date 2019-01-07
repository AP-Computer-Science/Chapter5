
import java.util.Scanner;

public class CoinDriver {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter new pin: ");
        int key = s.nextInt();
        Coin c = new Coin();
        c.setKey(key);
        c.lock(key);
        int attemptsLeft = 3;
        boolean failed = true;
        for (; attemptsLeft >= 0; attemptsLeft--) {
            System.out.print("Enter pin (" + attemptsLeft + " attempts)" + " to unlock coin: ");
            int attemptedKey = s.nextInt();
            System.out.println("Attempting to unlock coin.");
            c.unlock(attemptedKey);
            if(c.isLocked()) {
                System.out.println("Failed to unlock coin.");
            }
            System.out.println("Attempting to flip coin.");
            if(c.flip()) {
                System.out.print("Coin flipped: ");
                System.out.println(c.isHeads() ? "heads" : "tales");
                failed = false;
                break;
            }
            else {
                failed = true;
            }
        }
        if(failed) {
            System.out.println("You had too many attempts.");
        }
    }
}
