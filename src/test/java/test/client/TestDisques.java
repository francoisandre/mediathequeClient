package test.client;

import java.util.List;

import org.junit.Test;

import test.mas.ws.service.Disque;
import test.mas.ws.service.Mediatheque;
import test.mas.ws.service.MediathequeService;

public class TestDisques {

	@Test
	public void testBasic() {
		MediathequeService service = new MediathequeService();
		Mediatheque mediathequePort = service.getMediathequePort();
		List < Disque > disques = mediathequePort.getDisques();
		for (Disque disque : disques) {
			System.out.println(disque.getTitre());
		}

	}

}