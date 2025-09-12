import java.util.Scanner;
public class AvaliarAlunos {
       public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o número de estudantes: ");
        int numEstudantes = entrada.nextInt();

        int[] vetor = new int[numEstudantes];
        for (int i=0; i < vetor.length; i++){
            System.out.printf("Estudante %2d: ", i + 1);
            vetor[i] = entrada.nextInt();
        }        
        double media = calculaMedia(vetor);
        System.out.println("Média das notas: " + media);
        imprimirResultados(vetor);

    }

    public static double calculaMedia(int[] vetor){
       double soma = 0;
       int qtde = 0;
       for (int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
            qtde++;
       } 
       return soma/qtde;
    }

    public static void imprimirResultados(int[] vetor){
       for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 7){
                System.out.printf("Estudante %2d está de recuperação!\n", i + 1); 
            } else {
                System.out.printf("Estudante %2d está APROVADO!\n", i + 1); 
            }
       }        
    }

}
