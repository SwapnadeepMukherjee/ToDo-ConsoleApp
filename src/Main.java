import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controller.ToDoController;
import dto.Task;

class Main {
    public static void main(String[] args) {
        //controller module is called
        new ToDoController().runToDoApp();