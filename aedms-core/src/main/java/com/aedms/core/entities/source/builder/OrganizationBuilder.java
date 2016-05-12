package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.Organization;

/**
 *
 * @author jaly
 */
public class OrganizationBuilder implements Builder<Organization>{
    
    public static OrganizationBuilder createOrganizationBuilder() {
        return new OrganizationBuilder();
    }
    
    private final Organization target = new Organization();
    
    public OrganizationBuilder(){}
    
    public OrganizationBuilder withDepCode(String depCode) {
        this.getTarget().setDepCode(depCode);
        return this;
    }
    
    public OrganizationBuilder withDepName(String depName) {
        this.getTarget().setDepName(depName);
        return this;
    }
    
    public OrganizationBuilder withParentOrg(Organization parent) {
        this.getTarget().setParentOrg(parent);
        return this;
    }

    @Override
    public Organization build() {
        return this.getTarget();
    }

    /**
     * @return the target
     */
    protected Organization getTarget() {
        return target;
    }
    
}
