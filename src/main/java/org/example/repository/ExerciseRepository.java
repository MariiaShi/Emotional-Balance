package org.example.repository;

import org.example.model.Exercise;

import java.util.List;

public class ExerciseRepository implements Repository<Exercise>{
    @Override
    public void save() {
        System.out.println("Exercise is saved");
    }

    @Override
    public List<Exercise> readAll() {
        return null;
    }
}
