package parte01_boaspraticas.aula2309;

import java.util.HashMap;
import java.util.Objects;

public class BalancoEmpresa {
    private HashMap<CNPJ, Divida> dividas = new HashMap<>();

    public void registraDivida(String credor, CNPJ cnpjCredor, double valor) {

        Divida divida = new Divida();

        divida.setTotal(valor);
        divida.setCredor(credor);
        divida.setCnpjCredor(cnpjCredor);

        dividas.put(cnpjCredor, divida);
    }

    public void pagaDivida(String cnpjCredor, Pagamento pagamento ) {
        Divida divida = this.buscaDividaDo(cnpjCredor);
        // divida.getHistoricoPagamentos().adiciona(pagamento);
        divida.adiciona(pagamento );

    }

    public Divida buscaDividaDo(String cnpjCredor) {
        Divida divida = dividas.get(cnpjCredor);

        if ((Objects.nonNull(divida))) {
            return divida;
        } else {
            throw new IllegalArgumentException("Não existe divida associada ao cnpj " + cnpjCredor);
        }

    }

}
