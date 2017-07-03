package airlinereservation.repositories.repository;

import airlinereservation.repositories.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by safeeul on 7/2/2017.
 */
@Repository
public interface FlightRepository extends CrudRepository<Flight, Integer> {

}
