package parte01_boaspraticas.aula1410;

import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class CnpjTeste {

    public static void main(String[] args) {
        CNPJ cnpj1 = new CNPJ("23.842.459/0001-38");
        CNPJ cnpj2 = new CNPJ("23.842.459/0001-38");

        System.out.println( cnpj1.equals(cnpj2) );
        Set<CNPJ> documentos = Set.of(cnpj1, cnpj2 );

        documentos.forEach(System.out::println );

    }
}
