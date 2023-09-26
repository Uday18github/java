import java.io.*;
interface Language{
	public void getName(String name);
}
class ProgrammingLanguage implements Language{
	public void getName(String name){
		System.out.println("My favourite programming language is "+name);
	}
}
class InterfaceDemo{
	public static void main(String args[]){	
		ProgrammingLanguage pl=new ProgrammingLanguage();
		pl.getName("Java");
	}
}

