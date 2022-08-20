package com.countrylistmanager;

public class NorthAmericaCountry extends AbstractCountry {
    CountryData data;

    public NorthAmericaCountry(CountryData data) {
        this.data = data;
    }

    @Override
    public double getArea() {
        return data.getArea();
    }

    @Override
    public String getCode() {
        return data.getCode();
    }

    @Override
    public double getGdp() {
        return data.getGdp();
    }

    @Override
    public String getName() {
        return data.getName();
    }

    @Override
    public int getPopulation() {
        return data.getPopulation();
    }

    public CountryData getData() {
        return data;
    }
}
