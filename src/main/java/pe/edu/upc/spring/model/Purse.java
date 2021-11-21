package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Purse")
public class Purse implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPurse;



	@Column(name = "totalRecivedAmount", length = 150, nullable = true)
	private double totalRecivedAmount;

	
	@Column(name = "TCEA", length = 150, nullable = true)
	private double TCEA;

	@ManyToOne
	@JoinColumn(name = "idUsers", nullable = false)
	private Users User;
	
	public Purse() {
		super();
	}

	public Purse(int idPurse, double totalRecivedAmount, double tCEA, Users user) {
		super();
		this.idPurse = idPurse;
		this.totalRecivedAmount = totalRecivedAmount;
		TCEA = tCEA;
		User = user;
	}

	public int getIdPurse() {
		return idPurse;
	}

	public void setIdPurse(int idPurse) {
		this.idPurse = idPurse;
	}

	public double getTotalRecivedAmount() {
		return totalRecivedAmount;
	}

	public void setTotalRecivedAmount(double totalRecivedAmount) {
		this.totalRecivedAmount = totalRecivedAmount;
	}

	public double getTCEA() {
		return TCEA;
	}

	public void setTCEA(double tCEA) {
		TCEA = tCEA;
	}

	public Users getUser() {
		return User;
	}

	public void setUser(Users user) {
		User = user;
	}
	
	
}