
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class TrainTest {

    List<Integer> arrived = new ArrayList<>();
    List<Integer> departed = new ArrayList<>();

    TrainProblem train = new TrainProblem();
    SoftAssert softAssert = new SoftAssert();
@Test
public void testOne()
{

    //ACT
    arrived.add(1100);
    arrived.add(1200);
    arrived.add(1210);
    arrived.add(1215);

    departed.add(1150);
    departed.add(1300);
    departed.add(1220);
    departed.add(1225);
    //Assert
    softAssert.assertEquals(train.returnnoofPlatforms(arrived,departed), 3);
    softAssert.assertAll();
arrived.clear();
departed.clear();
}

@Test
    public void testTwo(){
    arrived.add(1200);
    arrived.add(1300);
    arrived.add(1350);
    arrived.add(1500);
    arrived.add(1600);

    departed.add(1355);
    departed.add(1315);
    departed.add(1400);
    departed.add(1700);
    departed.add(1650);
    softAssert.assertEquals(train.returnnoofPlatforms(arrived,departed), 2);
    softAssert.assertAll();
}
}
