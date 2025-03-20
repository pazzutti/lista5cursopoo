package lista.exercicio;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de valores: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0;
        double media = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor [i] = sc.nextDouble();
            soma+= vetor[i];
        }
        media = soma / vetor.length;
        System.out.print("Valores:");
        for (int i = 0; i < n; i++){
            System.out.printf(" %.2f", vetor[i]);
        }
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f ", media);
        
        
        
        sc.close();
    }
}
