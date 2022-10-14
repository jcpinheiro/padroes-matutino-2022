package parte01_boaspraticas;

import java.util.HashMap;
import java.util.Objects;

public class BalancoEmpresa {
  private HashMap<String, Divida> dividas = new HashMap<String,
                                                        Divida>();
 
  public void registraDivida(String credor, String cnpjCredor, double valor) {

    Divida divida = new Divida();

    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjCredor(cnpjCredor);

    dividas.put(cnpjCredor, divida );
  }

  public void pagaDivida(String cnpjCredor, double valor ) {
    Divida divida = dividas.get(cnpjCredor );

    if (Objects.nonNull(divida)) {
        divida.paga(valor );

    } else {
      throw new IllegalArgumentException("Não existe divida associada ao cnpj " + cnpjCredor );
    }
  }

  public Divida buscaDividaDo(String cnpj ) {
    Divida divida = dividas.get(cnpj );
    return divida;
  }

}
