package org.example.repository;

import org.example.model.Vocabulary;

import java.util.List;

public class VocabularyRepository implements Repository<Vocabulary>{
    @Override
    public void save() {
        System.out.println("Vocabulary is saved");
    }

    @Override
    public List<Vocabulary> readAll() {
        return null;
    }
}
