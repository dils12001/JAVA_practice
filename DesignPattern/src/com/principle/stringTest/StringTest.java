package com.principle.stringTest;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("1");
		// 相當於：
//		1. 在heap中(字符串常量池外)new 一個String() 對象
//		2. 在heap的字符串常量池中，new 一個"1" 對象
//		3. 賦值(2給1)，s1是常量池外，那個對象的地址
		
		s1.intern();
//		看看s1的"值"在字符串常量池中是否存在
//		如已存在，值接返回該地址
//		如不存在，先在字符串常量池中創建該對象，再返回該地址
//		但第12行沒有變數去接地址，"1"也已存在字符串常量池中，故此時無用
		
		String s2 = "1";
		// s2為常量池中對象的地址
		
		System.out.println(s1 == s2);	// 地址不一樣，故false
		
		
		String s3 = new String("1") + new String("1");
		// 相當於：
//		1. 因涉及到字符串的拼接，會先new一個 StringBuilder對象
//		2. 在heap中(字符串常量池外)new 一個String() 對象
//		3. 在heap的字符串常量池中，new 一個"1" 對象
//		4. 賦值，前面那個String對象
//		5. 在heap中(字符串常量池外)new 一個String() 對象
//		6. 在heap的字符串常量池中，new 一個"1" 對象
//		7. 賦值，後面那個String對象
//		8. StringBuilder對象進行拼接，其後會調用 toString()方法
//		9. toString()方法 會再new一個String對象，並賦值為11
//		注意，這裡在常量池中並沒有生成"11"的對象
		
		s3.intern();
//		因為常量池中沒有"11"的對象，原本應該要生成之
//		但jdk7後，Intern()方法在此情況下，不正常生成之
//		而是在常量池中生成"11"的【引用】，指向外面那個"11"對象的地址
//		反正String是final的，不能再被改變，就不另外生成，以節省堆空間
		
		String s4 = "11";
		// 因37行的動作，s4其實是指向s3的地址
		System.out.println(s3 == s4);	// true

	}

}
