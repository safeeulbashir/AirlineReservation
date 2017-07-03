package airlinereservation.rest.controller;

import airlinereservation.repositories.model.Flight;
import airlinereservation.repositories.model.FlightDetails;
import airlinereservation.rest.serviceInterface.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by safeeul on 7/2/2017.
 */
@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;
  @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addOrUpdateFlight(@RequestBody Flight flight) {

        flightService.addFlight(flight);
        return "Flight Information Added";
    }
    @RequestMapping(value = "/{flightId}/delete")
    public String deleteFlight(@PathVariable Integer flightId) {

        flightService.deleteFlight(flightService.getFlight(flightId));
        return "Flight Information Deleted";
    }

    @RequestMapping(value = "/{flightId}", produces = MediaType.APPLICATION_JSON_VALUE )
    public Flight viewFlight(@PathVariable Integer flightId) {
      /*  Flight flight= new Flight();
        FlightDetails flightDetails= new FlightDetails();
        flight.setAirlineId(100);
        flight.setAirlineName("American Airlines");
        flight.setArrivalTime("3.00 p.m.");
        flight.setDepartureTime("8.00 a.m.");
        flight.setDuration("3H 2M");
        flight.setFromLocation("Dallas");
        flight.setToLocation("Albuquerque");
        flight.setTotalSeats(120);
        flightDetails.setAvailableSeats(20);
        flightDetails.setPrice(350.0);
        flightDetails.setFlightDepartureDate(new Date());
        flightDetails.setFlight(flight);
        List<FlightDetails> myList= new ArrayList<>();
        flight.setFlightDetailsList(myList);
        flight.getFlightDetailsList().add(flightDetails);
        flightService.addFlight(flight);
*/


        return flightService.getFlight(flightId);
    }

}
