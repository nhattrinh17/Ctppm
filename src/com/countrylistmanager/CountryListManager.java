package com.countrylistmanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryListManager {

    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        if(country != null) {
            countryList.add(country);
        }
    }

    public void add(AbstractCountry country, int index) {
        if(country != null) {
            countryList.add(index, country);
        }
    }

    public void remove(int index) {
        if(index < countryList.size()) {
            countryList.remove(index);
        }
    }

    public void remove(AbstractCountry country) {
        if(country != null) {
            countryList.remove(country);
        }
    }

    public AbstractCountry countryAt(int index) {
        if(index < countryList.size()) {
            return countryList.get(index);
        }
        return null;
    }

    public List<AbstractCountry> sortIncreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByArea() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getArea() > right.getArea()? 1 : -1;
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByArea() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getArea() > right.getArea()? -1 : 1;
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByGdp() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getGdp() > right.getGdp()? 1 : -1;
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByGdp() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getGdp() > right.getGdp()? -1 : 1;
            }
        });
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        for (AbstractCountry country : countryList) {
            if(country.getName() == continent) {
                newList.add(country);
            }
        }
        return newList;
    }

    public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        for (AbstractCountry country : countryList) {
            if(country.getPopulation() >= howMany) {
                newList.add(country);
            }
        }
        return newList;
    }

    public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        for (AbstractCountry country : countryList) {
            if(country.getPopulation() <= howMany) {
                newList.add(country);
            }
        }
        return newList;
    }

    public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        for (AbstractCountry country : countryList) {
            if(country.getArea() >= howMany) {
                newList.add(country);
            }
        }
        return newList;
    }

    public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        for (AbstractCountry country : countryList) {
            if(country.getArea() <= howMany) {
                newList.add(country);
            }
        }
        return newList;
    }

    public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        for (AbstractCountry country : countryList) {
            if(country.getGdp() >= howMany) {
                newList.add(country);
            }
        }
        return newList;
    }

    public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        for (AbstractCountry country : countryList) {
            if(country.getGdp() <= howMany) {
                newList.add(country);
            }
        }
        return newList;
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
