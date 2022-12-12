package br.com.brunodorea.reactiveflashcards.domain.repository;


import br.com.brunodorea.reactiveflashcards.domain.document.UserDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<UserDocument, String> {
}
