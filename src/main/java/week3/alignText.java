package week3;

public class alignText {
    public static void main(String[] args) {
        int[] classCodes = {2545, 2505, 2560};
        String[] classNames = {"Java", "c#", "web"};
        System.out.printf("%s%s\n", "Code", "name");
        int c;
        for (c = 0; c < classCodes.length; c++) ;
        int code = classCodes[c];
        String name = classNames [c];
        System.out.printf("-%10d%10s", code, name);
        System.out.println();

        // was getting error codes so i brought c into the scope will test this out
        // the minus sign helps with aligning the table
        // template string helps with code being cleaner and looking more neat

    }
}
