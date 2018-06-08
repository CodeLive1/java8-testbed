package lambdasinaction.chap1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Chapter1Test {

   @Test
   public void testEasy() {
     String title = "Testing Chapter1Test";
     Assert.assertTrue(title.contains("Chapter1Test"));
   }

   @BeforeTest
   public void beforeTest() {
     String title = "BeforeTest";
     Assert.assertTrue(title.contains("BeforeTest"));
  }

  @AfterTest
  public void afterTest() {
     String title = "AfterTest";
      Assert.assertTrue(title.contains("AfterTest"));
  }
}

