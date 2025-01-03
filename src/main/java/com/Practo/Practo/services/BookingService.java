package com.Practo.Practo.services;

import com.Practo.Practo.entities.Booking;
import com.Practo.Practo.payload.BookingDto;
import com.Practo.Practo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    public void bookAnAppointment(BookingDto dto){
        List<String>availableTimeSlots =new ArrayList<>();
        availableTimeSlots.add("10:15 AM");
        availableTimeSlots.add("11:15 AM");
        availableTimeSlots.add("12:15 PM");

        Booking booking=new Booking();


//        for(String slots:availableTimeSlots){
//            if (slots.equals(dto.getBookingTime())){
//                booking.setBookingTime(dto.getBookingTime());
//                availableTimeSlots.remove(slots);
//
//            }
//        }
        for (int i = 0; i < availableTimeSlots.size(); i++) {
            if(availableTimeSlots.get(i) ==dto.getBookingTime()){
                booking.setBookingTime(dto.getBookingTime());
                availableTimeSlots.remove(i);
            }
        }
        int[] arr={1,2,3,4,5};
        for (int i = 0; i <arr.length ; i++) {

        }

        // Use removeIf to remove the slot matching the booking time
//        availableTimeSlots.removeIf(slots -> slots.equals(dto.getBookingTime()));
//        if (dto.getBookingTime() != null) {
//            booking.setBookingTime(dto.getBookingTime());
//        }
        //schedule the task to run every 24 hours
        ScheduledExecutorService executor= Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(()-> {
            //code to execute every 24 hours

            System.out.println("Executing code every 24 hours...");
            availableTimeSlots.add("10:15 AM");
            availableTimeSlots.add("11:15 AM");
            availableTimeSlots.add("12:15 PM");
            //Here,you can place the code to remove elements from the list
            //For example ,remove elements from the 'availableTimeSlots'
        },0,24, TimeUnit.HOURS);

//
//        booking.setDoctorId(dto.getDoctorId());
//        booking.setPatientId(dto.getPatientId());
//        if (booking.getBookingTime()!=null) {
//            bookingRepository.save(booking);
//        }else {
//            System.out.println("Time Slot Not Available");
        }}