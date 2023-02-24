package br.com.morsesystems.location.cache.locationcache.application.usecase;

import lombok.*;
import br.com.morsesystems.location.cache.locationcache.domain.Country;

public interface CountrySaveCacheLocationUseCase {

    CountrySaveCacheLocationUseCase.CountrySaveCacheLocationCommand saveCacheLocation(CountrySaveCacheLocationCommand command);

    @Builder
    @RequiredArgsConstructor
    @EqualsAndHashCode(callSuper = false)
    @Getter
    class CountrySaveCacheLocationCommand {
        private final Country country;
    }

}
