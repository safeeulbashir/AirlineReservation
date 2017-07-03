package airlinereservation.repositories.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by safeeul on 7/2/2017.
 */
@Entity
@Component
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "flightId", "flightDepartureDate" }) })
public class FlightDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flightDetailsId;
    private Date flightDepartureDate;
    private Double price;
    private Integer availableSeats;
    @ManyToOne
    @JoinColumn(name = "flightId")
    @JsonBackReference
    private Flight flight;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Integer getFlightDetailsId() {
        return flightDetailsId;
    }

    public void setFlightDetailsId(Integer flightDetailsId) {
        this.flightDetailsId = flightDetailsId;
    }
    public Date getFlightDepartureDate() {
        return flightDepartureDate;
    }

    public void setFlightDepartureDate(Date flightDepartureDate) {
        this.flightDepartureDate = flightDepartureDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }
}
