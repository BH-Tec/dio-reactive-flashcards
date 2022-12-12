package br.com.brunodorea.reactiveflashcards.domain.repository;


import br.com.brunodorea.reactiveflashcards.domain.document.StudyDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends ReactiveMongoRepository<StudyDocument, String> {
}
