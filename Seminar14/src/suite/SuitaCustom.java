package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import suite.categorii.TesteGetPromovabilitate;
import suite.categorii.TesteNormale;
import teste.GrupaTest;
import teste.TestCaseDummy;
import teste.TestCasePromovabilitateStub;

@RunWith(Categories.class)
@SuiteClasses({GrupaTest.class, TestCaseDummy.class, TestCasePromovabilitateStub.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {

}
