import java.util.Scanner;

public class Atividade2Monitoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada da temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Conversão para Kelvin
        double Kelvin = celsius + 273.15;

        // Imprimir resultados
        System.out.println("\nResultados");
        System.out.printf("%.2fªC é igual a %.2fºF\n", celsius, fahrenheit);
        System.out.printf("%.2fªC é igual a %.2fºK\n", celsius, Kelvin);

    }
}
