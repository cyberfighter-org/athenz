//
// This file generated by rdl 1.4.14. Do not modify!
//

package com.yahoo.athenz.zts;
import java.util.List;
import com.yahoo.rdl.*;

//
// PolicyData -
//
public class PolicyData {
    public String domain;
    public List<Policy> policies;

    public PolicyData setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return domain;
    }
    public PolicyData setPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }
    public List<Policy> getPolicies() {
        return policies;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != PolicyData.class) {
                return false;
            }
            PolicyData a = (PolicyData) another;
            if (domain == null ? a.domain != null : !domain.equals(a.domain)) {
                return false;
            }
            if (policies == null ? a.policies != null : !policies.equals(a.policies)) {
                return false;
            }
        }
        return true;
    }
}
