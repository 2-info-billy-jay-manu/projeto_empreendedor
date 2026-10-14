package br.com.senai.infoa.backend.projeto_empreendedor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "endereco") 
public class Endereco {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "cep")
    private int cep;

    @Column (name = "numero")
    private String numero;

    @Column (name = "logradouro")
    private String logradouro;

    @ManyToOne 
    @JoinColumn (name = "empreendedor_id")
    private Empreendedor empreendedor;


    public Endereco() {
    }

    public Endereco(int cep, Empreendedor empreendedor, Integer id, String logradouro, String numero) {
        this.cep = cep;
        this.empreendedor = empreendedor;
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
    }


    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Empreendedor getEmpreendedor() {
        return empreendedor;
    }

    public void setEmpreendedor(Empreendedor empreendedor) {
        this.empreendedor = empreendedor;
    }


}
