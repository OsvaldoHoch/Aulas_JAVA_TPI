
package com.mycompany.exercicio_6_2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Loja loja = new Loja();
        
        loja.inserirDadosLoja();
        loja.calcularCompraLoja();
        
        JOptionPane.showMessageDialog(null, loja.mostrarDadosLoja() + "\n\nValor Total da Compra: R$ " + loja.getValorTotalCompra());
    }
}