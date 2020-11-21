
public class Square extends Rectangle {
  
	public Square() {
		
	}

	public Square(double w, double l) {
	  super(w, l);
		
	}

	public Square(double w, double l, String c, boolean f) {
		super(w, l, c, f);
	
	}
	double getSide()
	{
		return length;
	}
	void setSide(double s)
	{
		length=s;
	}
  void setLength(double s)
  {
	  length=s;
  }
  void setWidth(double s)
  {
	  width=s;
  }
  double getArea()
  {
	  return (length*length);
  }
  double getPerimeter()
  {
	  return (4*length);
  }
  public String toString()
  {
	  return "length:"+length+" "+super.toString();
  }
}
