package main;

public class StringBuilderDemo {
    public static void main(String[] args){
        String s1 = "Hello" + ", " + "Raj";
        System.out.println(s1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        sb2.append(',');
        sb2.append(' ');
        sb2.append("Raj");

        String s2 = sb2.toString();
        System.out.println(s2);

        System.out.println(new StringBuilder()
        .append("Hello")
        .append(',')
        .append(' ')
        .append("Raj"));
    }
}
