public class Main {
    public static void main(String[] args) {
        Biblioteca bibliMack = new Biblioteca();
        Livro livro1 = new Livro("Java", "Alcides", 2025, 200);
        bibliMack.adicionarItem(livro1);
        Revista rev1 = new Revista("Python", "Alcides", 2025, 2);
    }
    
}
