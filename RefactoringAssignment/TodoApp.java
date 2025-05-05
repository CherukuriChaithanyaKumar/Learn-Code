package RefactoringAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TodoList todoList = new TodoList();

		while (true) {
			displayMenu();
			int choice = getUserChoice(scanner);

			switch (choice) {
			case 1:
				todoList.addTask(scanner);
				break;
			case 2:
				todoList.removeTask(scanner);
				break;
			case 3:
				todoList.markTaskAsDone(scanner);
				break;
			case 4:
				todoList.listTasks();
				break;
			case 5:
				System.out.println("Goodbye!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void displayMenu() {
		System.out.println("\n1. Add Task");
		System.out.println("2. Remove Task");
		System.out.println("3. Mark Task as Done");
		System.out.println("4. List Tasks");
		System.out.println("5. Exit");
		System.out.print("> ");
	}

	private static int getUserChoice(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			scanner.nextLine(); 
			System.out.print("Invalid input. Enter a number: ");
		}
		return scanner.nextInt();
	}
}
