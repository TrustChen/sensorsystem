package org.sensorsystem.entity;

/**
 * Created by chen on 2017/3/13.
 */
public class unitconversion {

    private int conversion_id;

    private String unit;

    private float rate;//单位的换算比例

    private int m;

    private int kg;

    private int s;

    private int a;

    private int k;

    private int mol;

    private int cd;

    public int getConversion_id() {
        return conversion_id;
    }

    public void setConversion_id(int conversion_id) {
        this.conversion_id = conversion_id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getMol() {
        return mol;
    }

    public void setMol(int mol) {
        this.mol = mol;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }



}
