import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight;
        double height;
        double massIndex;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваш вес (кг)");
        weight = scanner.nextDouble();

        System.out.println("Введите Ваш рост (см)");
        height = scanner.nextDouble();

        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        massIndex = bodyMassIndex.bmi(weight, height);

        System.out.print("Ваш Индекс Массы Тела - ");
        System.out.format("%.2f", massIndex);


        // лучше этот блок вывести в отдельный метод или в точке входа все это прописать? Спасибо
        bodyMassIndex.conditions(massIndex);


//        if (massIndex < 16.5) {
//            System.out.println(" - у Вас выраженный дефицит массы");
//            return;
//        }
//        if (massIndex >= 16.5 && massIndex < 18.5) {
//            System.out.println(" - у Вас недостаточная масса тела");
//            return;
//        }
//        if (massIndex >= 18.5 && massIndex < 25) {
//            System.out.println(" - у Вас НОРМАЛЬНЫЙ ВЕС!");
//            return;
//        }
//        if (massIndex >= 25 && massIndex < 30) {
//            System.out.println(" - у Вас избыточная масса тела");
//            return;
//        }
//        if (massIndex >= 30 && massIndex < 35) {
//            System.out.println(" - у Вас ожирение первой степени");
//            return;
//        }
//        if (massIndex >= 35 && massIndex < 40) {
//            System.out.println(" - у Вас ожирение второй степени");
//            return;
//        } else {
//            System.out.println(" - у Вас ожирение третьей степени");
//        }
    }
}
