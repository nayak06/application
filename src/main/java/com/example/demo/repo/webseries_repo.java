package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.series;

public interface webseries_repo extends CrudRepository<series, Integer> {

	Optional<series> findByName(String name);

}
