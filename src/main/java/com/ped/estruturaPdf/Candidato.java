package com.ped.estruturaPdf;

public class Candidato {
    private Integer id;
    private String name;
    private Float ptsDout;
    private Float ptsMest;
    private Float ptsEsp;
    private Float totalPts;

    public Candidato() {

    }

    public Candidato(Integer id, String name, Float ptsDout, Float ptsMest, Float ptsEsp, Float totalPts) {
        this.id = id;
        this.name = name;
        this.ptsDout = ptsDout;
        this.ptsMest = ptsMest;
        this.ptsEsp = ptsEsp;
        this.totalPts = totalPts;
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

}
