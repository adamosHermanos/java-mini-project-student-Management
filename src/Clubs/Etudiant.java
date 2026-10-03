package Clubs;

import java.time.LocalDate;
import java.time.Period;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode(of="email")
public class Etudiant {
	@Setter
	@Getter
	@NonNull
	private String nom;
	@Setter
	@Getter
	@NonNull
	private LocalDate dateNais;
	@Setter
	@Getter
	@NonNull
	private String email;
	private int age;
	
	public int getAge() {
		//return (LocalDate.now().getYear()-dateNais.getYear()); //method 1
		return Period.between(dateNais,LocalDate.now() ).getYears(); //method 2
	}
	
	
	//test
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant ("Alex",LocalDate.of(2005, 6, 4),"dssdvsdv@gmail.com");
		System.out.println(e1.getAge());
	}
	
}
