import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonObject;

public class HelloTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGolFunction() {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("URL", "foobar");
		JsonObject args = jsonObject;
		args.add("parameters", jsonObject);
		JsonObject object = new Hello().main(args);
		assertEquals(8, object.get("columns").getAsInt());
	}

}
