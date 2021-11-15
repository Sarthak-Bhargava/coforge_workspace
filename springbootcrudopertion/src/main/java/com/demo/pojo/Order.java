package com.demo.pojo;



import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name="ord_id")
    private String ord_id;
	
	@NotNull
	@Column(name="order_item")
	private String order_item;

	public String getOrd_id() {
		return ord_id;
	}


	
	public void setOrd_id(String ord_id) {
		this.ord_id = ord_id;
	}





	public String getOrder_item() {
		return order_item;
	}



	public void setOrder_item(String order_item) {
		this.order_item = order_item;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private Address address;

   

	@NotNull
	@Column(name="total")
    double total;

	@NotNull
	@Column(name="orderItemCount")
    private Long orderItemsCount;

    
    public Order() {

    }

   
    @Override
	public String toString() {
		return "Order [ord_id=" + ord_id + ", order_item=" + order_item + ", address=" + address + ", total=" + total
				+ ", orderItemsCount=" + orderItemsCount + ", getOrd_id()=" + getOrd_id() + ", getOrder_item()="
				+ getOrder_item() + ", getAddress()=" + getAddress() + ", getTotal()=" + getTotal()
				+ ", getOrderItemsCount()=" + getOrderItemsCount() + "]";
	}



	public void setTotal(double total) {
        this.total = total;
    }

    

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    

   

    public double getTotal() {
        return total;
    }

    public void setOrderItemsCount(Long orderItemsCount) {
        this.orderItemsCount = orderItemsCount;
    }

    public Long getOrderItemsCount() {
        return orderItemsCount;
    }
}
