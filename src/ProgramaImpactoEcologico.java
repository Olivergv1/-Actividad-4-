import java.util.ArrayList;

interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

public class ProgramaImpactoEcologico {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetos = new ArrayList<ImpactoEcologico>();
        
        // Creamos los objetos de cada clase
        
        Auto auto = new Auto("Toyota Prius", "Hibrido", 2019, "Rojo", 75);
        Edificio edificio = new Edificio("Mutualista Pichincha", "Empresa", 9, "Blanco",  170);
        Bicicleta bicicleta = new Bicicleta("Rockrider", "E-ST 500", "Electrica", "Negra", 2022, true);
        
        // Agregamos los Objetos al ArrayList
        
        objetos.add(auto);
        objetos.add(edificio);
        objetos.add(bicicleta);
        
        // Mostramos los resultados
        
        for (ImpactoEcologico objeto : objetos) {
            if (objeto instanceof Auto) {
                Auto autoObjeto = (Auto) objeto;
                System.out.println(autoObjeto.toStringResultado());
            } else if (objeto instanceof Edificio) {
                Edificio edificioObjeto = (Edificio) objeto;
                System.out.println(edificioObjeto.toStringResultado());
            } else if (objeto instanceof Bicicleta) {
                Bicicleta bicicletaObjeto = (Bicicleta) objeto;
                System.out.println(bicicletaObjeto.toStringResultado());
            }
        }
    }
}
