package lista.exercicio.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de pessoas: ");
        int n = sc.nextInt();
        double soma = 0;
        double menor16 = 0;

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da pessoa %d:", i + 1);
            System.out.println();
            System.out.print("Nome: ");
            String setNome = sc.nextLine();
            System.out.print("Idade: ");
            int setIdade = sc.nextInt();
            System.out.print("Altura: ");
            double setAltura = sc.nextDouble();
            sc.nextLine();
            pessoa[i] = new Pessoa(setNome, setIdade, setAltura);
            soma += setAltura;
            if(setIdade < 16){
                menor16++;
                
            }
        }
        
        double media = soma / n;
        System.out.printf("Altura média: %.2f%n", media);
        double porcentagemMenor16 = ((double) menor16 / n) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenor16);
        

        if(menor16 > 0){
            System.out.println("Nome das pessoas com menos de 16 anos de idade:");
            for (int i = 0; i < n; i++){
                if (pessoa[i].getIdade() < 16){
                    System.out.println(pessoa[i].getNome());

                }
            }
        }
    
        sc.close();
    }
}
