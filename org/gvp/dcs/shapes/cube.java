package org.gvp.dcs.shapes;

public class cube {
    int a;

    public cube(int edge)
    {
            a=edge;
    }

    public int volum()
    {
        return a*a*a;
    }
    public int surfacearea()
    {
        return 6*a*a;
    }
}
