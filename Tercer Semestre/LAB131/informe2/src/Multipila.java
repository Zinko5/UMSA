public class Multipila {
    private int np;  //numero de pilas
    private Pila v[]=new Pila[100];
    
    Multipila()
    {
        for(int i=1;i<100;i++) {
            v[i]=new Pila();
        }
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }
    int nroelem(int i)
    {
        return (v[i].nroelem());
    }
    boolean esvacia (int i)
    {
        if (v[i].esvacia ()){
            return true;
        }
        else {
            return false;
        }
    }
    boolean esllena (int i)
    {
        if (v[i].esllena ()){
            return true;
        }
        else {
            return false;
        }
    }
    void adicionar (int i, Libro L)
    {
        if (!v [i].esllena ())
            v [i].adicionar (L);
        else
            System.out.print ("Pila " + i + " esta llena");
    }
    Libro eliminar (int i)
    {
        Libro e = null;
        if (!v [i].esvacia ())
            e = v [i].eliminar ();
        else
            System.out.print ("Pila " + i + " esta vacia");
        return e;
    }
    void mostrar(int i)
    {
        v[i].mostrar();
    }
    void mostrar ()
    {
        for (int i = 1 ; i <= np ; i++)
        {
            System.out.println("\nPila " + i + " ");
            v [i].mostrar ();
        }
    }
    void vaciar(int i, Pila a )
    {
        while(!a.esvacia())
                adicionar(i,a.eliminar());
    }
    void vaciar(int i, int j)
    {
        v[i].vaciar(v[j]);
    }
}