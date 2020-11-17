import java.util.ArrayList;
public class TaskList {

    ArrayList<TaskList> tl = new ArrayList<TaskList>();

    String title;
    String description;
    String dueDate;

    public void printTaskList (String title, String description, String dueDate){
        System.out.printf("0) [%s] %s: %s%n", dueDate, title, description);
    }
}
