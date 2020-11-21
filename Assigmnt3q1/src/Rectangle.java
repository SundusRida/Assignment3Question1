
public class Rectangle extends Shape {
    double width,length;
	public Rectangle() {
		width=length=1.0;
	}
	Rectangle(double w,double l)
	{
     	width=w;
     	length=l;
	}
	Rectangle(double w,double l,String c,boolean f)
	{
		super(c,f);
		width=w;
		length=l;
		
	}
    double getWidth()
    {
    	return width;
    }
    void setWidth(double w)
    {
    	width=w;
    }
    double getLength()
    {
    	return length;
    }
    void setLength(double l)
    {
    	length=l;
    }
    double getArea()
    {
 	   return (length*width);
    }
    double getPerimeter()
    {
 	   return (2*(length+width));
    }
    public String toString()
    {
 	   return "width:"+width+" "+"length"+length+" "+super.toString();
    }
}
