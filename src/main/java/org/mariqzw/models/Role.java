package org.mariqzw.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.mariqzw.enums.RoleEnum;

import java.util.Set;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    private RoleEnum roleName;
    @OneToMany
    private Set<User> users;

    public Role(RoleEnum roleName, Set<User> users) {
        this.roleName = roleName;
        this.users = users;
    }

    protected Role() {}

    @Column(name = "roleName", nullable = false)
    public RoleEnum getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleEnum roleName) {
        this.roleName = roleName;
    }

    @Column(name = "users", nullable = false)
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName=" + roleName +
                ", users=" + users +
                '}';
    }
}
