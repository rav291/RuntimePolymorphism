class point2d {
    double x, y;
    point2d()
    {
        x=0.0; y=0.0;       // DEFAULT INITIALISATION
        System.out.println("I'm default constructor");
    }
    point2d(double x, double y)
    {
        this.x = x;
        this.y = y;
        System.out.println("I'm specifically created constructor");
    }
}
 class point3d extends point2d
 {
     double z;

   point3d()
   {
    super();
    z=0.0;
   }
   point3d(double x, double y, double z)
   {
       super(x, y);
       this.z = z;
   }
 }




public class Testsuper2
{
    public static void main(String args[])
    {
        point3d p = new point3d(2.0,3.0,4.0);
        point3d pp = new point3d();
    }
}

//----------* SUPER: CALLING PARENT CLASS CONSTRUCTOR.*-----------