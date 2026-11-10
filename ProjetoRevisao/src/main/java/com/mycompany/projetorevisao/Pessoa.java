
package com.mycompany.projetorevisao;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pessoa {
    // Criar Atributos
    private String nome;
    private String endereco;
    private int idade;
    private double peso;

    // Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    // Métodos
    public void mostrarSystem(){
        System.out.println("Nome: " + getNome() +
                           "\n Endereço: " + getEndereco() +
                           "\n Idade: " + getIdade() +
                           "\n Peso" + getPeso());
    }
    public void mostrarJOption(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() +
                           "\n Endereço: " + getEndereco() +
                           "\n Idade: " + getIdade() +
                           "\n Peso" + getPeso());
    }
    public void cadastrarSystem(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        setNome(leia.next());
        System.out.println("Digite sua idade: ");
        setIdade(leia.nextInt());
        System.out.println("Digite seu endereço: ");
        setEndereco(leia.next());
        System.out.println("Digite seu peso: ");
        setPeso(leia.nextDouble());
    }
    public void casastrarJOption(){
        setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        setIdade (JOptionPane.showInputDialog("Digite sua idade: "));
        setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
        setPeso(JOptionPane.showInputDialog("Digite seu peso: "));
    }
}
