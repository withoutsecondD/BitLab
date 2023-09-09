package OtherPractice.Task;

public class Task {
    public static void main(String[] args) {
        TaskList<String> someTaskList = new TaskList<>();

        someTaskList.addTask("Wash the car");
        someTaskList.addTask("Buy some food");
        someTaskList.addTask("Finish Java task");

        someTaskList.removeTask(0);

        someTaskList.viewTasks();
    }
}
