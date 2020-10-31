package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="accounts")
@NamedQuery(name="Account.findAll",query="SELECT a FROM Account a")
public class Account implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String email,password;
	private boolean admin;
	private User user;
	//---
	public Account() {
		super();
	}
	//---
	@Id
	@Column(name="id_account",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	@Column(nullable=false,unique=true)
	public String getEmail() {
		return email;
	}
	@Column(nullable=false)
	public String getPassword() {
		return password;
	}
	@Column(columnDefinition="BOOLEAN DEFAULT false")
	public boolean isAdmin() {
		return admin;
	}
	@OneToOne(mappedBy="account",cascade=CascadeType.ALL)
	public User getUser() {
		return user;
	}
	//---
	public void setId(long id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
