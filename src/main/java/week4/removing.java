package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class removing {
    public static void main(String[] args) {
        List<String> classNames = new ArrayList<>();
        classNames.add("Progamming Logic");
        classNames.add("Web client server");
        classNames.add(" project management");
        classNames.add("infotech concepts");

        for (String name : classNames)
            // this will show every name
            // class name remove will gice you error
            System.out.println(classNames);
        // this adds names to the list
        for (int h = 0; h < classNames.size(); h++)
            // you need to know index and data
            System.out.println(classNames.get(h));
        classNames.remove(0);
         while (!classNames.isEmpty()) {
             String name = classNames.remove(0);
             System.out.println(name);
         }
        System.out.println(classNames);
         // safest way is using wild loop


        classNames.remove("project managment");
        System.out.println(classNames);
        // this methods remove names from list
        classNames.remove(0);
        System.out.println(classNames);
        // this will ensure the class would get remove
        // int primative type

        boolean wasRemoved = classNames.remove("infotech concepts");
        System.out.println(classNames + " " + wasRemoved);
        // objext
        classNames.remove(0);
        System.out.println(classNames);

        classNames.set(0, "System analyis");
        System.out.println(classNames);
// always make sure index is in range
        String search = "c# progamming";
        if (classNames.contains("c# programming")) {
            System.out.println(" this list does contain " + search);

        } else {
            System.out.println("this list does not contain " + search);
            // this helps tell if list contains said word
        }
        System.out.println(classNames.size());

        classNames.clear();
        System.out.println(classNames);
        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());
    }
}
