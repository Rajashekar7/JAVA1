package main;

import java.util.StringTokenizer;

public class StrTokDemo {
    public final static int MAXFIELDS = 5;
    public final static String DELIM = "|";

    public static String[] process(String line){
        String[] results = new String[MAXFIELDS];
        StringTokenizer st = new StringTokenizer(line,DELIM, true);

        int i =0;

        while(st.hasMoreElements()){
            String s =st.nextToken();
            if(s.equals(DELIM)){
                if(i++>=MAXFIELDS)
                    throw new IllegalArgumentException("Input line" + line + "has too many fields");
                continue;
            }
            results[i] = s;
        }
        return results;
    }
    public static void printResults(String input, String[] outputs){
        System.out.println("Input:" + input);
        for(String s : outputs)
            System.out.println("Output" + s + "was:" +s);
    }
    public static void main(String[] a){
        printResults("A|B|C|D", process("A|B|C|D"));
        printResults("A||C|D", process("A||C|D"));
        printResults("A|||D|E", process("A|||D|E"));
    }
}
