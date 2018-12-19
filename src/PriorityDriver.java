import java.util.Scanner;

public class PriorityDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Task t1 = null;
        Task t2 = null;
        Task t3 = null;
        System.out.print("Enter task name for t1:");
        t1 = new Task();
        System.out.print("Enter priority for t1:");
        t1.setPriority(s.nextInt());
        System.out.print("Enter complexity for t1:");
        t1.setComplexity(s.nextInt());
        System.out.print("Enter task name for t2:");
        t2 = new Task();
        System.out.print("Enter priority for t2:");
        t2.setPriority(s.nextInt());
        System.out.print("Enter complexity for t2:");
        t2.setComplexity(s.nextInt());
        System.out.print("Enter task name for t3:");
        t3 = new Task();
        System.out.print("Enter priority for t3:");
        t3.setPriority(s.nextInt());
        System.out.print("Enter complexity for t3:");
        t3.setComplexity(s.nextInt());
        System.out.println("Ordered by priority:");
        if(t1.compareTo(t2) >= 1 && t1.compareTo(t3) >= 1) {
            System.out.println(t1);
            if(t2.compareTo(t3) >= 1) {
                System.out.println(t2);
                System.out.println(t3);
            }
            else {
                System.out.println(t3);
                System.out.println(t2);
            }
        }
        else if(t2.compareTo(t1) >= 1 && t2.compareTo(t3) >= 1) {
            System.out.println(t2);
            if(t1.compareTo(t3) >= 1) {
                System.out.println(t1);
                System.out.println(t3);
            }
            else {
                System.out.println(t3);
                System.out.println(t1);
            }
        }
        else if(t3.compareTo(t1) >= 1 && t3.compareTo(t2) >= 1) {
            System.out.println(t3);
            if(t1.compareTo(t2) >= 1) {
                System.out.println(t1);
                System.out.println(t2);
            }
            else {
                System.out.println(t2);
                System.out.println(t1);
            }
        }
        System.out.println("Ordered by complexity.");
        if((t1.compareTo(t2) == 0 || t1.compareTo(t2) == 2) && (t1.compareTo(t3) == 0 || t1.compareTo(t3) == 2)) {
            System.out.println(t1);
            if(t2.compareTo(t3) == 0 || t2.compareTo(t3) == 2) {
                System.out.println(t2);
                System.out.println(t3);
            }
            else {
                System.out.println(t3);
                System.out.println(t2);
            }
        }
        else if((t2.compareTo(t1) == 0 || t2.compareTo(t1) == 2) && (t2.compareTo(t3) == 0 || t2.compareTo(t3) == 2)) {
            System.out.println(t2);
            if(t1.compareTo(t3) == 0 || t1.compareTo(t3) == 2) {
                System.out.println(t1);
                System.out.println(t3);
            }
            else {
                System.out.println(t3);
                System.out.println(t1);
            }
        }
        else if((t3.compareTo(t1) == 0 || t3.compareTo(t1) == 2) && (t3.compareTo(t2) == 0 || t3.compareTo(t2) == 2)) {
            System.out.println(t3);
            if(t1.compareTo(t2) == 0 || t1.compareTo(t2) == 2) {
                System.out.println(t1);
                System.out.println(t2);
            }
            else {
                System.out.println(t2);
                System.out.println(t1);
            }
        }
    }
}