package kitty;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@JsonIgnoreProperties(ignoreUnknown = true)
public class KittyController {

	@GetMapping("/kitty")
	String getAvailableOperations(Model model) {
		try {

			final String uri = "https://api.thecatapi.com/v1/images/search";

			RestTemplate restTemplate = new RestTemplate();

			String response = restTemplate.getForObject(uri, String.class);

			ObjectMapper mapper = new ObjectMapper();

			JsonNode root = mapper.readTree(response.substring(1, response.length() - 1));

			model.addAttribute("img", root.get("url").asText());

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "index";
	}

}