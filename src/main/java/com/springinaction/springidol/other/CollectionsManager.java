package com.springinaction.springidol.other;

import java.util.Collection;

public class CollectionsManager {
    private City chosenCity;
    private Collection<City> bigCities;
    private Collection<String> cityNames;

    public void setChosenCity(City chosenCity) {
        this.chosenCity = chosenCity;
    }

    public void setBigCities(Collection<City> bigCities) {
        this.bigCities = bigCities;
    }

    public void setCityNames(Collection<String> cityNames) {
        this.cityNames = cityNames;
    }

    public City getChosenCity() {
        return chosenCity;
    }

    public Collection<City> getBigCities() {
        return bigCities;
    }

    public Collection<String> getCityNames() {
        return cityNames;
    }

    @Override
    public String toString() {
        return String.format("CollectionsManager:&n" +
                "chosenCity = %s%n" +
                "bigCities = %s%n" +
                "cityNames = %s%n", chosenCity, bigCities, cityNames);
    }
}
