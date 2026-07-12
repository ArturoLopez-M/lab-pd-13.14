package factory;
import domain.PlanDatos;

public abstract class FabricaCreadora {
    public abstract PlanDatos crearPlanDatos(String tipo);
}