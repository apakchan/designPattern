package example;

public interface IDepartment {
    void insert(Department department);
    Department getDepartmentById(int id);
}

class SqlServerDepartment implements IDepartment{
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

class AccessDepartment implements IDepartment{
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


