/* This program contains code a person who receives payment */
public class Person {
        //This a variable declaration
	
	  private String firstName;
	  private String lastName;
	  private double hourlyRate;
	/**
	 * The first conctructor below is a simple constructor(default) to store the things we wld use in the field
	 */
	public Person() {
	       this. firstName = "Tassa";
	       this. lastName = "Ulrich";
	       this. hourlyRate = 10;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param hourlyRate
	 */
	public Person(String firstName, String lastName, double hourlyRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", hourlyRate=" + hourlyRate + "]";
	}
	   //Here we return the ans
	  
	  public double getPayment(int hours) {
		return this.hourlyRate*hours;
		  
	  }
    }
