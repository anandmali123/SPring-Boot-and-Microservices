package com.example.demo.mapper;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@Data
@EnableConfigurationProperties
@Configuration
@ConfigurationProperties(prefix = "ashokit.messages")
public class ApplicationProperties {

    private Map<String, String> messages = new HashMap<>();
}