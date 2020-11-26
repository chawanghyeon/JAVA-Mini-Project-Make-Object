package step10_API;

import java.util.ArrayList;

import model.domain.Car;
import model.domain.Customer;
import model.domain.Food;

class A{
	int no = 10;
	Customer c = Customer.builder().car(new Car("±×·£Àú", 77)).name("À±Çý").food(new Food("¶ó¸é")).build();
}
class B{
	A a = new A();
	Car car = new Car("¼Ò³ªÅ¸", 77);
	Food b = new Food("¸¶¶óÅÁ");
}
class C{
	B b = new B();
	Customer c = Customer.builder().car(new Car("±×·£Àú", 77)).name("À±Çý").food(new Food("¶ó¸é")).build();
}
public class Practice {

	public static void main(String[] args) {
		ArrayList<C> all = new ArrayList<>();
		all.add(new C());
	}

}
