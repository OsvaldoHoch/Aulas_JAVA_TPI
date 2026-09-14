
package com.mycompany.exercicio_3_2;

import javax.swing.JOptionPane;

public class Passagem {
    private String nomePassageiro;
    private String telefone;
    private String RG;
    private String localViagem;
    private String data;
    private String horario;
    private String numpoltrona;

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumpoltrona() {
        return numpoltrona;
    }

    public void setNumpoltrona(String numpoltrona) {
        this.numpoltrona = numpoltrona;
    }

    public void cadastrarDadosPassageiros() {
        setNomePassageiro(JOptionPane.showInputDialog("Digite o nome do passageiro:"));
        setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));
        setRG(JOptionPane.showInputDialog("Digite o RG:"));
    }

    public void cadastrarDadosPassagem(String numpoltrona) {
        setLocalViagem(JOptionPane.showInputDialog("Digite o local da viagem:"));
        setData(JOptionPane.showInputDialog("Digite a data:"));
        setHorario(JOptionPane.showInputDialog("Digite o horário:"));
        setNumpoltrona(numpoltrona);
    }

    public String mostrarDadosPassageiro() {
        return "Dados do Passageiro:\n"
                + "Nome: " + getNomePassageiro() + "\n"
                + "Telefone: " + getTelefone() + "\n"
                + "RG: " + getRG();
    }

    public void mostrarDadosPassagem() {
        
        
    JOptionPane.showMessageDialog(null, 
            mostrarDadosPassageiro() + "\n\nDados da Passagem:\n"
            + "Destino: " + getLocalViagem() + "\n"
            + "Data: " + getData() + "\n"
            + "Horário: " + getHorario() + "\n"
            + "Poltrona: " + getNumpoltrona());
    }
}