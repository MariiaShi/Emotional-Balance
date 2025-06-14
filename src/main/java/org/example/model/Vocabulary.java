package org.example.model;

import java.util.List;

public record Vocabulary(String name, String language, List<Emotion> emotionTags) {
}
