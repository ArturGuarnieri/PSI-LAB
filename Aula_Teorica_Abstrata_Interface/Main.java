public class Main {
    public static void main(String[] args) {
        Diarista diarista = new Diarista("Maria", "123456", 100.0f, 20);
        diarista.imprimirDados();
        System.out.println("Salário: " + diarista.calculaSalario());
    }
}