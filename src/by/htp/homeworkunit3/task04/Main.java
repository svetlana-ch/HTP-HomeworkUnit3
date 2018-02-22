package by.htp.homeworkunit3.task04;

public class Main {

	public static void main(String[] args) {
		
		Student student2018Math = new Student();
		Student student2018Hhist = new Student();
		Customer customerLen = new Customer();
		Customer customerVol = new Customer();
		
		customerLen.setId(3);
		customerLen.setLastName("Иванович");
		customerLen.setSurName("Новосельцев");
		customerLen.setFirstName("Тимур");
		customerLen.setAddress("Ленина");
		
		customerLen.show();
		
		
	}

}
