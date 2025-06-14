package org.example.repository;

import org.example.model.Emotion;

import java.util.List;

public class EmotionRepository implements Repository<Emotion> {

    @Override
    public void save() {
        System.out.println("Emotion is saved");
    }

    @Override
    public List<Emotion> readAll() {
        return null;
    }
}
