package reflect;

public class Person implements MyInterface{
	
	private int age;
	private String name;
	private int id;
	
	public Person() {
	}

	
	public Person( int id) {
		this.id = id;
	}

	
	public Person(int age, String name, int id) {
		this.age = age;
		this.name = name;
		this.id = id;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	


	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	
}
