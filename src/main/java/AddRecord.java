import java.util.Scanner;

public class AddRecord {
    private final Scanner scanner;

    public AddRecord(Scanner scanner) {
        this.scanner = scanner;
    }

    public Task NewTask() {
        System.out.print("Укажите задачу: ");
        String task = scanner.nextLine();
        System.out.print("Дедлайн: ");
        String deadline = scanner.nextLine();
        System.out.print("Автор: ");
        String author = scanner.nextLine();
        System.out.print("Приоритет задачи (1 - низкий, 2 - средний, 3 - высокий): ");
        String priority = scanner.nextLine();
        int prt = 0;
        if (priority.equals("1") | priority.equals("2") | priority.equals("3")) {
            prt = Integer.parseInt(priority);
        } else {
            System.out.println("Ошибка ввода, приоритет не установлен");
        }
        return new Task(task, prt, deadline, author);
    }


}
