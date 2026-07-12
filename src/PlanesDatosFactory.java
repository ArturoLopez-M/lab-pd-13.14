import factory.*;
import domain.PlanDatos;

public class PlanesDatosFactory {

    public static void calcularConsumo(FabricaCreadora fabrica, String tipo, int megas) {
        PlanDatos plan = fabrica.crearPlanDatos(tipo);

        if (plan != null) {
            float costoTotal = plan.calcularPago(megas);

            // Usamos un formato limpio, con espacios fijos sencillos para que las tasas y pagos queden en columnas
            System.out.printf("   • Plan: %-11s Tasa: %-5.2f Pago: S/. %-8.2f por %d megas%n",
                    plan.toString(),
                    plan.getTasa(),
                    costoTotal,
                    megas
            );
        } else {
            System.out.println("   [!] Tipo de plan no reconocido.");
        }
    }

    public static void main(String[] args) {
        FabricaCreadora lineaRapida = new FabricaLineaRapida();
        FabricaCreadora claro = new FabricaClaro();
        FabricaCreadora movistar = new FabricaMovistar();

        // 1. SALIDA LÍNEA RÁPIDA
        System.out.println("--- BIENVENIDOS A LINEA RAPIDA ---");
        calcularConsumo(lineaRapida, "Personal", 1000);
        calcularConsumo(lineaRapida, "Negocio", 1000);
        calcularConsumo(lineaRapida, "Academico", 1000);
        System.out.println();

        // 2. SALIDA CLARO
        System.out.println("--- BIENVENIDOS A CLARO ---");
        calcularConsumo(claro, "Personal", 1000);
        calcularConsumo(claro, "Negocio", 1000);
        calcularConsumo(claro, "Academico", 1000);
        System.out.println();

        // 3. SALIDA MOVISTAR
        System.out.println("--- BIENVENIDOS A MOVISTAR ---");
        calcularConsumo(movistar, "Personal", 1000);
        calcularConsumo(movistar, "Negocio", 1000);
        calcularConsumo(movistar, "Academico", 1000);
    }
}