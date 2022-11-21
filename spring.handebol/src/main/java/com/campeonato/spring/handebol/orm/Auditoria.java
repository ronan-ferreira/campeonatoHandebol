package com.campeonato.spring.handebol.orm;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Calendar;

@Entity
@Table(name = "auditoria")
public class Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @JoinColumn(name = "modulo")
    private String modulo;
    @JoinColumn(name = "acao")
    private String acao;
    @JoinColumn(name = "id_usuario")
    private Integer id_usuario;
    @JoinColumn(name = "id_registro")
    private Integer id_registro;
    @JoinColumn(name = "valor_antigo")
    private String valor_antigo;
    @JoinColumn(name = "valor_atual")
    private String valor_atual;
    @JoinColumn(name = "data_cadastra")
    private Calendar data_cadastro;

    public Auditoria() {

    }

    public Auditoria(Integer id, String modulo, String acao, Integer id_usuario, Integer id_registro, String valor_antigo, String valor_atual, Calendar data_cadastro) {
        this.id = id;
        this.modulo = modulo;
        this.acao = acao;
        this.id_usuario = id_usuario;
        this.id_registro = id_registro;
        this.valor_antigo = valor_antigo;
        this.valor_atual = valor_atual;
        this.data_cadastro = data_cadastro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_registro() {
        return id_registro;
    }

    public void setId_registro(Integer id_registro) {
        this.id_registro = id_registro;
    }

    public String getValor_antigo() {
        return valor_antigo;
    }

    public void setValor_antigo(String valor_antigo) {
        this.valor_antigo = valor_antigo;
    }

    public String getValor_atual() {
        return valor_atual;
    }

    public void setValor_atual(String valor_atual) {
        this.valor_atual = valor_atual;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    @Override
    public String toString() {
        return "Auditoria{" +
                "id=" + id +
                ", modulo='" + modulo + '\'' +
                ", acao='" + acao + '\'' +
                ", id_usuario=" + id_usuario +
                ", id_registro=" + id_registro +
                ", valor_antigo='" + valor_antigo + '\'' +
                ", valor_atual='" + valor_atual + '\'' +
                ", data_cadastro=" + data_cadastro +
                '}';
    }
}
