package org.tkit.onecx.tenant.bff.rs.log;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

import org.tkit.quarkus.log.cdi.LogParam;

import gen.org.tkit.onecx.tenant.bff.rs.internal.model.CreateTenantRequestDTO;
import gen.org.tkit.onecx.tenant.bff.rs.internal.model.TenantSearchCriteriaDTO;
import gen.org.tkit.onecx.tenant.bff.rs.internal.model.UpdateTenantRequestDTO;

@ApplicationScoped
public class TenantLog implements LogParam {

    @Override
    public List<LogParam.Item> getClasses() {

        return List.of(
                this.item(10, CreateTenantRequestDTO.class,
                        x -> "CreateTenantRequestDTO[tenantId:" +
                                ((CreateTenantRequestDTO) x).getTenantId() +
                                ", orgId:" +
                                ((CreateTenantRequestDTO) x).getOrgId()
                                + "]"),
                this.item(10, TenantSearchCriteriaDTO.class,
                        x -> "TenantSearchCriteriaDTO[orgId:" +
                                ((TenantSearchCriteriaDTO) x).getOrgId() +
                                ", pageNumber:" +
                                ((TenantSearchCriteriaDTO) x).getPageNumber() +
                                ", pageSize:" +
                                ((TenantSearchCriteriaDTO) x).getPageSize()
                                + "]"),
                this.item(10, UpdateTenantRequestDTO.class,
                        x -> "UpdateTenantRequestDTO[orgId:" +
                                ((UpdateTenantRequestDTO) x).getOrgId()
                                + "]"));
    }

}
