package me.dongjkim.springbootdeveloper.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("jwt") //자바 클래스에 프로피티값을 가져와서 사용하는 어노테이션
public class JwtProperties { //위 어노테이션에서 application.yml 값을 읽어온다.
    private String issuer;
    private String secretKey;
}
