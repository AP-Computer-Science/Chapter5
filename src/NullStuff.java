public class NullStuff {
    public static void main(String[] args) {
        String name = "Steve";
        String name2 = name;
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name2);
        System.out.println(name2.length());
        name2 += "!";
        System.out.println(name);
        System.out.println(name2);
    }
}