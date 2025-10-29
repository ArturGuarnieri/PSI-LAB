public class Diarista extends Funcionario implements Geral {
    private float valordia;
    private int qtdedias;

    public Diarista(String nome, String carteiraDeTrabalho, float valordia, int qtdedias) {
        super(nome, carteiraDeTrabalho);
        this.valordia = valordia;
        this.qtdedias = qtdedias;
    }

    public float getValordia() {
        return valordia;
    }
    public void setValordia(float valordia) {
        this.valordia = valordia;
    }
    public int getQtdedias() {
        return qtdedias;
    }
    public void setQtdedias(int qtdedias) {
        this.qtdedias = qtdedias;
    }

    @Override
    public double calculaSalario() {
        return valordia * qtdedias;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Carteira de Trabalho: " + getCarteiraDeTrabalho());
        System.out.println("Valor por Dia: " + getValordia());
        System.out.println("Quantidade de Dias: " + getQtdedias());
    }
    
}
