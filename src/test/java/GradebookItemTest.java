import static org.junit.Assert.*;
import gradebook.model.GradebookCategory;
import gradebook.model.GradebookItem;

import org.junit.Test;


public class GradebookItemTest {

	@Test
	public void GradeBookItemCaseBaseTest() {
		GradebookCategory quiz = new GradebookCategory("quiz", 50);
		GradebookItem test1 = new GradebookItem("hw1", 50.0, 100, quiz);
		
		assertEquals(0.5, test1.calcPercentage(), 0);
		assertEquals("hw1", test1.getItemName());
		assertEquals(50.0, test1.getScore(), 0);
		assertEquals(100, test1.getTotal(), 0);
		assertEquals(test1.getCategory(), test1.getCategory());
	}
	@Test
	public void GradeBookItemCaseTest1() {
		GradebookCategory quiz = new GradebookCategory("quiz", 200);
		GradebookItem test1 = new GradebookItem("hw1", -50.0, 100, quiz);
		assertEquals(0, test1.calcPercentage(), 0);
	}
	@Test
	public void GradeBookItemCaseTest2() {
		GradebookCategory quiz = new GradebookCategory("quiz", 200);
		GradebookItem test1 = new GradebookItem("hw1", 50.0, -100, quiz);
		assertEquals(0, test1.calcPercentage(), 0);
	}
	@Test
	public void GradeBookItemCaseTest3() {
		GradebookCategory quiz = new GradebookCategory("quiz", 200);
		GradebookItem test1 = new GradebookItem("hw1", -50.0, -100, quiz);
		assertEquals(0, test1.calcPercentage(), 0);
	}
	@Test
	public void GradeBookItemCaseTest4() {
		GradebookCategory quiz = new GradebookCategory("quiz", 200);
		GradebookItem test1 = new GradebookItem("hw1", 0, 0, quiz);
		assertEquals(0, test1.calcPercentage(), 0);
	}
	@Test
	public void GradeBookItemCaseTest5() {
		GradebookCategory quiz = new GradebookCategory("quiz", 200);
		GradebookItem test1 = new GradebookItem("hw1", 0, 0, quiz);
		assertEquals(0, test1.calcPercentage()*quiz.getWeight(), 0);
	}
	@Test
	public void GradeBookItemCaseTest6() {
		GradebookCategory quiz = new GradebookCategory("quiz", 50);
		GradebookItem test1 = new GradebookItem("hw1", 6, 10, quiz);
		assertEquals(30, test1.calcPercentage()*quiz.getWeight(), 0);
    }
	@Test
	public void GradeBookItemCaseTest7() {
		GradebookCategory quiz = new GradebookCategory("quiz", -Integer.MIN_VALUE);
		GradebookItem test1 = new GradebookItem("hw1", 0, 0, quiz);
		assertEquals(0, test1.calcPercentage()*quiz.getWeight(), 0);
    }
}
