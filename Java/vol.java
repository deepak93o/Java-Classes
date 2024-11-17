class Figure 
{
    double dimension1;
    double dimension2;
    Figure (double dim1, double dim2)

    {
        dimension1 = dim1;
        dimension2 = dim2;
    }
    double area()
    {
        System.out.println("Area is not defined.");
        return 0;
    }
}

class Rectangle extends Figure
{
    Rectangle(double dim1, double  dim2)

    {
        super (dim1,dim2);
    }

    double area()
    {
        System.out.println("Area of Rectangle.");
        return dimension1 * dimension2;
    }
}

class Areas
{
    public static void main(String args[])
    {
        Figure fig = new Figure(5,5);
        Rectangle rect = new Rectangle(4,2);

        Figure ref;

        ref = rect;
        System.err.println("Area is " + ref.area());

        ref = fig;
        System.out.println("Area is" + area);
    }
}
