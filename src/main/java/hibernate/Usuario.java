package hibernate;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name="usuarios")
public class Usuario {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user-id")
	private int userid;
	@Column(name="user-name")
	private String username;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="created_date")
	private LocalDate createDate;
	
	//CONSTRUCTOR VACIO
	public Usuario() {
		super();
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Usuario(int userid, String username, String createdBy, LocalDate createDate) {
		super();
		this.userid = userid;
		this.username = username;
		this.createdBy = createdBy;
		this.createDate = createDate;
	}	

	//GETTERS Y SETTERS
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
	    this.createDate = createDate;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Usuario [userid=" + userid + ", username=" + username + ", createdBy=" + createdBy + ", createDate="
				+ createDate + "]";
	}	

}
