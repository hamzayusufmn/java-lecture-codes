package week3;

public class corporatesponsers {


    public static void main(String[] args) {
        String[] sponsers = {"ikea", "A&t", "cvs", "3m"};

         for (int i = 0; i < sponsers.length; i++) {
             //System.out.println(sponsers[i]);
             String sponser = sponsers[i];
             sponser = sponser.toUpperCase();
             sponsers[i] = sponser;
             // two ways to do this and the uppercase helps differnatie the code.
             // this can help understand arrays and loops better.


         }
        }

    }


