import java.util.Scanner;
public class Punto2 {
    public void insercion(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int valor = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > valor) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = valor;
        }
    }
    public void burbuja(int[] A) {
        int n = A.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if (A[i - 1] > A[i]) {
                    int aux = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }
    public void seleccion(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minimo]) {
                    minimo = j;
                }
            }
            int aux = A[minimo];
            A[minimo] = A[i];
            A[i] = aux;
        }
    }


}