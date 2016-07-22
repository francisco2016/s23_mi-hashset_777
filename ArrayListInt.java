/**
 * El objetivo es que codifiques esta clase de forma que funcione como un ArrayList que contenga números enteros. 
 * Para su implementación se debe usar obligatoriamente un array tradicional que no desperdicie espacio y no se puede usar
 * en ningún caso la clase Integer. 
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] numeros;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        numeros = new int[0];
    }

    /**
     * añade un elemento a la colección al final de la misma.----------------------------------------------- 0078
     */
    public void add(int elemento){
        int[] numeros2 = numeros;//VL de tipo Array que apunta al Array numeros.
        numeros = new int[numeros2.length +1];//numeros pasa a apuntar a numeros2 con una posición añadida.
        //bucle para iterar tantas veces como como elementos tiene numeros2.
        for(int i = 0; i < numeros2.length; i ++){
            numeros[i] = numeros2[i]; //pasamos los elementos de numeros2 a numeros.
        }
        numeros[numeros2.length] = elemento;
    }

    /**
     *añade un elemento a la colección en la posición especificada por el parámetro index. Si el valor de index no es válido, 
     *entonces no hace nada. Los elementos a continuación del añadido se desplazan una posición.
     */
    public void add(int index, int elemento){
        if(index <= numeros.length && index >= 0){
            int[] local = numeros; //ahora mismo la VL local es un Arrays con un tamaño 0.
            numeros = new int[local.length + 1]; // numeros es un nuevo Arrays con el tamaño del Arrays local + 1 
            for(int i = 0; i < local.length; i ++){
                if(i < index){
                    numeros[i] = local[i];
                }
                else{
                    numeros[i + 1] = local[i];
                }
            }  
            numeros[index] = elemento;
        }
    }

    /**
     * vacía la colección
     */
    public void clear(){
        numeros = new int[0];
    }

    /**
     * devuelve true si la colección contiene ese elemento, false en cualquier otro caso
     */
    public boolean contains(int elemento){
        boolean ele = false;
        for(int i = 0; i < numeros.length; i ++){
            if(numeros[i] == elemento){
                ele = true;
            }
        }
        return ele;
    }

    /**
     * devuelve el elemento existente en la posición indicada. Si el valor de index no es válido, entonces devuelve -1.
     */
    public int get(int index){
        int element = -1;
        if(index < numeros.length && index >= 0){
            element = numeros[index];                
        }
        return element;
    }

    /**
     * reemplaza el elemento en la posición index con el valor de element. Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element){
        if(index < numeros.length && index >= 0){
            numeros[index] = element;
        }
    }

    /**
     *devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso de que la colección
     *no contenga el elemento especificado.
     */
    public int indexOf(int elemento){
        int indice = -1;
        for(int i = 0; i < numeros.length; i ++){
            if(numeros[i] == elemento){
                indice = i;
            }
        }
        return indice;
    }

    /**
     * devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty(){
        return numeros.length == 0;//en este return java devuelve por defecto true si la colección está vacía.
    }

    /**
     * elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. 
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index){
        int valor = -1; //variable a devolver.
        if(index < numeros.length && index >= 0){
            int[] copia = numeros;
            numeros = new int[copia.length -1];
            for(int i = 0; i < index; i ++){
                numeros[i] = copia[i];
            }
            for(int i = index; i < numeros.length; i ++){
                numeros[i] = copia[i +1];
            }
            valor = copia[index];
        }
        return valor;
    }

    /**
     * devuelve el número de elementos de la colección.
     */
    public int size(){
        //         int cont = 0;
        //         for(int i = 0; i < numeros.length; i ++){
        //             cont += numeros[i]; 
        //         }
        //         return cont;
        return numeros.length;
    }

}

