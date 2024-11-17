import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.ToDoController;
import dto.Task;
import java.util.*; 
class Main {
    public static void main(String[] args) {
        new ToDoController().runToDoApp();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello! I am your Tasks app. Please tell me what operations you want to perform");
        String menu = """ 
                1. Add a Task
                2. Update task 
                3. Delete task
                4. List all Task
                5. Exit
                """;
        System.out.println(menu);
        System.out.println("Enter operation");
        String taskname = myObj.nextLine();  // Read user input
        
        switch (taskname) {
            case "1. Add a Task":
                addTask();
                break;
            case "2. Update task":
                updateTask();
                break;
            case "3. Delete task":
                deleteTask();
                break;
            case "4. List all Task":
                getAllTasks();
                break;
            case "5. Exit":
                break;
            }
    static void addTask() {
        System.out.println("Enter the taskname");
        String taskName = myObj.nextLine();
        System.out.println("Enter the task deadline");
        String deadline = myObj.nextLine();
        List<Task> taskDatabase = new ArrayList<>();
        Task task = new Task(Task.getTaskAutoId(), taskName, "Pending", deadline);
        taskDatabase.add(task);
    }
    static void updateTask() {                                                                                                                                                                                                                                                                                                                                
        System.out.println("Enter the taskname");
        String taskName1 = myObj.nextLine();
        if (taskDatabase.contains(taskName1)){
            System.out.println("Enter the new task deadline");
            String deadline = myObj.nextLine();
            System.out.println("Enter the new task status");
            String taskStatus = myObj.nextLine();
            List<Task> taskDatabase = new ArrayList<>();
            Task task = new Task(Task.getTaskAutoId(), taskName, taskStatus, deadline);
            taskDatabase.add(task);
        }    
    }
    static void deleteTask() {
            System.out.println("Enter the task name")
            String taskName1 = myObj.nextLine();
            Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
            taskDatabase.Delete(task);
        }
    static void getAllTasks() {
        if (taskDatabase.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Your tasks:");
            for (String task : taskDatabase) {
                System.out.println("- " + task);
            }
        }
        
    }
}
// class Task {
//     int taskId;
//     String taskName;
//     TaskStatus taskStatus; // Pending | Progress | Done
//     String deadline;
//     int taskAutoId = 0;
//     public Task(int taskId, String taskName, TaskStatus taskStatus, String deadline) {
//         this.taskId = taskId;
//         .
//         .
//         .
//     }
//     public static int getTaskAutoId() {
//         taskAutoId++;
//         return taskAutoId;
//     }
// }
// public enum TaskStatus {
//     PENDING,
//     PROGRESS,
//     DONE
// }