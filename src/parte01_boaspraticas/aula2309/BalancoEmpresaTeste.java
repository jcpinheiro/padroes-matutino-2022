package parte01_boaspraticas.aula2309;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {

        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida("PicPay",
                                   new CNPJ("23.842.459/0001-38"),
                                        1000);
        //balancoEmpresa.pagaDivida("23.842.459/0001-38", 150 );
        //balancoEmpresa.pagaDivida("23.842.459/0001-38", 100 );

        Divida divida = balancoEmpresa.buscaDividaDo("23.842.459/0001-38");

        System.out.println(divida );

    }
}
