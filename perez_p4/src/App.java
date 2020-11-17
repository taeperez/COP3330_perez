import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        int input = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Main menu");
        System.out.printf("---------%n%n");
        System.out.printf("1) create a new list%n2) load an existing list%n3) quit%n%n");
        System.out.printf("Enter the number of the task you would like to perform%n%n");
        input = s.nextInt();
        System.out.printf(">%d%n", input);
        if(input == 1){
            System.out.println("new task list has been created\n");
            System.out.println("List Operation Menu\n-------------\n");
            System.out.println("1) view the list\n2) add an item\n3) edit an item\n4) remove an item\n5) mark an item as completed\n6) unmark an item as completed\n7) save the current list\n8) quit to the main menu\n");
            int task = s.nextInt();
            if(task == 1) {
                System.out.printf(">%d%nCurrent Tasks\n-------------%n", task);
            }
            else if (task == 2){
                String taskTitle = "";
                System.out.print("Task title: ");
                taskTitle = s.next();
                String taskDesc = "";
                System.out.print("Task description: ");
                taskDesc = s.next();
                String taskDueDate = "";
                System.out.print("Task due date (YYYY-MM-DD): ");
                taskDueDate = s.next();
                TaskItem t = new TaskItem(taskTitle, taskDesc, taskDueDate);


            }
        }

    }

}
