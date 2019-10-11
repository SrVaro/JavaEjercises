package com.varo.spring.control;

import java.net.URI;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.varo.exceptions.KittyNotFoundException;
import com.varo.spring.model.Kitty;
import com.varo.spring.service.KittyService;

@RequestMapping("/rest")
@RestController("kittyControllerREST")
public class KittyControllerREST {

	private static final Logger logger = LoggerFactory.getLogger(KittyControllerREST.class);

	@Autowired
	private KittyService kittyService;

	@GetMapping
	Collection<Kitty> getKittys() throws Exception {
		logger.info("-- en Listado");
		return kittyService.list();
	}

	@GetMapping("/{id}")
	Kitty readKitty(@PathVariable int id) {
		return this.kittyService.get(id).orElseThrow(KittyNotFoundException::new);
	}

	@PostMapping
	ResponseEntity<?> addKitty(@RequestBody Kitty kitty) {
		Kitty result = this.kittyService.add(kitty);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(result.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}

	@PutMapping
	Kitty updateKitty(@RequestBody Kitty kitty) {
		return this.kittyService.update(kitty).orElseThrow(KittyNotFoundException::new);
	}

	@DeleteMapping("/{id}")
	void deleteKitty(@PathVariable int id) {
		this.kittyService.delete(id).orElseThrow(KittyNotFoundException::new);
	}
}