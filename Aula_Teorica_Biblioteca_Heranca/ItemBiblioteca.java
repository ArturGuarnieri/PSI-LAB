public class ItemBiblioteca {

    protected String titulo;
    protected String autor;
    protected int anoDePublicacao;
    protected boolean disponivel;

    public ItemBiblioteca(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponivel = true;
    }

    public void exibirDetalhes(){

    }

    public void emprestar(){

    }

    public void devolver(){
        
    }
}
