import java.util.ArrayList;

public class PlanoTratamento {
    private ArrayList<Atendimento> atendimentos;

    public PlanoTratamento(){
        atendimentos = new ArrayList<Atendimento>();
    }

    public void adicionaAtendimento(Atendimento a){
        atendimentos.add(a);
    }

    public int calculaTempoTotal(){
        int tempo = 0;
        for (Atendimento  a : atendimentos){
            tempo += a.calculaTempo();
        }
        return tempo;
    }

    public double calculaCustoTotal(){
        double custo = 0;
        for (Atendimento a: atendimentos){
            custo += a.calculaCusto();
        }
        return custo;
    }

}
