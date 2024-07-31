package in.ashokit.binding;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
//@JsonPropertyOrder
//@JsonIncludeProperties(Tyo)
public class Book {

	//@JsonProperty(value = "BooK_ID")
	private Integer id;
	
	private String name;
	
	private Double price;
	
	private Author author;
}
