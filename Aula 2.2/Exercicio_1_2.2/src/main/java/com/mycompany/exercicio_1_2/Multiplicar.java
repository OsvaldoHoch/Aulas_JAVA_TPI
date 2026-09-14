
package com.mycompany.exercicio_1_2;

import javax.swing.JOptionPane;

public class Multiplicar {
    private int valor;
    private int resultado;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void multiplicacao10() {
        setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:")));
        setResultado(getValor() * 10);
    }

    public void MostrarMultiplicacao() {
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação por 10 é: " + getResultado());
    }
}