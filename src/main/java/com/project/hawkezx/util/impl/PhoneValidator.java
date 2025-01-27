package com.project.hawkezx.util.impl;

import com.project.hawkezx.util.PhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<PhoneNumber,String> {
    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        if (phoneNumber == null) {
            return false;
        }
        if(phoneNumber.matches("^\\+(?:[0-9] ?){6,14}[0-9]$")) return true;
        else if(phoneNumber.matches("^\\+?[0-9]{1,4}?[-.\\s]?\\(?[0-9]{1,4}?\\)?[-.\\s]?[0-9]{1,4}[-.\\s]?[0-9]{1,4}[-.\\s]?[0-9]{1,9}$")) return true;
        else if(phoneNumber.matches("^[0-9]{7,15}$")) return true;
        else return phoneNumber.matches("^[+]?[(]?[0-9]{1,4}[)]?[-\\s.]?[0-9]{1,4}[-\\s.]?[0-9]{1,4}[-\\s.]?[0-9]{1,9}$");
    }
}
