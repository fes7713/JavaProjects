package com.example.springbootjpa2.dao;

import com.example.springbootjpa2.model.Alien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{

}
