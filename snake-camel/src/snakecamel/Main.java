package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Main {
	public static void main(String[] args){
		SnakeCamelUtil snake= new SnakeCamelUtil();
			
		String expected11 = "Abc";
		String actual11 = snake.snakeToCamelcase("abc");

		String expected12 = "AbcDef";
		String actual12 = snake.snakeToCamelcase("abc_def");
		
		String expected13 = "AbcDefGh";
		String actual13 = snake.snakeToCamelcase("abc_def_gh");
		
		String expected14 = "AbcDefGh";
		String actual14 = snake.snakeToCamelcase("abc_def___gh");
		
		String expected15 = "AbcDef";
		String actual15 = snake.snakeToCamelcase("_abc_def__");
		
		String expected21 = "abc";
		String actual21 = snake.camelToSnakecase("Abc");
		
		String expected22 = "abc_def";
		String actual22 = snake.camelToSnakecase("AbcDef");
		
		String expected23 = "abc_def_gh";
		String actual23 = snake.camelToSnakecase("AbcDefGh");
		
		String expected31 = " ";
		String actual31 = snake.capitalize(" ");
		
		String expected32 = "A";
		String actual32 = snake.capitalize("a");
		
		String expected33 = "Xyz";
		String actual33 = snake.capitalize("xyz");
		
		String expected41 = "abc";
		String actual41 = snake.uncapitalize("Abc");
		
		String expected42 = "a";
		String actual42 = snake.uncapitalize("A");
		
		String expected43 = "xyz";
		String actual43 = snake.uncapitalize("Xyz");
		
	}
}
