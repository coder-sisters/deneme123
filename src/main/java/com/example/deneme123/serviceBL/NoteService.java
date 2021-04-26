package com.example.deneme123.serviceBL;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.deneme123.dao.NoteDAO;
import com.example.deneme123.entity.Note;

@Service
@Transactional
public class NoteService {
	
	private NoteDAO noteDAO;
	public int createNote(Note note) {
		return noteDAO.insert(note);
	}

}
