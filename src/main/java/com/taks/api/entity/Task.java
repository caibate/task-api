package com.taks.api.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	public Task(){
	}
	
	public Task( String nome, Integer percentual) {
		super();
		this.nome = nome;
		this.percentual = percentual;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private Calendar inicio;
	private Calendar fim;
	private Integer percentual;
	
	//private List<Task> listSubTask;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getInicio() {
		return inicio;
	}
	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}
	public Calendar getFim() {
		return fim;
	}
	public void setFim(Calendar fim) {
		this.fim = fim;
	}
	public Integer getPercentual() {
		return percentual;
	}
	public void setPercentual(Integer percentual) {
		this.percentual = percentual;
	}
//	public List<Task> getListSubTask() {
//		return listSubTask;
//	}
//	public void setListSubTask(List<Task> listSubTask) {
//		this.listSubTask = listSubTask;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
    public String toString() {
        return String.format(
                "Task[id=%d, Nome='%s', percentual='%s']",
                id, nome, percentual);
    }
}
