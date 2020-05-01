package dmacc.beans;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import dmacc.validation.PasswordMatches;
import dmacc.validation.ValidEmail;


@PasswordMatches
public class UserDto {
	@NotNull
    @NotEmpty
    private String firstName;
     
    @NotNull
    @NotEmpty
    private String lastName;
     
    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;
    
    @ValidEmail
    @NotNull
    @NotEmpty
    private String email;
    
    private String registrationType;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}
}
