package Simple;

public class Cat {
	public void makesound() {
		System.out.println("the cat sounds like meow");
	}


public static void main (String args[])
{
	Animal obj =new Animal();
    Cat obj1 =new Cat();
    obj.makesound();
    obj1.makesound();
}
}