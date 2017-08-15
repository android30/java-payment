
public class Payment {

	public static void main(String[] args) {
		//create a person object
		
		Person person = new Person();
		
		person.setFirstName("");
		person.setLastName("");
		person.setHourlyRate(10);
		
		//Print the state of the person object
		
		System.out.println(person.toString());
		//get print the weekly payment
		System.out.println(person.getPayment(40));

	}

}
