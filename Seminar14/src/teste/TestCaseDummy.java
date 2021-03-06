package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;
import suite.categorii.TesteNormale;
import suite.categorii.TesteUrgente;

public class TestCaseDummy {

	private IStudent studentDummy;
	
	@Before
	public void setUp() throws Exception {
		studentDummy=new StudentDummy();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category(TesteUrgente.class)
	@Test
	public void testAdaugaStudent() {
		Grupa grupa=new Grupa(1079);
		grupa.adaugaStudent(studentDummy);
		
		assertEquals(1, grupa.getListaStudenti().size());
	}
	
	@Category(TesteNormale.class)
	@Test
	public void testAdaugaStudentCardinality() {
		Grupa grupa=new Grupa(1079);

		IStudent studentDummy2=new StudentDummy();
		IStudent studentDummy3=new StudentDummy();
		
		grupa.adaugaStudent(studentDummy);
		grupa.adaugaStudent(studentDummy2);
		grupa.adaugaStudent(studentDummy3);
		assertEquals(3, grupa.getListaStudenti().size());
	}


}
