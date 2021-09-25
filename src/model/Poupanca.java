/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Lucas Hype
 */
public class Poupanca extends Conta{
    
    private int aniversario;

    public Poupanca(String Conta, String Nome, int Saldo,int aniversario) {
        super(Conta, Nome, Saldo);
        this.setAniversario(aniversario);
    }
    
    public Poupanca(){}

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }
    
    

}
