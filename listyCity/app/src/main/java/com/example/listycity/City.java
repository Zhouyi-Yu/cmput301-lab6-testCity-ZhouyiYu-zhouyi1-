package com.example.listycity;
/**
 * This is a class that defines a City.
 */
import java.util.Objects;
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName()); // this.city refers to the city name
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return Objects.equals(city, other.city)
                && Objects.equals(province, other.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
