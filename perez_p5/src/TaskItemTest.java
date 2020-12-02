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

}
