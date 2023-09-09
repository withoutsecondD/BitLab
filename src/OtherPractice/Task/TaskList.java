package OtherPractice.Task;

import java.util.LinkedList;

public class TaskList<T> {
    private LinkedList<T> tasks;

    public TaskList() {
        tasks = new LinkedList<T>();
    }

    public void addTask(T task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void viewTasks() {
        for (T task : tasks) {
            System.out.println(task);
        }
    }
}

