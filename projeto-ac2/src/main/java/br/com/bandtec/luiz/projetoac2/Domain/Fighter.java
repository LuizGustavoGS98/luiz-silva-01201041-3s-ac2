package br.com.bandtec.luiz.projetoac2.Domain;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Fighter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    @NotBlank
    @Size(min = 3, max = 12)
    private String nome;

    @PositiveOrZero
    @Column(name = "forcaGolpe")
    private Double forcaGolpe;

    @PositiveOrZero
    @Column(name = "vida")
    private Double vida;

    @PositiveOrZero
    @Column(name = "concentracoesRealizadas")
    private Integer concentracoesRealizadas;

    @Column(name = "vivo")
    private boolean vivo;

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

    public Double getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Integer getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }

    public void setConcentracoesRealizadas(Integer concentracoesRealizadas) {
        this.concentracoesRealizadas = concentracoesRealizadas;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", forcaGolpe=" + forcaGolpe +
                ", vida=" + vida +
                ", concentracoesRealizadas=" + concentracoesRealizadas +
                ", vivo=" + vivo +
                '}';
    }
}
