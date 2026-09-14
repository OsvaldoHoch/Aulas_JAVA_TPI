
package com.mycompany.exercicio_2_1;

import javax.swing.JOptionPane;

public class Combustivel {
    private double litros;
    private double valor;

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void precificacao(){
        setLitros(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade abastecida: ")));
        setValor(getLitros()*6.49);
        JOptionPane.showMessageDialog(null, "O valor a ser pago será: R$" + getValor());
    }
}
