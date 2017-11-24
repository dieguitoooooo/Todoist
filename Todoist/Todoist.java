import java.util.ArrayList;
/**
 **
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer.
 */
public class Todoist
{
    // almacena muestra de tareas.
    private ArrayList<String> tareas;

    /**
     * Constructor de la clase Todoist. Crea un gestor con las 3 tareas vacías.
     */
    public Todoist()
    {
        // initialise instance variables
        tareas = new ArrayList<String>();
    }

    //inserta una tarea
    public void addTarea(String nombreTarea)
    {
        tareas.add(nombreTarea);
    }

    /**
     * Muestra por pantalla todas las tareas existentes.
     */
    public void mostrarTareas()
    {
        System.out.println("Tareas existentes");
        System.out.println(tareas);
    }

    /**
     * Devuelve el numero de tareas pendientes.
     */
    public int getNumeroTarea()
    {
        return tareas.size();
    }

    public void mostrarNumeroTareasPendientes()
    {
        System.out.println("Tienes estas tareas pendientes: " + tareas.size());
    }

    /**
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando 0). Devuelve true si la tarea existe y se elimina.
     * false en caso de lo contrario.
     */
    public boolean eliminarTarea(int posicionTarea)
    {
        boolean  valorADevolver = false;
        if(esValidoElIndice(posicionTarea))
        {
            tareas.remove(posicionTarea);
            valorADevolver = false;
        }

        return valorADevolver;
    }

    /**
     * Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */

    public boolean esValidoElIndice(int indice)
    {
        //boolean valorADevolver = false;
        //if(indice >= 0 && indice < tareas.size())
        //{
        //    valorADevolver = true;
        //}
        //return valorADevolver;
        return ( indice >= 0 && indice <tareas.size());
    }

    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer, false
     * en otro caso
     */    
    public boolean hayTareasPendientes()
    {
        //boolean hayTareas = false;
        //if(getNumeroTarea() > 0)
        //{
            //hayTareas = true;
        //}
        //return hayTareas;
        return ( getNumeroTarea() > 0);
    }

}
