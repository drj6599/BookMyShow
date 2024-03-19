package dev.dheeraj.BookMyShow.service;

import dev.dheeraj.BookMyShow.model.City;
import dev.dheeraj.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(String cityName)
    {
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }
}
