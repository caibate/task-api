package com.taks.api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taks.api.entity.Task;;

public interface TaskRepository extends JpaRepository<Task, Serializable> {

}
