package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length ; i++) { //変更前 (; i<words.length-1;)
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//i文字目が大文字なら
				sb.append(camelcase.substring(j, i));//i文字目の前までをsbに追加
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));//cを小文字に変換
				j = i+1; //変更前 j=i;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
