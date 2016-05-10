package snakecamel;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseでabcをAbcに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "Abc";
		String actual = snake.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseでabc_defをAbcDefに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snake.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseでabc_def_ghをAbcDefGhに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = snake.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseでabc_def___ghをAbcDefGhに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = snake.snakeToCamelcase("abc_def___gh");
		assertThat(actual, is(expected));
	}
	@Test
	public void snakeToCamelcaseで_abc_def__をAbcDefに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snake.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでAbcをabcに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "abc";
		String actual = snake.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでAbcDefをabc_defに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = snake.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでAbcDefGhをabc_def_ghに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = snake.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeで空文字を空文字に () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = " ";
		String actual = snake.capitalize(" ");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeでaをAに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "A";
		String actual = snake.capitalize("a");
		assertThat(actual, is(expected));
	}
	public void capitalizeでxyzをXyzに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = snake.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで空文字を空文字に () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "abc";
		String actual = snake.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでAをaに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "a";
		String actual = snake.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでxyzをXyzに () {
		SnakeCamelUtil snake= new SnakeCamelUtil();
		String expected = "xyz";
		String actual = snake.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
	

}
