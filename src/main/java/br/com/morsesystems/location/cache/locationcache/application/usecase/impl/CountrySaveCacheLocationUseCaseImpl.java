package br.com.morsesystems.location.cache.locationcache.application.usecase.impl;

import br.com.morsesystems.location.cache.locationcache.application.usecase.CountrySaveCacheLocationUseCase;
import br.com.morsesystems.location.cache.locationcache.application.port.CountrySavePort;
import br.com.morsesystems.location.cache.locationcache.domain.Country;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
@Transactional
@Slf4j
public class CountrySaveCacheLocationUseCaseImpl implements CountrySaveCacheLocationUseCase {

    private final CountrySavePort countrySavePort;

    @Override
    public CountrySaveCacheLocationUseCase.CountrySaveCacheLocationCommand saveCacheLocation(CountrySaveCacheLocationCommand command) {
        log.info("The use case CountrySaveCacheLocationUseCaseImpl was started.");

        Country country = countrySavePort.save(command.getCountry());

        log.info("The use case CountrySaveCacheLocationUseCaseImpl was finished.");

        return CountrySaveCacheLocationUseCase.CountrySaveCacheLocationCommand
                .builder()
                .country(country)
                .build();
    }

}