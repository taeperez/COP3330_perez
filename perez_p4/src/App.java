import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        getUserInput();
    }

    static public void getUserInput (){
        int input = 0;
        int task = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Main menu");
        System.out.printf("---------%n%n");
        System.out.printf("1) create a new list%n2) load an existing list%n3) quit%n%n");
        System.out.printf("Enter the number of the task you would like to perform%n%n");
        input = s.nextInt();
        System.out.printf(">%d%n", input);
        if(input == 1){
            System.out.println("new task list has been created\n");
            task = displayMenu();
            if(task == 1) {
                System.out.printf(">%d%nCurrent Tasks\n-------------%n", task);
                task = displayMenu();
            }
            else if (task == 2) {
                String taskTitle = "";
                System.out.print("Task title: ");
                s.nextLine();
                taskTitle = s.nextLine();
                String taskDesc = "";
                System.out.print("Task description: ");
                taskDesc = s.nextLine();
                String taskDueDate = "";
                System.out.print("Task due date (YYYY-MM-DD): ");
                taskDueDate = s.nextLine();
                TaskItem t = new TaskItem(taskTitle, taskDesc, taskDueDate);
            }
            else if(task == 3) {
                System.out.print("Which task will you edit? ");
                int taskPick = s.nextInt();
            }
            else if(task == 4){
                System.out.print("Which task will you remove? ");
                int taskRemove = s.nextInt();
            }
            else if(task == 5){
                System.out.print("Which task will you mark as completed? ");
                int taskComplete = s.nextInt();
            }
            else if(task == 6){
                System.out.print("Which task will you unmark as completed? ");
                int taskUnmark = s.nextInt();
            }
            else if(task == 7){
                System.out.print("Enter the filename to save as: ");
                String fileName = s.next();
                System.out.printf("%s\n", fileName);
            }
            else if(task == 8){
                getUserInput();
            }
        }
        else if(input == 3){
            return;
        }

    }

    public static int displayMenu(){
        Scanner s = new Scanner(System.in);
        System.out.println("List Operation Menu\n-------------\n");
        System.out.println("1) view the list\n2) add an item\n3) edit an item\n4) remove an item\n5) mark an item as completed\n6) unmark an item as completed\n7) save the current list\n8) quit to the main menu\n");
        int task = s.nextInt();
        return task;
    }
}
