package dev.dheeraj.BookMyShow.controller;

import dev.dheeraj.BookMyShow.dto.CityRequestDto;
import dev.dheeraj.BookMyShow.model.City;
import dev.dheeraj.BookMyShow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;
    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDto cityRequestDto){
        try{
            String cityName = cityRequestDto.getCityName();
            if(cityName == null || cityName.isEmpty() || cityName.isBlank()){
                throw new Exception("Invalid city name");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
