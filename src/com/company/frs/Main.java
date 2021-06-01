package com.company.frs;

public class Main {

    public static void main(String[] args) {
        //Default data for Regular Ticket

        Ticket regularTicket = new RegularTicket("76467", "Bengaluru",
                "Delhi", "DepartureDateTime", "ArrivalDateTime",
                "6F", 5000, false, null, null, "lunch");
        //Default data for Tourist Ticket
        Ticket touristTicket = new TouristTicket("67898", "India", "Dubai",
                "DepartureDateTime", "ArrivalDateTIme",
                "10A", 15000, false, null, null,
                "Dubai Hotel", new String[]{""});

        printTicketDetails(regularTicket);//passing Regular Ticket Reference variable
        printTicketDetails(touristTicket);//passing Tourist Ticket Reference variable
    }
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}
