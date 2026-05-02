package com.trip.services;

import java.util.List;

import com.trip.models.Trip;

public interface ITripServices {
	
	List<Trip> buscarTodo();
	Trip buscarporId(Integer idTrip);
	
}
