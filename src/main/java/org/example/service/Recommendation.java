package org.example.service;

import java.util.List;

public interface Recommendation <T>{
    List<T> getRecommendations();
}
