/**
 * 
 */
package creational.builder;

/**
 * @author utkarsh
 *
 */
public class PersonalInformation {

	// Mandatory values
	private String firstName;
	private String lastName;

	// Optional Values
	private String city;
	private String state;
	private int pincode;
	private String apartmentName;
	private String apartmentNumber;

	private PersonalInformation(PIBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.city = builder.city;
		this.state = builder.state;
		this.pincode = builder.pincode;
		this.apartmentName = builder.apartmentName;
		this.apartmentNumber = builder.apartmentNumber;
	}

	public static class PIBuilder {

		private String firstName;
		private String lastName;

		// Optional Values
		private String city;
		private String state;
		private int pincode;
		private String apartmentName;
		private String apartmentNumber;

		public PIBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PIBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public PIBuilder setState(String state) {
			this.state = state;
			return this;
		}

		public PIBuilder setPincode(int pincode) {
			this.pincode = pincode;
			return this;
		}

		public PIBuilder setApartmentName(String apartmentName) {
			this.apartmentName = apartmentName;
			return this;
		}

		public PIBuilder setApartmentNumber(String apartmentNumber) {
			this.apartmentNumber = apartmentNumber;
			return this;
		}

		public PersonalInformation build() {
			return new PersonalInformation(this);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getPincode() {
		return pincode;
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	@Override
	public String toString() {
		return "PersonalInformation [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", apartmentName=" + apartmentName + ", apartmentNumber="
				+ apartmentNumber + "]";
	}


}
