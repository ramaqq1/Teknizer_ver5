package com.ramaqq.teknizer;

import java.io.Serializable;

public class Data_pointExpired implements Serializable{

    private String expiredDate;
    private String points;
    private String PSBorder_id;
    private String typeTrans;
    private String services;
    private String phone;
    private String internet;
    private String constumer;
    private String contact;
    private String address;

    public Data_pointExpired(String expiredDate, String points, String PSBorder_id, String typeTrans,
                             String services, String phone, String internet, String constumer, String contact, String address) {
        this.expiredDate = expiredDate;
        this.points = points;
        this.PSBorder_id = PSBorder_id;
        this.typeTrans = typeTrans;
        this.services = services;
        this.phone = phone;
        this.internet = internet;
        this.constumer = constumer;
        this.contact = contact;
        this.address = address;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getPSBorder_id() {
        return PSBorder_id;
    }

    public void setPSBorder_id(String PSBorder_id) {
        this.PSBorder_id = PSBorder_id;
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

    public String getConstumer() {
        return constumer;
    }

    public void setConstumer(String constumer) {
        this.constumer = constumer;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
