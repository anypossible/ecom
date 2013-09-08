package com.includio.ecom.infrastructure.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * example domain
 * 
 * @author Shihai.Fu
 *
 */
@Entity(name = "User")
@Table(name = "user")
public class User implements Serializable{

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "username", nullable = false, unique = true)
	private String username;

	@Column(name = "show_name", length = 50, nullable = true)
	private String showName;

	@Column(name = "status", length = 50, nullable = false)
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj instanceof User) {
			User user = (User) obj;
			return user.getId() == id;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", showName=" + showName + ", status=" + status + "]";
	}


}
