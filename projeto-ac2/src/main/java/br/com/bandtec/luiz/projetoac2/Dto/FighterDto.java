package br.com.bandtec.luiz.projetoac2.Dto;

import br.com.bandtec.luiz.projetoac2.Domain.Fighter;

public class FighterDto {

    private String nome;

    private Double forcaGolpe;

    public FighterDto(Fighter fighter) {
        this.nome = fighter.getNome();
        this.forcaGolpe = fighter.getForcaGolpe();
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
}
