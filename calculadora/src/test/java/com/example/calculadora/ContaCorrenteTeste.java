package com.example.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ContaCorrenteTeste {

    private ContaCorrente conta;
    private Calculadora calculadora;

    @BeforeEach
    public void setup(){
        calculadora = Mockito.mock(Calculadora.class);
        conta = new ContaCorrente(calculadora);

    }

    @Test
    public void depositar_dez_em_conta_saldo_deve_ser_igual_a_dez(){
        Mockito.when(calculadora.somar(0,10)).thenReturn(10.0);
        conta.depositar(10.0);
        Assertions.assertEquals(10, conta.getSaldo());
    }

    @Test
    public void sacar_dez_em_conta_zerada_deve_ocorrer_excecao(){
        conta.sacar(10.0);
    }

    @Test
    public void transferir_dez_em_conta_zerada_deve_ocorrer_excecao(){
        conta.transferir(10.0);
    }

}
