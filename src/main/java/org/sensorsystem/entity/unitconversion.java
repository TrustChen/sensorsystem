package org.sensorsystem.entity;

/**
 * Created by chen on 2017/3/13.
 */
public class unitconversion {

    private int conversion_id;

    private String unit;

    private String internationalunit;

    private float rate;//单位的换算比例

    private int power;//单位的幂次，表示除法的形式

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

    public String getInternationalunit() {
        return internationalunit;
    }

    public void setInternationalunit(String internationalunit) {
        this.internationalunit = internationalunit;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "unitconversion{" +
                "conversion_id=" + conversion_id +
                ", unit='" + unit + '\'' +
                ", internationalunit='" + internationalunit + '\'' +
                ", rate=" + rate +
                ", power=" + power +
                '}';
    }
}
