package com.fall2016.planeProject;
import java.util.*;
/*
 * ReservationTest.java			Authors: Austin Davis, Sebastian Kromann, Jacob Godsave, and Dylan Sisai
 * 
 * A driver class which tests the Reservation class.
 */
public class ReservationTest
{

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("1B");
		list.add("2D");
		
		Reservation reserve = new Reservation("Hugh", "Mungus", "4242 Kappa Road, Hilliard, FL", 1234, list, 420);
		
		System.out.println("Before loading:\n");
		System.out.println(reserve.getID());
		System.out.println(reserve.getName());
		System.out.println(reserve.getAddress());
		System.out.println(reserve.getCard());
		System.out.println(reserve.getSeats());
		System.out.println(reserve.getPrice());
		System.out.println();
		reserve.saveReservation();
		reserve = reserve.loadReservation(63389);
		System.out.println("After loading:\n");
		System.out.println(reserve.getID());
		System.out.println(reserve.getName());
		System.out.println(reserve.getAddress());
		System.out.println(reserve.getCard());
		System.out.println(reserve.getSeats());
		System.out.println(reserve.getPrice());
		
	}

}
