package main;
public class Buggy {
    static String name = "raj";
    public static void main(String[] args) {
        int n = name.length(); // bug # 1
        System.out.println(n);
        name += "; The end."; // bug #2
        System.out.println(name); // #3
    }
}