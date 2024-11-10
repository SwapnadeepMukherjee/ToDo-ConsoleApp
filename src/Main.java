import controller.ToDoController;

class Main {
    public static void main(String[] args) {
        new ToDoController().runToDoApp();

        // List<Task> taskDatabase = new ArrayList<>();
        // System.out.println("Hello! I am your Tasks app. Please tell me what operations you want to perform")
        // var menu = """
        //     1. Add a Task
        //     2. Update task 
        //     3. Delete task
        //     4. List all Task
        //     5. Exit
        // """
        // System.out.println(menu);
        // System.out.println("Enter the opertions")
        
        // switch(userAction) {
        //     case 1 -> addTask();
        //     case 2 -> updateTask();
        //     case 3 -> deleteTask();
        //     case 4 -> getAllTasks();
        //     cas3 5 -> System.exit();
        //     default -> print("Invalid Input");
        // }

        // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // System.out.println("Enter operation");

        // String  = myObj.nextInt();  // Read user input
        // System.out.println("Username is: " + userName);  // Output user input

        // addTask() {
        //     print("Enter the task name")
        //     String taskName = // ask user using scanner 
        //     print("enter the task deadline")
        //     String deadline = // ask user 
        //     Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
        //     taskDatabase.add(task);
        // }

        // updateTask() {
        //         print("Enter the task name")
        //         String taskName = // ask user using scanner 
        //         print("enter the task deadline")
        //         String deadline = // ask user 
        //         Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
        //         taskDatabase.add(task);
        //     }
        
        // deleteTask() {
        //         print("Enter the task name")
        //         String taskName = // ask user using scanner 
        //         print("enter the task deadline")
        //         String deadline = // ask user 
        //         Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
        //         taskDatabase.add(task);
        //     }
        
        // getAllTasks() {
        //         print("Enter the task name")
        //         String taskName = // ask user using scanner 
        //         print("enter the task deadline")
        //         String deadline = // ask user 
        //         Task task = new Task(Task.getTaskAutoId(), taskName, PENDING, deadline);
        //         taskDatabase.add(task);
        //     }
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