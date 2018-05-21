package com.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String ,Date>{

    private String datePattern = "yyyy-MM-dd HH:mm:ss";
	@Override
	public Date convert(String source) {
		// TODO �Զ����ɵķ������
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		try {
			return  sdf.parse(source);
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			throw new IllegalArgumentException("��Ч���ڸ�ʽ��"+datePattern);
		}
	}


     
}
