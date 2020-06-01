/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Mestre dos Magos
 */


public class Cliente {
    
    private String nome;
    private int cpf;
    private String email;
    private int celular;
    private int cep;
    private String uf;
    private String sexo;
    private String endereco;
    private int numero;
    private int complemento;
    private String cidade;
    private String bairro;
    private String civil;
    private int nascimento;
    private ArrayList<Cliente> ListaCliente;
    
    
public Cliente() {
    ListaCliente = new ArrayList();
}  



    //public Cliente(String Nome, int CPF, String Email, int Celular,
    //int CEP, String UF, String Sexo, String Endereço, int Numero, int Complemento,
   // String Cidade, String Bairro, String Civil, int    Nascimento){
    //ListaCliente = new ArrayList();    
    //this.Bairro = Bairro;
   // this.CEP = CEP;
    //this.CPF = CPF;
    //this.Celular = Celular;
    //this.Cidade = Cidade;
   // this.Civil = Civil;
   // this.Complemento = Complemento;
   // this.Email = Email;
   // this.Endereço = Endereço;
   // this.Nascimento = Nascimento;
   // this.Nome = Nome;
   // this.Numero = Numero;
   // this.Sexo = Sexo;
   // this.UF = UF;
   // ListaCliente = new ArrayList();
        
   // }
    
    public Cliente(String nome, int cpf, String email, int celular){
    this.nome = nome;
    this.cpf = cpf;
    this.celular = celular;
    this.email = email;
    ListaCliente = new ArrayList();
    }
    
    /**
     * @return the Nome
     */
       public String getNome() {
        return nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the CPF to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the Email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the Celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }

    /**
     * @return the CEP
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    /**
     * @return the UF
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param UF the UF to set
     */
    public void setUf(String Uf) {
        this.uf = uf;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the Sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the Endereço
     */
    public String getEndereço() {
        return endereco;
    }

    /**
     * @param Endereço the Endereço to set
     */
    public void setEndereço(String Endereço) {
        this.endereco = endereco;
    }

    /**
     * @return the Numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the Complemento
     */
    public int getComplemento() {
        return complemento;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the Civil
     */
    public String getCivil() {
        return civil;
    }

    /**
     * @param Civil the Civil to set
     */
    public void setCivil(String civil) {
        this.civil = civil;
    }

    /**
     * @return the Nascimento
     */
    public int getNascimento() {
        return nascimento;
    }

    /**
     * @param Nascimento the Nascimento to set
     */
    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the ListaCliente
     */
    public ArrayList<Cliente> getListaCliente() {
        return ListaCliente;
    }

    /**
     * @param ListaCliente the ListaCliente to set
     */
    public void setListaCliente(ArrayList<Cliente> ListaCliente) {
        this.ListaCliente = ListaCliente;
    }

    /**
     * @param C
     */
    public void addCliente(Cliente C){
        ListaCliente.add(C);
    
    }
}
    

