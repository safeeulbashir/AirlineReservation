package airlinereservation.rest.service;

import airlinereservation.repositories.model.FlightDetails;
import airlinereservation.repositories.repository.FlightDetailsRepository;
import airlinereservation.rest.serviceInterface.FlightDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by safeeul on 7/3/2017.
 */
public class FlightDetailsServiceImpl //implements FlightDetailsService    {
{  /*@Autowired
    FlightDetailsRepository flightDetailsRepository;
   */ /*@Override
    public FlightDetails getFlightDetails(Integer flightId, Date departureDate) {
        List<FlightDetails> flightDetails= flightDetailsRepository.findByFlightId(flightId);
        return flightDetails.get(0);
    }*/
}
