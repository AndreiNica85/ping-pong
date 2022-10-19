package com.pingpong.solera.todoapp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pingpong.solera.todoapp.model.Note;
import com.pingpong.solera.todoapp.service.NoteService;

@RestController
public class NoteController {
	@Autowired
	private NoteService ns;
	
	@GetMapping("/notes")
	public List<Note> retriveNotes(){
		return ns.getAllNotes();		
	}
}
