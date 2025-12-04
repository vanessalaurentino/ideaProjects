import java.util.Scanner;

public class CalculoMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis para armazenar as notas
        double[] notas = new double[8];

        // Entrada das notas
        System.out.println("Digite as 8 notas anuais:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota" + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        // Calcular medias bimestrais
        double mediaBimestral1 = (notas[0] + notas[1]) / 2;
        double mediaBimestral2 = (notas[2] + notas[3]) / 2;
        double mediaBimestral3 = (notas[4] + notas[5]) / 2;
        double mediaBimestral4 = (notas[6] + notas[7]) / 2;

        // Calcular médias semestrais
        double mediaSemestral1 = (mediaBimestral1 + mediaBimestral2) / 2;
        double mediaSemestral2 = (mediaBimestral3 + mediaBimestral4) / 2;

        // Calcular média final
        double mediaFinal = (mediaSemestral1 + mediaSemestral2) / 2;

        // Imprimir resultados
        System.out.println("\nResultados:");
        System.out.println("Média Bimestral 1: " + mediaBimestral1);
        System.out.println("Média Bimestral 2: " + mediaBimestral2);
        System.out.println("Média Bimestral 3: " + mediaBimestral3);
        System.out.println("Média Bimestral 4: " + mediaBimestral4);
        System.out.println("Média Semestral 1: " + mediaSemestral1);
        System.out.println("Média Semestral 2: " + mediaSemestral2);
        System.out.println("Média Final: " + mediaFinal);
    }
}



