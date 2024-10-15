package com.paginationandsorting.paginationandsorting.repository;

import com.paginationandsorting.paginationandsorting.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
