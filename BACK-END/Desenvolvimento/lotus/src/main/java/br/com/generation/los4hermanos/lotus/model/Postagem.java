package br.com.generation.los4hermanos.lotus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ind;

    @NotNull(message = "Atributo Obrigatório")
    private String mensagem;

    @NotNull(message = "Atributo Obrigatório")
    @Size(min = 3, max = 50, message = "O atributo deve conter no mínimo 03 e no máximo 50 caracteres")
    private String titulo;

    private String midia;

    @NotNull(message = "Atributo Obrigatório")
    private String empresa;

    @ManyToOne // RELACIONEMTNO COM A POSTAGEM
    @JsonIgnoreProperties("postagem")
    private Usuario usuario;

    @ManyToOne // RELACIONAMENTO COM O TEMA
    @JsonIgnoreProperties("postagem")
    private Tema tema;

    public long getInd() {
        return this.ind;
    }

    public void setInd(long ind) {
        this.ind = ind;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMidia() {
        return this.midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tema getTema() {
        return this.tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

}