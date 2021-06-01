package com.company.frs;

import java.time.LocalDateTime;
public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String from, String to, String departureDateTime,
                  String arrivalDateTime, String seatNo, float price, boolean cancelled,
                  Flight flight, Passenger passenger) { //Constructor for initialising values
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String checkStatus() { //method to return status of ticket
        return cancelled ? "Cancelled" : "Confirmed";
    }

    public int getFlightDuration() { //Changing ArrivalDt and DepartureDT to date and time to calculate duration of flight
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public void cancel() { //Changing ticket status to cancelled
        cancelled = true;
    }

    public String getPnr() { //getter for pnr
        return pnr;
    }

    public void setPnr(String pnr) { //setter for pnr
        this.pnr = pnr;
    }

    public String getFrom() { //getter for Origin Location
        return from;
    }

    public void setFrom(String from) { //setter for Origin Location
        this.from = from;
    }

    public String getTo() { //getter for Destination Location
        return to;
    }

    public void setTo(String to) { //setter for Destination Location
        this.to = to;
    }

    public String getDepartureDateTime() { //getter for Departure date time
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}

