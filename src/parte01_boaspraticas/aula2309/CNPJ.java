package parte01_boaspraticas.aula2309;

public class CNPJ {

    private String valor;

    public CNPJ(String valor) {
        this.valor = valor;
    }

    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }
    private int segundoDigitoCorreto() {
        return 0;
    }
    private int segundoDigitoVerificador() {
        return 0;
    }
    private int primeiroDigitoCorreto() {
        return 0;
    }
    private int primeiroDigitoVerificador() {
        return 0;
    }
}
