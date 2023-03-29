public class MultiCola {
    private int n;
    private ColaSimple v[]=new ColaSimple[100];
    
    MultiCola()
    {
        for(int i=1;i<100;i++)
            v[i]=new ColaSimple();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    boolean esvacia (int i)
    {
        if (v [i].esvacia ())
            return true;
        return false;
    }


    boolean esllena (int i)
    {
        if (v [i].esllena ())
            return true;
        return false;
    }


    void adicionar (int i, objeto elem)
    {
        if (!v [i].esllena ())
            v [i].adicionar (elem);
        else
            System.out.print ("Cola " + i + " esta llena");
    }


    objeto eliminar (int i)
    {
        objeto e = null;
        if (!v [i].esvacia ())
            e = v [i].eliminar ();
        else
            System.out.print ("Cola " + i + " esta vacia");
        return e;
    }

    void mostrar(int i)
    {
        v[i].mostrar();
    }

    void mostrar ()
    {
        int i;
        for (i = 1 ; i <= getN() ; i++)
        {
            System.out.println ("Datos Cola Simple " + i + " ");
            v [i].mostrar ();
        }
    }

    int nroElem (int i)
    {
        return (v [i].nroelem ());
    }
    void vaciar(int i, ColaSimple Z)
    {
        v[i].vaciar(Z);
    }
    void vaciar(int i, int j)
    {
        v[i].vaciar(v[j]);
    }
}
