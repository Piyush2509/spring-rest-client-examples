package guru.springframework.springrestclientexamples.service;

import java.util.List;

import guru.springframework.api.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by piyush.b.kumar on Jun 9, 2018
 */
public interface ApiService {

	List<User> getUsers(Integer limit);

	Flux<User> getUsers(Mono<Integer> limit);

}
