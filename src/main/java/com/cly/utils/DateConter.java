package com.cly.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        Date d=new Date();
        SimpleDateFormat ss=new SimpleDateFormat("yyyy-mm-dd");
        try {
            d=ss.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }
}
