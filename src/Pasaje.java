/**
 * Clase que maneja la información requerida para generar un pasaje de viaje.
 * @author ValeriaG
 */
public class Pasaje implements Comparable<Object> {
    
    public int numeroId;
    public int numeroDeSilla;
    public int horaDeSalida;
    public String nombreComprador;
    
    /**
     * Constructor vacio de la clase pasaje.
     */
    public Pasaje(){
        
    }
    
    /**
     * <h1>Constructor parametrizado de la clase pasaje.</h1>
     * @param numeroId parámetro de tipo entero que representa el numero de identificación del pasaje.
     * @param numeroDeSalida parámetro de tipo entero que representa el numero de silla correspondiente al comprador.
     * @param horaDeSalida parámetro de tipo entero que representa la hora correspondiente de salida del pasaje.
     * @param nombreComprador parámetro de tipo String que representa el nombre del consumidor. 
     */
    public Pasaje (int nummeroId, int numeroDeSilla,int horaDeSalida, String nombreComprador){
        this.numeroId = nummeroId;
        this.numeroDeSilla= numeroDeSilla;
        this.horaDeSalida = horaDeSalida;
        this.nombreComprador = nombreComprador;
    }
       
    
    /**
     * metodo que obtiene el numero de identificacion del pasaje
     * @return retorna el numero de identificación del pasaje
     */
    public int getNumeroId (){
        return numeroId;
    }
    
    
    
    /**
     * metodo que obtiene el nombre del comprador del pasaje
     * @return retorna el nombre del comprador del pasaje
     */
    public String getNombreComprador (){
        return nombreComprador;
    }
    
    /**
     * Metodo que realiza el cambio de variable respectivo 
     * @param numeroId 
     */
    public void setNumeroId (int numeroId){
        
        this.numeroId= numeroId;
       
    }
    
    /**
     * Metodo que realiza el cambio de variable respectivo 
     * @param numSilla 
     */
    public void setNumeroDeSilla (int numSilla){
        this.numeroDeSilla=numSilla;
    }
    
    /**
     * Metodo que realiza el cambio de variable respectivo 
     * @param horaSalida 
     */
    public void setHoraDeSalida (int horaSalida){
        this.horaDeSalida=horaSalida;
    }
    

    /**
     * Metodo que realiza el cambio de variable respectivo 
     * @param nombreComprador 
     */
    public void setNombreComprador (String nombreComprador){
        this.nombreComprador=nombreComprador;
                
    }

   
    /**
     * metodo que realiza la debida comparacion de los pasajes respecto a su número de identificación del pasaje
     * @param o: recibe un objeto como parametro para realizar la debida compració por numero de identificacion del pasaje
     * @return un enetero entre [-1 1] para comprar si son iguales, menores  o mayores.
     */
    @Override
    public int compareTo(Object o) {
        
        Pasaje p = (Pasaje)o;
        
        if (this.numeroId> p.getNumeroId()){
            return 1;
        }
        else if (this.numeroId< p.getNumeroId()){
        return -1;
    }
       return 0;
    }
    
    /**
     * metodo que retorna cuando son iguales un pasaje del otro según su número de identificación de pasaje
     * @param o: recibe un objeto como parametro realizar la comparacion de los objetos 
     * @return: retorna su respuesta con un true o false, si son o no iguales el numero de identificacion de pasajes.
     */
    @Override
   public boolean equals (Object o){
       
       Pasaje p = (Pasaje)o;
       
       if (this.numeroId == p.getNumeroId()){
           return true;
       }
       return false;
   }
    
    
    /**
     * 
     * @return método que retorna la cadena del objeto actual
     */
    public String toString (){
        
        return this.nombreComprador + this.numeroId + this.numeroDeSilla + this.horaDeSalida;
    }
    
}
