/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Carro;

/**
 *
 * @author giova
 */
public class Funcoes {
    
    private Carro carro;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public float getCilindradas(){
        float cilindradas = carro.getCilindradas();
        
        return cilindradas;
    }
    
    public float CalculaDistanciaMaxima(float total, float preco){
        
        float valor = total*preco * getCilindradas();
        return valor;
        
    }
    
    public float CalculaValorGastoParaAbastecer(float total , float consumo){
        
        
        float valor = total * consumo;
        return valor;
        
    }
}
