import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.ToDoController;
import dto.Task;

class Main {
    public static void main(String[] args) {
        new ToDoController().runToDoApp();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        List<Task> taskDatabase = new ArrayList<>();
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

        addTask() {
            print("Enter the task name")
            String taskName = // ask user using scanner 
            print("enter the task deadline")
            String deadline = // ask user 
            Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
            taskDatabase.add(task);
        }

        updateTask() {
                print("Enter the task name")
                String taskName = // ask user using scanner 
                print("enter the task deadline")
                String deadline = // ask user 
                Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
                taskDatabase.add(task);
            }
        
        deleteTask() {
                print("Enter the task name")
                String taskName = // ask user using scanner 
                print("enter the task deadline")
                String deadline = // ask user 
                Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
                taskDatabase.add(task);
            }
        
        getAllTasks() {
                print("Enter the task name")
                String taskName = // ask user using scanner 
                print("enter the task deadline")
                String deadline = // ask user 
                Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
                taskDatabase.add(task);
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