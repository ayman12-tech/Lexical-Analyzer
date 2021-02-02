package project;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.*;

public class scanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Task-03:
		String content= new String(Files.readAllBytes(Paths.get("tiny.txt")));
		System.out.println(content);
		String pattern1="\\s";
		Pattern re1=Pattern.compile(pattern1);
		
		String pattern2="display|enter|floop|wloop|fact|check|checkfact|going"; 
		String pattern3="\\|;";
		String pattern4="empty|integer|decimal|charc";
		String pattern5="@.*@";
		String pattern6="(\\$[A-Za-z0-9]+)";
		String pattern7="[0-9]+\\.?|[0-9]*\\.[0-9]+";
		String pattern8="\\+plus\\+|\\-minus\\-|\\*mul\\*|\\/div\\/";
		String pattern9="[\\**|\\?]";
		String pattern10="[)|(]";
		String pattern11="\"[\\w]*\"";
		String pattern12="\\++|\\--";
		String pattern13="([<>]|[<>]=)";
		String pattern14="[{|}]";
		String pattern15="#[a-z]+\\.s";
		String pattern16="=";
			
		
		Pattern re2=Pattern.compile(pattern2);
		Pattern re3=Pattern.compile(pattern3);
		Pattern re4=Pattern.compile(pattern4);
		Pattern re5=Pattern.compile(pattern5);
		Pattern re6=Pattern.compile(pattern6);
		Pattern re7=Pattern.compile(pattern7);
		Pattern re8=Pattern.compile(pattern8);
		Pattern re9=Pattern.compile(pattern9);
		Pattern re10=Pattern.compile(pattern10);
		Pattern re11=Pattern.compile(pattern11);
		Pattern re12=Pattern.compile(pattern12);
		Pattern re13=Pattern.compile(pattern13);
		Pattern re14=Pattern.compile(pattern14);
		Pattern re15=Pattern.compile(pattern15);
		Pattern re16=Pattern.compile(pattern16);
		
		
		String[] result=re1.split(content);
		for(String temp:result) {
			Matcher m1=re2.matcher(temp);
			if(m1.matches()) {
				System.out.println(temp+ "------>Keyword");
			}
			Matcher m2=re3.matcher(temp);
			if(m2.matches()) {
				System.out.println(temp+ "------>Terminator");
			}
			Matcher m3=re4.matcher(temp);
			if(m3.matches()) {
				System.out.println(temp+ "------>Data Type");
			}
			Matcher m4=re5.matcher(temp);
			if(m4.matches()) {
				System.out.println(temp+ "------>Comment");
			}
			Matcher m5=re6.matcher(temp);
			if(m5.matches()) {
				System.out.println(temp+ "------>Identifier");
			}
			Matcher m6=re7.matcher(temp);
			if(m6.matches()) {
				System.out.println(temp+ "------>Number");
			}
			Matcher m7=re8.matcher(temp);
			if(m7.matches()) {
				System.out.println(temp+ "------>Operator");
			}
			Matcher m8=re9.matcher(temp);
			if(m8.matches()) {
				System.out.println(temp+ "------>Logical Operator");
			}
			Matcher m9=re10.matcher(temp);
			if(m9.matches()) {
				System.out.println(temp+ "------>Parenthesis");
			}
			Matcher m10=re11.matcher(temp);
			if(m10.matches()) {
				System.out.println(temp+ "------>String");
			}
			Matcher m11=re12.matcher(temp);
			if(m11.matches()) {
				System.out.println(temp+ "------>Unary Operator");
			}
			Matcher m12=re13.matcher(temp);
			if(m12.matches()) {
				System.out.println(temp+ "------>Relational Operator ");
			}
			Matcher m13=re14.matcher(temp);
			if(m13.matches()) {
				System.out.println(temp+ "------>Curly Brackets");
			}
			Matcher m14=re15.matcher(temp);
			if(m14.matches()) {
				System.out.println(temp+ "------>Header");
			}
			Matcher m15=re16.matcher(temp);
			if(m15.matches()) {
				System.out.println(temp+ "------>Assignment Operator");
			}
						
		}
		
		

	}

}
