package com.felix.project.user.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName IsMobileValidator
 * @Description TODO
 * @Author fangyong
 * @Date 2019/4/13 22:14
 **/
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean needsValid;
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("comes to valid mobile number");
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(s);

        return m.matches();
    }

    @Override
    public void initialize(IsMobile constraintAnnotation) {
        this.needsValid = constraintAnnotation.needsValid();
    }
}
