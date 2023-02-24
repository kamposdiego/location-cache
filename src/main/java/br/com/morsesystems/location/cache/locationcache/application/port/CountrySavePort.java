package br.com.morsesystems.location.cache.locationcache.application.port;

import br.com.morsesystems.location.cache.locationcache.domain.Country;

public interface CountrySavePort {

    Country save(Country country);

}
