package factory;
import domain.*;

public class FabricaClaro extends FabricaCreadora {
    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan = null;

        if (tipo.equalsIgnoreCase("Academico")) {
            plan = new PlanDatosAcademico();
            plan.setNombre("Academico");
            plan.setTasa(0.6f);
        } else if (tipo.equalsIgnoreCase("Personal")) {
            plan = new PlanDatosPersonal();
            plan.setNombre("Personal");
            plan.setTasa(1.6f);
        } else if (tipo.equalsIgnoreCase("Negocio")) {
            plan = new PlanDatosNegocio();
            plan.setNombre("Negocio");
            plan.setTasa(1.2f);
        }

        return plan;
    }
}