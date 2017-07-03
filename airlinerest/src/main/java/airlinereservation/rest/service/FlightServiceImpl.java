package airlinereservation.rest.service;


import airlinereservation.repositories.repository.FlightRepository;
import airlinereservation.repositories.model.Flight;
import airlinereservation.rest.serviceInterface.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by safeeul on 7/2/2017.
 */
@Service
public class FlightServiceImpl implements FlightService{
    @Autowired
    FlightRepository flightRepository;
    @Override
    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(Flight flight) {
        flightRepository.delete(flight);
    }

    @Override
    public void updateFlight(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public Flight getFlight(Integer flightId) {
        return  flightRepository.findOne(flightId);
    }
}
