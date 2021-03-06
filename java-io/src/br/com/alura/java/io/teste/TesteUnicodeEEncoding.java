package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "?";
		System.out.println(s.codePointAt(0));//unicode
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		String string = new String(bytes, "windows-1252");
		System.out.println(string);
		
		bytes = s.getBytes("utf-16");
		System.out.println(bytes.length + ", utf-16");
		string = new String(bytes, "utf-16");
		System.out.println(string);
				
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US-ASCII");
		string = new String(bytes, "US-ASCII");
		System.out.println(string);
		
	}

}
