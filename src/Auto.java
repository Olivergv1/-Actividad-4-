class Auto implements ImpactoEcologico {
    private String nombre;
    private String motor;
    private int anio;
    private String color;
    private double emisionesCO2;

    public Auto(String nombre, String motor, int anio, String color, double emisionesCO2) {
        this.nombre = nombre;
        this.motor = motor;
        this.anio = anio;
        this.color = color;
        this.emisionesCO2 = emisionesCO2;
    }

    public double obtenerImpactoEcologico() {
        // Cálculo del impacto ecológico de un auto que recorre 100 km
        
        double gramosCO2 = emisionesCO2 * 100;      // Multiplicamos la cantidad de gramos por los 100 km recorridos
        
        double kgCO2 = gramosCO2 / 1000;        // Convertimos los gramos resultantes a kilogramos 

        return kgCO2;
    }

    public String toString() {
        String resultado = "Auto:\n";
        resultado += "  Nombre: " + nombre + "\n";      //use \n" para la separacion y que se muestren en orden en pantalla, con la ayuda de +=
        resultado += "  Motor: " + motor + "\n";
        resultado += "  Año: " + anio + "\n";
        resultado += "  Color: " + color;

        return resultado;
    }
    
    public String toStringResultado() {
        double kgCO2 = obtenerImpactoEcologico();
        String resultado = toString();
        resultado += "\n  Impacto ecológico cada 100 km: " + kgCO2 + " Kg de CO2.";
        return resultado;
    }
}
