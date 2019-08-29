package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Give me number pls.");
        int n2 = ap.nextInt("Give another number pretty pls");
        double avg = (double) (n1+n2)/2 ;
        System.out.println("Your average is " + avg + ".");


    }



}
