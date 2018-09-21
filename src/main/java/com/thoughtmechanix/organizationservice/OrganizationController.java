package com.thoughtmechanix.organizationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/organizations")
public class OrganizationController {

	@GetMapping("/{organizationId}")
	public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
		return new Organization(organizationId);
	}
}
