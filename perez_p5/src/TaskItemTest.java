import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskItemTest {
    @Test
    public void constructorFailsWithInvalidTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            new TaskItem("", "", "2020-12-01");
        });
    }

    @Test
    public void constructorSucceedsWithValidTitle() {
        TaskItem t = new TaskItem("Task 1", "My first task", "2020-12-01");
        assertEquals("Task 1", t.getTitle());
        assertEquals("My first task", t.getDescription());
        assertEquals("2020-12-01", t.getDueDate().toString());
    }

    @Test
    public void constructorSucceedsWithValidDueDate() {
        TaskItem t = new TaskItem("Task 1", "My first task", "2020-12-01");
        assertEquals("Task 1", t.getTitle());
        assertEquals("My first task", t.getDescription());
        assertEquals("2020-12-01", t.getDueDate().toString());
    }

    @Test
    public void constructorFailsWithInvalidDueDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            new TaskItem("Task 1", "My first task", "0000-00-00");
        });
    }

    @Test
    public void editingTitleFailsWithEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> {
            new TaskItem("", "My first task", "2020-12-01");
        });
    }

    @Test
    public void editingTitleFailsWithInvalidYYYYMMDD() {
        assertThrows(IllegalArgumentException.class, () -> {
            new TaskItem("Task 1", "My first task", "0000-00-00");
        });
    }

    @Test
    public void editingTitleSucceedsWithExpectedValue() {
        TaskItem item = new TaskItem("Task 1", "My first task", "2020-12-01");
        item.update("Task A", item.getDescription(), item.getDueDate().toString());
        assertEquals("Task A", item.getTitle());
        assertEquals("My first task", item.getDescription());
        assertEquals("2020-12-01", item.getDueDate().toString());
    }

    @Test
    public void editingDescriptionSucceedsWithExpectedValue() {
        TaskItem item = new TaskItem("Task 1", "My first task", "2020-12-01");
        item.update(item.getTitle(), "Teach Java", item.getDueDate().toString());
        assertEquals("Task 1", item.getTitle());
        assertEquals("Teach Java", item.getDescription());
        assertEquals("2020-12-01", item.getDueDate().toString());
    }

    @Test
    public void editingDueDateFailsWithInvalidYYYYMMDD() {
        TaskItem item = new TaskItem("Task 1", "My first task", "2020-12-01");
        assertThrows(IllegalArgumentException.class,
        () -> item.update(item.getTitle(), item.getDescription(), "2020-64-35"));
        assertEquals("Task 1", item.getTitle());
        assertEquals("My first task", item.getDescription());
        assertEquals("2020-12-01", item.getDueDate().toString());
    }

    @Test
    public void editingDueDateFailsWithInvalidDateFormat() {
        TaskItem item = new TaskItem("Task 1", "My first task", "2020-12-01");
        assertThrows(IllegalArgumentException.class,
                () -> item.update(item.getTitle(), item.getDescription(), "Dec 1st, 2020"));
        assertEquals("Task 1", item.getTitle());
        assertEquals("My first task", item.getDescription());
        assertEquals("2020-12-01", item.getDueDate().toString());
    }


}
