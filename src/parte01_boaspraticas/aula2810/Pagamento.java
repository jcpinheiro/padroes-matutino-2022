package parte01_boaspraticas.aula2810;

import java.time.LocalDate;

public class Pagamento extends Object {
    private String pagador;
    private String cnpjPagador;
    private LocalDate data = LocalDate.now();

    public Pagamento() {
    }

    public Pagamento(String pagador, String cnpjPagador, double valor) {
        this.pagador = pagador;
        this.cnpjPagador = cnpjPagador;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "pagador='" + pagador + '\'' +
                ", cnpjPagador='" + cnpjPagador + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    private double valor;

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
