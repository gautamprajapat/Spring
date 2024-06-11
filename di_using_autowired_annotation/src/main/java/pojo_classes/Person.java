package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="person")
public class Person {
	@Autowired
	Mobile mobile;
	
	House house;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	@Autowired
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	Vehicle vehicle;
	
	
	
	public Person( @Autowired House house) {
		super();
		this.house = house;
	}


	public void call() {
		System.out.println("Person is calling");
		mobile.ring();
	}
	
	public void house() {
		house.myHouse();
	}
	public void vehicle() {
		vehicle.myVehicle();
	}
	
	

}
