package factory;
import domain.*;

public class FabricaLineaRapida extends FabricaCreadora {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan = null;

        if (tipo.equalsIgnoreCase("Academico")) {
            plan = new PlanDatosAcademico();
            plan.setNombre("Academico");
            plan.setTasa(1.0f);
        } else if (tipo.equalsIgnoreCase("Personal")) {
            plan = new PlanDatosPersonal();
            plan.setNombre("Personal");
            plan.setTasa(0.5f);
        } else if (tipo.equalsIgnoreCase("Negocio")) {
            plan = new PlanDatosNegocio();
            plan.setNombre("Negocio");
            plan.setTasa(1.5f);
        }

        return plan;
    }
}
