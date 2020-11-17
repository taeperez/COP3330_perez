import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        TaskItem t = new TaskItem("", "xyz", "1234-56-78");
    }

    @Test
    public void creatingTaskItemFailsWithInvalidDueDate(){

    }

    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){

    }

    @Test
    public void creatingTaskItemSucceedsWithValidTitle() {

    }

    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){

    }

    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){

    }

    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){

    }

    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle(){

    }

    @Test
    public void addingTaskItemsIncreasesSize(){

    }

    @Test
    public void completingTaskItemChangesStatus(){

    }

    @Test
    public void completingTaskItemFailsWithInvalidIndex(){

    }

    @Test
    public void editingTaskItemChangesValues(){

    }

    @Test
    public void editingTaskItemDescriptionChangesValue(){

    }

    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){

    }

    @Test
    public void editingTaskItemDueDateChangesValue(){

    }

    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){

    }

    @Test
    public void editingTaskItemTitleChangesValue(){

    }

    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){

    }

    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){

    }

    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){

    }

    @Test
    public void newTaskListIsEmpty(){

    }

    @Test
    public void removingTaskItemsDecreasesSize(){

    }

    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){

    }

    @Test
    public void savedTaskListCanBeLoaded(){

    }

    @Test
    public void uncompletingTaskItemChangesStatus(){

    }

    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){

    }

}
