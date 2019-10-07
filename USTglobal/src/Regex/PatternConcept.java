package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcept {

	public static void main(String[] args) {
		Pattern pat = Pattern.compile("\\d");// represents any number bet (0-9)
		Matcher mat = pat.matcher("1");
		System.out.println("For \\d:"+mat.matches());
		
		pat = Pattern.compile("\\d+");// represents any number
		mat = pat.matcher("100000");
		System.out.println("For \\d+:"+mat.matches());
		
		pat = Pattern.compile("\\d{5}");// represents any number but size is 5
		mat = pat.matcher("100000");
		System.out.println("For \\d+:"+mat.matches());
		
		pat = Pattern.compile("\\d{5,8}");// represents any number but range is 5 to 8
		mat = pat.matcher("10000");
		System.out.println("For \\d+:"+mat.matches());
		
		pat = Pattern.compile("\\D"); // represents anything but not numbers (single char)
		mat = pat.matcher(" ");
		System.out.println("For \\D:"+mat.matches());
		
		pat = Pattern.compile("\\D+"); // represents anything but numbers
		mat = pat.matcher("@qwerty $");
		System.out.println("For \\D+:"+mat.matches());
		
		pat = Pattern.compile("\\s"); // represents single space
		mat = pat.matcher(" ");
		System.out.println("For \\s:"+mat.matches());
		
		pat = Pattern.compile("\\s+"); // represents multiple spaces
		mat = pat.matcher("     ");
		System.out.println("For \\s+:"+mat.matches());
		
		pat = Pattern.compile("\\S"); // represents anything but not space(single char) 
		mat = pat.matcher("$");
		System.out.println("For \\S:"+mat.matches());
		
		pat = Pattern.compile("\\S+"); // represents anything but spaces 
		mat = pat.matcher("vv");
		System.out.println("For \\S+:"+mat.matches());
		
		pat = Pattern.compile("\\w"); // represents single char 
		mat = pat.matcher("v");
		System.out.println("For \\w:"+mat.matches());
		
		pat = Pattern.compile("\\w+"); // represents multiple char 
		mat = pat.matcher("qwerty");
		System.out.println("For \\w+:"+mat.matches());
		
		pat = Pattern.compile("\\W"); // represents anything but char (special char)
		mat = pat.matcher("!");
		System.out.println("For \\W:"+mat.matches());
		
		pat = Pattern.compile("\\W+"); // represents anything but chars (special chars)
		mat = pat.matcher("!!$^#(");
		System.out.println("For \\W+:"+mat.matches());
		
		
		
		
		
		
		
	}

}