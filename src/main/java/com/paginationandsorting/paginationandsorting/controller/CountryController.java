package com.paginationandsorting.paginationandsorting.controller;

import com.paginationandsorting.paginationandsorting.domain.Country;
import com.paginationandsorting.paginationandsorting.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class CountryController {

    private CountryService countryService;

    @GetMapping("/countrylist")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping("/sortedcountrylist/{field}")
    public List<Country> getAllCountriesWithSort(@PathVariable String field){
        return countryService.findCountryWithSorting(field);
    }

    @GetMapping("/pagination/{pageIndex}/{pageSize}")
    public Page<Country> getAllCountriesWithPagination(@PathVariable int pageIndex, @PathVariable int pageSize){
        return countryService.findCountryWithPagination(pageIndex, pageSize);
    }

    @GetMapping("/paginationandsorting/{pageIndex}/{pageSize}/{field}")
    public Page<Country> getAllCountriesWithPaginationAndSorting(@PathVariable int pageIndex, @PathVariable int pageSize, @PathVariable String field){
        return countryService.findCountryWithPaginationWithSorting(pageIndex, pageSize, field);
    }
}
