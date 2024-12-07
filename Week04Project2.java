package week04;

public class Week04Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//
		// 1.
		//takes an array of numbers and subtracts last element from first
		//by using .length -1 to find the last element and 0 as the first
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		// this is a repeat of the first array but i have added one element to the array
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 31};
		int result2 = ages2[ages2.length - 1] - ages[0];
		System.out.println(result2);
		
		//here i have created a loop that determines the average age.
		// in the for loop i look for the age inside ages and give that value to sum
		//
		int sum = 0;
		for(int age : ages) {
			sum += age;
		}
		//here the averageAge is calculated but the sum i created above and / it 
		//by the ages total length using .length
		double averageAge = sum / (double) ages.length;
		System.out.println(averageAge);
		
		
		// 
		// 2.
		//here inside of this String I am looking for amount of letters that are inside 
		// of each name using String name inside of names.
		//giving totalLetters the value of each names length
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLetters = 0;
		for(String name : names) {
			totalLetters += name.length();
		}
		//this double finds the average amount of letters of all the names together 
		// in doing so i / totalLetters as created before and / it but names.length using a double 
		//as it will not be a whole number 
		double averageLetters = totalLetters / (double) names.length;
		System.out.println(averageLetters);
		
		//here i created listOfNames inside of a StringBuilder as to not create a method
		//inside is looks for each name in the array names
		//then i .append each name together appended with a space
		StringBuilder listOfNames = new StringBuilder();
		for(String name : names) {
			listOfNames.append(name).append(" ");
		}
		System.out.println(listOfNames.toString());
		
		//
		// 3.
		//this is accessing the last element if the about ages array using .length -1 
		//to find the last element 
		int lastElement = ages[ages.length - 1];
		
		//
		// 4.
		//this is the first as 0 is always the first element
		int firstElement = ages[0];
		
		
		//
		// 5.
		//in the enhanced for loop i take the previous names array and find the total 
		//amount of letters in that array
		int[] namesLength = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			namesLength[i] = names[i].length();
			}
		
		//
		// 6.
		//here is made another for loop that counts through namesLength
		// to calculate to total
		int sumOfLengths = 0;
		for (int length : namesLength) {
			 sumOfLengths += length; 
			}
		System.out.println(sumOfLengths);
		
		
		
		
	}
	//
	// 7.
	public static String repeatWord(String word, int n) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < n; i++) {
			result.append(word);
		}
		return result.toString();
	}
	//
	// 8.
	//this is a simple method and it returns two strings with a space between them
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	//
	// 9.
	//here we find every number listed in an array using "num" inside "array" within the for loop
	//and adds them all together and only comes true is sum is greater than 100
	public static boolean greaterThan100(int[] array) {
		int sum = 0;
		for(int num : array) {
			sum += num;
		}
		return sum < 100;
	}
	//
	// 10.
	//here we declare a Double named sum and find all numbers in an array inside
	//the for loop, sum is now equal to each number 
	//and then we return sum / the array.leght to get an average total
	public static double averageOfArray(Double[] array) {
		Double sum = 0;
		for(Double num : array) {
			sum += num;
		} return sum / array.length;
	}
	//
	// 11.
	//this method uses the above method of finding and average but uses it in a way
	// to find out of one is greater or less then another
	public static boolean isAverageGreater(Double[] array1, Double[] array2) {
		Double avg1 = averageOfArray(array1);
		Double avg2 = averageOfArray(array2);
		return avg1 > avg2;
	}
	//
	// 12.
	// this is a true or false method that only returns true if all is correct and then 
	//it will run.
	public static Boolean willBuyDrink(boolean isHotOutside, Double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
}
