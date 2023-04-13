import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectFunction() {
        System.out.print("""
                        \nВыберите действие:
                        1. Показать текущие записи
                        2. Добавить запись
                        3. Сохранить записи в файл
                        0. Выход из программы
                        \nВаш ответ:
                        """);
        return scanner.nextLine();
    }
}