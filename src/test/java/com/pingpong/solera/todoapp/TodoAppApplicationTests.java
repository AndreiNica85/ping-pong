package com.pingpong.solera.todoapp;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.pingpong.solera.todoapp.model.Note;

@SpringBootTest
class TodoAppApplicationTests {

	@Test
	void contextLoads() {
		Note note = new Note(1, "Do", "some text in here", LocalDate.now(), LocalDate.now(), LocalDate.now(), "http://localhost:8080/notes", 1);
		
		
		Assert.isNull(null, note.getDescr());
	}

}
