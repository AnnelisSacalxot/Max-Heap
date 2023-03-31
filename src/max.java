public class max {

    private int[] monton;
    private int capacidad;
    private int posicion;

    //constructor
    public max(){
        posicion = 1;
        capacidad = 15;
        monton = new int[capacidad];
    }

    //creando metodo para evaluar las posiciones de maximo

    public void insertar(int valor){
        if (posicion == capacidad){

        } else{
            monton[posicion++] = valor;

            //ordenacion
            int hijo = posicion-1;
            int padre = hijo/2;

            while (monton[padre]  < monton[hijo] && padre > 0){
                int temporal = monton[padre];
                monton[padre] = monton[hijo];
                monton[hijo] = temporal;

                hijo = padre;
                padre = hijo/2;
            }
        }
    }

    public void imprimir(){
        for (int i = 0; i < posicion; i++) {
            System.out.println(monton[i] + " ");
        }
    }
}
