
package com.mycompany.exercicio_6_1;

import javax.swing.JOptionPane;

public class Venda {
    private String nome1;
    private double valor1;
    private int quantidade1;
    private double valorProduto1;

    private String nome2;
    private double valor2;
    private int quantidade2;
    private double valorProduto2;

    private String nome3;
    private double valor3;
    private int quantidade3;
    private double valorProduto3;

    private double valorTotal;

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public int getQuantidade1() {
        return quantidade1;
    }

    public void setQuantidade1(int quantidade1) {
        this.quantidade1 = quantidade1;
    }

    public double getValorProduto1() {
        return valorProduto1;
    }

    public void setValorProduto1(double valorProduto1) {
        this.valorProduto1 = valorProduto1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public int getQuantidade2() {
        return quantidade2;
    }

    public void setQuantidade2(int quantidade2) {
        this.quantidade2 = quantidade2;
    }

    public double getValorProduto2() {
        return valorProduto2;
    }

    public void setValorProduto2(double valorProduto2) {
        this.valorProduto2 = valorProduto2;
    }

    public String getNome3() {
        return nome3;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public double getValor3() {
        return valor3;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public int getQuantidade3() {
        return quantidade3;
    }

    public void setQuantidade3(int quantidade3) {
        this.quantidade3 = quantidade3;
    }

    public double getValorProduto3() {
        return valorProduto3;
    }

    public void setValorProduto3(double valorProduto3) {
        this.valorProduto3 = valorProduto3;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void calcularVenda() {
        setNome1(JOptionPane.showInputDialog("Digite o nome do primeiro produto:"));
        setValor1(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do primeiro produto:")));
        setQuantidade1(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida do primeiro produto:")));

        setNome2(JOptionPane.showInputDialog("Digite o nome do segundo produto:"));
        setValor2(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do segundo produto:")));
        setQuantidade2(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida do segundo produto:")));

        setNome3(JOptionPane.showInputDialog("Digite o nome do terceiro produto:"));
        setValor3(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do terceiro produto:")));
        setQuantidade3(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida do terceiro produto:")));

        setValorProduto1(getValor1() * getQuantidade1());
        setValorProduto2(getValor2() * getQuantidade2());
        setValorProduto3(getValor3() * getQuantidade3());

        setValorTotal(getValorProduto1() + getValorProduto2() + getValorProduto3());

        JOptionPane.showMessageDialog(null, "Resumo da Compra:\n"
                + getNome1() + ": R$ " + getValorProduto1() + "\n"
                + getNome2() + ": R$ " + getValorProduto2() + "\n"
                + getNome3() + ": R$ " + getValorProduto3()+ "\n\n"
                + "Valor Total da Compra: R$ " + getValorTotal());
    }
}
