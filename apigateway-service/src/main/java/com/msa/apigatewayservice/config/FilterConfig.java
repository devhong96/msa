package com.msa.apigatewayservice.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//
//        return builder.routes()
//                .route(r -> r.path("/first-service/**")
//                        .filters(f -> f
//                                .addRequestHeader("first-request", "first-request-header-by-java")
//                                .addResponseHeader("first-response", "first-response-header-by-java"))
//                        .uri("http://localhost:8081"))
//                .route(r -> r.path("/second-service/**")
//                        .filters(f -> f
//                                .addRequestHeader("second-request", "second-request-header-by-java")
//                                .addResponseHeader("second-response", "second-response-header-by-java"))
//                        .uri("http://localhost:8082"))
//                .build();
//}
}
