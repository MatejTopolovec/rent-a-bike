package hr.tvz.rentabike.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
@Table(name = "bike_type", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id") })
public class BikeType implements Serializable{
	
	
	
	private static final long serialVersionUID = -5235678586005452594L;
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	
	
	@NotEmpty(message = "Niste unjeli vrstu bicikla")
	@Size(min = 2, max = 20, message = "Vrsta Bicikla treba imati izme�u 2 i 20 znakova")
	@Column(name = "name")
	public String name;

	
//	@OneToMany(targetEntity=Bike.class, mappedBy="biketype", cascade = CascadeType.ALL ,  fetch=FetchType.EAGER)	
//	public List<Bike> bikes= new ArrayList<Bike>();
	

	public void setId(int id) {
		this.id= id;
		
	}
	
	public int getId() {
		return this.id;
		
	}
	
	
	public void setName(String name) {
		this.name= name;
		
	}
	
	public String getName() {
		return this.name;
		
	}
	
	// public List<Bike> getSetBikes() {
	//	return this.bikes;	
	//}
	
	//public void setEmployees(List<Bike> bikes) {
		//this.bikes = bikes;
		//}
	

}
