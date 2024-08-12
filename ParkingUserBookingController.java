package com.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.ParkingUserBooking;
import com.demo.service.ParkingUserBookingService;

@RestController
@RequestMapping("/api/userbookings")
public class ParkingUserBookingController {

    @Autowired
    private ParkingUserBookingService bookingService;

    @PostMapping
    public ResponseEntity<ParkingUserBooking> createBooking(@RequestBody ParkingUserBooking booking) {
        ParkingUserBooking savedBooking = bookingService.saveBooking(booking);
        return ResponseEntity.ok(savedBooking);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParkingUserBooking> getBookingById(@PathVariable("id") Integer bookingId) {
        Optional<ParkingUserBooking> booking = bookingService.findBookingById(bookingId);
        return booking.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ParkingUserBooking>> getAllBookings() {
        List<ParkingUserBooking> bookings = bookingService.findAllBookings();
        return ResponseEntity.ok(bookings);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable("id") Integer bookingId) {
        bookingService.deleteBooking(bookingId);
        return ResponseEntity.noContent().build();
    }
}
