package com.ekotomilt.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="buyer")
public class Buyer {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idbuyer")
	private int idbuyer;
	
	@OneToOne
	@JoinColumn(name="user_iduser") // the names must be IDENTICAL to the ones in the DB
	private User user;
	
	@OneToOne(mappedBy="buyer") 
	private Set<Cart> cart;
	
	@OneToMany(mappedBy="buyer") 
	private Set<Orders> orders;

	public Buyer() {
		super();
	}

	public Buyer(int idbuyer, User user, Set<Cart> cart, Set<Orders> orders) {
		super();
		this.idbuyer = idbuyer;
		this.user = user;
		this.cart = cart;
		this.orders = orders;
	}

	public int getIdbuyer() {
		return idbuyer;
	}

	public void setIdbuyer(int idbuyer) {
		this.idbuyer = idbuyer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Cart> getCart() {
		return cart;
	}

	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Buyer [idbuyer=" + idbuyer + ", user=" + user + ", cart=" + cart + ", orders=" + orders + "]";
	}

	
	
}