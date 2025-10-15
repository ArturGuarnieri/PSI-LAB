public class Biblioteca {
    private static final int CAPACIDADE_MAXIMA = 10;
    ItemBiblioteca acervo[];
    int totalDeItens;

    public Biblioteca(){
        this.acervo = new ItemBiblioteca[CAPACIDADE_MAXIMA];
        this.totalDeItens = 0;
    }
    
    public void adicionarItem(ItemBiblioteca item){
        acervo[totalDeItens++] = item;
    }

    public void listarItens(){

    }

    public ItemBiblioteca buscarItem(String titulo){
        for (int i = 0; i < totalDeItens; i++){
            if(acervo[i].titulo.equals(titulo)){
                return acervo[i];
            }
        }
    }

    public void realizarEmprestimo(String titulo){

    }

    public void realizarDevolucao(String titulo){
        
    }
}
