package parte01_boaspraticas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Divida {

    private String credor;
    private String cnpjCredor;
    private double total;
    private double valorPago;

    private List<Pagamento> pagamentos = new ArrayList<>();


    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void adiciona(Pagamento pagamento ) {
        pagamentos.add(pagamento );
    }


    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(String cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void paga(double valor ) {
        if (valor <= 0 ) {
            throw new IllegalArgumentException("O valor deve ser maior do que Zero!!" );
        }

        if (valor > 1000 )
            valor = valor - 1;

        this.valorPago = this.valorPago + valor;
    }


    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + cnpjCredor + '\'' +
                ", total=" + total +
                ", valorPago=" + valorPago +
                '}';
    }
}
