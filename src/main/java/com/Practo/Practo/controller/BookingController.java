package com.Practo.Practo.controller;

import com.Practo.Practo.payload.BookingDto;
import com.Practo.Practo.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
@PostMapping("add")
public ResponseEntity<String> bookAnAppointment(@RequestBody BookingDto bookingDto){
    bookingService.bookAnAppointment(bookingDto);
    return new ResponseEntity<>("Booking is confirmed", HttpStatus.CREATED);
    }

}
