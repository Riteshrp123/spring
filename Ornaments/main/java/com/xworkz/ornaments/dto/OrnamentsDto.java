package com.xworkz.ornaments.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ornaments")
@NamedQuery(name="read", query="select dto from OrnamentsDto dto")
@NamedQuery(name="findNameByType", query="select dto from OrnamentsDto dto  where dto.name=:nm and dto.type=:ty")
@NamedQuery(name="updateNameById", query="update OrnamentsDto dto set dto.name=:nm where dto.id=:id")
@NamedQuery(name="deleteById", query="delete from OrnamentsDto dto where dto.id=:id")
public class OrnamentsDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String price;
	private String weight;
	private String type;
	private String quality;
	private String material;
	
	
	
	public OrnamentsDto() {
		super();
	}



	public OrnamentsDto(String name, String price, String weight, String type, String quality,
			String material) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.type = type;
		this.quality = quality;
		this.material = material;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getWeight() {
		return weight;
	}



	public void setWeight(String weight) {
		this.weight = weight;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getQuality() {
		return quality;
	}



	@Override
	public String toString() {
		return "OrnamentsDto [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + ", type="
				+ type + ", quality=" + quality + ", material=" + material + "]";
	}



	public void setQuality(String quality) {
		this.quality = quality;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}	
	
}
