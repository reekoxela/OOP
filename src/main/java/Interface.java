
import java.util.Scanner;

public class Interface {

    private Scanner input;
    private Menu menu;
    private Planner myPlanner;
    private AddRecord addRec;
    protected static String csvPath = "D:/JAVA/Task/Task/src/main/java/Planner.csv";

    public Interface(Scanner input, Menu menu, Planner myPlanner, AddRecord addRec) {
        this.input = input;
        this.menu = menu;
        this.myPlanner = myPlanner;
        this.addRec = addRec;
    }

    public void plannerStart() {
        while (true) {
            switch (menu.selectFunction()) {
                //Показать текущие задачи
                case "1":
                    myPlanner.sort();
                    myPlanner.showAll();
                    break;
                // добавить новую задачу
                case "2":
                    myPlanner.add(addRec.NewTask());
                    break;
                // Сохранить в файл
                case "3":
                    saveFile();
                    break;
                // выход из программы
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }

    public void saveFile() {
        PlannerIterator plannerIterator = new PlannerIterator(myPlanner);
        while (plannerIterator.hasNext()) {
            SaveModel<Task> saveCSV = new SaveModel<>(plannerIterator.next());
            saveCSV.setFormat(new ToCsv());
            saveCSV.setPath(csvPath);
            saveCSV.save();
        }
        System.out.println("Файл сохранен");
    }
}