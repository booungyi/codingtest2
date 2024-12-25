package boo.condingtest2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Condingtest2ApplicationTests {

	@Test
	void contextLoads() {
		Coding coding = new Coding();
		ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5,6,7,8,9,53,57,123,2545,6456));
		assertThat(coding.levels(list)).isEqualTo(57);
	}

}
