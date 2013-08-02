package gradebook.model;

import static org.junit.Assert.*;
import gradebook.model.BuildGradeScheme;
import gradebook.model.GradebookCategory;
import gradebook.model.GradebookItem;
import java.util.ArrayList;
import org.junit.Test;


public class BuildGradeSchemeTest {

	public void GradingSchemeCaseBaseTest() {
		BuildGradeScheme test1 = new BuildGradeScheme();
		GradebookCategory quiz = new GradebookCategory("quiz", 60);
		double removedNumber = test1.removeLowestGrade(null, quiz);
		assertEquals(0,removedNumber,0);
	}
	public void GradingSchemeCaseTest1() {
	}
	public void GradingSchemeCaseTest2() {
	}
	public void GradingSchemeCaseTest3() {
	}
	public void GradingSchemeCaseTest4() {
	}
	public void GradingSchemeCaseTest5() {
	}

}

