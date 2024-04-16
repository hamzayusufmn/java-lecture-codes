package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class todolist {
    public static void main(String[] args) {

            List<String> todoList = new ArrayList<>();
            while (true) {
                String data = stringInput("Please type a task you need to do, or press Enter to quit:");
                if (data.isEmpty()) {
                    break;
                }
                if (containsignorescase((List<String>) todoList, data))
                    System.out.println("You already finshed this task!");
                else
                todoList.add(data); // Add the task to the todoList
            }

            // Displaying the tasks in the todoList
            System.out.println("Tasks you need to do are :");
            for (String input  : todoList) {
                System.out.println("- " + input);
            }
        System.out.println("you have"+ todoList.size() + "task to do");
        }
        public static boolean containsignorescase(List<String> list, String data) {
            for (String item : list) {
                if ((item.equalsIgnoreCase(data))) {
                    return true;

            }
        }
            return false;
            // if reached bottom and cant find it will return false
        }
}



