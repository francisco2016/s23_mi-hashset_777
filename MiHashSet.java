
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

    /**
     * devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento){
        return num.contains(elemento);
    }

    /**
     *  devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty(){
        return num.isEmpty();
    }

    /**
     * elimina del conjunto el elemento dado. Si no existiera devuelve falso; si existía en el conjunto devuelve verdadero.
     */
    public boolean remove(int elemento){
        boolean existe = false;
        int sol = num.indexOf(elemento);
        if(num.indexOf(elemento) != -1){
            existe = true;
            num.remove(sol);
        }
        return existe;
    }

    /**
     * devuelve el número de elementos del conjunto.
     */
    public int size(){
        return num.size();
    }

    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     */
    public String toString(){
        String cadena = "";
        if(num.size() > 0){
            for(int i = 0; i < num.size(); i ++){
                if(num.size() > 1){
                    cadena += "[" +num.get(i)+ "], ";
                }
                else{
                    cadena += "[" +num.get(i)+ "]";
                }
            }
        }
        else{
            System.out.println("Conjunto sin elementos." );
        }
        return cadena;
    } 
    
    /**
     * devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto){
        boolean parametroIgual = true;
        if(otroConjunto.size() == num.size()){
            int index = 0;
            while(index < num.size() && parametroIgual){
                if( !(otroConjunto.contains(num.get(index))) ){
                    parametroIgual = false;
                }
            }
            index ++;
        }
        else{
            parametroIgual = false;
        }
        return parametroIgual;
    }
}




















