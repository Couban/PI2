/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Edu Franco
 */
public class Produto {
    
    private int codProduto;
    private String nomeProduto;
    private String descricao;
    private int quantidade;
    private double valorUnitario;
//    private String tipoFlor;
    ArrayList<Produto> ListaProduto;

    public Produto() {
        ListaProduto = new ArrayList();
    }
    
    
    public Produto(int codProduto, String nomeProduto, String descricao, int quantidade, double valorUnitario) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
//        this.tipoFlor = tipoFlor;
        ListaProduto = new ArrayList();
    }



    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

//    public void setTipoFlor(String tipoFlor) {
//        this.tipoFlor = tipoFlor;
//    }
    
    
    public int getCodProduto() {
        return codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

//    public String getTipoFlor() {
//        return tipoFlor;
//    }

    public void setListaProduto(ArrayList<Produto> ListaProduto) {
        this.ListaProduto = ListaProduto;
    }

    public ArrayList<Produto> getListaProduto() {
        return ListaProduto;
    }
    
    public void addProduto (Produto P) {
        ListaProduto.add(P);
    }
}
