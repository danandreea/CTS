package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;
import suite.categorii.TesteGetPromovabilitate;
import suite.categorii.TesteUrgente;

public class TestCasePromovabilitateStub {

	private IStudent studentStub=new StudentStub();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category({TesteUrgente.class, TesteGetPromovabilitate.class})
	@Test
	public void testGetPromovabillitate() {
		Grupa grupa=new Grupa(1079);
		grupa.adaugaStudent(studentStub);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
