package by.htp.homeworkunit3.task04;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String surName;
	private String birthday;
	private String address;
	private int phone;
	private String faculty;
	private int course;

	
	
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


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public int getCourse() {
		return course;
	}


	public void setCourse(int course) {
		this.course = course;
	}
	

	public void show() {
		System.out.println("Студент --> \nid: " + this.id + "\nФамилия: " + this.surName + "\nИмя: " + this.firstName + "\nОтчество: " + this.lastName + "День рождения: " + this.birthday + "\nАдрес: " + this.address + "\nТелефон: " + this.phone + "\nФакультет: " + this.faculty + "\nКурс: " + this.course);
	}


}
	