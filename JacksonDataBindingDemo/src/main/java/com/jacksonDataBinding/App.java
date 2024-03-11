package com.jacksonDataBinding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jacksonDataBindingDto.Address;
import com.jacksonDataBindingDto.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		Student std = new Student();
		std.setStdName("Mahesh Kumar");
		std.setStdId(1002);
		std.setStdSubject("Biology");

		Address address = new Address();
		address.setDoorNumber("5-1123");
		address.setColonyName("Bc colony");
		address.setCityName("Kothacheruvu");
		address.setStateName("andhra Pradesh");
		address.setPincode(515133);
		std.setAddress(address);
		objectMapper.writeValue(new File(
				"C:\\Users\\DELL\\eclipse-workspace\\JacksonDataBindingDemo\\src\\test\\resources\\students1.json"),
				std);

		
		// readDataFormatConstant(objectMapper);
//		readJsonFile(objectMapper);
	}

	private static void readDataFormatConstant(ObjectMapper objectMapper)
			throws JsonProcessingException, JsonMappingException {
		Student readValue = objectMapper.readValue("{\r\n" + "	\"stdName\":\"Bhanu\",\r\n" + "	\"stdId\":1001,\r\n"
				+ "	\"stdSubject\":\"Maths\"\r\n" + "}", Student.class);
		System.out.println(readValue.toString());
	}

	private static void readJsonFile(ObjectMapper objectMapper)
			throws IOException, StreamReadException, DatabindException {
		Student readValue = objectMapper.readValue(new File(
				"C:\\Users\\DELL\\eclipse-workspace\\JacksonDataBindingDemo\\src\\test\\resources\\Student.json"),
				Student.class);
		System.out.println(readValue.toString());
	}
}
