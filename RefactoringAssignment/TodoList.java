package RefactoringAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	private final ArrayList<String> tasks = new ArrayList<>();
	private final ArrayList<Boolean> taskStatus = new ArrayList<>();

	public void addTask(Scanner scanner) {
		scanner.nextLine();
		System.out.print("Enter task: ");
		String task = scanner.nextLine();
		tasks.add(task);
		taskStatus.add(false);
		System.out.println("Task added.");
	}

	public void removeTask(Scanner scanner) {
		if (tasks.isEmpty()) {
			System.out.println("No tasks to remove.");
			return;
		}
		listTasks();
		System.out.print("Enter task number to remove: ");
		int index = getTaskIndex(scanner);
		if (isValidIndex(index)) {
			tasks.remove(index);
			taskStatus.remove(index);
			System.out.println("Task removed.");
		} else {
			System.out.println("Invalid task number.");
		}
	}

	public void markTaskAsDone(Scanner scanner) {
		if (tasks.isEmpty()) {
			System.out.println("No tasks to mark as done.");
			return;
		}
		listTasks();
		System.out.print("Enter task number to mark as done: ");
		int index = getTaskIndex(scanner);
		if (isValidIndex(index)) {
			taskStatus.set(index, true);
			System.out.println("Task marked as done.");
		} else {
			System.out.println("Invalid task number.");
		}
	}

	public void listTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks available.");
			return;
		}
		for (int i = 0; i < tasks.size(); i++) {
			String status = taskStatus.get(i) ? "[✔] " : "[ ] ";
			System.out.println((i + 1) + ". " + status + tasks.get(i));
		}
	}

	private int getTaskIndex(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.print("Enter a valid number: ");
		}
		return scanner.nextInt() - 1;
	}

	private boolean isValidIndex(int index) {
		return index >= 0 && index < tasks.size();
	}
}
