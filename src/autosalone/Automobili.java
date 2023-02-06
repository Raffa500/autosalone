
package autosalone;

public class Automobili {
    private String marca;
    private String carburante;
    private int cavalli;
    private int cilindrata; 
    
     Automobili(String marca, String carburante, int cavalli, int cilindrata) {
      this.marca=marca;  
      this.carburante=carburante;
      this.cavalli=cavalli;  
      this.cilindrata=cilindrata;
    }

    public String getMarca() {
        return(this.marca);
    }
    public String getCarburante() {
        return(this.carburante);
    }
    public int getCavalli() {
        return(this.cavalli);
    }
    public int getCilindrata() {
        return(this.cilindrata);
    }

    public void setMarca(String marca) {
        this.marca=marca;
    }
    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    
    @Override
    public String toString() {
        return "Automobili{" + "marca=" + marca + ", carburante=" + carburante + ", cavalli=" + cavalli + ", cilindrata=" + cilindrata + '}';
    }
  
   
    
}
