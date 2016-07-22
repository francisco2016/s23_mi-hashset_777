
/**
 * Francisco septiembre.
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private ArrayListInt num;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        num = new ArrayListInt();
    }

    /**
     *  añade el elemento al conjunto si no estaba. Devuelve verdadero en caso de que el elemento no estuviera
     *  presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor){
        boolean estaba = false;
        if(num.contains(valor) == false){
            estaba = true;
            num.add(valor);
        }
        return estaba;
    }
    
    /**
     *  vacía el conjunto.
     */
    public void clear(){
        num.clear();
    }
}





















