package domain;

public abstract class PlanDatos {
    private String nombre;
    private float tasa;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public float getTasa() { return tasa; }
    public void setTasa(float tasa) { this.tasa = tasa; }

    public float calcularPago(int datosConsumidos) {
        return datosConsumidos * this.tasa;
    }

    @Override
    public String toString() {
        // Formateado con un formato limpio para usar en la concatenación de la respuesta
        return nombre;
    }
}
