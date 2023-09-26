import java.util.Scanner;

public class  Sumatrices{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = lector.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = lector.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] matrizSuma = new int[filas][columnas];

        
        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("matrizA[" + i + "][" + j + "]: ");
                matrizA[i][j] = lector.nextInt();
            }
        }
    
        System.out.println("Ingrese los valores de la matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print("matrizB[" + i + "][" + j + "]: ");
                matrizB[i][j] = lector.nextInt();
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

         System.out.println("La matriz resultante (A + B) es:");
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                System.out.print(matrizSuma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}