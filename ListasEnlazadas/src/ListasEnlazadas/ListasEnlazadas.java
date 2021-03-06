/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;

/**
 *
 * @author EDUARDO
 */
public class ListasEnlazadas
{
    	Nodo Primero;
    String InsertarEnPrimero;
	public ListasEnlazadas()
	{
		Primero=null;
	}
	public boolean vacia()
	{
		if (Primero==null)
		{
			return(true);
		} else
		{
			return(false);
		}
	}
	public void InsertarEnPrimero(int Dato)
	{
            
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
	}
        public int locali(int bsq){
            
            int k=0;
            Nodo aux=Primero;
            while (aux!=null)
        {
                    k+=1;
                    if(aux.info==bsq)
                        bsq=k;
                    aux=aux.Siguiente;
        }
                
                
            return bsq;
            
        }
	public void borrarPrimero()
	{
		Primero=Primero.Siguiente;
	}
	public String Listar()
	{
		String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null)
		{
			Dato+="{" + aux.info + "}";
			aux=aux.Siguiente;
		}
		return(Dato);
	}
	public void borrarUltimo()
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.Siguiente!=null)
		{
			anterior=actual;
			actual=actual.Siguiente;
		}
		anterior.Siguiente=null;
	}
	public void borrarPosicion(int pos)
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int k =0;               
                
		if (pos>0)
		{
			while (k!=pos && actual.Siguiente != null)
			{
				anterior=actual;
				actual=actual.Siguiente;				
				k++;
			}
			anterior.Siguiente=actual.Siguiente;
		}
	}

}
