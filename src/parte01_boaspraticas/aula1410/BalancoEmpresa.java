package parte01_boaspraticas.aula1410;

import java.util.HashMap;
import java.util.Objects;

public class BalancoEmpresa {
  private HashMap<CNPJ, Divida> dividas = new HashMap<>();
 
  public void registraDivida(Divida divida ) {
    dividas.put(divida.getCnpjCredor(), divida );
  }

  public void pagaDivida(String cnpjCredor, Pagamento pagamento ) {
    Divida divida = this.buscaDividaDo(cnpjCredor );
    divida.registra(pagamento );
  }

  public Divida buscaDividaDo(String cnpj ) {
    Divida divida = dividas.get(cnpj );

    if (Objects.nonNull(divida)) {
      return divida;

    } else {
      throw new IllegalArgumentException("Não existe divida associada ao cnpj "); //+ cnpjCredor );
    }
  }

}
