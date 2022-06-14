package com.stackroute.wishlistms.dto;


import com.stackroute.wishlistms.entity.Location;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class RemoveFromWatchList {
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
