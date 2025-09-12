import java.util.Scanner;
public class AvaliarAlunos {
       public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o número de estudantes: ");
        int numEstudantes = entrada.nextInt();

        double[] vetor = new double[numEstudantes];
        for (int i=0; i < vetor.length; i++){
            System.out.printf("Estudante %2d: ", i + 1);
            vetor[i] = entrada.nextDouble();
        }        
        double media = calcularMediaTurma(vetor);
        System.out.println("Média das notas: " + media);
        imprimirResultados(vetor);

    }

    public static double calcularMediaTurma(double[] vetor){
       double soma = 0;
       int qtde = 0;
       for (int i = 0; i < vetor.length; i++){
            soma = soma + vetor[i];
            qtde++;
       } 
       return soma/qtde;
    }

    public static void imprimirResultados(double[] vetor){
       for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 7){
                System.out.printf("Estudante %2d está de recuperação!\n", i + 1); 
            } else {
                System.out.printf("Estudante %2d está APROVADO!\n", i + 1); 
            }
       }        
    }

}
