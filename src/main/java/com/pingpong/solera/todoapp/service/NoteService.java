package com.pingpong.solera.todoapp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.pingpong.solera.todoapp.model.Note;

@Service
public class NoteService {
	
	public static List<Note> notes = new ArrayList<>();
	static int counter = 0;
	
	static {
		notes.add(new Note(++counter, "Do java !!!", "some text in here", LocalDate.now(), LocalDate.now(), LocalDate.now(), "http://localhost:8080/notes", 1));
	}

	public List<Note> getAllNotes() {
		return new ArrayList<>(notes);
	}

	public Note addNote(Note n) {
		notes.add(n);
		return n;
	}

	public Note findNote(long id) {
		Note foundNote = notes.stream().filter(note -> note.getId() == id).findFirst().orElse(null);
		return foundNote;

	}

	public Note deleteNote() {
		return null;
	}

	public Note updateNote() {
		return null;
	}

}
