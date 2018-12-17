import org.mybatis.generator.api.ShellRunner;

/**
 * <p>Tiltle: mybatis.generator </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * data: 2018-08-09
 * version: 1.0
 */
public class App {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "mybatis-generator\\src\\main\\resources\\mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
