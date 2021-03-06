package br.com.jadson.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.com.jadson.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
