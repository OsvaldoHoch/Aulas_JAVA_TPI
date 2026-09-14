
package com.mycompany.exercicio_6_2;

import javax.swing.JOptionPane;

public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private int qtdItensComp;
    private double valorTotalCompra;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(int qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public void inserirDadosLoja() {
        setRazaoSocial(JOptionPane.showInputDialog("Digite a Razão Social da Loja:"));
        setCpfCliente(JOptionPane.showInputDialog("Digite o CPF do Cliente:"));
        setValorCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:")));
        setQtdItensComp(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens comprados:")));
    }

    public String mostrarDadosLoja() {
        return "Razão Social: " + getRazaoSocial() + "\n"
                + "CPF Cliente: " + getCpfCliente() + "\n"
                + "Valor Unitário/Base: R$ " + String.format("%.2f", getValorCompra()) + "\n"
                + "Quantidade de Itens: " + getQtdItensComp();
    }

    public double calcularCompraLoja() {
        setValorTotalCompra(getValorCompra() * getQtdItensComp());
        return getValorTotalCompra();
    }
}