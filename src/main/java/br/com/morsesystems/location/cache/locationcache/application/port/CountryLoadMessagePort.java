package br.com.morsesystems.location.cache.locationcache.application.port;

import br.com.morsesystems.location.cache.locationcache.api.CountryLocationEvent;

import java.util.function.Consumer;

public interface CountryLoadMessagePort {

    Consumer<CountryLocationEvent> consumer();

}
