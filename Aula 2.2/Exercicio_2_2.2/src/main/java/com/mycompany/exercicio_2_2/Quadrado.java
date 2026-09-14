
package com.mycompany.exercicio_2_2;

import javax.swing.JOptionPane;

public class Quadrado {
    private double numero;
    private double Resultado;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }

    public void calcularquadrado() {
        setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite um número:")));
        setResultado(Math.pow(getNumero(), 2));
    }

    public void mostrarQuadrado() {
        JOptionPane.showMessageDialog(null, "O quadrado de " + getNumero() + " é: " + getResultado());
    }
}