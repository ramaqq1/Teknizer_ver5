package com.ramaqq.teknizer;

public class Data_Pointcut {
    private String idPoint_cut;
    private String actual_solution;
    private String date;
    private String pointMin;
    private String constumer;

    public Data_Pointcut(String idPoint_cut, String actual_solution, String pointMin, String date, String constumer) {
        this.idPoint_cut = idPoint_cut;
        this.constumer = constumer;
        this.actual_solution = actual_solution;
        this.date = date;
        this.pointMin = pointMin;
    }

    public String getConstumer() {
        return constumer;
    }

    public void setConstumer(String constumer) {
        this.constumer = constumer;
    }

    public String getIdPoint_cut() {
        return idPoint_cut;
    }

    public void setIdPoint_cut(String idPoint_cut) {
        this.idPoint_cut = idPoint_cut;
    }

    public String getActual_solution() {
        return actual_solution;
    }

    public void setActual_solution(String actual_solution) {
        this.actual_solution = actual_solution;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPointMin() {
        return pointMin;
    }

    public void setPointMin(String pointMin) {
        this.pointMin = pointMin;
    }
}
