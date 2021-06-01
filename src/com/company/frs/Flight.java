package com.company.frs;
public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) { //Flight constructor for initializing values
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightNumber() { //getter for flight number

        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) { //setter for flight number
        this.flightNumber = flightNumber;
    }

    public String getAirline() { //getter for airline name
        return airline;
    }

    public void setAirline(String airline) { //setter for airline name
        this.airline = airline;
    }

    public int getCapacity() { //getter for capacity
        return capacity;
    }

    public void setCapacity(int capacity) { //setter for capacity
        this.capacity = capacity;
    }

    public int getBookedSeats() { //getter for number of booked seats
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) { //setter for number of booked seats
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() { //Flight details method
        return "Flight No: " + flightNumber + ", Airline: " + airline +
                ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    public boolean checkAvailability() { //checking whether booked seats is less than capacity for not overbooking
        return bookedSeats < capacity;
    }

    public void incrementBookingCounter() { //incrementing booked seats
        bookedSeats++;
    }

}
