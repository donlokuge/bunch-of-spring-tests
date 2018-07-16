package com.example.mysqltest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysqltest.model.ResourceNotFoundException;
import com.example.mysqltest.model.UserRepository;
import com.example.mysqltest.model.Users;

// https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
@RestController
@RequestMapping(path = "/api")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<Users> getAllNotes() {
		return userRepository.findAll();
	}

	// Get a Single User
	@GetMapping("/users/{id}")
	public Users getNoteById(@PathVariable(value = "id") Long noteId) {
		return userRepository.findById(noteId).orElseThrow(() -> new ResourceNotFoundException("User", "id", noteId));
	}

	// Update a Note
	@PutMapping("/users/{id}")
	public Users updateNote(@PathVariable(value = "id") Long noteId, @Valid @RequestBody Users users) {

		Users note = userRepository.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

		note.setUserEmail(users.getUserEmail());

		Users updatedNote = userRepository.save(note);
		return updatedNote;
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") Long userId) {

		Users note = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", userId));

		userRepository.delete(note);
		return ResponseEntity.ok().build();
	}

}
