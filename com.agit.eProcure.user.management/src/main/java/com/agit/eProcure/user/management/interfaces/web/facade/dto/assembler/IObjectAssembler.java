package com.agit.eProcure.user.management.interfaces.web.facade.dto.assembler;

/**
 *
 * @author merlin
 */
public interface IObjectAssembler<X,Y> {
    Y toDTO(X domainObject);
    X toDomain(Y dtoObject);
}
