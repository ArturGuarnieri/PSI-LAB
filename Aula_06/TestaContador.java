public class TestaContador {
    public static void main(String[] args) {
     Contador c1 = new Contador();
     c1.incrementa();
     System.out.println("C1: " + c1.getValor());  
     Contador c2 = new Contador();
     c2.incrementa();
     c2.incrementa();
     c1.zera();
     System.out.println("C1: " + c1.getValor()); 
     System.out.println("C2: " + c2.getValor());      
    }
    
}
