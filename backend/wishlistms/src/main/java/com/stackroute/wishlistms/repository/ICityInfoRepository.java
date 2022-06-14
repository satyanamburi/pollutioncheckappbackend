package com.stackroute.wishlistms.repository;

import java.util.List;
import com.stackroute.wishlistms.entity.CityInfo;
import com.stackroute.wishlistms.entity.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ICityInfoRepository extends MongoRepository<CityInfo,String> {

    List<CityInfo> findByUserId(long userId);
    Optional<CityInfo> findByUserIdAndCityAndStateAndCountry(long userId,String city,String state,String country);
}
