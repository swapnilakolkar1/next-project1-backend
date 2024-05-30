package com.app.webapp.controllers.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link AppEntity}
 */

@Getter
@Setter
@NoArgsConstructor(force = true)
public class AppEntityDto implements Serializable {
    Long id;
    String name;
}