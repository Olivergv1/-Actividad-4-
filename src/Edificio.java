class Edificio implements ImpactoEcologico {
    private String nombre;
    private String tipo;
    private int pisos;
    private String color;
    private double consumoEnergia;

    public Edificio(String nombre, String tipo, int pisos, String color, double consumoEnergia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.pisos = pisos;
        this.color = color;
        this.consumoEnergia = consumoEnergia;
    }

    public double obtenerImpactoEcologico() {
        
        // Cálculo del impacto ecológico anual de un edificio promedio
        
        double toneladasCO2 = consumoEnergia * 0.00039; // Multiplicamos los kWh por 0.00039 para obtener las toneladas de CO2 emitidas por año
        
        double kgCO2 = toneladasCO2 * 1000; //convertimos las toneladas a kilogramos
        
        return kgCO2;
    }

    public String toString() {
        String resultado = "Edificio:\n";
        resultado += "  Nombre: " + nombre + "\n";
        resultado += "  Tipo: " + tipo + "\n";            //use \n" para la separacion y que se muestren en orden en pantalla, con la ayuda de +=
        resultado += "  Pisos: " + pisos + "\n";
        resultado += "  Color: " + color;

        return resultado;
    }
    
    public String toStringResultado() {
        double kgCO2 = obtenerImpactoEcologico();
        String resultado = toString();
        resultado += "\n  Impacto ecológico anual: " + kgCO2 + " Kg de CO2.";
        return resultado;
    }
}
