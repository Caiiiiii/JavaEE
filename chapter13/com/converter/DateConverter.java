package com.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String ,Date>{

    private String datePattern = "yyyy-MM-dd HH:mm:ss";
	@Override
	public Date convert(String source) {
		// TODO 自动生成的方法存根
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		try {
			return  sdf.parse(source);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			throw new IllegalArgumentException("无效日期格式："+datePattern);
		}
	}


     
}
