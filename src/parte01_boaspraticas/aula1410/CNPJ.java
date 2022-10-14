package parte01_boaspraticas.aula1410;

import java.util.Objects;

public class CNPJ {

    private final String  valor;

    public CNPJ(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public boolean cnpjValido() {
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
        CNPJ cnpj = (CNPJ) o;
        return Objects.equals(valor, cnpj.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
