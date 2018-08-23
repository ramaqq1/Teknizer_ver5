package com.ramaqq.teknizer;

import java.io.Serializable;

public class Data_pointHold implements Serializable{

    private String id_pointHold;
    private String constumer;
    private String address;
    private String points;
    private String datePSB;

    // vaiable detail point hold
    private String typeTrans;
    private String services;
    private String phone;
    private String internet;
    private String contact;

    public Data_pointHold(String id_pointHold, String constumer, String address, String points,
                          String datePSB, String typeTrans, String services, String phone, String internet, String contact) {
        this.id_pointHold = id_pointHold;
        this.constumer = constumer;
        this.address = address;
        this.points = points;
        this.datePSB = datePSB;
        this.typeTrans = typeTrans;
        this.services = services;
        this.phone = phone;
        this.internet = internet;
        this.contact = contact;
    }

    public String getId_pointHold() {
        return id_pointHold;
    }

    public void setId_pointHold(String id_pointHold) {
        this.id_pointHold = id_pointHold;
    }

    public String getConstumer() {
        return constumer;
    }

    public void setConstumer(String constumer) {
        this.constumer = constumer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getDatePSB() {
        return datePSB;
    }

    public void setDatePSB(String datePSB) {
        this.datePSB = datePSB;
    }

    public String getTypeTrans() {
        return typeTrans;
    }

    public void setTypeTrans(String typeTrans) {
        this.typeTrans = typeTrans;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
