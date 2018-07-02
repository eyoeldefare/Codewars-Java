package javacodewar.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import javacodewar.*;

class Testing {

	@Test
	public void Thirteen() {
		assertEquals(Thirteen.thirt(8529), 79);
		assertEquals(Thirteen.thirt(85299258), 31);
		assertEquals(Thirteen.thirt(5634), 57);
		assertEquals(Thirteen.thirt(1111111111), 71);
		assertEquals(Thirteen.thirt(987654321), 30);
	}

}
 