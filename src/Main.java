//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object


        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido "+ nombre);
        System.out.println("---");
        System.out.println("Restar");
        System.out.print("Ingrese el primer numero para restar: ");
        int numResta1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero para restar: ");
        int numResta2 = scanner.nextInt();
        double resultadoResta = Calculadora.restar(numResta1, numResta2);
        System.out.println("Resultado de la resta: " + resultadoResta);

        System.out.println("---");
        System.out.println("Contar");
        System.out.println("Contador: " + Calculadora.contar() + Calculadora.contar()); // Assuming contar() still works without input

        scanner.close(); // Close the scanner to release resources
    }
}