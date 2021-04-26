package com.example.deneme123.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.deneme123.entity.Note;

@Repository
public class NoteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	// Crud

	public int insert(Note note) {
		return (int) sessionFactory.getCurrentSession().save(note);
	}

	public void update(Note note) {
		sessionFactory.getCurrentSession().update(note);
	}

	public void persist(Note note) {
		sessionFactory.getCurrentSession().persist(note); // persist : varsa update eder yoksa insert eder
	}

	public void delete(Note note) {
		sessionFactory.getCurrentSession().delete(note);
	}

	public ArrayList<Note> getAll() {
		Query query = sessionFactory.getCurrentSession().createQuery("From Note");
		return (ArrayList<Note>) query.getResultList();
	}
}
