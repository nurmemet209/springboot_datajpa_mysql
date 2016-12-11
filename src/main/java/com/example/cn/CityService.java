package com.example.cn;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Administrator on 12/11/2016.
 */
public interface CityService {

    Page<City> findCities(CitySearchCriteria criteria, Pageable pageable);

    City getCity(String name, String country);



}
