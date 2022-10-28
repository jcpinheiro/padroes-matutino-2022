package parte01_boaspraticas.aula2810;

import java.util.Objects;

public class BalancoEmpresa {

  private ArmazenadoDeDividas armazenadoDeDividas;
  //private ArquivoDeDividas arquivoDeDividas;

  public BalancoEmpresa(ArmazenadoDeDividas bancoDeDados ) {
    this.armazenadoDeDividas = bancoDeDados;
  }

  /*public BalancoEmpresa(ArquivoDeDividas arquivo ) {
    this.arquivoDeDividas = arquivo;
  }*/



  public void registraDivida(Divida divida ) {
    armazenadoDeDividas.salva(divida );
  }

  public void pagaDivida(Documento documentoCredor, Pagamento pagamento ) {
    Divida divida = armazenadoDeDividas.carrega(documentoCredor );
    divida.registra(pagamento );
    armazenadoDeDividas.salva(divida);
  }

  public Divida buscaDividaDo(Documento documento ) {
    Divida divida = armazenadoDeDividas.carrega(documento );

    if (Objects.nonNull(divida))
      return divida;
    else
      throw new IllegalArgumentException("Não existe divida associada ao documento "); //+ cnpjCredor );
  }

}
