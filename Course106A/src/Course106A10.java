
public class Course106A10 {
	
	///////////////////////////////// ACM Library ///////////////////////
	// graphicsprogram automatically creates GCanvas object, that fills entire
	// background window.
	// when add( method was called, graphicsprogram was forwarding it to GCanvas
	
	/*
	 * methods in GCanvas and GraphicsProgram
	 * add(Object)
	 * getHeight()
	 * getWidth()
	 * remove(Object)
	 * getElementAt(x,y) x,y points to pixel location in the canvas and 
	 * 	the Object front in z-axis is returned
	 */
	
	//////////////////////////////// Interface /////////////////////////////
	/*
	 * Interface: is a set of methods. And set of classes that have same set of methods
	 * difference is sometimes we want some set of classes to share a same set of methods
	 * without being in the inheritance hierarchy
	 */
	
	//Interface: certain set of classes that have implemented all the methods from the interface
	//	GFillable (GArc, GRect, GOval)
	//		methods: setFilled(flag)	setFillColor(color)
	//	GReziable (GImage,GOval)
	//		method: setSize(size)
	
	//Inheritance: GObject extended by (GArc, GRect, GOval, GImage)
}
