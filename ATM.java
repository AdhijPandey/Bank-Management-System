package com.bhanu.adhij;
//Company Name Adhij
import java.io.IOException;

public class ATM {

	public static void main(String[] args) {
		Option op = new Option();
		try {
		op.getLogin();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
