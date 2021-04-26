package com.example.deneme123.serviceBL;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deneme123.entity.Note;
import com.example.deneme123.repository.INoteRepository;

@Service
@Transactional
public class NoteService {

	@Autowired
	private INoteRepository noteRepository;

	public Note createNote(Note note) {
		return noteRepository.save(note);
	}

	public List<Note> createNotes(List<Note> notes) {
		return noteRepository.saveAll(notes);
	}

	public List<Note> getNote() {
		return noteRepository.findAll();
	}
	
	public Note getNoteById(int user_id) {
		return noteRepository.findById(user_id).orElse(null);
	}

	public Note getNoteByTitle(String title) {
		return noteRepository.findByTitle(title);
	}
	
}
