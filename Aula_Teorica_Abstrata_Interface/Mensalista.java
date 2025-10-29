public class Mensalista extends Funcionario implements Geral {
    private float salarioMensal;

    public Mensalista(String nome, String carteiraDeTrabalho, float salarioMensal) {
        super(nome, carteiraDeTrabalho);
        this.salarioMensal = salarioMensal;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calculaSalario() {
        return salarioMensal;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Carteira de Trabalho: " + getCarteiraDeTrabalho());
        System.out.println("Salário Mensal: " + getSalarioMensal());
    }
    
}
