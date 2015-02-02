package datamodel;

public class Patient {

	private String name;
	private int id;
	private int age;
	
	public Patient(int identification, String patientName, int patientAge)
	{
		id = identification;
		name = patientName;
		age = patientAge;
	}
	
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public void printInfo()
	{
		System.out.println("Patient ID: "+ id +"\nPatient Name: "+ name +"\nAge: "+ age);
	}
}
