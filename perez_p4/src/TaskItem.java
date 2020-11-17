public class TaskItem {
    private String title = "";
    private String description = "";
    private String dueDate = "";

    public TaskItem(String title, String description, String dueDate) {
        if (title.length() == 0) {
            System.out.println("WARNING: title must be at least 1 character long; task not created");
        } else {
            this.title = title;
        }
        this.description = description;
        this.dueDate = dueDate;
        TaskList t = new TaskList();
        t.printTaskList(this.title, this.description, this.dueDate);
    }

            /*catch (Exception InvalidTitle) {
            System.out.println("WARNING: title must be at least 1 character long; task not created");
        }
        try {
            description = this.description;
        } catch (Exception InvalidDescription) {
            dueDate = this.dueDate;
        }*/
    }

