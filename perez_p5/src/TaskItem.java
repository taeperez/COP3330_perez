import java.time.LocalDate;
public class TaskItem {
    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean completed;

    public TaskItem(String title, String description, String dueDate) {
        if(title.isBlank()) {
            throw new IllegalArgumentException("A task must be at least 1 character long");
        }

        LocalDate date;
        try {
            date = LocalDate.parse(dueDate);
        } catch(java.time.format.DateTimeParseException e){
            throw new IllegalArgumentException("Warning: You inputted an invalid due date. Therefore, the task was not correctly updated");
        }

        this.title = title;
        this.description = description;
        this.dueDate = date;
        this.completed = false;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
