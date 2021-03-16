package com.MiniProject.models;
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
	@Table(name="customer_details")
	public class Customer{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long customerId;
		@Column(name="first_name",nullable = false)
		private String firstName;
		@Column(name="last_name",nullable = false)
		private String lastName;
		@Column(name="email_id",nullable = false)
		private String emailId;
		@Column(name="Address",nullable = false)
		private String address;
		@Column(name="Phone_number",nullable = false)
		private String phoneNumber;
		@Column(name="Age",nullable = false)
		private String age;
		@Column(name="Gender",nullable = false)
		private String gender;
		
		/**@OneToOne(mappedBy="customerId")
	    @JoinColumn(name = "id",referencedColumnName="id")
	    private Booking book;**/
		
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Customer(long customerId, String firstName, String lastName, String emailId, String address,
				String phoneNumber, String age, String gender) {
			super();
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.age = age;
			this.gender = gender;
		}


		public long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
		
		
		
		
}