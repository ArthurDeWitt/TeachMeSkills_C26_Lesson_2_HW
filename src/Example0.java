import java.util.Scanner;
public class Example0 {
    public static void main(String[] args) {
        // Ввод первого аргумента квадратного уравнения
        System.out.println("Enter the first argument of square equation");
        Scanner scanner0 = new Scanner(System.in);
        double firstArgument = scanner0.nextDouble();

        // Ввод второго аргумента квадратного уравнения
        System.out.println("Enter the second argument of square equation");
        Scanner scanner1 = new Scanner(System.in);
        double secondArgument = scanner1.nextDouble();

        // Ввод третьего аргумента квадратного уравнения
        System.out.println("Enter the third argument of square equation");
        Scanner scanner2 = new Scanner(System.in);
        double thirdArgument = scanner2.nextDouble();

        // Формула расчёта корней квадратного уравнения через дискриминант
        double Discriminant = (secondArgument * secondArgument) - 4 * firstArgument * thirdArgument;

        // Проверка условий и вывод корней уравнения
        if (Discriminant > 0){
            double firstRoot = (-secondArgument + Math.sqrt(Discriminant)) / (2 * firstArgument);
            double secondRoot = (-secondArgument - Math.sqrt(Discriminant)) / (2 * firstArgument);
            System.out.println("Roots of square equation: " + firstRoot + "and" +secondRoot);
        } else if (Discriminant == 0){
            double root = - secondArgument / (2 * firstArgument);
            System.out.println("Root of square equation: " + root);
        } else {
            System.out.println("Square equation doesn't have real roots");
        }
    }
}
