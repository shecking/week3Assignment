package helloWorldPromineo;

import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class week3Assignment {
	public static void main(String[] args) {
		// uncomment sysout lines to print results to console
		
		// question 1a/1b
		int ages [] = {3, 9, 23, 64, 2, 8, 28, 93, 16};
		int x = ages[ages.length - 1] - ages[0];
		// System.out.println(x);
		
		// 1c
		int z = 0;
		for (int i = 0; i < ages.length; i++) {
			z = z + ages[i];
		}
		double w = z / ages.length;
		// System.out.println(w);
		
		// question 2a
		String names [] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double allLetters = 0;
		for (int i = 0; i < names.length; i++) {
			allLetters = allLetters + names[i].length();
		}
		double avg = allLetters / names.length;
		// System.out.println(avg);
		
		// 2b
		String megaName = "";
		for (int i = 0; i < names.length; i++) {
			megaName = megaName + names[i] + " ";
		}
		// System.out.println(megaName);
		
		
		// questions 3 + 4 are text answers
		
		
		// question 5
		Integer nameLengths [] = {};
		List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(nameLengths));
		for (int i = 0; i < names.length; i++) {
			arrayList.add(names[i].length());
		}
		nameLengths = arrayList.toArray(nameLengths);
		// System.out.println(Arrays.toString(nameLengths));
		
		// question 5 attempt 2
		int nameLengths2 [] = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths2[i] = names[i].length();
		}
		// System.out.println(Arrays.toString(nameLengths2));
		
		// question 6
		int sumLengths = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumLengths = sumLengths + nameLengths[i];
		}
		// System.out.println(sumLengths);
		
		
		// method calling/printing for questions 7-13
		
		// System.out.println(question7());
		// System.out.println(question8("Steven", "Hecking"));
		// System.out.println(question9());
		// System.out.println(question10());
		// System.out.println(question11());
		// System.out.println(willBuyDrink(true, 11.50));
		shouldIBeInClass();
	}
	
	
	// question 7
//	public static String question7() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a word");
//		String word = sc.nextLine();
//		System.out.println("Enter a integer");
//		int n = sc.nextInt();
//		
//		String bigWord = "";
//		for (int i = 0; i < n; i++) {
//			bigWord = bigWord + word;
//		}
//		return bigWord;
//	}
	
	// question 8
	public static String question8(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	// question 9
	public static boolean question9() {
		int array [] = {5, 8, 90};
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// question 10
	public static double question10() {
		double sum = 0;
		double arr [] = {1.3, 2.4, 3.5, 4.2, 5.7, 6.1, 7.6};
		for (double value : arr) {
			sum += value;
		}
		double avg = sum / arr.length;
		return avg;
	}
	
	// question 11
	public static boolean question11() {
		double [] arr1 = {1.5, 2.6, 3.7, 4.8, 5.9};
		double sum1 = 0;
		double [] arr2 = {6.1, 7.2, 8.3, 9.4, 10.5};
		double sum2 = 0;
		for (double value : arr1) {
			sum1 += value;
		}
		for (double value : arr2) {
			sum2 += value;
		}
		if ((sum1/arr1.length) > sum2/arr2.length) {
			return true;
		} else {
			return false;
		}
	}
	
	// question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// question 13
	public static void shouldIBeInClass() {
		// getting current local time using java.time.LocalTime from above
		LocalTime myObj = LocalTime.now();
		// setting format that we'll use to grab current time
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HHmm");
	    // making string from format
	    String stringTime = myObj.format(myFormatObj);
	    // converting to integer from string
	    int integerTime = Integer.parseInt(stringTime);
	    // asking for day of the week
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is today?");
	    String day = sc.nextLine();
	    
	    // checking to see if it's between 7:00pm and 8:30pm EST on Thursdays
	    // then printing appropriate message
	    if (integerTime >= 1900 && integerTime < 2030 && day == "Thursday") {
	    	System.out.println("YOU SHOULD BE IN CLASS RIGHT NOW!");
	    } else {
	    	System.out.println("Don't worry, you don't have class right now.");
	    }
	}
}
