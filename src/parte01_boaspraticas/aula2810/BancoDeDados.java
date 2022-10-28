package parte01_boaspraticas.aula2810;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadoDeDividas {
  private Map<Documento, Divida> dividasNoBanco = new HashMap<>();
 
  public BancoDeDados(String endereco, String usuario, String senha) {
    System.out.println("Conectado!");
  }

  @Override
  public void salva(Divida divida) {
    dividasNoBanco.put(divida.getDocumentoCredor(), divida);
  }

  @Override
  public Divida carrega(Documento documentoCredor) {
    return dividasNoBanco.get(documentoCredor);
  }

  public void desconecta() {
    System.out.println("Desconectado!");
  }
}
