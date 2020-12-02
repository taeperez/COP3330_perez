import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    private static final Scanner input = new Scanner(System.in);

    //private TaskList taskList;
    //private ContactList contactList;

    public static void main(String[] args) {
        App a = new App();
        a.run();
    }

    public void run () {
        String mainMenu;
        String application;
        while(true){
            printApplication();
            application = getApplication();
            printMainMenu();
            mainMenu = getMainMenu();

            if (mainMenu == "1") {
                System.out.println("?");
                if(application == "1"){
                    System.out.println("new task list has been created");
                }
                else if(application == "2"){
                    System.out.println("new contact list has been created");
                }
                //createTaskList();
                //modifyTaskList();
                break;
            } else if(mainMenu == "2") {
                //createContactList();
                //modifyTaskList();
                break;
            } else if(mainMenu == "3") {
                break;
            } else {
                System.out.println("You inputted an invalid menu option.");
            }
        }
    }

    private void printMainMenu() {
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("---------");
        System.out.println();
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
        System.out.println();
    }

    private void printApplication() {
        System.out.println("Select Your Application");
        System.out.println("---------------------\n");
        System.out.println("1) task list");
        System.out.println("2) contact list");
        System.out.println("3) quit");
        System.out.println();
    }

    private String getApplication() {
        System.out.print("> ");
        return input.nextLine();
    }

    private String getMainMenu() {
        System.out.print("> ");
        return input.nextLine();
    }

    /*private void createTaskList() {
        taskList = new TaskList();
        System.out.println("new task list has been created");
    }

    private void createContactList() {
        contactList = new ContactList();
        System.out.println("new contact list has been created");
    }*/

    /*private void loadTaskList() {
        System.out.println("Enter the filename to load:");
        String filename = input.nextLine();
        taskList = new TaskList();
        taskList.load(filename);

        System.out.println("task list has been loaded");
    }

    private void loadContactList() {
        System.out.println("Enter the filename to load:");
        String filename = input.nextLine();
        contactList = new ContactList();
        contactList.load(filename);

        System.out.println("contact list has been loaded");
    }

    private void printOperationMenu() {
        System.out.println();
        System.out.println("List Operation Menu");
        System.out.println("---------");
        System.out.println();
        System.out.println("1) view the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) mark an item as completed");
        System.out.println("6) unmark an item as completed");
        System.out.println("7) save the current list");
        System.out.println("8) quit to the main menu");
        System.out.println();
    }

    //implement for task and contact
    /*private void printItems() {
        System.out.println("Current Tasks");
        System.out.println("---------");
        System.out.println();
        System.out.println(task);
    }*/
}
