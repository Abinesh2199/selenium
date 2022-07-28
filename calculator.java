
public class calculator {
	public int add(int a,int b) {

		int c=a+b;
		return c;
	}
		public void sub(int add,int b) {
			int c=add-b;
			System.out.println(c);
		}
		public void mutiply(int a,int b) {
			int c=a*b;
			System.out.println(c);
		}
		public void divided(float a,float b) {
			float c=a/b;
			System.out.println(c);
		}
	public static void main(String[] args) {
		calculator calc= new calculator();
		int add =calc.add(80,80);
		System.out.println(add);
		calc.sub(add,20);
		calc.mutiply(50,60);
		calc.divided(70,80);
		
	}
}
		
		
