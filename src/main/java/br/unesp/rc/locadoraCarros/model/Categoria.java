/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.model;

/**
 *
 * @author guilh
 */
public class Categoria {
    private int idCategoria;
    private String nome;
    private String descricao;
    private double  precoDiario;
    
    public Categoria(){
    }
   
    public int getIdCategoria(){
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria){
        this.idCategoria = idCategoria;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    //camelCase
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public double getPrecoDiario(){
        return this.precoDiario;
    }
    
    public void setPrecoDiario(double precoDiario){
        this.precoDiario = precoDiario;
    }
   
    @Override
    public String toString(){
        return "Categoria {idCategoria=" + this.idCategoria + "Nome=" + this.nome +
                "\ndescricao=" + this.descricao + "precoDiario=" + this.precoDiario +
                "}";
    }
}
