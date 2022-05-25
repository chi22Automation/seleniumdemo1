package TestNgAnnotation;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestAnnotationBeforeGroups {
    MessageUtil messageUtil = new MessageUtil("Test method");
    @BeforeGroups("testOne")
    public void beforeGroups(){
      System.out.println("beforeGroups method executed before testOne group");
    }
    @Test(groups={"testOne"},expectedExceptions = {ArithmeticException.class},expectedExceptionsMessageRegExp = "/ by zero")
    public void testMethod(){
    	int x,y;
    	y=5;x=0;
    	int z=y/x;
      Assert.assertEquals("Test method", messageUtil.printMessage());
    }
  }