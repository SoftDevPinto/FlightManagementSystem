package com.sprint.FlightManagementSystem.aircraft;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AircraftRepository
    extends CrudRepository<Aircraft, Long> {

        List<Aircraft> findAll ();

        Optional<Aircraft> findById (Long id);

        Object save (Aircraft aircraft);

        void deleteById (Long id);
}
