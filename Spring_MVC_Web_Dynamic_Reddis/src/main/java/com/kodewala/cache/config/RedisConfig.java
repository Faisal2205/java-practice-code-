package com.kodewala.cache.config;

import java.time.Duration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration.JedisClientConfigurationBuilder;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
@EnableCaching
@ComponentScan(basePackages = "com.kodewala.cache")
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConnectionFactory()
	{
		RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
		redisConfig.setHostName("finer-lab-48718.upstash.io"); // e.g.
																	// us1-yourdb.upstash.io
		redisConfig.setPort(6379);
		redisConfig.setUsername("default");
		redisConfig.setPassword(RedisPassword.of("Ab5OAAIncDEwN2VlYjdkMTg4ZjI0ZmZlYjdjNTBkNmZkNTNjYWJhYXAxNDg3MTg"));

		JedisClientConfiguration clientConfig = ((JedisClientConfigurationBuilder) JedisClientConfiguration.builder()
				.useSsl() // Upstash requires SSL
		).readTimeout(Duration.ofSeconds(10)).connectTimeout(Duration.ofSeconds(10)).build();
		
		System.out.println("Redis waiting for connected..");

		return new JedisConnectionFactory(redisConfig, clientConfig);
	}

	@Bean
	public StringRedisTemplate redisTemplate()
	{
		return new StringRedisTemplate(jedisConnectionFactory());
	}

	@Bean
	public CacheManager cacheManager(RedisConnectionFactory factory)
	{
		RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(100)); // TTL
																														// for
		System.out.println("Redis connected..");																											// cached
																														// items
		return RedisCacheManager.builder(factory).cacheDefaults(config).build();
	}
}
