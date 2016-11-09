/**
Program to realize operation with Bits: bitwise shift
Author: Matilde Pato
e-mail address: mpato@deetc.isel.pt
Last changed: March 10, 2016
*/
public class BitwiseOperators {
	public static void main(String[] args) {
		// The signed left shift operator "<<" shifts a bit pattern to 
		// the left, and the signed right shift operator ">>" shifts a
		// bit pattern to the right. The bit pattern is given by the
		// left-hand operand, and the number of positions to shift by
		// the right-hand operand. 
		// The unsigned right shift operator ">>>" shifts a zero into 
		// the leftmost position, while the leftmost position 
		// after ">>" depends on sign extension [..]
		long num = 123L;
		System.out.println(num << 1L); // One shift left: Multiply by 2
		System.out.println(num << 2L); // Two shift left: Multiply by 4
		
		long num1 = 8L;
		System.out.println(num1 >> 1L); // One shift right: Divide by 2
	
		System.out.println("Signed vs unsigned shift: ");
		System.out.println("Signed right: " + (8L >> 1L)); // One (signed) shift right: Divide by 2
		System.out.println("Signed right: " + (-8L >> 1L)); // One (signed) shift right: Divide by 2
		System.out.println("Unsigned right: " + (8L >>> 1L)); // One (unsigned) shift right: Divide by 2
		System.out.println("UnSigned right: " + (-8L >>> 1L)); // One (unsigned) shift right: Divide by 2
		// Unsigned Right Shift Operator >>>
		// This operator shifts the first operand the specified number 
		// of bits to the right. Excess bits shifted off to the right 
		// are discarded. Zero bits are shifted in from the left.
		//
		// When shifting right ( >> ) the leftmost bits exposed by the 
		// right shift are filled in with previous contents of the 
		// leftmost bit. BUT, the >>> unsigned right shift operator 
		// always fill zero's and only zero's no matter positive and 
		// negative number. For example,
		//
		// Let's do 00000000 00000000 00000000 00001100 >>> 2 (12>>>2) 
		// and the result is 00000000 00000000 00000000 00000011 (3).
		//
		// Let's do 11111111 11111111 11111111 11110100 >>> 2 (-12>>>2) 
		// and the result is 00111111 11111111 11111111 11111101 (1073741821).
		System.out.println("Bitwise operators");
		long mask = 0x0F; // Filter the four lowest bits
		System.out.println(0xC3 & mask); // Bitwise AND (operator &)
		System.out.println(0xC3 | mask); // Bitwise OR (operator |)
		System.out.println(0xC3 ^ mask); // Exlusive OR (XOR - operator ^)		
	}
}
