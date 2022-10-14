package parte01_boaspraticas.aula2309;

import java.time.LocalDate;

public class Pagamento {
    private String pagador;
    private String cnpjPagador;
    private double valor;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    private LocalDate data;

    public String getPagador() {
        return this.pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getCnpjPagador() {
        return this.cnpjPagador;
    }

    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
