package br.com.morsesystems.location.cache.locationcache.application.repository.entity;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

/**
* 
* @author Diego Campos
* 
*/
@Data
@ToString
@RedisHash
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String countryName;
	
	private Integer telephoneCodArea;

}
