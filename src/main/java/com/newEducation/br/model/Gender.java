package com.newEducation.br.model;

/**
 * Created by glaucia on 29/06/14.
 */
public enum Gender {

    FEMINiNO("Feminino"), MASCULINO("Masculino");

    private String valor;

    Gender(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
