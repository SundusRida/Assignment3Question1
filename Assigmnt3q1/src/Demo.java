
public class Demo {

	public static void main(String[] args) {
		double side =40.2;
		Square s=new Square(11.2,11.2,"red",true);
		s.toString();
		System.out.println(s);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		System.out.println(s.length);
		System.out.println(s.colour);
		System.out.println(s.filled);
	    Circle c=new Circle(22.2);
		System.out.println(c.getArea());
		s.setWidth(side);
	    s.setLength(side);
		System.out.println(s.getArea());
		System.out.println(s.toString());
		System.out.println(c.toString());
	}

}
