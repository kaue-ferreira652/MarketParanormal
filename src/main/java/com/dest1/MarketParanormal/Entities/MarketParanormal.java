package com.dest1.MarketParanormal.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MarketParanormal {
    @Id
    private int id;
    private String camisa;
    private String moletom;
    private String calça;
    private String acessorios;
    private String hq;

    public MarketParanormal(){}

    public MarketParanormal(String camisa, String moletom, String calça, String acessorios, String hq) {
        this.camisa = camisa;
        this.moletom = moletom;
        this.calça = calça;
        this.acessorios = acessorios;
        this.hq = hq;
    }

    public MarketParanormal(int id, String camisa, String moletom, String calça, String acessorios, String hq) {
        this.id = id;
        this.camisa = camisa;
        this.moletom = moletom;
        this.calça = calça;
        this.acessorios = acessorios;
        this.hq = hq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCamisa() {
        return camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getMoletom() {
        return moletom;
    }

    public void setMoletom(String moletom) {
        this.moletom = moletom;
    }

    public String getCalça() {
        return calça;
    }

    public void setCalça(String calça) {
        this.calça = calça;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public String getHq() {
        return hq;
    }

    public void setHq(String hq) {
        this.hq = hq;
    }
}
