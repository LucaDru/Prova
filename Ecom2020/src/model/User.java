package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="users")
@NamedQuery(name="User.findAll",query="SELECT u FROM User u")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String nome,cognome,citta,indirizzo,cap,telefono;
	private Account account;
	//---
	public User() {
		super();
	}
	//---
	@Id
	@Column(name="id_user",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	@Column(nullable=false)
	public String getNome() {
		return nome;
	}
	@Column(nullable=false)
	public String getCognome() {
		return cognome;
	}
	@Column(nullable=false)
	public String getCitta() {
		return citta;
	}
	@Column(nullable=false)
	public String getIndirizzo() {
		return indirizzo;
	}
	@Column(nullable=false)
	public String getCap() {
		return cap;
	}
	public String getTelefono() {
		return telefono;
	}
	@OneToOne
	@JoinColumn(name="id_account",nullable=false)
	public Account getAccount() {
		return account;
	}
	//---
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setAccount(Account account) {
		this.account=account;
	}
}
