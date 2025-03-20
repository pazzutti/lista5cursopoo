package lista.exercicio;
import java.util.Scanner;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n && i <= 10; i++){
            vetor [i] = sc.nextInt();
        }
        if(vetor.length > 0){
            System.out.println("Números negativos: ");
            for (int i = 0; i < n; i++){
                if(vetor[i] < 0){
                    System.out.println(vetor[i]);
                }
            }
        }else{
            System.out.println("Nenhum número negativo foi digitado.");
        }
        
        sc.close();
    }
}
