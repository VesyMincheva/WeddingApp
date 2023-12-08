package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.enums.UserRolesEnum;
import bg.softuni.WeddingApp.model.entity.Role;
import bg.softuni.WeddingApp.repository.RoleRepository;
import bg.softuni.WeddingApp.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl (RoleRepository roleRepository) {

        this.roleRepository = roleRepository;
    }

    @Override
    public Role getRoleByName (String name) {

        return this.roleRepository.findByRole(UserRolesEnum.valueOf(name));
    }
}
