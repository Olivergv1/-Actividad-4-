class Bicicleta implements ImpactoEcologico {
    private String nombre;
    private String modelo;
    private String tipo;
    private String color;
    private int anio;
    private boolean esElectrica;
    
    public Bicicleta(String nombre, String modelo, String tipo, String color, int anio, boolean esElectrica) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.anio = anio;
        this.esElectrica = esElectrica;
    }

    public double obtenerImpactoEcologico() {

        if (esElectrica) {
            // El impacto ecológico de una bicicleta eléctrica durante toda su vida útil es de 300 kg de CO2
            return 300.0;
            
        } else {
            // El impacto ecológico de una bicicleta no eléctrica es cero
            return 0.0;
        }
    }

    public String toString() {
        String resultado = "Bicicleta:\n";
        resultado += "  Nombre: " + nombre + "\n";   //use \n" para la separacion y que se muestren en orden en pantalla, con la ayuda de +=
        resultado += "  Modelo: " + modelo + "\n";
        resultado += "  Tipo: " + tipo + "\n";
        resultado += "  Color: " + color + "\n";
        resultado += "  Año: " + anio;

        return resultado;
    }
    
    public String toStringResultado() {
        double impactoEcologico = obtenerImpactoEcologico();
        String resultado = toString();
        resultado += "\n  Impacto ecológico (durante toda la vida útil): " + impactoEcologico + " Kg de CO2";
        return resultado;
    }
}
