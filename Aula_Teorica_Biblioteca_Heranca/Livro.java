public class Livro extends ItemBiblioteca {

    private int numeroDePaginas;
    public Livro(String titulo, String autor, int anoDePublicacao, int paginas) {
        super(titulo, autor, anoDePublicacao);
        this.numeroDePaginas = paginas;

    }

    @Override
    public void exibirDetalhes(){

    }

    
}
