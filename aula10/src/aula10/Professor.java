/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Pc
 */
public class Professor extends Pessoa{
    private String especialidade;
    private float salorio;
    
    public void receberAum(float aum){
        this.setSalorio(this.getSalorio() + aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalorio() {
        return salorio;
    }

    public void setSalorio(float salorio) {
        this.salorio = salorio;
    }
    
    
    
}
