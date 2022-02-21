package com.company;

import java.math.BigDecimal;

public abstract class Conta {
    protected static Cliente cliente;
    protected BigDecimal saldo;

    public Conta( Cliente cliente, BigDecimal saldo){
        this.setCliente(cliente);
        this.setSaldo(saldo);
    }
    public void transferir(Conta contaOrigem, Conta contaDestino, BigDecimal valorTransferencia, BigDecimal valorSaque){
        if(valorTransferencia.compareTo(contaOrigem.saldo) ==1){
            System.out.println("Saldo insuficiente para transferência");
        } else if {
            contaOrigem.realizarSaque(BigDecimal.valueOf(valorTransferencia));
            contaDestino.depositar(BigDecimal.valueOf(valorTransferencia));        }
    public  BigDecimal depositar( BigDecimal valorDeposito) {
        this.saldo.add(new BigDecimal(String.valueOf(valorDeposito)));
        return this.getSaldo();
    }

    public BigDecimal realizarSaque(BigDecimal valorSaque) {
       if (valorSaque.compareTo(saldo)==1){
       System.out.println("Saque inválido")
        }else if { if (Conta.getCliente() instanceof PessoaFisica) {
            saquePF(valorSaque);
            return saquePF(valorSaque);
        } else if (Conta.getCliente() instanceof PessoaJuridica){
            saquePJ(valorSaque);
            return saquePJ(valorSaque);
        }}

    }

    public BigDecimal saquePF(BigDecimal valorSaque) {
        return this.saldo.subtract(valorSaque);
    }
    public BigDecimal saquePJ(BigDecimal valorSaque) {
        valorSaque.multiply(BigDecimal.valueOf(1.05));
        this.saldo.subtract(BigDecimal.valueOf(valorSaque);
        return this.saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public static Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + ", Saldo: "+ saldo;
    }
}

