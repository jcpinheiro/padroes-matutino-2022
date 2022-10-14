package parte01_boaspraticas.aula2309;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Divida {

    private String credor;
    private CNPJ cnpjCredor;
    private double total;

    private HistoricoPagamentos historicoPagamentos =  new HistoricoPagamentos();

    public HistoricoPagamentos getHistoricoPagamentos() {
        return historicoPagamentos;
    }

    public List<Pagamento> getPagamentos() {
        return historicoPagamentos.getPagamentos();
    }

    public void adiciona(Pagamento pagamento) {
        this.historicoPagamentos.adiciona(pagamento );
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public CNPJ getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(CNPJ cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorPago() {
        return this.historicoPagamentos.getValorPago();
    }

    public double valorAPagar() {
        return total - historicoPagamentos.getValorPago();
    }

    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + cnpjCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + historicoPagamentos.getValorPago() +
                '}';
    }

}
