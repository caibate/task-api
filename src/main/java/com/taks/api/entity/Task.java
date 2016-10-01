package com.taks.api.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
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
	
}
