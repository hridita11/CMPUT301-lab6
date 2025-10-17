package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of City objects.
 */
public class CityList {
    /**
     * A list that stores City objects.
     */
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not already exist.
     * @param city
     *      The City object to be added.
     * @throws IllegalArgumentException
     *      Thrown if the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This checks whether a given city exists in the list.
     * @param city
     *      The City object to check for.
     * @return
     *      True if the city exists in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This removes a given city from the list.
     * @param city
     *      The City object to remove.
     * @throws IllegalArgumentException
     *      Thrown if the city does not exist in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This returns how many cities are currently in the list.
     * @return
     *      The number of cities in the list.
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * This returns a sorted list of cities in lexicographical order by city name.
     * @return
     *      The sorted list of City objects.
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }
}
