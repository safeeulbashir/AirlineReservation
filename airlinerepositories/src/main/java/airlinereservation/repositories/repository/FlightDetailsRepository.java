package airlinereservation.repositories.repository;

import airlinereservation.repositories.model.FlightDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by safeeul on 7/3/2017.
 */
@Repository
public interface FlightDetailsRepository extends CrudRepository<FlightDetails, Integer> {
    /*List<FlightDetails> findByFlightId(Integer flightId);*/
}
