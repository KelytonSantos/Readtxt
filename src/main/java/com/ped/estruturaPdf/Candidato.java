package com.ped.estruturaPdf;

import java.util.ArrayList;
import java.util.List;

public class Candidato {
    private Integer id;
    private String name;
    private Float ptsDout;
    private Float ptsMest;
    private Float ptsEsp;
    private Float totalPts;

    List<Candidato> candidatos = new ArrayList<>();

    public Candidato() {

    }

    public Candidato(String id, String name, String ptsDout, String ptsMest, String ptsEsp, String totalPts) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.ptsDout = Float.parseFloat(ptsDout.replace(",", "."));
        this.ptsMest = Float.parseFloat(ptsMest.replace(",", "."));
        this.ptsEsp = Float.parseFloat(ptsEsp.replace(",", "."));
        this.totalPts = Float.parseFloat(totalPts.replace(",", "."));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPtsDout() {
        return ptsDout;
    }

    public void setPtsDout(Float ptsDout) {
        this.ptsDout = ptsDout;
    }

    public Float getPtsMest() {
        return ptsMest;
    }

    public void setPtsMest(Float ptsMest) {
        this.ptsMest = ptsMest;
    }

    public Float getPtsEsp() {
        return ptsEsp;
    }

    public void setPtsEsp(Float ptsEsp) {
        this.ptsEsp = ptsEsp;
    }

    public Float getTotalPts() {
        return totalPts;
    }

    public void setTotalPts(Float totalPts) {
        this.totalPts = totalPts;
    }

    public List<Candidato> getCandidato() {
        return candidatos;
    }

    public void setCandidatoToList(Candidato candidatos) {
        this.candidatos.add(candidatos);
        this.candidatos.sort((c1, c2) -> Float.compare(c2.getTotalPts(), c1.getTotalPts()));
    }
}
