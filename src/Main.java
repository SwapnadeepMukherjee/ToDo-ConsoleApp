import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import controller.ToDoController;
// import dto.Task;
import java.util.*; 

class Task {
    private int id;
    private String name;
    private String status;
    private String deadline;

    //Constructor class
    public Task(int id, String name, String status, String deadline) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deadline = deadline;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getDeadline() { return deadline; }
    public void setDeadline(String deadline) { this.deadline = deadline; }

    static int taskCounter = 0;
    public static int getTaskAutoId() {
        return ++taskCounter;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}

class ToDoController {
    private List<Task> taskDatabase;
    private Scanner scanner;

    public ToDoController() {
        this.taskDatabase = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void runToDoApp() {
        while (true) {
            displayMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask();
                    break;
                case "2":
                    updateTask();
                    break;
                case "3":
                    deleteTask();
                    break;
                case "4":
                    getAllTasks();
                    break;
                case "5":
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void displayMenu() {
        String menu = """
                Hello! I am your Tasks app. Please tell me what operations you want to perform
                1. Add a Task
                2. Update task 
                3. Delete task
                4. List all Tasks
                5. Exit
                Enter operation:""";
        System.out.println(menu);
    }

    private void addTask() {
        System.out.println("Enter the task name:");
        String taskName = scanner.nextLine();
        System.out.println("Enter the task deadline:");
        String deadline = scanner.nextLine();

        Task task = new Task(Task.getTaskAutoId(), taskName, "Pending", deadline);
        taskDatabase.add(task);
        System.out.println("Task added successfully!");
    }

    private void updateTask() {
        System.out.println("Enter the task name to update:");
        String taskName = scanner.nextLine();

        Task taskToUpdate = findTaskByName(taskName);
        if (taskToUpdate != null) {
            System.out.println("Enter the new task deadline:");
            String newDeadline = scanner.nextLine();
            System.out.println("Enter the new task status:");
            String newStatus = scanner.nextLine();

            taskToUpdate.setDeadline(newDeadline);
            taskToUpdate.setStatus(newStatus);
            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Task not found.");
        }
    }

    private void deleteTask() {
        System.out.println("Enter the task name to delete:");
        String taskName = scanner.nextLine();

        Task taskToDelete = findTaskByName(taskName);
        if (taskToDelete != null) {
            taskDatabase.remove(taskToDelete);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found.");
        }
    }

    private void getAllTasks() {
        if (taskDatabase.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Your tasks:");
            for (Task task : taskDatabase) {
                System.out.println(task);
            }
        }
    }

    private Task findTaskByName(String taskName) {
        for (Task task : taskDatabase) {
            if (task.getName().equalsIgnoreCase(taskName)) {
                return task;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        new ToDoController().runToDoApp();
    }
}