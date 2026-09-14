
package com.mycompany.exercicio_3_2;

import javax.swing.JOptionPane;

public class IdadePessoa {
    private int anoAtual;
    private int ano;
    private int idade;

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void calcularIdade() {
        setAnoAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:")));
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:")));
        setIdade(getAnoAtual() - getAno());
    }

    public void mostrarIdade() {
        JOptionPane.showMessageDialog(null, "A idade da pessoa é: " + getIdade() + " anos");
    }
}