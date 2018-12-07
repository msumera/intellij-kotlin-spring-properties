package pl.msumera.intellijkotlinspringproperties

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(
        FirstProperties::class,
        SecondProperties::class,
        ThirdProperties::class
)
class ConfigurationProperties