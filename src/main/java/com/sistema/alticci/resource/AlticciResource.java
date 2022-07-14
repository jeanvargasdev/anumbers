package com.sistema.alticci.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.sistema.alticci.util.UtilityService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

@RestController()
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class AlticciResource {
	
	@Autowired
	UtilityService utilityService;
	
	@RequestMapping(value="/alticci/{n}", method=RequestMethod.GET, produces = "application/json")
	@ApiOperation(value="Return value of index in array")
	@Parameter(in = ParameterIn.PATH, example = "1", required = true, description = "Elements for array")
	public int getNumber(@PathVariable("n") int n) {
		try {
			int value = utilityService.getValueIndex(n);
			System.out.println("Value for number: " + value);
			return value;
		} catch (RestClientException e) {
			throw new RestClientException("Problem in method", e.getCause());
		}
	}
}
