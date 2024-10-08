package step1;

import org.junit.jupiter.api.Test;
import step1.domain.Avante;
import step1.domain.K5;
import step1.domain.RentCompany;
import step1.domain.Sonata;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    /**
     * 자동차 인스턴스를 생성할 때의 숫자는 자동차로 여행할 거리를 의미한다.
     *
     * @throws Exception
     */
    @Test
    void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );
    }

    @Test
    void 예외_Distance_음수() throws Exception {
        // given / when / then
        assertThatThrownBy(() -> new Sonata(-1))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}
