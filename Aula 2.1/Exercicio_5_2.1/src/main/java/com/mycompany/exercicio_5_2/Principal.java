 
package com.mycompany.exercicio_5_2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto();
        
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
        produto.cadastrarProduto(quant);
        
        double total = produto.calcularTotal();
        
        JOptionPane.showMessageDialog(null, "Produto: " + produto.getNomeProduto() + "\nTotal: R$ " + String.format("%.2f", total));
    }
}