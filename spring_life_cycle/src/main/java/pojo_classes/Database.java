package pojo_classes;

public class Database {
	public Database() {
		System.out.println("Database class constructor is executed");
		
		}
	public void postConstruct() {
		System.out.println("Connection object is created");
	}
	
	public void preDestroy() {
		System.out.println("Connction object is destroyed");
	}
	
	}


