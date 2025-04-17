package com.ped.model;

public class Candidato {
    private Integer id;
    private String name;
    private Float ptsDout;
    private Float ptsMest;
    private Float ptsEsp;
    private Float totalPts;
    private Integer position;
    private Float ptsLpfs; // língua portuguesa
    private Float ptsRlfs; // raciocinio logico matematico
    private Float ptsCpde; // conhecimento pedagógico
    private Float ptsCepe;// conhecimento especifico
    private Float totalPtsTitulo;
    private Float totalPtsProva;

    public Candidato() {

    }

    public Candidato(String id, String name, String ptsDout, String ptsMest, String ptsEsp, String totalPts) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.ptsDout = Float.parseFloat(ptsDout.replace(",", "."));
        this.ptsMest = Float.parseFloat(ptsMest.replace(",", "."));
        this.ptsEsp = Float.parseFloat(ptsEsp.replace(",", "."));
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

    public void setPtsDout(String ptsDout) {
        this.ptsDout = Float.parseFloat(ptsDout.replaceAll(",", "."));
    }

    public Float getPtsMest() {
        return ptsMest;
    }

    public void setPtsMest(String ptsMest) {
        this.ptsMest = Float.parseFloat(ptsMest.replaceAll(",", "."));
    }

    public Float getPtsEsp() {
        return ptsEsp;
    }

    public void setPtsEsp(String ptsEsp) {
        this.ptsEsp = Float.parseFloat(ptsEsp.replaceAll(",", "."));
    }

    public Float getTotalPts() {
        return totalPts;
    }

    public void setTotalPoints() {
        if (this.totalPtsProva == null || this.totalPtsTitulo == null) {
            this.totalPtsProva = 0.0f;
            this.totalPtsTitulo = 0.0f;
        }
        this.totalPts = this.totalPtsProva + this.totalPtsTitulo;
    }

    public Float getTotalPoints() {
        if (this.totalPts == null)
            this.totalPts = 0.0f;
        return this.totalPts;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Float getPtsLpfs() {
        return ptsLpfs;
    }

    public void setPtsLpfs(String ptsLpfs) {
        this.ptsLpfs = Float.parseFloat(ptsLpfs.replaceAll(",", "."));
    }

    public Float getPtsRlfs() {
        return ptsRlfs;
    }

    public void setPtsRlfs(String ptsRlfs) {
        this.ptsRlfs = Float.parseFloat(ptsRlfs.replaceAll(",", "."));
    }

    public Float getPtsCpde() {
        return ptsCpde;
    }

    public void setPtsCped(String ptsCpde) {
        this.ptsCpde = Float.parseFloat(ptsCpde.replaceAll(",", "."));
    }

    public Float getPtsCepe() {
        return ptsCepe;
    }

    public void setPtsCepe(String ptsCepe) {
        this.ptsCepe = Float.parseFloat(ptsCepe.replaceAll(",", "."));
    }

    public Float getTotalPtsTitulo() {
        return totalPtsTitulo;
    }

    public void setTotalPtsTitulo(String totalPtsTitulo) {
        this.totalPtsTitulo = Float.parseFloat(totalPtsTitulo.replaceAll(",", "."));
    }

    public Float getTotalPtsProva() {
        return totalPtsProva;
    }

    public void setTotalPtsProva(String totalPtsProva) {
        this.totalPtsProva = Float.parseFloat(totalPtsProva.replaceAll(",", "."));
    }

    @Override
    public String toString() {
        return "POSIÇÂO: " + position + ", ID: " + id +
                ", Nome: " + name +
                ", Doutorado: " + ptsDout +
                ", Mestrado: " + ptsMest +
                ", Especialização: " + ptsEsp +
                ", Total Títulos: " + totalPtsTitulo +
                ", LPFS: " + ptsLpfs +
                ", RLFS: " + ptsRlfs +
                ", CPED: " + ptsCpde +
                ", CEPE: " + ptsCepe +
                ", Total Prova: " + totalPtsProva +
                ", Total Titulo: " + totalPtsTitulo +
                ", Total Total: " + totalPts;

    }

    public String printProvaAvaliation() {

        return "lingua portuguesa: " + ptsLpfs + " raciocinio logico matematico: " + ptsRlfs +
                " conhecimento pedagógico: " + ptsCpde + " conhecimento especifico: " + ptsCepe + " TOTAL PROVA: "
                + totalPtsProva;
    }

}
