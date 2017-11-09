package com;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Super.Sun on 2017/11/8.
 */
@Component
@ConfigurationProperties(locations = {"classpath:author.properties"})
public class AuthorConfig2 {

}
