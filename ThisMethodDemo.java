class A{
	void m(){
		System.out.println("Inside method m ");
	}
	void n(){
		System.out.println("Inside method n ");
		this.m();
		
		}
	}
class ThisMethodDemo{
	public static void main(String args[]){
		A a = new A();
		a.n();
	}
}