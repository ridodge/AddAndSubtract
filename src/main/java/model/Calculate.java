/**
 * Riley Dodge - tjrace
 * CIS175 - Fall 2023
 * Feb 8, 2024
 */

package model;

/**
 * 
 */
public class Calculate {
	private int value1;
	private int value2;

	public Calculate(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public Calculate() {
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
	public int doAddition() {
		return this.value1 + this.value2;
	}
	
	public int doSubtraction() {
		return this.value1 - this.value2;
	}
	
	public String doAdditionString() {
		return this.value1 + " + " + this.value2 + " = " + this.doAddition();
	}
	
	public String doSubtractionString() {
		return this.value1 + " - " + this.value2 + " = " + this.doSubtraction();
	}
}
