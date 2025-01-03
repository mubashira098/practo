package com.Practo.Practo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id
    private Long id;

    private String bookingTime; // or another type if needed, e.g., LocalDateTime, etc.

    // Getter method for bookingTime
    public String getBookingTime() {
        return bookingTime;
    }

    // Setter method for bookingTime
    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }
}
