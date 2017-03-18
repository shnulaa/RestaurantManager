package com.restaurant.service;

import com.restaurant.dto.Reservation;
import com.restaurant.service.helperModels.ChooserProduct;

import java.util.List;

/**
 * Created by Martha on 2/25/2017.
 */
public interface ReservationService {

    Reservation createReservationAndAddProducts(List<ChooserProduct> products);

    Reservation addProductInReservation(int reservationId, int productId, int amount);

    Reservation changeProductAmountInReservation(int reservationId, int productInReservationId, int amount);

    boolean deleteProductFromReservation(int reservationId, int productInReservationId);

    Reservation changeReservationState(int reservationId, boolean isActive);

    Reservation findReservationById(int reservationId);

    List<Reservation> findAllReservations();

    List<Reservation> findAllReservations(List<Integer> ids);

    boolean deleteReservation(int reservationId);

    boolean productInReservetionIsDeleted(int productInReservationId);

    Reservation updateReservation(Reservation reservation);

    List<Reservation> getAllClosedReservations();
}