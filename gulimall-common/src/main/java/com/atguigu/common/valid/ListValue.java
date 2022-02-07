package com.atguigu.common.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author xiangxiao
 * @create 2022-02-07-12:50
 */
// 自定义注解
@Documented
@Constraint(validatedBy = { ListValueConstraintValidator.class}) // 校验器
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE }) // 哪都可以标注
@Retention(RUNTIME)
public @interface ListValue {
    // 使用该属性去Validation.properties中取
    String message() default "{com.atguigu.common.valid.ListValue.message}";

    Class<?>[] groups() default { };
    //负载信息
    Class<? extends Payload>[] payload() default { };

    // 数组，需要用户自己指定
    int[] vals() default {};
}
