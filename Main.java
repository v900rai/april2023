package april;

import javax.xml.crypto.dsig.Manifest;

public class Main 
{
	public void display() {
	}
	public void disp() {
	}
}
class InterfaceDemo implements Manifestn{
	public void display(){
		System.out.println("First implementation");
	}
	public void disp(){
		System.out.println("Second implementation");
	}
	public static void main(String arg[]){
		InterfaceDemo obj = new InterfaceDemo();
		obj. display();
		obj.disp();
	}

}
