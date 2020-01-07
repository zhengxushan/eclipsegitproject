package reflect;

public class Test {
	public static void main(String[] args) {
		
		try {
			Class<?> claszz = Class.forName("reflect.Person");
			System.out.println(claszz);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class<?> clas = Person.class;
		System.out.println(clas);
		
		Person person = new Person();
		Class<?> clasa = person.getClass();
		System.out.println(clasa);
	}
}
