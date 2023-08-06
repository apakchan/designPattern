package reinforce;

import example.Department;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("Access插入一条Department数据");
    }

    @Override
    public Department getDepartmentById(int id) {
        System.out.println("Access根据id查询一条Department数据");
        return null;
    }
}
