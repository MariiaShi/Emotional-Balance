package org.example.repository;

import org.example.model.Emotion;

import java.util.List;

public interface Repository <T>{
    void save();
    List<T> readAll();
}
