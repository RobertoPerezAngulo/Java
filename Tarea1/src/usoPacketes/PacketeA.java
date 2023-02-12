package usoPacketes;
import usoPacketes.Subpackete.PacketeB;

public class PacketeA {

    public static void main(String[] args) {

        PacketeB obB = new PacketeB();
        obB.setNombre("Roberto");
        System.out.printf("Nombre del la persona" + obB.getNombre());
    }
}
