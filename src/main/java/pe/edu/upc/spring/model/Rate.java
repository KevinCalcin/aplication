package pe.edu.upc.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Rate")
public class Rate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRate;


	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "discountDate")
	private Date discountDate;
	
	@Column(name = "days", length = 150, nullable = false)
	private int days;

	@Column(name = "rate", length = 150, nullable = false)
	private double rate;

	@ManyToOne
	@JoinColumn(name = "idCTermRate", nullable = false)
	private TermRate termRate;
	
	@ManyToOne
	@JoinColumn(name = "idCTermRateCapital", nullable = true)
	private TermRate termRateCapital;
	
	@ManyToOne
	@JoinColumn(name = "idRateType", nullable = false)
	private RateType RateType;
	
	@Column(name = "rateNominal", length = 150, nullable = false)
	private double  rateNominal;
	
	
	public Rate() {
		super();
	}


	public Rate(int idRate, Date discountDate, int days, double rate, TermRate termRate, TermRate termRateCapital,
			pe.edu.upc.spring.model.RateType rateType, double rateNominal) {
		super();
		this.idRate = idRate;
		this.discountDate = discountDate;
		this.days = days;
		this.rate = rate;
		this.termRate = termRate;
		this.termRateCapital = termRateCapital;
		RateType = rateType;
		this.rateNominal = rateNominal;
	}


	public int getIdRate() {
		return idRate;
	}


	public void setIdRate(int idRate) {
		this.idRate = idRate;
	}


	public Date getDiscountDate() {
		return discountDate;
	}


	public void setDiscountDate(Date discountDate) {
		this.discountDate = discountDate;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	public TermRate getTermRate() {
		return termRate;
	}


	public void setTermRate(TermRate termRate) {
		this.termRate = termRate;
	}


	public TermRate getTermRateCapital() {
		return termRateCapital;
	}


	public void setTermRateCapital(TermRate termRateCapital) {
		this.termRateCapital = termRateCapital;
	}


	public RateType getRateType() {
		return RateType;
	}


	public void setRateType(RateType rateType) {
		RateType = rateType;
	}


	public double getRateNominal() {
		return rateNominal;
	}


	public void setRateNominal(double rateNominal) {
		this.rateNominal = rateNominal;
	}

}