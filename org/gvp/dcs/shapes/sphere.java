package org.gvp.dcs.shapes;

public class sphere {
    private int radius;
    
    public sphere(int r)
    {
        radius=r;
    }

    public double volume()
    {
        return (4.0/3.0)*Math.PI*radius*radius*radius;
    }
    
    public int diameter()
    {
        return 2*radius;
    }

    public double surfacearear()
    {
        return 4*Math.PI*radius*radius;
    }
}
