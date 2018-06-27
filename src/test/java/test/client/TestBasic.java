package test.client;

import java.util.List;

import org.junit.Test;

import test.mas.ws.service.Livre;
import test.mas.ws.service.Mediatheque;
import test.mas.ws.service.MediathequeService;

public class TestBasic {

	@Test
	public void testBasic() {
		MediathequeService service = new MediathequeService();
		Mediatheque mediathequePort = service.getMediathequePort();
		List < Livre > livres = mediathequePort.getLivres();
		for (Livre livre : livres) {
			System.out.println(livre.getTitre());
		}

	}

}
