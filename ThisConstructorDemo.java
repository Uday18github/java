class A{
	A(){
		System.out.println("Inside default constructor ");
	}
	A(int x){
		this();
		System.out.println("Parameterized constructor invoked ");
		System.out.println("X value is : "+x);
	}
}
class ThisConstructorDemo{
	public static void main(String args[]){
		A a = new A(202);
}}