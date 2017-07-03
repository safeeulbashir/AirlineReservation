package airlinereservation.rest.serviceInterface;

import airlinereservation.repositories.model.FlightDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by safeeul on 7/3/2017.
 */
public interface FlightDetailsService {
    FlightDetails getFlightDetails(Integer flightId, Date departureDate);
}
