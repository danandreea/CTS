package teste;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import clase.Grupa;
import clase.Student;

public class GrupaTest {
	Grupa grupa;

	@Before
	public void setUp() throws Exception {
		grupa=new Grupa(1010);
		for(int i=1;i<36;i++) {
			Student student = new Student();
			student.adaugaNota(i%10+1);
			grupa.adaugaStudent(student);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void constructorTest() {
		Grupa grupa = new Grupa(1005);
		assertEquals(1005, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void inAfaraLimitelorTest() {
		Grupa grupa = new Grupa(1300);
	}
	
	@Test(timeout = 1000)
	public void performaceTest() {
		Grupa grupa = new Grupa(1050);
		
	}
	
	@Test
	public void corectitudinePromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(i);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.6f, grupa.getPromovabilitate(),.001f);
	}
	
	@Test
	public void limitaInferioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.0f, grupa.getPromovabilitate(),.001f);
	}
	
	@Test
	public void limitaSuperioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=1;i<11;i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1f, grupa.getPromovabilitate(),.001f);
	}
	
	@Test
	public void boundaryTestPromovabilitate()
	{
		Grupa grupa=new Grupa(1010);
		assertEquals(0,grupa.getPromovabilitate(), 0.001f);
	}
	
	@Test(timeout = 100)
	public void performancePromovabilitateTest()
	{
		grupa.getPromovabilitate();
	}
	
	@Test
	public void cardinalityPromovabilitateTest()
	{
		Grupa grupa=new Grupa(1050);
		Student student=new Student();
		student.adaugaNota(5);
		grupa.adaugaStudent(student);
		
		assertEquals(1,grupa.getPromovabilitate(), 0.001f);
	}
}
