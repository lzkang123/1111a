package com.example.springboot2;

public class Addr {
    String Province;
    String city;

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "com.example.springboot1.Addr{" +
                "Province='" + Province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
