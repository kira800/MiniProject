package com.MiniProject.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BookingTable")
public class Booking implements Serializable{
	 private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	@Column(name="arrival_date",nullable=false)
	private String arrivalDate;
	@Column(name="departure_date",nullable=false)
	private String departureDate;
	@Column(name="hotal_name",nullable=false)
	private String hotelName;
	@Column(name="room_type",nullable=false)
	private String roomType;
	@Column(name="No_of_Pass",nullable=false)
	private int nop;
	@Column(name="Aadhar_No.",nullable=false)
	private String aadhar;
	@Column(name="price",nullable=false)
	private double price;
//	@Column(name="payment_status",nullable=true)
//	private String paymentStatus;
	@Column(name="customer_id",nullable=false)
	private long customer_id;
	
	
    public Booking() {}
	
	public Booking(long id, String arrivalDate, String departureDate, String hotelName, String roomType, int nop,String aadhar,
			double price,long customer_id) {
		
		
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.nop = nop;
		this.aadhar=aadhar;
		this.price = price;
//		this.paymentStatus=paymentStatus;
		this.customer_id=customer_id;
		
		}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

//	public String getPaymentStatus() {
//		return paymentStatus;
//	}
//
//	public void setPaymentStatus(String paymentStatus) {
//		this.paymentStatus = paymentStatus;
//	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	
}
