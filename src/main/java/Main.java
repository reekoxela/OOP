import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Купить корм собаке",2,"15.04.2023","Александр Иванов");
        Task task2 = new Task("Сделать доклад по биологии",3,"14.04.2023","Тимофей Иванов");
        Task task3 = new Task("Разобраться в комнате",2,"16.04.2023","Илья Иванов");
        Task task4 = new Task("Сделать проект",2,"15.04.2023","Юлия Иванова");
        Task task5 = new Task("Помыть машину",1,"16.04.2023","Александр Иванов");

        Planner myPlanner = new Planner();
        myPlanner.add(task1);
        myPlanner.add(task2);
        myPlanner.add(task3);
        myPlanner.add(task4);
        myPlanner.add(task5);

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
        AddRecord addRec = new AddRecord(input);
        Interface userInterface = new Interface(input, menu, myPlanner, addRec);
        userInterface.plannerStart();
    }
}
