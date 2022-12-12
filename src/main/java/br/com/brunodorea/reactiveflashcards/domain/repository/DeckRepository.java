package br.com.brunodorea.reactiveflashcards.domain.repository;

import br.com.brunodorea.reactiveflashcards.domain.document.DeckDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends ReactiveMongoRepository<DeckDocument, String> {
}
