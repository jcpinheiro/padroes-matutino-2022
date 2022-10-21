package parte01_boaspraticas.aula2110;

import java.util.HashMap;
import java.util.Objects;

public class BalancoEmpresa {
   private HashMap<Documento, Divida> dividas = new HashMap<>();

  public void registraDivida(Divida divida ) {
    dividas.put(divida.getDocumentoCredor(), divida );
  }

  public void pagaDivida(Documento documentoCredor, Pagamento pagamento ) {
    Divida divida = this.buscaDividaDo(documentoCredor );
    divida.registra(pagamento );
  }

  public Divida buscaDividaDo(Documento documento ) {
    Divida divida = dividas.get(documento );

    if (Objects.nonNull(divida))
      return divida;
    else
      throw new IllegalArgumentException("Não existe divida associada ao documento "); //+ cnpjCredor );
  }

}
