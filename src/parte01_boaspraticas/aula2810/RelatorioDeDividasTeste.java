package parte01_boaspraticas.aula2810;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDividasTeste {
    public static void main(String[] args) {
        Divida divida = new Divida();
        divida.setCredor("Credor 1");
        divida.setDocumentoCredor(new CNPJ("00.000.000/0001-01"));
        divida.setTotal(3000 );

        NumberFormat formatadorDeNumero =
                NumberFormat.getCurrencyInstance
                        (new Locale("pt", "BR"));

        // passamos o formatadorDeNumero como argumento na chamada
        // do método que gera o relatório

        RelatorioDeDivida relatorio = new RelatorioDeDivida(divida );

        NumberFormat formatador = NumberFormat.getCurrencyInstance(
                new Locale("en", "US"));

        relatorio.geraRelatorio( formatador );
    }
}
