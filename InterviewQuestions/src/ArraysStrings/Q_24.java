package ArraysStrings;

import java.util.ArrayList;
import java.util.HashMap;

class Employee{
	int my_id;
	int Manager_id;
	
	public Employee(int my_id , int Manager_id){
		this.my_id=my_id;
		this.Manager_id=Manager_id;
	}

	@Override
	public String toString() {
		return ""+my_id;
	}
	
	
}
class Company{
	HashMap<Integer,ArrayList<Employee>> hash = new HashMap<>();
	
	public Company(ArrayList<Employee> list){
		for (Employee e : list){
			if(hash.get(e.Manager_id)==null){
				hash.put(e.Manager_id, new ArrayList<Employee>());
				hash.get(e.Manager_id).add(e);
			}else{
				hash.get(e.Manager_id).add(e);
			}
		}
	}
	public ArrayList<Employee> getAllWorkers(int id){
		ArrayList<Employee> a = hash.get(id);
		System.out.println(a);
		return a;

	}
	public void getAllWorkersHirarchy(int id){
		
		ArrayList<Employee> a = hash.get(id);
		if(a==null)
			return;
		System.out.println(a);
		for (int i = 0; i < a.size(); i++) {
			getAllWorkersHirarchy(a.get(i).my_id);
		}
	}
	
}
public class Q_24 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 0);
		Employee e2 = new Employee(2, 1);
		Employee e3 = new Employee(3, 1);
		Employee e4 = new Employee(4, 1);
		Employee e5 = new Employee(5, 1);
		Employee e6 = new Employee(6, 3);
		Employee e7 = new Employee(7, 3);

		ArrayList<Employee> a = new ArrayList<>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		a.add(e6);
		a.add(e7);

		Company c= new Company(a);
		c.getAllWorkersHirarchy(1);
		
	}
}














