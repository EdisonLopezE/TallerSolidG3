package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

public class Postre {
	protected String sabor;
	protected double precioParcial;
	protected ArrayList<Aderezo> aderezos;

	public Postre(String sabor) {
		aderezos = new ArrayList<>();
		this.sabor = sabor;
		this.precioParcial = 0;
	}

	public double calcularPrecioFinal(){     
            double precioFinal;
            precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
            return precioFinal;
	}
	
	public ArrayList<Aderezo> getAderezos(){
    	return aderezos;
        }
    
        public String showPrecioFinal() {
    	return "Precio Final: $ " + calcularPrecioFinal();
        }
    
        public void anadirAderezoPostre(Aderezo aderezo){
        aderezos.add(aderezo);
        }
    
        public void quitarAderezoPostre(Aderezo aderezo){
        aderezos.remove(aderezo);
        }

    public String getSabor() {
        return sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }
        
}


