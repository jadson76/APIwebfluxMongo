package br.com.jadson.webflux.services;

import br.com.jadson.webflux.document.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {
	
	Flux<Playlist> findAll();
	Mono<Playlist> findById(String id);
	Mono<Playlist> save(Playlist playlist);

}
