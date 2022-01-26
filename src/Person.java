import java.time.LocalDate;
import java.util.List;

public class Person {

	public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
		return 0;
        // ...
    }

    public void printPerson() {
        // ...
    }
    
    public static void printPersonsOlderThan(List<Person> roaster,int age) {
    	
    	for(Person p : roaster) {
    		if(p.getAge() >= age) {
    			p.printPerson();
    		}
    	}
    }
}
