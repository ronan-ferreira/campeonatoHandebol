package com.campeonato.spring.handebol.orm;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "estadios")
public class Estadio{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private String nome;

    //@JoinColumn(name = "endereco_id", referencedColumnName = "id")
    @OneToOne
    private Endereco endereco;
    private Calendar dataCriacao;
    private Calendar dataAtualizacao;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        if(this.endereco == null){
            this.endereco = new Endereco();
        }
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco.getCep() +
                '}';
    }
}
