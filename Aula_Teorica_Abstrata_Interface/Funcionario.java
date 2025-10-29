public abstract class Funcionario {
    private String nome;
    private String carteiraDeTrabalho;

    public Funcionario(String nome, String carteiraDeTrabalho) {
        this.nome = nome;
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }


    public abstract double calculaSalario();
}