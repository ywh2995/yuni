package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * \\w 영문자 숫자 찾는
		 * \\w+ 영문자 숫자 여러개
		 *  
		 * \\d 숫자를 찾음
		 * \\d+ 숫자 여러개
		 * 
		 * \\d{3} 숫자 3개를 찾음
		 * \\d{3,4} 숫자 3개 or 4개
		 * 
		 * [0-9] 0-9사이 문자 1개를 찾음
		 * [A-Z] A-Z사이 문자 1개를 찾음
		 * [a-z] a-z사이 문자 1개를 찾음
		 * [가-힣] 한글 1개를 찾음 
		 * [가-힣]+ 한글 여러개를 찾음
		 */	
		
		String info = "30세/서울시 강남구/02-123-4567/010-1234-1412/kkk@naver.com";
		
		// 전화번호 형식
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(info);
		
		while(m.find()) {
			
		
			System.out.println(m.start()); // 찾은인덱스
			System.out.println(m.end()); //끝인덱스
			System.out.println(m.group()); //찾은값
		}
		System.out.println( "======================");
		String pattern2 = "\\w+@\\w+.\\w+";
		Pattern p2 = Pattern.compile(pattern2);
		Matcher m2 = p2.matcher(info);
		
		while(m2.find()) {
			System.out.println(m2.start()); // 찾은인덱스
			System.out.println(m2.end()); //끝인덱스
			System.out.println(m2.group()); //찾은값
			
		}
	}

}
