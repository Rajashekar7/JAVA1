package main;

import java.io.IOException;
import java.util.StringTokenizer;

public class SysPropDemo {
    public static void main(String[] argv) throws IOException {
//        if (argv.length == 0)
//            System.getProperties().list(System.out);
//        else {
//            for (String s : argv) {
//                System.out.println(s + " = " +
//                        System.getProperty(s));
//            }
//        }
//    }
//        String some_input_string = new String();
//        for (String word : some_input_string.split(" ")) {
//            System.out.println(word);
//        }

//        StringTokenizer st = new StringTokenizer("Hello World of Java");
//        while (st.hasMoreTokens())
//            System.out.println("Token: " + st.nextToken());
//    }

        StringTokenizer st = new StringTokenizer("Hello, World|of|java", ", |", false);
        while (st.hasMoreElements())
            System.out.println("Token:" + st.nextElement());
    }
}