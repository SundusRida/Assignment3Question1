
public class Shape {
 String colour;
 boolean filled;
 Shape()
 {
	 colour="green";
	 filled=true;
 }
 Shape(String c,boolean f)
 {
	 colour="red";
	 filled=true;
 }
 String getcolour()
 {
	 return colour;
 }
 void setcolour(String c)
 {
	 colour=c;
 }
 boolean isFilled()
 {
	 return filled;
 }
 void setFilled(boolean f)
 {
	 filled=f;
 }
 public String toString()
 {
	 return "colour: "+colour+" "+"filled: "+filled;
 }
}
