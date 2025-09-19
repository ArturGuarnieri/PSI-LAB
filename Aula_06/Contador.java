public class Contador {
    // Atributos
    int valor; 

    // Construtor
    public Contador(){
        valor = 0;
    }

    // Métodos
    public void incrementa(){
        valor++;
    }

    public void zera(){
        valor = 0;
    }

    public int getValor(){
        return valor;
    }
}
