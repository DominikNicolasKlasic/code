package model;

import java.util.ArrayList;

public class PersonContainer {
	
	private ArrayList<Person> persons;
	private static PersonContainer personContainer;
	private Customer c;
	private Worker w;
	private int i, id;
	private String name, email, department;
	private double balance;
	
	public PersonContainer() {
		w = new Worker(id, name, email, false, department);
		c = new Customer(id, name, email, balance);
		persons = new ArrayList<>();
	}
	
	public static synchronized PersonContainer getPersonContainer() {
        if(personContainer == null) {
            personContainer = new PersonContainer();
        }
        return personContainer;
    }
	
	public void addCustomer(Customer c) {
		if(persons.contains(c)) {
			System.out.println("The customer you tried to create, already exists.");
		} else {
			persons.add(c);
			System.out.println("The customer: " + "'" + c.getName() + "'" + " has been created.");
		}
	}
		
	public void addWorker(Worker w) {
			if(persons.contains(w)) {
				System.out.println("The worker you tried to create, already exists.");
			} else {
				persons.add(w);
				System.out.println("The worker: " + "'" + w.getName() + "'" + " has been created.");
			}	
	}
	
	public void findPersonIndex(int id) {
        int match = 0;

        for(Person p : persons) {
            if (id == p.getId()) {
                System.out.println("The persons index is: " + i);
                match = 1;
                i++;

            }
        }
        if (match == 0) {
            System.out.println("Something went wrong..");
        }
    }
	
	public void findPersonById(int id) {
		int match = 0;
		
		
		for(Person p : persons) {
			if(id == p.getId()) {
				if(p instanceof Customer) {
					System.out.println("***********************");
					System.out.println("Name: " + p.getName());
					System.out.println("Id: " + p.getId());
					System.out.println("Email: " + p.getEmail());
					System.out.println("Balance: " + c.getBalance());
					System.out.println("***********************");
					match = 1;
					i++;
				} else if(p instanceof Worker) {
					System.out.println("***********************");
					System.out.println("Name: " + p.getName());
					System.out.println("Worker Id: " + w.getId());
					System.out.println("Email: " + p.getEmail());
					System.out.println("***********************");
					match = 1;
					i++;
				}
			    } else if(match == 0) {
				System.out.println("Something went wrong..");
			    }
		}
	}
	
	public void removePerson(int id) {
		int match = 0;
		
		for(Person p : persons) {
			if(id == p.getId()) {
				persons.remove(p);
				System.out.println("The person: " + "'" + p.getName() + "'" + " has been removed.");
			} else if(match == 0) {
				System.out.println("Something went wrong..");
			}
		}
	}
}
