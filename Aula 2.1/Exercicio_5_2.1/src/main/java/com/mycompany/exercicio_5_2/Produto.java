
package com.mycompany.exercicio_5_2;

import javax.swing.JOptionPane;

public class Produto {
    private String nomeProduto;
    private int quantidade;
    private double valor;
    private double total;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void cadastrarProduto(int quant) {
        setNomeProduto(JOptionPane.showInputDialog("Digite o nome do produto:"));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:")));
        setQuantidade(quant);
    }

    public double calcularTotal() {
        setTotal(getValor() * getQuantidade());
        return getTotal();
    }
}
