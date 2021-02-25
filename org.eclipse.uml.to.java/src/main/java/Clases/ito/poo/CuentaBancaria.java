/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clases.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuentaBancaria.
 * 
 * @author dontr
 */
/*package*/ public class CuentaBancaria {
	public CuentaBancaria(long numCuent, String nomCliente, float saldo, LocalDate fechaApertura) {
		super();
		this.numCuent = numCuent;
		this.nomCliente = nomCliente;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
	}

	/**
	 * Description of the property numCuent.
	 */
	public long numCuent = 0L;

	/**
	 * Description of the property nomCliente.
	 */
	public String nomCliente = "";

	/**
	 * Description of the property saldo.
	 */
	public float saldo = 0F;

	/**
	 * Description of the property fechaApertura.
	 */
	public LocalDate fechaApertura = null;

	/**
	 * Description of the property fechaActualizacion.
	 */
	public LocalDate fechaActualizacion = null;

	// Start of user code (user defined attributes for CuentaBancaria)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuentaBancaria() {
		// Start of user code constructor for CuentaBancaria)
		super();
		// End of user code
	}

	/**
	 * Description of the method deposito.
	 * @param Cantidad 
	 * @return 
	 */
	public boolean deposito(float Cantidad) {
		// Start of user code for method deposito
		boolean deposito = false;
		return deposito;
		// End of user code
	}

	/**
	 * Description of the method retiro.
	 * @param cantidad 
	 * @return 
	 */
	public boolean retiro(float cantidad) {
		// Start of user code for method retiro
		boolean retiro = false;
		return retiro;
		// End of user code
	}

	// Start of user code (user defined methods for CuentaBancaria)

	// End of user code
	/**
	 * Returns numCuent.
	 * @return numCuent 
	 */
	public long getNumCuent() {
		return this.numCuent;
	}

	/**
	 * Sets a value to attribute numCuent. 
	 * @param newNumCuent 
	 */
	public void setNumCuent(long newNumCuent) {
		this.numCuent = newNumCuent;
	}

	/**
	 * Returns nomCliente.
	 * @return nomCliente 
	 */
	public String getNomCliente() {
		return this.nomCliente;
	}

	/**
	 * Sets a value to attribute nomCliente. 
	 * @param newNomCliente 
	 */
	public void setNomCliente(String newNomCliente) {
		this.nomCliente = newNomCliente;
	}

	/**
	 * Returns saldo.
	 * @return saldo 
	 */
	public float getSaldo() {
		return this.saldo;
	}

	/**
	 * Sets a value to attribute saldo. 
	 * @param newSaldo 
	 */
	public void setSaldo(float newSaldo) {
		this.saldo = newSaldo;
	}

	/**
	 * Returns fechaApertura.
	 * @return fechaApertura 
	 */
	public LocalDate getFechaApertura() {
		return this.fechaApertura;
	}

	/**
	 * Sets a value to attribute fechaApertura. 
	 * @param newFechaApertura 
	 */
	public void setFechaApertura(java.time.LocalDate newFechaApertura) {
		this.fechaApertura = newFechaApertura;
	}

	/**
	 * Returns fechaActualizacion.
	 * @return fechaActualizacion 
	 */
	public LocalDate getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	/**
	 * Sets a value to attribute fechaActualizacion. 
	 * @param newFechaActualizacion 
	 */
	public void setFechaActualizacion(java.time.LocalDate newFechaActualizacion) {
		this.fechaActualizacion = newFechaActualizacion;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuent=" + numCuent + ", nomCliente=" + nomCliente + ", saldo=" + saldo
				+ ", fechaApertura=" + fechaApertura + ", fechaActualizacion=" + fechaActualizacion + "]";
	}

}
