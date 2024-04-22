package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Sum;



class SumTest {
	
	

	@BeforeAll
	static void start()
	{
		System.out.println("start line");
	}
	
	@AfterAll
	static void end()
	{
		System.out.println("end line");
	}
	
	@BeforeEach
	void first()
	{
		System.out.println("before each test");
	}
	
	@AfterEach
	void last()
	{
		System.out.println("after each test");
	}
	
	/*
	 * @Test void test() { Sum s = new Sum(); int k = s.calculate(6);
	 * assertEquals(36, k); }
	 */

	@Test
	void Test1() {
		System.out.println("test1");
	}

	@Test
	void Test2() {
		System.out.println("test2");
	}

	@Test
	void Test3() {
		System.out.println("test3");
	}
}
