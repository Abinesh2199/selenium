package week3.day3;

public class Employe {
	public void employename(String name) {
		System.out.println(name); }
	public void employeid(int id) {
		System.out.println(id); }
	public void employeaddress(String address) {
		System.out.println(address); }
	public void employesalary(double salary) {
		System.out.println(salary); }
	public void employemobilenumber(long mobilenumber) {
		System.out.println(mobilenumber); }

public static void main(String[] args) {
	Employe emp=new Employe();
	emp.employename("abinesh");
	emp.employeid(22031);
	emp.employeaddress("tambaram");
	emp.employesalary(20000);
	emp.employemobilenumber(9629540570L);

}
	
}
