public class CompareDiceDriver {
public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        for(int i = 0; i <= 100; i++) {
            d1.roll();
            d2.roll();
            if(d1.compareTo(d2) < 0) {
                System.out.println(d1.getFace() + "\t" + d2.getFace());
            }
            else {
                System.out.println(d2.getFace() + "\t" + d1.getFace());
            }
        }
    }
}