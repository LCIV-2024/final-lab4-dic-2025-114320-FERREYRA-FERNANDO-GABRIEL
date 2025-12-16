package com.example.demobase.service;

import com.example.demobase.dto.WordDTO;
import com.example.demobase.model.Word;
import com.example.demobase.repository.WordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WordService {
    
    private final WordRepository wordRepository;

    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }
    
    public List<WordDTO> getAllWords() {
        return wordRepository.findAllOrdered().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
    
    private WordDTO toDTO(Word word) {
        return new WordDTO(word.getId(), word.getPalabra(), word.getUtilizada());
    }
}
