import static org.junit.Assert.*;
import gradebook.model.GradebookCategory;

import org.junit.Test;


public class GradebookCategoryTest {

	@Test
	public void GradebookCategoryCaseBaseTest() {
		GradebookCategory quiz = new GradebookCategory("quiz", 60);
		assertEquals("quiz", quiz.getCategoryName());
		assertEquals(60, quiz.getWeight());
	}
	@Test
	public void GradebookCategoryCaseTest1() {
		GradebookCategory quiz = new GradebookCategory("quiz", 200);
		assertEquals(quiz.getCategoryName(), quiz.getCategoryName());
		assertEquals(0, quiz.getWeight());
	}
	@Test
	public void GradebookCategoryCaseTest2() {
		GradebookCategory quiz = new GradebookCategory("test", 1);
		assertFalse(quiz.getCategoryName().equals("quiz"));
		assertFalse(30 == quiz.getWeight());
	}
	@Test
	public void GradebookCategoryCaseTest3() {
		GradebookCategory quiz = new GradebookCategory("test", -1);
		assertEquals(0, quiz.getWeight(), 0);
		assertFalse(-1 == quiz.getWeight());
    }
	@Test
	public void GradebookCategoryCaseTest4() {
		GradebookCategory quiz = new GradebookCategory("test", Integer.MAX_VALUE);
		assertEquals(0, quiz.getWeight(), 0);
	}
	@Test
	public void GradebookCategoryCaseTest5() {
		GradebookCategory quiz = new GradebookCategory("test", Integer.MIN_VALUE);
		assertEquals(0, quiz.getWeight(), 0);
	}


}
