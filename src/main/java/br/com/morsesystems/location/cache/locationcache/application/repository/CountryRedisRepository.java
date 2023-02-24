package br.com.morsesystems.location.cache.locationcache.application.repository;

import br.com.morsesystems.location.cache.locationcache.application.repository.entity.CountryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CountryRedisRepository extends CrudRepository<CountryEntity, Long> {

}
