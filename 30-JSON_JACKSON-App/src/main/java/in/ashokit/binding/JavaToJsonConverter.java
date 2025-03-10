package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
	public static void main(String[] args) throws Exception {
		Author author = new Author();
		author.setAuthorName("Deepak");
		author.setAuthorEmail("abc@gmail.com");
		author.setAuthorphno(1234l);
		
		Book book = new Book();
		book.setId(101);
		book.setName("Spring"); 
		book.setPrice(202d);
		book.setAuthor(author);

		ObjectMapper mapper = new ObjectMapper();

		// converting java obj to json store into a file
		mapper.writeValue(new File("book.json"), book);

		System.err.println("Conversion Completed!!..");
	}
}
