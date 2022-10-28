package parte01_boaspraticas.aula2810;

public class MinhaAplicacao {

  public static void main(String[] args ) {

    BancoDeDados bd = new BancoDeDados("servidor", "usr", "senha");
    ArmazenadoDeDividas arquivoDeDividas = new ArquivoDeDividas();


    BalancoEmpresa balanco = new BalancoEmpresa(bd );
    registraDividas(balanco);
    realizaPagamentos(balanco);
    // outras ações
    bd.desconecta();
  }
  private static void registraDividas(BalancoEmpresa balanco) {
    CNPJ cnpjCredor = new CNPJ("00.000.000/0001-01");
    //CPF cpf = new CPF("434.133.444-54");
    Divida d1 = new Divida();
    d1.setTotal(500);
    d1.setDocumentoCredor(cnpjCredor );


    Divida d2 = new Divida();
    d2.setTotal(1000);
    d2.setDocumentoCredor(cnpjCredor );

    // preenche dados das dividas
    balanco.registraDivida(d1);
    balanco.registraDivida(d2);
  }
  private static void realizaPagamentos(BalancoEmpresa balanco) {
    Pagamento p1 = new Pagamento();
    p1.setValor(50);
    Pagamento p2 = new Pagamento();
    p2.setValor(80);
    CNPJ credor = new CNPJ("00.000.000/0001-01");
    // preenche dados dos pagamentos
    balanco.pagaDivida(credor, p1);
    balanco.pagaDivida(credor, p2);
  }
}
