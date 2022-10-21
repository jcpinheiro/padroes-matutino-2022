package parte01_boaspraticas.aula2110;

import java.util.HashMap;
import java.util.Objects;

public class BalancoEmpresaOld {
  private HashMap<CNPJ, Divida> dividasPJ = new HashMap<>();
  private HashMap<CPF, Divida> dividasPF = new HashMap<>();

  public void registraDivida(Divida divida ) {
    if (divida.getCnpjCredor() != null )
       dividasPJ.put(divida.getCnpjCredor(), divida );

    else if (divida.getCpfCredor() != null )
      dividasPF.put(divida.getCpfCredor(), divida );

    else
      throw new IllegalArgumentException("A divida não é valido " );
  }

  public void pagaDivida(CNPJ cnpjCredor, Pagamento pagamento ) {
    Divida divida = this.buscaDividaDo(cnpjCredor );
    divida.registra(pagamento );
  }

  public void pagaDivida(CPF cpfCredor, Pagamento pagamento ) {
    Divida divida = this.buscaDividaDo(cpfCredor );
    divida.registra(pagamento );
  }

  public Divida buscaDividaDo(CNPJ cnpj ) {
    Divida divida = dividasPJ.get(cnpj );

    if (Objects.nonNull(divida)) {
      return divida;

    } else {
      throw new IllegalArgumentException("Não existe divida associada ao cnpj "); //+ cnpjCredor );
    }
  }

  public Divida buscaDividaDo(CPF cpf ) {
    Divida divida = dividasPF.get(cpf );

    if (Objects.nonNull(divida)) {
      return divida;

    } else {
      throw new IllegalArgumentException("Não existe divida associada ao CPF "); //+ cnpjCredor );
    }
  }

}
