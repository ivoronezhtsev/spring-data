package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesService {
    private final CountriesRepository countriesRepository;

    public CountriesService(CountriesRepository countriesRepository) {
        this.countriesRepository = countriesRepository;
    }

    public String getAllCountries() {
        StringBuilder countries = new StringBuilder();
        countriesRepository.findAll().forEach(countries::append);
        return countries.toString();
    }
}
