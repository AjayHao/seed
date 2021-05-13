package mpgenerator;

import com.baomidou.mybatisplus.annotation.DbType;
import mpgenerator.util.CommonUtils;

/**
 * Oracle 数据库代码生成类
 * @author Ajay Hao
 * @since 2021-05-13
 */
public class OracleCodeGenerator {

    private static String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static String DRIVER = "oracle.jdbc.OracleDriver";
    private static String DB_USERNAME = "ajlab";
    private static String DB_PASSWORD = "ajlab";
    private static String BASE_PACKAGE = "com.ajayhao.seed";
    //private static String MODULE_NAME = "org";

    public static void main(String[] args) {
        DbType dbType = DbType.ORACLE;
        // 表前缀，生成的实体类，不含前缀
        String [] tablePrefixes = {};
        // 表名，为空，生成所有的表
        String [] tableNames = {"ORG_INFO"};
        // 字段前缀
        String [] fieldPrefixes = {};
        CommonUtils.execute(dbType, DB_URL, DB_USERNAME, DB_PASSWORD, DRIVER, tablePrefixes, tableNames, BASE_PACKAGE, fieldPrefixes);
    }

}