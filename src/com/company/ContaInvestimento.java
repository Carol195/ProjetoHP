package com.company;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta{
    public ContaInvestimento(Cliente cliente, BigDecimal saldo) {
        super(cliente, saldo);
    }
}
