/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Mestre dos Magos
 */


public class Cliente {
    
    private int codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String celular;
    private String cep;
    private String uf;
    private String sexo;
    private String endereco;
    private String numero;
    private String complemento;
    private String cidade;
    private String bairro;
    private String civil;
    private String nascimento;
    
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

    public Cliente(int codCliente, String nome, String cpf, String email, String celular, String cep, String uf, String sexo, String endereco, String numero, String complemento, String cidade, String bairro, String civil, String nascimento, ArrayList<Cliente> ListaCliente) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.cep = cep;
        this.uf = uf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.civil = civil;
        this.nascimento = nascimento;
        this.ListaCliente = ListaCliente;
    }
    
    

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
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
    

