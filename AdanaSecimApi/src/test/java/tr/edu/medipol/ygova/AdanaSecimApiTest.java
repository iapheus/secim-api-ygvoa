package tr.edu.medipol.ygova;

import org.junit.*;

public class AdanaSecimApiTest {
	public Parti partiler = new Parti();

	@Before
	public void setUp() {
		partiler = new Parti();
	}

	@Test
	public void testPartiOyArttir() {
		partiler.partiOyArttir("X");
		partiler.partiOyArttir("X");
		partiler.partiOyArttir("X");

		Assert.assertEquals(3, partiler.partiler.get("X").intValue());

	}

	@Test
	public void testPartiOyAzalt_Normal() {
		partiler.partiOyArttir("Y");
		partiler.partiOyArttir("Y");
		partiler.partiOyArttir("Y");

		partiler.partiOyAzalt("Y");

		Assert.assertEquals(2, partiler.partiler.get("Y").intValue());
	}

	@Test
	public void testPartiOyAzalt_OlmayanParti() {
		partiler.partiOyAzalt("Z");

		Assert.assertEquals("Z sistemde kayıtlı değildir.", "Z sistemde kayıtlı değildir.");
	}

	@Test
	public void testPartiOyListele() {
		partiler.partiOyArttir("X");
		partiler.partiOyArttir("Y");
		partiler.partiOyArttir("Z");

		partiler.partiOyListele();
	}

}
