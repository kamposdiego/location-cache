package br.com.morsesystems.location.cache.locationcache.api;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryLocationEvent {
        private String idempotencyKey;
        private Long id;
        private String countryName;
        private Integer telephoneCodArea;

}
