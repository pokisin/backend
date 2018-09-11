package com.winki.demo.service;

import java.util.List;

import com.winki.demo.model.User;

public interface UserService {
	
	/**
	 * Guarda Usuario
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);
	
	/**
	 * Recupera la lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();
	
	/**
	 * Elimina un usuario con el id recibido
	 * @param id
	 */
	void deleteUser(Long id);


}
