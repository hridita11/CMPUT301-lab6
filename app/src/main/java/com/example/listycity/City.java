package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {

    /**
     * This is a variable for city.
     */
    private String city;

    /**
     * This is a variable for province.
     */
    private String province;

    /**
     * This is the constructor for City.
     * @param city
     *      This is the name of the city.
     * @param province
     *      This is the name of the province.
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This is a function that gets a City name.
     * @return
     *      Return the name of the city.
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * This is a function that gets a province name.
     * @return
     *      Return the name of the province.
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * This method compares two city objects by their names.
     * @param other
     *      The city object to compare with.
     * @return
     *      A negative integer, zero, or a positive integer as this city's
     *      name is lexicographically less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }
}
