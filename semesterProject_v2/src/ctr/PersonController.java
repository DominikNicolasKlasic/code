package ctr;

import model.Customer;
import model.Worker;
import model.PersonContainer;

public class PersonController {
	
	private PersonContainer personContainer;
	
	public PersonController() {
		personContainer = new PersonContainer();
		PersonContainer.getPersonContainer();
	}
	
	public void createCustomer(int id, String name, String email, double balance) {
			Customer c = new Customer(id, name, email, balance);
			personContainer.addCustomer(c);
	}
	
	public void createWorker(int workerId, String name, String email, boolean manager, String department) {
		Worker w = new Worker(workerId, name, email, manager, department);
		personContainer.addWorker(w);
	}
	
	public void findPersonInfo(int id) {
		personContainer.findPersonById(id);
	}
	
	public void removePerson(int id) {
		personContainer.removePerson(id);
	}
}
