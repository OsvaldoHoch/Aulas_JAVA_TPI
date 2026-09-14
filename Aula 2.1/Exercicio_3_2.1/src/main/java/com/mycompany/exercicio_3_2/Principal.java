
package com.mycompany.exercicio_3_2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Passagem passagem = new Passagem();
        
        passagem.cadastrarDadosPassageiros();
        
        String poltrona = JOptionPane.showInputDialog("Digite o número da poltrona:");
        passagem.cadastrarDadosPassagem(poltrona);
        
        passagem.mostrarDadosPassagem();
    }
}