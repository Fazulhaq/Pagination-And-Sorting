package com.paginationandsorting.paginationandsorting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "country_list")
@Setter
@Getter
@NoArgsConstructor
public class Country {
        
        @Id
        @Column(name = "country_id")
        private Long id;

        @Column(name = "country_name")
        private String countryName;

        @Column(name = "country_code")
        private String countryCode;
}
