package guru.springframework.springrestclientexamples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by piyush.b.kumar on Jun 9, 2018
 */
@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;

	private final String apiUrl;

	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUrl) {
		this.restTemplate = restTemplate;
		this.apiUrl = apiUrl;
	}

	@Override
	public List<User> getUsers(Integer limit) {
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(apiUrl).queryParam("limit", limit);
		UserData userData = restTemplate.getForObject(uriBuilder.toUriString(), UserData.class);
		return userData.getData();
	}

	@Override
	public Flux<User> getUsers(Mono<Integer> limit) {
		return WebClient.create(apiUrl).get().uri(uriBuilder -> uriBuilder.queryParam("limit", limit.block()).build())
				.accept(MediaType.APPLICATION_JSON).exchange().flatMap(resp -> resp.bodyToMono(UserData.class))
				.flatMapIterable(UserData::getData);
	}

}
