package org.shapes;
public class circle{
double radius;
public circle(double radius){
this.radius=radius;
}
public double getArea(){
return Math.PI*radius*radius;
}
public double getPerimeter(){
return 2*Math.PI*radius;
}
}

