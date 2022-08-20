package com.countrylistmanager;

public class EuropeCountry extends AbstractCountry {
    CountryData data;

    public EuropeCountry(CountryData data) {
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
