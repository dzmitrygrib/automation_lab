package People;

import Interfaces.ShowAge;
import Interfaces.ShowName;

public class Human implements ShowAge, ShowName {
	String name;
	String lastname;
	int age;
	String sex;
	
	public Human() {
		System.out.println ("Hello from human constructor 1");
	}
		public Human (String name, String lastname, int age, String sex) {
		System.out.println ("Hello from human constructor 2");
	}
		@Override
		public void showName() {
			System.out.println ("Person Name "+this.name);
			
		}
		@Override
		public void showAge() {
			System.out.println ("Person age "+this.age);
			
		}
}
