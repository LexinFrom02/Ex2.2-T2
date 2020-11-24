
public class BodyMassIndex {
    public double bmi(double weight, double height) {
        double index = weight / (height * height / 100 / 100);
        return index;
    }

    public void conditions(double massIndex) {
        if (massIndex < 16.5) {
            System.out.println(" - у Вас выраженный дефицит массы");
            return;
        }
        if (massIndex >= 16.5 && massIndex < 18.5) {
            System.out.println(" - у Вас недостаточная масса тела");
            return;
        }
        if (massIndex >= 18.5 && massIndex < 25) {
            System.out.println(" - у Вас НОРМАЛЬНЫЙ ВЕС!");
            return;
        }
        if (massIndex >= 25 && massIndex < 30) {
            System.out.println(" - у Вас избыточная масса тела");
            return;
        }
        if (massIndex >= 30 && massIndex < 35) {
            System.out.println(" - у Вас ожирение первой степени");
            return;
        }
        if (massIndex >= 35 && massIndex < 40) {
            System.out.println(" - у Вас ожирение второй степени");
            return;
        } else {
            System.out.println(" - у Вас ожирение третьей степени");
        }
    }
}
