package com.github.joine.common.exception.user;

/**
 * 角色锁定异常类
 *
 * @author JenphyJohn
 */
public class RoleBlockedException extends UserException {
    private static final long serialVersionUID = 1L;

    public RoleBlockedException(String reason) {
        super("role.blocked", new Object[]{reason});
    }
}
