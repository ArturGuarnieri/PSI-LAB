public class Revista extends ItemBiblioteca {
    private int edicao;
    public Revista(String titulo, String autor, int anoDePublicacao, int edicao){
        super(titulo, autor, anoDePublicacao);
        this.edicao = edicao;
    }
}
