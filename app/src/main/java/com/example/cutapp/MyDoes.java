package com.example.cutapp;

public class MyDoes {

    String titledoes;
    String datedoes;
    String descriptiondoes;

    public MyDoes() {
    }

    public MyDoes(String titledoes, String datedoes, String descriptiondoes) {
        this.titledoes = titledoes;
        this.datedoes = datedoes;
        this.descriptiondoes = descriptiondoes;
    }

    public String getTitledoes() {
        return titledoes;
    }

    public void setTitledoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public String getDatedoes() {
        return datedoes;
    }

    public void setDatedoes(String datedoes) {
        this.datedoes = datedoes;
    }

    public String getDescriptiondoes() {
        return descriptiondoes;
    }

    public void setDescriptiondoes(String descriptiondoes) {
        this.descriptiondoes = descriptiondoes;
    }
}
