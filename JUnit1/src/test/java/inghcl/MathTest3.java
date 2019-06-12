package inghcl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathTest3 {

	@Test
	void test() {
		Math math=new Math();
		byte output=30;
		byte input=(byte) math.add(20, 20);
				assertEquals(output, input);
	}

}
