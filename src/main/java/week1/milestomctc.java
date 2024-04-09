package week1;
import static input.InputUtils.doubleInput;
import static input.InputUtils.positiveDoubleInput;
public class milestomctc {


    public static void main(String[] args) {

        double miles = positiveDoubleInput(" how many miles from your home to mctc");

        double km = miles * 1.6;
        System.out.println(" you live " + km + " kilometers from school");


        // does user live more than ten miles away
        if (miles > 10) {
            System.out.println(" you live more than 10 miles away");

        } else if (miles == 10) {
            System.out.println(" You live exactly 10 miles away");
            // double == can fall into exactly the number and help with those situations.
        }
        else {
            System.out.println(" you live less than 10 miles away");

        }

    }
}
