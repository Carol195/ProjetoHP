package com.company;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String args[]){
        Banco banco =new Banco();
        Cliente c1 = new PessoaFisica( "Carol", 912388493);
        Conta   cc = new ContaCorrente(c1, BigDecimal.valueOf(1000));

        System.out.println(c1);
        System.out.print(cc);

    }
}
