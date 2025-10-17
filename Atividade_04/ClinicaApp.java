public class ClinicaApp {
    public static void main(String[] args) {
        Procedimento p1 = new Procedimento("Drenagem Linfatica", 60, 150);
        Procedimento p2 = new Procedimento("Laser Depilatorio", 45, 140);
        Procedimento p3 = new Procedimento("Massagem Modeladora", 90, 200);


        Atendimento a1 = new Atendimento(p1, 10);
        Atendimento a2 = new Atendimento(p2, 5);
        Atendimento a3 = new Atendimento(p3, 1);

        PlanoTratamento plano1 = new PlanoTratamento();

        plano1.adicionaAtendimento(a1);
        plano1.adicionaAtendimento(a2);
        plano1.adicionaAtendimento(a3);

        int tempoTotal = plano1.calculaTempoTotal();
        double custoTotal = plano1.calculaCustoTotal();

        System.out.println("O tempo total do seu plano é: " + tempoTotal + " min");
        System.out.println("O custo total do seu plano é: R$ " + custoTotal);
    }
}
