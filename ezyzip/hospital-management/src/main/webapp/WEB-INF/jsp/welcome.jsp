package com.hospital.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.hospital.model.Todo;

public interface ITodoService {

	List<Todo> getTodosByUser(String user);

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String name, String desc, Date targetDate,int quantity,String medicineName, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}