package parte01_boaspraticas.aula1410;

public class TesteHistoricoPagamentos {

    public static void main(String[] args) {
        HistoricoPagamentos pagamentos = new HistoricoPagamentos();

        Pagamento pagamento1 = new Pagamento("99pay", "234324324", 150);
        Pagamento pagamento2 = new Pagamento("99pay", "234324324", 250);


        pagamentos.registra(pagamento1 );



    }
}
