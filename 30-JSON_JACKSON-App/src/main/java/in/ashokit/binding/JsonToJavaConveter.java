package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConveter {
	public static void main(String[] args) throws Exception {

		File JsonFile = new File("book.json");
		ObjectMapper mapper = new ObjectMapper();
		Book book = mapper.readValue(JsonFile, Book.class);
         
		System.out.println(book);
	}
}
