package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorRightName() {
		String nume="Ionel";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testListAddNote()
	{
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
		
	}
	
	@Test
	public void testListSize()
	{
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
		
	}


	@Test
	public void testCalculeazaMedie()
	{
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(),0.01f);
		
	}
	
	@Test
	public void testCalculeazaMedieOSinguraNota()
	{
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(),0.01f);
		
	}
	
	@Test
	public void testCalculeazaMedieMaiMulteNote()
	{
		Student student=new Student();
		int nota1=8;
		int nota2=9;
		int nota3=5;
		
		float medie=(nota1+nota2+nota3)/3.0f;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertEquals(medie, student.calculeazaMedie(),0.01f);
		
	}
	
	@Test
	public void testCalculeazaMedieFaraNoteAdaugate()
	{
		Student student=new Student();
		
		assertEquals(0, student.calculeazaMedie(),0.1);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testCalculeazaGetNota()
	{
		Student student=new Student();
		int nota=4;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(-1));
	}
	
	@Test
	public void testCalculeazaNotaJU3()
	{
		Student student=new Student();
		int nota=8;
		//1
		try {
			//2
			int s=student.getNota(-1);
			//3
			fail("Testul a esuat");
		} catch (IndexOutOfBoundsException err) {
			// 4
		}
		//5
	}
	
	@Test
	public void testVerificaRestanta()
	{
		Student student=new Student();
		int nota1 =8;
		int nota2=3;
		int nota3=8;
	
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertEquals(true, student.areRestante());
	}

	
}
