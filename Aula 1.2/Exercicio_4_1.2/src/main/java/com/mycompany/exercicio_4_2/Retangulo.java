
package com.mycompany.exercicio_4_2;

import javax.swing.JOptionPane;

public class Retangulo {
    private double ladoA;
    private double ladoB;
    private double area;
    private double perimetro;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void calcular(){
        setLadoA(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado A (em cm):")));
        setLadoB(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do lado B (em cm):")));
        
        setArea(getLadoA() * getLadoB());
        setPerimetro(2 * getLadoA() + 2 * getLadoB());
        
        JOptionPane.showMessageDialog(null, "Área: " + getArea() + " cm²\nPerímetro: " + getPerimetro() + " cm");
    }
}