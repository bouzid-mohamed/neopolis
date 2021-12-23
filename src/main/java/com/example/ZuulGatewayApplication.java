package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import Filtres.ErrorFilter;
import Filtres.PostFilter;
import Filtres.PreFilter;
import Filtres.RouteFilter;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication.class, args);
	}
	@Bean
	public PreFilter preFilter(){
		return new PreFilter() ;
		
	}
	@Bean
	public PostFilter postFilter(){
		return new PostFilter() ;
		
	}
	@Bean
	public ErrorFilter errorFilter(){
		return new ErrorFilter() ;
		
	}
	@Bean
	public RouteFilter routeFilter(){
		return new RouteFilter() ;
		
	}
}
