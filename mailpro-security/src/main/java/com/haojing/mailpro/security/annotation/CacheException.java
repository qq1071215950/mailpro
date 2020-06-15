package com.haojing.mailpro.security.annotation;

import java.lang.annotation.*;

/**
 * @author jiange
 * @date 2020/6/15 10:55
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
