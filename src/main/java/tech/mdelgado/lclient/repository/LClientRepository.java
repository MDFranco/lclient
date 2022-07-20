package tech.mdelgado.lclient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.mdelgado.lclient.model.Client;

public interface LClientRepository extends MongoRepository<Client, String> {
}
