//gestion de tareas 
class CustomList<T> {
    private val element = mutableListOf<T>()

    fun add(element: T): Boolean {
        return if (element |in elements){
            elements.add(element)
            println("tarea agregada exitosamente")
            true
        }else {
            println("la tarea ya existe")
            false
        }
    }

    fun remove(element: T): Boolean {
        return if (element in elements){
            elements.add(element)
            println("tarea eliminada")
            true
        }else {
            println("la tarea no se encuentra en la lista")
            false
        }
    }

    fun showAll(){
        if (elements.isEnpty()){
            println("la lista esta vacia")
        }else{
            println("lista de tareas:")
            elements.forEach {println(" = $it")}
        }
    }
    fun size(): Int{
        return elements.size
    }
}

//MAIN
fun main(args: Array<String>){
    val listaTaras = CustomList<string>()

    do{
        println("\nGestor de tareas")
        println("1. agregar tarea")
        println("2. eliminar tarea")
        println("3. ver lista de tareas")
        println("4. salir")
        println("selecionar una opcion:")
        opcion = readLine()?.toIntOrNull?:0

        when (option){
            1->{
                println("ingrese la nueva tarea:")
                val nuevaTarea = readLine()?: ""
                listaTaras.add(nuevaTarea)
            }
            2->{
                if (listaTaras.size() >0){
                    println("selecionar la tarea que desea eliminar:")
                    listaTaras.showAll()
                    println("ingrese el nombre exacto de la tarea:")
                    val eliminarTarea = readLine()?: ""
                    listaTaras.remove(eliminarTarea)
                }else {
                    println("la tarea no esta en la lista")
                }
            }
            3->{
                listaTaras.showAll()
            }
            4->{
                println("saliendo del programa...")
                else -> println("opcion no valida, ingrese una opcion valida.")
            }
        }
    }while (opcion | = 4)
}
