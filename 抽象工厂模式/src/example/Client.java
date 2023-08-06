package example;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IFactory factory = new AccessFactory();
        //IFactory factory = new SqlServerFactory();

        IDepartment iDepartment = factory.createDepartment();
        IUser iUser = factory.createUser();

        iDepartment.insert(department);
        iDepartment.getDepartmentById(1);

        iUser.insert(user);
        iUser.getUserById(1);
    }
}
