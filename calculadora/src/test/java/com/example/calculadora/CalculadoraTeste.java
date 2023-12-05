package com.example.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculadoraTeste {

    @Test
    public void soma_de_um_e_dois_deve_ser_igual_a_tres(){
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(1.0,2.0);
        Assertions.assertEquals(3,resultado);
        if(resultado == 3){
            System.out.println("O teste de subtracao esta correto");
        }else{
            System.out.println("O teste de subtracao esta incorreto");
        }

    }

    @Test
    public void subtracao_de_quatro_por_dois_deve_ser_igual_a_dois(){
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(4,2);
        Assertions.assertEquals(2,resultado);
        if(resultado == 2){
            System.out.println("O teste de subtracao esta correto");
        }else{
            System.out.println("O teste de subtracao esta incorreto");
        }
    }

}

