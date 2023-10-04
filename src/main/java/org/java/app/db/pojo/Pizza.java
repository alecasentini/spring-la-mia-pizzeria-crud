package org.java.app.db.pojo;

import java.text.DecimalFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 128, nullable = false)
	private String nome;
	
	@Column(length = 256)
	private String descrizione;
	
	@Column(length = 256)
	private String foto;
	
	private double prezzo;
	
	public Pizza() { }
	public Pizza(String nome, String descrizione, String foto, double prezzo) {
	
		setNome(nome);
		setDescrizione(descrizione);
		setFoto(foto);
		setPrezzo(prezzo);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getPrezzo() {
	    DecimalFormat df = new DecimalFormat("#.00");
	    return df.format(prezzo);
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] Pizza:\n"
					+ "nome: " + getNome() + "\n"
					+ "descrizione: " + getDescrizione() + "\n"
					+ "foto: " + getFoto() + "\n"
					+ "prezzo: " + getPrezzo();
	}
}