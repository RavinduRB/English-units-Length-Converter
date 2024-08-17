import java.util.*;
class Example{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		int a,b,c,d,e,f,g,h;
		System.out.println("           English units Length Converter ");
		System.out.println("          ================================");
		System.out.println();
		System.out.println();
		System.out.print("Enter Centimeters : ");
		a=input.nextInt();
		b=a/4/12/3/2/12/10/8;
		System.out.println("mile    - "+b);
		c=(a/4/12/3/2/12/10)-8;
		System.out.println("Furlong - "+c);
		d=(a/4/12/3/2/12)-140;
		System.out.println("Chain   - "+d);
		e=(a/4/12/3/2)-1728;
		System.out.println("Fathom  - "+e);
		f=(a/4/12/3)-3472;
		System.out.println("yard    - "+f);
		g=(a/4/12)-10416;
		System.out.println("foot    - "+g);
		h=(a/4)-124992;
		System.out.println("inch    - "+h);	

	}
}
