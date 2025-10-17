public class Atendimento {
    private int quantidade;
    private Procedimento p;
    
    public Atendimento(Procedimento p, int qtde){
        this.quantidade = qtde;
        this.p = p;
    }

    public int calculaTempo(){
        int tempoProcedimento = p.getDuracaoMinutos();
        int tempo = tempoProcedimento * quantidade;
        return tempo;
    }

    public double calculaCusto(){
        double custoProcedimento = p.getPrecoPorSessao();
        double custo = custoProcedimento * quantidade;
        return custo;
    }
}
