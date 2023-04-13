import java.util.*;


public class Planner implements Iterable<Task> {
    private final List<Task> tasks;
    public Planner() {

        this.tasks = new ArrayList<>();
    }
    public void add(Task task) {

        this.tasks.add(task);
    }
    public int getSize() {

        return tasks.size();
    }

    public void showAll() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void sort() {

        Collections.sort(tasks);
    }

    @Override
    public Iterator<Task> iterator() {
        return new PlannerIterator(this);
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }
}





