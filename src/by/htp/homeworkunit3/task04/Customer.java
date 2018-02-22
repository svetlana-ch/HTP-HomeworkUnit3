package by.htp.homeworkunit3.task04;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private String surName;
	private String address;
	private int numberOfCreditCard;
	private int numberOfBankAccount;
	
	public void show() {
		System.out.println("Покупатель --> \nid: " + this.id + "\nФамилия: " + this.surName + "\nИмя: " + this.firstName + "\nОтчество: " + this.lastName + "\nАдрес: " + this.address + "\nНомер кредитной карточки: " + this.numberOfCreditCard + "\nНомер банковского счета: " + this.numberOfBankAccount);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumberOfCreditCard() {
		return numberOfCreditCard;
	}
	public void setNumberOfCreditCard(int numberOfCreditCard) {
		this.numberOfCreditCard = numberOfCreditCard;
	}
	public int getNumberOfBankAccount() {
		return numberOfBankAccount;
	}
	public void setNumberOfBankAccount(int numberOfBankAccount) {
		this.numberOfBankAccount = numberOfBankAccount;
	}
	

}
