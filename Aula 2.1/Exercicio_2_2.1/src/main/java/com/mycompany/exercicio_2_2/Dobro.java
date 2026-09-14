
package com.mycompany.exercicio_2_2;

import javax.swing.JOptionPane;

public class Dobro {
    private double numero;
    private double calculo;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public void calcularDobro() {
        setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite um número:")));
        setCalculo(getNumero() * 2);
        JOptionPane.showMessageDialog(null, "O dobro de " + getNumero() + " é: " + getCalculo());
    }
}
