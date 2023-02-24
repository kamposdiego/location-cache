package br.com.morsesystems.location.cache.locationcache.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@Builder
public class Country {

    private Long id;
    private String countryName;
    private Integer telephoneCodArea;

}