package banca.uy.core.entity;

import banca.uy.core.utils.serializer.CustomDateTimeDeserializer;
import banca.uy.core.utils.serializer.CustomDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Quiniela")
public class Quiniela extends Entidad {

	private List<Integer> sorteoVespertino = new ArrayList<>();

	private List<Integer> sorteoNocturno = new ArrayList<>();

	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	protected DateTime fechaTirada;

	public Quiniela(DateTime fechaTirada) {
		this.fechaTirada = fechaTirada;
	}

	public List<Integer> getSorteoVespertino() {
		return sorteoVespertino;
	}

	public void setSorteoVespertino(List<Integer> sorteoVespertino) {
		this.sorteoVespertino = sorteoVespertino;
	}

	public List<Integer> getSorteoNocturno() {
		return sorteoNocturno;
	}

	public void setSorteoNocturno(List<Integer> sorteoNocturno) {
		this.sorteoNocturno = sorteoNocturno;
	}

	public DateTime getFechaTirada() {
		return fechaTirada;
	}

	public void setFechaTirada(DateTime fechaTirada) {
		this.fechaTirada = fechaTirada;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quiniela other = (Quiniela) obj;
		if (other.getId().equals(this.getId()))
			return true;
		return false;
	}
}
