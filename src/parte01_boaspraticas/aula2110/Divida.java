package parte01_boaspraticas.aula2110;

import javax.print.Doc;
import java.util.Objects;

public class Divida {

    private String credor;
     private Documento documentoCredor;
    private double total;


    private HistoricoPagamentos pagamentos = new HistoricoPagamentos();

    public HistoricoPagamentos getPagamentos() {
        return pagamentos;
    }

    public void registra(Pagamento pagamento) {
        this.pagamentos.registra(pagamento );
    }


    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public Documento getDocumentoCredor() {
        return documentoCredor;
    }

    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + documentoCredor.getValor() + '\'' +
                ", total=" + total +
                ", valorPago=" + pagamentos.getValorPago() +
                '}';
    }

    public double valorAPagar() {
        return this.total - pagamentos.getValorPago();
    }
}
