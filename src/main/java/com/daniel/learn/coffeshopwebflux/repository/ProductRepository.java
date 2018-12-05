package com.daniel.learn.coffeshopwebflux.repository;

import com.daniel.learn.coffeshopwebflux.model.Product;
import org.reactivestreams.Publisher;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ElasticsearchRepository<Product,String> {
    Flux<Product> findByName(String name);
    Flux<Product> findByNameOrderByPrice(Publisher<String> name);
}
