package com.exercicios.model;

public class Retangulo {

  private double largura;
  private double altura;
  private static String cor = "branco";

  public Retangulo() {
    this.largura = 1;
    this.altura = 1;

  }

  public Retangulo(double largura, double altura) {
    this.largura = largura;
    this.altura = altura;

  }

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public static String getCor() {
    return cor;
  }

  public static void setCor(String cor) {
    Retangulo.cor = cor;
  }

  public double getArea() {
    return this.altura * this.largura;
  }

  public double getPerimetro() {
    return ((2 * this.altura) + (2 * this.largura));
  }
}
