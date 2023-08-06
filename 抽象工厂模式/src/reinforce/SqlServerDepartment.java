package reinforce;

import example.Department;

 public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("SQLServer插入一条Department数据");
    }

    @Override
    public Department getDepartmentById(int id) {
        System.out.println("SQLServer根据id查询一条Department数据");
        return null;
    }
}
