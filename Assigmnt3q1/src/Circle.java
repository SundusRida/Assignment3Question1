
public class Circle extends Shape {

	double radius;
	public Circle() {
       radius=1.0;
	}
   Circle(double r)
   {
	   radius=r;
   }
   Circle(double r,String c,boolean f)
   {
	   super(c,f);
	   radius=r;
	  
   }
   double getRadius()
   {
	   return radius;
   }
   void setRadius(double r)
   {
	   radius=r;
   }
   double getArea()
   {
	   return (3.14*radius*radius);
   }
   double getPerimeter()
   {
	   return (2*3.14*radius);
   }
   public String toString()
   {
	   return "radius"+radius+" "+super.toString();
   }
}
