package com.demo.pojo;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "addresses")
public class Address  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name="zipcode")
	private String zipCode;
	@NotNull
	@Column(name="streetAddress")
    private String streetAddress;
	@NotNull
	@Column(name="city")
    private String city;
	@NotNull
	@Column(name="country")
    private String country;
	@NotNull
	@Column(name="firstname")
    private String firstName;
	@NotNull
	@Column(name="lastname")
    private String lastName;

    @OneToMany(mappedBy = "address")
    List<Order> orders;

    @Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", streetAddress=" + streetAddress + ", city=" + city + ", country="
				+ country + ", firstName=" + firstName + ", lastName=" + lastName + ", orders=" + orders
				+ ", getStreetAddress()=" + getStreetAddress() + ", getCity()=" + getCity() + ", getCountry()="
				+ getCountry() + ", getZipCode()=" + getZipCode() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getOrders()=" + getOrders() + "]";
	}

	public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    

    

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}