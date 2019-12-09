package main;

public class CheckForSwing {
    public static void main(String[] args){
        try{
            Class.forName("javax.swing.JButton");
        } catch (ClassNotFoundException e) {
            String failure = "Sorry, but this version of MyApp needs \n" +
                    "a java Runtime with JFC/swing components\n" +
                    "having the final names (javax.swing.*)";
            System.err.println(failure);
        }
    }
}
