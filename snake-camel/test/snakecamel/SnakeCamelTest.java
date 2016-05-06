package snakecamel;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseでabc_defをAbcDefに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		StringBuilder sb = new StringBuilder();
		String expected = "AbcDef";
		String actual = snake.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでAbcDefをabc_defに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = snake.capitalize("AbcDef");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeでabcをAbcDefに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "Abc";
		String actual = snake.capitalize("abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでabcをAbcDefに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "abc";
		String actual = snake.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}
	

}
