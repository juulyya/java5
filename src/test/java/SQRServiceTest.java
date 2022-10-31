import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void test(int finish, int start, int expectedResult) {


        SQRService calcResult = new SQRService();
        int result = calcResult.calcSQR(finish, start);

        //System.out.println(" Количество " + result);

        Assertions.assertEquals(result, expectedResult);
    }
}
