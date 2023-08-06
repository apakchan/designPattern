package reinforce;

import example.Department;
import example.User;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        FileInputStream fis = null;
        String db = null;
        try {
            Properties pros = new Properties();
            fis = new FileInputStream("file.properties");
            pros.load(fis);  //加载对应的流文件
            //获取数据库类型
            db = pros.getProperty("DB");
            //获取全类名
            String name = "reinforce." + db + "Factory";
            //利用反射根据类名获取类
            Class<IFactory> clazz = (Class<IFactory>) Class.forName(name);
            //根据类获取对象
            IFactory iFactory = clazz.newInstance();

            IDepartment department = iFactory.createDepartment();

            department.getDepartmentById(1);
            department.insert(new Department());

            IUser user = iFactory.createUser();
            user.getUserById(1);
            user.insert(new User());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
