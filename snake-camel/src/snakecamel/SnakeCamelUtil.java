package snakecamel;

public class SnakeCamelUtil {
	
	public static String snakeToSnakecase(String camelcase) {
		String[] words = camelcase.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length - 1; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToCamelCase(String snake_case) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < snake_case.length(); i++) {
			char c = snake_case.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(snake_case.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i;
			}
		}
		sb.append(snake_case.substring(j));
		return new String(sb);
	}
	
	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String capitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
}
