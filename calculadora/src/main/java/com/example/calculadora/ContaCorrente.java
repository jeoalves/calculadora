package com.example.calculadora;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaCorrente {

    private Double saldo;
    private Calculadora calculadora;
    public ContaCorrente(Calculadora calculadora) {
        this.saldo = 0.0;
        this.calculadora = calculadora;
    }

    public double consultaSaldo () {
        return saldo;
    }
    public void depositar (Double deposito){
        saldo = calculadora.somar(saldo, deposito);
    }
    public void sacar (Double valor){
        validarSaldoSuficiente(valor);
        saldo = calculadora.subtrair(saldo,valor);
    }

    public void transferir (Double valor){
        validarSaldoSuficiente(valor);
        saldo = calculadora.subtrair(saldo,valor);
    }
    private void validarSaldoSuficiente(Double valor){
        if (valor <= saldo){
            throw new RuntimeException("Saldo insuficiente");
        }
    }


}
