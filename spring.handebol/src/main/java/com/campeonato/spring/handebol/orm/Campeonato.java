package com.campeonato.spring.handebol.orm;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "campeonatos")
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nomecampeonato")
    private String nome;
    @OneToOne
    @JoinColumn(name = "p_1_id")
    private Partida p1;
    @OneToOne
    @JoinColumn(name = "p_2_id")
    private Partida p2;
    @OneToOne
    @JoinColumn(name = "t_1_id")
    private Time t1;
    @OneToOne
    @JoinColumn(name = "t_2_id")
    private Time t2;
    private String classificacao;
    private Calendar dataCriacao;
    private Calendar dataAtualizacao;


    public Campeonato() {

    }

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

    public Partida getP1() {
        return p1;
    }

    public void setP1(Partida p1) {
        this.p1 = p1;
    }

    public Partida getP2() {
        return p2;
    }

    public void setP2(Partida p2) {
        this.p2 = p2;
    }

    public Time getT1() {
        return t1;
    }

    public void setT1(Time t1) {
        this.t1 = t1;
    }

    public void setT2(Time t2) {
        this.t2 = t2;
    }

    public Time getT2() {
        return t2;
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

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", t1=" + t1 +
                ", t2=" + t2 +
                ", classificacao='" + classificacao + '\'' +
                '}';
    }
}
