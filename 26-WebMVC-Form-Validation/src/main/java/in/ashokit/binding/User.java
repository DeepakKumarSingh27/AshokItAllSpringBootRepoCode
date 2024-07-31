package in.ashokit.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {

	@NotEmpty(message = "Uname is required")
	@Size(min = 3,max = 8,message = "UserName should be 3 to 8 characters")
	private String uname;

	@NotEmpty(message = "Password is required")
	private String pwd;

	@NotEmpty(message = "Email is required")
	@Email(message = "Enter valid email Id")
	private String email;

	@NotEmpty(message = "phno is required")
	@Size(min = 10,message = "phno should have atleast 10 digits")
	private String phno;

	@NotNull(message = "Age is required")
	@Min(value = 21,message = "Age Should be minimum  21 years")
	@Max(value = 60,message = "Age Should not cross 60 years")
	private Integer age;

}
