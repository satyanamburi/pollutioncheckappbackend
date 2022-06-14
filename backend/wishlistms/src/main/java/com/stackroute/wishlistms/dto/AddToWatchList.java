package com.stackroute.wishlistms.dto;

import com.stackroute.wishlistms.entity.Location;
import com.stackroute.wishlistms.entity.Pollution;
import com.stackroute.wishlistms.entity.Weather;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * Request DTO for adding product
 */
public class AddToWatchList {
    @Min(1)
    private long userId;
    @NotBlank
    @Length(min = 2)
    private String city;
    @NotBlank
    @Length(min = 2)
    private String state;
    @NotBlank
    @Length(min = 2)
    private String country;

    private Location location;
    private Pollution pollution;
    private Weather weather;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Pollution getPollution() {
        return pollution;
    }

    public void setPollution(Pollution pollution) {
        this.pollution = pollution;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }



}
