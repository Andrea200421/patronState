import java.util.Scanner;

public class pruebaEstado {

        public static void main (String [ ] args) {
            Alarma alarma = new Alarma();
            Activa activa = new Activa();
            Mantenimiento mantenimiento = new Mantenimiento();
            int opcion = 0;
            Scanner sc = new Scanner(System.in);

            do{
                menu();
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        alarma.setEstado(activa);
                        break;
                    case 2:
                        alarma.setEstado(mantenimiento);
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Opción errada");
                }
                alarma.ejecutarAccion();
            }while (opcion!=0);





        }
    public static void menu() {
            StringBuffer menu = new StringBuffer();
            menu.append("Seleccione el estado de la alarma:\n");
            menu.append("1) ACTIVA.  2)MANTENIMIENTO. 0)SALIR");
            System.out.println(menu.toString());
    }
}
