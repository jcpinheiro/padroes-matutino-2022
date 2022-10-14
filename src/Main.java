import parte01_boaspraticas.Divida;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Divida dividaDoJoao = new Divida();

        dividaDoJoao.setTotal(1000);
        dividaDoJoao.setCredor("PicPay");
        dividaDoJoao.setCnpjCredor("23.842.459/0001-38");

        dividaDoJoao.paga(100);

        //dividaDoJoao.setPagamentos(new ArrayList<>() );

        System.out.println(dividaDoJoao );




    }
}