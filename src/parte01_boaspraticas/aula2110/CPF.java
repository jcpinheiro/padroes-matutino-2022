package parte01_boaspraticas.aula2110;

import java.io.Serializable;
import java.util.Objects;

public class CPF implements Documento {

    private final String  valor;

    public CPF(String valor) {
        this.valor = valor;
    }

    @Override
    public String getValor() {
        return valor;
    }

    @Override
    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }
    private boolean segundoDigitoCorreto() {
        return true;
    }

    private boolean segundoDigitoVerificador() {
        return true;
    }

    private boolean primeiroDigitoCorreto() {
        return true;
    }

    private boolean primeiroDigitoVerificador() {
        return true;
    }

    @Override
    public String toString() {
        return "CNPJ {" +
                "valor='" + valor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPF cnpj = (CPF) o;
        return Objects.equals(valor, cnpj.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
