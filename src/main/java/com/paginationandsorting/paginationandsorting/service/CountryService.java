package com.paginationandsorting.paginationandsorting.service;

import com.paginationandsorting.paginationandsorting.domain.Country;
import com.paginationandsorting.paginationandsorting.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryService {

    private CountryRepository countryRepository;
    
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public List<Country> findCountryWithSorting(String field){
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public Page<Country> findCountryWithPagination(int pageIndex, int pageSize){
        Page<Country> paginatedCountries = countryRepository.findAll(PageRequest.of(pageIndex, pageSize));
        return paginatedCountries;
    }

    public Page<Country> findCountryWithPaginationWithSorting(int pageIndex, int pageSize, String field){
        Page<Country> paginatedAndSortedCountries = countryRepository.findAll(PageRequest.of(pageIndex, pageSize).withSort(Sort.Direction.ASC, field));
        return paginatedAndSortedCountries;
    }
}
