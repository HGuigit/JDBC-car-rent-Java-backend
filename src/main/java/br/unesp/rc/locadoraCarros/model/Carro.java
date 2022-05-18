/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.model;

/**
 *
 * @author guilh
 */
public class Carro {
    
    private String placa;
    private String nome;
    private int ano;
    private double quilometragem;
    private int patrimonio;
    private String status;
    private int maxDiasLocacao;
    private String marca;
    private String qrCode;
    private int idCategoria;
    
    public Carro(){
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public double getQuilometragem(){
        return this.quilometragem;
    }
    
    public void setQuilometragem(double quilometragem){
        this.quilometragem = quilometragem;
    }
    
    public int getPatrimonio(){
        return this.patrimonio;
    }
    
    public void setPatrimonio(int patrimonio){
       this.patrimonio = patrimonio;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public int getMaxDiasLocacao(){
        return this.maxDiasLocacao;
    }
    
    public void setMaxDiasLocacao(int maxDiasLocacao){
        this.maxDiasLocacao = maxDiasLocacao;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getQrCode(){
        return this.qrCode;
    }
    
    public void setQrCode(String qrCode){
        this.qrCode = qrCode;
    }
    
    public int getIdCategoria(){
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria){
        this.idCategoria = idCategoria;
    }
    
    @Override
    public String toString(){
       return "Carro{" + "placa=" + this.placa + ", nome=" + this.nome + 
               "\nano=" + this.ano + "quilometragem=" + this.quilometragem + 
               "\npatrimonio=" + this.patrimonio + "status=" + this.status + 
               "\nmaxDiasLocação=" + this.maxDiasLocacao + "marca=" + this.marca +
               "\nqrCode=" + this.qrCode + "idCategoria=" + this.idCategoria + "}";
    }
    
   
        
}
