import java.io.*;
class RectangleCalc{
	int l = 5;
	int b = 10;
	int areaRect(){
		int a = l*b;
		return a;
		}
	int periRect(){
		int p=2*(l+b);
		return p;
		}
	}
class RectangleDemo{
	public static void main(String args[]){
		Rectangle re = new RectangleCalc();
		int area = re.areaRect();
		int perimeter = re.periRect();
		System.out.println("area of rectangle"+area);
		System.out.println("perimeter of rectangle is"+perimeter);
		}
	}