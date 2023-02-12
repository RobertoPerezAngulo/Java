package varArgs;
public class Main {
    public static void main(String[] args) {
        String nombres[] = {"Roberto","Ines","Vianney","Jazmin","Herme"};
        varARGS(nombres);
    }

    /* Son métodos que permiten variar el número de parámetros que
    reciben permitiendo trabajar de una forma más cómoda.
    Vamos a ver un ejemplo usando los conceptos de Persona
    y Factura y relacionandolos,
    una Persona tiene varias Facturas.*/
    private static void varARGS(String ... nombres)
    {
        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }

}
