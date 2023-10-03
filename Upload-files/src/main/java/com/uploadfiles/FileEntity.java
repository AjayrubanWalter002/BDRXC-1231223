package com.uploadfiles;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "files")
public class FileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String type;
	private byte[] data;

	private void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Lob
	public void setData(byte[] data) {
		this.data = data;
	}

	public byte[] getData() {
		return data;
	}

	public FileEntity(String name, String type, byte[] data) {
		this.name = name;
		this.type = type;
		this.data = data;

	}
}
