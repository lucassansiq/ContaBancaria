/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Hype
 */
public class Conta {
    
    private String Conta;
    private String Nome;
    private double Saldo;

    public String getConta() {
        return Conta;
    }

    public void setConta(String NomeConta) {
        this.Conta = NomeConta;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Conta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    public void sacar(double valor){
        if (valor <= this.getSaldo()){
            this.setSaldo(this.Saldo - valor);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sem saldo");
        }
            
        
    }
    
    public void depositar(double valor){
        if(this.Saldo > 0)
            this.setSaldo(this.Saldo + valor); 
        else JOptionPane.showMessageDialog(null, "Deposito invalido");
    }

    public Conta(String Conta, String Nome, double Saldo) {
        this.setConta(Conta);
        this.setNome(Nome);
        this.setSaldo(Saldo);
    }
    public Conta(){}
    
    

}
