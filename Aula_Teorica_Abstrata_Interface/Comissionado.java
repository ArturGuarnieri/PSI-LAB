public class Comissionado extends Funcionario implements Geral {
    private float valorVendas;
    private float taxaComissao;

    public Comissionado(String nome, String carteiraDeTrabalho, float valorVendas, float taxaComissao) {
        super(nome, carteiraDeTrabalho);
        this.valorVendas = valorVendas;
        this.taxaComissao = taxaComissao;
    }

    public float getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }

    public float getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(float taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calculaSalario() {
        return valorVendas * taxaComissao;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Carteira de Trabalho: " + getCarteiraDeTrabalho());
        System.out.println("Valor de Vendas: " + getValorVendas());
        System.out.println("Taxa de Comissão: " + getTaxaComissao());
    }
    
}
