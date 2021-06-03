package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.GrupaTest;
import teste.TestCaseDummy;
import teste.TestCasePromovabilitateStub;

@RunWith(Suite.class)
@SuiteClasses({GrupaTest.class, TestCaseDummy.class, TestCasePromovabilitateStub.class})
public class SuitaCompleta {

}
