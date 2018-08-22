package com.ramaqq.teknizer;

import java.io.Serializable;

public class DataGangguan implements Serializable{
    // ditampilkan di page list gangguan
    private String idGangguan;
    private String constumer;
    private String actSolution;
    private String date;
    // ditampilkan di detail page ke datail
    private String Address;
    private String Kondisi;
    private String Segmentation;

    public DataGangguan(String idGangguan, String constumer, String actSolution, String date, String address, String kondisi, String segmentation) {
        this.idGangguan = idGangguan;
        this.constumer = constumer;
        this.actSolution = actSolution;
        this.date = date;
        Address = address;
        Kondisi = kondisi;
        Segmentation = segmentation;
    }

    public String getIdGangguan() {
        return idGangguan;
    }

    public void setIdGangguan(String idGangguan) {
        this.idGangguan = idGangguan;
    }

    public String getConstumer() {
        return constumer;
    }

    public void setConstumer(String constumer) {
        this.constumer = constumer;
    }

    public String getActSolution() {
        return actSolution;
    }

    public void setActSolution(String actSolution) {
        this.actSolution = actSolution;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String kondisi) {
        Kondisi = kondisi;
    }

    public String getSegmentation() {
        return Segmentation;
    }

    public void setSegmentation(String segmentation) {
        Segmentation = segmentation;
    }
}
