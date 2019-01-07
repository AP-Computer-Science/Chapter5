
import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Connecting to server");
        for(int i = 0; i <= 15; i++) {
            Thread.sleep(300);
            System.out.print(".");
        }
        System.out.println();
        Account a1 = null;
        Account a2 = null;
        System.out.println("=========================================");
        System.out.println("|      Welcome to Brian's Banking       |");
        System.out.println("|                                       |");
        System.out.println("|                                       |");
        System.out.println("| All accounts are locked.              |");
        System.out.println("| You must login to this system to      |");
        System.out.println("| Proceed.                              |");
        System.out.println("=========================================");
        System.out.println("");
        System.out.print("Enter new pin for account 1: ");
        Scanner s = new Scanner(System.in);
        int pin1 = s.nextInt();
        System.out.print("Enter new pin for account 2: ");
        int pin2 = s.nextInt();
        System.out.print("Confirming changes");
        a1 = new Account("Bob", 131313, 5000);
        a2 = new Account("Brian", 15434, 9000);
        a1.setKey(pin1);
        a2.setKey(pin2);
        for(int i = 0; i <= 10; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        a1.lock(pin1);
        a2.lock(pin2);
        System.out.println();
        while(true) {
            System.out.println("           Menu          ");
            System.out.println("=========================");
            System.out.println("1. View account 1 name.");
            System.out.println("2. View account 2 name.");
            System.out.println("3. View account 1 balance.");
            System.out.println("4. View account 2 balance.");
            System.out.println("5. Transfer money.");
            System.out.print("Enter option: ");
            int input = s.nextInt();
            if(input == 1) {
                login(a1);
                String temp = a1.getName();
                if(!a1.isLocked()) {
                    System.out.println(temp);
                }
            }
            else if(input == 2) {
                login(a2);
                String temp = a2.getName();
                if(!a2.isLocked()) {
                    System.out.println(temp);
                }
            }
            else if(input == 3) {
                login(a1);
                double temp = a1.getBalance();
                if(!a1.isLocked()) {
                    System.out.println(temp); 
                }
            }
            else if(input == 4) {
                login(a2);
                double temp = a2.getBalance();
                if(!a2.isLocked()) {
                    System.out.println(temp);
                }
            }
            else if(input == 5) {
                login(a1);
                login(a2);
                System.out.print("How much would account 2 receive?: ");
                int transfer = s.nextInt();
                a1.move(a2, transfer);
            }
            relock(a1, pin1);
            relock(a2, pin2);
        }
    }
    private static void relock(Account a, int key) {
        if(!a.isLocked()) {
            System.out.println("Relocking.");
            a.lock(key);
        }
    }
    private static void login(Account a) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter pin: ");
        int pin = s.nextInt();
        a.unlock(pin);
        System.out.print("Logging in");
        for(int i = 0; i <= 5; i++) {
            System.out.print(".");
            Thread.sleep(250);
        }
        System.out.println();
    }
}   