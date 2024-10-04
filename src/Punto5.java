    import java.util.Scanner;
    public class Punto5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int filas, columnas;
            do {
                System.out.print("Ingrese el número de filas (mayor o igual a 2): ");
                filas = scanner.nextInt();
            } while (filas < 2);

            do {
                System.out.print("Ingrese el número de columnas (mayor o igual a 2): ");
                columnas = scanner.nextInt();
            } while (columnas < 2);

            int[][] matriz = new int[filas][columnas];
            System.out.println("Ingrese los valores de la matriz:");
            int suma = 0;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("Elemento "    );
                    matriz[i][j] = scanner.nextInt();
                    suma += matriz[i][j];
                }
            }
            int totalElementos = filas * columnas;
            int promedio = suma / totalElementos;
            System.out.println("El promedio entero de los elementos es: " + promedio);
            boolean encontrado = false;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] == promedio) {
                        encontrado = true;
                        System.out.println("El promedio se encuentra en la posición: [" + i + "][" + j + "]");
                    }
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró ninguna coincidencia.");
            }
        }
    }

