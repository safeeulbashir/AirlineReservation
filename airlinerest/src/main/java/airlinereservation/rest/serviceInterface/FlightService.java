package airlinereservation.rest.serviceInterface;

import airlinereservation.repositories.model.Flight;
import airlinereservation.repositories.model.FlightDetails;

import java.util.Date;

/**
 * Created by safeeul on 7/2/2017.
 */
public interface FlightService {
    void addFlight(Flight flight);
    void deleteFlight(Flight flight);
    void updateFlight(Flight flight);
    Flight getFlight(Integer flightId);
}
