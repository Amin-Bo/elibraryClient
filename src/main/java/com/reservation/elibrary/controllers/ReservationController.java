package com.reservation.elibrary.controllers;

import com.reservation.elibrary.proxy.reservations.Reservation;
import com.reservation.elibrary.proxy.reservations.ReservationWebServiceService;
import com.reservation.elibrary.proxy.reservations.Reservations;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    private Reservations ws = new ReservationWebServiceService().getReservationsPort();

    @GetMapping("/all")
    public String allReservations (Model model) {
        List<Reservation> allReservations = ws.getAllReservations();
        model.addAttribute("allReservations", allReservations);
        return "allReservations";

    }
}
