package com.set;

import java.util.HashSet;
import java.util.Objects;

class Customer {
 int id;
 String name;
 double phone;
 
	public Customer(int id, String name, double phone) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id;
	}
	
}
 class HashSetDemo{
	public static void main(String[] args) {
		HashSet<Customer>h=new HashSet<>();
		Customer c1=new Customer(1,"d",234567889);
		Customer c2=new Customer(2,"i",134567889);
		Customer c3=new Customer(3,"v",5);
		Customer c4=new Customer(4,"y",734567889);
		Customer c5=new Customer(4,"y",734567889);

        h.add(c1);
        h.add(c2);
        h.add(c3);
        h.add(c4);
        h.add(c5);
        for( Customer h1:h) {
        	System.out.println(h1);
        }

	}

}
