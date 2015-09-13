import java.util.Arrays;
import java.util.List;

public class Main {
	static final List<String> FILMS = Arrays.asList(
		"The Matrix",
		"2001 A Space Odyssey",
		"Gravity",
		"Interstellar",
		"2012"
	);

	public static void main(String[] args) {
		FILMS.forEach(System.out::println);
	}
}
