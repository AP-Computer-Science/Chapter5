
import java.util.Scanner;

public class RationalDriver {
    private static Rational parseString(String input) {
        if(!input.contains("/")) {
            return new Rational(Integer.parseInt(input), 1);
        }
        else {
            if(input.length() <= 1) {
                System.out.println("Invalid fraction. Passing in zero.");
                return new Rational(0, 1);
            }
            String[] parsed = input.split("/");
            if(parsed.length < 2) {
                System.out.println("No denominator found. Passing in one for denominator");
                return new Rational(Integer.parseInt(parsed[0]), 1);
            }
            return new Rational(Integer.parseInt(parsed[0]), Integer.parseInt(parsed[1]));
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first rational (use / for fraction sign):");
        Rational r1 = parseString(s.next());
        System.out.print("Enter second rational (use / for fraction sign):");
        Rational r2 = parseString(s.next());
        int compare = r1.compareTo(r2);
        if(compare == 0) {
            System.out.println("Both fractions are the same.");
        }
        else if(compare > 0) {
            System.out.println("First fraction is greater than second fraction.");
        }
        else {
            System.out.println("Second fraction is greater than first fraction.");
        }
    } 
}
