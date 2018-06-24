/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author giova
 */
public class Carro {
    
    private String montadora;
    private String modelo;
    private float cilindradas;

    public Carro(String montadora, String modelo, float cilindradas) {
        this.montadora = montadora;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public Carro() {
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(float cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return montadora + " " + modelo + " " + cilindradas ;
    }
    
    
    
    
    
    
}
