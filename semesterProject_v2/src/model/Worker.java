package model;

public class Worker extends Person {
	private boolean manager;
	private String department;
	private int workerId;
	
	public Worker(int workerId, String name, String email, boolean manager, String department) {
		super(workerId, name, email);
		this.setLeader(manager);
		this.setDepartment(department);
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isLeader() {
		return manager;
	}
	public void setLeader(boolean manager) {
		this.manager = manager;
	}
}
