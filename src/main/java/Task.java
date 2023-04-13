import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Это класс задача
 */
public class Task implements Comparable<Task> {
    private int id;
    private String task;
    private int priority;
    private String recDate;
    private String recTime;
    private String deadline;
    private String author;
    private static int count;

    static {
        count = 0;
    }


    public Task(String task, int priority, String deadline, String author) {
        this.id = ++count;
        this.task = task;
        this.priority = priority;
        this.recDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.recTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.deadline = deadline;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getRecDate() {
        return recDate;
    }

    public void setRecDate(String recDate) {
        this.recDate = recDate;
    }

    public String getRecTime() {
        return recTime;
    }

    public void setRecTime(String recTime) {
        this.recTime = recTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Task.count = count;
    }

    public String getPriority() {
        return switch (priority) {
            case 1 -> "низкий";
            case 2 -> "средний";
            case 3 -> "высокий";
            default -> "не установлен";
        };
    }

    public int getPriorCode() {

        return priority;
    }

    public void setPriority(int priority) {

        this.priority = priority;
    }


    @Override
    public String toString() {
        return  getId() + ". " +
                getTask() +
                ", дата добавления: " + recDate +
                ", время добавления: " + recTime +
                ", дедлайн: " + deadline +
                ", ФИО: " + getAuthor() +
                ", приоритет: " + getPriority();
    }

    @Override
    public int compareTo(Task o) {
        int compareId
                = o.getId();
        return this.id - compareId;
    }
}